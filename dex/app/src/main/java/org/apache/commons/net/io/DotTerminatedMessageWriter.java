package org.apache.commons.net.io;

import android.support.v4.view.MotionEventCompat;
import java.io.Writer;
import org.apache.commons.net.SocketClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class DotTerminatedMessageWriter extends Writer {
    private static final int __LAST_WAS_CR_STATE = 1;
    private static final int __LAST_WAS_NL_STATE = 2;
    private static final int __NOTHING_SPECIAL_STATE = 0;
    private Writer __output;
    private int __state;

    public DotTerminatedMessageWriter(Writer writer) {
        super(writer);
        this.__output = writer;
        this.__state = 0;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        synchronized (this.lock) {
            switch (i) {
                case 10:
                    if (this.__state != 1) {
                        this.__output.write(13);
                    }
                    this.__output.write(10);
                    this.__state = 2;
                    return;
                case 13:
                    this.__state = 1;
                    this.__output.write(13);
                    return;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    if (this.__state == 2) {
                        this.__output.write(46);
                        break;
                    }
                    break;
            }
            this.__state = 0;
            this.__output.write(i);
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (this.lock) {
            while (true) {
                int i3 = i2;
                i2 = i3 - 1;
                if (i3 > 0) {
                    int i4 = i;
                    i++;
                    write(cArr[i4]);
                }
            }
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public final void write(String str) {
        write(str.toCharArray());
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        write(str.toCharArray(), i, i2);
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        synchronized (this.lock) {
            this.__output.flush();
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.lock) {
            if (this.__output == null) {
                return;
            }
            if (this.__state == 1) {
                this.__output.write(10);
            } else if (this.__state != 2) {
                this.__output.write(SocketClient.NETASCII_EOL);
            }
            this.__output.write(".\r\n");
            this.__output.flush();
            this.__output = null;
        }
    }
}
