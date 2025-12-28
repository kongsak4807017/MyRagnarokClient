package org.apache.commons.net.util;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class TrustManagerUtils {
    private static final X509Certificate[] EMPTY_X509CERTIFICATE_ARRAY = new X509Certificate[0];
    private static final X509TrustManager ACCEPT_ALL = new TrustManager(false);
    private static final X509TrustManager CHECK_SERVER_VALIDITY = new TrustManager(true);

    static class TrustManager implements X509TrustManager {
        private final boolean checkServerValidity;

        TrustManager(boolean z) {
            this.checkServerValidity = z;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateNotYetValidException, CertificateExpiredException {
            if (this.checkServerValidity) {
                for (X509Certificate x509Certificate : x509CertificateArr) {
                    x509Certificate.checkValidity();
                }
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return TrustManagerUtils.EMPTY_X509CERTIFICATE_ARRAY;
        }
    }

    public static X509TrustManager getAcceptAllTrustManager() {
        return ACCEPT_ALL;
    }

    public static X509TrustManager getValidateServerCertificateTrustManager() {
        return CHECK_SERVER_VALIDITY;
    }

    public static X509TrustManager getDefaultTrustManager(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        return (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
    }
}
