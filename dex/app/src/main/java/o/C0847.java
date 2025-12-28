package o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.茢, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0847 extends ub {
    C0847() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 120;
        oj ojVar = new oj();
        if (C0358.f6667.f4800 >= 20071106) {
            ojVar.f3335 = byteBuffer.get();
        }
        ojVar.f3335 = (byte) -1;
        ojVar.f3332 = byteBuffer.getInt();
        ojVar.f3315 = byteBuffer.getShort();
        ojVar.f3301 = byteBuffer.getShort();
        ojVar.f3302 = byteBuffer.getShort();
        ojVar.f3303 = byteBuffer.getShort();
        ojVar.f3304 = byteBuffer.getShort();
        ojVar.f3319 = byteBuffer.getShort();
        ojVar.f3328 = byteBuffer.getShort();
        ojVar.f3333 = byteBuffer.getShort();
        ojVar.f3316 = byteBuffer.getShort();
        ojVar.f3326 = byteBuffer.getShort();
        ojVar.f3305 = byteBuffer.getShort();
        ojVar.f3334 = byteBuffer.getShort();
        ojVar.f3320 = byteBuffer.getShort();
        ojVar.f3329 = byteBuffer.getShort();
        ojVar.f3307 = byteBuffer.getInt();
        ojVar.f3308 = byteBuffer.getShort();
        ojVar.f3336 = byteBuffer.getShort();
        ojVar.f3323 = byteBuffer.getShort();
        ojVar.f3309 = byteBuffer.get();
        ojVar.f3310 = byteBuffer.get();
        bm bmVar = new bm(byteBuffer);
        ojVar.f3311 = new Point((short) (((bmVar.f846[0] & 255) << 2) | ((bmVar.f846[1] & 255) >> 6)), (short) ((((bmVar.f846[1] & 255) & 63) << 4) | ((bmVar.f846[2] & 255) >> 4)));
        ojVar.f3312 = (short) (bmVar.f846[2] & 15);
        ojVar.f3330 = byteBuffer.get();
        ojVar.f3327 = byteBuffer.get();
        ojVar.f3322 = byteBuffer.get();
        ojVar.f3331 = byteBuffer.getShort();
        if (z) {
            return;
        }
        C0499.m1354(ojVar);
    }
}
