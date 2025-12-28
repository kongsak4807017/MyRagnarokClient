package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ViewCompatBase {
    private static final String TAG = "ViewCompatBase";
    private static Field sMinHeightField = null;
    private static boolean sMinHeightFieldFetched = false;
    private static Field sMinWidthField = null;
    private static boolean sMinWidthFieldFetched = false;

    ViewCompatBase() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static ColorStateList getBackgroundTintList(View view) {
        if (view instanceof TintableBackgroundView) {
            return ((TintableBackgroundView) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void setBackgroundTintList(View view, ColorStateList colorStateList) {
        if (view instanceof TintableBackgroundView) {
            ((TintableBackgroundView) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static PorterDuff.Mode getBackgroundTintMode(View view) {
        if (view instanceof TintableBackgroundView) {
            return ((TintableBackgroundView) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void setBackgroundTintMode(View view, PorterDuff.Mode mode) {
        if (view instanceof TintableBackgroundView) {
            ((TintableBackgroundView) view).setSupportBackgroundTintMode(mode);
        }
    }

    static boolean isLaidOut(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    static int getMinimumWidth(View view) throws NoSuchFieldException {
        if (!sMinWidthFieldFetched) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                sMinWidthField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            sMinWidthFieldFetched = true;
        }
        if (sMinWidthField != null) {
            try {
                return ((Integer) sMinWidthField.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    static int getMinimumHeight(View view) throws NoSuchFieldException {
        if (!sMinHeightFieldFetched) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                sMinHeightField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            sMinHeightFieldFetched = true;
        }
        if (sMinHeightField != null) {
            try {
                return ((Integer) sMinHeightField.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    static boolean isAttachedToWindow(View view) {
        return view.getWindowToken() != null;
    }

    static void offsetTopAndBottom(View view, int i) {
        int top = view.getTop();
        view.offsetTopAndBottom(i);
        if (i != 0) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                int iAbs = Math.abs(i);
                ((View) parent).invalidate(view.getLeft(), top - iAbs, view.getRight(), view.getHeight() + top + iAbs);
            } else {
                view.invalidate();
            }
        }
    }

    static void offsetLeftAndRight(View view, int i) {
        int left = view.getLeft();
        view.offsetLeftAndRight(i);
        if (i != 0) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                int iAbs = Math.abs(i);
                ((View) parent).invalidate(left - iAbs, view.getTop(), view.getWidth() + left + iAbs, view.getBottom());
            } else {
                view.invalidate();
            }
        }
    }
}
