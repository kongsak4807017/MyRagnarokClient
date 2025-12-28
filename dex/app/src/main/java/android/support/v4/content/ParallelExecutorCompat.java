package android.support.v4.content;

import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ParallelExecutorCompat {
    public static Executor getParallelExecutor() {
        if (Build.VERSION.SDK_INT >= 11) {
            return ExecutorCompatHoneycomb.getParallelExecutor();
        }
        return ModernAsyncTask.THREAD_POOL_EXECUTOR;
    }

    private ParallelExecutorCompat() {
    }
}
