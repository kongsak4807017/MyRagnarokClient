package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class CompoundButtonCompatLollipop {
    CompoundButtonCompatLollipop() {
    }

    static void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    static ColorStateList getButtonTintList(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    static void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }

    static PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }
}
