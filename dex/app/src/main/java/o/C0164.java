package o;

/* renamed from: o.ũ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0164 extends fc {
    C0164(int[] iArr, int[] iArr2) {
        this.f5008 = (short) 200;
        for (int i = 0; i < iArr.length; i++) {
            this.f4868.putShort((short) iArr2[i]);
            if (C0358.f6667.f4830) {
                this.f4868.putInt(iArr[i]);
            } else {
                this.f4868.putShort((short) iArr[i]);
            }
        }
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
