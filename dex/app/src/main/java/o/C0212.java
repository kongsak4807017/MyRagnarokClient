package o;

import o.pj;

/* renamed from: o.ǐ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0212 extends fc {
    C0212(String str, byte b, short s, short s2, int i, int i2, int i3, int i4, int i5, int i6) {
        if (C0358.f6667.f4776 == pj.EnumC0074.HERCULES && C0358.f6667.f4800 >= 20120307) {
            this.f5008 = (short) 2416;
            this.f4868.put(pa.m986(str, ow.LOCAL, 24));
            this.f4868.put(b);
            this.f4868.putShort(s2);
            this.f4868.putShort(s);
            return;
        }
        this.f5008 = (short) 103;
        this.f4868.put(pa.m986(str, ow.LOCAL, 24));
        this.f4868.put((byte) i);
        this.f4868.put((byte) i2);
        this.f4868.put((byte) i3);
        this.f4868.put((byte) i4);
        this.f4868.put((byte) i5);
        this.f4868.put((byte) i6);
        this.f4868.put(b);
        this.f4868.putShort(s2);
        this.f4868.putShort(s);
    }
}
