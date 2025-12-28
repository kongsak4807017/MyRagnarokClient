package net.hockeyapp.android;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;
import o.aca;
import o.adz;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ExpiryInfoActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        super.onCreate(bundle);
        setTitle(getString(aca.C0005.hockeyapp_expiry_info_title));
        setContentView(aca.C0006.hockeyapp_activity_expiry_info);
        ((TextView) findViewById(aca.Cif.label_message)).setText(String.format(getString(aca.C0005.hockeyapp_expiry_info_text), adz.m379(this)));
    }
}
