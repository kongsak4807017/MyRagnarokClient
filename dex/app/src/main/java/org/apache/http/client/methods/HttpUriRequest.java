package org.apache.http.client.methods;

import java.net.URI;
import org.apache.http.HttpRequest;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpUriRequest extends HttpRequest {
    void abort();

    String getMethod();

    URI getURI();

    boolean isAborted();
}
