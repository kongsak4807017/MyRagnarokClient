package o;

import java.nio.ByteBuffer;
import o.C0972;
import o.C0972.C0974;

/* renamed from: o.矆, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0812 extends ub {
    C0812() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 340;
        C0954[] c0954Arr = new C0954[i];
        for (int i3 = 0; i3 < c0954Arr.length; i3++) {
            C0954 c0954 = new C0954();
            c0954.f8264 = byteBuffer.getInt();
            c0954.f8262 = byteBuffer.getInt();
            c0954.f8259 = byteBuffer.getShort();
            c0954.f8257 = byteBuffer.getShort();
            c0954.f8252 = byteBuffer.getShort();
            c0954.f8253 = byteBuffer.getShort();
            c0954.f8254 = byteBuffer.getShort();
            c0954.f8255 = byteBuffer.getInt();
            c0954.f8260 = byteBuffer.getInt();
            c0954.f8261 = byteBuffer.getInt();
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[50];
            byteBuffer.get(bArr);
            c0954.f8258 = pa.m978(bArr, owVar);
            ow owVar2 = ow.LOCAL;
            byte[] bArr2 = new byte[24];
            byteBuffer.get(bArr2);
            c0954.f8256 = pa.m978(bArr2, owVar2);
            c0954Arr[i3] = c0954;
        }
        if (z) {
            return;
        }
        m1481(c0954Arr);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1481(C0954[] c0954Arr) {
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        C0972 c0972 = C0358.f6664.f2004.f8635;
        c0972.f8300.clear();
        for (C0954 c0954 : c0954Arr) {
            C0972.C0974 c0974 = c0972.new C0974();
            c0972.f8300.add(c0974);
            c0974.f8327 = c0954.f8264;
            c0974.f8325 = c0954.f8262;
            c0974.f8321 = c0954.f8259;
            c0974.f8319 = c0954.f8257;
            c0974.f8314 = (byte) c0954.f8252;
            c0974.f8315 = c0954.f8253;
            c0974.f8316 = c0954.f8254;
            c0974.f8317 = c0954.f8255;
            c0974.f8322 = c0954.f8260 != 0;
            c0974.f8324 = c0954.f8261;
            c0974.f8320 = c0954.f8256;
            if (c0974.f8320 == null) {
                c0974.f8320 = C0358.f6679.f6830.get(Integer.valueOf(c0974.f8325));
                if (c0974.f8320 == null) {
                    C0358.f6671.mo454(new C0201(c0974.f8325));
                }
            }
        }
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.f7697.mo1382();
        }
    }
}
