package org.apache.http.ssl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class SSLContexts {
    public static SSLContext createDefault() throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            return sSLContext;
        } catch (KeyManagementException e) {
            throw new SSLInitializationException(e.getMessage(), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new SSLInitializationException(e2.getMessage(), e2);
        }
    }

    public static SSLContext createSystemDefault() {
        try {
            return SSLContext.getDefault();
        } catch (NoSuchAlgorithmException unused) {
            return createDefault();
        }
    }

    public static SSLContextBuilder custom() {
        return SSLContextBuilder.create();
    }
}
