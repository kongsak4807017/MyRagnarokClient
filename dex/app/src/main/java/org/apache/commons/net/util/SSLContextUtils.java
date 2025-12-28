package org.apache.commons.net.util;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class SSLContextUtils {
    private SSLContextUtils() {
    }

    public static SSLContext createSSLContext(String str, KeyManager keyManager, TrustManager trustManager) {
        return createSSLContext(str, keyManager == null ? null : new KeyManager[]{keyManager}, trustManager == null ? null : new TrustManager[]{trustManager});
    }

    public static SSLContext createSSLContext(String str, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr) throws NoSuchAlgorithmException, IOException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance(str);
            sSLContext.init(keyManagerArr, trustManagerArr, null);
            return sSLContext;
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException("Could not initialize SSL context");
            iOException.initCause(e);
            throw iOException;
        }
    }
}
