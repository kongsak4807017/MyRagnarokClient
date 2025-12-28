package android.support.v4.text;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ICUCompatApi23 {
    private static final String TAG = "ICUCompatIcs";
    private static Method sAddLikelySubtagsMethod = null;

    ICUCompatApi23() {
    }

    static {
        try {
            sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static String maximizeAndGetScript(Locale locale) {
        try {
            return ((Locale) sAddLikelySubtagsMethod.invoke(null, locale)).getScript();
        } catch (IllegalAccessException unused) {
            return locale.getScript();
        } catch (InvocationTargetException unused2) {
            return locale.getScript();
        }
    }
}
