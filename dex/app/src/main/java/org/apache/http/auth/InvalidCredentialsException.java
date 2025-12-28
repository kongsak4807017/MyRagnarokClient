package org.apache.http.auth;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class InvalidCredentialsException extends AuthenticationException {
    private static final long serialVersionUID = -4834003835215460648L;

    public InvalidCredentialsException() {
    }

    public InvalidCredentialsException(String str) {
        super(str);
    }

    public InvalidCredentialsException(String str, Throwable th) {
        super(str, th);
    }
}
