package org.apache.http.impl.entity;

import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.io.ChunkedOutputStream;
import org.apache.http.impl.io.ContentLengthOutputStream;
import org.apache.http.impl.io.IdentityOutputStream;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class EntitySerializer {
    private final ContentLengthStrategy lenStrategy;

    public EntitySerializer(ContentLengthStrategy contentLengthStrategy) {
        this.lenStrategy = (ContentLengthStrategy) Args.notNull(contentLengthStrategy, "Content length strategy");
    }

    protected OutputStream doSerialize(SessionOutputBuffer sessionOutputBuffer, HttpMessage httpMessage) {
        long jDetermineLength = this.lenStrategy.determineLength(httpMessage);
        if (jDetermineLength == -2) {
            return new ChunkedOutputStream(sessionOutputBuffer);
        }
        if (jDetermineLength != -1) {
            return new ContentLengthOutputStream(sessionOutputBuffer, jDetermineLength);
        }
        return new IdentityOutputStream(sessionOutputBuffer);
    }

    public void serialize(SessionOutputBuffer sessionOutputBuffer, HttpMessage httpMessage, HttpEntity httpEntity) {
        Args.notNull(sessionOutputBuffer, "Session output buffer");
        Args.notNull(httpMessage, "HTTP message");
        Args.notNull(httpEntity, "HTTP entity");
        OutputStream outputStreamDoSerialize = doSerialize(sessionOutputBuffer, httpMessage);
        httpEntity.writeTo(outputStreamDoSerialize);
        outputStreamDoSerialize.close();
    }
}
