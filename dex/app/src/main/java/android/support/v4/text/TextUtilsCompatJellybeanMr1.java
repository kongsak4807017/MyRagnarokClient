package android.support.v4.text;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class TextUtilsCompatJellybeanMr1 {
    TextUtilsCompatJellybeanMr1() {
    }

    public static String htmlEncode(String str) {
        return TextUtils.htmlEncode(str);
    }

    public static int getLayoutDirectionFromLocale(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
