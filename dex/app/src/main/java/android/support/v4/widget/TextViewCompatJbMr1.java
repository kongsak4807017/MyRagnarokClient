package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class TextViewCompatJbMr1 {
    TextViewCompatJbMr1() {
    }

    public static void setCompoundDrawablesRelative(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        boolean z = textView.getLayoutDirection() == 1;
        textView.setCompoundDrawables(z ? drawable3 : drawable, drawable2, z ? drawable : drawable3, drawable4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        boolean z = textView.getLayoutDirection() == 1;
        textView.setCompoundDrawablesWithIntrinsicBounds(z ? drawable3 : drawable, drawable2, z ? drawable : drawable3, drawable4);
    }

    public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, int i, int i2, int i3, int i4) {
        boolean z = textView.getLayoutDirection() == 1;
        textView.setCompoundDrawablesWithIntrinsicBounds(z ? i3 : i, i2, z ? i : i3, i4);
    }
}
