package o;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kf implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ Runnable f1885;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ Drawable f1886;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ ImageView f1887;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f1888;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1889;

    kf(je jeVar, String str, ImageView imageView, Drawable drawable, gr grVar) {
        this.f1889 = jeVar;
        this.f1888 = str;
        this.f1887 = imageView;
        this.f1886 = drawable;
        this.f1885 = grVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0358.f6674.mo139(new kg(this, this.f1887, this.f1886, C0358.f6685.m538(this.f1888, 1), this.f1888, this.f1885));
        } catch (uw unused) {
        }
    }
}
