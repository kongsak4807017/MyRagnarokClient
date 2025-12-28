package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class DrawableCompatJellybeanMr1 {
    private static final String TAG = "DrawableCompatJellybeanMr1";
    private static Method sGetLayoutDirectionMethod = null;
    private static boolean sGetLayoutDirectionMethodFetched = false;
    private static Method sSetLayoutDirectionMethod = null;
    private static boolean sSetLayoutDirectionMethodFetched = false;

    DrawableCompatJellybeanMr1() {
    }

    public static void setLayoutDirection(Drawable drawable, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!sSetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                sSetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sSetLayoutDirectionMethodFetched = true;
        }
        if (sSetLayoutDirectionMethod != null) {
            try {
                sSetLayoutDirectionMethod.invoke(drawable, Integer.valueOf(i));
            } catch (Exception unused2) {
                sSetLayoutDirectionMethod = null;
            }
        }
    }

    public static int getLayoutDirection(Drawable drawable) throws NoSuchMethodException, SecurityException {
        if (!sGetLayoutDirectionMethodFetched) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                sGetLayoutDirectionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sGetLayoutDirectionMethodFetched = true;
        }
        if (sGetLayoutDirectionMethod != null) {
            try {
                return ((Integer) sGetLayoutDirectionMethod.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                sGetLayoutDirectionMethod = null;
                return -1;
            }
        }
        return -1;
    }
}
