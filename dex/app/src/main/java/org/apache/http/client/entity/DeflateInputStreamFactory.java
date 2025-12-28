package org.apache.http.client.entity;

import java.io.InputStream;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class DeflateInputStreamFactory implements InputStreamFactory {
    private static final DeflateInputStreamFactory INSTANCE = new DeflateInputStreamFactory();

    public static DeflateInputStreamFactory getInstance() {
        return INSTANCE;
    }

    @Override // org.apache.http.client.entity.InputStreamFactory
    public InputStream create(InputStream inputStream) {
        return new DeflateInputStream(inputStream);
    }
}
