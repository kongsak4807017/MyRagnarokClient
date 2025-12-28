package o;

import android.graphics.Bitmap;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gd implements Runnable {

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ String f1318;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ c_activity f1319;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f1320;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gc f1321;

    gd(gc gcVar, Bitmap bitmap, c_activity c_activityVar, String str) {
        this.f1321 = gcVar;
        this.f1320 = bitmap;
        this.f1319 = c_activityVar;
        this.f1318 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1321.f1317.f1304 = this.f1320;
        if (this.f1321.f1317.f1312 != null) {
            this.f1321.f1317.f1312.setImageBitmap(this.f1320);
        }
        this.f1319.f42.f1790.put(this.f1318, this.f1320);
    }
}
