package o;

import java.nio.ByteBuffer;
import o.C0972;
import o.C0972.C0975;

/* renamed from: o.ʓ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0275 extends ub {
    C0275() {
    }

    /* renamed from: o.ʓ$鷭, reason: contains not printable characters */
    class C0276 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        String f6590;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6591;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6592;

        C0276(ByteBuffer byteBuffer) {
            this.f6592 = byteBuffer.getInt();
            this.f6591 = byteBuffer.getInt();
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[24];
            byteBuffer.get(bArr);
            this.f6590 = pa.m978(bArr, owVar);
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 332;
        C0276[] c0276Arr = new C0276[i];
        for (int i3 = 0; i3 < c0276Arr.length; i3++) {
            c0276Arr[i3] = new C0276(byteBuffer);
        }
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        C0972 c0972 = C0358.f6664.f2004.f8635;
        c0972.f8304.clear();
        c0972.f8292.clear();
        for (C0276 c0276 : c0276Arr) {
            C0972.C0975 c0975 = c0972.new C0975(c0276.f6591, c0276.f6590);
            if (c0276.f6592 > 0) {
                c0972.f8304.add(c0975);
            } else {
                c0972.f8292.add(c0975);
            }
        }
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.f7701.mo1382();
        }
    }
}
