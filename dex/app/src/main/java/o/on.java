package o;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class on extends DataInputStream {
    public on(FileInputStream fileInputStream) {
        super(fileInputStream);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m925() throws IOException {
        int i = super.readInt();
        return ((i & 255) << 24) | ((65280 & i) << 8) | ((16711680 & i) >>> 8) | (((-16777216) & i) >>> 24);
    }
}
