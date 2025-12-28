package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.SocketException;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.SocketClient;
import org.apache.commons.net.io.CRLFLineReader;
import org.apache.http.message.TokenParser;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class NNTP extends SocketClient {
    public static final int DEFAULT_PORT = 119;
    private static final String __DEFAULT_ENCODING = "ISO-8859-1";
    protected ProtocolCommandSupport _commandSupport_;
    boolean _isAllowedToPost;
    protected BufferedReader _reader_;
    int _replyCode;
    String _replyString;
    protected BufferedWriter _writer_;

    public NNTP() {
        setDefaultPort(DEFAULT_PORT);
        this._replyString = null;
        this._reader_ = null;
        this._writer_ = null;
        this._isAllowedToPost = false;
        this._commandSupport_ = new ProtocolCommandSupport(this);
    }

    private void __getReply() throws NNTPConnectionClosedException, MalformedServerReplyException {
        this._replyString = this._reader_.readLine();
        if (this._replyString == null) {
            throw new NNTPConnectionClosedException("Connection closed without indication.");
        }
        if (this._replyString.length() < 3) {
            throw new MalformedServerReplyException("Truncated server reply: " + this._replyString);
        }
        try {
            this._replyCode = Integer.parseInt(this._replyString.substring(0, 3));
            fireReplyReceived(this._replyCode, this._replyString + SocketClient.NETASCII_EOL);
            if (this._replyCode == 400) {
                throw new NNTPConnectionClosedException("NNTP response 400 received.  Server closed connection.");
            }
        } catch (NumberFormatException unused) {
            throw new MalformedServerReplyException("Could not parse response code.\nServer Reply: " + this._replyString);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.net.SocketClient
    public void _connectAction_() throws SocketException, NNTPConnectionClosedException, MalformedServerReplyException {
        super._connectAction_();
        this._reader_ = new CRLFLineReader(new InputStreamReader(this._input_, "ISO-8859-1"));
        this._writer_ = new BufferedWriter(new OutputStreamWriter(this._output_, "ISO-8859-1"));
        __getReply();
        this._isAllowedToPost = this._replyCode == 200;
    }

    @Override // org.apache.commons.net.SocketClient
    public void disconnect() throws IOException {
        super.disconnect();
        this._reader_ = null;
        this._writer_ = null;
        this._replyString = null;
        this._isAllowedToPost = false;
    }

    public boolean isAllowedToPost() {
        return this._isAllowedToPost;
    }

    public int sendCommand(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            sb.append(TokenParser.SP);
            sb.append(str2);
        }
        sb.append(SocketClient.NETASCII_EOL);
        BufferedWriter bufferedWriter = this._writer_;
        String string = sb.toString();
        bufferedWriter.write(string);
        this._writer_.flush();
        fireCommandSent(str, string);
        __getReply();
        return this._replyCode;
    }

    public int sendCommand(int i, String str) {
        return sendCommand(NNTPCommand.getCommand(i), str);
    }

    public int sendCommand(String str) {
        return sendCommand(str, (String) null);
    }

    public int sendCommand(int i) {
        return sendCommand(i, (String) null);
    }

    public int getReplyCode() {
        return this._replyCode;
    }

    public int getReply() throws NNTPConnectionClosedException, MalformedServerReplyException {
        __getReply();
        return this._replyCode;
    }

    public String getReplyString() {
        return this._replyString;
    }

    public int article(String str) {
        return sendCommand(0, str);
    }

    public int article(long j) {
        return sendCommand(0, Long.toString(j));
    }

    public int article() {
        return sendCommand(0);
    }

    public int body(String str) {
        return sendCommand(1, str);
    }

    public int body(long j) {
        return sendCommand(1, Long.toString(j));
    }

    public int body() {
        return sendCommand(1);
    }

    public int head(String str) {
        return sendCommand(3, str);
    }

    public int head(long j) {
        return sendCommand(3, Long.toString(j));
    }

    public int head() {
        return sendCommand(3);
    }

    public int stat(String str) {
        return sendCommand(14, str);
    }

    public int stat(long j) {
        return sendCommand(14, Long.toString(j));
    }

    public int stat() {
        return sendCommand(14);
    }

    public int group(String str) {
        return sendCommand(2, str);
    }

    public int help() {
        return sendCommand(4);
    }

    public int ihave(String str) {
        return sendCommand(5, str);
    }

    public int last() {
        return sendCommand(6);
    }

    public int list() {
        return sendCommand(7);
    }

    public int next() {
        return sendCommand(10);
    }

    public int newgroups(String str, String str2, boolean z, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TokenParser.SP);
        sb.append(str2);
        if (z) {
            sb.append(TokenParser.SP);
            sb.append("GMT");
        }
        if (str3 != null) {
            sb.append(" <");
            sb.append(str3);
            sb.append('>');
        }
        return sendCommand(8, sb.toString());
    }

    public int newnews(String str, String str2, String str3, boolean z, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TokenParser.SP);
        sb.append(str2);
        sb.append(TokenParser.SP);
        sb.append(str3);
        if (z) {
            sb.append(TokenParser.SP);
            sb.append("GMT");
        }
        if (str4 != null) {
            sb.append(" <");
            sb.append(str4);
            sb.append('>');
        }
        return sendCommand(9, sb.toString());
    }

    public int post() {
        return sendCommand(11);
    }

    public int quit() {
        return sendCommand(12);
    }

    public int authinfoUser(String str) {
        return sendCommand(15, "USER " + str);
    }

    public int authinfoPass(String str) {
        return sendCommand(15, "PASS " + str);
    }

    public int xover(String str) {
        return sendCommand(16, str);
    }

    public int xhdr(String str, String str2) {
        return sendCommand(17, str + " " + str2);
    }

    public int listActive(String str) {
        return sendCommand(7, "ACTIVE " + str);
    }

    @Deprecated
    public int article(int i) {
        return article(i);
    }

    @Deprecated
    public int body(int i) {
        return body(i);
    }

    @Deprecated
    public int head(int i) {
        return head(i);
    }

    @Deprecated
    public int stat(int i) {
        return stat(i);
    }

    @Override // org.apache.commons.net.SocketClient
    protected ProtocolCommandSupport getCommandSupport() {
        return this._commandSupport_;
    }
}
