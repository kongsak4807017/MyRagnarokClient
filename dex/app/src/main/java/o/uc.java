package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class uc {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public int f5013;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f5014;

    /* renamed from: 鷭, reason: contains not printable characters */
    public byte[] f5015;

    public uc(int i) {
        this.f5015 = new byte[i];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1106() {
        if (this.f5013 != this.f5014 && this.f5014 != 0) {
            System.arraycopy(this.f5015, this.f5014, this.f5015, 0, this.f5013 - this.f5014);
        }
        this.f5013 -= this.f5014;
        this.f5014 = 0;
    }
}
