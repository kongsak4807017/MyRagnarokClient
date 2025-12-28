package o;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class q implements View.OnTouchListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ n f4960;

    q(n nVar) {
        this.f4960 = nVar;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"NewApi"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 1:
                if (view.getId() != 2131296433) {
                    return false;
                }
                this.f4960.f2324.f2017 = motionEvent.getRawX();
                this.f4960.f2324.f2016 = motionEvent.getRawY();
                this.f4960.m872();
                return true;
            case 2:
                this.f4960.f2324.f2017 = motionEvent.getRawX();
                this.f4960.f2324.f2016 = motionEvent.getRawY();
                this.f4960.m872();
                return true;
            default:
                return true;
        }
    }
}
