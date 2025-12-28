package android.support.v4.util;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i;
        this.map = new LinkedHashMap<>(0, 0.75f, true);
    }

    public void resize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final V get(K k) {
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v2 = this.map.get(k);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(k);
            if (vCreate == null) {
                return null;
            }
            synchronized (this) {
                this.createCount++;
                v = (V) this.map.put(k, vCreate);
                if (v != null) {
                    this.map.put(k, v);
                } else {
                    this.size += safeSizeOf(k, vCreate);
                }
            }
            if (v != null) {
                entryRemoved(false, k, vCreate, v);
                return v;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final V put(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(k, v);
            vPut = this.map.put(k, v);
            if (vPut != null) {
                this.size -= safeSizeOf(k, vPut);
            }
        }
        if (vPut != null) {
            entryRemoved(false, k, vPut, v);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            r5 = r6
            monitor-enter(r6)
            int r0 = r6.size     // Catch: java.lang.Throwable -> L70
            if (r0 < 0) goto L12
            java.util.LinkedHashMap<K, V> r0 = r6.map     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L33
            int r0 = r6.size     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L33
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L70
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L70
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L70
            throw r0     // Catch: java.lang.Throwable -> L70
        L33:
            int r0 = r6.size     // Catch: java.lang.Throwable -> L70
            if (r0 <= r7) goto L3f
            java.util.LinkedHashMap<K, V> r0 = r6.map     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L41
        L3f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            return
        L41:
            java.util.LinkedHashMap<K, V> r0 = r6.map     // Catch: java.lang.Throwable -> L70
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L70
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L70
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L70
            r4 = r0
            java.lang.Object r3 = r4.getKey()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L70
            java.util.LinkedHashMap<K, V> r0 = r6.map     // Catch: java.lang.Throwable -> L70
            r0.remove(r3)     // Catch: java.lang.Throwable -> L70
            int r0 = r6.size     // Catch: java.lang.Throwable -> L70
            int r1 = r6.safeSizeOf(r3, r4)     // Catch: java.lang.Throwable -> L70
            int r0 = r0 - r1
            r6.size = r0     // Catch: java.lang.Throwable -> L70
            int r0 = r6.evictionCount     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + 1
            r6.evictionCount = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r7 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L70
            throw r7
        L73:
            r0 = 1
            r1 = 0
            r6.entryRemoved(r0, r3, r4, r1)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.util.LruCache.trimToSize(int):void");
    }

    public final V remove(K k) {
        V vRemove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            vRemove = this.map.remove(k);
            if (vRemove != null) {
                this.size -= safeSizeOf(k, vRemove);
            }
        }
        if (vRemove != null) {
            entryRemoved(false, k, vRemove, null);
        }
        return vRemove;
    }

    protected void entryRemoved(boolean z, K k, V v, V v2) {
    }

    protected V create(K k) {
        return null;
    }

    private int safeSizeOf(K k, V v) {
        int iSizeOf = sizeOf(k, v);
        if (iSizeOf < 0) {
            throw new IllegalStateException("Negative size: " + k + "=" + v);
        }
        return iSizeOf;
    }

    protected int sizeOf(K k, V v) {
        return 1;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int size() {
        return this.size;
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i;
        i = this.hitCount + this.missCount;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i != 0 ? (this.hitCount * 100) / i : 0));
    }
}
