package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ć, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0132 {

    /* renamed from: 鷭, reason: contains not printable characters */
    public int[] f6254;

    public C0132(ByteBuffer byteBuffer) {
        this.f6254 = new int[4];
        for (int i = 0; i < this.f6254.length; i++) {
            this.f6254[i] = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        }
    }

    public C0132(short[] sArr) {
        this.f6254 = new int[4];
        if (C0358.f6667.f4830) {
            nz.m907("attempt to create short equipslotinfo while packetver wants long");
        }
        for (int i = 0; i < this.f6254.length; i++) {
            this.f6254[i] = pa.m968(sArr[i]);
        }
    }
}
