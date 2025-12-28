package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class PopupWindowCompatGingerbread {
    private static Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    PopupWindowCompatGingerbread() {
    }

    static void setWindowLayoutType(PopupWindow popupWindow, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!sSetWindowLayoutTypeMethodAttempted) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                sSetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            sSetWindowLayoutTypeMethodAttempted = true;
        }
        if (sSetWindowLayoutTypeMethod != null) {
            try {
                sSetWindowLayoutTypeMethod.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    static int getWindowLayoutType(PopupWindow popupWindow) throws NoSuchMethodException, SecurityException {
        if (!sGetWindowLayoutTypeMethodAttempted) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                sGetWindowLayoutTypeMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            sGetWindowLayoutTypeMethodAttempted = true;
        }
        if (sGetWindowLayoutTypeMethod != null) {
            try {
                return ((Integer) sGetWindowLayoutTypeMethod.invoke(popupWindow, new Object[0])).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }
}
