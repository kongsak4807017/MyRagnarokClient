package org.apache.http.pool;

import java.util.concurrent.Future;
import org.apache.http.concurrent.FutureCallback;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface ConnPool<T, E> {
    Future<E> lease(T t, Object obj, FutureCallback<E> futureCallback);

    void release(E e, boolean z);
}
