package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.util.Args;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicHeaderIterator implements HeaderIterator {
    protected final Header[] allHeaders;
    protected int currentIndex = findNext(-1);
    protected String headerName;

    public BasicHeaderIterator(Header[] headerArr, String str) {
        this.allHeaders = (Header[]) Args.notNull(headerArr, "Header array");
        this.headerName = str;
    }

    protected int findNext(int i) {
        int i2 = i;
        if (i < -1) {
            return -1;
        }
        int length = this.allHeaders.length - 1;
        boolean zFilterHeader = false;
        while (!zFilterHeader && i2 < length) {
            i2++;
            zFilterHeader = filterHeader(i2);
        }
        if (zFilterHeader) {
            return i2;
        }
        return -1;
    }

    protected boolean filterHeader(int i) {
        return this.headerName == null || this.headerName.equalsIgnoreCase(this.allHeaders[i].getName());
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
        this.currentIndex = findNext(i);
        return this.allHeaders[i];
    }

    @Override // java.util.Iterator
    public final Object next() {
        return nextHeader();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}
