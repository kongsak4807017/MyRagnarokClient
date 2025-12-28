package o;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: o.魘, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnKeyListenerC0943 implements View.OnKeyListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0906 f8241;

    ViewOnKeyListenerC0943(C0906 c0906) {
        this.f8241 = c0906;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 66 && keyEvent.getAction() == 1) {
            C0906 c0906 = this.f8241;
            c0906.f8188.onClick(c0906.f8192);
            c0906.mo439();
            return true;
        }
        return false;
    }
}
