package o;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.Toast;
import java.lang.reflect.Array;
import java.util.Arrays;
import o.pj;

/* renamed from: o.맵, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC1062 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0490 f8839;

    ViewOnClickListenerC1062(C0490 c0490) {
        this.f8839 = c0490;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object[]] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0760 c0760;
        C0490 c0490 = this.f8839;
        int i = this.f8839.f6961;
        if (i == -1 || (c0760 = (C0760) c0490.f6969.getItemAtPosition(i)) == null) {
            return;
        }
        try {
            int iIntValue = Integer.valueOf(c0490.f6960.getText().toString()).intValue();
            C0760[] c0760ArrM1352 = c0490.m1352();
            C0760 c07602 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= c0760ArrM1352.length) {
                    break;
                }
                if (c0760ArrM1352[i2].f7763 == c0760.f7763) {
                    c07602 = c0760ArrM1352[i2];
                    break;
                }
                i2++;
            }
            if (c07602 == null) {
                if (C0358.f6667.f4771 != pj.aux.iRO_Renewal) {
                    c0760ArrM1352 = null;
                }
                c07602 = new C0760(c0760.f7763, c0760.f7762, iIntValue, c0760.f7760);
                C0760[] c0760Arr = c0760ArrM1352;
                if (c0760Arr == null) {
                    c0760Arr = (Object[]) Array.newInstance(c07602.getClass(), 0);
                }
                Object[] objArrCopyOf = Arrays.copyOf(c0760Arr, c0760Arr.length + 1);
                objArrCopyOf[c0760Arr.length] = c07602;
                c0760ArrM1352 = (C0760[]) objArrCopyOf;
            } else {
                c07602.f7761 += iIntValue;
            }
            if (c0490.m1351(c0760ArrM1352) == null) {
                c07602.f7761 -= iIntValue;
                Toast.makeText(C0358.f6674, "Insufficient CP", 1).show();
            } else {
                c0490.f6967.setAdapter((ListAdapter) new C1019(c0760ArrM1352));
                c0490.e_();
                c0490.f6959.setText("Purchase");
                c0490.f6959.setOnClickListener(new ViewOnClickListenerC1020(c0490));
            }
        } catch (NumberFormatException unused) {
        }
    }
}
