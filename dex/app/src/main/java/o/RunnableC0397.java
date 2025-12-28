package o;

import com.roworkshop.andro.c_activity;

/* renamed from: o.њ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC0397 implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f6737;

    /* renamed from: 櫯, reason: contains not printable characters */
    private static final byte[] f6736 = {12, 34, -20, 8, -5, 7, 8, -5, -2, 15, -1, 12, -5, 69, -70, 15, 5};

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static int f6735 = 118;

    RunnableC0397(c_activity c_activityVar) {
        this.f6737 = c_activityVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        du duVar = this.f6737.f45;
        int i = f6736[10] + 1;
        int i2 = 99 - (i * 2);
        int i3 = (i * 2) + 4;
        int i4 = 14 - (i * 3);
        byte[] bArr = f6736;
        int i5 = 0;
        byte[] bArr2 = new byte[i4];
        int i6 = i4 - 1;
        if (bArr == null) {
            i2 = i6 + (-i2) + 4;
            i3++;
        }
        while (true) {
            bArr2[i5] = (byte) i2;
            if (i5 == i6) {
                duVar.m564(new String(bArr2, 0), 0L, false, true);
                return;
            }
            i5++;
            i2 = i2 + (-bArr[i3]) + 4;
            i3++;
        }
    }
}
