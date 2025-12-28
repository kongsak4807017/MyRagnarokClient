package org.apache.http.impl.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.apache.http.MessageConstraintException;
import org.apache.http.config.MessageConstraints;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class SessionInputBufferImpl implements BufferInfo, SessionInputBuffer {
    private final byte[] buffer;
    private int bufferlen;
    private int bufferpos;
    private CharBuffer cbuf;
    private final MessageConstraints constraints;
    private final CharsetDecoder decoder;
    private InputStream instream;
    private final ByteArrayBuffer linebuffer;
    private final HttpTransportMetricsImpl metrics;
    private final int minChunkLimit;

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i, int i2, MessageConstraints messageConstraints, CharsetDecoder charsetDecoder) {
        Args.notNull(httpTransportMetricsImpl, "HTTP transport metrcis");
        Args.positive(i, "Buffer size");
        this.metrics = httpTransportMetricsImpl;
        this.buffer = new byte[i];
        this.bufferpos = 0;
        this.bufferlen = 0;
        this.minChunkLimit = i2 >= 0 ? i2 : 512;
        this.constraints = messageConstraints != null ? messageConstraints : MessageConstraints.DEFAULT;
        this.linebuffer = new ByteArrayBuffer(i);
        this.decoder = charsetDecoder;
    }

    public SessionInputBufferImpl(HttpTransportMetricsImpl httpTransportMetricsImpl, int i) {
        this(httpTransportMetricsImpl, i, i, null, null);
    }

    public void bind(InputStream inputStream) {
        this.instream = inputStream;
    }

    public boolean isBound() {
        return this.instream != null;
    }

    @Override // org.apache.http.io.BufferInfo
    public int capacity() {
        return this.buffer.length;
    }

    @Override // org.apache.http.io.BufferInfo
    public int length() {
        return this.bufferlen - this.bufferpos;
    }

    @Override // org.apache.http.io.BufferInfo
    public int available() {
        return capacity() - length();
    }

    private int streamRead(byte[] bArr, int i, int i2) {
        Asserts.notNull(this.instream, "Input stream");
        return this.instream.read(bArr, i, i2);
    }

    public int fillBuffer() {
        if (this.bufferpos > 0) {
            int i = this.bufferlen - this.bufferpos;
            if (i > 0) {
                System.arraycopy(this.buffer, this.bufferpos, this.buffer, 0, i);
            }
            this.bufferpos = 0;
            this.bufferlen = i;
        }
        int i2 = this.bufferlen;
        int iStreamRead = streamRead(this.buffer, i2, this.buffer.length - i2);
        if (iStreamRead == -1) {
            return -1;
        }
        this.bufferlen = i2 + iStreamRead;
        this.metrics.incrementBytesTransferred(iStreamRead);
        return iStreamRead;
    }

    public boolean hasBufferedData() {
        return this.bufferpos < this.bufferlen;
    }

    public void clear() {
        this.bufferpos = 0;
        this.bufferlen = 0;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read() {
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.buffer;
        int i = this.bufferpos;
        this.bufferpos = i + 1;
        return bArr[i] & 255;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        if (hasBufferedData()) {
            int iMin = Math.min(i2, this.bufferlen - this.bufferpos);
            System.arraycopy(this.buffer, this.bufferpos, bArr, i, iMin);
            this.bufferpos += iMin;
            return iMin;
        }
        if (i2 > this.minChunkLimit) {
            int iStreamRead = streamRead(bArr, i, i2);
            if (iStreamRead > 0) {
                this.metrics.incrementBytesTransferred(iStreamRead);
            }
            return iStreamRead;
        }
        while (!hasBufferedData()) {
            if (fillBuffer() == -1) {
                return -1;
            }
        }
        int iMin2 = Math.min(i2, this.bufferlen - this.bufferpos);
        System.arraycopy(this.buffer, this.bufferpos, bArr, i, iMin2);
        this.bufferpos += iMin2;
        return iMin2;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int read(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public int readLine(CharArrayBuffer charArrayBuffer) throws MessageConstraintException {
        Args.notNull(charArrayBuffer, "Char array buffer");
        int maxLineLength = this.constraints.getMaxLineLength();
        int iFillBuffer = 0;
        boolean z = true;
        while (z) {
            int i = -1;
            int i2 = this.bufferpos;
            while (true) {
                if (i2 >= this.bufferlen) {
                    break;
                }
                if (this.buffer[i2] != 10) {
                    i2++;
                } else {
                    i = i2;
                    break;
                }
            }
            if (maxLineLength > 0) {
                if ((this.linebuffer.length() + (i >= 0 ? i : this.bufferlen)) - this.bufferpos >= maxLineLength) {
                    throw new MessageConstraintException("Maximum line length limit exceeded");
                }
            }
            if (i != -1) {
                if (this.linebuffer.isEmpty()) {
                    return lineFromReadBuffer(charArrayBuffer, i);
                }
                z = false;
                this.linebuffer.append(this.buffer, this.bufferpos, (i + 1) - this.bufferpos);
                this.bufferpos = i + 1;
            } else {
                if (hasBufferedData()) {
                    this.linebuffer.append(this.buffer, this.bufferpos, this.bufferlen - this.bufferpos);
                    this.bufferpos = this.bufferlen;
                }
                iFillBuffer = fillBuffer();
                if (iFillBuffer == -1) {
                    z = false;
                }
            }
        }
        if (iFillBuffer == -1 && this.linebuffer.isEmpty()) {
            return -1;
        }
        return lineFromLineBuffer(charArrayBuffer);
    }

    private int lineFromLineBuffer(CharArrayBuffer charArrayBuffer) {
        int length = this.linebuffer.length();
        if (length > 0) {
            if (this.linebuffer.byteAt(length - 1) == 10) {
                length--;
            }
            if (length > 0 && this.linebuffer.byteAt(length - 1) == 13) {
                length--;
            }
        }
        if (this.decoder == null) {
            charArrayBuffer.append(this.linebuffer, 0, length);
        } else {
            length = appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.linebuffer.buffer(), 0, length));
        }
        this.linebuffer.clear();
        return length;
    }

    private int lineFromReadBuffer(CharArrayBuffer charArrayBuffer, int i) {
        int i2 = i;
        int i3 = this.bufferpos;
        this.bufferpos = i + 1;
        if (i > i3 && this.buffer[i - 1] == 13) {
            i2--;
        }
        int i4 = i2 - i3;
        if (this.decoder == null) {
            charArrayBuffer.append(this.buffer, i3, i4);
            return i4;
        }
        return appendDecoded(charArrayBuffer, ByteBuffer.wrap(this.buffer, i3, i4));
    }

    private int appendDecoded(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (this.cbuf == null) {
            this.cbuf = CharBuffer.allocate(1024);
        }
        this.decoder.reset();
        int iHandleDecodingResult = 0;
        while (byteBuffer.hasRemaining()) {
            iHandleDecodingResult += handleDecodingResult(this.decoder.decode(byteBuffer, this.cbuf, true), charArrayBuffer, byteBuffer);
        }
        int iHandleDecodingResult2 = iHandleDecodingResult + handleDecodingResult(this.decoder.flush(this.cbuf), charArrayBuffer, byteBuffer);
        this.cbuf.clear();
        return iHandleDecodingResult2;
    }

    private int handleDecodingResult(CoderResult coderResult, CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) throws CharacterCodingException {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.cbuf.flip();
        int iRemaining = this.cbuf.remaining();
        while (this.cbuf.hasRemaining()) {
            charArrayBuffer.append(this.cbuf.get());
        }
        this.cbuf.compact();
        return iRemaining;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public String readLine() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        if (readLine(charArrayBuffer) != -1) {
            return charArrayBuffer.toString();
        }
        return null;
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public boolean isDataAvailable(int i) {
        return hasBufferedData();
    }

    @Override // org.apache.http.io.SessionInputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }
}
