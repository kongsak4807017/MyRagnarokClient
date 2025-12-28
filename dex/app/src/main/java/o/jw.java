package o;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jw extends ClickableSpan {

    /* renamed from: 鷭, reason: contains not printable characters */
    private final /* synthetic */ int f1873;

    jw(int i) {
        this.f1873 = i;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C0358.f6674.f42.f1745.m1601(new C1008(this.f1873));
        C0358.f6674.f42.f1745.h_();
    }
}
