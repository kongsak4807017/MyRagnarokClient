package org.apache.http.impl.conn.tsccm;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.impl.conn.AbstractPooledConnAdapter;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicPooledConnAdapter extends AbstractPooledConnAdapter {
    protected BasicPooledConnAdapter(ThreadSafeClientConnManager threadSafeClientConnManager, AbstractPoolEntry abstractPoolEntry) {
        super(threadSafeClientConnManager, abstractPoolEntry);
        markReusable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.http.impl.conn.AbstractClientConnAdapter
    public ClientConnectionManager getManager() {
        return super.getManager();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.http.impl.conn.AbstractPooledConnAdapter
    public AbstractPoolEntry getPoolEntry() {
        return super.getPoolEntry();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.http.impl.conn.AbstractPooledConnAdapter, org.apache.http.impl.conn.AbstractClientConnAdapter
    public void detach() {
        super.detach();
    }
}
