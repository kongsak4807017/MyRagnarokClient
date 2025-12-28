package org.apache.http.params;

import org.apache.http.util.Args;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class HttpAbstractParamBean {
    protected final HttpParams params;

    public HttpAbstractParamBean(HttpParams httpParams) {
        this.params = (HttpParams) Args.notNull(httpParams, "HTTP parameters");
    }
}
