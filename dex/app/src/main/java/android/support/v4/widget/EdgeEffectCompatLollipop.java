package android.support.v4.widget;

import android.widget.EdgeEffect;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class EdgeEffectCompatLollipop {
    EdgeEffectCompatLollipop() {
    }

    public static boolean onPull(Object obj, float f, float f2) {
        ((EdgeEffect) obj).onPull(f, f2);
        return true;
    }
}
