package o;

import android.support.v4.view.ViewCompat;
import java.nio.ByteBuffer;

/* renamed from: o.ʂ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0264 extends ub {
    C0264() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2074;
        short s = byteBuffer.getShort();
        if (z) {
            return;
        }
        ls lsVar = C0358.f6674.f42.f1750;
        switch (s) {
            case 3:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(1744);
                c0698.m1432(strM649 == null ? "MSG1744" : strM649, ViewCompat.MEASURED_SIZE_MASK);
                break;
            case 4:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(1745);
                c06982.m1432(strM6492 == null ? "MSG1745" : strM6492, ViewCompat.MEASURED_SIZE_MASK);
                break;
        }
        C0358.f6671.mo454(new C0179());
        lsVar.m797(lsVar.f2025.getCount());
        lsVar.f2022 = false;
    }
}
