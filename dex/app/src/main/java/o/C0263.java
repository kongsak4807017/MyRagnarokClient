package o;

import java.nio.ByteBuffer;

/* renamed from: o.ɿ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0263 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f6573;

    C0263() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1270() {
        int[] iArr = f6573;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0414.valuesCustom().length];
        try {
            iArr2[EnumC0414.CART.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0414.GUILDSTORAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0414.INVENTORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0414.STORAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f6573 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2826;
        byte b = C0358.f6667.f4845 ? byteBuffer.get() : (byte) 0;
        C1154[] c1154Arr = new C1154[i];
        for (int i3 = 0; i3 < c1154Arr.length; i3++) {
            c1154Arr[i3] = C1154.m1655(byteBuffer, C0358.f6667.f4800, C0358.f6667.f4800 >= 20120712);
        }
        if (z || b < 0 || b >= EnumC0414.valuesCustom().length) {
            return;
        }
        switch (m1270()[EnumC0414.valuesCustom()[b].ordinal()]) {
            case 1:
                AbstractC0309.m1280(c1154Arr);
                break;
            case 2:
                C1081.m1628(c1154Arr);
                break;
            case 3:
            case 4:
                C0510.m1358(c1154Arr);
                break;
        }
    }
}
