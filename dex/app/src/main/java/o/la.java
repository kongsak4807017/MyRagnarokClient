package o;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class la implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ hr f1948;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ kz f1949;

    la(kz kzVar, hr hrVar) {
        this.f1949 = kzVar;
        this.f1948 = hrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.f1949.f1946.f1918;
        cv cvVar = C0358.f6685;
        imageView.setImageBitmap(Bitmap.createScaledBitmap(cv.m529(this.f1948), this.f1949.f1946.f1933.x, this.f1949.f1946.f1933.y, false));
    }
}
