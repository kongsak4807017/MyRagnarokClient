package android.support.v4.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ActionBarDrawerToggleHoneycomb {
    private static final String TAG = "ActionBarDrawerToggleHoneycomb";
    private static final int[] THEME_ATTRS = {R.attr.homeAsUpIndicator};

    ActionBarDrawerToggleHoneycomb() {
    }

    public static Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            obj = new SetIndicatorInfo(activity);
        }
        SetIndicatorInfo setIndicatorInfo = (SetIndicatorInfo) obj;
        if (setIndicatorInfo.setHomeAsUpIndicator != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                setIndicatorInfo.setHomeAsUpIndicator.invoke(actionBar, drawable);
                setIndicatorInfo.setHomeActionContentDescription.invoke(actionBar, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        } else if (setIndicatorInfo.upIndicatorView != null) {
            setIndicatorInfo.upIndicatorView.setImageDrawable(drawable);
        }
        return obj;
    }

    public static Object setActionBarDescription(Object obj, Activity activity, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj == null) {
            obj = new SetIndicatorInfo(activity);
        }
        SetIndicatorInfo setIndicatorInfo = (SetIndicatorInfo) obj;
        if (setIndicatorInfo.setHomeAsUpIndicator != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                setIndicatorInfo.setHomeActionContentDescription.invoke(actionBar, Integer.valueOf(i));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception unused) {
            }
        }
        return obj;
    }

    public static Drawable getThemeUpIndicator(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(THEME_ATTRS);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    static class SetIndicatorInfo {
        public Method setHomeActionContentDescription;
        public Method setHomeAsUpIndicator;
        public ImageView upIndicatorView;

        SetIndicatorInfo(Activity activity) {
            try {
                this.setHomeAsUpIndicator = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.setHomeActionContentDescription = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(R.id.home);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                View childAt2 = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                if (childAt2 instanceof ImageView) {
                    this.upIndicatorView = (ImageView) childAt2;
                }
            }
        }
    }
}
