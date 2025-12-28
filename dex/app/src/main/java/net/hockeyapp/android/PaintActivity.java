package net.hockeyapp.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.io.File;
import o.abx;
import o.aby;
import o.aca;
import o.aej;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class PaintActivity extends Activity {

    /* renamed from: 櫯, reason: contains not printable characters */
    private String f85;

    /* renamed from: 鷭, reason: contains not printable characters */
    private aej f86;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri uri = (Uri) getIntent().getExtras().getParcelable("imageUri");
        this.f85 = m162(uri, uri.getLastPathSegment());
        int i = getResources().getDisplayMetrics().widthPixels;
        int i2 = getResources().getDisplayMetrics().heightPixels;
        int i3 = i > i2 ? 0 : 1;
        int iM413 = aej.m413(getContentResolver(), uri);
        setRequestedOrientation(iM413);
        if (i3 != iM413) {
            return;
        }
        this.f86 = new aej(this, uri, i, i2);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(this.f86);
        setContentView(linearLayout);
        Toast.makeText(this, getString(aca.C0005.hockeyapp_paint_indicator_toast), 1).show();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, getString(aca.C0005.hockeyapp_paint_menu_save));
        menu.add(0, 2, 0, getString(aca.C0005.hockeyapp_paint_menu_undo));
        menu.add(0, 3, 0, getString(aca.C0005.hockeyapp_paint_menu_clear));
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
                m163();
                break;
            case 2:
                aej aejVar = this.f86;
                if (!aejVar.f599.empty()) {
                    aejVar.f599.pop();
                    aejVar.invalidate();
                    break;
                }
                break;
            case 3:
                aej aejVar2 = this.f86;
                aejVar2.f599.clear();
                aejVar2.invalidate();
                break;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && !this.f86.f599.empty()) {
            abx abxVar = new abx(this);
            new AlertDialog.Builder(this).setMessage(aca.C0005.hockeyapp_paint_dialog_message).setPositiveButton(aca.C0005.hockeyapp_paint_dialog_positive_button, abxVar).setNegativeButton(aca.C0005.hockeyapp_paint_dialog_negative_button, abxVar).setNeutralButton(aca.C0005.hockeyapp_paint_dialog_neutral_button, abxVar).show();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: 鷭, reason: contains not printable characters */
    public void m163() {
        File file = new File(getCacheDir(), "HockeyApp");
        file.mkdir();
        File file2 = new File(file, this.f85 + ".jpg");
        int i = 1;
        while (file2.exists()) {
            file2 = new File(file, this.f85 + "_" + i + ".jpg");
            i++;
        }
        this.f86.setDrawingCacheEnabled(true);
        new aby(this, this.f86.getDrawingCache()).execute(file2);
        Intent intent = new Intent();
        intent.putExtra("imageUri", Uri.fromFile(file2));
        if (getParent() == null) {
            setResult(-1, intent);
        } else {
            getParent().setResult(-1, intent);
        }
        finish();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private String m162(Uri uri, String str) {
        String string = null;
        Cursor cursorQuery = getApplicationContext().getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    string = cursorQuery.getString(0);
                }
            } finally {
                cursorQuery.close();
            }
        }
        return string == null ? str : new File(string).getName();
    }
}
