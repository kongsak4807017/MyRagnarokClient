package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface X509HostnameVerifier extends HostnameVerifier {
    void verify(String str, X509Certificate x509Certificate);

    void verify(String str, SSLSocket sSLSocket);

    void verify(String str, String[] strArr, String[] strArr2);
}
