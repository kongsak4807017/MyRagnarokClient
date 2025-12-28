package o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.㖬, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0522 extends xv implements vf {
    C0522() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        oj ojVar = new oj();
        ojVar.f3335 = (byte) -1;
        ojVar.f3332 = this.f5784;
        ojVar.f3318 = this.f5784;
        ojVar.f3315 = this.f5773;
        ojVar.f3301 = this.f5761;
        ojVar.f3302 = this.f5762;
        ojVar.f3303 = this.f5763;
        ojVar.f3304 = this.f5764;
        ojVar.f3319 = this.f5775;
        ojVar.f3328 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5779).getShort(0);
        ojVar.f3316 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5779).getShort(2);
        ojVar.f3305 = this.f5774;
        int i = this.f5765;
        ojVar.f3333 = this.f5782;
        ojVar.f3326 = this.f5778;
        ojVar.f3334 = this.f5783;
        ojVar.f3320 = this.f5776;
        ojVar.f3329 = this.f5780;
        ojVar.f3307 = this.f5766;
        ojVar.f3308 = this.f5767;
        ojVar.f3336 = this.f5768;
        ojVar.f3323 = this.f5785;
        ojVar.f3309 = this.f5777;
        ojVar.f3310 = this.f5769;
        bn bnVar = new bn(ByteBuffer.wrap(this.f5770));
        ojVar.f3311 = new Point((short) (((bnVar.f847[0] & 255) << 2) | ((bnVar.f847[1] & 255) >> 6)), bnVar.m466());
        ojVar.f3330 = this.f5771;
        ojVar.f3327 = this.f5772;
        ojVar.f3331 = this.f5781;
        C1153.m1653(ojVar, i, bnVar);
    }
}
