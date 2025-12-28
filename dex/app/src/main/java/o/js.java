package o;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class js implements AdapterView.OnItemSelectedListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1863;

    js(je jeVar) {
        this.f1863 = jeVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0358.f6687.m658("last_char_server", 0, String.valueOf(i));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
