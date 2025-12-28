package o;

import android.support.v4.view.ViewCompat;
import java.nio.ByteBuffer;

/* renamed from: o.䒢, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0580 extends ub {
    C0580() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws NumberFormatException {
        this.f5008 = (short) 141;
        int i3 = byteBuffer.getInt();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        String strM1304 = C0358.m1304(bArr);
        if (C0358.f6664.f2004.f8616 == null) {
            C0358.f6674.f42.f1792.m1432(strM1304, ViewCompat.MEASURED_SIZE_MASK);
            md mdVarM818 = C0358.f6669.m818(i3);
            if (mdVarM818 == null) {
                return;
            }
            mdVarM818.m842(strM1304, -1);
            return;
        }
        C0358.f6674.f42.f1755.m1603(strM1304, ViewCompat.MEASURED_SIZE_MASK);
    }
}
