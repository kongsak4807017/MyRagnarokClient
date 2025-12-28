package android.support.v4.widget;

import android.os.Build;
import android.widget.ListView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ListViewCompat {
    public static void scrollListBy(ListView listView, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            ListViewCompatKitKat.scrollListBy(listView, i);
        } else {
            ListViewCompatDonut.scrollListBy(listView, i);
        }
    }

    private ListViewCompat() {
    }
}
