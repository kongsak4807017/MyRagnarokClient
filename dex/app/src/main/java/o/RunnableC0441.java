package o;

import android.graphics.Bitmap;

/* renamed from: o.ટ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0441 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f6861;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0691 f6862;

    RunnableC0441(RunnableC0691 runnableC0691, Bitmap bitmap) {
        this.f6862 = runnableC0691;
        this.f6861 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6862.f7644.f6944.setImageBitmap(this.f6861);
    }
}
