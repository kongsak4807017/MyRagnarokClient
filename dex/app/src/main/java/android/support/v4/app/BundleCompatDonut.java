package android.support.v4.app;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class BundleCompatDonut {
    private static final String TAG = "BundleCompatDonut";
    private static Method sGetIBinderMethod = null;
    private static boolean sGetIBinderMethodFetched = false;
    private static Method sPutIBinderMethod = null;
    private static boolean sPutIBinderMethodFetched = false;

    BundleCompatDonut() {
    }

    public static IBinder getBinder(Bundle bundle, String str) throws NoSuchMethodException, SecurityException {
        if (!sGetIBinderMethodFetched) {
            try {
                Method method = Bundle.class.getMethod("getIBinder", String.class);
                sGetIBinderMethod = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sGetIBinderMethodFetched = true;
        }
        if (sGetIBinderMethod != null) {
            try {
                return (IBinder) sGetIBinderMethod.invoke(bundle, str);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                sGetIBinderMethod = null;
                return null;
            }
        }
        return null;
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!sPutIBinderMethodFetched) {
            try {
                Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                sPutIBinderMethod = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sPutIBinderMethodFetched = true;
        }
        if (sPutIBinderMethod != null) {
            try {
                sPutIBinderMethod.invoke(bundle, str, iBinder);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                sPutIBinderMethod = null;
            }
        }
    }
}
