package android.support.v4.widget;

import android.view.View;
import android.widget.PopupMenu;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class PopupMenuCompatKitKat {
    PopupMenuCompatKitKat() {
    }

    public static View.OnTouchListener getDragToOpenListener(Object obj) {
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}
