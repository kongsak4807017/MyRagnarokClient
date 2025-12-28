package org.apache.http;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpRequestFactory {
    HttpRequest newHttpRequest(String str, String str2);

    HttpRequest newHttpRequest(RequestLine requestLine);
}
