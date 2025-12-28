package o;

import java.nio.ByteBuffer;
import o.C1035;
import o.C1035.C1038;
import o.C1035.Cif;

/* renamed from: o.ϒ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0383 extends ub {
    C0383() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 674;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8632 == null) {
            C0358.f6664.f2004.f8632 = C0358.f6664.f2004.new Cif();
        }
        if (C0358.f6664.f2004.f8632.f8661 == null) {
            C0358.f6664.f2004.f8632.f8661 = C0358.f6664.f2004.new C1038();
        }
        C1035.C1038 c1038 = C0358.f6664.f2004.f8632.f8661;
        C1035.Cif cif = C0358.f6664.f2004.f8632;
        if (s == EnumC0505.ATK1.f7206) {
            cif.f8667 = (short) i3;
        } else if (s == EnumC0505.MATK1.f7206) {
            cif.f8658 = (short) i3;
        } else if (s == EnumC0505.HIT.f7206) {
            cif.f8656 = (short) i3;
        } else if (s == EnumC0505.CRITICAL.f7206) {
            cif.f8644 = (short) i3;
        } else if (s == EnumC0505.DEF1.f7206) {
            cif.f8645 = (short) i3;
        } else if (s == EnumC0505.MDEF1.f7206) {
            cif.f8646 = (short) i3;
        } else if (s == EnumC0505.MERCFLEE.f7206) {
            cif.f8647 = (short) i3;
        } else if (s == EnumC0505.ASPD.f7206) {
            cif.f8659 = (short) i3;
        } else if (s == EnumC0505.HP.f7206) {
            c1038.f8693 = i3;
        } else if (s == EnumC0505.MAXHP.f7206) {
            c1038.f8691 = i3;
        } else if (s == EnumC0505.SP.f7206) {
            c1038.f8688 = i3;
        } else if (s == EnumC0505.MAXSP.f7206) {
            c1038.f8686 = i3;
        } else if (s == EnumC0505.MERCKILLS.f7206) {
            cif.f8660 = i3;
        } else if (s == EnumC0505.MERCFAITH.f7206) {
            c1038.f8683 = (short) i3;
        }
        C0358.f6674.f42.f1820.m1318();
    }
}
