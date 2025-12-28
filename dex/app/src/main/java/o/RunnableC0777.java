package o;

import android.graphics.Bitmap;
import o.C0972;

/* renamed from: o.湯, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0777 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0972.C0974 f7811;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1023 f7812;

    RunnableC0777(C1023 c1023, C0972.C0974 c0974) {
        this.f7812 = c1023;
        this.f7811 = c0974;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hr hrVar = new hr(C0358.f6685.f1030.m512(EnumC0134.m1250(this.f7811.f8315), this.f7811.f8321, this.f7811.f8314), false, false, true);
        int[] iArr = null;
        if (this.f7811.f8319 > 0) {
            iArr = C0358.f6685.m540(EnumC0134.m1250(this.f7811.f8315), false, this.f7811.f8321, this.f7811.f8319, EnumC0765.valuesCustom()[this.f7811.f8314], false, false).f1037;
        }
        if (iArr == null) {
            iArr = new int[256];
            for (int i = 0; i < hrVar.f1502.length; i++) {
                int i2 = hrVar.f1502[i];
                iArr[i] = ((-16711936) & i2) | ((16711680 & i2) >> 16) | ((i2 & 255) << 16);
            }
        }
        int i3 = -1;
        for (int i4 = 0; i4 < hrVar.f1504.f5018[0].f5028[0].f5033.length && (i3 = hrVar.f1504.f5018[0].f5028[0].f5033[i4].f5044) < 0; i4++) {
        }
        if (i3 == -1) {
            return;
        }
        byte[] bArr = hrVar.f1500[i3].f1520;
        int[] iArr2 = new int[bArr.length];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            iArr2[i5] = iArr[pa.m967(bArr[i5])];
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(hrVar.f1500[i3].f1513, hrVar.f1500[i3].f1514, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, hrVar.f1500[i3].f1513, 0, 0, hrVar.f1500[i3].f1513, hrVar.f1500[i3].f1514);
        C0358.f6674.mo139(new RunnableC1109(this, bitmapCreateBitmap));
    }
}
