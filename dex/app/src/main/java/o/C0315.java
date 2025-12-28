package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̃, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0315 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] f6622;

    C0315() {
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1281() {
        int[] iArr = f6622;
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
        f6622 = iArr2;
        return iArr2;
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2825;
        byte b = C0358.f6667.f4845 ? byteBuffer.get() : (byte) 0;
        C0726[] c0726Arr = new C0726[i];
        for (int i3 = 0; i3 < i; i3++) {
            c0726Arr[i3] = C0726.m1437(byteBuffer, C0358.f6667.f4800, C0358.f6667.f4800 >= 20120712);
        }
        if (z || b < 0 || b >= EnumC0414.valuesCustom().length) {
            return;
        }
        switch (m1281()[EnumC0414.valuesCustom()[b].ordinal()]) {
            case 1:
                AbstractC0608.m1381(c0726Arr);
                break;
            case 2:
                C0966.m1552(c0726Arr);
                break;
            case 3:
            case 4:
                C0953.m1547(c0726Arr);
                break;
        }
    }
}
