package o;

/* renamed from: o.ƪ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0199 extends fc {
    C0199(int i, int[] iArr) {
        this.f5008 = (short) 398;
        iArr = iArr == null ? new int[3] : iArr;
        if (C0358.f6667.f4830) {
            this.f4868.putInt(i);
            for (int i2 : iArr) {
                this.f4868.putInt(i2);
            }
            return;
        }
        this.f4868.putShort((short) i);
        for (int i3 : iArr) {
            this.f4868.putShort((short) i3);
        }
    }
}
