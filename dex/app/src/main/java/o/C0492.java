package o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.K, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0492 extends xz implements vf {
    C0492() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        oj ojVar = new oj();
        ojVar.f3335 = (byte) -1;
        ojVar.f3332 = this.f5855;
        ojVar.f3315 = this.f5846;
        ojVar.f3301 = this.f5847;
        ojVar.f3302 = this.f5848;
        ojVar.f3303 = this.f5849;
        ojVar.f3319 = this.f5857;
        ojVar.f3328 = this.f5861;
        ojVar.f3305 = this.f5856;
        ojVar.f3304 = this.f5850;
        ojVar.f3316 = this.f5863;
        ojVar.f3333 = this.f5860;
        ojVar.f3326 = this.f5864;
        ojVar.f3319 = this.f5858;
        ojVar.f3320 = this.f5862;
        ojVar.f3329 = this.f5851;
        ojVar.f3309 = this.f5852;
        ojVar.f3310 = this.f5853;
        bm bmVar = new bm(ByteBuffer.wrap(this.f5866));
        ojVar.f3311 = new Point((short) (((bmVar.f846[0] & 255) << 2) | ((bmVar.f846[1] & 255) >> 6)), (short) ((((bmVar.f846[1] & 255) & 63) << 4) | ((bmVar.f846[2] & 255) >> 4)));
        ojVar.f3330 = this.f5859;
        ojVar.f3327 = this.f5854;
        C0508.m1357(ojVar);
    }
}
