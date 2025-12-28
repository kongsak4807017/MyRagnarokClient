package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class DrawableCompatEclair {
    DrawableCompatEclair() {
    }

    public static Drawable wrapForTinting(Drawable drawable) {
        if (!(drawable instanceof DrawableWrapperEclair)) {
            return new DrawableWrapperEclair(drawable);
        }
        return drawable;
    }
}
