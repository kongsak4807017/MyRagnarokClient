package org.apache.commons.net.daytime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.net.SocketClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class DaytimeTCPClient extends SocketClient {
    public static final int DEFAULT_PORT = 13;
    private final char[] __buffer = new char[64];

    public DaytimeTCPClient() {
        setDefaultPort(13);
    }

    public final String getTime() throws IOException {
        StringBuilder sb = new StringBuilder(this.__buffer.length);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this._input_));
        while (true) {
            int i = bufferedReader.read(this.__buffer, 0, this.__buffer.length);
            if (i > 0) {
                sb.append(this.__buffer, 0, i);
            } else {
                return sb.toString();
            }
        }
    }
}
