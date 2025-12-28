package o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.㷵, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0545 extends ya implements vf {
    C0545() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        oj ojVar = new oj();
        ojVar.f3335 = (byte) -1;
        ojVar.f3332 = this.f5895;
        ojVar.f3315 = this.f5885;
        ojVar.f3301 = this.f5877;
        ojVar.f3302 = this.f5878;
        ojVar.f3303 = this.f5879;
        ojVar.f3319 = this.f5880;
        ojVar.f3328 = this.f5887;
        ojVar.f3305 = this.f5891;
        ojVar.f3304 = this.f5886;
        ojVar.f3316 = this.f5881;
        ojVar.f3333 = this.f5893;
        ojVar.f3326 = this.f5890;
        ojVar.f3319 = this.f5894;
        ojVar.f3320 = this.f5888;
        ojVar.f3329 = this.f5892;
        ojVar.f3309 = this.f5882;
        ojVar.f3310 = this.f5883;
        bm bmVar = new bm(ByteBuffer.wrap(this.f5884));
        ojVar.f3311 = new Point((short) (((bmVar.f846[0] & 255) << 2) | ((bmVar.f846[1] & 255) >> 6)), (short) ((((bmVar.f846[1] & 255) & 63) << 4) | ((bmVar.f846[2] & 255) >> 4)));
        ojVar.f3330 = this.f5896;
        ojVar.f3327 = this.f5889;
        C0508.m1357(ojVar);
    }
}
