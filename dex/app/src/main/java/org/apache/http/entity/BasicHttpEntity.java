package org.apache.http.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.impl.io.EmptyInputStream;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicHttpEntity extends AbstractHttpEntity {
    private InputStream content;
    private long length = -1;

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.length;
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() {
        Asserts.check(this.content != null, "Content has not been provided");
        return this.content;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    public void setContentLength(long j) {
        this.length = j;
    }

    public void setContent(InputStream inputStream) {
        this.content = inputStream;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        Args.notNull(outputStream, "Output stream");
        InputStream content = getContent();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = content.read(bArr);
                if (i != -1) {
                    outputStream.write(bArr, 0, i);
                } else {
                    return;
                }
            }
        } finally {
            content.close();
        }
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return (this.content == null || this.content == EmptyInputStream.INSTANCE) ? false : true;
    }
}
