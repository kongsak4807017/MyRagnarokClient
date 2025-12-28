package org.apache.http.client;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class CircularRedirectException extends RedirectException {
    private static final long serialVersionUID = 6830063487001091803L;

    public CircularRedirectException() {
    }

    public CircularRedirectException(String str) {
        super(str);
    }

    public CircularRedirectException(String str, Throwable th) {
        super(str, th);
    }
}
