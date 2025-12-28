package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.ck;
import o.ck.C0027;

/* renamed from: o.ˮ͔, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0367 extends ub {
    C0367() {
    }

    /* renamed from: o.ˮ͔$鷭, reason: contains not printable characters */
    class C0368 {

        /* renamed from: Ą, reason: contains not printable characters */
        short f6720;

        /* renamed from: ą, reason: contains not printable characters */
        C0369[] f6721;

        /* renamed from: ȃ, reason: contains not printable characters */
        int f6723;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f6724;

        /* renamed from: 櫯, reason: contains not printable characters */
        byte f6725;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6726;

        /* renamed from: o.ˮ͔$鷭$鷭, reason: contains not printable characters */
        class C0369 {

            /* renamed from: ȃ, reason: contains not printable characters */
            String f6728;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            short f6729;

            /* renamed from: 櫯, reason: contains not printable characters */
            short f6730;

            /* renamed from: 鷭, reason: contains not printable characters */
            int f6731;

            C0369(ByteBuffer byteBuffer) {
                this.f6731 = byteBuffer.getInt();
                this.f6730 = byteBuffer.getShort();
                this.f6729 = byteBuffer.getShort();
                ow owVar = ow.LOCAL;
                byte[] bArr = new byte[24];
                byteBuffer.get(bArr);
                this.f6728 = pa.m978(bArr, owVar);
            }
        }

        C0368(ByteBuffer byteBuffer) {
            this.f6726 = byteBuffer.getInt();
            this.f6725 = byteBuffer.get();
            this.f6724 = byteBuffer.getInt();
            this.f6723 = byteBuffer.getInt();
            this.f6720 = byteBuffer.getShort();
            this.f6721 = new C0369[this.f6720];
            for (int i = 0; i < this.f6720; i++) {
                this.f6721[i] = new C0369(byteBuffer);
            }
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2426;
        int iPosition = byteBuffer.position();
        int i3 = byteBuffer.getShort();
        byteBuffer.getShort();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).position(0);
        for (int i4 = 0; i4 < i3; i4++) {
            try {
                C0368 c0368 = new C0368(byteBuffer2);
                ck ckVar = new ck();
                ckVar.f923 = ck.Cif.valuesCustom()[c0368.f6725];
                ckVar.f922 = c0368.f6724;
                ckVar.f921 = c0368.f6723;
                ckVar.f920 = new ck.C0027[c0368.f6720];
                for (int i5 = 0; i5 < c0368.f6720; i5++) {
                    C0368.C0369 c0369 = c0368.f6721[i5];
                    ckVar.f920[i5] = ckVar.new C0027(0, c0369.f6731, c0369.f6730, c0369.f6729, c0369.f6728);
                }
                C0358.f6679.f6832.put(Integer.valueOf(c0368.f6726), ckVar);
            } catch (Throwable unused) {
                int iPosition2 = byteBuffer.position();
                byteBuffer.position(iPosition);
                StringBuilder sb = new StringBuilder("questlist1 ");
                byte[] bArr2 = new byte[iPosition2 - iPosition];
                byteBuffer.get(bArr2);
                nz.m907(sb.append(pa.m959(bArr2)).toString());
                byteBuffer.position(iPosition2);
            }
        }
        C0358.f6674.f42.f1757.m484();
    }
}
