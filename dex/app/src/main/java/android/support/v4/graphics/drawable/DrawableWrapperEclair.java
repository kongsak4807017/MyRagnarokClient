package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableWrapperDonut;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class DrawableWrapperEclair extends DrawableWrapperDonut {
    DrawableWrapperEclair(Drawable drawable) {
        super(drawable);
    }

    DrawableWrapperEclair(DrawableWrapperDonut.DrawableWrapperState drawableWrapperState, Resources resources) {
        super(drawableWrapperState, resources);
    }

    @Override // android.support.v4.graphics.drawable.DrawableWrapperDonut
    DrawableWrapperDonut.DrawableWrapperState mutateConstantState() {
        return new DrawableWrapperStateEclair(this.mState, null);
    }

    @Override // android.support.v4.graphics.drawable.DrawableWrapperDonut
    protected Drawable newDrawableFromState(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    static class DrawableWrapperStateEclair extends DrawableWrapperDonut.DrawableWrapperState {
        DrawableWrapperStateEclair(DrawableWrapperDonut.DrawableWrapperState drawableWrapperState, Resources resources) {
            super(drawableWrapperState, resources);
        }

        @Override // android.support.v4.graphics.drawable.DrawableWrapperDonut.DrawableWrapperState, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new DrawableWrapperEclair(this, resources);
        }
    }
}
