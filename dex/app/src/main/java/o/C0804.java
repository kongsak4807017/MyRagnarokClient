package o;

import android.R;
import android.graphics.Bitmap;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.http.HttpStatus;

/* renamed from: o.癵, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0804 extends ku {

    /* renamed from: Ą, reason: contains not printable characters */
    ViewPager f7869;

    /* renamed from: ą, reason: contains not printable characters */
    C0805 f7870;

    /* renamed from: Ć, reason: contains not printable characters */
    int f7871;

    /* renamed from: ć, reason: contains not printable characters */
    private View.OnClickListener f7872 = new ViewOnClickListenerC1061(this);

    /* renamed from: ȃ, reason: contains not printable characters */
    Button f7873;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f7874;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f7875;

    /* renamed from: 鷭, reason: contains not printable characters */
    public RelativeLayout f7876;

    C0804() {
    }

    /* renamed from: o.癵$ˮ͈, reason: contains not printable characters */
    class C0806 extends ap {

        /* renamed from: Ą, reason: contains not printable characters */
        Button f7893;

        /* renamed from: ą, reason: contains not printable characters */
        Button f7894;

        /* renamed from: Ć, reason: contains not printable characters */
        Button f7895;

        /* renamed from: ć, reason: contains not printable characters */
        Button f7896;

        /* renamed from: ċ, reason: contains not printable characters */
        TextView[] f7897;

        /* renamed from: đ, reason: contains not printable characters */
        int f7898;

        /* renamed from: Ē, reason: contains not printable characters */
        C0805 f7899;

        /* renamed from: ē, reason: contains not printable characters */
        CompoundButton.OnCheckedChangeListener f7900;

        /* renamed from: ė, reason: contains not printable characters */
        private View.OnClickListener f7901;

        /* renamed from: ȃ, reason: contains not printable characters */
        ImageView f7902;

        /* renamed from: Ȋ, reason: contains not printable characters */
        SeekBar f7903;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        EditText f7904;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        SeekBar f7905;

        /* renamed from: ܕ, reason: contains not printable characters */
        RadioButton f7906;

        /* renamed from: 䒧, reason: contains not printable characters */
        RadioButton f7908;

        /* renamed from: 岱, reason: contains not printable characters */
        SeekBar f7909;

        /* renamed from: 庸, reason: contains not printable characters */
        int f7910;

        /* renamed from: 櫯, reason: contains not printable characters */
        Button f7911;

        /* renamed from: 纫, reason: contains not printable characters */
        RadioButton f7912;

        /* renamed from: 躆, reason: contains not printable characters */
        RadioButton f7913;

        /* renamed from: 鷭, reason: contains not printable characters */
        TextView f7914;

        /* renamed from: 띥, reason: contains not printable characters */
        CompoundButton.OnCheckedChangeListener f7915;

        C0806(C0805 c0805) {
            super(2130903046);
            this.f7897 = new TextView[6];
            this.f7910 = 0;
            this.f7898 = 1;
            this.f7900 = new C0829(this);
            this.f7915 = new C0403(this);
            this.f7901 = new ViewOnClickListenerC0987(this);
            this.f7899 = c0805;
            this.f7914 = (TextView) this.f683.findViewById(2131296304);
            this.f7902 = (ImageView) this.f683.findViewById(2131296314);
            this.f7895 = (Button) this.f683.findViewById(2131296315);
            this.f7896 = (Button) this.f683.findViewById(2131296310);
            this.f7893 = (Button) this.f683.findViewById(2131296308);
            this.f7894 = (Button) this.f683.findViewById(2131296309);
            this.f7911 = (Button) this.f683.findViewById(2131296305);
            this.f7904 = (EditText) this.f683.findViewById(2131296306);
            this.f7905 = (SeekBar) this.f683.findViewById(2131296313);
            this.f7909 = (SeekBar) this.f683.findViewById(2131296312);
            this.f7903 = (SeekBar) this.f683.findViewById(2131296311);
            this.f7897[0] = (TextView) this.f683.findViewById(2131296265);
            this.f7897[1] = (TextView) this.f683.findViewById(2131296259);
            this.f7897[2] = (TextView) this.f683.findViewById(2131296282);
            this.f7897[3] = (TextView) this.f683.findViewById(2131296277);
            this.f7897[4] = (TextView) this.f683.findViewById(2131296284);
            this.f7897[5] = (TextView) this.f683.findViewById(2131296302);
            this.f7912 = (RadioButton) this.f683.findViewById(2131296316);
            this.f7908 = (RadioButton) this.f683.findViewById(2131296317);
            this.f7913 = (RadioButton) this.f683.findViewById(2131296318);
            this.f7906 = (RadioButton) this.f683.findViewById(2131296319);
            if (C0358.f6667.f4782) {
                for (TextView textView : this.f7897) {
                    textView.setVisibility(4);
                }
                this.f7905.setVisibility(4);
                this.f7909.setVisibility(4);
                this.f7903.setVisibility(4);
                if (C0358.f6667.f4816) {
                    this.f7913.setVisibility(4);
                    this.f7906.setVisibility(4);
                }
            } else {
                this.f7912.setVisibility(4);
                this.f7908.setVisibility(4);
                this.f7913.setVisibility(4);
                this.f7906.setVisibility(4);
            }
            if (EnumC0765.valuesCustom()[C0358.f6688.f6690] == EnumC0765.MALE) {
                this.f7912.setChecked(true);
                this.f7908.setChecked(false);
            } else {
                this.f7908.setChecked(true);
                this.f7912.setChecked(false);
            }
            this.f7902.setImageBitmap(null);
            this.f7895.setOnClickListener(new ViewOnClickListenerC0833(this));
            this.f7896.setOnClickListener(new ViewOnClickListenerC0854(this));
            this.f7893.setOnClickListener(new ViewOnClickListenerC0692(this));
            this.f7894.setOnClickListener(new ViewOnClickListenerC0436(this));
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(2369);
            if (strM649 != null) {
                this.f7914.setText(strM649);
            }
            this.f7912.setOnCheckedChangeListener(this.f7915);
            this.f7908.setOnCheckedChangeListener(this.f7915);
            RadioButton radioButton = this.f7912;
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(1129);
            radioButton.setText(strM6492 == null ? "MSG1129" : strM6492);
            RadioButton radioButton2 = this.f7908;
            cv cvVar3 = C0358.f6685;
            String strM6493 = C0358.f6687.m649(1130);
            radioButton2.setText(strM6493 == null ? "MSG1130" : strM6493);
            this.f7913.setOnCheckedChangeListener(this.f7900);
            this.f7906.setOnCheckedChangeListener(this.f7900);
            RadioButton radioButton3 = this.f7913;
            cv cvVar4 = C0358.f6685;
            String strM6494 = C0358.f6687.m649(3017);
            radioButton3.setText(strM6494 == null ? "MSG3017" : strM6494);
            RadioButton radioButton4 = this.f7906;
            cv cvVar5 = C0358.f6685;
            String strM6495 = C0358.f6687.m649(3019);
            radioButton4.setText(strM6495 == null ? "MSG3019" : strM6495);
            this.f7911.setOnClickListener(this.f7901);
            m1478();
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final void m1478() {
            EnumC0765 enumC0765;
            EnumC0134 enumC0134 = (C0358.f6667.f4782 && this.f7906.isChecked()) ? EnumC0134.SUMMONER : EnumC0134.NOVICE;
            if (C0358.f6667.f4782) {
                enumC0765 = this.f7912.isChecked() ? EnumC0765.MALE : EnumC0765.FEMALE;
            } else {
                enumC0765 = EnumC0765.valuesCustom()[C0358.f6688.f6690];
            }
            C0358.f6685.mo139(new RunnableC0404(this, enumC0765, enumC0134));
        }
    }

    /* renamed from: o.癵$if, reason: invalid class name */
    class Cif extends ap {

        /* renamed from: Ą, reason: contains not printable characters */
        Button f7877;

        /* renamed from: ą, reason: contains not printable characters */
        TextView f7878;

        /* renamed from: Ć, reason: contains not printable characters */
        C0807 f7879;

        /* renamed from: ċ, reason: contains not printable characters */
        private View.OnClickListener f7881;

        /* renamed from: ȃ, reason: contains not printable characters */
        Button f7882;

        /* renamed from: Ȋ, reason: contains not printable characters */
        private View.OnClickListener f7883;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        Button f7884;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        private View.OnClickListener f7885;

        /* renamed from: 岱, reason: contains not printable characters */
        private View.OnClickListener f7886;

        /* renamed from: 櫯, reason: contains not printable characters */
        TextView f7887;

        /* renamed from: 鷭, reason: contains not printable characters */
        ImageView f7888;

        Cif(C0807 c0807, boolean z, boolean z2) {
            super(2130903048);
            this.f7885 = new ViewOnClickListenerC1096(this);
            this.f7886 = new ViewOnClickListenerC0858(this);
            this.f7883 = new ViewOnClickListenerC1090(this);
            this.f7881 = new ViewOnClickListenerC1029(this);
            this.f7879 = c0807;
            this.f7888 = (ImageView) this.f683.findViewById(2131296314);
            this.f7887 = (TextView) this.f683.findViewById(2131296326);
            this.f7884 = (Button) this.f683.findViewById(2131296324);
            this.f7882 = (Button) this.f683.findViewById(2131296325);
            this.f7877 = (Button) this.f683.findViewById(2131296328);
            this.f7878 = (TextView) this.f683.findViewById(2131296327);
            this.f7888.setOnClickListener(this.f7885);
            this.f7884.setOnClickListener(this.f7886);
            this.f7882.setOnClickListener(this.f7881);
            this.f7877.setOnClickListener(this.f7883);
            if (!z2) {
                ((TextView) this.f683.findViewById(2131296307)).setVisibility(4);
            }
            this.f7888.setImageBitmap(this.f7879.f7919);
            this.f7887.setText(this.f7879.f7918);
            m1477();
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final void m1477() {
            long jCurrentTimeMillis;
            long jCurrentTimeMillis2;
            if (this.f7879.f7917.f3269 >= 1000000000) {
                long j = this.f7879.f7917.f3269 * 1000;
                jCurrentTimeMillis2 = j;
                jCurrentTimeMillis = j - System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = this.f7879.f7917.f3269 * 1000;
                jCurrentTimeMillis2 = System.currentTimeMillis() + jCurrentTimeMillis;
            }
            this.f7884.setVisibility(jCurrentTimeMillis < 1 ? 0 : 8);
            this.f7878.setVisibility(jCurrentTimeMillis > 0 ? 0 : 8);
            this.f7882.setVisibility(jCurrentTimeMillis > 0 ? 0 : 8);
            this.f7878.setText("Delete time : " + SimpleDateFormat.getInstance().format(new Date(jCurrentTimeMillis2)));
            this.f7878.setTextColor(jCurrentTimeMillis < 0 ? -16776961 : SupportMenu.CATEGORY_MASK);
        }

        /* renamed from: 櫯, reason: contains not printable characters */
        final void m1476() {
            je jeVar = C0358.f6674.f42;
            if (jeVar.f1735 != null) {
                C0358.f6674.mo139(new jt(jeVar));
            }
            C0358.f6674.mo139(new jr(jeVar, "Loading"));
            C0358.f6688.f6692 = this.f7879.f7917;
            C0358.f6687.m658("last_char_slot", 0, String.valueOf((int) this.f7879.f7917.f3266));
            if (this.f7879.f7917.f3269 != 0) {
                C0358.f6671.mo454(new C0326(this.f7879.f7917.f3294));
            }
            C0358.f6671.mo454(new C0796(this.f7879.f7917.f3266));
            if (C0358.f6674.f42.f1817.mo440()) {
                C0358.f6674.setContentView(2130903089);
            }
        }

        /* renamed from: ˮ͈, reason: contains not printable characters */
        final void m1475() {
            if (!C0358.f6667.f4780) {
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(1816);
                C0906 c0906 = new C0906(strM649 == null ? "MSG1816" : strM649, false, "19710101", null);
                c0906.f8188 = new ViewOnClickListenerC1003(this, c0906);
                c0906.m773();
                return;
            }
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(HttpStatus.SC_MULTIPLE_CHOICES);
            C0906 c09062 = new C0906(strM6492 == null ? "MSG300" : strM6492, false, null, null);
            c09062.f8188 = new ViewOnClickListenerC0488(this, c09062);
            c09062.m773();
        }
    }

    /* renamed from: o.癵$鷭, reason: contains not printable characters */
    class C0808 extends ao {
        /* renamed from: 鷭, reason: contains not printable characters */
        final ArrayList<Cif> m1480() {
            ArrayList<Cif> arrayList = new ArrayList<>();
            Iterator<ap> it = this.f682.iterator();
            while (it.hasNext()) {
                ap next = it.next();
                if (next != this.f682.get(this.f682.size() - 1)) {
                    arrayList.add((Cif) next);
                }
            }
            return arrayList;
        }

        /* renamed from: 櫯, reason: contains not printable characters */
        final ArrayList<C0807> m1479() {
            ArrayList<C0807> arrayList = new ArrayList<>();
            Iterator<Cif> it = m1480().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f7879);
            }
            return arrayList;
        }

        C0808(ArrayList<C0807> arrayList, C0805 c0805) {
            super(C0804.m1472(C0804.this, arrayList, c0805));
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ LinkedList m1472(C0804 c0804, ArrayList arrayList, C0805 c0805) {
        LinkedList linkedList = new LinkedList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0807 c0807 = (C0807) it.next();
            linkedList.add(c0804.new Cif(c0807, true, c0807 != arrayList.get(0)));
        }
        linkedList.add(c0804.new C0806(c0805));
        return linkedList;
    }

    /* renamed from: o.癵$櫯, reason: contains not printable characters */
    class C0807 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        og f7917;

        /* renamed from: 櫯, reason: contains not printable characters */
        String f7918;

        /* renamed from: 鷭, reason: contains not printable characters */
        Bitmap f7919;

        C0807() {
        }
    }

    /* renamed from: o.癵$ȃ, reason: contains not printable characters */
    class C0805 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        EnumC0134 f7890;

        /* renamed from: 櫯, reason: contains not printable characters */
        EnumC0765 f7891;

        /* renamed from: 鷭, reason: contains not printable characters */
        hr f7892;

        C0805(EnumC0134 enumC0134, EnumC0765 enumC0765) {
            this.f7891 = enumC0765;
            this.f7892 = C0358.f6685.m542(enumC0134.f6499, (byte) enumC0765.ordinal(), true);
        }
    }

    @Override // o.ku
    final void h_() {
        View viewFindViewById = ((ViewGroup) C0358.f6674.findViewById(R.id.content)).findViewById(2131296320);
        if (viewFindViewById != null && viewFindViewById == this.f7876) {
            throw new RuntimeException("Attempt to show already active pager.");
        }
        C0358.f6674.setContentView(2130903047);
        this.f7876 = (RelativeLayout) C0358.f6674.findViewById(2131296320);
        this.f7875 = (TextView) C0358.f6674.findViewById(2131296265);
        this.f7874 = (TextView) C0358.f6674.findViewById(2131296259);
        this.f7873 = (Button) C0358.f6674.findViewById(2131296279);
        this.f7869 = (ViewPager) C0358.f6674.findViewById(2131296321);
        this.f7875.setText(C0358.f6667.f4851);
        this.f7874.setText(C0358.f6681);
        this.f7873.setVisibility(C0358.f6667.f4858 ? 0 : 8);
        this.f7873.setOnClickListener(this.f7872);
        je.m704(2131296320);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1474(int i, int i2) {
        Iterator<Cif> it = ((C0808) this.f7869.getAdapter()).m1480().iterator();
        while (it.hasNext()) {
            Cif next = it.next();
            if (next.f7879.f7917.f3294 == i) {
                next.f7879.f7917.f3269 = i2;
                C0358.f6685.mo139(new RunnableC0639(this, next));
                return;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1473(int i) {
        C0808 c0808 = (C0808) this.f7869.getAdapter();
        if (c0808 == null) {
            return;
        }
        C0806 c0806 = (C0806) c0808.f682.getLast();
        ArrayList<C0807> arrayListM1479 = c0808.m1479();
        Iterator<C0807> it = arrayListM1479.iterator();
        while (it.hasNext()) {
            if (it.next().f7917.f3294 == i) {
                it.remove();
            }
        }
        this.f7869.setAdapter(new C0808(arrayListM1479, c0806.f7899));
    }

    @Override // o.ku
    /* renamed from: 櫯 */
    final boolean mo440() {
        View viewFindViewById = ((ViewGroup) C0358.f6674.findViewById(R.id.content)).findViewById(2131296320);
        return viewFindViewById != null && viewFindViewById == this.f7876;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.ku
    /* renamed from: ˮ͈ */
    public final void mo439() {
        if (!mo440()) {
            return;
        }
        if (mo440()) {
            C0358.f6674.setContentView(2130903090);
        }
        C0358.m1295();
    }
}
