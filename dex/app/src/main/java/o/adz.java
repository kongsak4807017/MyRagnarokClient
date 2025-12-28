package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.aca;
import org.apache.http.protocol.HTTP;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adz {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static final Pattern f548 = Pattern.compile("[0-9a-f]+", 2);

    /* renamed from: 櫯, reason: contains not printable characters */
    private static final char[] f547 = "0123456789ABCDEF".toCharArray();

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static final ThreadLocal<DateFormat> f546 = new aea();

    /* renamed from: 鷭, reason: contains not printable characters */
    public static String m384(String str) {
        try {
            return URLEncoder.encode(str, HTTP.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static final boolean m380(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: 鷭, reason: contains not printable characters */
    public static Boolean m382() {
        try {
            return Boolean.valueOf(Build.VERSION.SDK_INT >= 11 && m376("android.app.Fragment"));
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static Boolean m383(WeakReference<Activity> weakReference) {
        Activity activity;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            Configuration configuration = activity.getResources().getConfiguration();
            return Boolean.valueOf((configuration.screenLayout & 15) == 3 || (configuration.screenLayout & 15) == 4);
        }
        return false;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public static String m377(String str) {
        if (str == null) {
            throw new IllegalArgumentException("App ID must not be null.");
        }
        String strTrim = str.trim();
        Matcher matcher = f548.matcher(strTrim);
        if (strTrim.length() != 32) {
            throw new IllegalArgumentException("App ID length must be 32 characters.");
        }
        if (!matcher.matches()) {
            throw new IllegalArgumentException("App ID must match regex pattern /[0-9a-f]+/i");
        }
        return strTrim;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    private static boolean m376(String str) {
        try {
            return Class.forName(str) != null;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static Notification m381(Context context, PendingIntent pendingIntent, String str, String str2, int i) {
        if (Build.VERSION.SDK_INT >= 11 && m376("android.app.Notification.Builder")) {
            Notification.Builder smallIcon = new Notification.Builder(context).setContentTitle(str).setContentText(str2).setContentIntent(pendingIntent).setSmallIcon(i);
            return Build.VERSION.SDK_INT < 16 ? smallIcon.getNotification() : smallIcon.build();
        }
        return m378(context, pendingIntent, str, str2, i);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static Notification m378(Context context, PendingIntent pendingIntent, String str, String str2, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Notification notification = new Notification(i, "", System.currentTimeMillis());
        try {
            notification.getClass().getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class).invoke(notification, context, str, str2, pendingIntent);
        } catch (Exception unused) {
        }
        return notification;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static boolean m385(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static String m379(Context context) throws PackageManager.NameNotFoundException {
        if (context == null) {
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return applicationInfo != null ? (String) packageManager.getApplicationLabel(applicationInfo) : context.getString(aca.C0005.hockeyapp_crash_dialog_app_name_fallback);
    }
}
