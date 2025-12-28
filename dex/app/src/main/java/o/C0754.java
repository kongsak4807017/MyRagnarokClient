package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import org.apache.commons.net.telnet.TelnetCommand;

/* renamed from: o.榟, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0754 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    static final int[] f7746 = {242, TelnetCommand.BREAK, TelnetCommand.IP, -1};

    C0754() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 315;
        short s = byteBuffer.getShort();
        if (z) {
            return;
        }
        if (s == 0) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(TelnetCommand.BREAK);
            c0698.m1432(strM649 == null ? "MSG243" : strM649, 16711680);
            return;
        }
        if (s == 1) {
            C0698 c06982 = C0358.f6674.f42.f1792;
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(TelnetCommand.IP);
            c06982.m1432(strM6492 == null ? "MSG244" : strM6492, 16711680);
            return;
        }
        if (s == 2) {
            C0698 c06983 = C0358.f6674.f42.f1792;
            cv cvVar3 = C0358.f6685;
            String strM6493 = C0358.f6687.m649(TelnetCommand.AO);
            c06983.m1432(strM6493 == null ? "MSG245" : strM6493, 16711680);
            return;
        }
        if (s == 3) {
            if (EnumC1048.m1617(EnumC0134.m1250(C0358.f6664.f2004.f2001).m1256().f8819 & 4095) == EnumC1048.ASSASSIN) {
                C0698 c06984 = C0358.f6674.f42.f1792;
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(1041);
                c06984.m1432(strM6494 == null ? "MSG1041" : strM6494, SupportMenu.USER_MASK);
                return;
            }
            if (EnumC1048.m1617(EnumC0134.m1250(C0358.f6664.f2004.f2001).m1256().f8819 & 255) == EnumC1048.GUNSLINGER) {
                C0698 c06985 = C0358.f6674.f42.f1792;
                cv cvVar5 = C0358.f6685;
                String strM6495 = C0358.f6687.m649(1176);
                c06985.m1432(strM6495 == null ? "MSG1176" : strM6495, SupportMenu.USER_MASK);
                return;
            }
            if (EnumC1048.m1617(EnumC0134.m1250(C0358.f6664.f2004.f2001).m1256().f8819 & 255) != EnumC1048.NINJA) {
                C0698 c06986 = C0358.f6674.f42.f1792;
                cv cvVar6 = C0358.f6685;
                String strM6496 = C0358.f6687.m649(TelnetCommand.AYT);
                c06986.m1432(strM6496 == null ? "MSG246" : strM6496, SupportMenu.USER_MASK);
            }
        }
    }
}
