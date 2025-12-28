package org.apache.commons.logging.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class WeakHashtable extends Hashtable {
    private static final int MAX_CHANGES_BEFORE_PURGE = 100;
    private static final int PARTIAL_PURGE_COUNT = 10;
    private ReferenceQueue queue = new ReferenceQueue();
    private int changeCount = 0;

    @Override // java.util.Hashtable, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(new Referenced(obj, (AnonymousClass1) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public final Enumeration elements() {
        purge();
        return super.elements();
    }

    @Override // java.util.Hashtable, java.util.Map
    public final Set entrySet() {
        purge();
        Set<Map.Entry> setEntrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : setEntrySet) {
            Object value = ((Referenced) entry.getKey()).getValue();
            Object value2 = entry.getValue();
            if (value != null) {
                hashSet.add(new Entry(value, value2, null));
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final Object get(Object obj) {
        return super.get(new Referenced(obj, (AnonymousClass1) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public final Enumeration keys() {
        purge();
        return new Enumeration(this, super.keys()) { // from class: org.apache.commons.logging.impl.WeakHashtable.1
            private final WeakHashtable this$0;
            private final Enumeration val$enumer;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.val$enumer.hasMoreElements();
            }

            {
                this.this$0 = this;
                this.val$enumer = enumeration;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return ((Referenced) this.val$enumer.nextElement()).getValue();
            }
        };
    }

    @Override // java.util.Hashtable, java.util.Map
    public final Set keySet() {
        purge();
        Set setKeySet = super.keySet();
        HashSet hashSet = new HashSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            Object value = ((Referenced) it.next()).getValue();
            if (value != null) {
                hashSet.add(value);
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed");
        }
        if (obj2 == null) {
            throw new NullPointerException("Null values are not allowed");
        }
        int i = this.changeCount;
        this.changeCount = i + 1;
        if (i > 100) {
            purge();
            this.changeCount = 0;
        } else if (this.changeCount % 10 == 0) {
            purgeOne();
        }
        return super.put(new Referenced(obj, this.queue, null), obj2);
    }

    @Override // java.util.Hashtable, java.util.Map
    public final void putAll(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Hashtable, java.util.Map
    public final Collection values() {
        purge();
        return super.values();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final Object remove(Object obj) {
        int i = this.changeCount;
        this.changeCount = i + 1;
        if (i > 100) {
            purge();
            this.changeCount = 0;
        } else if (this.changeCount % 10 == 0) {
            purgeOne();
        }
        return super.remove(new Referenced(obj, (AnonymousClass1) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public final int size() {
        purge();
        return super.size();
    }

    @Override // java.util.Hashtable
    public final String toString() {
        purge();
        return super.toString();
    }

    @Override // java.util.Hashtable
    protected final void rehash() {
        purge();
        super.rehash();
    }

    private void purge() {
        synchronized (this.queue) {
            while (true) {
                WeakKey weakKey = (WeakKey) this.queue.poll();
                if (weakKey != null) {
                    super.remove(weakKey.getReferenced());
                }
            }
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            WeakKey weakKey = (WeakKey) this.queue.poll();
            if (weakKey != null) {
                super.remove(weakKey.getReferenced());
            }
        }
    }

    static final class Entry implements Map.Entry {
        private final Object key;
        private final Object value;

        Entry(Object obj, Object obj2, AnonymousClass1 anonymousClass1) {
            this(obj, obj2);
        }

        private Entry(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.key;
        }
    }

    static final class Referenced {
        private final int hashCode;
        private final WeakReference reference;

        Referenced(Object obj, ReferenceQueue referenceQueue, AnonymousClass1 anonymousClass1) {
            this(obj, referenceQueue);
        }

        Referenced(Object obj, AnonymousClass1 anonymousClass1) {
            this(obj);
        }

        private Referenced(Object obj) {
            this.reference = new WeakReference(obj);
            this.hashCode = obj.hashCode();
        }

        private Referenced(Object obj, ReferenceQueue referenceQueue) {
            this.reference = new WeakKey(obj, referenceQueue, this, null);
            this.hashCode = obj.hashCode();
        }

        public final int hashCode() {
            return this.hashCode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getValue() {
            return this.reference.get();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Referenced)) {
                return false;
            }
            Referenced referenced = (Referenced) obj;
            Object value = getValue();
            Object value2 = referenced.getValue();
            if (value == null) {
                boolean z = value2 == null;
                if (z) {
                    return hashCode() == referenced.hashCode();
                }
                return z;
            }
            return value.equals(value2);
        }
    }

    static final class WeakKey extends WeakReference {
        private final Referenced referenced;

        WeakKey(Object obj, ReferenceQueue referenceQueue, Referenced referenced, AnonymousClass1 anonymousClass1) {
            this(obj, referenceQueue, referenced);
        }

        private WeakKey(Object obj, ReferenceQueue referenceQueue, Referenced referenced) {
            super(obj, referenceQueue);
            this.referenced = referenced;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Referenced getReferenced() {
            return this.referenced;
        }
    }
}
