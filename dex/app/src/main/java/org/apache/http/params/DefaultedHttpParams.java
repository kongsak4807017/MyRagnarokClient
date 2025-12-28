package org.apache.http.params;

import java.util.HashSet;
import java.util.Set;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class DefaultedHttpParams extends AbstractHttpParams {
    private final HttpParams defaults;
    private final HttpParams local;

    public DefaultedHttpParams(HttpParams httpParams, HttpParams httpParams2) {
        this.local = (HttpParams) Args.notNull(httpParams, "Local HTTP parameters");
        this.defaults = httpParams2;
    }

    @Override // org.apache.http.params.HttpParams
    public final HttpParams copy() {
        return new DefaultedHttpParams(this.local.copy(), this.defaults);
    }

    @Override // org.apache.http.params.HttpParams
    public final Object getParameter(String str) {
        Object parameter = this.local.getParameter(str);
        if (parameter == null && this.defaults != null) {
            return this.defaults.getParameter(str);
        }
        return parameter;
    }

    @Override // org.apache.http.params.HttpParams
    public final boolean removeParameter(String str) {
        return this.local.removeParameter(str);
    }

    @Override // org.apache.http.params.HttpParams
    public final HttpParams setParameter(String str, Object obj) {
        return this.local.setParameter(str, obj);
    }

    public final HttpParams getDefaults() {
        return this.defaults;
    }

    @Override // org.apache.http.params.AbstractHttpParams, org.apache.http.params.HttpParamsNames
    public final Set<String> getNames() {
        HashSet hashSet = new HashSet(getNames(this.defaults));
        hashSet.addAll(getNames(this.local));
        return hashSet;
    }

    public final Set<String> getDefaultNames() {
        return new HashSet(getNames(this.defaults));
    }

    public final Set<String> getLocalNames() {
        return new HashSet(getNames(this.local));
    }

    private Set<String> getNames(HttpParams httpParams) {
        if (httpParams instanceof HttpParamsNames) {
            return ((HttpParamsNames) httpParams).getNames();
        }
        throw new UnsupportedOperationException("HttpParams instance does not implement HttpParamsNames");
    }
}
