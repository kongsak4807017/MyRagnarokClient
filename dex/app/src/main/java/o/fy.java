package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fy {

    /* renamed from: 櫯, reason: contains not printable characters */
    lw f1298;

    /* renamed from: 鷭, reason: contains not printable characters */
    String f1299;

    fy(String str, byte[] bArr) {
        this.f1299 = str;
        try {
            this.f1298 = new lw(bArr);
        } catch (Exception e) {
            throw new nv(e, "Failed to init wav: " + str);
        }
    }
}
