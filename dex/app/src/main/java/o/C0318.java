package o;

import java.nio.ByteBuffer;
import java.util.Iterator;
import o.C0685;

/* renamed from: o.ˮ̈, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0318 extends ub {
    C0318() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 221;
        byteBuffer.getShort();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        byte b = byteBuffer.get();
        if (z || C0358.f6664.f2004.f8616 == null) {
            return;
        }
        C0685 c0685 = C0358.f6664.f2004.f8616;
        Iterator<C0685.C0686> it = c0685.f7620.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0685.C0686 next = it.next();
            if (next.f7626.equals(strM978)) {
                c0685.f7620.remove(next);
                if (b != 0) {
                    C1025 c1025 = C0358.f6674.f42.f1755;
                    cv cvVar = C0358.f6685;
                    String strM649 = C0358.f6687.m649(182);
                    c1025.m1603(String.format(strM649 == null ? "MSG182" : strM649, strM978), 16711680);
                } else {
                    C1025 c10252 = C0358.f6674.f42.f1755;
                    cv cvVar2 = C0358.f6685;
                    String strM6492 = C0358.f6687.m649(181);
                    c10252.m1603(String.format(strM6492 == null ? "MSG181" : strM6492, strM978), 16711680);
                }
            }
        }
        if (strM978.equals(C0358.f6664.f2004.f8368)) {
            C0358.f6664.f2004.f8616 = null;
            C0358.f6674.f42.f1755.mo439();
            if (b != 0) {
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(69);
                c0698.m1432(strM6493 == null ? "MSG69" : strM6493, 16711680);
            }
        }
    }
}
