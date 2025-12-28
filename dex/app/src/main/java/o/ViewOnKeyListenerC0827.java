package o;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: o.窆, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnKeyListenerC0827 implements View.OnKeyListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1025 f7939;

    ViewOnKeyListenerC0827(C1025 c1025) {
        this.f7939 = c1025;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 66 && keyEvent.getAction() == 1) {
            this.f7939.i_();
            return true;
        }
        return false;
    }
}
