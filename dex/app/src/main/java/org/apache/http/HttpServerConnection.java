package org.apache.http;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpServerConnection extends HttpConnection {
    void flush();

    void receiveRequestEntity(HttpEntityEnclosingRequest httpEntityEnclosingRequest);

    HttpRequest receiveRequestHeader();

    void sendResponseEntity(HttpResponse httpResponse);

    void sendResponseHeader(HttpResponse httpResponse);
}
