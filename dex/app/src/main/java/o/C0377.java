package o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.Σ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0377 extends ub {
    C0377() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2134;
        oj ojVar = new oj();
        ojVar.f3335 = byteBuffer.get();
        ojVar.f3332 = byteBuffer.getInt();
        ojVar.f3315 = byteBuffer.getShort();
        ojVar.f3301 = byteBuffer.getShort();
        ojVar.f3302 = byteBuffer.getShort();
        ojVar.f3303 = byteBuffer.getInt();
        ojVar.f3304 = byteBuffer.getShort();
        ojVar.f3319 = byteBuffer.getShort();
        ojVar.f3328 = byteBuffer.getShort();
        ojVar.f3316 = byteBuffer.getShort();
        ojVar.f3333 = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        ojVar.f3326 = byteBuffer.getShort();
        ojVar.f3305 = byteBuffer.getShort();
        ojVar.f3334 = byteBuffer.getShort();
        ojVar.f3320 = byteBuffer.getShort();
        ojVar.f3329 = byteBuffer.getShort();
        ojVar.f3306 = C0358.f6667.f4777 ? byteBuffer.getShort() : (short) 0;
        ojVar.f3307 = byteBuffer.getInt();
        ojVar.f3308 = byteBuffer.getShort();
        ojVar.f3336 = byteBuffer.getShort();
        ojVar.f3323 = byteBuffer.getInt();
        ojVar.f3309 = byteBuffer.get();
        ojVar.f3310 = byteBuffer.get();
        bn bnVar = new bn(byteBuffer);
        ojVar.f3311 = new Point((short) (((bnVar.f847[0] & 255) << 2) | ((bnVar.f847[1] & 255) >> 6)), bnVar.m466());
        ojVar.f3330 = byteBuffer.get();
        ojVar.f3327 = byteBuffer.get();
        ojVar.f3331 = byteBuffer.getShort();
        ojVar.f3325 = byteBuffer.getShort();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        ojVar.f3324 = bArr;
        if (z) {
            return;
        }
        C1153.m1653(ojVar, i3, bnVar);
    }
}
