package org.apache.http.impl.execchain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.conn.EofSensorInputStream;
import org.apache.http.conn.EofSensorWatcher;
import org.apache.http.entity.HttpEntityWrapper;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ResponseEntityProxy extends HttpEntityWrapper implements EofSensorWatcher {
    private final ConnectionHolder connHolder;

    public static void enchance(HttpResponse httpResponse, ConnectionHolder connectionHolder) {
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null && entity.isStreaming() && connectionHolder != null) {
            httpResponse.setEntity(new ResponseEntityProxy(entity, connectionHolder));
        }
    }

    ResponseEntityProxy(HttpEntity httpEntity, ConnectionHolder connectionHolder) {
        super(httpEntity);
        this.connHolder = connectionHolder;
    }

    private void cleanup() {
        if (this.connHolder != null) {
            this.connHolder.close();
        }
    }

    private void abortConnection() {
        if (this.connHolder != null) {
            this.connHolder.abortConnection();
        }
    }

    public void releaseConnection() {
        if (this.connHolder != null) {
            this.connHolder.releaseConnection();
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public InputStream getContent() {
        return new EofSensorInputStream(this.wrappedEntity.getContent(), this);
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    @Deprecated
    public void consumeContent() {
        releaseConnection();
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        try {
            if (outputStream != null) {
                try {
                    this.wrappedEntity.writeTo(outputStream);
                } catch (IOException e) {
                    abortConnection();
                    throw e;
                } catch (RuntimeException e2) {
                    abortConnection();
                    throw e2;
                }
            }
            releaseConnection();
        } finally {
            cleanup();
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean eofDetected(InputStream inputStream) {
        try {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    abortConnection();
                    throw e;
                } catch (RuntimeException e2) {
                    abortConnection();
                    throw e2;
                }
            }
            releaseConnection();
            return false;
        } finally {
            cleanup();
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamClosed(InputStream inputStream) {
        try {
            try {
                boolean z = (this.connHolder == null || this.connHolder.isReleased()) ? false : true;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (SocketException e) {
                        if (z) {
                            throw e;
                        }
                    }
                }
                releaseConnection();
                return false;
            } catch (IOException e2) {
                abortConnection();
                throw e2;
            } catch (RuntimeException e3) {
                abortConnection();
                throw e3;
            }
        } finally {
            cleanup();
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamAbort(InputStream inputStream) {
        cleanup();
        return false;
    }

    public String toString() {
        return "ResponseEntityProxy{" + this.wrappedEntity + '}';
    }
}
