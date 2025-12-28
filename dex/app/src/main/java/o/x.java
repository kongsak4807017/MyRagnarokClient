package o;

import android.view.View;
import android.widget.ListAdapter;
import java.text.NumberFormat;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class x implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ s f5535;

    x(s sVar) {
        this.f5535 = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            s sVar = this.f5535;
            sVar.f4970 = Integer.parseInt(this.f5535.f4972.f8192.getText().toString());
            if (sVar.f4974 != null) {
                sVar.f4974.setText(NumberFormat.getInstance().format(sVar.f4970));
            }
            C0358.f6674.f42.f1750.f2025.setAdapter((ListAdapter) new r(((r) C0358.f6674.f42.f1750.f2025.getAdapter()).f4968, this.f5535.f4977));
        } catch (NumberFormatException unused) {
        }
    }
}
