package org.apache.http.impl.io;

import java.net.Socket;
import java.net.SocketException;
import org.apache.http.io.EofSensor;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class SocketInputBuffer extends AbstractSessionInputBuffer implements EofSensor {
    private boolean eof;
    private final Socket socket;

    public SocketInputBuffer(Socket socket, int i, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        this.socket = socket;
        this.eof = false;
        int receiveBufferSize = i < 0 ? socket.getReceiveBufferSize() : i;
        init(socket.getInputStream(), receiveBufferSize < 1024 ? 1024 : receiveBufferSize, httpParams);
    }

    @Override // org.apache.http.impl.io.AbstractSessionInputBuffer
    protected int fillBuffer() {
        int iFillBuffer = super.fillBuffer();
        this.eof = iFillBuffer == -1;
        return iFillBuffer;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int i) throws SocketException {
        boolean zHasBufferedData = hasBufferedData();
        if (!zHasBufferedData) {
            int soTimeout = this.socket.getSoTimeout();
            try {
                this.socket.setSoTimeout(i);
                fillBuffer();
                zHasBufferedData = hasBufferedData();
            } finally {
                this.socket.setSoTimeout(soTimeout);
            }
        }
        return zHasBufferedData;
    }

    @Override // org.apache.http.io.EofSensor
    public boolean isEof() {
        return this.eof;
    }
}
