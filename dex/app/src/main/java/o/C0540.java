package o;

import com.roworkshop.ro.natives;
import java.nio.ByteBuffer;

/* renamed from: o.㱽, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0540 extends fc {
    C0540() {
        C0644 c0644 = C0358.f6671.f753;
        c0644.f3365 = false;
        if (c0644.f3365) {
            c0644.f3361 = ByteBuffer.allocate(16);
        } else {
            c0644.f3361 = null;
        }
        this.f5008 = (short) -28639;
        this.f4868.putInt(C0358.f6671.f753.f3364);
        byte[] bArr = new byte[32];
        if (C0358.f6671.f753.f3360 != null) {
            natives.procpacketsend(C0358.f6671.f753.f3360, C0358.f6671.f753.f3360.length, C0358.f6671.f753.f3363, bArr, 0);
        }
        this.f4868.put(bArr);
    }
}
