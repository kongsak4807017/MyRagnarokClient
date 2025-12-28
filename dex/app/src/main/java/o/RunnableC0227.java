package o;

import android.app.AlertDialog;

/* renamed from: o.Ȋ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0227 implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    private final /* synthetic */ String f6528;

    RunnableC0227(String str) {
        this.f6528 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        if (C0358.f6685 != null && C0358.f6685.f1030 != null && C0358.f6685.f1030.f976 != null) {
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(3);
            str = strM649 == null ? "MSG3" : strM649;
        } else {
            str = "Disconnected from server";
        }
        if (this.f6528 != null) {
            str = String.valueOf(str) + ": " + this.f6528;
        }
        if (C0358.f6674.f42.f1801 == null) {
            new AlertDialog.Builder(C0358.f6674).setTitle((CharSequence) null).setMessage(str).setPositiveButton("To login screen", new DialogInterfaceOnClickListenerC0133(this)).setCancelable(false).show();
        } else {
            new AlertDialog.Builder(C0358.f6674).setTitle((CharSequence) null).setMessage(str).show();
        }
    }
}
