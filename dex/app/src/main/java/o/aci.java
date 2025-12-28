package o;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import o.aca;
import org.json.JSONArray;
import org.json.JSONException;

@TargetApi(11)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class aci extends DialogFragment implements View.OnClickListener, acl {

    /* renamed from: ȃ, reason: contains not printable characters */
    private aec f382;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private String f383;

    /* renamed from: 櫯, reason: contains not printable characters */
    private JSONArray f384;

    /* renamed from: 鷭, reason: contains not printable characters */
    private adi f385;

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f383 = getArguments().getString("url");
            this.f384 = new JSONArray(getArguments().getString("versionInfo"));
            setStyle(1, R.style.Theme.Holo.Light.Dialog);
        } catch (JSONException unused) {
            dismiss();
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getActivity());
        LayoutInflater.from(getActivity()).inflate(aca.C0006.hockeyapp_fragment_update, linearLayout);
        this.f382 = new aec(getActivity(), this.f384.toString(), this);
        ((TextView) linearLayout.findViewById(aca.Cif.label_title)).setText(m309());
        TextView textView = (TextView) linearLayout.findViewById(aca.Cif.label_version);
        String str = "Version " + this.f382.m400();
        String strM399 = this.f382.m399();
        Object obj = "Unknown size";
        long jM398 = this.f382.m398();
        if (jM398 >= 0) {
            obj = String.format("%.2f", Float.valueOf(jM398 / 1048576.0f)) + " MB";
        } else {
            adp.m350(new adl(getActivity(), this.f383, new acj(this, textView, str, strM399)));
        }
        textView.setText(getString(aca.C0005.hockeyapp_update_version_details_label, new Object[]{str, strM399, obj}));
        ((Button) linearLayout.findViewById(aca.Cif.button_update)).setOnClickListener(this);
        WebView webView = (WebView) linearLayout.findViewById(aca.Cif.web_update_details);
        webView.clearCache(true);
        webView.destroyDrawingCache();
        webView.loadDataWithBaseURL("https://sdk.hockeyapp.net/", this.f382.m397(), "text/html", "utf-8", null);
        return linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (Build.VERSION.SDK_INT < 23 || getActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            m310(getActivity());
            dismiss();
        } else {
            requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
    }

    @Override // o.acl
    /* renamed from: 鷭 */
    public final int mo169() {
        try {
            return getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 128).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        } catch (NullPointerException unused2) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: 鷭, reason: contains not printable characters */
    public void m310(Activity activity) {
        this.f385 = new adi(activity, this.f383, new ack(this, activity));
        adp.m350(this.f385);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private String m309() {
        Activity activity = getActivity();
        try {
            PackageManager packageManager = activity.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(activity.getPackageName(), 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }
}
