package org.apache.http.impl.client;

import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ClientParamsStack extends AbstractHttpParams {
    protected final HttpParams applicationParams;
    protected final HttpParams clientParams;
    protected final HttpParams overrideParams;
    protected final HttpParams requestParams;

    public ClientParamsStack(HttpParams httpParams, HttpParams httpParams2, HttpParams httpParams3, HttpParams httpParams4) {
        this.applicationParams = httpParams;
        this.clientParams = httpParams2;
        this.requestParams = httpParams3;
        this.overrideParams = httpParams4;
    }

    public ClientParamsStack(ClientParamsStack clientParamsStack) {
        this(clientParamsStack.getApplicationParams(), clientParamsStack.getClientParams(), clientParamsStack.getRequestParams(), clientParamsStack.getOverrideParams());
    }

    public ClientParamsStack(ClientParamsStack clientParamsStack, HttpParams httpParams, HttpParams httpParams2, HttpParams httpParams3, HttpParams httpParams4) {
        this(httpParams != null ? httpParams : clientParamsStack.getApplicationParams(), httpParams2 != null ? httpParams2 : clientParamsStack.getClientParams(), httpParams3 != null ? httpParams3 : clientParamsStack.getRequestParams(), httpParams4 != null ? httpParams4 : clientParamsStack.getOverrideParams());
    }

    public final HttpParams getApplicationParams() {
        return this.applicationParams;
    }

    public final HttpParams getClientParams() {
        return this.clientParams;
    }

    public final HttpParams getRequestParams() {
        return this.requestParams;
    }

    public final HttpParams getOverrideParams() {
        return this.overrideParams;
    }

    @Override // org.apache.http.params.HttpParams
    public Object getParameter(String str) {
        Args.notNull(str, "Parameter name");
        Object parameter = null;
        if (this.overrideParams != null) {
            parameter = this.overrideParams.getParameter(str);
        }
        if (parameter == null && this.requestParams != null) {
            parameter = this.requestParams.getParameter(str);
        }
        if (parameter == null && this.clientParams != null) {
            parameter = this.clientParams.getParameter(str);
        }
        if (parameter == null && this.applicationParams != null) {
            return this.applicationParams.getParameter(str);
        }
        return parameter;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setParameter(String str, Object obj) {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }

    @Override // org.apache.http.params.HttpParams
    public boolean removeParameter(String str) {
        throw new UnsupportedOperationException("Removing parameters in a stack is not supported.");
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams copy() {
        return this;
    }
}
