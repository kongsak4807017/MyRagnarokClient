package o;

import java.nio.ByteBuffer;

/* renamed from: o.榫, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0755 extends ub {
    C0755() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2470;
        long j = byteBuffer.getLong();
        short s = byteBuffer.getShort();
        if (z) {
            return;
        }
        if (s != 0) {
            if (s == 1) {
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(2455);
                c0698.m1432(strM649 == null ? "MSG2455" : strM649, 16711680);
            } else if (s == 2) {
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(3032);
                c06982.m1432(strM6492 == null ? "MSG3032" : strM6492, 16711680);
            }
            C0358.f6674.f42.f1808.mo439();
            return;
        }
        C0358.f6674.f42.f1808.f7951.setText(String.valueOf(String.valueOf(j)) + " z");
    }
}
