package android.support.v4.content;

import android.content.SharedPreferences;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class EditorCompatGingerbread {
    EditorCompatGingerbread() {
    }

    public static void apply(SharedPreferences.Editor editor) {
        try {
            editor.apply();
        } catch (AbstractMethodError unused) {
            editor.commit();
        }
    }
}
