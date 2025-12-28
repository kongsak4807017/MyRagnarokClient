package o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.ˈ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0304 extends ub {
    C0304() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 189;
        short s = byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        byte b3 = byteBuffer.get();
        byte b4 = byteBuffer.get();
        byte b5 = byteBuffer.get();
        byte b6 = byteBuffer.get();
        byte b7 = byteBuffer.get();
        byte b8 = byteBuffer.get();
        byte b9 = byteBuffer.get();
        byte b10 = byteBuffer.get();
        byte b11 = byteBuffer.get();
        byte b12 = byteBuffer.get();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        short s6 = byteBuffer.getShort();
        short s7 = byteBuffer.getShort();
        short s8 = byteBuffer.getShort();
        short s9 = byteBuffer.getShort();
        short s10 = byteBuffer.getShort();
        short s11 = byteBuffer.getShort();
        short s12 = byteBuffer.getShort();
        short s13 = byteBuffer.getShort();
        short s14 = byteBuffer.getShort();
        short s15 = byteBuffer.getShort();
        if (z) {
            return;
        }
        C1035 c1035 = C0358.f6664.f2004;
        c_activity c_activityVar = C0358.f6674;
        if (c1035 == null) {
            nz.m907(this + " couldn't set status: 'me' is not set yet.");
        }
        C0817.m1483(this, (short) EnumC0505.STATUSPOINT.f7206, pa.m968(s));
        C0817.m1483(this, (short) EnumC0505.STR.f7206, pa.m967(b));
        C0817.m1483(this, (short) EnumC0505.USTR.f7206, pa.m967(b2));
        C0817.m1483(this, (short) EnumC0505.AGI.f7206, pa.m967(b3));
        C0817.m1483(this, (short) EnumC0505.UAGI.f7206, pa.m967(b4));
        C0817.m1483(this, (short) EnumC0505.VIT.f7206, pa.m967(b5));
        C0817.m1483(this, (short) EnumC0505.UVIT.f7206, pa.m967(b6));
        C0817.m1483(this, (short) EnumC0505.INT.f7206, pa.m967(b7));
        C0817.m1483(this, (short) EnumC0505.UINT.f7206, pa.m967(b8));
        C0817.m1483(this, (short) EnumC0505.DEX.f7206, pa.m967(b9));
        C0817.m1483(this, (short) EnumC0505.UDEX.f7206, pa.m967(b10));
        C0817.m1483(this, (short) EnumC0505.LUK.f7206, pa.m967(b11));
        C0817.m1483(this, (short) EnumC0505.ULUK.f7206, pa.m967(b12));
        C0817.m1483(this, (short) EnumC0505.ATK1.f7206, s2);
        C0817.m1483(this, (short) EnumC0505.ATK2.f7206, s3);
        C0817.m1483(this, (short) EnumC0505.MATK1.f7206, s4);
        C0817.m1483(this, (short) EnumC0505.MATK2.f7206, s5);
        C0817.m1483(this, (short) EnumC0505.DEF1.f7206, s6);
        C0817.m1483(this, (short) EnumC0505.DEF2.f7206, s7);
        C0817.m1483(this, (short) EnumC0505.MDEF1.f7206, s8);
        C0817.m1483(this, (short) EnumC0505.MDEF2.f7206, s9);
        C0817.m1483(this, (short) EnumC0505.HIT.f7206, s10);
        C0817.m1483(this, (short) EnumC0505.FLEE1.f7206, s11);
        C0817.m1483(this, (short) EnumC0505.FLEE2.f7206, s12);
        C0817.m1483(this, (short) EnumC0505.CRITICAL.f7206, s13);
        C0817.m1483(this, (short) EnumC0505.KARMA.f7206, s14);
        C0817.m1483(this, (short) EnumC0505.MANNER.f7206, s15);
    }
}
