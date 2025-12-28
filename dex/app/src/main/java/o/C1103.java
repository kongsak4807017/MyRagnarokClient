package o;

import java.nio.ByteBuffer;

/* renamed from: o.줇, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1103 extends ub {
    C1103() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws Throwable {
        this.f5008 = (short) 2757;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        int i4 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byteBuffer.get(new byte[128]);
        if (z) {
            return;
        }
        try {
            $.m1361("o.㐢").getDeclaredMethod("鷭", Integer.TYPE, byte[].class, Integer.TYPE, Short.TYPE).invoke(null, Integer.valueOf(i3), bArr, Integer.valueOf(i4), Short.valueOf(s));
        } catch (Throwable th) {
            throw th.getCause();
        }
    }
}
