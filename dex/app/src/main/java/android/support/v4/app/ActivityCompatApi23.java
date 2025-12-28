package android.support.v4.app;

import android.app.Activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ActivityCompatApi23 {

    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    ActivityCompatApi23() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestPermissions(Activity activity, String[] strArr, int i) {
        if (activity instanceof RequestPermissionsRequestCodeValidator) {
            ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
        }
        activity.requestPermissions(strArr, i);
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
