package android.support.v4.view;

import android.view.ViewGroup;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ViewGroupCompatLollipop {
    ViewGroupCompatLollipop() {
    }

    public static void setTransitionGroup(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }

    public static boolean isTransitionGroup(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public static int getNestedScrollAxes(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }
}
