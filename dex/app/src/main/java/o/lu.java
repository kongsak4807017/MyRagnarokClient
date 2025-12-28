package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lu {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int[] f2030 = new int[32];

    /* renamed from: 櫯, reason: contains not printable characters */
    int f2031;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f2032;

    lu() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final double m802() {
        int i;
        double d;
        double d2 = 0.0d;
        for (int i2 = 0; i2 < this.f2032 && (i = this.f2030[i2]) != -1; i2++) {
            if ((i & 1) != 0) {
                d = 1.4d;
            } else {
                d = 1.0d;
            }
            d2 += d;
        }
        return d2;
    }
}
