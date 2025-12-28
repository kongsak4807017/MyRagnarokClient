package o;

import android.graphics.Bitmap;
import o.C0804;
import o.C0804.C0805;
import o.cv;

/* renamed from: o.Ҷ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0404 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ EnumC0134 f6782;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ EnumC0765 f6783;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804.C0806 f6784;

    RunnableC0404(C0804.C0806 c0806, EnumC0765 enumC0765, EnumC0134 enumC0134) {
        this.f6784 = c0806;
        this.f6783 = enumC0765;
        this.f6782 = enumC0134;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6784.f7899.f7891 != this.f6783 || this.f6784.f7899.f7890 != this.f6782) {
            this.f6784.f7899 = C0804.this.new C0805(this.f6782, this.f6783);
        }
        cv cvVar = C0358.f6685;
        hr hrVar = this.f6784.f7899.f7892;
        EnumC0134 enumC0134 = this.f6782;
        int i = this.f6784.f7898;
        int i2 = this.f6784.f7910;
        byte bOrdinal = (byte) this.f6783.ordinal();
        hr hrVarM544 = cvVar.m544(enumC0134, i, bOrdinal, true);
        cv.Cif cifM540 = i2 > 0 ? cvVar.m540(enumC0134, false, i, i2, EnumC0765.valuesCustom()[bOrdinal], true, true) : null;
        hs hsVar = new hs(hrVar, new hr[]{hrVar, hrVarM544});
        int[][] iArr = new int[2][];
        iArr[1] = cifM540 != null ? cifM540.f1037 : null;
        int[] iArrM635 = hsVar.m635(iArr, mv.STAND.f2194 * 8, 0, 128, 128, 64);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArrM635, 0, 128, 0, 0, 128, 128);
        C0358.f6674.mo139(new RunnableC0904(this, bitmapCreateBitmap));
    }
}
