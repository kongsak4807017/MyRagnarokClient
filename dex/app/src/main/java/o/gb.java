package o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import o.ge;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gb {

    /* renamed from: Ą, reason: contains not printable characters */
    Bitmap f1304;

    /* renamed from: ą, reason: contains not printable characters */
    RelativeLayout f1305;

    /* renamed from: Ć, reason: contains not printable characters */
    TextView f1306;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f1307;

    /* renamed from: ȃ, reason: contains not printable characters */
    C1008 f1308;

    /* renamed from: Ȋ, reason: contains not printable characters */
    ge.EnumC0041 f1309;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f1310;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    TextView f1311;

    /* renamed from: 岱, reason: contains not printable characters */
    ImageView f1312;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f1313;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f1314;

    gb(c_activity c_activityVar, C1008 c1008, int i, int i2, int i3, ge.EnumC0041 enumC0041) {
        this.f1309 = enumC0041;
        this.f1308 = c1008.m1589();
        this.f1314 = i;
        this.f1313 = i2;
        this.f1310 = i3;
        String strM510 = C0358.f6685.f1030.m510(this.f1308.f8502, true, false);
        Bitmap bitmap = c_activityVar.f42.f1790.get(strM510);
        if (bitmap != null) {
            this.f1304 = bitmap;
        } else {
            this.f1304 = c_activityVar.f42.f1815;
            C0358.f6685.mo139(new gc(this, c_activityVar, strM510));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m597(RelativeLayout relativeLayout) {
        this.f1305 = relativeLayout;
        if (this.f1305 == null) {
            return;
        }
        this.f1306 = (TextView) this.f1305.findViewById(2131296390);
        this.f1307 = (TextView) this.f1305.findViewById(2131296392);
        this.f1311 = (TextView) this.f1305.findViewById(2131296391);
        this.f1312 = (ImageView) this.f1305.findViewById(2131296389);
        this.f1312.setImageBitmap(this.f1304);
        this.f1306.setText(this.f1308.m1592(C0358.f6685.f1030.f967));
        this.f1306.setTextColor(this.f1308.m1587());
        this.f1307.setText(String.valueOf(this.f1308.f8500));
        if (this.f1308.f8500 > 0) {
            this.f1307.setVisibility(0);
            this.f1305.setEnabled(true);
            this.f1312.setEnabled(true);
            this.f1306.setEnabled(true);
        } else if (this.f1308.f8500 < 0) {
            this.f1307.setVisibility(4);
            this.f1305.setEnabled(true);
            this.f1312.setEnabled(true);
            this.f1306.setEnabled(true);
        } else if (this.f1308.f8500 == 0) {
            this.f1305.setEnabled(false);
            this.f1312.setEnabled(false);
            this.f1306.setEnabled(false);
        }
        String str = this.f1309 == ge.EnumC0041.CASHSHOP ? "CP" : "Z";
        if (this.f1313 == this.f1310) {
            this.f1311.setText(String.valueOf(pa.m973(this.f1313)) + " " + str);
        } else {
            this.f1311.setText(String.valueOf(pa.m973(this.f1313)) + " -> " + pa.m973(this.f1310) + " " + str);
        }
    }
}
