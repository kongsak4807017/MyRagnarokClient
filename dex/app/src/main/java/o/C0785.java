package o;

import java.nio.ByteBuffer;

/* renamed from: o.烤, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0785 extends ub {
    C0785() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 388;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        if (z || C0358.f6664.f2004.f8635 == null) {
            return;
        }
        if (i4 == 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= C0358.f6664.f2004.f8635.f8292.size()) {
                    break;
                }
                if (C0358.f6664.f2004.f8635.f8292.get(i5).f8330 != i3) {
                    i5++;
                } else {
                    C0358.f6664.f2004.f8635.f8292.remove(i5);
                    break;
                }
            }
        } else {
            int i6 = 0;
            while (true) {
                if (i6 >= C0358.f6664.f2004.f8635.f8304.size()) {
                    break;
                }
                if (C0358.f6664.f2004.f8635.f8304.get(i6).f8330 != i3) {
                    i6++;
                } else {
                    C0358.f6664.f2004.f8635.f8304.remove(i6);
                    break;
                }
            }
        }
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.f7701.mo1382();
        }
    }
}
