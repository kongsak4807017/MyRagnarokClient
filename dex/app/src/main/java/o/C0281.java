package o;

import java.nio.ByteBuffer;

/* renamed from: o.ʚ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0281 extends ub {
    C0281() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 438;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        int i9 = byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        ow owVar2 = ow.LOCAL;
        byte[] bArr2 = new byte[24];
        byteBuffer.get(bArr2);
        String strM9782 = pa.m978(bArr2, owVar2);
        ow owVar3 = ow.LOCAL;
        byte[] bArr3 = new byte[20];
        byteBuffer.get(bArr3);
        String strM9783 = pa.m978(bArr3, owVar3);
        if (z) {
            return;
        }
        m1276(i3, i4, i5, i6, i7, i8, i9, i10, strM978, strM9782, strM9783, 0, 0);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1276(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, int i9, int i10) {
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        C1035 c1035 = C0358.f6664.f2004;
        C0972 c0972 = c1035.f8635;
        c1035.f8348 = i;
        c0972.f8297 = i2;
        c0972.f8295 = i3;
        c0972.f8288 = i4;
        c0972.f8289 = i5;
        c0972.f8290 = i6;
        c0972.f8291 = i7;
        c1035.f8349 = i8;
        c1035.f8369 = str;
        if (str2 != null) {
            c0972.f8306 = str2;
        }
        c0972.f8303 = str3;
        c0972.f8298 = i9;
        c0972.f8301 = i10;
        if (c0972.f8301 > 0 && c0972.f8306 == null) {
            c0972.f8306 = C0358.f6679.f6830.get(Integer.valueOf(c0972.f8301));
            if (c0972.f8306 == null) {
                C0358.f6671.mo454(new C0201(c0972.f8301));
            }
        }
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.m1438();
        }
    }
}
