package org.apache.commons.net.echo;

import java.io.InputStream;
import org.apache.commons.net.discard.DiscardTCPClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class EchoTCPClient extends DiscardTCPClient {
    public static final int DEFAULT_PORT = 7;

    public EchoTCPClient() {
        setDefaultPort(7);
    }

    public final InputStream getInputStream() {
        return this._input_;
    }
}
