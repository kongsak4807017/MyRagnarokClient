package o;

import android.support.v4.view.InputDeviceCompat;
import java.nio.ByteBuffer;

/* renamed from: o.䑦, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0573 extends ub {
    C0573() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 154;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        C0358.f6674.f42.m732(pa.m978(bArr, ow.LOCAL), InputDeviceCompat.SOURCE_ANY);
    }
}
