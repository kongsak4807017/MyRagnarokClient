package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̎, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0322 extends ub {
    C0322() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 743;
        short s = byteBuffer.getShort();
        byteBuffer.get(new byte[i]);
        if (z) {
            return;
        }
        if (s < 0 || s >= ni.valuesCustom().length) {
            nz.m907("Unknown map property: " + ((int) s));
        } else {
            C0358.f6669.f2063.f6884 = ni.valuesCustom()[s];
        }
    }
}
