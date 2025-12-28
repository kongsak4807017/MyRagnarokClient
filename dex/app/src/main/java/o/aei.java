package o;

import android.content.Intent;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class aei implements View.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ aee f593;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ boolean f594;

    aei(aee aeeVar, boolean z) {
        this.f593 = aeeVar;
        this.f594 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.f594) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(this.f593.f586, "*/*");
        this.f593.f585.startActivity(intent);
    }
}
