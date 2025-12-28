package o;

import android.app.Activity;
import android.content.SharedPreferences;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aeb {

    /* renamed from: 鷭, reason: contains not printable characters */
    public static String f570 = "versionInfo";

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m389(Activity activity, String str) {
        if (activity != null) {
            SharedPreferences.Editor editorEdit = activity.getSharedPreferences("HockeyApp", 0).edit();
            editorEdit.putString(f570, str);
            editorEdit.apply();
        }
    }
}
