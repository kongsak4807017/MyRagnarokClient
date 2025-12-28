package o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ie implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ib f1585;

    ie(ib ibVar) {
        this.f1585 = ibVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f1585.f1582.f49 != null) {
            C0358.f6674.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://rink.hockeyapp.net/apps/" + this.f1585.f1582.f49.f51)));
        } else {
            Toast.makeText(this.f1585.f1582, "Not available for your app.", 1).show();
        }
    }
}
