package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class DrawableCompatHoneycomb {
    DrawableCompatHoneycomb() {
    }

    public static void jumpToCurrentState(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static Drawable wrapForTinting(Drawable drawable) {
        if (!(drawable instanceof DrawableWrapperHoneycomb)) {
            return new DrawableWrapperHoneycomb(drawable);
        }
        return drawable;
    }
}
