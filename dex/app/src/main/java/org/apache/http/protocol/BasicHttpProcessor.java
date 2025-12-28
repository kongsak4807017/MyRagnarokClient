package org.apache.http.protocol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.util.Args;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class BasicHttpProcessor implements Cloneable, HttpProcessor, HttpRequestInterceptorList, HttpResponseInterceptorList {
    protected final List<HttpRequestInterceptor> requestInterceptors = new ArrayList();
    protected final List<HttpResponseInterceptor> responseInterceptors = new ArrayList();

    @Override // org.apache.http.protocol.HttpRequestInterceptorList
    public final void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor == null) {
            return;
        }
        this.requestInterceptors.add(httpRequestInterceptor);
    }

    @Override // org.apache.http.protocol.HttpRequestInterceptorList
    public final void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor, int i) {
        if (httpRequestInterceptor == null) {
            return;
        }
        this.requestInterceptors.add(i, httpRequestInterceptor);
    }

    @Override // org.apache.http.protocol.HttpResponseInterceptorList
    public final void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i) {
        if (httpResponseInterceptor == null) {
            return;
        }
        this.responseInterceptors.add(i, httpResponseInterceptor);
    }

    @Override // org.apache.http.protocol.HttpRequestInterceptorList
    public final void removeRequestInterceptorByClass(Class<? extends HttpRequestInterceptor> cls) {
        Iterator<HttpRequestInterceptor> it = this.requestInterceptors.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    @Override // org.apache.http.protocol.HttpResponseInterceptorList
    public final void removeResponseInterceptorByClass(Class<? extends HttpResponseInterceptor> cls) {
        Iterator<HttpResponseInterceptor> it = this.responseInterceptors.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
    }

    public final void addInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        addRequestInterceptor(httpRequestInterceptor);
    }

    public final void addInterceptor(HttpRequestInterceptor httpRequestInterceptor, int i) {
        addRequestInterceptor(httpRequestInterceptor, i);
    }

    @Override // org.apache.http.protocol.HttpRequestInterceptorList
    public final int getRequestInterceptorCount() {
        return this.requestInterceptors.size();
    }

    @Override // org.apache.http.protocol.HttpRequestInterceptorList
    public final HttpRequestInterceptor getRequestInterceptor(int i) {
        if (i < 0 || i >= this.requestInterceptors.size()) {
            return null;
        }
        return this.requestInterceptors.get(i);
    }

    @Override // org.apache.http.protocol.HttpRequestInterceptorList
    public final void clearRequestInterceptors() {
        this.requestInterceptors.clear();
    }

    @Override // org.apache.http.protocol.HttpResponseInterceptorList
    public final void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor == null) {
            return;
        }
        this.responseInterceptors.add(httpResponseInterceptor);
    }

    public final void addInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        addResponseInterceptor(httpResponseInterceptor);
    }

    public final void addInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i) {
        addResponseInterceptor(httpResponseInterceptor, i);
    }

    @Override // org.apache.http.protocol.HttpResponseInterceptorList
    public final int getResponseInterceptorCount() {
        return this.responseInterceptors.size();
    }

    @Override // org.apache.http.protocol.HttpResponseInterceptorList
    public final HttpResponseInterceptor getResponseInterceptor(int i) {
        if (i < 0 || i >= this.responseInterceptors.size()) {
            return null;
        }
        return this.responseInterceptors.get(i);
    }

    @Override // org.apache.http.protocol.HttpResponseInterceptorList
    public final void clearResponseInterceptors() {
        this.responseInterceptors.clear();
    }

    @Override // org.apache.http.protocol.HttpRequestInterceptorList, org.apache.http.protocol.HttpResponseInterceptorList
    public final void setInterceptors(List<?> list) {
        Args.notNull(list, "Inteceptor list");
        this.requestInterceptors.clear();
        this.responseInterceptors.clear();
        for (Object obj : list) {
            if (obj instanceof HttpRequestInterceptor) {
                addInterceptor((HttpRequestInterceptor) obj);
            }
            if (obj instanceof HttpResponseInterceptor) {
                addInterceptor((HttpResponseInterceptor) obj);
            }
        }
    }

    public final void clearInterceptors() {
        clearRequestInterceptors();
        clearResponseInterceptors();
    }

    @Override // org.apache.http.HttpRequestInterceptor
    public final void process(HttpRequest httpRequest, HttpContext httpContext) {
        Iterator<HttpRequestInterceptor> it = this.requestInterceptors.iterator();
        while (it.hasNext()) {
            it.next().process(httpRequest, httpContext);
        }
    }

    @Override // org.apache.http.HttpResponseInterceptor
    public final void process(HttpResponse httpResponse, HttpContext httpContext) {
        Iterator<HttpResponseInterceptor> it = this.responseInterceptors.iterator();
        while (it.hasNext()) {
            it.next().process(httpResponse, httpContext);
        }
    }

    protected final void copyInterceptors(BasicHttpProcessor basicHttpProcessor) {
        basicHttpProcessor.requestInterceptors.clear();
        basicHttpProcessor.requestInterceptors.addAll(this.requestInterceptors);
        basicHttpProcessor.responseInterceptors.clear();
        basicHttpProcessor.responseInterceptors.addAll(this.responseInterceptors);
    }

    public final BasicHttpProcessor copy() {
        BasicHttpProcessor basicHttpProcessor = new BasicHttpProcessor();
        copyInterceptors(basicHttpProcessor);
        return basicHttpProcessor;
    }

    public final Object clone() {
        BasicHttpProcessor basicHttpProcessor = (BasicHttpProcessor) super.clone();
        copyInterceptors(basicHttpProcessor);
        return basicHttpProcessor;
    }
}
