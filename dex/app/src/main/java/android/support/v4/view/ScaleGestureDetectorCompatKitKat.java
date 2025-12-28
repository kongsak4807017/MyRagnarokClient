package android.support.v4.view;

import android.view.ScaleGestureDetector;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ScaleGestureDetectorCompatKitKat {
    private ScaleGestureDetectorCompatKitKat() {
    }

    public static void setQuickScaleEnabled(Object obj, boolean z) {
        ((ScaleGestureDetector) obj).setQuickScaleEnabled(z);
    }

    public static boolean isQuickScaleEnabled(Object obj) {
        return ((ScaleGestureDetector) obj).isQuickScaleEnabled();
    }
}
