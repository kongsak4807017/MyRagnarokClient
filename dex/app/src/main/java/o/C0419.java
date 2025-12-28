package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.ck;
import o.ck.C0027;

/* renamed from: o.م, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0419 extends ub {
    C0419() {
    }

    /* renamed from: o.م$鷭, reason: contains not printable characters */
    class C0420 {

        /* renamed from: Ą, reason: contains not printable characters */
        short f6810;

        /* renamed from: ą, reason: contains not printable characters */
        C0421[] f6811;

        /* renamed from: ȃ, reason: contains not printable characters */
        int f6813;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f6814;

        /* renamed from: 櫯, reason: contains not printable characters */
        byte f6815;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6816;

        /* renamed from: o.م$鷭$鷭, reason: contains not printable characters */
        class C0421 {

            /* renamed from: Ą, reason: contains not printable characters */
            short f6817;

            /* renamed from: ą, reason: contains not printable characters */
            short f6818;

            /* renamed from: Ć, reason: contains not printable characters */
            short f6819;

            /* renamed from: ć, reason: contains not printable characters */
            String f6820;

            /* renamed from: ȃ, reason: contains not printable characters */
            short f6821;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            int f6822;

            /* renamed from: 櫯, reason: contains not printable characters */
            int f6824;

            /* renamed from: 鷭, reason: contains not printable characters */
            int f6825;

            C0421(ByteBuffer byteBuffer) {
                this.f6825 = byteBuffer.getInt();
                this.f6824 = byteBuffer.getInt();
                this.f6822 = byteBuffer.getInt();
                this.f6821 = byteBuffer.getShort();
                this.f6817 = byteBuffer.getShort();
                this.f6818 = byteBuffer.getShort();
                this.f6819 = byteBuffer.getShort();
                ow owVar = ow.LOCAL;
                byte[] bArr = new byte[24];
                byteBuffer.get(bArr);
                this.f6820 = pa.m978(bArr, owVar);
            }
        }

        C0420(ByteBuffer byteBuffer) {
            this.f6816 = byteBuffer.getInt();
            this.f6815 = byteBuffer.get();
            this.f6814 = byteBuffer.getInt();
            this.f6813 = byteBuffer.getInt();
            this.f6810 = byteBuffer.getShort();
            this.f6811 = new C0421[this.f6810];
            for (int i = 0; i < this.f6810; i++) {
                this.f6811[i] = new C0421(byteBuffer);
            }
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2552;
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
                C0420 c0420 = new C0420(byteBuffer2);
                pa.m974(c0420);
                ck ckVar = new ck();
                ckVar.f923 = ck.Cif.valuesCustom()[c0420.f6815];
                ckVar.f922 = c0420.f6814;
                ckVar.f921 = c0420.f6813;
                ckVar.f920 = new ck.C0027[c0420.f6810];
                for (int i5 = 0; i5 < c0420.f6810; i5++) {
                    C0420.C0421 c0421 = c0420.f6811[i5];
                    ckVar.f920[i5] = ckVar.new C0027(c0421.f6825, c0421.f6822, c0421.f6818, c0421.f6819, c0421.f6820);
                }
                C0358.f6679.f6832.put(Integer.valueOf(c0420.f6816), ckVar);
            } catch (Throwable th) {
                int iPosition2 = byteBuffer.position();
                byteBuffer.position(iPosition);
                StringBuilder sbAppend = new StringBuilder("questlist1 parse error ").append(th.getMessage()).append(". at position ").append(iPosition2 - iPosition).append(" on dump:\n");
                byte[] bArr2 = new byte[iPosition2 - iPosition];
                byteBuffer.get(bArr2);
                nz.m907(sbAppend.append(pa.m959(bArr2)).toString());
                byteBuffer.position(iPosition2);
            }
        }
        C0358.f6674.f42.f1757.m484();
    }
}
