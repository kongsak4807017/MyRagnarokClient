package o;

import android.util.Log;

/* renamed from: o.黬, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0959 extends fc {
    C0959(byte[] bArr) {
        this.f5008 = (short) 516;
        if (bArr.length != 16) {
            Log.e("AndRO", "Invalid hash");
            throw new nv("Invalid hash");
        }
        this.f4868.put(bArr);
    }
}
