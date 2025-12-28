package android.support.v4.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class BundleCompat {
    private BundleCompat() {
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return BundleCompatJellybeanMR2.getBinder(bundle, str);
        }
        return BundleCompatDonut.getBinder(bundle, str);
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 18) {
            BundleCompatJellybeanMR2.putBinder(bundle, str, iBinder);
        } else {
            BundleCompatDonut.putBinder(bundle, str, iBinder);
        }
    }
}
