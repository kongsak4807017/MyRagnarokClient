package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.v4.graphics.drawable.DrawableWrapperDonut;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class DrawableWrapperLollipop extends DrawableWrapperKitKat {
    DrawableWrapperLollipop(Drawable drawable) {
        super(drawable);
    }

    DrawableWrapperLollipop(DrawableWrapperDonut.DrawableWrapperState drawableWrapperState, Resources resources) {
        super(drawableWrapperState, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.mDrawable.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.mDrawable.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.mDrawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.mDrawable.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (isCompatTintEnabled()) {
            setCompatTintList(colorStateList);
        } else {
            this.mDrawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (isCompatTintEnabled()) {
            setCompatTint(i);
        } else {
            this.mDrawable.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (isCompatTintEnabled()) {
            setCompatTintMode(mode);
        } else {
            this.mDrawable.setTintMode(mode);
        }
    }

    @Override // android.support.v4.graphics.drawable.DrawableWrapperDonut, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.support.v4.graphics.drawable.DrawableWrapperDonut
    protected boolean isCompatTintEnabled() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.mDrawable;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable);
        }
        return false;
    }

    @Override // android.support.v4.graphics.drawable.DrawableWrapperKitKat, android.support.v4.graphics.drawable.DrawableWrapperHoneycomb, android.support.v4.graphics.drawable.DrawableWrapperDonut
    DrawableWrapperDonut.DrawableWrapperState mutateConstantState() {
        return new DrawableWrapperStateLollipop(this.mState, null);
    }

    static class DrawableWrapperStateLollipop extends DrawableWrapperDonut.DrawableWrapperState {
        DrawableWrapperStateLollipop(DrawableWrapperDonut.DrawableWrapperState drawableWrapperState, Resources resources) {
            super(drawableWrapperState, resources);
        }

        @Override // android.support.v4.graphics.drawable.DrawableWrapperDonut.DrawableWrapperState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new DrawableWrapperLollipop(this, resources);
        }
    }
}
