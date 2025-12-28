package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class acb {
    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m305(c_activity c_activityVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c_activityVar == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = c_activityVar.getSharedPreferences("HockeyApp", 0).edit();
        editorEdit.putLong("startTime" + c_activityVar.hashCode(), jCurrentTimeMillis);
        editorEdit.apply();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static void m304(c_activity c_activityVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c_activityVar == null || !m306((Context) c_activityVar)) {
            return;
        }
        SharedPreferences sharedPreferences = c_activityVar.getSharedPreferences("HockeyApp", 0);
        long j = sharedPreferences.getLong("startTime" + c_activityVar.hashCode(), 0L);
        long j2 = sharedPreferences.getLong("usageTime" + aba.f322, 0L);
        if (j > 0) {
            long j3 = jCurrentTimeMillis - j;
            long j4 = j2 + j3;
            if (j3 <= 0 || j4 < 0) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong("usageTime" + aba.f322, j4);
            editorEdit.apply();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static boolean m306(Context context) throws PackageManager.NameNotFoundException {
        if (aba.f322 == null) {
            aba.m282(context);
            if (aba.f322 == null) {
                return false;
            }
            return true;
        }
        return true;
    }
}
