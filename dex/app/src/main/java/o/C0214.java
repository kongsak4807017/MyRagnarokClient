package o;

/* renamed from: o.Ǔ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0214 extends fc {
    C0214(int i, byte[] bArr) {
        this.f5008 = (short) 2089;
        if (bArr.length != 6) {
            throw new nv("Unexpected birth date length != 6: " + bArr.length);
        }
        this.f4868.putInt(i);
        this.f4868.put(bArr);
    }
}
