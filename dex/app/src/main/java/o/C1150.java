package o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.흀, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1150 extends xu implements vf {
    C1150() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        oj ojVar = new oj();
        ojVar.f3335 = (byte) -1;
        ojVar.f3332 = this.f5747;
        ojVar.f3318 = this.f5747;
        ojVar.f3315 = this.f5735;
        ojVar.f3301 = this.f5736;
        ojVar.f3302 = this.f5737;
        ojVar.f3303 = this.f5738;
        ojVar.f3304 = this.f5749;
        ojVar.f3319 = this.f5754;
        ojVar.f3328 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5748).getShort(0);
        ojVar.f3316 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5748).getShort(2);
        ojVar.f3305 = this.f5739;
        int i = this.f5757;
        ojVar.f3333 = this.f5752;
        ojVar.f3326 = this.f5758;
        ojVar.f3334 = this.f5750;
        ojVar.f3320 = this.f5755;
        ojVar.f3329 = this.f5740;
        ojVar.f3307 = this.f5741;
        ojVar.f3308 = this.f5742;
        ojVar.f3336 = this.f5760;
        ojVar.f3323 = this.f5751;
        ojVar.f3309 = this.f5743;
        ojVar.f3310 = this.f5744;
        bn bnVar = new bn(ByteBuffer.wrap(this.f5745));
        ojVar.f3311 = new Point((short) (((bnVar.f847[0] & 255) << 2) | ((bnVar.f847[1] & 255) >> 6)), bnVar.m466());
        ojVar.f3330 = this.f5746;
        ojVar.f3327 = this.f5756;
        ojVar.f3331 = this.f5753;
        C1153.m1653(ojVar, i, bnVar);
    }
}
