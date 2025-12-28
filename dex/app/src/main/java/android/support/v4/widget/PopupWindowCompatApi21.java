package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class PopupWindowCompatApi21 {
    private static final String TAG = "PopupWindowCompatApi21";
    private static Field sOverlapAnchorField = null;

    PopupWindowCompatApi21() {
    }

    static {
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            sOverlapAnchorField = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    static void setOverlapAnchor(PopupWindow popupWindow, boolean z) throws IllegalAccessException, IllegalArgumentException {
        if (sOverlapAnchorField != null) {
            try {
                sOverlapAnchorField.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    static boolean getOverlapAnchor(PopupWindow popupWindow) {
        if (sOverlapAnchorField != null) {
            try {
                return ((Boolean) sOverlapAnchorField.get(popupWindow)).booleanValue();
            } catch (IllegalAccessException unused) {
                return false;
            }
        }
        return false;
    }
}
