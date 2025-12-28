package o;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.馈, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0913 implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0649 f8199;

    C0913(C0649 c0649) {
        this.f8199 = c0649;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0649 c0649 = this.f8199;
        c0649.f7537 = i;
        c0649.f7538.show();
    }
}
