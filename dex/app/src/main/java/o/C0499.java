package o;

import android.graphics.Point;
import java.nio.ByteBuffer;

/* renamed from: o.か, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0499 extends ub {
    C0499() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2559;
        oj ojVar = new oj();
        ojVar.f3335 = byteBuffer.get();
        ojVar.f3332 = byteBuffer.getInt();
        ojVar.f3318 = byteBuffer.getInt();
        ojVar.f3315 = byteBuffer.getShort();
        ojVar.f3301 = byteBuffer.getShort();
        ojVar.f3302 = byteBuffer.getShort();
        ojVar.f3303 = byteBuffer.getInt();
        ojVar.f3304 = byteBuffer.getShort();
        ojVar.f3319 = byteBuffer.getShort();
        ojVar.f3328 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        ojVar.f3316 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        ojVar.f3305 = byteBuffer.getShort();
        ojVar.f3333 = byteBuffer.getShort();
        ojVar.f3326 = byteBuffer.getShort();
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
        bm bmVar = new bm(byteBuffer);
        ojVar.f3311 = new Point((short) (((bmVar.f846[0] & 255) << 2) | ((bmVar.f846[1] & 255) >> 6)), (short) ((((bmVar.f846[1] & 255) & 63) << 4) | ((bmVar.f846[2] & 255) >> 4)));
        ojVar.f3312 = (short) (bmVar.f846[2] & 15);
        ojVar.f3330 = byteBuffer.get();
        ojVar.f3327 = byteBuffer.get();
        ojVar.f3322 = byteBuffer.get();
        ojVar.f3331 = byteBuffer.getShort();
        ojVar.f3325 = byteBuffer.getShort();
        ojVar.f3317 = byteBuffer.getInt();
        ojVar.f3313 = byteBuffer.getInt();
        ojVar.f3321 = byteBuffer.get();
        ojVar.f3314 = byteBuffer.getShort();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        ojVar.f3324 = bArr;
        if (z) {
            return;
        }
        m1354(ojVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1354(oj ojVar) {
        ln lnVar = C0358.f6664;
        lm lmVar = lnVar.f2005.get(ojVar.f3332);
        if (lmVar == null) {
            lm.m775(ojVar);
            C0358 c0358 = C0358.f6688;
            C0358.m1308(lm.m775(ojVar));
        } else {
            lmVar.mo460(ojVar);
            mj mjVar = C0358.f6669.f2048.f1545.get(Integer.valueOf(ojVar.f3332));
            if (mjVar != null) {
                mjVar.m860();
            }
        }
    }
}
