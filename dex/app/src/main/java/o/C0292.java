package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;
import o.C0972;

/* renamed from: o.ʯ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0292 extends ub {
    C0292() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 372;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        C0972 c0972 = C0358.f6664.f2004.f8635;
        C0972.C0973 c0973 = new C0972.C0973(strM978, (i4 & 1) > 0, (i4 & 16) > 0, i5);
        c0972.m1555(i3 + 1);
        c0972.f8302[i3] = c0973;
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.f7697.mo1382();
            C0358.f6674.f42.f1748.f7698.f8917.setAdapter((ListAdapter) new C0669());
        }
    }
}
