package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.io.File;
import java.util.Iterator;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class df implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ File f1065;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ dd f1066;

    df(dd ddVar, File file) {
        this.f1066 = ddVar;
        this.f1065 = file;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1065.delete();
        if (!this.f1065.getName().equals("ddata.grf")) {
            String strM989 = pb.m989(this.f1065, oc.f3240);
            Iterator<pj.C0079.C0080> it = C0358.f6667.f4848.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pj.C0079.C0080 next = it.next();
                if (next.f4864.equals(strM989)) {
                    new File(oc.f3240, next.f4862).delete();
                    break;
                }
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setMessage("Corrupted GRF has been successfully deleted. Please restart application.");
        builder.setPositiveButton("Quit", new dg(this));
        builder.show();
    }
}
