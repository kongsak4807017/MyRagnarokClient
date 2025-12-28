package android.support.v4.content;

import android.content.SharedPreferences;
import android.os.Build;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class SharedPreferencesCompat {

    public static final class EditorCompat {
        private static EditorCompat sInstance;
        private final Helper mHelper;

        interface Helper {
            void apply(SharedPreferences.Editor editor);
        }

        static class EditorHelperBaseImpl implements Helper {
            private EditorHelperBaseImpl() {
            }

            @Override // android.support.v4.content.SharedPreferencesCompat.EditorCompat.Helper
            public void apply(SharedPreferences.Editor editor) {
                editor.commit();
            }
        }

        static class EditorHelperApi9Impl implements Helper {
            private EditorHelperApi9Impl() {
            }

            @Override // android.support.v4.content.SharedPreferencesCompat.EditorCompat.Helper
            public void apply(SharedPreferences.Editor editor) {
                EditorCompatGingerbread.apply(editor);
            }
        }

        private EditorCompat() {
            if (Build.VERSION.SDK_INT >= 9) {
                this.mHelper = new EditorHelperApi9Impl();
            } else {
                this.mHelper = new EditorHelperBaseImpl();
            }
        }

        public static EditorCompat getInstance() {
            if (sInstance == null) {
                sInstance = new EditorCompat();
            }
            return sInstance;
        }

        public final void apply(SharedPreferences.Editor editor) {
            this.mHelper.apply(editor);
        }
    }

    private SharedPreferencesCompat() {
    }
}
