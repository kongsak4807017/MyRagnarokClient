package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class TrustAllStrategy implements TrustStrategy {
    public static final TrustAllStrategy INSTANCE = new TrustAllStrategy();

    @Override // org.apache.http.ssl.TrustStrategy
    public boolean isTrusted(X509Certificate[] x509CertificateArr, String str) {
        return true;
    }
}
