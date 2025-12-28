package o;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.util.Arrays;
import o.C1035;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hj extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    View.OnClickListener f1476;

    /* renamed from: ȃ, reason: contains not printable characters */
    AdapterView.OnItemClickListener f1477;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    EnumC0047 f1478;

    /* renamed from: 櫯, reason: contains not printable characters */
    TextView f1479;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f1480;

    /* renamed from: o.hj$鷭, reason: contains not printable characters */
    enum EnumC0047 {
        SKILL_MERC,
        SKILL_HOMUN,
        SKILL_ME,
        AUTOSPELL,
        SKILLSELECTREQUEST;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0047[] valuesCustom() {
            EnumC0047[] enumC0047ArrValuesCustom = values();
            int length = enumC0047ArrValuesCustom.length;
            EnumC0047[] enumC0047Arr = new EnumC0047[length];
            System.arraycopy(enumC0047ArrValuesCustom, 0, enumC0047Arr, 0, length);
            return enumC0047Arr;
        }
    }

    hj(LayoutInflater layoutInflater) {
        super(2130903133);
        this.f1477 = new hk(this);
        this.f1476 = new hl(this);
        this.f1480 = (ListView) this.f1994.findViewById(2131296332);
        this.f1479 = (TextView) this.f1994.findViewById(2131296265);
        this.f1480.setOnItemClickListener(this.f1477);
        this.f1480.setSelector(2131165196);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m619(int i) {
        if (this.f1478 == EnumC0047.SKILL_HOMUN || this.f1478 == EnumC0047.SKILL_ME || this.f1478 == EnumC0047.SKILL_MERC) {
            C0358.f6674.f42.f1739.f1443 = ((hm) this.f1480.getAdapter()).f1491[i].f3344;
            C0358.f6674.f42.f1739.h_();
        } else if (this.f1478 == EnumC0047.AUTOSPELL) {
            C0358.f6671.mo454(new C0198(((hm) this.f1480.getAdapter()).f1491[i].f3344.f1409));
            C0358.f6674.f42.f1800.mo439();
        } else if (this.f1478 == EnumC0047.SKILLSELECTREQUEST) {
            C0358.f6671.mo454(new C0200((short) ((hm) this.f1480.getAdapter()).f1491[i].f3344.f1409));
            C0358.f6674.f42.f1800.mo439();
        }
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final synchronized void m618() {
        if (this.f1994.getParent() != null) {
            C1035.C1036 c1036 = null;
            if (this.f1478 == EnumC0047.SKILL_HOMUN && C0358.f6664.f2004.f8618 != null) {
                this.f1479.setText("Skill Point : " + ((int) C0358.f6664.f2004.f8618.f8668));
                c1036 = C0358.f6664.f2004.f8618.f8666;
            }
            if (this.f1478 == EnumC0047.SKILL_MERC && C0358.f6664.f2004.f8632 != null) {
                this.f1479.setText("Skill Point : " + ((int) C0358.f6664.f2004.f8632.f8668));
                c1036 = C0358.f6664.f2004.f8632.f8666;
            } else if (this.f1478 == EnumC0047.SKILL_ME) {
                this.f1479.setText("Skill Point : " + C0358.f6664.f2004.f8621);
                c1036 = C0358.f6664.f2004.f8642;
            }
            if (c1036 == null) {
                return;
            }
            int i = 0;
            ol[] olVarArr = new ol[c1036.f8673.size()];
            for (gt gtVar : c1036.f8673.values()) {
                if (this.f1478 == EnumC0047.SKILL_ME) {
                    boolean zM1613 = C0358.f6664.f2004.m1613(gtVar.f1409);
                    if (gtVar.f1407 != 0 || zM1613) {
                        ol olVar = new ol();
                        olVar.f3344 = gtVar;
                        olVar.f3343 = C0358.f6685.f1030.f968.m613(gtVar.f1409);
                        if (C0358.f6664.f2004.f8621 > 0) {
                            olVar.f3342 = zM1613;
                        }
                        int i2 = i;
                        i++;
                        olVarArr[i2] = olVar;
                    }
                } else if (this.f1478 == EnumC0047.SKILL_HOMUN) {
                    ol olVar2 = new ol();
                    olVar2.f3344 = gtVar;
                    olVar2.f3343 = C0358.f6685.f1030.f968.m613(gtVar.f1409);
                    if (C0358.f6664.f2004.f8618.f8668 > 0) {
                        olVar2.f3342 = c1036.f8673.get(Integer.valueOf(gtVar.f1409)).f1405;
                    }
                    int i3 = i;
                    i++;
                    olVarArr[i3] = olVar2;
                } else if (this.f1478 == EnumC0047.SKILL_MERC) {
                    ol olVar3 = new ol();
                    olVar3.f3344 = gtVar;
                    olVar3.f3343 = C0358.f6685.f1030.f968.m613(gtVar.f1409);
                    if (C0358.f6664.f2004.f8632.f8668 > 0) {
                        olVar3.f3342 = c1036.f8673.get(Integer.valueOf(gtVar.f1409)).f1405;
                    }
                    int i4 = i;
                    i++;
                    olVarArr[i4] = olVar3;
                }
            }
            this.f1480.setAdapter((ListAdapter) new hm((ol[]) Arrays.copyOf(olVarArr, i), this.f1476));
        }
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        m618();
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296411)).setImageBitmap(C0358.f6674.f42.f1760[1]);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296411)).setImageBitmap(C0358.f6674.f42.f1760[0]);
    }
}
