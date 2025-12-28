package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface DrawableWrapper {
    Drawable getWrappedDrawable();

    void setCompatTint(int i);

    void setCompatTintList(ColorStateList colorStateList);

    void setCompatTintMode(PorterDuff.Mode mode);

    void setWrappedDrawable(Drawable drawable);
}
