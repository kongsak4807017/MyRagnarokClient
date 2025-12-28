package org.apache.http.impl.io;

import org.apache.http.HttpResponse;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class HttpResponseWriter extends AbstractMessageWriter<HttpResponse> {
    public HttpResponseWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter, HttpParams httpParams) {
        super(sessionOutputBuffer, lineFormatter, httpParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.http.impl.io.AbstractMessageWriter
    public void writeHeadLine(HttpResponse httpResponse) {
        this.lineFormatter.formatStatusLine(this.lineBuf, httpResponse.getStatusLine());
        this.sessionBuffer.writeLine(this.lineBuf);
    }
}
