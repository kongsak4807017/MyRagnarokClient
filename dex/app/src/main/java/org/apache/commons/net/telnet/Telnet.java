package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.commons.net.SocketClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class Telnet extends SocketClient {
    static final int DEFAULT_PORT = 23;
    protected static final int TERMINAL_TYPE = 24;
    protected static final int TERMINAL_TYPE_IS = 0;
    protected static final int TERMINAL_TYPE_SEND = 1;
    static final int _DO_MASK = 2;
    static final int _REQUESTED_DO_MASK = 8;
    static final int _REQUESTED_WILL_MASK = 4;
    static final int _WILL_MASK = 1;
    static final boolean debug = false;
    static final boolean debugoptions = false;
    private TelnetNotificationHandler __notifhand;
    int[] _doResponse;
    int[] _options;
    int[] _willResponse;
    private volatile boolean aytFlag;
    private Object aytMonitor;
    private TelnetOptionHandler[] optionHandlers;
    private volatile OutputStream spyStream;
    private String terminalType;
    static final byte[] _COMMAND_DO = {-1, -3};
    static final byte[] _COMMAND_DONT = {-1, -2};
    static final byte[] _COMMAND_WILL = {-1, -5};
    static final byte[] _COMMAND_WONT = {-1, -4};
    static final byte[] _COMMAND_SB = {-1, -6};
    static final byte[] _COMMAND_SE = {-1, -16};
    static final byte[] _COMMAND_IS = {24, 0};
    static final byte[] _COMMAND_AYT = {-1, -10};

    Telnet() {
        this.terminalType = null;
        this.aytMonitor = new Object();
        this.aytFlag = true;
        this.spyStream = null;
        this.__notifhand = null;
        setDefaultPort(23);
        this._doResponse = new int[256];
        this._willResponse = new int[256];
        this._options = new int[256];
        this.optionHandlers = new TelnetOptionHandler[256];
    }

    Telnet(String str) {
        this.terminalType = null;
        this.aytMonitor = new Object();
        this.aytFlag = true;
        this.spyStream = null;
        this.__notifhand = null;
        setDefaultPort(23);
        this._doResponse = new int[256];
        this._willResponse = new int[256];
        this._options = new int[256];
        this.terminalType = str;
        this.optionHandlers = new TelnetOptionHandler[256];
    }

    boolean _stateIsWill(int i) {
        return (this._options[i] & 1) != 0;
    }

    boolean _stateIsWont(int i) {
        return !_stateIsWill(i);
    }

    boolean _stateIsDo(int i) {
        return (this._options[i] & 2) != 0;
    }

    boolean _stateIsDont(int i) {
        return !_stateIsDo(i);
    }

    boolean _requestedWill(int i) {
        return (this._options[i] & 4) != 0;
    }

    boolean _requestedWont(int i) {
        return !_requestedWill(i);
    }

    boolean _requestedDo(int i) {
        return (this._options[i] & 8) != 0;
    }

    boolean _requestedDont(int i) {
        return !_requestedDo(i);
    }

    void _setWill(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] | 1;
        if (_requestedWill(i) && this.optionHandlers[i] != null) {
            this.optionHandlers[i].setWill(true);
            int[] iArrStartSubnegotiationLocal = this.optionHandlers[i].startSubnegotiationLocal();
            if (iArrStartSubnegotiationLocal != null) {
                _sendSubnegotiation(iArrStartSubnegotiationLocal);
            }
        }
    }

    void _setDo(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] | 2;
        if (_requestedDo(i) && this.optionHandlers[i] != null) {
            this.optionHandlers[i].setDo(true);
            int[] iArrStartSubnegotiationRemote = this.optionHandlers[i].startSubnegotiationRemote();
            if (iArrStartSubnegotiationRemote != null) {
                _sendSubnegotiation(iArrStartSubnegotiationRemote);
            }
        }
    }

    void _setWantWill(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] | 4;
    }

    void _setWantDo(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] | 8;
    }

    void _setWont(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] & (-2);
        if (this.optionHandlers[i] != null) {
            this.optionHandlers[i].setWill(false);
        }
    }

    void _setDont(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] & (-3);
        if (this.optionHandlers[i] != null) {
            this.optionHandlers[i].setDo(false);
        }
    }

    void _setWantWont(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] & (-5);
    }

    void _setWantDont(int i) {
        int[] iArr = this._options;
        iArr[i] = iArr[i] & (-9);
    }

    void _processCommand(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(5, i);
        }
    }

    void _processDo(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(1, i);
        }
        boolean acceptLocal = false;
        if (this.optionHandlers[i] != null) {
            acceptLocal = this.optionHandlers[i].getAcceptLocal();
        } else if (i == 24 && this.terminalType != null && this.terminalType.length() > 0) {
            acceptLocal = true;
        }
        if (this._willResponse[i] > 0) {
            this._willResponse[i] = r0[i] - 1;
            if (this._willResponse[i] > 0 && _stateIsWill(i)) {
                this._willResponse[i] = r0[i] - 1;
            }
        }
        if (this._willResponse[i] == 0 && _requestedWont(i)) {
            if (acceptLocal) {
                _setWantWill(i);
                _sendWill(i);
            } else {
                int[] iArr = this._willResponse;
                iArr[i] = iArr[i] + 1;
                _sendWont(i);
            }
        }
        _setWill(i);
    }

    void _processDont(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(2, i);
        }
        if (this._willResponse[i] > 0) {
            this._willResponse[i] = r0[i] - 1;
            if (this._willResponse[i] > 0 && _stateIsWont(i)) {
                this._willResponse[i] = r0[i] - 1;
            }
        }
        if (this._willResponse[i] == 0 && _requestedWill(i)) {
            if (_stateIsWill(i) || _requestedWill(i)) {
                _sendWont(i);
            }
            _setWantWont(i);
        }
        _setWont(i);
    }

    void _processWill(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(3, i);
        }
        boolean acceptRemote = false;
        if (this.optionHandlers[i] != null) {
            acceptRemote = this.optionHandlers[i].getAcceptRemote();
        }
        if (this._doResponse[i] > 0) {
            this._doResponse[i] = r0[i] - 1;
            if (this._doResponse[i] > 0 && _stateIsDo(i)) {
                this._doResponse[i] = r0[i] - 1;
            }
        }
        if (this._doResponse[i] == 0 && _requestedDont(i)) {
            if (acceptRemote) {
                _setWantDo(i);
                _sendDo(i);
            } else {
                int[] iArr = this._doResponse;
                iArr[i] = iArr[i] + 1;
                _sendDont(i);
            }
        }
        _setDo(i);
    }

    void _processWont(int i) {
        if (this.__notifhand != null) {
            this.__notifhand.receivedNegotiation(4, i);
        }
        if (this._doResponse[i] > 0) {
            this._doResponse[i] = r0[i] - 1;
            if (this._doResponse[i] > 0 && _stateIsDont(i)) {
                this._doResponse[i] = r0[i] - 1;
            }
        }
        if (this._doResponse[i] == 0 && _requestedDo(i)) {
            if (_stateIsDo(i) || _requestedDo(i)) {
                _sendDont(i);
            }
            _setWantDont(i);
        }
        _setDont(i);
    }

    void _processSuboption(int[] iArr, int i) {
        if (i > 0) {
            if (this.optionHandlers[iArr[0]] != null) {
                _sendSubnegotiation(this.optionHandlers[iArr[0]].answerSubnegotiation(iArr, i));
            } else if (i > 1 && iArr[0] == 24 && iArr[1] == 1) {
                _sendTerminalType();
            }
        }
    }

    final synchronized void _sendTerminalType() {
        if (this.terminalType != null) {
            this._output_.write(_COMMAND_SB);
            this._output_.write(_COMMAND_IS);
            this._output_.write(this.terminalType.getBytes());
            this._output_.write(_COMMAND_SE);
            this._output_.flush();
        }
    }

    final synchronized void _sendSubnegotiation(int[] iArr) {
        if (iArr != null) {
            this._output_.write(_COMMAND_SB);
            for (int i : iArr) {
                byte b = (byte) i;
                if (b == -1) {
                    this._output_.write(b);
                }
                this._output_.write(b);
            }
            this._output_.write(_COMMAND_SE);
            this._output_.flush();
        }
    }

    final synchronized void _sendCommand(byte b) {
        this._output_.write(255);
        this._output_.write(b);
        this._output_.flush();
    }

    final synchronized void _processAYTResponse() {
        if (this.aytFlag) {
            return;
        }
        synchronized (this.aytMonitor) {
            this.aytFlag = true;
            this.aytMonitor.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() throws SocketException {
        for (int i = 0; i < 256; i++) {
            this._doResponse[i] = 0;
            this._willResponse[i] = 0;
            this._options[i] = 0;
            if (this.optionHandlers[i] != null) {
                this.optionHandlers[i].setDo(false);
                this.optionHandlers[i].setWill(false);
            }
        }
        super._connectAction_();
        this._input_ = new BufferedInputStream(this._input_);
        this._output_ = new BufferedOutputStream(this._output_);
        for (int i2 = 0; i2 < 256; i2++) {
            if (this.optionHandlers[i2] != null) {
                if (this.optionHandlers[i2].getInitLocal()) {
                    _requestWill(this.optionHandlers[i2].getOptionCode());
                }
                if (this.optionHandlers[i2].getInitRemote()) {
                    _requestDo(this.optionHandlers[i2].getOptionCode());
                }
            }
        }
    }

    final synchronized void _sendDo(int i) {
        this._output_.write(_COMMAND_DO);
        this._output_.write(i);
        this._output_.flush();
    }

    final synchronized void _requestDo(int i) {
        if ((this._doResponse[i] == 0 && _stateIsDo(i)) || _requestedDo(i)) {
            return;
        }
        _setWantDo(i);
        int[] iArr = this._doResponse;
        iArr[i] = iArr[i] + 1;
        _sendDo(i);
    }

    final synchronized void _sendDont(int i) {
        this._output_.write(_COMMAND_DONT);
        this._output_.write(i);
        this._output_.flush();
    }

    final synchronized void _requestDont(int i) {
        if ((this._doResponse[i] == 0 && _stateIsDont(i)) || _requestedDont(i)) {
            return;
        }
        _setWantDont(i);
        int[] iArr = this._doResponse;
        iArr[i] = iArr[i] + 1;
        _sendDont(i);
    }

    final synchronized void _sendWill(int i) {
        this._output_.write(_COMMAND_WILL);
        this._output_.write(i);
        this._output_.flush();
    }

    final synchronized void _requestWill(int i) {
        if ((this._willResponse[i] == 0 && _stateIsWill(i)) || _requestedWill(i)) {
            return;
        }
        _setWantWill(i);
        int[] iArr = this._doResponse;
        iArr[i] = iArr[i] + 1;
        _sendWill(i);
    }

    final synchronized void _sendWont(int i) {
        this._output_.write(_COMMAND_WONT);
        this._output_.write(i);
        this._output_.flush();
    }

    final synchronized void _requestWont(int i) {
        if ((this._willResponse[i] == 0 && _stateIsWont(i)) || _requestedWont(i)) {
            return;
        }
        _setWantWont(i);
        int[] iArr = this._doResponse;
        iArr[i] = iArr[i] + 1;
        _sendWont(i);
    }

    final synchronized void _sendByte(int i) {
        this._output_.write(i);
        _spyWrite(i);
    }

    final boolean _sendAYT(long j) {
        boolean z;
        synchronized (this.aytMonitor) {
            synchronized (this) {
                this.aytFlag = false;
                this._output_.write(_COMMAND_AYT);
                this._output_.flush();
            }
            this.aytMonitor.wait(j);
            if (!this.aytFlag) {
                z = false;
                this.aytFlag = true;
            } else {
                z = true;
            }
        }
        return z;
    }

    void addOptionHandler(TelnetOptionHandler telnetOptionHandler) throws InvalidTelnetOptionException {
        int optionCode = telnetOptionHandler.getOptionCode();
        if (TelnetOption.isValidOption(optionCode)) {
            if (this.optionHandlers[optionCode] == null) {
                this.optionHandlers[optionCode] = telnetOptionHandler;
                if (isConnected()) {
                    if (telnetOptionHandler.getInitLocal()) {
                        _requestWill(optionCode);
                    }
                    if (telnetOptionHandler.getInitRemote()) {
                        _requestDo(optionCode);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new InvalidTelnetOptionException("Already registered option", optionCode);
        }
        throw new InvalidTelnetOptionException("Invalid Option Code", optionCode);
    }

    void deleteOptionHandler(int i) throws InvalidTelnetOptionException {
        if (TelnetOption.isValidOption(i)) {
            if (this.optionHandlers[i] == null) {
                throw new InvalidTelnetOptionException("Unregistered option", i);
            }
            TelnetOptionHandler telnetOptionHandler = this.optionHandlers[i];
            this.optionHandlers[i] = null;
            if (telnetOptionHandler.getWill()) {
                _requestWont(i);
            }
            if (telnetOptionHandler.getDo()) {
                _requestDont(i);
                return;
            }
            return;
        }
        throw new InvalidTelnetOptionException("Invalid Option Code", i);
    }

    void _registerSpyStream(OutputStream outputStream) {
        this.spyStream = outputStream;
    }

    void _stopSpyStream() {
        this.spyStream = null;
    }

    void _spyRead(int i) throws IOException {
        OutputStream outputStream = this.spyStream;
        if (outputStream != null && i != 13) {
            try {
                outputStream.write(i);
                if (i == 10) {
                    outputStream.write(13);
                }
                outputStream.flush();
            } catch (IOException unused) {
                this.spyStream = null;
            }
        }
    }

    void _spyWrite(int i) throws IOException {
        OutputStream outputStream;
        if ((!_stateIsDo(1) || !_requestedDo(1)) && (outputStream = this.spyStream) != null) {
            try {
                outputStream.write(i);
                outputStream.flush();
            } catch (IOException unused) {
                this.spyStream = null;
            }
        }
    }

    public void registerNotifHandler(TelnetNotificationHandler telnetNotificationHandler) {
        this.__notifhand = telnetNotificationHandler;
    }

    public void unregisterNotifHandler() {
        this.__notifhand = null;
    }
}
