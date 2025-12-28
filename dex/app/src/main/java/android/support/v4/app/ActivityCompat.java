package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.ActivityCompat21;
import android.support.v4.content.ContextCompat;
import android.view.View;
import java.util.List;
import java.util.Map;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ActivityCompat extends ContextCompat {

    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    public static boolean invalidateOptionsMenu(Activity activity) {
        if (Build.VERSION.SDK_INT >= 11) {
            ActivityCompatHoneycomb.invalidateOptionsMenu(activity);
            return true;
        }
        return false;
    }

    public static void startActivity(Activity activity, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityCompatJB.startActivity(activity, intent, bundle);
        } else {
            activity.startActivity(intent);
        }
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityCompatJB.startActivityForResult(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void finishAffinity(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityCompatJB.finishAffinity(activity);
        } else {
            activity.finish();
        }
    }

    public static void finishAfterTransition(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            ActivityCompat21.finishAfterTransition(activity);
        } else {
            activity.finish();
        }
    }

    public Uri getReferrer(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return ActivityCompat22.getReferrer(activity);
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        if (Build.VERSION.SDK_INT >= 21) {
            ActivityCompat21.setEnterSharedElementCallback(activity, createCallback(sharedElementCallback));
        }
    }

    public static void setExitSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        if (Build.VERSION.SDK_INT >= 21) {
            ActivityCompat21.setExitSharedElementCallback(activity, createCallback(sharedElementCallback));
        }
    }

    public static void postponeEnterTransition(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            ActivityCompat21.postponeEnterTransition(activity);
        }
    }

    public static void startPostponedEnterTransition(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            ActivityCompat21.startPostponedEnterTransition(activity);
        }
    }

    public static void requestPermissions(final Activity activity, final String[] strArr, final int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            ActivityCompatApi23.requestPermissions(activity, strArr, i);
        } else if (activity instanceof OnRequestPermissionsResultCallback) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: android.support.v4.app.ActivityCompat.1
                @Override // java.lang.Runnable
                public final void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                    }
                    ((OnRequestPermissionsResultCallback) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ActivityCompatApi23.shouldShowRequestPermissionRationale(activity, str);
        }
        return false;
    }

    private static ActivityCompat21.SharedElementCallback21 createCallback(SharedElementCallback sharedElementCallback) {
        if (sharedElementCallback == null) {
            return null;
        }
        return new SharedElementCallback21Impl(sharedElementCallback);
    }

    static class SharedElementCallback21Impl extends ActivityCompat21.SharedElementCallback21 {
        private SharedElementCallback mCallback;

        public SharedElementCallback21Impl(SharedElementCallback sharedElementCallback) {
            this.mCallback = sharedElementCallback;
        }

        @Override // android.support.v4.app.ActivityCompat21.SharedElementCallback21
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.mCallback.onSharedElementStart(list, list2, list3);
        }

        @Override // android.support.v4.app.ActivityCompat21.SharedElementCallback21
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.mCallback.onSharedElementEnd(list, list2, list3);
        }

        @Override // android.support.v4.app.ActivityCompat21.SharedElementCallback21
        public void onRejectSharedElements(List<View> list) {
            this.mCallback.onRejectSharedElements(list);
        }

        @Override // android.support.v4.app.ActivityCompat21.SharedElementCallback21
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.mCallback.onMapSharedElements(list, map);
        }

        @Override // android.support.v4.app.ActivityCompat21.SharedElementCallback21
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.mCallback.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // android.support.v4.app.ActivityCompat21.SharedElementCallback21
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.mCallback.onCreateSnapshotView(context, parcelable);
        }
    }
}
