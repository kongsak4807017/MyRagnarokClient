package o;

/* renamed from: o.ΰ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0378 {

    /* renamed from: 櫯, reason: contains not printable characters */
    public String f6732;

    /* renamed from: 鷭, reason: contains not printable characters */
    public int f6733;

    public C0378(int i, String str) {
        this.f6733 = i;
        if (str == null || str.trim().length() == 0) {
            this.f6732 = C0640.m1403(i);
        } else {
            this.f6732 = String.valueOf(str) + " (response: " + C0640.m1403(i) + ")";
        }
    }

    public final String toString() {
        return "IabResult: " + this.f6732;
    }
}
