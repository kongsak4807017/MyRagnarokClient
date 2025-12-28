package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.security.MessageDigest;
import org.apache.http.protocol.HTTP;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aba {

    /* renamed from: 鷭, reason: contains not printable characters */
    public static String f323 = null;

    /* renamed from: 櫯, reason: contains not printable characters */
    public static String f322 = null;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public static String f320 = null;

    /* renamed from: ȃ, reason: contains not printable characters */
    public static String f319 = null;

    /* renamed from: Ą, reason: contains not printable characters */
    public static String f315 = null;

    /* renamed from: ą, reason: contains not printable characters */
    public static String f316 = null;

    /* renamed from: Ć, reason: contains not printable characters */
    public static String f317 = null;

    /* renamed from: ć, reason: contains not printable characters */
    public static String f318 = null;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public static String f321 = null;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m282(Context context) throws PackageManager.NameNotFoundException {
        f315 = Build.VERSION.RELEASE;
        f316 = Build.DISPLAY;
        f317 = Build.MODEL;
        f318 = Build.MANUFACTURER;
        if (context != null) {
            try {
                File filesDir = context.getFilesDir();
                if (filesDir != null) {
                    f323 = filesDir.getAbsolutePath();
                }
            } catch (Exception e) {
                if (adt.f529 <= 6) {
                    Log.e("HockeyApp", "Exception thrown when accessing the files dir:");
                }
                e.printStackTrace();
            }
        }
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                f319 = packageInfo.packageName;
                f322 = new StringBuilder().append(packageInfo.versionCode).toString();
                f320 = packageInfo.versionName;
                int iM279 = m279(context, packageManager);
                if (iM279 != 0 && iM279 > packageInfo.versionCode) {
                    f322 = String.valueOf(iM279);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                if (adt.f529 <= 6) {
                    Log.e("HockeyApp", "Exception thrown when accessing the package info:");
                }
                e2.printStackTrace();
            }
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(f319) || TextUtils.isEmpty(string)) {
            return;
        }
        String str = f319 + ":" + string + ":" + m278();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bytes = str.getBytes(HTTP.UTF_8);
            messageDigest.update(bytes, 0, bytes.length);
            f321 = m281(messageDigest.digest());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static File m280() {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/HockeyApp");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m279(Context context, PackageManager packageManager) {
        try {
            Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.getInt("buildNumber", 0);
            }
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            if (adt.f529 <= 6) {
                Log.e("HockeyApp", "Exception thrown when accessing the application info:");
            }
            e.printStackTrace();
            return 0;
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: 櫯, reason: contains not printable characters */
    private static String m278() {
        String str;
        if (Build.VERSION.SDK_INT >= 21) {
            str = Build.SUPPORTED_ABIS[0];
        } else {
            str = Build.CPU_ABI;
        }
        String str2 = "HA" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (str.length() % 10) + (Build.PRODUCT.length() % 10);
        String string = "";
        try {
            string = Build.class.getField("SERIAL").get(null).toString();
        } catch (Throwable unused) {
        }
        return str2 + ":" + string;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m281(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            cArr[i * 2] = charArray[i2 >>> 4];
            cArr[(i * 2) + 1] = charArray[i2 & 15];
        }
        return new String(cArr).replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5");
    }
}
