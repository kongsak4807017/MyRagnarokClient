package o;

/* renamed from: o.弉, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class C0687 extends fc {
    public C0687(int[] iArr, int i, int i2, int[] iArr2) {
        this.f5008 = (short) 2020;
        this.f4868.putInt(i);
        this.f4868.putInt(i2);
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            this.f4868.putShort((short) iArr2[i3]);
            this.f4868.putShort((short) iArr[i3]);
        }
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
