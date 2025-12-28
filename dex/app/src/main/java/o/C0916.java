package o;

import android.view.View;
import android.widget.AdapterView;
import o.C0523;

/* renamed from: o.騛, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0916 implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0523 f8202;

    C0916(C0523 c0523) {
        this.f8202 = c0523;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f8202.m1364(((C0523.C0524) adapterView.getItemAtPosition(i)).f7237);
    }
}
