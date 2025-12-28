package org.apache.commons.net.io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class Util {
    public static final int DEFAULT_COPY_BUFFER_SIZE = 1024;

    private Util() {
    }

    public static final long copyStream(InputStream inputStream, OutputStream outputStream, int i, long j, CopyStreamListener copyStreamListener, boolean z) throws IOException {
        byte[] bArr = new byte[i];
        long j2 = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                if (i2 == 0) {
                    int i3 = inputStream.read();
                    if (i3 < 0) {
                        break;
                    }
                    outputStream.write(i3);
                    if (z) {
                        outputStream.flush();
                    }
                    j2 = 1 + j2;
                    if (copyStreamListener != null) {
                        copyStreamListener.bytesTransferred(j2, 1, j);
                    }
                } else {
                    outputStream.write(bArr, 0, i2);
                    if (z) {
                        outputStream.flush();
                    }
                    j2 = i2 + j2;
                    if (copyStreamListener != null) {
                        copyStreamListener.bytesTransferred(j2, i2, j);
                    }
                }
            } catch (IOException e) {
                throw new CopyStreamException("IOException caught while copying.", j2, e);
            }
        }
        return j2;
    }

    public static final long copyStream(InputStream inputStream, OutputStream outputStream, int i, long j, CopyStreamListener copyStreamListener) {
        return copyStream(inputStream, outputStream, i, j, copyStreamListener, true);
    }

    public static final long copyStream(InputStream inputStream, OutputStream outputStream, int i) {
        return copyStream(inputStream, outputStream, i, -1L, null);
    }

    public static final long copyStream(InputStream inputStream, OutputStream outputStream) {
        return copyStream(inputStream, outputStream, 1024);
    }

    public static final long copyReader(Reader reader, Writer writer, int i, long j, CopyStreamListener copyStreamListener) throws IOException {
        char[] cArr = new char[i];
        long j2 = 0;
        while (true) {
            try {
                int i2 = reader.read(cArr);
                if (i2 == -1) {
                    break;
                }
                if (i2 == 0) {
                    int i3 = reader.read();
                    if (i3 < 0) {
                        break;
                    }
                    writer.write(i3);
                    writer.flush();
                    j2 = 1 + j2;
                    if (copyStreamListener != null) {
                        copyStreamListener.bytesTransferred(j2, i3, j);
                    }
                } else {
                    writer.write(cArr, 0, i2);
                    writer.flush();
                    j2 = i2 + j2;
                    if (copyStreamListener != null) {
                        copyStreamListener.bytesTransferred(j2, i2, j);
                    }
                }
            } catch (IOException e) {
                throw new CopyStreamException("IOException caught while copying.", j2, e);
            }
        }
        return j2;
    }

    public static final long copyReader(Reader reader, Writer writer, int i) {
        return copyReader(reader, writer, i, -1L, null);
    }

    public static final long copyReader(Reader reader, Writer writer) {
        return copyReader(reader, writer, 1024);
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(Socket socket) throws IOException {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }
}
