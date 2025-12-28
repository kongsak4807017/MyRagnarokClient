package o;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: o.橻, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0761 extends ClickableSpan {

    /* renamed from: 鷭, reason: contains not printable characters */
    private final /* synthetic */ C0568 f7764;

    C0761(C0568 c0568) {
        this.f7764 = c0568;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C0358.f6674.f42.f1745.m1601(this.f7764.f7316);
        C0358.f6674.f42.f1745.h_();
    }
}
