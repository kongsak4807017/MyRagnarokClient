package org.apache.http;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpEntity {
    @Deprecated
    void consumeContent();

    InputStream getContent();

    Header getContentEncoding();

    long getContentLength();

    Header getContentType();

    boolean isChunked();

    boolean isRepeatable();

    boolean isStreaming();

    void writeTo(OutputStream outputStream);
}
