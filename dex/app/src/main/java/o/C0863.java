package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o.hj;

/* renamed from: o.识, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0863 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    static int f8038;

    C0863() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 1090;
        int i3 = byteBuffer.getInt();
        short[] sArr = new short[i];
        for (int i4 = 0; i4 < sArr.length; i4++) {
            sArr[i4] = byteBuffer.getShort();
        }
        if (z) {
            return;
        }
        f8038 = i3;
        C0358.f6674.f42.f1800.f1478 = hj.EnumC0047.SKILLSELECTREQUEST;
        hj hjVar = C0358.f6674.f42.f1800;
        if (hjVar.f1478 == hj.EnumC0047.SKILLSELECTREQUEST) {
            hjVar.f1479.setVisibility(4);
            int i5 = 0;
            ol[] olVarArr = new ol[sArr.length];
            for (int i6 = 0; i6 < sArr.length; i6++) {
                if (sArr[i6] != 0) {
                    gt gtVar = C0358.f6664.f2004.f8642.f8673.get(Integer.valueOf(sArr[i6]));
                    ol olVar = new ol();
                    olVar.f3344 = gtVar;
                    olVar.f3343 = C0358.f6685.f1030.f968.m613(gtVar.f1409);
                    olVar.f3342 = false;
                    int i7 = i5;
                    i5++;
                    olVarArr[i7] = olVar;
                }
            }
            hjVar.f1480.setAdapter((ListAdapter) new hm((ol[]) Arrays.copyOf(olVarArr, i5), hjVar.f1476));
            hjVar.h_();
        }
    }
}
