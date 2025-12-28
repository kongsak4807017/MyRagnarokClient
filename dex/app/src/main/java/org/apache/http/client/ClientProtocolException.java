package org.apache.http.client;

import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ClientProtocolException extends IOException {
    private static final long serialVersionUID = -5596590843227115865L;

    public ClientProtocolException() {
    }

    public ClientProtocolException(String str) {
        super(str);
    }

    public ClientProtocolException(Throwable th) {
        initCause(th);
    }

    public ClientProtocolException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
