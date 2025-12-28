package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cd implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f877;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ bo f878;

    cd(bo boVar, boolean[] zArr) {
        this.f878 = boVar;
        this.f877 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmapDecodeByteArray;
        cv cvVar;
        String str;
        try {
            cvVar = C0358.f6685;
        } catch (uw unused) {
            bitmapDecodeByteArray = null;
        }
        if (C0358.f6667.f4803 != null && C0358.f6667.f4803.size() != 0) {
            str = C0358.f6667.f4803.get((int) (Math.random() * C0358.f6667.f4803.size()));
            if (str.length() <= 0) {
                bitmapDecodeByteArray = null;
            }
            C0358.f6674.mo139(new ce(this, bitmapDecodeByteArray, this.f877));
        }
        str = String.format("loading%02d.jpg", Integer.valueOf((int) (Math.random() * 11.0d)));
        byte[] bArr = (byte[]) cvVar.f1033.m519("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\" + str, false);
        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        C0358.f6674.mo139(new ce(this, bitmapDecodeByteArray, this.f877));
    }
}
