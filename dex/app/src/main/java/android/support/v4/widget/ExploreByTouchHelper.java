package android.support.v4.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewParentCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityManagerCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityNodeProviderCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    private static final String DEFAULT_CLASS_NAME = View.class.getName();
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private final AccessibilityManager mManager;
    private ExploreByTouchNodeProvider mNodeProvider;
    private final View mView;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    private int mFocusedVirtualViewId = INVALID_ID;
    private int mHoveredVirtualViewId = INVALID_ID;

    protected abstract int getVirtualViewAt(float f, float f2);

    protected abstract void getVisibleVirtualViews(List<Integer> list);

    protected abstract boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle);

    protected abstract void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent);

    protected abstract void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public ExploreByTouchHelper(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mView = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
    }

    @Override // android.support.v4.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new ExploreByTouchNodeProvider();
        }
        return this.mNodeProvider;
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !AccessibilityManagerCompat.isTouchExplorationEnabled(this.mManager)) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 7:
            case 9:
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                updateHoveredVirtualView(virtualViewAt);
                return virtualViewAt != Integer.MIN_VALUE;
            case 8:
            default:
                return false;
            case 10:
                if (this.mFocusedVirtualViewId != Integer.MIN_VALUE) {
                    updateHoveredVirtualView(INVALID_ID);
                    return true;
                }
                return false;
        }
    }

    public boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mView.getParent()) == null) {
            return false;
        }
        return ViewParentCompat.requestSendAccessibilityEvent(parent, this.mView, createEvent(i, i2));
    }

    public void invalidateRoot() {
        invalidateVirtualView(-1);
    }

    public void invalidateVirtualView(int i) {
        sendEventForVirtualView(i, 2048);
    }

    public int getFocusedVirtualView() {
        return this.mFocusedVirtualViewId;
    }

    private void updateHoveredVirtualView(int i) {
        if (this.mHoveredVirtualViewId == i) {
            return;
        }
        int i2 = this.mHoveredVirtualViewId;
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        switch (i) {
            case -1:
                return createEventForHost(i2);
            default:
                return createEventForChild(i, i2);
        }
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        ViewCompat.onInitializeAccessibilityEvent(this.mView, accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(DEFAULT_CLASS_NAME);
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setPackageName(this.mView.getContext().getPackageName());
        AccessibilityEventCompat.asRecord(accessibilityEventObtain).setSource(this.mView, i);
        return accessibilityEventObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityNodeInfoCompat createNode(int i) {
        switch (i) {
            case -1:
                return createNodeForHost();
            default:
                return createNodeForChild(i);
        }
    }

    private AccessibilityNodeInfoCompat createNodeForHost() {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain(this.mView);
        ViewCompat.onInitializeAccessibilityNodeInfo(this.mView, accessibilityNodeInfoCompatObtain);
        onPopulateNodeForHost(accessibilityNodeInfoCompatObtain);
        LinkedList linkedList = new LinkedList();
        getVisibleVirtualViews(linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            accessibilityNodeInfoCompatObtain.addChild(this.mView, ((Integer) it.next()).intValue());
        }
        return accessibilityNodeInfoCompatObtain;
    }

    private AccessibilityNodeInfoCompat createNodeForChild(int i) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        accessibilityNodeInfoCompatObtain.setEnabled(true);
        accessibilityNodeInfoCompatObtain.setClassName(DEFAULT_CLASS_NAME);
        onPopulateNodeForVirtualView(i, accessibilityNodeInfoCompatObtain);
        if (accessibilityNodeInfoCompatObtain.getText() == null && accessibilityNodeInfoCompatObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompatObtain.getBoundsInParent(this.mTempParentRect);
        if (this.mTempParentRect.isEmpty()) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoCompatObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompatObtain.setPackageName(this.mView.getContext().getPackageName());
        accessibilityNodeInfoCompatObtain.setSource(this.mView, i);
        accessibilityNodeInfoCompatObtain.setParent(this.mView);
        if (this.mFocusedVirtualViewId == i) {
            accessibilityNodeInfoCompatObtain.setAccessibilityFocused(true);
            accessibilityNodeInfoCompatObtain.addAction(128);
        } else {
            accessibilityNodeInfoCompatObtain.setAccessibilityFocused(false);
            accessibilityNodeInfoCompatObtain.addAction(64);
        }
        if (intersectVisibleToUser(this.mTempParentRect)) {
            accessibilityNodeInfoCompatObtain.setVisibleToUser(true);
            accessibilityNodeInfoCompatObtain.setBoundsInParent(this.mTempParentRect);
        }
        this.mView.getLocationOnScreen(this.mTempGlobalRect);
        int i2 = this.mTempGlobalRect[0];
        int i3 = this.mTempGlobalRect[1];
        this.mTempScreenRect.set(this.mTempParentRect);
        this.mTempScreenRect.offset(i2, i3);
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(this.mTempScreenRect);
        return accessibilityNodeInfoCompatObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean performAction(int i, int i2, Bundle bundle) {
        switch (i) {
            case -1:
                return performActionForHost(i2, bundle);
            default:
                return performActionForChild(i, i2, bundle);
        }
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        return ViewCompat.performAccessibilityAction(this.mView, i, bundle);
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        switch (i2) {
            case 64:
            case 128:
                return manageFocusForChild(i, i2, bundle);
            default:
                return onPerformActionForVirtualView(i, i2, bundle);
        }
    }

    private boolean manageFocusForChild(int i, int i2, Bundle bundle) {
        switch (i2) {
            case 64:
                return requestAccessibilityFocus(i);
            case 128:
                return clearAccessibilityFocus(i);
            default:
                return false;
        }
    }

    private boolean intersectVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mView.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.mView.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (ViewCompat.getAlpha(view) <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null || !this.mView.getLocalVisibleRect(this.mTempVisibleRect)) {
            return false;
        }
        return rect.intersect(this.mTempVisibleRect);
    }

    private boolean isAccessibilityFocused(int i) {
        return this.mFocusedVirtualViewId == i;
    }

    private boolean requestAccessibilityFocus(int i) {
        if (this.mManager.isEnabled() && AccessibilityManagerCompat.isTouchExplorationEnabled(this.mManager) && !isAccessibilityFocused(i)) {
            if (this.mFocusedVirtualViewId != Integer.MIN_VALUE) {
                sendEventForVirtualView(this.mFocusedVirtualViewId, 65536);
            }
            this.mFocusedVirtualViewId = i;
            this.mView.invalidate();
            sendEventForVirtualView(i, 32768);
            return true;
        }
        return false;
    }

    private boolean clearAccessibilityFocus(int i) {
        if (isAccessibilityFocused(i)) {
            this.mFocusedVirtualViewId = INVALID_ID;
            this.mView.invalidate();
            sendEventForVirtualView(i, 65536);
            return true;
        }
        return false;
    }

    public void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    class ExploreByTouchNodeProvider extends AccessibilityNodeProviderCompat {
        private ExploreByTouchNodeProvider() {
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
            return ExploreByTouchHelper.this.createNode(i);
        }

        @Override // android.support.v4.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i, int i2, Bundle bundle) {
            return ExploreByTouchHelper.this.performAction(i, i2, bundle);
        }
    }
}
