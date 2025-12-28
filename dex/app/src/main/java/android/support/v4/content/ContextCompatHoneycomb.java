package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import java.io.File;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ContextCompatHoneycomb {
    ContextCompatHoneycomb() {
    }

    static void startActivities(Context context, Intent[] intentArr) {
        context.startActivities(intentArr);
    }

    public static File getObbDir(Context context) {
        return context.getObbDir();
    }
}
