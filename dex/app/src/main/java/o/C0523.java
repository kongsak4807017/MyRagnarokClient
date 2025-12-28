package o;

import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import o.hj;

/* renamed from: o.㙜, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0523 extends ll {

    /* renamed from: 櫯, reason: contains not printable characters */
    private static /* synthetic */ int[] f7221;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f7222;

    /* renamed from: Ć, reason: contains not printable characters */
    private static /* synthetic */ int[] m1363() {
        int[] iArr = f7221;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[Cif.valuesCustom().length];
        try {
            iArr2[Cif.ABILITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[Cif.BANK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[Cif.CHAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[Cif.EQUIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Cif.ITEMS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Cif.OPTION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[Cif.PROFILE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Cif.QUEST.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[Cif.RODEX.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[Cif.SKILL.ordinal()] = 11;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[Cif.STATUS.ordinal()] = 10;
        } catch (NoSuchFieldError unused11) {
        }
        f7221 = iArr2;
        return iArr2;
    }

    /* renamed from: o.㙜$鷭, reason: contains not printable characters */
    class C0524 extends AbstractC0733 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        Cif f7237;

        /* renamed from: 櫯, reason: contains not printable characters */
        String f7238;

        /* renamed from: 鷭, reason: contains not printable characters */
        TextView f7239;

        C0524(Cif cif) {
            super(2130903064);
            this.f7237 = cif;
            this.f7238 = cif.f7235;
        }

        @Override // o.AbstractC0733
        /* renamed from: 鷭 */
        final void mo485() {
            this.f7239 = (TextView) this.f7711.findViewById(2131296265);
            this.f7239.setText(this.f7238);
        }
    }

    /* renamed from: o.㙜$if, reason: invalid class name */
    enum Cif {
        ABILITY("Abilities"),
        BANK("Bank"),
        CHAT("Chat"),
        EQUIP("Equipment"),
        ITEMS("Inventory"),
        OPTION("Options"),
        PROFILE("Profile"),
        QUEST("Quests"),
        RODEX("Rodex"),
        STATUS("Status"),
        SKILL("Skills");


        /* renamed from: ċ, reason: contains not printable characters */
        String f7235;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Cif[] valuesCustom() {
            Cif[] cifArrValuesCustom = values();
            int length = cifArrValuesCustom.length;
            Cif[] cifArr = new Cif[length];
            System.arraycopy(cifArrValuesCustom, 0, cifArr, 0, length);
            return cifArr;
        }

        Cif(String str) {
            this.f7235 = str;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1364(Cif cif) {
        switch (m1363()[cif.ordinal()]) {
            case 1:
                if (C0358.f6674.f42.f1787.f1994.getParent() != null) {
                    C0358.f6674.f42.f1787.mo439();
                    break;
                } else {
                    C0358.f6674.f42.f1787.h_();
                    break;
                }
            case 2:
                C0358.f6674.f42.f1808.h_();
                break;
            case 3:
                if (C0358.f6674.f42.f1792.f7652.getVisibility() == 0) {
                    C0358.f6674.f42.f1792.mo439();
                    break;
                } else {
                    C0358.f6674.f42.f1792.h_();
                    break;
                }
            case 4:
                if (C0358.f6674.f42.f1785.f1994.getParent() != null) {
                    C0358.f6674.f42.f1785.mo439();
                    break;
                } else {
                    C0358.f6674.f42.f1785.h_();
                    break;
                }
            case 5:
                if (C0358.f6674.f42.f1810.f1994.getParent() != null) {
                    C0358.f6674.f42.f1810.mo439();
                    break;
                } else {
                    C0358.f6674.f42.f1810.h_();
                    break;
                }
            case 6:
                if (C0358.f6674.f42.f1783.f1994.getParent() != null) {
                    C0358.f6674.f42.f1783.mo439();
                    break;
                } else {
                    C0358.f6674.f42.f1783.h_();
                    break;
                }
            case 7:
                if (C0358.f6674.f42.f1781.f1994.getParent() != null) {
                    ch chVar = C0358.f6674.f42.f1781;
                    chVar.mo439();
                    chVar.f902.h_();
                    break;
                } else {
                    C0358.f6674.f42.f1781.h_();
                    break;
                }
            case 8:
                C0358.f6674.f42.f1757.h_();
                break;
            case 9:
                C0358.f6674.f42.f1816.h_();
                break;
            case 10:
                if (C0358.f6674.f42.f1740.f1994.getParent() != null) {
                    C0358.f6674.f42.f1740.mo439();
                    break;
                } else {
                    C0358.f6674.f42.f1740.h_();
                    break;
                }
            case 11:
                C0358.f6674.f42.f1800.f1478 = hj.EnumC0047.SKILL_ME;
                C0358.f6674.f42.f1800.h_();
                break;
        }
        mo439();
    }

    C0523() {
        super(2130903063);
        this.f7222 = (ListView) this.f1994.findViewById(2131296332);
        this.f7222.setOnItemClickListener(new C0916(this));
        this.f7222.setOnItemLongClickListener(new C0462(this));
        int i = 0;
        C0524[] c0524Arr = new C0524[Cif.valuesCustom().length];
        for (int i2 = 0; i2 < c0524Arr.length; i2++) {
            Cif cif = Cif.valuesCustom()[i2];
            if ((!C0358.f6667.f4854 || cif != Cif.RODEX) && (!C0358.f6667.f4836 || cif != Cif.BANK)) {
                int i3 = i;
                i++;
                c0524Arr[i3] = new C0524(cif);
            }
        }
        this.f7222.setAdapter((ListAdapter) new C1019((C0524[]) Arrays.copyOf(c0524Arr, i)));
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        layoutParams.width = (int) ((C0358.f6674.getResources().getDisplayMetrics().densityDpi / 160.0f) * 150.0f);
        layoutParams.addRule(3, C0358.f6674.f42.f1823.getId());
        this.f1994.setLayoutParams(layoutParams);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
