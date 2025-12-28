package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ų, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0169 extends fc {
    C0169(String str, boolean z, C0447[] c0447Arr) {
        this.f5008 = (short) 434;
        this.f4868.put(pa.m986(str, ow.LOCAL, 80));
        this.f4868.put(z ? (byte) 1 : (byte) 0);
        if (c0447Arr != null) {
            for (C0447 c0447 : c0447Arr) {
                ByteBuffer byteBuffer = this.f4868;
                byteBuffer.putShort(c0447.f6867);
                byteBuffer.putShort(c0447.f6866);
                byteBuffer.putInt(c0447.f6865);
            }
        }
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
