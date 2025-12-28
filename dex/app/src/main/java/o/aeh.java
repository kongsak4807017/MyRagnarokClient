package o;

import android.content.Intent;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class aeh implements View.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ aee f591;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ boolean f592;

    aeh(aee aeeVar, boolean z) {
        this.f591 = aeeVar;
        this.f592 = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.f592) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(this.f591.f586, "image/*");
        this.f591.f585.startActivity(intent);
    }
}
