package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o.hj;

/* renamed from: o.놟, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1011 extends ub {
    C1011() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 461;
        int[] iArr = new int[7];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = byteBuffer.getInt();
        }
        if (z) {
            return;
        }
        C0358.f6674.f42.f1800.f1478 = hj.EnumC0047.AUTOSPELL;
        hj hjVar = C0358.f6674.f42.f1800;
        if (hjVar.f1478 == hj.EnumC0047.AUTOSPELL) {
            hjVar.f1479.setVisibility(4);
            int i4 = 0;
            ol[] olVarArr = new ol[iArr.length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                if (iArr[i5] != 0) {
                    gt gtVar = C0358.f6664.f2004.f8642.f8673.get(Integer.valueOf(iArr[i5]));
                    ol olVar = new ol();
                    olVar.f3344 = gtVar;
                    olVar.f3343 = C0358.f6685.f1030.f968.m613(gtVar.f1409);
                    olVar.f3342 = false;
                    int i6 = i4;
                    i4++;
                    olVarArr[i6] = olVar;
                }
            }
            hjVar.f1480.setAdapter((ListAdapter) new hm((ol[]) Arrays.copyOf(olVarArr, i4), hjVar.f1476));
            hjVar.h_();
        }
    }
}
