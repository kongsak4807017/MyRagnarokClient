package o;

import android.os.Environment;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class eq implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ en f1216;

    eq(en enVar) {
        this.f1216 = enVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1216.m586(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), false);
    }
}
