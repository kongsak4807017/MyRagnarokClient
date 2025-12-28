package o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ce implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f879;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ Bitmap f880;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cd f881;

    ce(cd cdVar, Bitmap bitmap, boolean[] zArr) {
        this.f881 = cdVar;
        this.f880 = bitmap;
        this.f879 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0358.f6674.mo139(new jt(C0358.f6674.f42));
        C0358.f6674.setContentView(2130903089);
        C0358.f6674.f42.f1736 = (ProgressBar) C0358.f6674.findViewById(2131296402);
        C0358.f6674.f42.f1736.setMax(100);
        ImageView imageView = (ImageView) C0358.f6674.findViewById(2131296401);
        ((TextView) C0358.f6674.findViewById(2131296265)).setText(C0358.m1294());
        imageView.setImageBitmap(this.f880);
        this.f879[0] = true;
    }
}
