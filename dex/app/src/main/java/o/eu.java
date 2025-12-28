package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import java.util.MissingResourceException;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class eu implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ es f1227;

    eu(es esVar) {
        this.f1227 = esVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) throws MissingResourceException {
        pj.C0079 c0079 = this.f1227.f1225[i];
        String iSO3Country = this.f1227.f1222.getResources().getConfiguration().locale.getISO3Country();
        if (c0079.f4771 == pj.aux.iRO_Renewal && !iSO3Country.equals("USA")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f1227.f1222);
            builder.setMessage("Non-USA users may have problems while registering on this server. If you're having such problems, please choose a different server\n");
            builder.setPositiveButton("Ok", new ev(this, c0079));
            builder.setNegativeButton("Cancel", (DialogInterface.OnClickListener) null);
            builder.show();
            return;
        }
        this.f1227.m588(c0079);
    }
}
