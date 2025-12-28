package org.apache.http.client.utils;

import java.io.Closeable;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class HttpClientUtils {
    private HttpClientUtils() {
    }

    public static void closeQuietly(HttpResponse httpResponse) {
        HttpEntity entity;
        if (httpResponse != null && (entity = httpResponse.getEntity()) != null) {
            try {
                EntityUtils.consume(entity);
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(CloseableHttpResponse closeableHttpResponse) {
        try {
            if (closeableHttpResponse != null) {
                try {
                    EntityUtils.consume(closeableHttpResponse.getEntity());
                } finally {
                    closeableHttpResponse.close();
                }
            }
        } catch (IOException unused) {
        }
    }

    public static void closeQuietly(HttpClient httpClient) throws IOException {
        if (httpClient != null && (httpClient instanceof Closeable)) {
            try {
                ((Closeable) httpClient).close();
            } catch (IOException unused) {
            }
        }
    }
}
