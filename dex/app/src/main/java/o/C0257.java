package o;

import java.nio.ByteBuffer;

/* renamed from: o.ɰ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0257 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f6572;

    C0257() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1268() {
        int[] iArr = f6572;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[nk.valuesCustom().length];
        try {
            iArr2[nk.DROPPED.ordinal()] = 8;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[nk.MATERIAL_CHANGED.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[nk.MOVED_TO_CART.ordinal()] = 6;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nk.MOVED_TO_STORAGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nk.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[nk.REFINE_FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[nk.SKILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[nk.SOLD.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        f6572 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2042;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        if (z) {
            return;
        }
        m1269(s, s2, s3);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1269(short s, int i, short s2) {
        String str;
        nk nkVar = nk.valuesCustom()[s];
        int i2 = i - 2;
        C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i2));
        if (c1008 == null) {
            return;
        }
        C1139 c1139 = C0358.f6685.f1030.f967;
        int i3 = c1008.f8502;
        boolean z = c1008.f8491;
        C0432 c0432M1648 = c1139.m1648(i3);
        String strM1328 = c0432M1648 == null ? null : c0432M1648.m1328(z);
        switch (m1268()[nkVar.ordinal()]) {
            case 1:
            case 2:
            case 4:
            default:
                str = null;
                break;
            case 3:
                str = "You've lost " + strM1328 + " (" + ((int) s2) + ")";
                break;
            case 5:
                str = String.valueOf(strM1328) + " (" + ((int) s2) + ") has been moved to storage";
                break;
            case 6:
                str = String.valueOf(strM1328) + " (" + ((int) s2) + ") has been moved to cart";
                break;
            case 7:
                str = "You've sold " + strM1328 + " (" + ((int) s2) + ")";
                break;
            case 8:
                str = "You've dropped " + strM1328 + " (" + ((int) s2) + ")";
                break;
        }
        if (str != null) {
            C0358.f6674.f42.f1792.m1432(str, 16711680);
        }
        c1008.f8500 -= s2;
        if (c1008.f8500 <= 0) {
            c1008.f8500 = 0;
            C0358.f6664.f2004.f8622.remove(Integer.valueOf(i2));
        }
        C0358.f6674.f42.f1810.m1468(c1008.f8493);
        C0358.f6674.f42.m728(c1008.f8502, c1008.f8500);
        aux[] auxVarArrM442 = aux.m442(c1008.f8490);
        if (auxVarArrM442 == null) {
            return;
        }
        for (aux auxVar : auxVarArrM442) {
            C0358.f6674.f42.f1785.m1442(auxVar, c1008, i2);
        }
    }
}
