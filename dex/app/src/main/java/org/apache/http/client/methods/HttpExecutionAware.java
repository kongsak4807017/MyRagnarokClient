package org.apache.http.client.methods;

import org.apache.http.concurrent.Cancellable;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpExecutionAware {
    boolean isAborted();

    void setCancellable(Cancellable cancellable);
}
