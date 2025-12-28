package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ȫ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0237 extends ub {
    C0237() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws Throwable {
        this.f5008 = (short) 146;
        ow owVar = ow.KOREAN;
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        byteBuffer.getShort();
        byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        if (z) {
            return;
        }
        m1264(strM978, i3, s);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1264(String str, int i, short s) throws Throwable {
        if (str.endsWith(".gat")) {
            str = str.substring(0, str.length() - 4);
        }
        C0358.f6664.f2004.f8353 = null;
        C0358.f6664.f2004.f8366 = null;
        C0358.f6664.f2004.f8354 = null;
        C0358.f6688.f6693.f6707 = String.valueOf(i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
        C0358.f6688.f6693.f6708 = str;
        C0358.f6688.f6693.f6706 = s;
        C0358.m1292();
    }
}
