package o;

import java.nio.ByteBuffer;

/* renamed from: o.扜, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0719 extends ub {
    C0719() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 151;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        int i3 = C0358.f6667.f4811 ? byteBuffer.getInt() : 0;
        byte[] bArr2 = new byte[i];
        byteBuffer.get(bArr2);
        if (z) {
            return;
        }
        m1436(bArr, bArr2, (byte) i3);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1436(byte[] bArr, byte[] bArr2, byte b) {
        bh bhVarM779;
        md mdVarM818;
        String strM978 = pa.m978(bArr, ow.LOCAL);
        String str = "( From " + strM978 + " ) : " + C0358.m1304(bArr2);
        C0358.f6674.f42.f1792.m1431(strM978);
        C0358.f6674.f42.f1792.m1432(str, 16776960);
        if (b > 0 && (bhVarM779 = C0358.f6664.m779(strM978)) != null && (mdVarM818 = C0358.f6669.m818(bhVarM779.f1998)) != null) {
            mdVarM818.m842(str, -1);
        }
    }
}
