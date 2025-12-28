package o;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import java.util.LinkedList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class ao extends PagerAdapter {

    /* renamed from: 櫯, reason: contains not printable characters */
    LinkedList<ap> f682;

    ao(LinkedList<ap> linkedList) {
        this.f682 = new LinkedList<>();
        this.f682 = linkedList;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        return this.f682.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void finishUpdate(View view) {
    }

    @Override // android.support.v4.view.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // android.support.v4.view.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void startUpdate(View view) {
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(View view, int i) {
        ((ViewPager) view).addView(this.f682.get(i).f683);
        return this.f682.get(i).f683;
    }
}
