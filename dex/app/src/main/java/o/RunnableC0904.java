package o;

import android.graphics.Bitmap;

/* renamed from: o.霋, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0904 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f8186;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0404 f8187;

    RunnableC0904(RunnableC0404 runnableC0404, Bitmap bitmap) {
        this.f8187 = runnableC0404;
        this.f8186 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8187.f6784.f7902.setImageBitmap(this.f8186);
    }
}
