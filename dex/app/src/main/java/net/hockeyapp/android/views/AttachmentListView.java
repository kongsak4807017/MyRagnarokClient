package net.hockeyapp.android.views;

import android.content.Context;
import android.net.Uri;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import o.aee;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class AttachmentListView extends ViewGroup {

    /* renamed from: 鷭, reason: contains not printable characters */
    private int f91;

    public AttachmentListView(Context context) {
        super(context);
    }

    public AttachmentListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final ArrayList<Uri> m170() {
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            arrayList.add(((aee) getChildAt(i)).f586);
        }
        return arrayList;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int paddingBottom = 0;
        int iMax = 0;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            aee aeeVar = (aee) childAt;
            paddingBottom = (aeeVar.f584 == 1 ? aeeVar.f578 : aeeVar.f576) + aeeVar.getPaddingTop();
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, ExploreByTouchHelper.INVALID_ID), View.MeasureSpec.makeMeasureSpec(paddingBottom, ExploreByTouchHelper.INVALID_ID));
                int measuredWidth = childAt.getMeasuredWidth();
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + layoutParams.height);
                if (paddingLeft + measuredWidth > size) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += iMax;
                }
                paddingLeft += layoutParams.width + measuredWidth;
            }
        }
        this.f91 = iMax;
        if (View.MeasureSpec.getMode(i2) == 0) {
            paddingBottom = paddingTop + iMax + getPaddingBottom();
        } else if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && paddingTop + iMax + getPaddingBottom() < paddingBottom) {
            paddingBottom = paddingTop + iMax + getPaddingBottom();
        }
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(1, 1);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                childAt.invalidate();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (paddingLeft + measuredWidth > i5) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += this.f91;
                }
                childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
                paddingLeft += layoutParams.width + measuredWidth + ((aee) childAt).f579;
            }
        }
    }
}
