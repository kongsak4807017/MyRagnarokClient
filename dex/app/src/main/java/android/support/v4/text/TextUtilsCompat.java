package android.support.v4.text;

import android.os.Build;
import java.util.Locale;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class TextUtilsCompat {
    private static String ARAB_SCRIPT_SUBTAG;
    private static String HEBR_SCRIPT_SUBTAG;
    private static final TextUtilsCompatImpl IMPL;
    public static final Locale ROOT;

    static class TextUtilsCompatImpl {
        private TextUtilsCompatImpl() {
        }

        public String htmlEncode(String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                switch (cCharAt) {
                    case '\"':
                        sb.append("&quot;");
                        break;
                    case '&':
                        sb.append("&amp;");
                        break;
                    case '\'':
                        sb.append("&#39;");
                        break;
                    case '<':
                        sb.append("&lt;");
                        break;
                    case '>':
                        sb.append("&gt;");
                        break;
                    default:
                        sb.append(cCharAt);
                        break;
                }
            }
            return sb.toString();
        }

        public int getLayoutDirectionFromLocale(Locale locale) {
            if (locale != null && !locale.equals(TextUtilsCompat.ROOT)) {
                String strMaximizeAndGetScript = ICUCompat.maximizeAndGetScript(locale);
                if (strMaximizeAndGetScript == null) {
                    return getLayoutDirectionFromFirstChar(locale);
                }
                if (strMaximizeAndGetScript.equalsIgnoreCase(TextUtilsCompat.ARAB_SCRIPT_SUBTAG) || strMaximizeAndGetScript.equalsIgnoreCase(TextUtilsCompat.HEBR_SCRIPT_SUBTAG)) {
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        private static int getLayoutDirectionFromFirstChar(Locale locale) {
            switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                case 0:
                default:
                    return 0;
                case 1:
                case 2:
                    return 1;
            }
        }
    }

    static class TextUtilsCompatJellybeanMr1Impl extends TextUtilsCompatImpl {
        private TextUtilsCompatJellybeanMr1Impl() {
            super();
        }

        @Override // android.support.v4.text.TextUtilsCompat.TextUtilsCompatImpl
        public String htmlEncode(String str) {
            return TextUtilsCompatJellybeanMr1.htmlEncode(str);
        }

        @Override // android.support.v4.text.TextUtilsCompat.TextUtilsCompatImpl
        public int getLayoutDirectionFromLocale(Locale locale) {
            return TextUtilsCompatJellybeanMr1.getLayoutDirectionFromLocale(locale);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            IMPL = new TextUtilsCompatJellybeanMr1Impl();
        } else {
            IMPL = new TextUtilsCompatImpl();
        }
        ROOT = new Locale("", "");
        ARAB_SCRIPT_SUBTAG = "Arab";
        HEBR_SCRIPT_SUBTAG = "Hebr";
    }

    public static String htmlEncode(String str) {
        return IMPL.htmlEncode(str);
    }

    public static int getLayoutDirectionFromLocale(Locale locale) {
        return IMPL.getLayoutDirectionFromLocale(locale);
    }

    private TextUtilsCompat() {
    }
}
