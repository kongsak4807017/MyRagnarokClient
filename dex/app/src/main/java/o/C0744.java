package o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.柫, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0744 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f7719;

    /* renamed from: ą, reason: contains not printable characters */
    boolean f7720;

    /* renamed from: Ć, reason: contains not printable characters */
    View.OnClickListener f7721;

    /* renamed from: ȃ, reason: contains not printable characters */
    Button f7722;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Button f7723;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f7724;

    /* renamed from: 鷭, reason: contains not printable characters */
    C0745[] f7725;

    /* renamed from: o.柫$鷭, reason: contains not printable characters */
    class C0745 {

        /* renamed from: Ą, reason: contains not printable characters */
        TextView f7726;

        /* renamed from: ą, reason: contains not printable characters */
        int f7727;

        /* renamed from: Ć, reason: contains not printable characters */
        int f7728 = -1;

        /* renamed from: ȃ, reason: contains not printable characters */
        TextView f7730;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        ImageView f7731;

        /* renamed from: 櫯, reason: contains not printable characters */
        ImageView f7732;

        /* renamed from: 鷭, reason: contains not printable characters */
        View f7733;

        C0745(View view, int i, String str) {
            this.f7733 = (RelativeLayout) view.findViewById(i);
            this.f7732 = (ImageView) this.f7733.findViewById(2131296297);
            this.f7731 = (ImageView) this.f7733.findViewById(2131296349);
            this.f7730 = (TextView) this.f7733.findViewById(2131296259);
            this.f7726 = (TextView) this.f7733.findViewById(2131296265);
            this.f7726.setText(str);
            this.f7730.setText((CharSequence) null);
        }
    }

    C0744(LayoutInflater layoutInflater) {
        super(2130903058);
        this.f7725 = new C0745[aux.HEAD_TOP_COSTUME.ordinal()];
        this.f7721 = new ViewOnClickListenerC0453(this);
        this.f7725[aux.ACC_L.ordinal()] = new C0745(this.f1994, 2131296343, "accessory");
        this.f7725[aux.ACC_R.ordinal()] = new C0745(this.f1994, 2131296345, "accessory");
        this.f7725[aux.SHOES.ordinal()] = new C0745(this.f1994, 2131296344, "shoes");
        this.f7725[aux.GARMENT.ordinal()] = new C0745(this.f1994, 2131296342, "robe");
        this.f7725[aux.HEAD_LOW.ordinal()] = new C0745(this.f1994, 2131296337, "head");
        this.f7725[aux.HEAD_MID.ordinal()] = new C0745(this.f1994, 2131296339, "head");
        this.f7725[aux.HEAD_TOP.ordinal()] = new C0745(this.f1994, 2131296338, "head");
        this.f7725[aux.ARMOR.ordinal()] = new C0745(this.f1994, 2131296340, "body");
        this.f7725[aux.HAND_L.ordinal()] = new C0745(this.f1994, 2131296341, "L-hand");
        this.f7725[aux.HAND_R.ordinal()] = new C0745(this.f1994, 2131296336, "R-hand");
        this.f7725[aux.AMMO.ordinal()] = new C0745(this.f1994, 2131296346, "ammo");
        this.f7724 = (TextView) this.f1994.findViewById(2131296347);
        this.f7719 = (TextView) this.f1994.findViewById(2131296348);
        this.f7722 = (Button) this.f1994.findViewById(2131296300);
        this.f7723 = (Button) this.f1994.findViewById(2131296279);
        this.f7722.setOnClickListener(new ViewOnClickListenerC0520(this));
        this.f7723.setOnClickListener(new ViewOnClickListenerC0783(this));
        this.f7722.setVisibility(4);
        for (C0745 c0745 : this.f7725) {
            c0745.f7731.setOnClickListener(this.f7721);
            c0745.f7730.setOnClickListener(this.f7721);
        }
    }

    @Override // o.ll
    /* renamed from: ą */
    final void mo772() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.addRule(13);
        layoutParams.width = -1;
        layoutParams.addRule(10);
        layoutParams.addRule(2, 2131296413);
        this.f1994.setLayoutParams(layoutParams);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1442(aux auxVar, C1008 c1008, int i) {
        if (!this.f7720 || auxVar.ordinal() >= aux.HEAD_TOP_COSTUME.ordinal()) {
            if (!this.f7720 && auxVar.ordinal() >= aux.HEAD_TOP_COSTUME.ordinal()) {
                return;
            }
            C0745 c0745 = this.f7725[(auxVar.f739 != null ? auxVar.f739 : auxVar).ordinal()];
            if (c1008 == null) {
                c0745.f7730.setText((CharSequence) null);
                c0745.f7731.setVisibility(4);
                c0745.f7727 = 0;
                c0745.f7728 = -1;
                if (auxVar == aux.AMMO) {
                    this.f7724.setText((CharSequence) null);
                    return;
                }
                return;
            }
            c0745.f7730.setText(c1008.m1592(C0358.f6685.f1030.f967));
            c0745.f7730.setTextColor(c1008.m1587());
            c0745.f7731.setVisibility(0);
            c0745.f7727 = c1008.f8502;
            c0745.f7728 = i;
            if (auxVar == aux.AMMO) {
                this.f7724.setText(String.valueOf(c1008.f8500));
            }
            je jeVar = C0358.f6674.f42;
            jeVar.m730(c0745.f7731, C0358.f6685.f1030.m510(c1008.f8502, c1008.f8491, false), jeVar.f1815, null);
        }
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m1441() {
        C1035 c1035 = C0358.f6664.f2004;
        if (c1035.f8622 == null) {
            return;
        }
        int length = aux.valuesCustom().length;
        for (int i = 0; i < length; i++) {
            boolean z = false;
            Iterator<Map.Entry<Integer, C1008>> it = c1035.f8622.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Integer, C1008> next = it.next();
                int iIntValue = next.getKey().intValue();
                C1008 value = next.getValue();
                if (value != null && value.f8490 != 0 && (aux.valuesCustom()[i].f740 & value.f8490) != 0) {
                    m1442(aux.valuesCustom()[i], value, iIntValue);
                    z = true;
                    break;
                }
            }
            if (!z) {
                m1442(aux.valuesCustom()[i], null, -1);
            }
        }
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296413)).setImageBitmap(C0358.f6674.f42.f1761[1]);
        mo772();
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296413)).setImageBitmap(C0358.f6674.f42.f1761[0]);
    }
}
