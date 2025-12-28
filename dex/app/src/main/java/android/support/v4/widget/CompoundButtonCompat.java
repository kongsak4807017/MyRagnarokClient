package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class CompoundButtonCompat {
    private static final CompoundButtonCompatImpl IMPL;

    interface CompoundButtonCompatImpl {
        Drawable getButtonDrawable(CompoundButton compoundButton);

        ColorStateList getButtonTintList(CompoundButton compoundButton);

        PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton);

        void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList);

        void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            IMPL = new Api23CompoundButtonImpl();
        } else if (i >= 21) {
            IMPL = new LollipopCompoundButtonImpl();
        } else {
            IMPL = new BaseCompoundButtonCompat();
        }
    }

    static class BaseCompoundButtonCompat implements CompoundButtonCompatImpl {
        BaseCompoundButtonCompat() {
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
            CompoundButtonCompatDonut.setButtonTintList(compoundButton, colorStateList);
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public ColorStateList getButtonTintList(CompoundButton compoundButton) {
            return CompoundButtonCompatDonut.getButtonTintList(compoundButton);
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
            CompoundButtonCompatDonut.setButtonTintMode(compoundButton, mode);
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
            return CompoundButtonCompatDonut.getButtonTintMode(compoundButton);
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public Drawable getButtonDrawable(CompoundButton compoundButton) {
            return CompoundButtonCompatDonut.getButtonDrawable(compoundButton);
        }
    }

    static class LollipopCompoundButtonImpl extends BaseCompoundButtonCompat {
        LollipopCompoundButtonImpl() {
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.BaseCompoundButtonCompat, android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
            CompoundButtonCompatLollipop.setButtonTintList(compoundButton, colorStateList);
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.BaseCompoundButtonCompat, android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public ColorStateList getButtonTintList(CompoundButton compoundButton) {
            return CompoundButtonCompatLollipop.getButtonTintList(compoundButton);
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.BaseCompoundButtonCompat, android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
            CompoundButtonCompatLollipop.setButtonTintMode(compoundButton, mode);
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.BaseCompoundButtonCompat, android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
            return CompoundButtonCompatLollipop.getButtonTintMode(compoundButton);
        }
    }

    static class Api23CompoundButtonImpl extends LollipopCompoundButtonImpl {
        Api23CompoundButtonImpl() {
        }

        @Override // android.support.v4.widget.CompoundButtonCompat.BaseCompoundButtonCompat, android.support.v4.widget.CompoundButtonCompat.CompoundButtonCompatImpl
        public Drawable getButtonDrawable(CompoundButton compoundButton) {
            return CompoundButtonCompatApi23.getButtonDrawable(compoundButton);
        }
    }

    private CompoundButtonCompat() {
    }

    public static void setButtonTintList(CompoundButton compoundButton, ColorStateList colorStateList) {
        IMPL.setButtonTintList(compoundButton, colorStateList);
    }

    public static ColorStateList getButtonTintList(CompoundButton compoundButton) {
        return IMPL.getButtonTintList(compoundButton);
    }

    public static void setButtonTintMode(CompoundButton compoundButton, PorterDuff.Mode mode) {
        IMPL.setButtonTintMode(compoundButton, mode);
    }

    public static PorterDuff.Mode getButtonTintMode(CompoundButton compoundButton) {
        return IMPL.getButtonTintMode(compoundButton);
    }

    public static Drawable getButtonDrawable(CompoundButton compoundButton) {
        return IMPL.getButtonDrawable(compoundButton);
    }
}
