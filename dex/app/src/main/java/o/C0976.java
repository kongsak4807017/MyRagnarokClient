package o;

import java.nio.ByteBuffer;
import o.aq;
import o.aq.C0023;

/* renamed from: o.ꇈ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0976 extends ub {
    C0976() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 251;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        C0340[] c0340Arr = new C0340[i];
        for (int i3 = 0; i3 < c0340Arr.length; i3++) {
            C0340 c0340 = new C0340();
            c0340.f6655 = byteBuffer.getInt();
            byteBuffer.get(c0340.f6653);
            byteBuffer.get(c0340.f6652);
            c0340.f6648 = byteBuffer.get();
            c0340.f6649 = byteBuffer.get();
            c0340Arr[i3] = c0340;
        }
        if (z) {
            return;
        }
        m1556(strM978, c0340Arr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1556(String str, C0340[] c0340Arr) {
        if (C0358.f6664.f2004.f8596 == null) {
            C0358.f6664.f2004.f8596 = new aq();
        }
        C0358.f6664.f2004.f8596.f688 = str;
        C0358.f6664.f2004.f8596.f684 = new aq.C0023[c0340Arr.length];
        for (int i = 0; i < c0340Arr.length; i++) {
            C0358.f6664.f2004.f8596.f684[i] = C0358.f6664.f2004.f8596.new C0023();
            C0358.f6664.f2004.f8596.f684[i].m437(c0340Arr[i].f6655, pa.m978(c0340Arr[i].f6653, ow.LOCAL), pa.m978(c0340Arr[i].f6652, ow.KOREAN), c0340Arr[i].f6648, c0340Arr[i].f6649);
        }
        if (C0358.f6674.f42.f1746.f1994.getParent() != null) {
            C0358.f6674.f42.f1746.m444();
        }
    }
}
