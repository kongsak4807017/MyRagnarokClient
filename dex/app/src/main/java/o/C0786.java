package o;

import java.nio.ByteBuffer;

/* renamed from: o.焝, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class C0786 extends fc {
    C0786(int i, byte b, String str, C0888[] c0888Arr) {
        this.f5008 = (short) 2065;
        this.f4868.putInt(i);
        this.f4868.put((byte) 1);
        this.f4868.put(pa.m986(str, ow.LOCAL, 80));
        if (c0888Arr != null) {
            for (C0888 c0888 : c0888Arr) {
                ByteBuffer byteBuffer = this.f4868;
                if (C0358.f6667.f4830) {
                    byteBuffer.putInt(c0888.f8058);
                } else {
                    byteBuffer.putShort((short) c0888.f8058);
                }
                byteBuffer.putShort(c0888.f8057);
                byteBuffer.putInt(c0888.f8056);
            }
        }
        this.f4870 = (short) (this.f4868.position() + 4);
    }
}
