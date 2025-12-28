package o;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jv implements Runnable {

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ ImageView f1869;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f1870;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f1871;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ju f1872;

    jv(ju juVar, String str, Bitmap bitmap, ImageView imageView) {
        this.f1872 = juVar;
        this.f1871 = str;
        this.f1870 = bitmap;
        this.f1869 = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0358.f6674.f42.f1790.put(this.f1871, this.f1870);
        this.f1869.setImageBitmap(this.f1870);
    }
}
