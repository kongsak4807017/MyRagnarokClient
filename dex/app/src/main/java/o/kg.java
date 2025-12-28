package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kg implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ String f1890;

    /* renamed from: ą, reason: contains not printable characters */
    private final /* synthetic */ Runnable f1891;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f1892;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ Drawable f1893;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ ImageView f1894;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ kf f1895;

    kg(kf kfVar, ImageView imageView, Drawable drawable, Bitmap bitmap, String str, Runnable runnable) {
        this.f1895 = kfVar;
        this.f1894 = imageView;
        this.f1893 = drawable;
        this.f1892 = bitmap;
        this.f1890 = str;
        this.f1891 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1894.getDrawable() == this.f1893) {
            this.f1894.setImageBitmap(this.f1892);
        }
        C0358.f6674.f42.f1790.put(this.f1890, this.f1892);
        if (this.f1891 != null) {
            this.f1891.run();
        }
    }
}
