package o;

import android.app.AlertDialog;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: o.缟, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0840 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0767 f7949;

    ViewOnClickListenerC0840(C0767 c0767) {
        this.f7949 = c0767;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0767 c0767 = this.f7949;
        String string = c0767.f7794.getText().toString();
        String string2 = c0767.f7791.getText().toString();
        if (string.length() < 4) {
            new AlertDialog.Builder(C0358.f6674).setTitle((CharSequence) null).setMessage("Login is too short").show();
            return;
        }
        if (string2.length() < 4) {
            new AlertDialog.Builder(C0358.f6674).setTitle((CharSequence) null).setMessage("Password is too short").show();
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C0358.f6674.getSystemService("input_method");
        inputMethodManager.hideSoftInputFromWindow(c0767.f7794.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(c0767.f7791.getWindowToken(), 0);
        C0358.m1310(C0358.f6667, string, string2);
    }
}
