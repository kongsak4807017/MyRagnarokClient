package android.support.v4.widget;

import android.widget.PopupWindow;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class PopupWindowCompatApi23 {
    PopupWindowCompatApi23() {
    }

    static void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    static boolean getOverlapAnchor(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    static void setWindowLayoutType(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    static int getWindowLayoutType(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }
}
