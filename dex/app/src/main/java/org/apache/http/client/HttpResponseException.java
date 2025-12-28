package org.apache.http.client;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class HttpResponseException extends ClientProtocolException {
    private static final long serialVersionUID = -7186627969477257933L;
    private final int statusCode;

    public HttpResponseException(int i, String str) {
        super(str);
        this.statusCode = i;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
