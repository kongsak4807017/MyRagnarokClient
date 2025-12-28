package o;

/* renamed from: o.Ů, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0167 extends fc {
    C0167(int[] iArr, int[] iArr2) {
        this.f5008 = (short) 201;
        for (int i = 0; i < iArr.length; i++) {
            this.f4868.putShort((short) (iArr[i] + 2));
            this.f4868.putShort((short) iArr2[i]);
        }
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
