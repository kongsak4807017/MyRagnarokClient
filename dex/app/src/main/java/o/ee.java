package o;

import android.view.View;
import android.widget.ListAdapter;
import java.util.Arrays;
import java.util.Map;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ee implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ eb f1170;

    ee(eb ebVar) {
        this.f1170 = ebVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        for (int i = 0; i < this.f1170.f1161.length; i++) {
            if (view == this.f1170.f1151[i]) {
                eb ebVar = this.f1170;
                if (ebVar.f1161[i] != null) {
                    C0358.f6671.mo454(new C0192(ebVar.f1165[i], ebVar.f1161[i].f8500));
                    return;
                }
                int size = C0358.f6664.f2004.f8622.size();
                int[] iArr = new int[size];
                C1008[] c1008Arr = new C1008[size];
                int i2 = 0;
                for (Map.Entry<Integer, C1008> entry : C0358.f6664.f2004.f8622.entrySet()) {
                    C1008 value = entry.getValue();
                    if (value.f8490 == 0) {
                        iArr[i2] = entry.getKey().intValue();
                        int i3 = i2;
                        i2++;
                        c1008Arr[i3] = value;
                    }
                }
                C0876 c0876 = C0358.f6674.f42.f1753;
                C1008[] c1008Arr2 = (C1008[]) Arrays.copyOf(c1008Arr, i2);
                int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
                c0876.f8045 = new ef(ebVar);
                c0876.f8046.setAdapter((ListAdapter) new C0471(iArrCopyOf, c1008Arr2));
                c0876.h_();
                return;
            }
        }
    }
}
