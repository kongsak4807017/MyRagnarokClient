package org.apache.http.impl.conn;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.entity.LaxContentLengthStrategy;
import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.apache.http.impl.io.DefaultHttpRequestWriterFactory;
import org.apache.http.io.HttpMessageParserFactory;
import org.apache.http.io.HttpMessageWriterFactory;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ManagedHttpClientConnectionFactory implements HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> {
    private static final AtomicLong COUNTER = new AtomicLong();
    public static final ManagedHttpClientConnectionFactory INSTANCE = new ManagedHttpClientConnectionFactory();
    private final Log headerlog;
    private final ContentLengthStrategy incomingContentStrategy;
    private final Log log;
    private final ContentLengthStrategy outgoingContentStrategy;
    private final HttpMessageWriterFactory<HttpRequest> requestWriterFactory;
    private final HttpMessageParserFactory<HttpResponse> responseParserFactory;
    private final Log wirelog;

    public ManagedHttpClientConnectionFactory(HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory, ContentLengthStrategy contentLengthStrategy, ContentLengthStrategy contentLengthStrategy2) {
        this.log = LogFactory.getLog(DefaultManagedHttpClientConnection.class);
        this.headerlog = LogFactory.getLog("org.apache.http.headers");
        this.wirelog = LogFactory.getLog("org.apache.http.wire");
        this.requestWriterFactory = httpMessageWriterFactory != null ? httpMessageWriterFactory : DefaultHttpRequestWriterFactory.INSTANCE;
        this.responseParserFactory = httpMessageParserFactory != null ? httpMessageParserFactory : DefaultHttpResponseParserFactory.INSTANCE;
        this.incomingContentStrategy = contentLengthStrategy != null ? contentLengthStrategy : LaxContentLengthStrategy.INSTANCE;
        this.outgoingContentStrategy = contentLengthStrategy2 != null ? contentLengthStrategy2 : StrictContentLengthStrategy.INSTANCE;
    }

    public ManagedHttpClientConnectionFactory(HttpMessageWriterFactory<HttpRequest> httpMessageWriterFactory, HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        this(httpMessageWriterFactory, httpMessageParserFactory, null, null);
    }

    public ManagedHttpClientConnectionFactory(HttpMessageParserFactory<HttpResponse> httpMessageParserFactory) {
        this(null, httpMessageParserFactory);
    }

    public ManagedHttpClientConnectionFactory() {
        this(null, null);
    }

    @Override // org.apache.http.conn.HttpConnectionFactory
    public ManagedHttpClientConnection create(HttpRoute httpRoute, ConnectionConfig connectionConfig) {
        ConnectionConfig connectionConfig2 = connectionConfig != null ? connectionConfig : ConnectionConfig.DEFAULT;
        CharsetDecoder charsetDecoderNewDecoder = null;
        CharsetEncoder charsetEncoderNewEncoder = null;
        Charset charset = connectionConfig2.getCharset();
        CodingErrorAction malformedInputAction = connectionConfig2.getMalformedInputAction() != null ? connectionConfig2.getMalformedInputAction() : CodingErrorAction.REPORT;
        CodingErrorAction unmappableInputAction = connectionConfig2.getUnmappableInputAction() != null ? connectionConfig2.getUnmappableInputAction() : CodingErrorAction.REPORT;
        if (charset != null) {
            charsetDecoderNewDecoder = charset.newDecoder();
            charsetDecoderNewDecoder.onMalformedInput(malformedInputAction);
            charsetDecoderNewDecoder.onUnmappableCharacter(unmappableInputAction);
            charsetEncoderNewEncoder = charset.newEncoder();
            charsetEncoderNewEncoder.onMalformedInput(malformedInputAction);
            charsetEncoderNewEncoder.onUnmappableCharacter(unmappableInputAction);
        }
        return new LoggingManagedHttpClientConnection("http-outgoing-" + Long.toString(COUNTER.getAndIncrement()), this.log, this.headerlog, this.wirelog, connectionConfig2.getBufferSize(), connectionConfig2.getFragmentSizeHint(), charsetDecoderNewDecoder, charsetEncoderNewEncoder, connectionConfig2.getMessageConstraints(), this.incomingContentStrategy, this.outgoingContentStrategy, this.requestWriterFactory, this.responseParserFactory);
    }
}
