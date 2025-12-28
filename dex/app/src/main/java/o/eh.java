package o;

import android.support.v4.view.ViewPager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class eh extends ll {

    /* renamed from: 鷭, reason: contains not printable characters */
    ViewPager f1174;

    eh() {
        super(2130903115);
        this.f1174 = (ViewPager) this.f1994.findViewById(2131296321);
        LinkedList linkedList = new LinkedList();
        for (mu muVar : mu.valuesCustom()) {
            linkedList.add(new C0033(muVar));
        }
        this.f1174.setAdapter(new ao(linkedList));
        this.f1174.addOnPageChangeListener(new ei(this));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m579(mu muVar) {
        C0033 c0033 = (C0033) ((ao) this.f1174.getAdapter()).f682.get(muVar.ordinal());
        if (!c0033.f1180) {
            C0358.f6671.mo454(new C0185(muVar, 0L));
            c0033.f1180 = true;
        }
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        m579(mu.valuesCustom()[this.f1174.getCurrentItem()]);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        C0358.f6671.mo454(new C0184());
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m578(ArrayList<C0803> arrayList) {
        for (mu muVar : mu.valuesCustom()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<C0803> it = arrayList.iterator();
            while (it.hasNext()) {
                C0803 next = it.next();
                if (next.f7868 == muVar) {
                    arrayList2.add(new C0034(next));
                }
            }
            C0033 c0033 = (C0033) ((ao) this.f1174.getAdapter()).f682.get(muVar.ordinal());
            if (arrayList2.size() > 0) {
                c0033.f1180 = true;
                c0033.f1178.setAdapter((ListAdapter) new Cif((C0034[]) arrayList2.toArray(new C0034[arrayList2.size()])));
            }
        }
    }

    /* renamed from: o.eh$櫯, reason: contains not printable characters */
    static class C0033 extends ap {

        /* renamed from: Ą, reason: contains not printable characters */
        Button f1175;

        /* renamed from: ą, reason: contains not printable characters */
        Button f1176;

        /* renamed from: Ć, reason: contains not printable characters */
        Button f1177;

        /* renamed from: ȃ, reason: contains not printable characters */
        ListView f1178;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        TextView f1179;

        /* renamed from: 櫯, reason: contains not printable characters */
        boolean f1180;

        /* renamed from: 鷭, reason: contains not printable characters */
        mu f1181;

        C0033(mu muVar) {
            super(2130903119);
            this.f1181 = muVar;
            this.f1179 = (TextView) this.f683.findViewById(2131296265);
            this.f1179.setText(this.f1181.name());
            this.f1175 = (Button) this.f683.findViewById(2131296279);
            this.f1176 = (Button) this.f683.findViewById(2131296300);
            this.f1177 = (Button) this.f683.findViewById(2131296483);
            this.f1178 = (ListView) this.f683.findViewById(2131296332);
            this.f1178.setOnItemClickListener(new ej(this));
            this.f1177.setOnClickListener(new ek(this));
        }
    }

    /* renamed from: o.eh$if, reason: invalid class name */
    static class Cif extends C1019<C0034> {
        Cif(C0034[] c0034Arr) {
            super(c0034Arr);
        }
    }

    /* renamed from: o.eh$鷭, reason: contains not printable characters */
    static class C0034 extends AbstractC0733 {

        /* renamed from: Ą, reason: contains not printable characters */
        TextView f1182;

        /* renamed from: ȃ, reason: contains not printable characters */
        ImageView f1183;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        TextView f1184;

        /* renamed from: 櫯, reason: contains not printable characters */
        ImageView f1185;

        /* renamed from: 鷭, reason: contains not printable characters */
        C0803 f1186;

        C0034(C0803 c0803) {
            super(2130903116);
            this.f1186 = c0803;
        }

        @Override // o.AbstractC0733
        /* renamed from: 鷭 */
        final void mo485() {
            String str;
            String str2;
            this.f1185 = (ImageView) this.f7711.findViewById(2131296297);
            this.f1183 = (ImageView) this.f7711.findViewById(2131296349);
            this.f1184 = (TextView) this.f7711.findViewById(2131296265);
            this.f1182 = (TextView) this.f7711.findViewById(2131296259);
            if ((this.f1186.f7865 & 4) > 0 && (this.f1186.f7865 & 2) > 0) {
                str = "icon_zeny_n_item";
            } else if ((this.f1186.f7865 & 4) > 0) {
                str = "icon_item";
            } else if ((this.f1186.f7865 & 2) > 0) {
                str = "icon_zeny";
            } else {
                str = null;
            }
            C0358.f6674.f42.m730(this.f1185, "data\\texture\\" + C0358.f6685.f1030.f982.f8938.f8962 + "\\basic_interface\\rodexsystem\\renewal\\" + (this.f1186.f7866 ? "icon_status_mail_read" : "icon_status_mail_received") + ".bmp", null, null);
            C0358.f6674.f42.m730(this.f1183, str != null ? "data\\texture\\" + C0358.f6685.f1030.f982.f8938.f8962 + "\\basic_interface\\rodexsystem\\renewal\\" + str + ".bmp" : null, null, null);
            this.f1184.setText(String.valueOf(this.f1186.f7864) + "\n" + this.f1186.f7861);
            if (this.f1186.f7863 >= 86400) {
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(2853);
                str2 = String.format(strM649 == null ? "MSG2853" : strM649, Integer.valueOf(this.f1186.f7863 / 86400));
            } else if (this.f1186.f7863 >= 3600) {
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(2852);
                str2 = String.format(strM6492 == null ? "MSG2852" : strM6492, Integer.valueOf(this.f1186.f7863 / 3600));
            } else {
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(2851);
                str2 = String.format(strM6493 == null ? "MSG2851" : strM6493, Integer.valueOf(this.f1186.f7863 / 60));
            }
            if (this.f1186.f7862 > 0) {
                str2 = "r: " + new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(System.currentTimeMillis() - (this.f1186.f7862 * 1000))) + "\ndel:" + str2;
            }
            this.f1182.setText(str2);
        }
    }
}
