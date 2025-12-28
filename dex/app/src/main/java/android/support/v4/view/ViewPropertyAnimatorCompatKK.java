package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ViewPropertyAnimatorCompatKK {
    ViewPropertyAnimatorCompatKK() {
    }

    public static void setUpdateListener(final View view, final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (viewPropertyAnimatorUpdateListener != null) {
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.v4.view.ViewPropertyAnimatorCompatKK.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    viewPropertyAnimatorUpdateListener.onAnimationUpdate(view);
                }
            };
        }
        view.animate().setUpdateListener(animatorUpdateListener);
    }
}
