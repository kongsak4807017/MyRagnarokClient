package o;

import android.R;
import android.content.pm.PackageManager;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ib extends ku {

    /* renamed from: Ą, reason: contains not printable characters */
    private Button f1573;

    /* renamed from: ą, reason: contains not printable characters */
    private Button f1574;

    /* renamed from: Ć, reason: contains not printable characters */
    private Button f1575;

    /* renamed from: ȃ, reason: contains not printable characters */
    private TextView f1577;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private TextView f1578;

    /* renamed from: 櫯, reason: contains not printable characters */
    private RelativeLayout f1581;

    /* renamed from: 鷭, reason: contains not printable characters */
    public c_activity f1582;

    /* renamed from: ć, reason: contains not printable characters */
    private View.OnClickListener f1576 = new ic(this);

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private View.OnClickListener f1579 = new id(this);

    /* renamed from: 岱, reason: contains not printable characters */
    private View.OnClickListener f1580 = new ie(this);

    ib(c_activity c_activityVar) {
        this.f1582 = c_activityVar;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    final void m664() {
        if (C0358.f6674.f39 != null) {
            this.f1577.setVisibility(0);
            this.f1577.setMovementMethod(LinkMovementMethod.getInstance());
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(311);
            this.f1577.setText(Html.fromHtml(String.valueOf(strM649 == null ? "MSG311" : strM649) + "<br><a href='" + C0358.f6674.f39 + "'>Download latest APK</a>"));
            return;
        }
        this.f1577.setVisibility(4);
    }

    @Override // o.ku
    /* renamed from: 櫯 */
    final boolean mo440() {
        View viewFindViewById = ((ViewGroup) this.f1582.findViewById(R.id.content)).findViewById(2131296320);
        return viewFindViewById != null && viewFindViewById == this.f1581;
    }

    @Override // o.ku
    public final void h_() {
        this.f1582.setContentView(2130903136);
        this.f1581 = (RelativeLayout) this.f1582.findViewById(2131296320);
        this.f1578 = (TextView) this.f1582.findViewById(2131296489);
        this.f1577 = (TextView) this.f1582.findViewById(2131296488);
        this.f1573 = (Button) this.f1582.findViewById(2131296490);
        this.f1574 = (Button) this.f1582.findViewById(2131296491);
        this.f1575 = (Button) this.f1582.findViewById(2131296492);
        this.f1573.setOnClickListener(this.f1576);
        this.f1574.setOnClickListener(this.f1579);
        this.f1575.setOnClickListener(this.f1580);
        try {
            this.f1578.setText("v" + this.f1582.getPackageManager().getPackageInfo(C0358.f6674.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        je.m704(2131296320);
        m664();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.ku
    /* renamed from: ˮ͈ */
    public final void mo439() {
    }
}
