package android.support.v4.view;

import android.os.Build;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ScaleGestureDetectorCompat {
    static final ScaleGestureDetectorImpl IMPL;

    interface ScaleGestureDetectorImpl {
        boolean isQuickScaleEnabled(Object obj);

        void setQuickScaleEnabled(Object obj, boolean z);
    }

    static class BaseScaleGestureDetectorImpl implements ScaleGestureDetectorImpl {
        private BaseScaleGestureDetectorImpl() {
        }

        @Override // android.support.v4.view.ScaleGestureDetectorCompat.ScaleGestureDetectorImpl
        public void setQuickScaleEnabled(Object obj, boolean z) {
        }

        @Override // android.support.v4.view.ScaleGestureDetectorCompat.ScaleGestureDetectorImpl
        public boolean isQuickScaleEnabled(Object obj) {
            return false;
        }
    }

    static class ScaleGestureDetectorCompatKitKatImpl implements ScaleGestureDetectorImpl {
        private ScaleGestureDetectorCompatKitKatImpl() {
        }

        @Override // android.support.v4.view.ScaleGestureDetectorCompat.ScaleGestureDetectorImpl
        public void setQuickScaleEnabled(Object obj, boolean z) {
            ScaleGestureDetectorCompatKitKat.setQuickScaleEnabled(obj, z);
        }

        @Override // android.support.v4.view.ScaleGestureDetectorCompat.ScaleGestureDetectorImpl
        public boolean isQuickScaleEnabled(Object obj) {
            return ScaleGestureDetectorCompatKitKat.isQuickScaleEnabled(obj);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            IMPL = new ScaleGestureDetectorCompatKitKatImpl();
        } else {
            IMPL = new BaseScaleGestureDetectorImpl();
        }
    }

    private ScaleGestureDetectorCompat() {
    }

    public static void setQuickScaleEnabled(Object obj, boolean z) {
        IMPL.setQuickScaleEnabled(obj, z);
    }

    public static boolean isQuickScaleEnabled(Object obj) {
        return IMPL.isQuickScaleEnabled(obj);
    }
}
