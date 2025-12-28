package android.support.v4.os;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class EnvironmentCompat {
    public static final String MEDIA_UNKNOWN = "unknown";
    private static final String TAG = "EnvironmentCompat";

    public static String getStorageState(File file) {
        if (Build.VERSION.SDK_INT >= 19) {
            return EnvironmentCompatKitKat.getStorageState(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
            return MEDIA_UNKNOWN;
        } catch (IOException e) {
            new StringBuilder("Failed to resolve canonical path: ").append(e);
            return MEDIA_UNKNOWN;
        }
    }

    private EnvironmentCompat() {
    }
}
