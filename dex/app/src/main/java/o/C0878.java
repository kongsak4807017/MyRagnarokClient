package o;

import java.nio.ByteBuffer;
import java.util.HashMap;
import o.ck;
import o.ck.C0027;

/* renamed from: o.鄢, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0878 extends ub {
    C0878() {
    }

    /* renamed from: o.鄢$鷭, reason: contains not printable characters */
    class C0879 {

        /* renamed from: Ą, reason: contains not printable characters */
        C0140[] f8047 = new C0140[3];

        /* renamed from: ȃ, reason: contains not printable characters */
        short f8049;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f8050;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8051;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8052;

        C0879(ByteBuffer byteBuffer) {
            this.f8052 = byteBuffer.getInt();
            this.f8051 = byteBuffer.getInt();
            this.f8050 = byteBuffer.getInt();
            this.f8049 = byteBuffer.getShort();
            for (int i = 0; i < this.f8047.length; i++) {
                this.f8047[i] = new C0140(byteBuffer);
            }
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 690;
        int i3 = byteBuffer.getInt();
        C0879[] c0879Arr = new C0879[i];
        for (int i4 = 0; i4 < i; i4++) {
            c0879Arr[i4] = new C0879(byteBuffer);
        }
        if (z) {
            return;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C0879 c0879 = c0879Arr[i5];
            ck ckVar = C0358.f6679.f6832.get(Integer.valueOf(c0879.f8052));
            if (ckVar == null) {
                HashMap<Integer, ck> map = C0358.f6679.f6832;
                Integer numValueOf = Integer.valueOf(c0879.f8052);
                ckVar = new ck();
                map.put(numValueOf, ckVar);
                ckVar.f923 = ck.Cif.ACTIVE;
            }
            ckVar.f922 = c0879.f8051;
            ckVar.f921 = c0879.f8050;
            ckVar.f920 = new ck.C0027[c0879.f8049];
            for (int i6 = 0; i6 < c0879.f8049; i6++) {
                C0140 c0140 = c0879Arr[i5].f8047[i6];
                ckVar.f920[i6] = ckVar.new C0027(0, c0140.f6507, 0, c0140.f6506, c0140.f6505);
            }
        }
        C0358.f6674.f42.f1757.m484();
    }
}
