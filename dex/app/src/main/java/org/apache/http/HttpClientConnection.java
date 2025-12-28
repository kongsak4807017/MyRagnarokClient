package org.apache.http;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpClientConnection extends HttpConnection {
    void flush();

    boolean isResponseAvailable(int i);

    void receiveResponseEntity(HttpResponse httpResponse);

    HttpResponse receiveResponseHeader();

    void sendRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest);

    void sendRequestHeader(HttpRequest httpRequest);
}
