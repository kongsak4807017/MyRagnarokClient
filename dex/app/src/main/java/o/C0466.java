package o;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.ኾ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0466 implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1046 f6924;

    C0466(C1046 c1046) {
        this.f6924 = c1046;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0358.f6671.mo454(new C0884(((C0757) this.f6924.f8700.getItemAtPosition(i)).f7750));
        this.f6924.mo439();
    }
}
