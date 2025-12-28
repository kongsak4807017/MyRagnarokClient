package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.䞚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0607 extends ub {
    C0607() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 286;
        byte b = byteBuffer.get();
        if (z) {
        }
        switch (b) {
            case 0:
                C0698 c0698 = C0358.f6674.f42.f1792;
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(218);
                c0698.m1432(strM649 == null ? "MSG218" : strM649, SupportMenu.USER_MASK);
                break;
            case 1:
                C0698 c06982 = C0358.f6674.f42.f1792;
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(FTPReply.NAME_SYSTEM_TYPE);
                c06982.m1432(strM6492 == null ? "MSG215" : strM6492, 16711680);
                break;
            case 2:
                C0698 c06983 = C0358.f6674.f42.f1792;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(217);
                c06983.m1432(strM6493 == null ? "MSG217" : strM6493, 16711680);
                break;
        }
    }
}
