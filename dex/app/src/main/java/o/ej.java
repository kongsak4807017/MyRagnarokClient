package o;

import android.view.View;
import android.widget.AdapterView;
import o.eh;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ej implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ eh.C0033 f1188;

    ej(eh.C0033 c0033) {
        this.f1188 = c0033;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0358.f6671.mo454(new C0191(this.f1188.f1181, ((eh.C0034[]) ((eh.Cif) this.f1188.f1178.getAdapter()).f8521)[i].f1186.f7867));
    }
}
