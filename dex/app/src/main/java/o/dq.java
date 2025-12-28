package o;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dq implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ dl f1090;

    /* renamed from: 櫯, reason: contains not printable characters */
    private static final byte[] f1089 = {13, 112, 53, 110, 25, -10, -7, 15, -17, -72, 82, -8, -15, -6, 16, -18, -72, 30, 42, -13, -21, -6, -50, 76, -4, -81, 86, -13, 3, -6, -85, 80, -17, 10, 1, -20, 10, -78, 73, -86, 84, -21, -6, 14, -13, 8, -18, -58};

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static int f1088 = 70;

    dq(dl dlVar) {
        this.f1090 = dlVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m557(int i, int i2, int i3) {
        int i4 = 45 - (i3 * 4);
        int i5 = (i * 2) + 80;
        int i6 = i2 + 4;
        byte[] bArr = f1089;
        int i7 = 0;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            i5 = i4 + i6 + 3;
        }
        while (true) {
            bArr2[i7] = (byte) i5;
            i7++;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            i6++;
            i5 = i5 + bArr[i6] + 3;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        try {
            packageInfo = C0358.f6674.getPackageManager().getPackageInfo(C0358.f6674.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (C0358.f6667.f4775 > packageInfo.versionCode) {
            int i = f1089[34] - 1;
            int i2 = -f1089[34];
            throw new ut(m557(i, i2, i2 + 1));
        }
        this.f1090.f1081.mo454(new wk(packageInfo.versionCode, packageInfo.versionName));
        this.f1090.f1081.mo454(new wh(C0358.f6667.f4851));
        if (C0358.f6685 == null) {
            C0358 c0358 = C0358.f6688;
            C0358.m1305();
        }
    }
}
