package org.apache.http.impl.io;

import org.apache.http.HttpRequest;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class DefaultHttpRequestWriter extends AbstractMessageWriter<HttpRequest> {
    public DefaultHttpRequestWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter) {
        super(sessionOutputBuffer, lineFormatter);
    }

    public DefaultHttpRequestWriter(SessionOutputBuffer sessionOutputBuffer) {
        this(sessionOutputBuffer, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.http.impl.io.AbstractMessageWriter
    public void writeHeadLine(HttpRequest httpRequest) {
        this.lineFormatter.formatRequestLine(this.lineBuf, httpRequest.getRequestLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}
