package android.support.v4.app;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
abstract class BaseFragmentActivityHoneycomb extends BaseFragmentActivityDonut {
    BaseFragmentActivityHoneycomb() {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (viewDispatchFragmentsOnCreateView == null && Build.VERSION.SDK_INT >= 11) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return viewDispatchFragmentsOnCreateView;
    }
}
