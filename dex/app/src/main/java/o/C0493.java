package o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.Ⅴ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0493 extends xs implements vf {
    C0493() {
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        oj ojVar = new oj();
        ojVar.f3335 = (byte) -1;
        ojVar.f3332 = this.f5699;
        ojVar.f3318 = this.f5699;
        ojVar.f3315 = this.f5688;
        ojVar.f3301 = this.f5676;
        ojVar.f3302 = this.f5677;
        ojVar.f3303 = this.f5678;
        ojVar.f3304 = this.f5679;
        ojVar.f3319 = this.f5690;
        ojVar.f3328 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5694).getShort(0);
        ojVar.f3316 = ByteBuffer.wrap(new byte[4]).order(ByteOrder.LITTLE_ENDIAN).putInt(this.f5694).getShort(2);
        ojVar.f3305 = this.f5689;
        ojVar.f3333 = this.f5680;
        ojVar.f3326 = this.f5697;
        ojVar.f3334 = this.f5693;
        ojVar.f3320 = this.f5698;
        ojVar.f3329 = this.f5691;
        ojVar.f3307 = this.f5695;
        ojVar.f3308 = this.f5681;
        ojVar.f3336 = this.f5682;
        ojVar.f3323 = this.f5683;
        ojVar.f3309 = this.f5700;
        ojVar.f3310 = this.f5692;
        bm bmVar = new bm(ByteBuffer.wrap(this.f5684));
        ojVar.f3311 = new Point((short) (((bmVar.f846[0] & 255) << 2) | ((bmVar.f846[1] & 255) >> 6)), (short) ((((bmVar.f846[1] & 255) & 63) << 4) | ((bmVar.f846[2] & 255) >> 4)));
        ojVar.f3312 = (short) (bmVar.f846[2] & 15);
        ojVar.f3330 = this.f5685;
        ojVar.f3327 = this.f5686;
        ojVar.f3322 = this.f5687;
        ojVar.f3331 = this.f5696;
        C0499.m1354(ojVar);
    }
}
