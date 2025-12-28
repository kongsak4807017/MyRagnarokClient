package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import o.aq;
import o.aq.C0023;

/* renamed from: o.ˮ̨, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0337 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f6643;

    /* renamed from: o.ˮ̨$鷭, reason: contains not printable characters */
    enum EnumC0338 {
        SUCCESS,
        PARTY_NAME_ALREADY_EXISTS,
        ALREADY_IN_PARTY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0338[] valuesCustom() {
            EnumC0338[] enumC0338ArrValuesCustom = values();
            int length = enumC0338ArrValuesCustom.length;
            EnumC0338[] enumC0338Arr = new EnumC0338[length];
            System.arraycopy(enumC0338ArrValuesCustom, 0, enumC0338Arr, 0, length);
            return enumC0338Arr;
        }
    }

    C0337() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1284() {
        int[] iArr = f6643;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0338.valuesCustom().length];
        try {
            iArr2[EnumC0338.ALREADY_IN_PARTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0338.PARTY_NAME_ALREADY_EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0338.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f6643 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 250;
        byte b = byteBuffer.get();
        if (z) {
        }
        switch (m1284()[EnumC0338.valuesCustom()[b].ordinal()]) {
            case 1:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(78);
                c0698.m1432(strM649 == null ? "MSG78" : strM649, SupportMenu.USER_MASK);
                if (C0358.f6664.f2004.f8596 == null) {
                    C0358.f6664.f2004.f8596 = new aq();
                }
                C0358.f6664.f2004.f8596.f686 = C0358.f6674.f42.f1782.f710;
                C0358.f6664.f2004.f8596.f685 = C0358.f6674.f42.f1782.f715;
                C0358.f6664.f2004.f8596.f684 = new aq.C0023[1];
                C0358.f6664.f2004.f8596.f684[0] = C0358.f6664.f2004.f8596.new C0023();
                C0358.f6664.f2004.f8596.f684[0].f696 = C0358.f6664.f2004.f1998;
                C0358.f6664.f2004.f8596.f684[0].f695 = C0358.f6664.f2004.f8368;
                C0358.f6664.f2004.f8596.f684[0].f694 = C0358.f6669.f2063.f6887;
                C0358.f6664.f2004.f8596.f684[0].f689 = true;
                C0358.f6664.f2004.f8596.f684[0].f693 = np.LEADER;
                if (C0358.f6674.f42.f1782.f714 == nm.EVEN_SHARE) {
                    C0358.f6671.mo454(new C0170(C0358.f6674.f42.f1782.f714, C0358.f6674.f42.f1782.f710, C0358.f6674.f42.f1782.f715));
                }
                C0358.f6674.f42.f1782.mo439();
                C0358.f6674.f42.f1746.h_();
                break;
            case 2:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(79);
                c06982.m1432(strM6492 == null ? "MSG79" : strM6492, 16711680);
                break;
            case 3:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(80);
                c06983.m1432(strM6493 == null ? "MSG80" : strM6493, 16711680);
                break;
        }
    }
}
