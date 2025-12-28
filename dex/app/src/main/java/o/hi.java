package o;

import android.graphics.Bitmap;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hi implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f1473;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f1474;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ hh f1475;

    hi(hh hhVar, Bitmap bitmap, String str) {
        this.f1475 = hhVar;
        this.f1474 = bitmap;
        this.f1473 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1475.f1472.f1458 = this.f1474;
        this.f1475.f1472.f1452.setImageBitmap(this.f1474);
        C0358.f6674.f42.f1790.put(this.f1473, this.f1474);
    }
}
