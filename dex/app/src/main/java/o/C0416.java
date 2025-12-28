package o;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.ևֵ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0416 implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0399 f6809;

    C0416(C0399 c0399) {
        this.f6809 = c0399;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0927 c0927 = (C0927) this.f6809.f6760.getAdapter();
        if (!c0927.f8218.get(i).f7409.m1585() || !this.f6809.f6762.isChecked()) {
            this.f6809.m1320(i, c0927.f8218.get(i).f7409.f8500);
            return;
        }
        C0399 c0399 = this.f6809;
        c0399.f6776 = i;
        C0927 c09272 = (C0927) c0399.f6760.getAdapter();
        C0906 c0906 = c0399.f6777;
        StringBuilder sbAppend = new StringBuilder(String.valueOf(c09272.f8218.get(i).f7409.m1588())).append(": ");
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(2509);
        c0906.f8193.setText(sbAppend.append(strM649 == null ? "MSG2509" : strM649).toString());
        c0399.f6777.h_();
    }
}
