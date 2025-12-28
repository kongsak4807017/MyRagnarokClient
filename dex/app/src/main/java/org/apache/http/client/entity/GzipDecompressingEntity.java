package org.apache.http.client.entity;

import org.apache.http.HttpEntity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class GzipDecompressingEntity extends DecompressingEntity {
    public GzipDecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity, GZIPInputStreamFactory.getInstance());
    }
}
