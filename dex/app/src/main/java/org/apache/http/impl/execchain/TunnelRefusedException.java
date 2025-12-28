package org.apache.http.impl.execchain;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class TunnelRefusedException extends HttpException {
    private static final long serialVersionUID = -8646722842745617323L;
    private final HttpResponse response;

    public TunnelRefusedException(String str, HttpResponse httpResponse) {
        super(str);
        this.response = httpResponse;
    }

    public HttpResponse getResponse() {
        return this.response;
    }
}
