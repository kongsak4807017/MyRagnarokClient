package o;

import android.app.AlertDialog;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jk implements View.OnLongClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1850;

    jk(je jeVar) {
        this.f1850 = jeVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        if (C0358.f6674.f42.f1822 != null) {
            builder.setItems(new String[]{"Clear hotkey", "Cancel"}, new jl(this));
            builder.show();
            return true;
        }
        return false;
    }
}
