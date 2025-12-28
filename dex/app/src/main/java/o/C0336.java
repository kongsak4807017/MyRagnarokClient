package o;

import android.support.v4.view.MotionEventCompat;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̧, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0336 extends ub {
    C0336() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws NumberFormatException {
        this.f5008 = (short) 142;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z || C0358.f6664 == null || C0358.f6664.f2004 == null) {
            return;
        }
        String strM1304 = C0358.m1304(bArr);
        if (C0358.f6664.f2004.f8616 == null) {
            C0358.f6674.f42.f1792.m1432(strM1304, MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            C0358.f6669.f2048.f1551.m842(strM1304, -1);
        } else {
            C0358.f6674.f42.f1755.m1603(strM1304, MotionEventCompat.ACTION_POINTER_INDEX_MASK);
        }
    }
}
