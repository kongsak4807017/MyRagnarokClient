package net.hockeyapp.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import o.abt;
import o.abu;
import o.abv;
import o.aca;
import o.adm;
import o.adp;
import o.adz;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class LoginActivity extends Activity {

    /* renamed from: Ą, reason: contains not printable characters */
    private Handler f79;

    /* renamed from: ą, reason: contains not printable characters */
    private Button f80;

    /* renamed from: ȃ, reason: contains not printable characters */
    private adm f81;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private int f82;

    /* renamed from: 櫯, reason: contains not printable characters */
    private String f83;

    /* renamed from: 鷭, reason: contains not printable characters */
    private String f84;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static /* synthetic */ void m161(LoginActivity loginActivity) {
        if (!adz.m385(loginActivity)) {
            Toast.makeText(loginActivity, aca.C0005.hockeyapp_error_no_network_message, 1).show();
            return;
        }
        String string = ((EditText) loginActivity.findViewById(aca.Cif.input_email)).getText().toString();
        String string2 = ((EditText) loginActivity.findViewById(aca.Cif.input_password)).getText().toString();
        boolean z = false;
        HashMap map = new HashMap();
        if (loginActivity.f82 == 1) {
            z = !TextUtils.isEmpty(string);
            map.put("email", string);
            map.put("authcode", m160(loginActivity.f83 + string));
        } else if (loginActivity.f82 == 2) {
            z = (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) ? false : true;
            map.put("email", string);
            map.put("password", string2);
        }
        if (!z) {
            Toast.makeText(loginActivity, loginActivity.getString(aca.C0005.hockeyapp_login_missing_credentials_toast), 1).show();
        } else {
            loginActivity.f81 = new adm(loginActivity, loginActivity.f79, loginActivity.f84, loginActivity.f82, map);
            adp.m350(loginActivity.f81);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(aca.C0006.hockeyapp_activity_login);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f84 = extras.getString("url");
            this.f83 = extras.getString("secret");
            this.f82 = extras.getInt("mode");
        }
        if (this.f82 == 1) {
            ((EditText) findViewById(aca.Cif.input_password)).setVisibility(4);
        }
        ((TextView) findViewById(aca.Cif.text_headline)).setText(this.f82 == 1 ? aca.C0005.hockeyapp_login_headline_text_email_only : aca.C0005.hockeyapp_login_headline_text);
        this.f80 = (Button) findViewById(aca.Cif.button_login);
        this.f80.setOnClickListener(new abt(this));
        this.f79 = new abu(this);
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        if (lastNonConfigurationInstance != null) {
            this.f81 = (adm) lastNonConfigurationInstance;
            adm admVar = this.f81;
            Handler handler = this.f79;
            admVar.f497 = this;
            admVar.f496 = handler;
        }
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        if (this.f81 != null) {
            adm admVar = this.f81;
            admVar.f497 = null;
            admVar.f496 = null;
            admVar.f495 = null;
        }
        return this.f81;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && abv.f366 == null) {
            Intent intent = new Intent(this, abv.f367);
            intent.setFlags(67108864);
            intent.putExtra("net.hockeyapp.android.EXIT", true);
            startActivity(intent);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m160(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }
}
