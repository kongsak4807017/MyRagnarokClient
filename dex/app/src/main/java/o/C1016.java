package o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* renamed from: o.댤, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1016 implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0490 f8518;

    C1016(C0490 c0490) {
        this.f8518 = c0490;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0490 c0490 = this.f8518;
        c0490.f6967.setAdapter((ListAdapter) new C1019((C0760[]) ox.m947(c0490.m1352(), i)));
        c0490.g_();
    }
}
