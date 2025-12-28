package org.apache.http.ssl;

import java.security.cert.X509Certificate;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface TrustStrategy {
    boolean isTrusted(X509Certificate[] x509CertificateArr, String str);
}
