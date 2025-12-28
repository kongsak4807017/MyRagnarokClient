package android.support.v4.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ICUCompatIcs {
    private static final String TAG = "ICUCompatIcs";
    private static Method sAddLikelySubtagsMethod = null;
    private static Method sGetScriptMethod = null;

    ICUCompatIcs() {
    }

    static {
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                sGetScriptMethod = cls.getMethod("getScript", String.class);
                sAddLikelySubtagsMethod = cls.getMethod("addLikelySubtags", String.class);
            }
        } catch (Exception unused) {
            sGetScriptMethod = null;
            sAddLikelySubtagsMethod = null;
        }
    }

    public static String maximizeAndGetScript(Locale locale) {
        String strAddLikelySubtags = addLikelySubtags(locale);
        if (strAddLikelySubtags != null) {
            return getScript(strAddLikelySubtags);
        }
        return null;
    }

    private static String getScript(String str) {
        try {
            if (sGetScriptMethod != null) {
                return (String) sGetScriptMethod.invoke(null, str);
            }
            return null;
        } catch (IllegalAccessException unused) {
            return null;
        } catch (InvocationTargetException unused2) {
            return null;
        }
    }

    private static String addLikelySubtags(Locale locale) {
        String string = locale.toString();
        try {
            if (sAddLikelySubtagsMethod != null) {
                return (String) sAddLikelySubtagsMethod.invoke(null, string);
            }
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException unused2) {
        }
        return string;
    }
}
