package o;

import android.support.v4.internal.view.SupportMenu;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aal {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f178;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f179;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f180;

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m224() {
        if (this.f179 < 7) {
            int i = this.f178 - 1;
            this.f178 = i;
            if (i == 0) {
                this.f180 += this.f180;
                int i2 = this.f179;
                this.f179 = i2 + 1;
                this.f178 = 3 << i2;
            }
        }
        this.f180 &= SupportMenu.USER_MASK;
        this.f178 &= 255;
        this.f179 &= 255;
    }

    public final String toString() {
        return "SEE2Context[\n  size=4\n  summ=" + this.f180 + "\n  shift=" + this.f179 + "\n  count=" + this.f178 + "\n]";
    }
}
