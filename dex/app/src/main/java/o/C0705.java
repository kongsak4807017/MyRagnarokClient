package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;

/* renamed from: o.愡, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0705 extends ub {
    C0705() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 331;
        byte b = byteBuffer.get();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        if (b == 0) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(388);
            c0698.m1432(String.format(strM649 == null ? "MSG388" : strM649, strM978), SupportMenu.USER_MASK);
            return;
        }
        C0698 c06982 = C0358.f6674.f42.f1792;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(389);
        c06982.m1432(String.format(strM6492 == null ? "MSG389" : strM6492, strM978), 16711680);
    }
}
