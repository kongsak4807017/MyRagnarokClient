package o;

import android.support.v4.widget.ExploreByTouchHelper;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class aev extends aeu {

    /* renamed from: 鷭, reason: contains not printable characters */
    public int f654 = 0;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f653 = 0;

    /* renamed from: 鷭, reason: contains not printable characters */
    public abstract void mo429();

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m428(short[] sArr, int i) {
        mo429();
        short s = sArr[i];
        int i2 = (this.f654 >>> 11) * s;
        if ((this.f653 ^ ExploreByTouchHelper.INVALID_ID) < (Integer.MIN_VALUE ^ i2)) {
            this.f654 = i2;
            sArr[i] = (short) (((2048 - s) >>> 5) + s);
            return 0;
        }
        this.f654 -= i2;
        this.f653 -= i2;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m427(short[] sArr) {
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        do {
            int iM428 = m428(sArr, i);
            i = (i << 1) | iM428;
            int i4 = i2;
            i2++;
            i3 |= iM428 << i4;
        } while (i < sArr.length);
        return i3;
    }
}
