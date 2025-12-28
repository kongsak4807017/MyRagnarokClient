package org.apache.commons.net.io;

import java.io.BufferedReader;
import java.io.Reader;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class CRLFLineReader extends BufferedReader {
    private static final char CR = '\r';
    private static final char LF = '\n';

    public CRLFLineReader(Reader reader) {
        super(reader);
    }

    @Override // java.io.BufferedReader
    public final String readLine() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        synchronized (this.lock) {
            while (true) {
                int i = read();
                if (i != -1) {
                    if (z && i == 10) {
                        return sb.substring(0, sb.length() - 1);
                    }
                    if (i == 13) {
                        z = true;
                    } else {
                        z = false;
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
