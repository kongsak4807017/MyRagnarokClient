package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class DrawableCompatKitKat {
    DrawableCompatKitKat() {
    }

    public static void setAutoMirrored(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static boolean isAutoMirrored(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static Drawable wrapForTinting(Drawable drawable) {
        if (!(drawable instanceof DrawableWrapperKitKat)) {
            return new DrawableWrapperKitKat(drawable);
        }
        return drawable;
    }

    public static int getAlpha(Drawable drawable) {
        return drawable.getAlpha();
    }
}
