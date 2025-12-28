package o;

import android.support.v4.view.MotionEventCompat;
import java.nio.ByteBuffer;

/* renamed from: o.䙍, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0604 extends ub {
    C0604() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f5008 = (short) 526;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        int i7 = byteBuffer.getInt();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        if (z) {
        }
        switch (b2) {
            case 0:
                switch (b) {
                    case 0:
                        i6 = 838;
                        break;
                    case 1:
                        i6 = 839;
                        break;
                    case 2:
                        i6 = 840;
                        break;
                }
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(i6);
                c0698.m1432(String.format(strM649 == null ? "MSG" + i6 : strM649, C0358.f6664.f2004.f8368, strM978), 13553407);
                break;
            case 1:
                switch (b) {
                    case 0:
                        i5 = 841;
                        break;
                    case 1:
                        i5 = 842;
                        break;
                    case 2:
                        i5 = 843;
                        break;
                }
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(i5);
                c06982.m1432(String.format(strM6492 == null ? "MSG" + i5 : strM6492, C0358.f6664.f2004.f8368, strM978), 13553407);
                break;
            case 10:
                switch (b) {
                    case 0:
                        i4 = 844;
                        break;
                    case 1:
                        i4 = 845;
                        break;
                    case 2:
                        i4 = 846;
                        break;
                }
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(i4);
                c06983.m1432(String.format(strM6493 == null ? "MSG" + i4 : strM6493, C0358.f6664.f2004.f8368, strM978), 13553407);
                break;
            case 11:
                switch (b) {
                    case 0:
                        i3 = 847;
                        break;
                    case 1:
                        i3 = 848;
                        break;
                    case 2:
                        i3 = 849;
                        break;
                }
                C0698 c06984 = C0358.f6674.f42.f1792;
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(i3);
                c06984.m1432(String.format(strM6494 == null ? "MSG" + i3 : strM6494, C0358.f6664.f2004.f8368, strM978), 13553407);
                break;
            case 20:
                C0698 c06985 = C0358.f6674.f42.f1792;
                cv cvVar5 = C0358.f6685;
                String strM6495 = C0358.f6687.m649(928);
                c06985.m1432(String.format(strM6495 == null ? "MSG928" : strM6495, strM978, Byte.valueOf(b)), 13553407);
                break;
            case 21:
                C0698 c06986 = C0358.f6674.f42.f1792;
                cv cvVar6 = C0358.f6685;
                String strM6496 = C0358.f6687.m649(1191);
                c06986.m1432(String.format(strM6496 == null ? "MSG1191" : strM6496, strM978), 13553407);
                break;
            case 22:
                C0698 c06987 = C0358.f6674.f42.f1792;
                cv cvVar7 = C0358.f6685;
                String strM6497 = C0358.f6687.m649(1266);
                String str = strM6497 == null ? "MSG1266" : strM6497;
                Object[] objArr = new Object[1];
                C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(i7);
                objArr[0] = c0432M1648 == null ? null : c0432M1648.m1328(true);
                c06987.m1432(String.format(str, objArr), 13553407);
                break;
            case 30:
                C0698 c06988 = C0358.f6674.f42.f1792;
                cv cvVar8 = C0358.f6685;
                String strM6498 = C0358.f6687.m649(1034);
                c06988.m1432(strM6498 == null ? "MSG1034" : strM6498, 13553407);
                break;
            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                C0358.f6674.f42.f1792.m1432("Target HP: " + i7, 13553407);
                break;
        }
    }
}
