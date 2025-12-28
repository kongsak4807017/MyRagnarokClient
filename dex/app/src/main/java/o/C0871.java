package o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.輞, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0871 extends xy implements vf {
    C0871() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        oj ojVar = new oj();
        ojVar.f3335 = (byte) -1;
        ojVar.f3332 = this.f5844;
        ojVar.f3318 = this.f5844;
        ojVar.f3315 = this.f5834;
        ojVar.f3301 = this.f5822;
        ojVar.f3302 = this.f5823;
        ojVar.f3303 = this.f5824;
        ojVar.f3304 = this.f5825;
        ojVar.f3319 = this.f5836;
        ojVar.f3328 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5840).getShort(0);
        ojVar.f3316 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5840).getShort(2);
        ojVar.f3305 = this.f5835;
        ojVar.f3333 = this.f5826;
        ojVar.f3326 = this.f5842;
        ojVar.f3334 = this.f5839;
        ojVar.f3320 = this.f5843;
        ojVar.f3329 = this.f5837;
        ojVar.f3307 = this.f5841;
        ojVar.f3308 = this.f5827;
        ojVar.f3336 = this.f5828;
        ojVar.f3323 = this.f5829;
        ojVar.f3309 = this.f5845;
        ojVar.f3310 = this.f5838;
        bm bmVar = new bm(ByteBuffer.wrap(this.f5830));
        ojVar.f3311 = new Point((short) (((bmVar.f846[0] & 255) << 2) | ((bmVar.f846[1] & 255) >> 6)), (short) ((((bmVar.f846[1] & 255) & 63) << 4) | ((bmVar.f846[2] & 255) >> 4)));
        ojVar.f3312 = (short) (bmVar.f846[2] & 15);
        ojVar.f3330 = this.f5831;
        ojVar.f3327 = this.f5832;
        ojVar.f3331 = this.f5833;
        C0508.m1357(ojVar);
    }
}
