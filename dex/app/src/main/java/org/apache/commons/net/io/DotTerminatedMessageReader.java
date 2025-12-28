package org.apache.commons.net.io;

import java.io.BufferedReader;
import java.io.Reader;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class DotTerminatedMessageReader extends BufferedReader {
    private static final char CR = '\r';
    private static final int DOT = 46;
    private static final char LF = '\n';
    private boolean atBeginning;
    private boolean eof;
    private boolean seenCR;

    public DotTerminatedMessageReader(Reader reader) {
        super(reader);
        this.atBeginning = true;
        this.eof = false;
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public final int read() {
        synchronized (this.lock) {
            if (this.eof) {
                return -1;
            }
            int i = super.read();
            if (i == -1) {
                this.eof = true;
                return -1;
            }
            if (this.atBeginning) {
                this.atBeginning = false;
                if (i == 46) {
                    mark(2);
                    int i2 = super.read();
                    if (i2 == -1) {
                        this.eof = true;
                        return 46;
                    }
                    if (i2 == 46) {
                        return i2;
                    }
                    if (i2 == 13) {
                        int i3 = super.read();
                        if (i3 == -1) {
                            reset();
                            return 46;
                        }
                        if (i3 == 10) {
                            this.atBeginning = true;
                            this.eof = true;
                            return -1;
                        }
                    }
                    reset();
                    return 46;
                }
            }
            if (this.seenCR) {
                this.seenCR = false;
                if (i == 10) {
                    this.atBeginning = true;
                }
            }
            if (i == 13) {
                this.seenCR = true;
            }
            return i;
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr) {
        return read(cArr, 0, cArr.length);
    }

    @Override // java.io.BufferedReader, java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        if (i2 <= 0) {
            return 0;
        }
        synchronized (this.lock) {
            int i3 = read();
            if (i3 == -1) {
                return -1;
            }
            do {
                int i4 = i;
                i++;
                cArr[i4] = (char) i3;
                i2--;
                if (i2 <= 0) {
                    break;
                }
                i3 = read();
            } while (i3 != -1);
            return i - i;
        }
    }

    @Override // java.io.BufferedReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.lock) {
            if (!this.eof) {
                while (read() != -1) {
                }
            }
            this.eof = true;
            this.atBeginning = false;
        }
    }

    @Override // java.io.BufferedReader
    public final String readLine() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.lock) {
            while (true) {
                int i = read();
                if (i != -1) {
                    if (i == 10 && this.atBeginning) {
                        return sb.substring(0, sb.length() - 1);
                    }
                    sb.append((char) i);
                } else {
                    String string = sb.toString();
                    if (string.length() == 0) {
                        return null;
                    }
                    return string;
                }
            }
        }
    }
}
