package org.apache.http.impl.io;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.MessageConstraintException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.LineParser;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class AbstractMessageParser<T extends HttpMessage> implements HttpMessageParser<T> {
    private static final int HEADERS = 1;
    private static final int HEAD_LINE = 0;
    private final List<CharArrayBuffer> headerLines;
    protected final LineParser lineParser;
    private T message;
    private final MessageConstraints messageConstraints;
    private final SessionInputBuffer sessionBuffer;
    private int state;

    protected abstract T parseHead(SessionInputBuffer sessionInputBuffer);

    @Deprecated
    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, HttpParams httpParams) {
        Args.notNull(sessionInputBuffer, "Session input buffer");
        Args.notNull(httpParams, "HTTP parameters");
        this.sessionBuffer = sessionInputBuffer;
        this.messageConstraints = HttpParamConfig.getMessageConstraints(httpParams);
        this.lineParser = lineParser != null ? lineParser : BasicLineParser.INSTANCE;
        this.headerLines = new ArrayList();
        this.state = 0;
    }

    public AbstractMessageParser(SessionInputBuffer sessionInputBuffer, LineParser lineParser, MessageConstraints messageConstraints) {
        this.sessionBuffer = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
        this.lineParser = lineParser != null ? lineParser : BasicLineParser.INSTANCE;
        this.messageConstraints = messageConstraints != null ? messageConstraints : MessageConstraints.DEFAULT;
        this.headerLines = new ArrayList();
        this.state = 0;
    }

    public static Header[] parseHeaders(SessionInputBuffer sessionInputBuffer, int i, int i2, LineParser lineParser) {
        return parseHeaders(sessionInputBuffer, i, i2, lineParser != null ? lineParser : BasicLineParser.INSTANCE, new ArrayList());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        r6 = new org.apache.http.Header[r10.size()];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r4 >= r10.size()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        r6[r4] = r9.parseHeader(r10.get(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        throw new org.apache.http.ProtocolException(r6.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.http.Header[] parseHeaders(org.apache.http.io.SessionInputBuffer r6, int r7, int r8, org.apache.http.message.LineParser r9, java.util.List<org.apache.http.util.CharArrayBuffer> r10) throws org.apache.http.ProtocolException, org.apache.http.MessageConstraintException {
        /*
            java.lang.String r0 = "Session input buffer"
            org.apache.http.util.Args.notNull(r6, r0)
            java.lang.String r0 = "Line parser"
            org.apache.http.util.Args.notNull(r9, r0)
            java.lang.String r0 = "Header line list"
            org.apache.http.util.Args.notNull(r10, r0)
            r2 = 0
            r3 = 0
        L11:
            if (r2 != 0) goto L1b
            org.apache.http.util.CharArrayBuffer r2 = new org.apache.http.util.CharArrayBuffer
            r0 = 64
            r2.<init>(r0)
            goto L1e
        L1b:
            r2.clear()
        L1e:
            int r0 = r6.readLine(r2)
            r1 = -1
            if (r0 == r1) goto L92
            int r0 = r2.length()
            if (r0 <= 0) goto L92
            r0 = 0
            char r0 = r2.charAt(r0)
            r1 = 32
            if (r0 == r1) goto L3d
            r0 = 0
            char r0 = r2.charAt(r0)
            r1 = 9
            if (r0 != r1) goto L7b
        L3d:
            if (r3 == 0) goto L7b
            r4 = 0
        L40:
            int r0 = r2.length()
            if (r4 >= r0) goto L55
            char r5 = r2.charAt(r4)
            r0 = 32
            if (r5 == r0) goto L52
            r0 = 9
            if (r5 != r0) goto L55
        L52:
            int r4 = r4 + 1
            goto L40
        L55:
            if (r8 <= 0) goto L6d
            int r0 = r3.length()
            int r0 = r0 + 1
            int r1 = r2.length()
            int r0 = r0 + r1
            int r0 = r0 - r4
            if (r0 <= r8) goto L6d
            org.apache.http.MessageConstraintException r0 = new org.apache.http.MessageConstraintException
            java.lang.String r1 = "Maximum line length limit exceeded"
            r0.<init>(r1)
            throw r0
        L6d:
            r0 = 32
            r3.append(r0)
            int r0 = r2.length()
            int r0 = r0 - r4
            r3.append(r2, r4, r0)
            goto L80
        L7b:
            r10.add(r2)
            r3 = r2
            r2 = 0
        L80:
            if (r7 <= 0) goto L90
            int r0 = r10.size()
            if (r0 < r7) goto L90
            org.apache.http.MessageConstraintException r0 = new org.apache.http.MessageConstraintException
            java.lang.String r1 = "Maximum header count exceeded"
            r0.<init>(r1)
            throw r0
        L90:
            goto L11
        L92:
            int r0 = r10.size()
            org.apache.http.Header[] r6 = new org.apache.http.Header[r0]
            r4 = 0
        L99:
            int r0 = r10.size()
            if (r4 >= r0) goto Lbb
            java.lang.Object r0 = r10.get(r4)
            org.apache.http.util.CharArrayBuffer r0 = (org.apache.http.util.CharArrayBuffer) r0
            r5 = r0
            org.apache.http.Header r0 = r9.parseHeader(r5)     // Catch: org.apache.http.ParseException -> Lad
            r6[r4] = r0     // Catch: org.apache.http.ParseException -> Lad
            goto Lb8
        Lad:
            r6 = move-exception
            org.apache.http.ProtocolException r0 = new org.apache.http.ProtocolException
            java.lang.String r1 = r6.getMessage()
            r0.<init>(r1)
            throw r0
        Lb8:
            int r4 = r4 + 1
            goto L99
        Lbb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.io.AbstractMessageParser.parseHeaders(org.apache.http.io.SessionInputBuffer, int, int, org.apache.http.message.LineParser, java.util.List):org.apache.http.Header[]");
    }

    @Override // org.apache.http.io.HttpMessageParser
    public T parse() throws ProtocolException, MessageConstraintException {
        switch (this.state) {
            case 0:
                try {
                    this.message = (T) parseHead(this.sessionBuffer);
                    this.state = 1;
                    break;
                } catch (ParseException e) {
                    throw new ProtocolException(e.getMessage(), e);
                }
            case 1:
                break;
            default:
                throw new IllegalStateException("Inconsistent parser state");
        }
        this.message.setHeaders(parseHeaders(this.sessionBuffer, this.messageConstraints.getMaxHeaderCount(), this.messageConstraints.getMaxLineLength(), this.lineParser, this.headerLines));
        T t = this.message;
        this.message = null;
        this.headerLines.clear();
        this.state = 0;
        return t;
    }
}
