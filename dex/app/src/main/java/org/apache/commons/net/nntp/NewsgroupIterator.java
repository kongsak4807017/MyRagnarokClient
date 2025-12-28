package org.apache.commons.net.nntp;

import java.util.Iterator;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class NewsgroupIterator implements Iterable<NewsgroupInfo>, Iterator<NewsgroupInfo> {
    private final Iterator<String> stringIterator;

    public NewsgroupIterator(Iterable<String> iterable) {
        this.stringIterator = iterable.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.stringIterator.hasNext();
    }

    @Override // java.util.Iterator
    public NewsgroupInfo next() {
        return NNTPClient.__parseNewsgroupListEntry(this.stringIterator.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.stringIterator.remove();
    }

    @Override // java.lang.Iterable
    public Iterator<NewsgroupInfo> iterator() {
        return this;
    }
}
