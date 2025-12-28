package o;

import android.content.DialogInterface;
import java.io.File;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class er implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ File f1217;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ en f1218;

    er(en enVar, File file) {
        this.f1218 = enVar;
        this.f1217 = file;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String absolutePath = this.f1217.getAbsolutePath();
        oc.f3240 = absolutePath;
        oc.f3245 = absolutePath;
        this.f1218.f1213.m138(this.f1217);
    }
}
