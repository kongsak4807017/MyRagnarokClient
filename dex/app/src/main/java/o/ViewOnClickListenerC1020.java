package o;

import android.view.View;

/* renamed from: o.데, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC1020 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0490 f8522;

    ViewOnClickListenerC1020(C0490 c0490) {
        this.f8522 = c0490;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0490 c0490 = this.f8522;
        C0760[] c0760ArrM1352 = c0490.m1352();
        int[] iArr = new int[c0760ArrM1352.length];
        int[] iArr2 = new int[c0760ArrM1352.length];
        int[] iArr3 = new int[c0760ArrM1352.length];
        int i = 0;
        for (int i2 = 0; i2 < c0760ArrM1352.length; i2++) {
            iArr[i2] = c0760ArrM1352[i2].f7763;
            iArr2[i2] = c0760ArrM1352[i2].f7761;
            iArr3[i2] = c0760ArrM1352[i2].f7760;
            i += c0760ArrM1352[i2].f7762 * c0760ArrM1352[i2].f7761;
        }
        C0358.f6671.mo454(new C0893(iArr, iArr2, iArr3, Math.min(C0358.f6679.f6831.f8574, i)));
        c0490.mo439();
    }
}
