package o;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.婬, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0668 implements AdapterView.OnItemLongClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1046 f7580;

    C0668(C1046 c1046) {
        this.f7580 = c1046;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0757 c0757 = (C0757) this.f7580.f8700.getItemAtPosition(i);
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle(c0757.f7750.name());
        builder.setIcon(c0757.f7748.getDrawable());
        builder.setItems(new String[]{"Use", "Hotkey"}, new DialogInterfaceOnClickListenerC0762(this, c0757));
        builder.show();
        return true;
    }
}
