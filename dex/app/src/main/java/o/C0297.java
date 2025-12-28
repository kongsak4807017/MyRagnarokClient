package o;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.util.HashMap;
import o.C0972;

/* renamed from: o.ʴ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0297 extends ub {
    C0297() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C0972.C0974 c0974;
        this.f5008 = (short) 491;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8635 != null) {
            C0972 c0972 = C0358.f6664.f2004.f8635;
            int i4 = 0;
            while (true) {
                if (i4 >= c0972.f8300.size()) {
                    c0974 = null;
                    break;
                }
                C0972.C0974 c09742 = c0972.f8300.get(i4);
                if (c09742.f8327 == i3) {
                    c0974 = c09742;
                    break;
                }
                i4++;
            }
            if (c0974 == null) {
                return;
            }
            c0974.f8318 = s;
            c0974.f8326 = s2;
        }
        if (C0358.f6669.f2063.f6881 != null) {
            if (s > 0 && s2 > 0) {
                C0539 c0539 = C0358.f6669.f2063.f6881;
                if (C0358.f6669.f2063 != null) {
                    C0413 c0413 = c0539.f7256.get(Integer.valueOf(i3));
                    if (c0413 == null) {
                        c0413 = new C0413(c0539);
                        c0539.f7256 = (HashMap) c0539.f7256.clone();
                        c0539.f7256.put(Integer.valueOf(i3), c0413);
                    }
                    c0413.m1469(new Point(s, s2));
                    return;
                }
                return;
            }
            C0539 c05392 = C0358.f6669.f2063.f6881;
            c05392.f7256 = (HashMap) c05392.f7256.clone();
            c05392.f7256.remove(Integer.valueOf(i3));
        }
    }
}
