package o;

import android.support.v4.view.ViewCompat;
import java.nio.ByteBuffer;

/* renamed from: o.䓆, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0584 extends ub {
    C0584() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2066;
        short s = byteBuffer.getShort();
        byteBuffer.getInt();
        if (z) {
            return;
        }
        ls lsVar = C0358.f6674.f42.f1750;
        switch (s) {
            case 1:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(1742);
                c0698.m1432(strM649 == null ? "MSG1742" : strM649, ViewCompat.MEASURED_SIZE_MASK);
                break;
            case 2:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(1743);
                c06982.m1432(strM6492 == null ? "MSG1743" : strM6492, ViewCompat.MEASURED_SIZE_MASK);
                break;
            case 8:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(1744);
                c06983.m1432(strM6493 == null ? "MSG1744" : strM6493, ViewCompat.MEASURED_SIZE_MASK);
                break;
        }
        lsVar.mo443();
    }
}
