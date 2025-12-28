package o;

import java.util.ArrayList;

/* renamed from: o.㼟, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0550 extends fc {
    C0550(int i, int i2, ArrayList<C0603> arrayList) {
        this.f5008 = (short) 2073;
        this.f4868.putInt(i);
        this.f4868.putInt(i2);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f4868.putShort((short) (arrayList.get(i3).f7406 + 2));
            if (C0358.f6667.f4830) {
                this.f4868.putInt(arrayList.get(i3).f7409.f8502);
            } else {
                this.f4868.putShort((short) arrayList.get(i3).f7409.f8502);
            }
            this.f4868.putShort((short) arrayList.get(i3).f7409.f8500);
        }
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
