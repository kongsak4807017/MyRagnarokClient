package net.hockeyapp.android;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import o.aca;
import o.acc;
import o.acd;
import o.ace;
import o.acf;
import o.acg;
import o.ach;
import o.acl;
import o.act;
import o.adi;
import o.adl;
import o.adp;
import o.adz;
import o.aec;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class UpdateActivity extends Activity implements View.OnClickListener, acl {

    /* renamed from: ȃ, reason: contains not printable characters */
    private Context f87;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private act f88;

    /* renamed from: 櫯, reason: contains not printable characters */
    protected aec f89;

    /* renamed from: 鷭, reason: contains not printable characters */
    protected adi f90;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static /* synthetic */ act m167(UpdateActivity updateActivity) {
        updateActivity.f88 = null;
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("App Update");
        setContentView(getLayoutInflater().inflate(aca.C0006.hockeyapp_activity_update, (ViewGroup) null));
        this.f87 = this;
        this.f89 = new aec(this, getIntent().getStringExtra("json"), this);
        ((TextView) findViewById(aca.Cif.label_title)).setText(m166());
        TextView textView = (TextView) findViewById(aca.Cif.label_version);
        String str = "Version " + this.f89.m400();
        String strM399 = this.f89.m399();
        Object obj = "Unknown size";
        long jM398 = this.f89.m398();
        if (jM398 >= 0) {
            obj = String.format("%.2f", Float.valueOf(jM398 / 1048576.0f)) + " MB";
        } else {
            adp.m350(new adl(this, getIntent().getStringExtra("url"), new acd(this, textView, str, strM399)));
        }
        textView.setText(getString(aca.C0005.hockeyapp_update_version_details_label, new Object[]{str, strM399, obj}));
        ((Button) findViewById(aca.Cif.button_update)).setOnClickListener(this);
        WebView webView = (WebView) findViewById(aca.Cif.web_update_details);
        webView.clearCache(true);
        webView.destroyDrawingCache();
        webView.loadDataWithBaseURL("https://sdk.hockeyapp.net/", this.f89.m397(), "text/html", "utf-8", null);
        this.f90 = (adi) getLastNonConfigurationInstance();
        if (this.f90 != null) {
            this.f90.m343(this);
        }
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        if (this.f90 != null) {
            this.f90.m341();
        }
        return this.f90;
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        return onCreateDialog(i, null);
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        switch (i) {
            case 0:
                return new AlertDialog.Builder(this).setMessage("An error has occured").setCancelable(false).setTitle("Error").setIcon(R.drawable.ic_dialog_alert).setPositiveButton("OK", new acc(this)).create();
            default:
                return null;
        }
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) dialog;
                if (this.f88 != null) {
                    alertDialog.setMessage(this.f88.f418);
                    break;
                } else {
                    alertDialog.setMessage("An unknown error has occured.");
                    break;
                }
        }
    }

    @Override // o.acl
    /* renamed from: 鷭, reason: contains not printable characters */
    public final int mo169() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 128).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!adz.m385(this.f87)) {
            this.f88 = new act();
            this.f88.f418 = getString(aca.C0005.hockeyapp_error_no_network_message);
            runOnUiThread(new acf(this));
        } else {
            if (this.f87.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                if (!m165()) {
                    this.f88 = new act();
                    this.f88.f418 = "The installation from unknown sources is not enabled. Please check the device settings.";
                    runOnUiThread(new ach(this));
                } else {
                    this.f90 = new adi(this, getIntent().getStringExtra("url"), new ace(this));
                    adp.m350(this.f90);
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            } else {
                this.f88 = new act();
                this.f88.f418 = "The permission to access the external storage permission is not set. Please contact the developer.";
                runOnUiThread(new acg(this));
            }
        }
        view.setEnabled(false);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m168() {
        this.f90 = new adi(this, getIntent().getStringExtra("url"), new ace(this));
        adp.m350(this.f90);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private String m166() {
        try {
            PackageManager packageManager = getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(getPackageName(), 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: ȃ, reason: contains not printable characters */
    private boolean m165() {
        try {
            return (Build.VERSION.SDK_INT < 17 || Build.VERSION.SDK_INT >= 21) ? Settings.Secure.getInt(getContentResolver(), "install_non_market_apps") == 1 : Settings.Global.getInt(getContentResolver(), "install_non_market_apps") == 1;
        } catch (Settings.SettingNotFoundException unused) {
            return true;
        }
    }
}
