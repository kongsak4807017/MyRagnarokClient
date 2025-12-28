package o;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kx implements View.OnTouchListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ kv f1944;

    kx(kv kvVar) {
        this.f1944 = kvVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return kv.m760(this.f1944, motionEvent);
    }
}
