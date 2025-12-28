package o;

import android.graphics.Bitmap;

/* renamed from: o.쨌, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC1109 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f8900;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0777 f8901;

    RunnableC1109(RunnableC0777 runnableC0777, Bitmap bitmap) {
        this.f8901 = runnableC0777;
        this.f8900 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0358.f6674.f42.f1748.f7697.f9043.put(this.f8901.f7812.m1599(), this.f8900);
        this.f8901.f7812.f8530 = this.f8900;
        this.f8901.f7812.f8529.setImageBitmap(this.f8900);
    }
}
