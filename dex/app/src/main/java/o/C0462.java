package o;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import o.C0523;

/* renamed from: o.ᅢ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0462 implements AdapterView.OnItemLongClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0523 f6914;

    C0462(C0523 c0523) {
        this.f6914 = c0523;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0523 c0523 = this.f6914;
        C0523.Cif cif = ((C0523.C0524) adapterView.getItemAtPosition(i)).f7237;
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle("Add hotkey");
        builder.setItems(new String[]{"Hotkey"}, new DialogInterfaceOnClickListenerC0446(c0523, cif));
        builder.show();
        c0523.mo439();
        return true;
    }
}
