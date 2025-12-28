package o;

import o.pj;

/* renamed from: o.锧, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0893 extends fc {
    C0893(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        this.f5008 = (short) 2120;
        this.f4868.putShort((short) iArr.length);
        if (C0358.f6667.f4771 != pj.aux.iRO_Renewal) {
            this.f4868.putInt(i);
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f4868.putInt(iArr[i2]);
            this.f4868.putInt(iArr2[i2]);
            this.f4868.putShort((short) iArr3[i2]);
        }
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
