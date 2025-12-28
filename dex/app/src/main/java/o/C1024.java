package o;

import android.app.AlertDialog;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: o.됚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C1024 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    private ImageView f8534;

    /* renamed from: ą, reason: contains not printable characters */
    private ImageView[] f8535;

    /* renamed from: Ć, reason: contains not printable characters */
    private boolean[] f8536;

    /* renamed from: ć, reason: contains not printable characters */
    private boolean[] f8537;

    /* renamed from: ȃ, reason: contains not printable characters */
    private TextView[] f8538;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private View.OnLongClickListener f8539;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private TextView f8540;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private View f8541;

    /* renamed from: 岱, reason: contains not printable characters */
    private View.OnClickListener f8542;

    /* renamed from: 櫯, reason: contains not printable characters */
    private TextView f8543;

    /* renamed from: 鷭, reason: contains not printable characters */
    C1008 f8544;

    C1024(LayoutInflater layoutInflater) {
        super(2130903088);
        this.f8538 = new TextView[5];
        this.f8535 = new ImageView[4];
        this.f8536 = new boolean[4];
        this.f8537 = new boolean[5];
        this.f8542 = new ViewOnClickListenerC1022(this);
        this.f8539 = new ViewOnLongClickListenerC0945(this);
        this.f8540 = (TextView) this.f1994.findViewById(2131296265);
        this.f8543 = (TextView) this.f1994.findViewById(2131296259);
        this.f8534 = (ImageView) this.f1994.findViewById(2131296349);
        this.f8540.setMovementMethod(new ScrollingMovementMethod());
        this.f8538[0] = (TextView) this.f1994.findViewById(2131296282);
        this.f8538[1] = (TextView) this.f1994.findViewById(2131296277);
        this.f8538[2] = (TextView) this.f1994.findViewById(2131296284);
        this.f8538[3] = (TextView) this.f1994.findViewById(2131296302);
        this.f8538[4] = (TextView) this.f1994.findViewById(2131296276);
        this.f8541 = this.f1994.findViewById(2131296256);
        this.f8535[0] = (ImageView) this.f1994.findViewWithTag("card1");
        this.f8535[1] = (ImageView) this.f1994.findViewWithTag("card2");
        this.f8535[2] = (ImageView) this.f1994.findViewWithTag("card3");
        this.f8535[3] = (ImageView) this.f1994.findViewWithTag("card4");
        this.f8535[0].setOnClickListener(this.f8542);
        this.f8535[1].setOnClickListener(this.f8542);
        this.f8535[2].setOnClickListener(this.f8542);
        this.f8535[3].setOnClickListener(this.f8542);
        this.f8535[0].setOnLongClickListener(this.f8539);
        this.f8535[1].setOnLongClickListener(this.f8539);
        this.f8535[2].setOnLongClickListener(this.f8539);
        this.f8535[3].setOnLongClickListener(this.f8539);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ void m1600(C1024 c1024, View view) {
        for (int i = 0; i < 4; i++) {
            int i2 = i;
            if (c1024.f8535[i] == view && c1024.f8536[i]) {
                AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
                builder.setTitle(new C1008((short) c1024.f8544.f8499[i]).m1588());
                builder.setItems(new String[]{"View description"}, new DialogInterfaceOnClickListenerC0891(c1024, i2));
                builder.show();
                return;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1601(C1008 c1008) {
        this.f8544 = c1008.m1589();
        C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(c1008.f8502);
        if (c0432M1648 == null) {
            return;
        }
        this.f8540.setText(je.m710(!c1008.f8491 ? "Unknown item, requires identification. Use Magnifier to identify an item." : c0432M1648.f6852, false));
        this.f8543.setText(c0432M1648.m1328(c1008.f8491));
        for (int i = 0; i < 4; i++) {
            this.f8536[i] = false;
        }
        C0432 c0432M16482 = C0358.f6685.f1030.f967.m1648(c1008.f8502);
        int i2 = c0432M16482 == null ? -1 : c0432M16482.f6849;
        je jeVar = C0358.f6674.f42;
        jeVar.m730(this.f8534, C0358.f6685.f1030.m510(c1008.f8502, c1008.f8491, true), jeVar.f1815, null);
        if (c1008.f8491 && !c1008.m1585() && !c1008.m1586()) {
            this.f8541.setVisibility(0);
            for (int i3 = 0; i3 < 4; i3++) {
                this.f8535[i3].setVisibility(0);
                if (c1008.f8499[i3] != 0) {
                    je jeVar2 = C0358.f6674.f42;
                    ImageView imageView = this.f8535[i3];
                    C1008 c10082 = new C1008((short) c1008.f8499[i3], 1, true);
                    jeVar2.m730(imageView, C0358.f6685.f1030.m510(c10082.f8502, c10082.f8491, false), jeVar2.f1815, null);
                    this.f8536[i3] = true;
                } else if (i3 < i2) {
                    this.f8535[i3].setImageBitmap(C0358.f6685.f1032);
                } else {
                    this.f8535[i3].setImageBitmap(C0358.f6685.f1025);
                }
            }
        } else {
            this.f8541.setVisibility(8);
            for (int i4 = 0; i4 < 4; i4++) {
                this.f8535[i4].setVisibility(8);
            }
        }
        if (!C0358.f6667.f4785 || c1008.f8498 == null) {
            for (int i5 = 0; i5 < 5; i5++) {
                this.f8538[i5].setVisibility(8);
            }
            return;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < 5; i7++) {
            String strM1591 = c1008.m1591(i7);
            if (strM1591 != null) {
                this.f8538[i6].setText(strM1591);
                i6++;
            }
        }
        while (i6 < 5) {
            this.f8538[i6].setVisibility(8);
            i6++;
        }
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
