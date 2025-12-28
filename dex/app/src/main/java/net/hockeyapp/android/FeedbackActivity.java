package net.hockeyapp.android;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.hockeyapp.android.views.AttachmentListView;
import o.abk;
import o.abl;
import o.abn;
import o.abr;
import o.aca;
import o.aco;
import o.act;
import o.acx;
import o.acz;
import o.adn;
import o.ado;
import o.adp;
import o.adt;
import o.adw;
import o.adz;
import o.aee;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class FeedbackActivity extends Activity implements View.OnClickListener {

    /* renamed from: Ą, reason: contains not printable characters */
    private TextView f52;

    /* renamed from: ą, reason: contains not printable characters */
    private EditText f53;

    /* renamed from: Ć, reason: contains not printable characters */
    private EditText f54;

    /* renamed from: ć, reason: contains not printable characters */
    private EditText f55;

    /* renamed from: ċ, reason: contains not printable characters */
    private Button f56;

    /* renamed from: đ, reason: contains not printable characters */
    private adn f57;

    /* renamed from: Ē, reason: contains not printable characters */
    private Handler f58;

    /* renamed from: ē, reason: contains not printable characters */
    private List<Uri> f59;

    /* renamed from: Ė, reason: contains not printable characters */
    private aco f60;

    /* renamed from: ė, reason: contains not printable characters */
    private ArrayList<acx> f61;

    /* renamed from: Ę, reason: contains not printable characters */
    private boolean f62;

    /* renamed from: ę, reason: contains not printable characters */
    private boolean f63;

    /* renamed from: ȃ, reason: contains not printable characters */
    private Context f64;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private Button f65;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private String f66;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private EditText f67;

    /* renamed from: ܕ, reason: contains not printable characters */
    private ado f68;

    /* renamed from: 㥳, reason: contains not printable characters */
    private act f69;

    /* renamed from: 䒧, reason: contains not printable characters */
    private LinearLayout f70;

    /* renamed from: 岱, reason: contains not printable characters */
    private Button f71;

    /* renamed from: 庸, reason: contains not printable characters */
    private Handler f72;

    /* renamed from: 廂, reason: contains not printable characters */
    private String f73;

    /* renamed from: 櫯, reason: contains not printable characters */
    private String f74;

    /* renamed from: 纫, reason: contains not printable characters */
    private ScrollView f75;

    /* renamed from: 躆, reason: contains not printable characters */
    private ListView f76;

    /* renamed from: 鷭, reason: contains not printable characters */
    public Button f77;

    /* renamed from: 띥, reason: contains not printable characters */
    private String f78;

    /* renamed from: ȃ, reason: contains not printable characters */
    public static /* synthetic */ boolean m148(FeedbackActivity feedbackActivity) {
        feedbackActivity.f62 = false;
        return false;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static /* synthetic */ void m157(FeedbackActivity feedbackActivity, String str, String str2) {
        feedbackActivity.f57 = new adn(feedbackActivity, str, feedbackActivity.f58, str2);
        adp.m350(feedbackActivity.f57);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(aca.C0006.hockeyapp_activity_feedback, (ViewGroup) null));
        setTitle(getString(aca.C0005.hockeyapp_feedback_title));
        this.f64 = this;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f78 = extras.getString("url");
            this.f74 = extras.getString("initialUserName");
            this.f66 = extras.getString("initialUserEmail");
            Parcelable[] parcelableArray = extras.getParcelableArray("initialAttachments");
            if (parcelableArray != null) {
                this.f59 = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    this.f59.add((Uri) parcelable);
                }
            }
        }
        if (bundle != null) {
            this.f63 = bundle.getBoolean("feedbackViewInitialized");
            this.f62 = bundle.getBoolean("inSendFeedback");
        } else {
            this.f62 = false;
            this.f63 = false;
        }
        ((NotificationManager) getSystemService("notification")).cancel(2);
        this.f72 = new abl(this);
        this.f58 = new abn(this);
        m155();
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById(aca.Cif.wrapper_attachments);
            Iterator it = bundle.getParcelableArrayList("attachments").iterator();
            while (it.hasNext()) {
                viewGroup.addView(new aee(this, viewGroup, (Uri) it.next(), true));
            }
            this.f63 = bundle.getBoolean("feedbackViewInitialized");
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelableArrayList("attachments", ((AttachmentListView) findViewById(aca.Cif.wrapper_attachments)).m170());
        bundle.putBoolean("feedbackViewInitialized", this.f63);
        bundle.putBoolean("inSendFeedback", this.f62);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.f68 != null) {
            ado adoVar = this.f68;
            adoVar.f515 = null;
            adoVar.f513 = null;
        }
    }

    @Override // android.app.Activity
    public Object onRetainNonConfigurationInstance() {
        if (this.f68 != null) {
            ado adoVar = this.f68;
            adoVar.f515 = null;
            adoVar.f513 = null;
        }
        return this.f68;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (this.f62) {
                this.f62 = false;
                m155();
                return true;
            }
            finish();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != aca.Cif.button_send) {
            if (id == aca.Cif.button_attachment) {
                if (((ViewGroup) findViewById(aca.Cif.wrapper_attachments)).getChildCount() >= 3) {
                    Toast.makeText(this, "3", 0).show();
                    return;
                } else {
                    openContextMenu(view);
                    return;
                }
            }
            if (id == aca.Cif.button_add_response) {
                m159(false);
                this.f62 = true;
                return;
            } else {
                if (id == aca.Cif.button_refresh) {
                    m156(this.f78, null, null, null, null, null, adw.C0012.f540.m366(this.f64), this.f72, true);
                    return;
                }
                return;
            }
        }
        if (!adz.m385(this)) {
            Toast.makeText(this, aca.C0005.hockeyapp_error_no_network_message, 1).show();
            return;
        }
        if (this.f77 != null) {
            this.f77.setEnabled(false);
        }
        if (this.f67 != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f67.getWindowToken(), 0);
        }
        String strM366 = adw.C0012.f540.m366(this.f64);
        String strTrim = this.f53.getText().toString().trim();
        String strTrim2 = this.f54.getText().toString().trim();
        String strTrim3 = this.f55.getText().toString().trim();
        String strTrim4 = this.f67.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim3)) {
            this.f55.setVisibility(0);
            this.f55.setError(getString(aca.C0005.hockeyapp_feedback_validate_subject_error));
            if (this.f77 != null) {
                this.f77.setEnabled(true);
                return;
            }
            return;
        }
        if (abr.f359 == acz.REQUIRED && TextUtils.isEmpty(strTrim)) {
            this.f53.setError(getString(aca.C0005.hockeyapp_feedback_validate_name_error));
            if (this.f77 != null) {
                this.f77.setEnabled(true);
                return;
            }
            return;
        }
        if (abr.f358 == acz.REQUIRED && TextUtils.isEmpty(strTrim2)) {
            this.f54.setError(getString(aca.C0005.hockeyapp_feedback_validate_email_empty));
            if (this.f77 != null) {
                this.f77.setEnabled(true);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(strTrim4)) {
            this.f67.setError(getString(aca.C0005.hockeyapp_feedback_validate_text_error));
            if (this.f77 != null) {
                this.f77.setEnabled(true);
                return;
            }
            return;
        }
        if (abr.f358 != acz.REQUIRED || adz.m380(strTrim2)) {
            adw adwVar = adw.C0012.f540;
            Context context = this.f64;
            if (context != null) {
                adwVar.f539 = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
                if (adwVar.f539 != null) {
                    adwVar.f538 = adwVar.f539.edit();
                    if (strTrim == null || strTrim2 == null || strTrim3 == null) {
                        adwVar.f538.putString("net.hockeyapp.android.prefs_key_name_email", null);
                    } else {
                        adwVar.f538.putString("net.hockeyapp.android.prefs_key_name_email", String.format("%s|%s|%s", strTrim, strTrim2, strTrim3));
                    }
                    adwVar.f538.apply();
                }
            }
            m156(this.f78, strTrim, strTrim2, strTrim3, strTrim4, ((AttachmentListView) findViewById(aca.Cif.wrapper_attachments)).m170(), strM366, this.f72, false);
            return;
        }
        this.f54.setError(getString(aca.C0005.hockeyapp_feedback_validate_email_error));
        if (this.f77 != null) {
            this.f77.setEnabled(true);
        }
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 2, 0, getString(aca.C0005.hockeyapp_feedback_attach_file));
        contextMenu.add(0, 1, 0, getString(aca.C0005.hockeyapp_feedback_attach_picture));
    }

    @Override // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 1:
            case 2:
                int itemId = menuItem.getItemId();
                if (itemId != 2) {
                    if (itemId == 1) {
                        Intent intent = new Intent();
                        intent.setType("image/*");
                        intent.setAction("android.intent.action.GET_CONTENT");
                        startActivityForResult(Intent.createChooser(intent, getString(aca.C0005.hockeyapp_feedback_select_picture)), 1);
                        break;
                    }
                } else {
                    Intent intent2 = new Intent();
                    intent2.setType("*/*");
                    intent2.setAction("android.intent.action.GET_CONTENT");
                    startActivityForResult(Intent.createChooser(intent2, getString(aca.C0005.hockeyapp_feedback_select_file)), 2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case 0:
                return new AlertDialog.Builder(this).setMessage(getString(aca.C0005.hockeyapp_dialog_error_message)).setCancelable(false).setTitle(getString(aca.C0005.hockeyapp_dialog_error_title)).setIcon(R.drawable.ic_dialog_alert).setPositiveButton(getString(aca.C0005.hockeyapp_dialog_positive_button), new abk(this)).create();
            default:
                return null;
        }
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i, Dialog dialog) {
        switch (i) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) dialog;
                if (this.f69 != null) {
                    alertDialog.setMessage(this.f69.f418);
                    break;
                } else {
                    alertDialog.setMessage(getString(aca.C0005.hockeyapp_feedback_generic_error));
                    break;
                }
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        if (i2 != -1) {
            return;
        }
        if (i == 2) {
            Uri data = intent.getData();
            if (data != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById(aca.Cif.wrapper_attachments);
                viewGroup.addView(new aee(this, viewGroup, data, true));
                return;
            }
            return;
        }
        if (i == 1) {
            Uri data2 = intent.getData();
            if (data2 != null) {
                try {
                    Intent intent2 = new Intent(this, (Class<?>) PaintActivity.class);
                    intent2.putExtra("imageUri", data2);
                    startActivityForResult(intent2, 3);
                    return;
                } catch (ActivityNotFoundException e) {
                    String str = ("HockeyApp".length() == 0 || "HockeyApp".length() > 23) ? "HockeyApp" : "HockeyApp";
                    if (adt.f529 <= 6) {
                        Log.e(str, "Paint activity not declared!", e);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i == 3 && (uri = (Uri) intent.getParcelableExtra("imageUri")) != null) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(aca.Cif.wrapper_attachments);
            viewGroup2.addView(new aee(this, viewGroup2, uri, true));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m159(boolean z) {
        this.f75 = (ScrollView) findViewById(aca.Cif.wrapper_feedback_scroll);
        this.f70 = (LinearLayout) findViewById(aca.Cif.wrapper_messages);
        this.f76 = (ListView) findViewById(aca.Cif.list_feedback_messages);
        if (z) {
            this.f70.setVisibility(0);
            this.f75.setVisibility(8);
            this.f52 = (TextView) findViewById(aca.Cif.label_last_updated);
            this.f65 = (Button) findViewById(aca.Cif.button_add_response);
            this.f65.setOnClickListener(this);
            this.f56 = (Button) findViewById(aca.Cif.button_refresh);
            this.f56.setOnClickListener(this);
            return;
        }
        this.f70.setVisibility(8);
        this.f75.setVisibility(0);
        this.f53 = (EditText) findViewById(aca.Cif.input_name);
        this.f54 = (EditText) findViewById(aca.Cif.input_email);
        this.f55 = (EditText) findViewById(aca.Cif.input_subject);
        this.f67 = (EditText) findViewById(aca.Cif.input_message);
        if (!this.f63) {
            String strM365 = adw.C0012.f540.m365(this.f64);
            if (strM365 != null) {
                String[] strArrSplit = strM365.split("\\|");
                if (strArrSplit != null && strArrSplit.length >= 2) {
                    this.f53.setText(strArrSplit[0]);
                    this.f54.setText(strArrSplit[1]);
                    if (strArrSplit.length >= 3) {
                        this.f55.setText(strArrSplit[2]);
                        this.f67.requestFocus();
                    } else {
                        this.f55.requestFocus();
                    }
                }
            } else {
                this.f53.setText(this.f74);
                this.f54.setText(this.f66);
                this.f55.setText("");
                if (TextUtils.isEmpty(this.f74)) {
                    this.f53.requestFocus();
                } else if (TextUtils.isEmpty(this.f66)) {
                    this.f54.requestFocus();
                } else {
                    this.f55.requestFocus();
                }
            }
            this.f63 = true;
        }
        this.f67.setText("");
        if (adw.C0012.f540.m366(this.f64) != null) {
            this.f55.setVisibility(8);
        } else {
            this.f55.setVisibility(0);
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(aca.Cif.wrapper_attachments);
        viewGroup.removeAllViews();
        if (this.f59 != null) {
            Iterator<Uri> it = this.f59.iterator();
            while (it.hasNext()) {
                viewGroup.addView(new aee(this, viewGroup, it.next(), true));
            }
        }
        this.f71 = (Button) findViewById(aca.Cif.button_attachment);
        this.f71.setOnClickListener(this);
        registerForContextMenu(this.f71);
        this.f77 = (Button) findViewById(aca.Cif.button_send);
        this.f77.setOnClickListener(this);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m155() {
        this.f73 = adw.C0012.f540.m366(this);
        if (this.f73 == null || this.f62) {
            m159(false);
        } else {
            m159(true);
            m156(this.f78, null, null, null, null, null, this.f73, this.f72, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 鷭, reason: contains not printable characters */
    private void m156(String str, String str2, String str3, String str4, String str5, List<Uri> list, String str6, Handler handler, boolean z) {
        this.f68 = new ado(this.f64, str, str2, str3, str4, str5, list, str6, handler, z);
        adp.m350(this.f68);
    }
}
