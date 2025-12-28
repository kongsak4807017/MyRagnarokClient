package org.apache.http.conn;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicManagedEntity extends HttpEntityWrapper implements ConnectionReleaseTrigger, EofSensorWatcher {
    protected final boolean attemptReuse;
    protected ManagedClientConnection managedConn;

    public BasicManagedEntity(HttpEntity httpEntity, ManagedClientConnection managedClientConnection, boolean z) {
        super(httpEntity);
        Args.notNull(managedClientConnection, "Connection");
        this.managedConn = managedClientConnection;
        this.attemptReuse = z;
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public InputStream getContent() {
        return new EofSensorInputStream(this.wrappedEntity.getContent(), this);
    }

    private void ensureConsumed() {
        if (this.managedConn == null) {
            return;
        }
        try {
            if (this.attemptReuse) {
                EntityUtils.consume(this.wrappedEntity);
                this.managedConn.markReusable();
            } else {
                this.managedConn.unmarkReusable();
            }
        } finally {
            releaseManagedConnection();
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    @Deprecated
    public void consumeContent() {
        ensureConsumed();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        super.writeTo(outputStream);
        ensureConsumed();
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        ensureConsumed();
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void abortConnection() {
        if (this.managedConn != null) {
            try {
                this.managedConn.abortConnection();
            } finally {
                this.managedConn = null;
            }
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean eofDetected(InputStream inputStream) {
        try {
            if (this.managedConn != null) {
                if (this.attemptReuse) {
                    inputStream.close();
                    this.managedConn.markReusable();
                } else {
                    this.managedConn.unmarkReusable();
                }
            }
            return false;
        } finally {
            releaseManagedConnection();
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamClosed(InputStream inputStream) {
        try {
            if (this.managedConn != null) {
                if (this.attemptReuse) {
                    boolean zIsOpen = this.managedConn.isOpen();
                    try {
                        inputStream.close();
                        this.managedConn.markReusable();
                    } catch (SocketException e) {
                        if (zIsOpen) {
                            throw e;
                        }
                    }
                } else {
                    this.managedConn.unmarkReusable();
                }
            }
            return false;
        } finally {
            releaseManagedConnection();
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamAbort(InputStream inputStream) {
        if (this.managedConn != null) {
            this.managedConn.abortConnection();
            return false;
        }
        return false;
    }

    protected void releaseManagedConnection() {
        if (this.managedConn != null) {
            try {
                this.managedConn.releaseConnection();
            } finally {
                this.managedConn = null;
            }
        }
    }
}
