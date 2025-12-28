package o;

/* renamed from: o.㫜, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0536 extends fc {
    C0536(int i, int i2, int[] iArr, int[] iArr2) {
        if (C0358.f6667.f4800 >= 20100105) {
            this.f5008 = (short) 2049;
            this.f4868.putInt(i);
            this.f4868.putInt(i2);
        } else {
            this.f5008 = (short) 308;
            this.f4868.putInt(i);
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f4868.putShort((short) iArr2[i3]);
            this.f4868.putShort((short) iArr[i3]);
        }
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
