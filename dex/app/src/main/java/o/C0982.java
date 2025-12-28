package o;

/* renamed from: o.ꑣ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0982 extends fc {
    C0982(int i, boolean z, byte[] bArr, String str) {
        this.f5008 = (short) 213;
        if (bArr.length != 8) {
            throw new nv("Invalid chatroom password length " + bArr.length);
        }
        this.f4868.putShort((short) i);
        this.f4868.put((byte) (z ? 0 : 1));
        this.f4868.put(bArr);
        this.f4868.put(pa.m987(str, ow.LOCAL, false));
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
