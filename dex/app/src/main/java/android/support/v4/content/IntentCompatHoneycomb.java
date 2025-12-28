package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class IntentCompatHoneycomb {
    IntentCompatHoneycomb() {
    }

    public static Intent makeMainActivity(ComponentName componentName) {
        return Intent.makeMainActivity(componentName);
    }

    public static Intent makeRestartActivityTask(ComponentName componentName) {
        return Intent.makeRestartActivityTask(componentName);
    }
}
