package o;

import android.text.Editable;
import android.text.TextWatcher;
import o.gm;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gn implements TextWatcher {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gm.C0042 f1370;

    gn(gm.C0042 c0042) {
        this.f1370 = c0042;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1370.f1361 = editable.toString();
    }
}
