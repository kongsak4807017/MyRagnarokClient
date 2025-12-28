package o;

import android.widget.ListAdapter;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import o.ge;

/* renamed from: o.ˮ̂, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0314 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    int f6621;

    C0314() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2019;
        this.f6621 = byteBuffer.getInt();
        if (z) {
            return;
        }
        ge geVar = C0358.f6674.f42.f1742;
        geVar.f1331 = this.f6621;
        c_activity c_activityVar = (c_activity) geVar.f1994.getContext();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        geVar.f1340 = ge.EnumC0041.CHANGE_MATERIAL;
        for (Map.Entry<Integer, C1008> entry : C0358.f6664.f2004.f8622.entrySet()) {
            C1008 value = entry.getValue();
            if (value != null) {
                arrayList.add(value);
                arrayList2.add(new gb(c_activityVar, value, entry.getKey().intValue(), 1, 1, geVar.f1340));
            }
        }
        geVar.f1335 = 0;
        geVar.f1338.setAdapter((ListAdapter) new ga(arrayList2));
        geVar.f1332.setAdapter((ListAdapter) null);
        geVar.m599();
        C0358.f6674.f42.f1742.h_();
    }
}
