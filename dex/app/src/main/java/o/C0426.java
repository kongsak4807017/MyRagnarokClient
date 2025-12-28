package o;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.ڶ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0426 implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0876 f6829;

    C0426(C0876 c0876) {
        this.f6829 = c0876;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f6829.mo439();
        this.f6829.f8045.mo577((lg) this.f6829.f8046.getItemAtPosition(i));
    }
}
