package org.apache.http.impl.io;

import java.net.Socket;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i, HttpParams httpParams) {
        Args.notNull(socket, "Socket");
        int sendBufferSize = i < 0 ? socket.getSendBufferSize() : i;
        init(socket.getOutputStream(), sendBufferSize < 1024 ? 1024 : sendBufferSize, httpParams);
    }
}
