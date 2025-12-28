package android.support.v4.view;

import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ViewCompatMarshmallow {
    ViewCompatMarshmallow() {
    }

    public static void setScrollIndicators(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void setScrollIndicators(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public static int getScrollIndicators(View view) {
        return view.getScrollIndicators();
    }

    static void offsetTopAndBottom(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    static void offsetLeftAndRight(View view, int i) {
        view.offsetLeftAndRight(i);
    }
}
