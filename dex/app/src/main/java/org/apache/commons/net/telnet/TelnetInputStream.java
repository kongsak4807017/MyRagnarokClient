package org.apache.commons.net.telnet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class TelnetInputStream extends BufferedInputStream implements Runnable {
    private static final int EOF = -1;
    private static final int WOULD_BLOCK = -2;
    static final int _STATE_CR = 8;
    static final int _STATE_DATA = 0;
    static final int _STATE_DO = 4;
    static final int _STATE_DONT = 5;
    static final int _STATE_IAC = 1;
    static final int _STATE_IAC_SB = 9;
    static final int _STATE_SB = 6;
    static final int _STATE_SE = 7;
    static final int _STATE_WILL = 2;
    static final int _STATE_WONT = 3;
    private int __bytesAvailable;
    private final TelnetClient __client;
    private boolean __hasReachedEOF;
    private IOException __ioException;
    private volatile boolean __isClosed;
    private final int[] __queue;
    private int __queueHead;
    private int __queueTail;
    private boolean __readIsWaiting;
    private int __receiveState;
    private final int[] __suboption;
    private int __suboption_count;
    private final Thread __thread;
    private volatile boolean __threaded;

    TelnetInputStream(InputStream inputStream, TelnetClient telnetClient, boolean z) {
        super(inputStream);
        this.__suboption = new int[512];
        this.__suboption_count = 0;
        this.__client = telnetClient;
        this.__receiveState = 0;
        this.__isClosed = true;
        this.__hasReachedEOF = false;
        this.__queue = new int[2049];
        this.__queueHead = 0;
        this.__queueTail = 0;
        this.__bytesAvailable = 0;
        this.__ioException = null;
        this.__readIsWaiting = false;
        this.__threaded = false;
        if (z) {
            this.__thread = new Thread(this);
        } else {
            this.__thread = null;
        }
    }

    TelnetInputStream(InputStream inputStream, TelnetClient telnetClient) {
        this(inputStream, telnetClient, true);
    }

    final void _start() {
        if (this.__thread == null) {
            return;
        }
        this.__isClosed = false;
        int priority = Thread.currentThread().getPriority() + 1;
        if (priority > 10) {
            priority = 10;
        }
        this.__thread.setPriority(priority);
        this.__thread.setDaemon(true);
        this.__thread.start();
        this.__threaded = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int __read(boolean r6) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetInputStream.__read(boolean):int");
    }

    private boolean __processChar(int i) {
        boolean z;
        synchronized (this.__queue) {
            z = this.__bytesAvailable == 0;
            while (this.__bytesAvailable >= this.__queue.length - 1) {
                if (this.__threaded) {
                    this.__queue.notify();
                    try {
                        this.__queue.wait();
                    } catch (InterruptedException e) {
                        throw e;
                    }
                } else {
                    throw new IllegalStateException("Queue is full! Cannot process another character.");
                }
            }
            if (this.__readIsWaiting && this.__threaded) {
                this.__queue.notify();
            }
            this.__queue[this.__queueTail] = i;
            this.__bytesAvailable++;
            int i2 = this.__queueTail + 1;
            this.__queueTail = i2;
            if (i2 >= this.__queue.length) {
                this.__queueTail = 0;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0075 A[Catch: all -> 0x00ac, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:8:0x000d, B:10:0x0011, B:12:0x0015, B:15:0x0018, B:17:0x001c, B:18:0x0021, B:20:0x002d, B:21:0x0034, B:22:0x0035, B:23:0x0039, B:27:0x0042, B:46:0x0063, B:53:0x006e, B:55:0x0075, B:57:0x007e, B:48:0x0067, B:50:0x006b, B:31:0x0046, B:32:0x0048, B:41:0x005d, B:40:0x005c, B:58:0x0083, B:60:0x0094, B:61:0x0097, B:63:0x00a1, B:65:0x00a5, B:66:0x00aa, B:33:0x0049, B:34:0x0050, B:36:0x0058), top: B:78:0x0003, inners: #0, #1, #2, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007e A[EDGE_INSN: B:93:0x007e->B:57:0x007e BREAK  A[LOOP:1: B:72:0x0039->B:95:?], SYNTHETIC] */
    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read() {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.telnet.TelnetInputStream.read():int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        synchronized (this.__queue) {
            if (i2 > this.__bytesAvailable) {
                i2 = this.__bytesAvailable;
            }
        }
        int i3 = read();
        if (i3 == -1) {
            return -1;
        }
        do {
            int i4 = i;
            i++;
            bArr[i4] = (byte) i3;
            i2--;
            if (i2 <= 0) {
                break;
            }
            i3 = read();
        } while (i3 != -1);
        return i - i;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        synchronized (this.__queue) {
            if (this.__threaded) {
                return this.__bytesAvailable;
            }
            return this.__bytesAvailable + super.available();
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        synchronized (this.__queue) {
            this.__hasReachedEOF = true;
            this.__isClosed = true;
            if (this.__thread != null && this.__thread.isAlive()) {
                this.__thread.interrupt();
            }
            this.__queue.notifyAll();
        }
        this.__threaded = false;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i__read;
        while (!this.__isClosed) {
            try {
                try {
                    try {
                        i__read = __read(true);
                    } catch (InterruptedIOException e) {
                        synchronized (this.__queue) {
                            this.__ioException = e;
                            this.__queue.notifyAll();
                            try {
                                this.__queue.wait(100L);
                            } catch (InterruptedException unused) {
                                if (this.__isClosed) {
                                    break;
                                }
                            }
                        }
                    }
                    if (i__read < 0) {
                        break;
                    }
                    boolean z__processChar = false;
                    try {
                        z__processChar = __processChar(i__read);
                    } catch (InterruptedException unused2) {
                        if (this.__isClosed) {
                            break;
                        }
                    }
                    if (z__processChar) {
                        this.__client.notifyInputListener();
                    }
                } catch (RuntimeException unused3) {
                    super.close();
                }
            } catch (IOException e2) {
                synchronized (this.__queue) {
                    this.__ioException = e2;
                    this.__client.notifyInputListener();
                }
            }
        }
        synchronized (this.__queue) {
            this.__isClosed = true;
            this.__hasReachedEOF = true;
            this.__queue.notify();
        }
        this.__threaded = false;
    }
}
