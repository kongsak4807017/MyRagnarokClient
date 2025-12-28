package o;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ji implements View.OnTouchListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1848;

    ji(je jeVar) {
        this.f1848 = jeVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                ((ImageView) C0358.f6674.findViewById(2131296419)).setImageResource(2130837506);
                break;
            case 1:
                ((ImageView) C0358.f6674.findViewById(2131296419)).setImageResource(2130837505);
                break;
        }
        return false;
    }
}
