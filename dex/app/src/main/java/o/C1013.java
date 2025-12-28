package o;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.뇪, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1013 implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0490 f8514;

    C1013(C0490 c0490) {
        this.f8514 = c0490;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0490 c0490 = this.f8514;
        c0490.f6961 = i;
        c0490.f_();
    }
}
