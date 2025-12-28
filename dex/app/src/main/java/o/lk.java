package o;

import android.graphics.Bitmap;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lk implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f1991;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f1992;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ lj f1993;

    lk(lj ljVar, Bitmap bitmap, String str) {
        this.f1993 = ljVar;
        this.f1992 = bitmap;
        this.f1991 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1993.f1990.f1969 = this.f1992;
        if (this.f1993.f1990.f1957 != null) {
            this.f1993.f1990.f1957.setImageBitmap(this.f1992);
        }
        C0358.f6674.f42.f1790.put(this.f1991, this.f1992);
    }
}
