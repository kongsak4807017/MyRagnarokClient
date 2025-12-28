package org.apache.http.auth;

import org.apache.http.ProtocolException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class MalformedChallengeException extends ProtocolException {
    private static final long serialVersionUID = 814586927989932284L;

    public MalformedChallengeException() {
    }

    public MalformedChallengeException(String str) {
        super(str);
    }

    public MalformedChallengeException(String str, Throwable th) {
        super(str, th);
    }
}
