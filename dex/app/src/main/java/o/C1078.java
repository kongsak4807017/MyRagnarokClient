package o;

import android.support.v4.view.ViewPager;

/* renamed from: o.뽅, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1078 implements ViewPager.OnPageChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0778 f8861;

    C1078(C0778 c0778) {
        this.f8861 = c0778;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        C0821 c0821 = (C0821) ((ao) this.f8861.f7817.getAdapter()).f682.get(i);
        this.f8861.f7818 = c0821.f7937;
        this.f8861.m1467(i);
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }
}
