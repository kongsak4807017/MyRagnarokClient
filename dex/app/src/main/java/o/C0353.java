package o;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: o.ˮ̀, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0353 extends ub {
    C0353() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 263;
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        if (z || C0358.f6664.f2004.f8596 == null) {
            return;
        }
        aq aqVar = C0358.f6664.f2004.f8596;
        int i4 = 0;
        while (true) {
            if (i4 >= aqVar.f684.length) {
                break;
            }
            if (aqVar.f684[i4] != null && aqVar.f684[i4].f696 == i3) {
                aqVar.f684[i4].f690 = s;
                aqVar.f684[i4].f691 = s2;
                break;
            }
            i4++;
        }
        if (C0358.f6669.f2063.f6881 != null) {
            if (s > 0 && s2 > 0) {
                C0358.f6669.f2063.f6881.m1369(i3, s, s2, C0358.f6664.f2004.f8596.m436(i3));
                return;
            }
            C0539 c0539 = C0358.f6669.f2063.f6881;
            c0539.f7255 = (HashMap) c0539.f7255.clone();
            c0539.f7255.remove(Integer.valueOf(i3));
        }
    }
}
