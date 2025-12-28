package o;

import java.nio.ByteBuffer;

/* renamed from: o.䒊, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0578 extends ub {
    C0578() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws Throwable {
        this.f5008 = (short) 2759;
        ow owVar = ow.KOREAN;
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        byteBuffer.getShort();
        byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        byteBuffer.get(new byte[128]);
        if (z) {
            return;
        }
        C0237.m1264(strM978, i3, s);
    }
}
