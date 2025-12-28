package o;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

/* renamed from: o.җ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0401 extends PagerAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    AbstractC0769[] f6779;

    C0401(AbstractC0769[] abstractC0769Arr) {
        this.f6779 = abstractC0769Arr;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final int getCount() {
        return this.f6779.length;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void finishUpdate(View view) {
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // android.support.v4.view.PagerAdapter
    public final Parcelable saveState() {
        return null;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void startUpdate(View view) {
    }

    @Override // android.support.v4.view.PagerAdapter
    public final Object instantiateItem(View view, int i) {
        ((ViewPager) view).addView(this.f6779[i].f7796);
        return this.f6779[i].f7796;
    }
}
