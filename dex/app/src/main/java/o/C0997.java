package o;

import java.nio.ByteBuffer;

/* renamed from: o.균, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0997 extends ub {
    C0997() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2548;
        long j = byteBuffer.getLong();
        mu muVar = mu.valuesCustom()[byteBuffer.get()];
        mq mqVar = mq.valuesCustom()[byteBuffer.get()];
        if (z) {
            return;
        }
        C0698 c0698 = C0358.f6674.f42.f1792;
        cv cvVar = C0358.f6685;
        int i3 = mqVar.f2152;
        String strM649 = C0358.f6687.m649(i3);
        c0698.m1432(strM649 == null ? "MSG" + i3 : strM649, 16776960);
        C0803 c0803 = C0358.f6674.f42.f1798.f1136;
        if (c0803.f7867 == j && c0803.f7868 == muVar) {
            C0358.f6674.f42.f1798.m571(new C1008[0]);
        }
    }
}
