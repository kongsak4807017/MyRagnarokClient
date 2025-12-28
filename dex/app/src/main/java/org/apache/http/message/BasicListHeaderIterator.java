package org.apache.http.message;

import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicListHeaderIterator implements HeaderIterator {
    protected final List<Header> allHeaders;
    protected String headerName;
    protected int currentIndex = findNext(-1);
    protected int lastIndex = -1;

    public BasicListHeaderIterator(List<Header> list, String str) {
        this.allHeaders = (List) Args.notNull(list, "Header list");
        this.headerName = str;
    }

    protected int findNext(int i) {
        int i2 = i;
        if (i < -1) {
            return -1;
        }
        int size = this.allHeaders.size() - 1;
        boolean zFilterHeader = false;
        while (!zFilterHeader && i2 < size) {
            i2++;
            zFilterHeader = filterHeader(i2);
        }
        if (zFilterHeader) {
            return i2;
        }
        return -1;
    }

    protected boolean filterHeader(int i) {
        if (this.headerName == null) {
            return true;
        }
        return this.headerName.equalsIgnoreCase(this.allHeaders.get(i).getName());
    }

    @Override // org.apache.http.HeaderIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentIndex >= 0;
    }

    @Override // org.apache.http.HeaderIterator
    public Header nextHeader() {
        int i = this.currentIndex;
        if (i < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.lastIndex = i;
        this.currentIndex = findNext(i);
        return this.allHeaders.get(i);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextHeader();
    }

    @Override // java.util.Iterator
    public void remove() {
        Asserts.check(this.lastIndex >= 0, "No header to remove");
        this.allHeaders.remove(this.lastIndex);
        this.lastIndex = -1;
        this.currentIndex--;
    }
}
