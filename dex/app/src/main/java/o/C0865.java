package o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;

/* renamed from: o.賈, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0865 extends ub {
    C0865() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 327;
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        pa.m978(bArr, owVar);
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        c_activity c_activityVar = C0358.f6674;
        je.m715(new gt(s, s2, s3, s4, s5, b > 0), s3, (nu) null);
    }
}
