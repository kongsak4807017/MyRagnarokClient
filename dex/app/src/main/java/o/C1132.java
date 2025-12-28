package o;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.쾎, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1132 implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0569 f8966;

    C1132(C0569 c0569) {
        this.f8966 = c0569;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f8966.mo439();
        this.f8966.f7326.mo577((lg) this.f8966.f7329.getItemAtPosition(i));
    }
}
