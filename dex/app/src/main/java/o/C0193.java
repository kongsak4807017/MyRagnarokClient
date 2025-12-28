package o;

/* renamed from: o.Ơ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0193 extends fc {
    C0193(String str, long j, String str2, String str3) {
        this.f5008 = (short) 2540;
        this.f4868.put(pa.m986(str, ow.LOCAL, 24));
        this.f4868.put(pa.m986(C0358.f6664.f2004.f8368, ow.LOCAL, 24));
        this.f4868.putLong(j);
        this.f4868.putShort((short) (str2.length() + 1));
        this.f4868.putShort((short) (str3.length() + 1));
        this.f4868.put(pa.m986(str2, ow.LOCAL, str2.length() + 1));
        this.f4868.put(pa.m986(str3, ow.LOCAL, str3.length() + 1));
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
