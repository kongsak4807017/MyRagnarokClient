package o;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lc implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ hr f1951;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ lb f1952;

    lc(lb lbVar, hr hrVar) {
        this.f1952 = lbVar;
        this.f1951 = hrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.f1952.f1950.f1918;
        cv cvVar = C0358.f6685;
        imageView.setImageBitmap(Bitmap.createScaledBitmap(cv.m529(this.f1951), this.f1952.f1950.f1933.x, this.f1952.f1950.f1933.y, false));
    }
}
