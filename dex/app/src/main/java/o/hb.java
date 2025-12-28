package o;

import android.view.View;
import o.kv;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hb implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gy f1450;

    hb(gy gyVar) {
        this.f1450 = gyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gy gyVar = this.f1450;
        C0358.f6674.f42.m735(kv.EnumC0058.SKILL, gyVar.f1443.f1409, gyVar.f1440.getVisibility() == 0 ? gyVar.f1440.getProgress() + 1 : gyVar.f1443.f1407, 0, (byte) 0);
        gyVar.mo439();
        C0358.f6674.f42.f1800.mo439();
    }
}
