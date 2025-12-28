package org.apache.commons.net.io;

import java.util.EventListener;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface CopyStreamListener extends EventListener {
    void bytesTransferred(long j, int i, long j2);

    void bytesTransferred(CopyStreamEvent copyStreamEvent);
}
