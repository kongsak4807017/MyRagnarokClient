package o;

import android.view.View;
import android.widget.Spinner;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jf implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1845;

    jf(je jeVar) {
        this.f1845 = jeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int selectedItemId = (int) ((Spinner) ((c_activity) view.getContext()).findViewById(2131296486)).getSelectedItemId();
        if (C0358.f6688.f6691 == null || C0358.f6688.f6691.f6702 == null || selectedItemId < 0 || selectedItemId >= C0358.f6688.f6691.f6702.length) {
            nz.m907("Invalid selection");
        } else {
            C0358.m1311(C0358.f6688.f6691.f6702[selectedItemId]);
        }
    }
}
