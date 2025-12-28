package o;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adp {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static Executor f516;

    @SuppressLint({"InlinedApi"})
    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m350(AsyncTask<Void, ?, ?> asyncTask) {
        if (Build.VERSION.SDK_INT <= 12) {
            asyncTask.execute(new Void[0]);
        } else {
            asyncTask.executeOnExecutor(f516 != null ? f516 : AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
