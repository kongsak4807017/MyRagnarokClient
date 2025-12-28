package o;

import android.support.v4.internal.view.SupportMenu;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class aap {

    /* renamed from: 䆬, reason: contains not printable characters */
    protected byte[] f205 = new byte[32768];

    /* renamed from: 麹, reason: contains not printable characters */
    protected int f206;

    /* renamed from: 윬, reason: contains not printable characters */
    protected int f207;

    /* renamed from: Ą, reason: contains not printable characters */
    public final void m248() {
        this.f206 = 0;
        this.f207 = 0;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m253(int i) {
        int i2 = i + this.f207;
        this.f206 += i2 >> 3;
        this.f207 = i2 & 7;
    }

    /* renamed from: ą, reason: contains not printable characters */
    public final int m249() {
        return (((((this.f205[this.f206] & 255) << 16) + ((this.f205[this.f206 + 1] & 255) << 8)) + (this.f205[this.f206 + 2] & 255)) >>> (8 - this.f207)) & SupportMenu.USER_MASK;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m252(int i) {
        int i2 = i + this.f207;
        this.f206 += i2 >> 3;
        this.f207 = i2 & 7;
    }

    /* renamed from: Ć, reason: contains not printable characters */
    public final boolean m250() {
        return this.f206 + 3 >= 32768;
    }

    /* renamed from: ć, reason: contains not printable characters */
    public final byte[] m251() {
        return this.f205;
    }
}
