package o;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.roworkshop.andro.c_activity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import o.aca;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class abb {

    /* renamed from: ȃ, reason: contains not printable characters */
    static long f325;

    /* renamed from: 鷭, reason: contains not printable characters */
    static String f328 = null;

    /* renamed from: 櫯, reason: contains not printable characters */
    static String f327 = null;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static boolean f326 = false;

    /* renamed from: Ą, reason: contains not printable characters */
    private static boolean f324 = false;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m290(c_activity c_activityVar, String str) throws PackageManager.NameNotFoundException {
        if (c_activityVar != null) {
            if (f325 == 0) {
                f325 = System.currentTimeMillis();
            }
            f327 = "https://sdk.hockeyapp.net/";
            f328 = adz.m377(str);
            f324 = false;
            aba.m282(c_activityVar);
            if (f328 == null) {
                f328 = aba.f319;
            }
        }
        Boolean bool = false;
        WeakReference weakReference = new WeakReference(c_activityVar);
        int iM288 = m288(weakReference);
        if (iM288 != 1) {
            if (iM288 == 2) {
                m292(weakReference, null, bool.booleanValue());
                return;
            } else {
                m293((abi) null, bool.booleanValue());
                return;
            }
        }
        f324 = true;
        if (Boolean.valueOf(Boolean.valueOf(!(c_activityVar instanceof Activity)).booleanValue() | PreferenceManager.getDefaultSharedPreferences(c_activityVar).getBoolean("always_send_crash_reports", false)).booleanValue()) {
            m292(weakReference, null, bool.booleanValue());
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        Context context = (Context) weakReference.get();
        if (context != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(String.format(context.getString(aca.C0005.hockeyapp_crash_dialog_title), adz.m379(context)));
            builder.setMessage(aca.C0005.hockeyapp_crash_dialog_message);
            builder.setNegativeButton(aca.C0005.hockeyapp_crash_dialog_negative_button, new abc(null, weakReference, zBooleanValue));
            builder.setNeutralButton(aca.C0005.hockeyapp_crash_dialog_neutral_button, new abd(null, weakReference, zBooleanValue));
            builder.setPositiveButton(aca.C0005.hockeyapp_crash_dialog_positive_button, new abe(null, weakReference, zBooleanValue));
            builder.create().show();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m288(WeakReference<Context> weakReference) {
        String[] strArrM295 = m295();
        List list = null;
        if (strArrM295 == null || strArrM295.length <= 0) {
            return 0;
        }
        List listAsList = null;
        if (weakReference != null) {
            try {
                Context context = weakReference.get();
                if (context != null) {
                    listAsList = Arrays.asList(context.getSharedPreferences("HockeySDK", 0).getString("ConfirmedFilenames", "").split("\\|"));
                }
                list = listAsList;
            } catch (Exception unused) {
            }
        } else {
            list = listAsList;
        }
        if (list != null) {
            for (String str : strArrM295) {
                if (list.contains(str)) {
                }
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static boolean m294(acr acrVar, abi abiVar, WeakReference<Context> weakReference, boolean z) {
        switch (abh.f341[acrVar.ordinal()]) {
            case 1:
                String[] strArrM295 = m295();
                if (strArrM295 != null && strArrM295.length > 0) {
                    new StringBuilder("Found ").append(strArrM295.length).append(" stacktrace(s).");
                    for (int i = 0; i < strArrM295.length; i++) {
                        if (weakReference != null) {
                            try {
                                new StringBuilder("Delete stacktrace ").append(strArrM295[i]).append(".");
                                m285(weakReference, strArrM295[i]);
                                Context context = weakReference.get();
                                if (context != null) {
                                    context.deleteFile(strArrM295[i]);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
                m293(abiVar, z);
                break;
            case 2:
                Context context2 = null;
                if (weakReference != null) {
                    context2 = weakReference.get();
                }
                if (context2 != null) {
                    PreferenceManager.getDefaultSharedPreferences(context2).edit().putBoolean("always_send_crash_reports", true).apply();
                    m292(weakReference, abiVar, z);
                    break;
                }
                break;
            case 3:
                m292(weakReference, abiVar, z);
                break;
        }
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m292(WeakReference<Context> weakReference, abi abiVar, boolean z) {
        m286(weakReference);
        m293(abiVar, z);
        Context context = weakReference.get();
        if ((context == null || adz.m385(context)) && !f326) {
            f326 = true;
            new abf(weakReference, abiVar, null).start();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m293(abi abiVar, boolean z) {
        if (!TextUtils.isEmpty(aba.f322) && !TextUtils.isEmpty(aba.f319)) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                new StringBuilder("Current handler class = ").append(defaultUncaughtExceptionHandler.getClass().getName());
            }
            if (defaultUncaughtExceptionHandler instanceof abj) {
                ((abj) defaultUncaughtExceptionHandler).f344 = abiVar;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(new abj(defaultUncaughtExceptionHandler, abiVar, z));
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m291(WeakReference<Context> weakReference, String str) {
        Context context;
        if (weakReference != null && (context = weakReference.get()) != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("HockeySDK", 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            int i = sharedPreferences.getInt("RETRY_COUNT: " + str, 0);
            if (i > 0) {
                m285(weakReference, str);
                m287(weakReference, str);
            } else {
                editorEdit.putInt("RETRY_COUNT: " + str, i + 1);
                editorEdit.apply();
            }
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static void m287(WeakReference<Context> weakReference, String str) {
        Context context;
        if (weakReference != null && (context = weakReference.get()) != null) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("HockeySDK", 0).edit();
            editorEdit.remove("RETRY_COUNT: " + str);
            editorEdit.apply();
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static void m285(WeakReference<Context> weakReference, String str) {
        Context context;
        if (weakReference != null && (context = weakReference.get()) != null) {
            context.deleteFile(str);
            context.deleteFile(str.replace(".stacktrace", ".user"));
            context.deleteFile(str.replace(".stacktrace", ".contact"));
            context.deleteFile(str.replace(".stacktrace", ".description"));
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    static String m284(WeakReference<Context> weakReference, String str) throws IOException {
        Context context;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.openFileInput(str)));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(line);
                        sb.append(System.getProperty("line.separator"));
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                }
                bufferedReader.close();
            } catch (FileNotFoundException unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static void m286(WeakReference<Context> weakReference) {
        Context context;
        if (weakReference != null && (context = weakReference.get()) != null) {
            try {
                String[] strArrM295 = m295();
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("HockeySDK", 0).edit();
                editorEdit.putString("ConfirmedFilenames", m289(strArrM295, "|"));
                editorEdit.apply();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m289(String[] strArr, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            stringBuffer.append(strArr[i]);
            if (i < strArr.length - 1) {
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static String[] m295() {
        if (aba.f323 != null) {
            new StringBuilder("Looking for exceptions in: ").append(aba.f323);
            File file = new File(aba.f323 + "/");
            if (!file.mkdir() && !file.exists()) {
                return new String[0];
            }
            return file.list(new abg());
        }
        return null;
    }
}
