package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class AccessibilityNodeProviderCompatKitKat {

    interface AccessibilityNodeInfoBridge {
        Object createAccessibilityNodeInfo(int i);

        List<Object> findAccessibilityNodeInfosByText(String str, int i);

        Object findFocus(int i);

        boolean performAction(int i, int i2, Bundle bundle);
    }

    AccessibilityNodeProviderCompatKitKat() {
    }

    public static Object newAccessibilityNodeProviderBridge(final AccessibilityNodeInfoBridge accessibilityNodeInfoBridge) {
        return new AccessibilityNodeProvider() { // from class: android.support.v4.view.accessibility.AccessibilityNodeProviderCompatKitKat.1
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) accessibilityNodeInfoBridge.createAccessibilityNodeInfo(i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return accessibilityNodeInfoBridge.findAccessibilityNodeInfosByText(str, i);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i, int i2, Bundle bundle) {
                return accessibilityNodeInfoBridge.performAction(i, i2, bundle);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) accessibilityNodeInfoBridge.findFocus(i);
            }
        };
    }
}
