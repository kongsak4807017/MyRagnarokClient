package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ListViewCompatDonut {
    ListViewCompatDonut() {
    }

    static void scrollListBy(ListView listView, int i) {
        View childAt;
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null) {
            return;
        }
        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
    }
}
