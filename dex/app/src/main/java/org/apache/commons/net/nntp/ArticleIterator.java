package org.apache.commons.net.nntp;

import java.util.Iterator;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ArticleIterator implements Iterable<Article>, Iterator<Article> {
    private final Iterator<String> stringIterator;

    public ArticleIterator(Iterable<String> iterable) {
        this.stringIterator = iterable.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.stringIterator.hasNext();
    }

    @Override // java.util.Iterator
    public Article next() {
        return NNTPClient.__parseArticleEntry(this.stringIterator.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.stringIterator.remove();
    }

    @Override // java.lang.Iterable
    public Iterator<Article> iterator() {
        return this;
    }
}
