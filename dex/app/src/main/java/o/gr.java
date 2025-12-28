package o;

import com.roworkshop.andro.c_point;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gr implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gq f1378;

    gr(gq gqVar) {
        this.f1378 = gqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1378.f1377.measure(0, 0);
        this.f1378.f1373 = new c_point(this.f1378.f1377.getMeasuredWidth(), this.f1378.f1377.getMeasuredHeight());
    }
}
