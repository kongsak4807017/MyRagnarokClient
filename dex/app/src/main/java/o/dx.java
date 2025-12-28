package o;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dx extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView[] f1128;

    /* renamed from: ą, reason: contains not printable characters */
    ImageView f1129;

    /* renamed from: Ć, reason: contains not printable characters */
    EditText f1130;

    /* renamed from: ć, reason: contains not printable characters */
    Button f1131;

    /* renamed from: ċ, reason: contains not printable characters */
    C1008[] f1132;

    /* renamed from: ȃ, reason: contains not printable characters */
    ImageView[] f1133;

    /* renamed from: Ȋ, reason: contains not printable characters */
    long f1134;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f1135;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    C0803 f1136;

    /* renamed from: 岱, reason: contains not printable characters */
    String f1137;

    /* renamed from: 櫯, reason: contains not printable characters */
    EditText f1138;

    /* renamed from: 鷭, reason: contains not printable characters */
    EditText f1139;

    public dx() {
        super(2130903117);
        this.f1133 = new ImageView[5];
        this.f1128 = new TextView[5];
        this.f1139 = (EditText) this.f1994.findViewById(2131296470);
        this.f1138 = (EditText) this.f1994.findViewById(2131296462);
        this.f1135 = (TextView) this.f1994.findViewById(2131296461);
        this.f1133[0] = (ImageView) this.f1994.findViewById(2131296297);
        this.f1133[1] = (ImageView) this.f1994.findViewById(2131296349);
        this.f1133[2] = (ImageView) this.f1994.findViewById(2131296398);
        this.f1133[3] = (ImageView) this.f1994.findViewById(2131296399);
        this.f1133[4] = (ImageView) this.f1994.findViewById(2131296400);
        this.f1128[0] = (TextView) this.f1994.findViewById(2131296464);
        this.f1128[1] = (TextView) this.f1994.findViewById(2131296465);
        this.f1128[2] = (TextView) this.f1994.findViewById(2131296466);
        this.f1128[3] = (TextView) this.f1994.findViewById(2131296467);
        this.f1128[4] = (TextView) this.f1994.findViewById(2131296468);
        this.f1129 = (ImageView) this.f1994.findViewById(2131296471);
        this.f1130 = (EditText) this.f1994.findViewById(2131296290);
        this.f1131 = (Button) this.f1994.findViewById(2131296279);
        C0358.f6674.f42.m730(this.f1129, "data\\texture\\" + C0358.f6685.f1030.f982.f8938.f8962 + "\\basic_interface\\rodexsystem\\renewal\\icon_zeny.bmp", null, null);
        this.f1131.setOnClickListener(new dy(this));
        dz dzVar = new dz(this);
        for (ImageView imageView : this.f1133) {
            imageView.setOnClickListener(dzVar);
        }
        ea eaVar = new ea(this);
        this.f1129.setOnClickListener(eaVar);
        this.f1130.setOnClickListener(eaVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m570(long j) {
        this.f1134 = j;
        this.f1130.setText(String.valueOf(pa.m973(j)) + " Z");
        if (j > 0) {
            this.f1129.setColorFilter((ColorFilter) null);
            this.f1129.setAlpha(255);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f1129.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f1129.setAlpha(128);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m571(C1008[] c1008Arr) {
        this.f1132 = c1008Arr;
        for (int i = 0; i < this.f1133.length; i++) {
            if (i < c1008Arr.length) {
                je jeVar = C0358.f6674.f42;
                ImageView imageView = this.f1133[i];
                C1008 c1008 = c1008Arr[i];
                jeVar.m730(imageView, C0358.f6685.f1030.m510(c1008.f8502, c1008.f8491, false), jeVar.f1815, null);
                if (c1008Arr[i].f8500 > 1) {
                    this.f1128[i].setVisibility(0);
                    this.f1128[i].setText(String.valueOf(c1008Arr[i].f8500));
                } else {
                    this.f1128[i].setVisibility(4);
                }
            } else {
                this.f1133[i].setImageBitmap(null);
                this.f1128[i].setVisibility(4);
            }
        }
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        mo772();
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
