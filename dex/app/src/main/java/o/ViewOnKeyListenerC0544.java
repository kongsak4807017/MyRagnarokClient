package o;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: o.㶇, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnKeyListenerC0544 implements View.OnKeyListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0698 f7268;

    ViewOnKeyListenerC0544(C0698 c0698) {
        this.f7268 = c0698;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 66 && keyEvent.getAction() == 1) {
            C0698 c0698 = this.f7268;
            String string = c0698.f7651.getText().toString();
            String string2 = c0698.f7652.getText().toString();
            if (C0358.f6664 == null || C0358.f6664.f2004 == null || C0358.f6664.f2004.f8368 == null) {
                return true;
            }
            String strTrim = C0358.f6664.f2004.f8368.trim();
            c0698.f7652.setText((CharSequence) null);
            if (C0358.f6664.f2004 == null || string2.length() <= 0) {
                return true;
            }
            if (c0698.f7654.size() == 0 || !string2.equals(c0698.f7654.getLast())) {
                c0698.f7654.addLast(string2);
                if (c0698.f7654.size() > 10) {
                    c0698.f7654.removeFirst();
                }
                c0698.f7656 = c0698.f7654.size();
            }
            C0358 c0358 = C0358.f6688;
            if (C0358.m1301(string2) || C0358.f6671 == null) {
                return true;
            }
            if (string2.startsWith(oc.f3236)) {
                string2 = string2.substring(1);
                string = C0698.f7650;
            } else if (string2.startsWith(oc.f3237)) {
                string2 = string2.substring(1);
                string = C0698.f7649;
            }
            if (string.equals(C0698.f7650)) {
                C0358.f6671.mo454(new C0501(strTrim, string2));
                return true;
            }
            if (string.equals(C0698.f7649)) {
                C0358.f6671.mo454(new C0159(strTrim, string2));
                return true;
            }
            if (string.length() > 0) {
                C0358.f6671.mo454(new C0478(c0698.f7651.getText().toString().trim(), string2));
                return true;
            }
            C0358.f6671.mo454(new C0154(strTrim, string2));
            return true;
        }
        if (i == 19 && keyEvent.getAction() == 1) {
            C0698 c06982 = this.f7268;
            c06982.f7656--;
            C0698.m1427(this.f7268);
            return true;
        }
        if (i == 20 && keyEvent.getAction() == 0) {
            this.f7268.f7656++;
            C0698.m1427(this.f7268);
            return true;
        }
        return false;
    }
}
