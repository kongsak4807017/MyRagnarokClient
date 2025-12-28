package org.apache.http.auth;

import org.apache.http.Header;
import org.apache.http.HttpRequest;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface AuthScheme {
    @Deprecated
    Header authenticate(Credentials credentials, HttpRequest httpRequest);

    String getParameter(String str);

    String getRealm();

    String getSchemeName();

    boolean isComplete();

    boolean isConnectionBased();

    void processChallenge(Header header);
}
