package o;

import android.graphics.Bitmap;

/* renamed from: o.築, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0831 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f7943;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f7944;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0659 f7945;

    RunnableC0831(RunnableC0659 runnableC0659, Bitmap bitmap, String str) {
        this.f7945 = runnableC0659;
        this.f7944 = bitmap;
        this.f7943 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7945.f7567.f7405 = this.f7944;
        if (this.f7945.f7567.f7407 != null) {
            this.f7945.f7567.f7407.setImageBitmap(this.f7944);
        }
        C0358.f6674.f42.f1790.put(this.f7943, this.f7944);
    }
}
