package org.apache.http.pool;

import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class PoolEntry<T, C> {
    private final C conn;
    private final long created;
    private long expiry;
    private final String id;
    private final T route;
    private volatile Object state;
    private long updated;
    private final long validityDeadline;

    public abstract void close();

    public abstract boolean isClosed();

    public PoolEntry(String str, T t, C c, long j, TimeUnit timeUnit) {
        Args.notNull(t, "Route");
        Args.notNull(c, "Connection");
        Args.notNull(timeUnit, "Time unit");
        this.id = str;
        this.route = t;
        this.conn = c;
        this.created = System.currentTimeMillis();
        this.updated = this.created;
        if (j > 0) {
            long millis = this.created + timeUnit.toMillis(j);
            this.validityDeadline = millis > 0 ? millis : Long.MAX_VALUE;
        } else {
            this.validityDeadline = Long.MAX_VALUE;
        }
        this.expiry = this.validityDeadline;
    }

    public PoolEntry(String str, T t, C c) {
        this(str, t, c, 0L, TimeUnit.MILLISECONDS);
    }

    public String getId() {
        return this.id;
    }

    public T getRoute() {
        return this.route;
    }

    public C getConnection() {
        return this.conn;
    }

    public long getCreated() {
        return this.created;
    }

    public long getValidityDeadline() {
        return this.validityDeadline;
    }

    @Deprecated
    public long getValidUnit() {
        return this.validityDeadline;
    }

    public Object getState() {
        return this.state;
    }

    public void setState(Object obj) {
        this.state = obj;
    }

    public synchronized long getUpdated() {
        return this.updated;
    }

    public synchronized long getExpiry() {
        return this.expiry;
    }

    public synchronized void updateExpiry(long j, TimeUnit timeUnit) {
        long millis;
        Args.notNull(timeUnit, "Time unit");
        this.updated = System.currentTimeMillis();
        if (j > 0) {
            millis = this.updated + timeUnit.toMillis(j);
        } else {
            millis = Long.MAX_VALUE;
        }
        this.expiry = Math.min(millis, this.validityDeadline);
    }

    public synchronized boolean isExpired(long j) {
        return j >= this.expiry;
    }

    public String toString() {
        return "[id:" + this.id + "][route:" + this.route + "][state:" + this.state + "]";
    }
}
