package o;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ff implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ fe f1261;

    ff(fe feVar) {
        this.f1261 = feVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ((fd) this.f1261.f1260.getItemAtPosition(i)).mo593();
    }
}
