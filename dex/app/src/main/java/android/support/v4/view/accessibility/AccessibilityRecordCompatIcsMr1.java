package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class AccessibilityRecordCompatIcsMr1 {
    AccessibilityRecordCompatIcsMr1() {
    }

    public static int getMaxScrollX(Object obj) {
        return ((AccessibilityRecord) obj).getMaxScrollX();
    }

    public static int getMaxScrollY(Object obj) {
        return ((AccessibilityRecord) obj).getMaxScrollY();
    }

    public static void setMaxScrollX(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollX(i);
    }

    public static void setMaxScrollY(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollY(i);
    }
}
