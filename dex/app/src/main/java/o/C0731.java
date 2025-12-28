package o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: o.摁, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0731 implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0399 f7709;

    C0731(C0399 c0399) {
        this.f7709 = c0399;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0399 c0399 = this.f7709;
        C0927 c0927 = (C0927) c0399.f6760.getAdapter();
        C0927 c09272 = (C0927) c0399.f6758.getAdapter();
        C0603 c0603 = c09272.f8218.get(i);
        if (c0603.f7409.f8500 >= 0) {
            ArrayList<C0603> arrayList = c0927.f8218;
            ArrayList<C0603> arrayList2 = new ArrayList<>();
            if (c09272 != null && c09272.f8218 != null) {
                arrayList2 = c09272.f8218;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (c0603.f7409.f8502 != arrayList.get(i2).f7409.f8502 || c0603.f7409.f8500 <= 0) {
                    i2++;
                } else {
                    c0399.f6771 += c0399.f6775;
                    c0399.f6775 -= c0603.f7409.f8500 * c0603.f7408;
                    TextView textView = c0399.f6761;
                    cv cvVar = C0358.f6685;
                    String strM649 = C0358.f6687.m649(1857);
                    textView.setText(String.valueOf(strM649 == null ? "MSG1857" : strM649) + " " + pa.m973(c0399.f6771) + " Z");
                    c0399.m1319(C0358.f6664.f2004.f8636 + c0399.f6775);
                    c0399.d_();
                    c0927.f8218.get(i2).f7409.f8500 += c0603.f7409.f8500;
                    arrayList2.remove(i);
                    RelativeLayout relativeLayout = c0927.f8218.get(i2).f7401;
                    arrayList.get(i2);
                    c0603.m1380(relativeLayout, true);
                }
            }
            c0399.f6758.setAdapter((ListAdapter) new C0927(arrayList2));
            c0399.f6760.setAdapter((ListAdapter) new C0927(c0927.f8218));
        }
    }
}
