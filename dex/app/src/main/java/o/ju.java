package o;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ju implements Runnable {

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ ImageView f1865;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f1866;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f1867;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1868;

    ju(je jeVar, String str, String str2, ImageView imageView) {
        this.f1868 = jeVar;
        this.f1867 = str;
        this.f1866 = str2;
        this.f1865 = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0406 c0406M919 = od.m919(this.f1866, (byte[]) C0358.f6685.f1033.m519(this.f1867, false));
        if (c0406M919.f6786 != 32) {
            Log.e("AndRO", "Only 32bpp images supported for status icons");
            throw new nv("Only 32bpp images supported for status icons");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0406M919.f6787.x, c0406M919.f6787.y, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(c0406M919.f6789, 0, c0406M919.f6787.x, 0, 0, c0406M919.f6787.x, c0406M919.f6787.y);
        C0358.f6674.mo139(new jv(this, this.f1866, bitmapCreateBitmap, this.f1865));
    }
}
