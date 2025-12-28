package o;

import java.nio.ByteBuffer;
import o.ck;
import o.ck.C0027;

/* renamed from: o.ᆇ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0463 extends ub {
    C0463() {
    }

    /* renamed from: o.ᆇ$鷭, reason: contains not printable characters */
    class C0464 {

        /* renamed from: Ą, reason: contains not printable characters */
        short f6915;

        /* renamed from: ą, reason: contains not printable characters */
        short f6916;

        /* renamed from: Ć, reason: contains not printable characters */
        String f6917;

        /* renamed from: ȃ, reason: contains not printable characters */
        short f6919;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f6920;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6921;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6922;

        C0464(ByteBuffer byteBuffer) {
            this.f6922 = byteBuffer.getInt();
            this.f6921 = byteBuffer.getInt();
            this.f6920 = byteBuffer.getInt();
            this.f6919 = byteBuffer.getShort();
            this.f6915 = byteBuffer.getShort();
            this.f6916 = byteBuffer.getShort();
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[24];
            byteBuffer.get(bArr);
            this.f6917 = pa.m978(bArr, owVar);
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2553;
        int i3 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getShort();
        C0464[] c0464Arr = new C0464[3];
        for (int i7 = 0; i7 < c0464Arr.length; i7++) {
            c0464Arr[i7] = new C0464(byteBuffer);
        }
        if (z) {
            return;
        }
        if (i6 > 3) {
            nz.m907("PKT_MC_QUESTADD_0x9f9: nobjectives " + i6 + " > Const.MAX_QUEST_OBJECTIVES 3!!!!");
            i6 = 3;
        }
        ck ckVar = new ck();
        ckVar.f923 = ck.Cif.valuesCustom()[b];
        ckVar.f922 = i4;
        ckVar.f921 = i5;
        ckVar.f920 = new ck.C0027[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            C0464 c0464 = c0464Arr[i8];
            ckVar.f920[i8] = ckVar.new C0027(c0464.f6922, c0464.f6920, 0, c0464.f6916, c0464.f6917);
        }
        C0358.f6679.f6832.put(Integer.valueOf(i3), ckVar);
        C0358.f6674.f42.f1757.m484();
    }
}
