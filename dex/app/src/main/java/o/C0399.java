package o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: o.ҏ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0399 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    ListView f6758;

    /* renamed from: ą, reason: contains not printable characters */
    ListView f6759;

    /* renamed from: Ć, reason: contains not printable characters */
    ListView f6760;

    /* renamed from: ć, reason: contains not printable characters */
    TextView f6761;

    /* renamed from: ċ, reason: contains not printable characters */
    CheckBox f6762;

    /* renamed from: đ, reason: contains not printable characters */
    AdapterView.OnItemClickListener f6763;

    /* renamed from: Ē, reason: contains not printable characters */
    View.OnClickListener f6764;

    /* renamed from: ē, reason: contains not printable characters */
    private AdapterView.OnItemClickListener f6765;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f6766;

    /* renamed from: Ȋ, reason: contains not printable characters */
    Button f6767;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f6768;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    TextView f6769;

    /* renamed from: ܕ, reason: contains not printable characters */
    int f6770;

    /* renamed from: 䒧, reason: contains not printable characters */
    int f6771;

    /* renamed from: 岱, reason: contains not printable characters */
    TextView f6772;

    /* renamed from: 庸, reason: contains not printable characters */
    int f6773;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f6774;

    /* renamed from: 纫, reason: contains not printable characters */
    int f6775;

    /* renamed from: 躆, reason: contains not printable characters */
    int f6776;

    /* renamed from: 鷭, reason: contains not printable characters */
    C0906 f6777;

    C0399(LayoutInflater layoutInflater) {
        super(2130903041);
        this.f6775 = 0;
        this.f6771 = 0;
        this.f6776 = 0;
        this.f6763 = new C0416(this);
        this.f6765 = new C0731(this);
        this.f6764 = new ViewOnClickListenerC0470(this);
        this.f6766 = (TextView) this.f1994.findViewById(2131296284);
        this.f6768 = (TextView) this.f1994.findViewById(2131296259);
        this.f6774 = (TextView) this.f1994.findViewById(2131296282);
        this.f6761 = (TextView) this.f1994.findViewById(2131296277);
        this.f6769 = (TextView) this.f1994.findViewById(2131296265);
        this.f6772 = (TextView) this.f1994.findViewById(2131296276);
        this.f6760 = (ListView) this.f1994.findViewById(2131296285);
        this.f6759 = (ListView) this.f1994.findViewById(2131296281);
        this.f6758 = (ListView) this.f1994.findViewById(2131296283);
        this.f6762 = (CheckBox) this.f1994.findViewById(2131296278);
        this.f6767 = (Button) this.f1994.findViewById(2131296279);
        this.f6767.setOnClickListener(new ViewOnClickListenerC0759(this));
        this.f6777 = new C0906(null, true, "1", this.f6764);
        this.f6760.setOnItemClickListener(this.f6763);
        this.f6758.setOnItemClickListener(this.f6765);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1319(int i) {
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1998);
        String str = strM649 == null ? "MSG1998" : strM649;
        String str2 = str;
        if (str.contains("%s")) {
            this.f6769.setText(String.format(str2, pa.m973(i)));
        } else if (str2.contains("%d")) {
            this.f6769.setText(String.format(str2, Integer.valueOf(i)));
        } else {
            this.f6769.setText(String.format("Zeny : %s", pa.m973(i)));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1320(int i, int i2) {
        C0927 c0927 = (C0927) this.f6760.getAdapter();
        C0927 c09272 = (C0927) this.f6758.getAdapter();
        C0927 c09273 = (C0927) this.f6759.getAdapter();
        C0603 c0603 = c0927.f8218.get(i);
        if (c0603.f7409.f8500 == 0) {
            return;
        }
        if (c0603.f7409.f8500 - i2 < 0) {
            i2 = c0603.f7409.f8500;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= c09273.f8218.size()) {
                break;
            }
            if (c09273.f8218.get(i4).f7409.f8502 != c0927.f8218.get(i).f7409.f8502) {
                i4++;
            } else {
                i3 = i4;
                break;
            }
        }
        if (c09273.f8218.get(i3).f7409.f8500 < i2) {
            i2 = c09273.f8218.get(i3).f7409.f8500;
        }
        if ((this.f6771 - (c0603.f7408 * (i2 + 1))) - this.f6775 < 0) {
            i2 = 0;
            for (int i5 = this.f6771; i5 - c0603.f7408 >= 0; i5 -= c0603.f7408) {
                i2++;
            }
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(1740);
            c0698.m1432(String.format(strM649 == null ? "MSG1740" : strM649, Integer.valueOf(i2)), 16763080);
        }
        ArrayList<C0603> arrayList = new ArrayList<>();
        if (c09272 != null && c09272.f8218 != null) {
            arrayList = c09272.f8218;
        }
        boolean z = false;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            if (arrayList.get(i6).f7409.f8502 == c0603.f7409.f8502 && c0603.f7409.m1585()) {
                z = true;
            }
        }
        if (!z) {
            arrayList.add(new C0603(c0603.f7409.m1589(), c0603.f7408, i3));
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7).f7409.f8502 == c0603.f7409.f8502 || i2 < arrayList.get(i7).f7409.f8500 || c0603.f7409.f8500 > 0) {
                    this.f6775 += c0603.f7408 * i2;
                    c0603.f7409.f8500 -= i2;
                    if (c0603.f7409.f8500 < 0) {
                        return;
                    }
                    arrayList.get(i7).f7409.f8500 = i2;
                    this.f6771 -= this.f6775;
                    TextView textView = this.f6761;
                    cv cvVar2 = C0358.f6685;
                    String strM6492 = C0358.f6687.m649(1857);
                    textView.setText(String.valueOf(strM6492 == null ? "MSG1857" : strM6492) + " " + pa.m973(this.f6771) + " Z");
                    m1319(C0358.f6664.f2004.f8636 + this.f6775);
                    d_();
                    c0603.m1380(c0603.f7401, true);
                    this.f6758.setAdapter((ListAdapter) new C0927(arrayList));
                }
            }
            this.f6758.setAdapter((ListAdapter) new C0927(arrayList));
        }
    }

    final void d_() {
        String str;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1736);
        String str2 = strM649 == null ? "MSG1736" : strM649;
        String str3 = str2;
        if (str2.contains("%s")) {
            str = String.format(str3, pa.m973(this.f6775));
        } else if (str3.contains("%d")) {
            str = String.format(str3, Integer.valueOf(this.f6775));
        } else {
            str = "Price limit: " + pa.m973(this.f6775);
        }
        this.f6772.setText(str);
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
