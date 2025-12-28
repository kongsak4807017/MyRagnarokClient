package android.support.v4.app;

import android.app.ActivityManager;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ActivityManagerCompatKitKat {
    ActivityManagerCompatKitKat() {
    }

    public static boolean isLowRamDevice(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
