package org.apache.http.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.util.Args;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicFuture<T> implements Future<T>, Cancellable {
    private final FutureCallback<T> callback;
    private volatile boolean cancelled;
    private volatile boolean completed;
    private volatile Exception ex;
    private volatile T result;

    public BasicFuture(FutureCallback<T> futureCallback) {
        this.callback = futureCallback;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.completed;
    }

    private T getResult() throws ExecutionException {
        if (this.ex != null) {
            throw new ExecutionException(this.ex);
        }
        if (this.cancelled) {
            throw new CancellationException();
        }
        return this.result;
    }

    @Override // java.util.concurrent.Future
    public synchronized T get() {
        while (!this.completed) {
            wait();
        }
        return getResult();
    }

    @Override // java.util.concurrent.Future
    public synchronized T get(long j, TimeUnit timeUnit) {
        long jCurrentTimeMillis;
        Args.notNull(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j);
        long jCurrentTimeMillis2 = millis <= 0 ? 0L : System.currentTimeMillis();
        long j2 = millis;
        if (this.completed) {
            return getResult();
        }
        if (millis <= 0) {
            throw new TimeoutException();
        }
        do {
            wait(j2);
            if (!this.completed) {
                jCurrentTimeMillis = millis - (System.currentTimeMillis() - jCurrentTimeMillis2);
                j2 = jCurrentTimeMillis;
            } else {
                return getResult();
            }
        } while (jCurrentTimeMillis > 0);
        throw new TimeoutException();
    }

    public boolean completed(T t) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.result = t;
            notifyAll();
            if (this.callback != null) {
                this.callback.completed(t);
                return true;
            }
            return true;
        }
    }

    public boolean failed(Exception exc) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.ex = exc;
            notifyAll();
            if (this.callback != null) {
                this.callback.failed(exc);
                return true;
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (this.completed) {
                return false;
            }
            this.completed = true;
            this.cancelled = true;
            notifyAll();
            if (this.callback != null) {
                this.callback.cancelled();
                return true;
            }
            return true;
        }
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        return cancel(true);
    }
}
