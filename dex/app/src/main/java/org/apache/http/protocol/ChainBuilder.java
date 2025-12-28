package org.apache.http.protocol;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ChainBuilder<E> {
    private final LinkedList<E> list = new LinkedList<>();
    private final Map<Class<?>, E> uniqueClasses = new HashMap();

    private void ensureUnique(E e) {
        E eRemove = this.uniqueClasses.remove(e.getClass());
        if (eRemove != null) {
            this.list.remove(eRemove);
        }
        this.uniqueClasses.put(e.getClass(), e);
    }

    public final ChainBuilder<E> addFirst(E e) {
        if (e == null) {
            return this;
        }
        ensureUnique(e);
        this.list.addFirst(e);
        return this;
    }

    public final ChainBuilder<E> addLast(E e) {
        if (e == null) {
            return this;
        }
        ensureUnique(e);
        this.list.addLast(e);
        return this;
    }

    public final ChainBuilder<E> addAllFirst(Collection<E> collection) {
        if (collection == null) {
            return this;
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            addFirst(it.next());
        }
        return this;
    }

    public final ChainBuilder<E> addAllFirst(E... eArr) {
        if (eArr == null) {
            return this;
        }
        for (E e : eArr) {
            addFirst(e);
        }
        return this;
    }

    public final ChainBuilder<E> addAllLast(Collection<E> collection) {
        if (collection == null) {
            return this;
        }
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            addLast(it.next());
        }
        return this;
    }

    public final ChainBuilder<E> addAllLast(E... eArr) {
        if (eArr == null) {
            return this;
        }
        for (E e : eArr) {
            addLast(e);
        }
        return this;
    }

    public final LinkedList<E> build() {
        return new LinkedList<>(this.list);
    }
}
