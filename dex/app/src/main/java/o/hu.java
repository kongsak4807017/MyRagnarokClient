package o;

import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class hu {

    /* renamed from: Ć, reason: contains not printable characters */
    hr f1540;

    /* renamed from: ć, reason: contains not printable characters */
    hr f1541;

    /* renamed from: ċ, reason: contains not printable characters */
    hs f1542;

    /* renamed from: Ȋ, reason: contains not printable characters */
    hs f1544;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    bj f1546;

    /* renamed from: ܕ, reason: contains not printable characters */
    hs f1547;

    /* renamed from: 䒧, reason: contains not printable characters */
    hs f1548;

    /* renamed from: 岱, reason: contains not printable characters */
    hs f1549;

    /* renamed from: 櫯, reason: contains not printable characters */
    mg f1551;

    /* renamed from: 纫, reason: contains not printable characters */
    hs f1552;

    /* renamed from: 躆, reason: contains not printable characters */
    hs f1553;

    /* renamed from: 鷭, reason: contains not printable characters */
    iu f1554 = new iu();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    HashMap<Integer, mj> f1545 = new HashMap<>();

    /* renamed from: ȃ, reason: contains not printable characters */
    LinkedList<C1106> f1543 = new LinkedList<>();

    /* renamed from: Ą, reason: contains not printable characters */
    HashMap<Integer, C0564> f1538 = new HashMap<>();

    /* renamed from: ą, reason: contains not printable characters */
    HashMap<Integer, C0564> f1539 = new HashMap<>();

    /* renamed from: 庸, reason: contains not printable characters */
    mw[] f1550 = {mw.NUM2, mw.NUM1, mw.NUM4, mw.NUM7, mw.NUM8, mw.NUM9, mw.NUM6, mw.NUM3};

    /* renamed from: o.hu$鷭, reason: contains not printable characters */
    public enum EnumC0051 {
        NUM8,
        NUM7,
        NUM4,
        NUM1,
        NUM2,
        NUM3,
        NUM6,
        NUM9;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0051[] valuesCustom() {
            EnumC0051[] enumC0051ArrValuesCustom = values();
            int length = enumC0051ArrValuesCustom.length;
            EnumC0051[] enumC0051Arr = new EnumC0051[length];
            System.arraycopy(enumC0051ArrValuesCustom, 0, enumC0051Arr, 0, length);
            return enumC0051Arr;
        }
    }

    hu() {
        String str = "data\\texture\\" + C0358.f6685.f1030.f982.f8938.f8962 + "\\map\\map_arrow.bmp";
        C0406 c0406M919 = od.m919(str, (byte[]) C0358.f6685.f1033.m519(str, false));
        iu iuVar = this.f1554;
        iuVar.m692(c0406M919.f6789, c0406M919.f6788, c0406M919.f6787.x, c0406M919.f6787.y, str, null, iuVar.f1667);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m638(int i) {
        mj mjVar = this.f1545.get(Integer.valueOf(i));
        if (mjVar == null) {
            return;
        }
        if (C0358.f6664.f2004 != null && ((C0358.f6664.f2004.f8618 != null && C0358.f6664.f2004.f8618.f8661.f8689 == i) || (C0358.f6664.f2004.f8632 != null && C0358.f6664.f2004.f8632.f8661.f8689 == i))) {
            lm lmVar = mjVar.f2123;
            if (!((AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null)).f8371) {
                if (mjVar.f2123.f1997 == nu.HOM) {
                    C0358.f6664.f2004.f8618.f8661.f8685 = true;
                    C0358.f6674.f42.f1814 = false;
                    C0358.f6664.f2004.f8618 = null;
                }
                if (mjVar.f2123.f1997 == nu.MER) {
                    C0358.f6664.f2004.f8632.f8661.f8685 = true;
                    C0358.f6674.f42.f1805 = false;
                    C0358.f6664.f2004.f8632 = null;
                }
            }
        }
        mjVar.mo833();
        this.f1545.remove(Integer.valueOf(i));
        C0358.f6669.m816(mjVar, true);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final mw m637(float f, byte b) {
        float f2 = (23.0f + f) - ((4 - b) * 45);
        while (f2 < 0.0f) {
            f2 += 360.0f;
        }
        while (f2 > 360.0f) {
            f2 -= 360.0f;
        }
        return this.f1550[((int) f2) / 45];
    }
}
