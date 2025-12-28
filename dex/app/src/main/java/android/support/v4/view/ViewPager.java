package android.support.v4.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.AttributeSet;
import android.util.FloatMath;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.vh;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    private PagerAdapter mAdapter;
    private OnAdapterChangeListener mAdapterChangeListener;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    private int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffectCompat mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffectCompat mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private Method mSetChildrenDrawingOrderEnabled;
    private final ItemInfo mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<ItemInfo> COMPARATOR = new Comparator<ItemInfo>() { // from class: android.support.v4.view.ViewPager.1
        @Override // java.util.Comparator
        public final int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.position - itemInfo2.position;
        }
    };
    private static final Interpolator sInterpolator = new Interpolator() { // from class: android.support.v4.view.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();

    interface Decor {
    }

    interface OnAdapterChangeListener {
        void onAdapterChanged(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    public interface PageTransformer {
        void transformPage(View view, float f);
    }

    static class ItemInfo {
        Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo() {
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: android.support.v4.view.ViewPager.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new ItemInfo();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: android.support.v4.view.ViewPager.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                ViewPager.this.setScrollState(0);
                ViewPager.this.populate();
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffectCompat(context);
        this.mRightEdge = new EdgeEffectCompat(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (16.0f * f);
        ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() { // from class: android.support.v4.view.ViewPager.4
            private final Rect mTempRect = new Rect();

            @Override // android.support.v4.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                if (windowInsetsCompatOnApplyWindowInsets.isConsumed()) {
                    return windowInsetsCompatOnApplyWindowInsets;
                }
                Rect rect = this.mTempRect;
                rect.left = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetLeft();
                rect.top = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetTop();
                rect.right = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetRight();
                rect.bottom = windowInsetsCompatOnApplyWindowInsets.getSystemWindowInsetBottom();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    WindowInsetsCompat windowInsetsCompatDispatchApplyWindowInsets = ViewCompat.dispatchApplyWindowInsets(ViewPager.this.getChildAt(i), windowInsetsCompatOnApplyWindowInsets);
                    rect.left = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetLeft(), rect.left);
                    rect.top = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetTop(), rect.top);
                    rect.right = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetRight(), rect.right);
                    rect.bottom = Math.min(windowInsetsCompatDispatchApplyWindowInsets.getSystemWindowInsetBottom(), rect.bottom);
                }
                return windowInsetsCompatOnApplyWindowInsets.replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        if (this.mScroller != null && !this.mScroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        if (this.mPageTransformer != null) {
            enableLayers(i != 0);
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        if (this.mAdapter != null) {
            this.mAdapter.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                ItemInfo itemInfo = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter2 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new PagerObserver();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        if (this.mAdapterChangeListener != null && pagerAdapter2 != pagerAdapter) {
            this.mAdapterChangeListener.onAdapterChanged(pagerAdapter2, pagerAdapter);
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).isDecor) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    void setOnAdapterChangeListener(OnAdapterChangeListener onAdapterChangeListener) {
        this.mAdapterChangeListener = onAdapterChangeListener;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) throws Resources.NotFoundException {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2) throws Resources.NotFoundException {
        setCurrentItemInternal(i, z, z2, 0);
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) throws Resources.NotFoundException {
        if (this.mAdapter == null || this.mAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.mAdapter.getCount()) {
            i = this.mAdapter.getCount() - 1;
        }
        int i3 = this.mOffscreenPageLimit;
        if (i > this.mCurItem + i3 || i < this.mCurItem - i3) {
            for (int i4 = 0; i4 < this.mItems.size(); i4++) {
                this.mItems.get(i4).scrolling = true;
            }
        }
        boolean z3 = this.mCurItem != i;
        if (this.mFirstLayout) {
            this.mCurItem = i;
            if (z3) {
                dispatchOnPageSelected(i);
            }
            requestLayout();
            return;
        }
        populate(i);
        scrollToItem(i, z, i2, z3);
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) throws Resources.NotFoundException {
        ItemInfo itemInfoInfoForPosition = infoForPosition(i);
        int clientWidth = 0;
        if (itemInfoInfoForPosition != null) {
            clientWidth = (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(itemInfoInfoForPosition.offset, this.mLastOffset)));
        }
        if (z) {
            smoothScrollTo(clientWidth, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void addOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    public void removeOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners != null) {
            this.mOnPageChangeListeners.remove(onPageChangeListener);
        }
    }

    public void clearOnPageChangeListeners() {
        if (this.mOnPageChangeListeners != null) {
            this.mOnPageChangeListeners.clear();
        }
    }

    public void setPageTransformer(boolean z, PageTransformer pageTransformer) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 11) {
            boolean z2 = pageTransformer != null;
            boolean z3 = z2 != (this.mPageTransformer != null);
            this.mPageTransformer = pageTransformer;
            setChildrenDrawingOrderEnabledCompat(z2);
            if (z2) {
                this.mDrawingOrder = z ? 2 : 1;
            } else {
                this.mDrawingOrder = 0;
            }
            if (z3) {
                populate();
            }
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.mSetChildrenDrawingOrderEnabled == null) {
                try {
                    this.mSetChildrenDrawingOrderEnabled = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
                } catch (NoSuchMethodException e) {
                    Log.e(TAG, "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.mSetChildrenDrawingOrderEnabled.invoke(this, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.e(TAG, "Error changing children drawing order", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        return ((LayoutParams) this.mDrawingOrderedChildren.get(this.mDrawingOrder == 2 ? (i - 1) - i2 : i2).getLayoutParams()).childIndex;
    }

    OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public void setOffscreenPageLimit(int i) throws Resources.NotFoundException {
        if (i <= 0) {
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setPageMargin(int i) throws Resources.NotFoundException {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    float distanceInfluenceForSnapDuration(float f) {
        return FloatMath.sin((float) ((f - 0.5f) * 0.4712389167638204d));
    }

    void smoothScrollTo(int i, int i2) throws Resources.NotFoundException {
        smoothScrollTo(i, i2, 0);
    }

    void smoothScrollTo(int i, int i2, int i3) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if ((this.mScroller == null || this.mScroller.isFinished()) ? false : true) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float fDistanceInfluenceForSnapDuration = i6 + (i6 * distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i4) * 1.0f) / clientWidth)));
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i4) / (this.mPageMargin + (clientWidth * this.mAdapter.getPageWidth(this.mCurItem)))) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(scrollX, scrollY, i4, i5, iMin);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    ItemInfo addNewItem(int i, int i2) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.position = i;
        itemInfo.object = this.mAdapter.instantiateItem((ViewGroup) this, i);
        itemInfo.widthFactor = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(itemInfo);
        } else {
            this.mItems.add(i2, itemInfo);
        }
        return itemInfo;
    }

    void dataSetChanged() throws Resources.NotFoundException {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int iMax = this.mCurItem;
        boolean z2 = false;
        int i = 0;
        while (i < this.mItems.size()) {
            ItemInfo itemInfo = this.mItems.get(i);
            int itemPosition = this.mAdapter.getItemPosition(itemInfo.object);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i);
                    i--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, itemInfo.position, itemInfo.object);
                    z = true;
                    if (this.mCurItem == itemInfo.position) {
                        iMax = Math.max(0, Math.min(this.mCurItem, count - 1));
                        z = true;
                    }
                } else if (itemInfo.position != itemPosition) {
                    if (itemInfo.position == this.mCurItem) {
                        iMax = itemPosition;
                    }
                    itemInfo.position = itemPosition;
                    z = true;
                }
            }
            i++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(iMax, false, true);
            requestLayout();
        }
    }

    void populate() throws Resources.NotFoundException {
        populate(this.mCurItem);
    }

    void populate(int i) throws Resources.NotFoundException {
        String hexString;
        ItemInfo itemInfoInfoForChild;
        ItemInfo itemInfoInfoForPosition = null;
        if (this.mCurItem != i) {
            itemInfoInfoForPosition = infoForPosition(this.mCurItem);
            this.mCurItem = i;
        }
        if (this.mAdapter == null) {
            sortChildDrawingOrder();
            return;
        }
        if (this.mPopulatePending) {
            sortChildDrawingOrder();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.startUpdate((ViewGroup) this);
        int i2 = this.mOffscreenPageLimit;
        int iMax = Math.max(0, this.mCurItem - i2);
        int count = this.mAdapter.getCount();
        int iMin = Math.min(count - 1, this.mCurItem + i2);
        if (count != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
        }
        ItemInfo itemInfoAddNewItem = null;
        int i3 = 0;
        while (true) {
            if (i3 >= this.mItems.size()) {
                break;
            }
            ItemInfo itemInfo = this.mItems.get(i3);
            if (itemInfo.position < this.mCurItem) {
                i3++;
            } else if (itemInfo.position == this.mCurItem) {
                itemInfoAddNewItem = itemInfo;
            }
        }
        if (itemInfoAddNewItem == null && count > 0) {
            itemInfoAddNewItem = addNewItem(this.mCurItem, i3);
        }
        if (itemInfoAddNewItem != null) {
            float f = 0.0f;
            int i4 = i3 - 1;
            ItemInfo itemInfo2 = i4 >= 0 ? this.mItems.get(i4) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - itemInfoAddNewItem.widthFactor) + (getPaddingLeft() / clientWidth);
            for (int i5 = this.mCurItem - 1; i5 >= 0; i5--) {
                if (f >= paddingLeft && i5 < iMax) {
                    if (itemInfo2 == null) {
                        break;
                    }
                    if (i5 == itemInfo2.position && !itemInfo2.scrolling) {
                        this.mItems.remove(i4);
                        this.mAdapter.destroyItem((ViewGroup) this, i5, itemInfo2.object);
                        i4--;
                        i3--;
                        itemInfo2 = i4 >= 0 ? this.mItems.get(i4) : null;
                    }
                } else if (itemInfo2 != null && i5 == itemInfo2.position) {
                    f += itemInfo2.widthFactor;
                    i4--;
                    itemInfo2 = i4 >= 0 ? this.mItems.get(i4) : null;
                } else {
                    f += addNewItem(i5, i4 + 1).widthFactor;
                    i3++;
                    itemInfo2 = i4 >= 0 ? this.mItems.get(i4) : null;
                }
            }
            float f2 = itemInfoAddNewItem.widthFactor;
            int i6 = i3 + 1;
            if (f2 < 2.0f) {
                ItemInfo itemInfo3 = i6 < this.mItems.size() ? this.mItems.get(i6) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                for (int i7 = this.mCurItem + 1; i7 < count; i7++) {
                    if (f2 >= paddingRight && i7 > iMin) {
                        if (itemInfo3 == null) {
                            break;
                        }
                        if (i7 == itemInfo3.position && !itemInfo3.scrolling) {
                            this.mItems.remove(i6);
                            this.mAdapter.destroyItem((ViewGroup) this, i7, itemInfo3.object);
                            itemInfo3 = i6 < this.mItems.size() ? this.mItems.get(i6) : null;
                        }
                    } else if (itemInfo3 != null && i7 == itemInfo3.position) {
                        f2 += itemInfo3.widthFactor;
                        i6++;
                        itemInfo3 = i6 < this.mItems.size() ? this.mItems.get(i6) : null;
                    } else {
                        ItemInfo itemInfoAddNewItem2 = addNewItem(i7, i6);
                        i6++;
                        f2 += itemInfoAddNewItem2.widthFactor;
                        itemInfo3 = i6 < this.mItems.size() ? this.mItems.get(i6) : null;
                    }
                }
            }
            calculatePageOffsets(itemInfoAddNewItem, i3, itemInfoInfoForPosition);
        }
        this.mAdapter.setPrimaryItem((ViewGroup) this, this.mCurItem, itemInfoAddNewItem != null ? itemInfoAddNewItem.object : null);
        this.mAdapter.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.childIndex = i8;
            if (!layoutParams.isDecor && layoutParams.widthFactor == 0.0f && (itemInfoInfoForChild = infoForChild(childAt)) != null) {
                layoutParams.widthFactor = itemInfoInfoForChild.widthFactor;
                layoutParams.position = itemInfoInfoForChild.position;
            }
        }
        sortChildDrawingOrder();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            ItemInfo itemInfoInfoForAnyChild = viewFindFocus != null ? infoForAnyChild(viewFindFocus) : null;
            if (itemInfoInfoForAnyChild == null || itemInfoInfoForAnyChild.position != this.mCurItem) {
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt2 = getChildAt(i9);
                    ItemInfo itemInfoInfoForChild2 = infoForChild(childAt2);
                    if (itemInfoInfoForChild2 != null && itemInfoInfoForChild2.position == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            if (this.mDrawingOrderedChildren == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                this.mDrawingOrderedChildren.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    private void calculatePageOffsets(ItemInfo itemInfo, int i, ItemInfo itemInfo2) {
        ItemInfo itemInfo3;
        ItemInfo itemInfo4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        if (itemInfo2 != null) {
            int i2 = itemInfo2.position;
            if (i2 < itemInfo.position) {
                int i3 = 0;
                float pageWidth = itemInfo2.offset + itemInfo2.widthFactor + f;
                int i4 = i2 + 1;
                while (i4 <= itemInfo.position && i3 < this.mItems.size()) {
                    ItemInfo itemInfo5 = this.mItems.get(i3);
                    while (true) {
                        itemInfo4 = itemInfo5;
                        if (i4 <= itemInfo4.position || i3 >= this.mItems.size() - 1) {
                            break;
                        }
                        i3++;
                        itemInfo5 = this.mItems.get(i3);
                    }
                    while (i4 < itemInfo4.position) {
                        pageWidth += this.mAdapter.getPageWidth(i4) + f;
                        i4++;
                    }
                    itemInfo4.offset = pageWidth;
                    pageWidth += itemInfo4.widthFactor + f;
                    i4++;
                }
            } else if (i2 > itemInfo.position) {
                int size = this.mItems.size() - 1;
                float pageWidth2 = itemInfo2.offset;
                int i5 = i2 - 1;
                while (i5 >= itemInfo.position && size >= 0) {
                    ItemInfo itemInfo6 = this.mItems.get(size);
                    while (true) {
                        itemInfo3 = itemInfo6;
                        if (i5 >= itemInfo3.position || size <= 0) {
                            break;
                        }
                        size--;
                        itemInfo6 = this.mItems.get(size);
                    }
                    while (i5 > itemInfo3.position) {
                        pageWidth2 -= this.mAdapter.getPageWidth(i5) + f;
                        i5--;
                    }
                    pageWidth2 -= itemInfo3.widthFactor + f;
                    itemInfo3.offset = pageWidth2;
                    i5--;
                }
            }
        }
        int size2 = this.mItems.size();
        float pageWidth3 = itemInfo.offset;
        int i6 = itemInfo.position - 1;
        this.mFirstOffset = itemInfo.position == 0 ? itemInfo.offset : -3.4028235E38f;
        this.mLastOffset = itemInfo.position == count + (-1) ? (itemInfo.offset + itemInfo.widthFactor) - 1.0f : Float.MAX_VALUE;
        int i7 = i - 1;
        while (i7 >= 0) {
            ItemInfo itemInfo7 = this.mItems.get(i7);
            while (i6 > itemInfo7.position) {
                int i8 = i6;
                i6--;
                pageWidth3 -= this.mAdapter.getPageWidth(i8) + f;
            }
            pageWidth3 -= itemInfo7.widthFactor + f;
            itemInfo7.offset = pageWidth3;
            if (itemInfo7.position == 0) {
                this.mFirstOffset = pageWidth3;
            }
            i7--;
            i6--;
        }
        float pageWidth4 = itemInfo.offset + itemInfo.widthFactor + f;
        int i9 = itemInfo.position + 1;
        int i10 = i + 1;
        while (i10 < size2) {
            ItemInfo itemInfo8 = this.mItems.get(i10);
            while (i9 < itemInfo8.position) {
                int i11 = i9;
                i9++;
                pageWidth4 += this.mAdapter.getPageWidth(i11) + f;
            }
            if (itemInfo8.position == count - 1) {
                this.mLastOffset = (itemInfo8.widthFactor + pageWidth4) - 1.0f;
            }
            itemInfo8.offset = pageWidth4;
            pageWidth4 += itemInfo8.widthFactor + f;
            i10++;
            i9++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() { // from class: android.support.v4.view.ViewPager.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.support.v4.os.ParcelableCompatCreatorCallbacks
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.support.v4.os.ParcelableCompatCreatorCallbacks
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        });
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.position + "}";
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        if (this.mAdapter != null) {
            savedState.adapterState = this.mAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.mAdapter != null) {
            this.mAdapter.restoreState(savedState.adapterState, savedState.loader);
            setCurrentItemInternal(savedState.position, false, true);
        } else {
            this.mRestoredCurItem = savedState.position;
            this.mRestoredAdapterState = savedState.adapterState;
            this.mRestoredClassLoader = savedState.loader;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.isDecor |= view instanceof Decor;
        if (this.mInLayout) {
            if (layoutParams2 != null && layoutParams2.isDecor) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.needsMeasure = true;
            addViewInLayout(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    ItemInfo infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            ItemInfo itemInfo = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, itemInfo.object)) {
                return itemInfo;
            }
        }
        return null;
    }

    ItemInfo infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return infoForChild(view);
            }
        }
    }

    ItemInfo infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            ItemInfo itemInfo = this.mItems.get(i2);
            if (itemInfo.position == i) {
                return itemInfo;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) throws Resources.NotFoundException {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.isDecor) {
                int i4 = layoutParams2.gravity & 7;
                int i5 = layoutParams2.gravity & 112;
                int i6 = ExploreByTouchHelper.INVALID_ID;
                int i7 = ExploreByTouchHelper.INVALID_ID;
                boolean z = i5 == 48 || i5 == 80;
                boolean z2 = i4 == 3 || i4 == 5;
                if (z) {
                    i6 = 1073741824;
                } else if (z2) {
                    i7 = 1073741824;
                }
                int i8 = paddingLeft;
                int i9 = measuredHeight;
                if (layoutParams2.width != -2) {
                    i6 = 1073741824;
                    if (layoutParams2.width != -1) {
                        i8 = layoutParams2.width;
                    }
                }
                if (layoutParams2.height != -2) {
                    i7 = 1073741824;
                    if (layoutParams2.height != -1) {
                        i9 = layoutParams2.height;
                    }
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8, i6), View.MeasureSpec.makeMeasureSpec(i9, i7));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.widthFactor), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            recomputeScrollPosition(i, i3, this.mPageMargin, this.mPageMargin);
        }
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        if (i2 > 0 && !this.mItems.isEmpty()) {
            scrollToItem(this.mCurItem, false, 0, false);
            return;
        }
        ItemInfo itemInfoInfoForPosition = infoForPosition(this.mCurItem);
        int iMin = (int) ((itemInfoInfoForPosition != null ? Math.min(itemInfoInfoForPosition.offset, this.mLastOffset) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            completeScroll(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        ItemInfo itemInfoInfoForChild;
        int measuredWidth;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    int i9 = layoutParams.gravity & 7;
                    int i10 = layoutParams.gravity & 112;
                    switch (i9) {
                        case 1:
                            measuredWidth = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            measuredWidth = paddingLeft;
                            break;
                        case 3:
                            measuredWidth = paddingLeft;
                            paddingLeft += childAt.getMeasuredWidth();
                            break;
                        case 5:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            break;
                    }
                    switch (i10) {
                        case 16:
                            measuredHeight = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            break;
                        case 48:
                            measuredHeight = paddingTop;
                            paddingTop += childAt.getMeasuredHeight();
                            break;
                        case vh.f5370 /* 80 */:
                            measuredHeight = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                            break;
                        default:
                            measuredHeight = paddingTop;
                            break;
                    }
                    int i11 = measuredWidth + scrollX;
                    childAt.layout(i11, measuredHeight, childAt.getMeasuredWidth() + i11, childAt.getMeasuredHeight() + measuredHeight);
                    i7++;
                }
            }
        }
        int i12 = (i5 - paddingLeft) - paddingRight;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.isDecor && (itemInfoInfoForChild = infoForChild(childAt2)) != null) {
                    int i14 = paddingLeft + ((int) (i12 * itemInfoInfoForChild.offset));
                    int i15 = paddingTop;
                    if (layoutParams2.needsMeasure) {
                        layoutParams2.needsMeasure = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (i12 * layoutParams2.widthFactor), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i14, i15, childAt2.getMeasuredWidth() + i14, i15 + childAt2.getMeasuredHeight());
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i6 - paddingBottom;
        this.mDecorChildCount = i7;
        if (this.mFirstLayout) {
            scrollToItem(this.mCurItem, false, 0, false);
        }
        this.mFirstLayout = false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        completeScroll(true);
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() == 0) {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (!this.mCalledSuper) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = clientWidth + this.mPageMargin;
        int i3 = itemInfoInfoForCurrentScrollPosition.position;
        float f = ((i / clientWidth) - itemInfoInfoForCurrentScrollPosition.offset) / (itemInfoInfoForCurrentScrollPosition.widthFactor + (this.mPageMargin / clientWidth));
        this.mCalledSuper = false;
        onPageScrolled(i3, f, (int) (i2 * f));
        if (!this.mCalledSuper) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    protected void onPageScrolled(int i, float f, int i2) {
        int measuredWidth;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isDecor) {
                    switch (layoutParams.gravity & 7) {
                        case 1:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            measuredWidth = paddingLeft;
                            break;
                        case 3:
                            measuredWidth = paddingLeft;
                            paddingLeft += childAt.getWidth();
                            break;
                        case 5:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                }
            }
        }
        dispatchOnPageScrolled(i, f, i2);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = getChildAt(i4);
                if (!((LayoutParams) childAt2.getLayoutParams()).isDecor) {
                    this.mPageTransformer.transformPage(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.mCalledSuper = true;
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageScrolled(i, f, i2);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener = this.mOnPageChangeListeners.get(i3);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrolled(i, f, i2);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageSelected(i);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageSelected(i);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageScrollStateChanged(i);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrollStateChanged(i);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    private void completeScroll(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            ItemInfo itemInfo = this.mItems.get(i);
            if (itemInfo.scrolling) {
                z2 = true;
                itemInfo.scrolling = false;
            }
        }
        if (z2) {
            if (z) {
                ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private boolean isGutterDrag(float f, float f2) {
        if (f >= this.mGutterSize || f2 <= 0.0f) {
            return f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f;
        }
        return true;
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewCompat.setLayerType(getChildAt(i), z ? 2 : 0, null);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                float y = motionEvent.getY();
                this.mInitialMotionY = y;
                this.mLastMotionY = y;
                this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    break;
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                    break;
                }
            case 2:
                int i = this.mActivePointerId;
                if (i != -1) {
                    int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i);
                    float x2 = MotionEventCompat.getX(motionEvent, iFindPointerIndex);
                    float f = x2 - this.mLastMotionX;
                    float fAbs = Math.abs(f);
                    float y2 = MotionEventCompat.getY(motionEvent, iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.mInitialMotionY);
                    if (f != 0.0f && !isGutterDrag(this.mLastMotionX, f) && canScroll(this, false, (int) f, (int) x2, (int) y2)) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y2;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                    if (fAbs > this.mTouchSlop && 0.5f * fAbs > fAbs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        this.mLastMotionX = f > 0.0f ? this.mInitialMotionX + this.mTouchSlop : this.mInitialMotionX - this.mTouchSlop;
                        this.mLastMotionY = y2;
                        setScrollingCacheEnabled(true);
                    } else if (fAbs2 > this.mTouchSlop) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(x2)) {
                        ViewCompat.postInvalidateOnAnimation(this);
                        break;
                    }
                }
                break;
            case 6:
                onSecondaryPointerUp(motionEvent);
                break;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        return this.mLeftEdge.onRelease() | this.mRightEdge.onRelease();
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean performDrag(float f) {
        boolean zOnPull = false;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + f2;
        int clientWidth = getClientWidth();
        float f3 = clientWidth * this.mFirstOffset;
        float f4 = clientWidth * this.mLastOffset;
        boolean z = true;
        boolean z2 = true;
        ItemInfo itemInfo = this.mItems.get(0);
        ItemInfo itemInfo2 = this.mItems.get(this.mItems.size() - 1);
        if (itemInfo.position != 0) {
            z = false;
            f3 = itemInfo.offset * clientWidth;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            z2 = false;
            f4 = itemInfo2.offset * clientWidth;
        }
        if (scrollX < f3) {
            if (z) {
                zOnPull = this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                zOnPull = this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
            }
            scrollX = f4;
        }
        this.mLastMotionX += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        pageScrolled((int) scrollX);
        return zOnPull;
    }

    private ItemInfo infoForCurrentScrollPosition() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = true;
        ItemInfo itemInfo = null;
        int i2 = 0;
        while (i2 < this.mItems.size()) {
            ItemInfo itemInfo2 = this.mItems.get(i2);
            if (!z && itemInfo2.position != i + 1) {
                itemInfo2 = this.mTempItem;
                itemInfo2.offset = f2 + f3 + f;
                itemInfo2.position = i + 1;
                itemInfo2.widthFactor = this.mAdapter.getPageWidth(itemInfo2.position);
                i2--;
            }
            float f4 = itemInfo2.offset;
            f2 = f4;
            float f5 = itemInfo2.widthFactor + f2 + f;
            if (!z && scrollX < f4) {
                return itemInfo;
            }
            if (scrollX < f5 || i2 == this.mItems.size() - 1) {
                return itemInfo2;
            }
            z = false;
            i = itemInfo2.position;
            f3 = itemInfo2.widthFactor;
            itemInfo = itemInfo2;
            i2++;
        }
        return itemInfo;
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.mFlingDistance && Math.abs(i2) > this.mMinimumVelocity) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            i = (int) (i + f + (i >= this.mCurItem ? 0.4f : 0.6f));
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).position, Math.min(i, this.mItems.get(this.mItems.size() - 1).position));
        }
        return i;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zDraw = false;
        int overScrollMode = ViewCompat.getOverScrollMode(this);
        if (overScrollMode == 0 || (overScrollMode == 1 && this.mAdapter != null && this.mAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = this.mLeftEdge.draw(canvas) | false;
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (zDraw) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = this.mPageMargin / width;
            int i = 0;
            ItemInfo itemInfo = this.mItems.get(0);
            float f3 = itemInfo.offset;
            int size = this.mItems.size();
            int i2 = this.mItems.get(size - 1).position;
            for (int i3 = itemInfo.position; i3 < i2; i3++) {
                while (i3 > itemInfo.position && i < size) {
                    i++;
                    itemInfo = this.mItems.get(i);
                }
                if (i3 == itemInfo.position) {
                    f = (itemInfo.offset + itemInfo.widthFactor) * width;
                    f3 = itemInfo.offset + itemInfo.widthFactor + f2;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i3);
                    f = (f3 + pageWidth) * width;
                    f3 += pageWidth + f2;
                }
                if (this.mPageMargin + f > scrollX) {
                    this.mMarginDrawable.setBounds((int) f, this.mTopPageBounds, (int) (this.mPageMargin + f + 0.5f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                }
                if (f > scrollX + width) {
                    return;
                }
            }
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            this.mVelocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
    }

    public void endFakeDrag() throws Resources.NotFoundException {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) VelocityTrackerCompat.getXVelocity(velocityTracker, this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            ItemInfo itemInfoInfoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(itemInfoInfoForCurrentScrollPosition.position, ((scrollX / clientWidth) - itemInfoInfoForCurrentScrollPosition.offset) / itemInfoInfoForCurrentScrollPosition.widthFactor, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f;
        float scrollX = getScrollX() - f;
        int clientWidth = getClientWidth();
        float f2 = clientWidth * this.mFirstOffset;
        float f3 = clientWidth * this.mLastOffset;
        ItemInfo itemInfo = this.mItems.get(0);
        ItemInfo itemInfo2 = this.mItems.get(this.mItems.size() - 1);
        if (itemInfo.position != 0) {
            f2 = itemInfo.offset * clientWidth;
        }
        if (itemInfo2.position != this.mAdapter.getCount() - 1) {
            f3 = itemInfo2.offset * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        this.mLastMotionX += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        pageScrolled((int) scrollX);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = MotionEventCompat.getX(motionEvent, i);
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.clear();
            }
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    protected boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom() && canScroll(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && ViewCompat.canScrollHorizontally(view, -i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return arrowScroll(17);
            case 22:
                return arrowScroll(66);
            case 61:
                if (Build.VERSION.SDK_INT < 11) {
                    return false;
                }
                if (KeyEventCompat.hasNoModifiers(keyEvent)) {
                    return arrowScroll(2);
                }
                if (!KeyEventCompat.hasModifiers(keyEvent, 1)) {
                    return false;
                }
                return arrowScroll(1);
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r8) {
        /*
            r7 = this;
            android.view.View r3 = r7.findFocus()
            if (r3 != r7) goto L9
            r3 = 0
            goto L66
        L9:
            if (r3 == 0) goto L66
            r4 = 0
            android.view.ViewParent r5 = r3.getParent()
        L10:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1d
            if (r5 != r7) goto L18
            r4 = 1
            goto L1d
        L18:
            android.view.ViewParent r5 = r5.getParent()
            goto L10
        L1d:
            if (r4 != 0) goto L66
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r5.append(r0)
            android.view.ViewParent r4 = r3.getParent()
        L33:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L4d
            java.lang.String r0 = " => "
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            android.view.ViewParent r4 = r4.getParent()
            goto L33
        L4d:
            java.lang.String r0 = "ViewPager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "arrowScroll tried to find focus based on non-child current focused view "
            r1.<init>(r2)
            java.lang.String r2 = r5.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            r3 = 0
        L66:
            r4 = 0
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r0.findNextFocus(r7, r3, r8)
            if (r5 == 0) goto Lb4
            if (r5 == r3) goto Lb4
            r0 = 17
            if (r8 != r0) goto L97
            android.graphics.Rect r0 = r7.mTempRect
            android.graphics.Rect r0 = r7.getChildRectInPagerCoordinates(r0, r5)
            int r4 = r0.left
            android.graphics.Rect r0 = r7.mTempRect
            android.graphics.Rect r0 = r7.getChildRectInPagerCoordinates(r0, r3)
            int r6 = r0.left
            if (r3 == 0) goto L91
            if (r4 < r6) goto L91
            boolean r4 = r7.pageLeft()
            goto Lcb
        L91:
            boolean r4 = r5.requestFocus()
            goto Lcb
        L97:
            r0 = 66
            if (r8 != r0) goto Lcb
            android.graphics.Rect r0 = r7.mTempRect
            android.graphics.Rect r0 = r7.getChildRectInPagerCoordinates(r0, r5)
            int r4 = r0.left
            android.graphics.Rect r0 = r7.mTempRect
            android.graphics.Rect r0 = r7.getChildRectInPagerCoordinates(r0, r3)
            int r6 = r0.left
            if (r3 == 0) goto Laf
            if (r4 <= r6) goto Lc7
        Laf:
            boolean r4 = r5.requestFocus()
            goto Lcb
        Lb4:
            r0 = 17
            if (r8 == r0) goto Lbb
            r0 = 1
            if (r8 != r0) goto Lc0
        Lbb:
            boolean r4 = r7.pageLeft()
            goto Lcb
        Lc0:
            r0 = 66
            if (r8 == r0) goto Lc7
            r0 = 2
            if (r8 != r0) goto Lcb
        Lc7:
            boolean r4 = r7.pageRight()
        Lcb:
            if (r4 == 0) goto Ld4
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r0)
        Ld4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.arrowScroll(int):boolean");
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    boolean pageLeft() {
        if (this.mCurItem > 0) {
            setCurrentItem(this.mCurItem - 1, true);
            return true;
        }
        return false;
    }

    boolean pageRight() {
        if (this.mAdapter != null && this.mCurItem < this.mAdapter.getCount() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ItemInfo itemInfoInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        ItemInfo itemInfoInfoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        ItemInfo itemInfoInfoForChild;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 0 || (itemInfoInfoForChild = infoForChild(childAt)) == null || itemInfoInfoForChild.position != this.mCurItem || !childAt.requestFocus(i, rect)) {
                i2 += i3;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo itemInfoInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (itemInfoInfoForChild = infoForChild(childAt)) != null && itemInfoInfoForChild.position == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        MyAccessibilityDelegate() {
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat accessibilityRecordCompatObtain = AccessibilityRecordCompat.obtain();
            accessibilityRecordCompatObtain.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.mAdapter != null) {
                accessibilityRecordCompatObtain.setItemCount(ViewPager.this.mAdapter.getCount());
                accessibilityRecordCompatObtain.setFromIndex(ViewPager.this.mCurItem);
                accessibilityRecordCompatObtain.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (ViewPager.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) throws Resources.NotFoundException {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (ViewPager.this.canScrollHorizontally(1)) {
                        ViewPager.this.setCurrentItem(ViewPager.this.mCurItem + 1);
                        break;
                    }
                    break;
                case 8192:
                    if (ViewPager.this.canScrollHorizontally(-1)) {
                        ViewPager.this.setCurrentItem(ViewPager.this.mCurItem - 1);
                        break;
                    }
                    break;
            }
            return true;
        }

        private boolean canScroll() {
            return ViewPager.this.mAdapter != null && ViewPager.this.mAdapter.getCount() > 1;
        }
    }

    class PagerObserver extends DataSetObserver {
        private PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws Resources.NotFoundException {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.dataSetChanged();
        }
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
            super(-1, -1);
            this.widthFactor = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.widthFactor = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class ViewPositionComparator implements Comparator<View> {
        ViewPositionComparator() {
        }

        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.isDecor != layoutParams2.isDecor) {
                return layoutParams.isDecor ? 1 : -1;
            }
            return layoutParams.position - layoutParams2.position;
        }
    }
}
