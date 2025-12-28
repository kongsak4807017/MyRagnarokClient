package o;

import java.nio.ByteBuffer;

/* renamed from: o.덁, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1018 extends ub {
    C1018() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2474;
        short s = byteBuffer.getShort();
        long j = byteBuffer.getLong();
        int i3 = byteBuffer.getInt();
        if (z) {
        }
        switch (s) {
            case 0:
                C0358.f6674.f42.f1808.f7951.setText(String.valueOf(String.valueOf(j)) + " z");
                C0358.f6674.f42.f1808.f7952.setText(String.valueOf(String.valueOf(i3)) + " z");
                C0358.f6664.f2004.f8636 = i3;
                C0358.f6674.f42.f1781.m474(C0358.f6664.f2004);
                break;
            case 1:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(2456);
                c0698.m1432(strM649 == null ? "MSG2456" : strM649, 16711680);
                break;
            case 2:
            default:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(2455);
                c06982.m1432(strM6492 == null ? "MSG2455" : strM6492, 16711680);
                break;
            case 3:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(2490);
                c06983.m1432(strM6493 == null ? "MSG2490" : strM6493, 16711680);
                break;
        }
    }
}
