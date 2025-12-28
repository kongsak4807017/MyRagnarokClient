package o;

import android.support.v4.view.ViewPager;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ei implements ViewPager.OnPageChangeListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ eh f1187;

    ei(eh ehVar) {
        this.f1187 = ehVar;
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        this.f1187.m579(mu.valuesCustom()[i]);
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }
}
