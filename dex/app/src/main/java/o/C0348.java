package o;

import java.nio.ByteBuffer;

/* renamed from: o.ˮ̻, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0348 extends ub {
    C0348() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2008;
        short s = byteBuffer.getShort();
        byteBuffer.getShort();
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        if (z) {
            return;
        }
        m1287(s, b, b2);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1287(short s, byte b, byte b2) {
        if (s < 0 || s >= nm.valuesCustom().length) {
            nz.m907("PKT_MC_PARTYOPTION: Unexpected EXP value: " + ((int) s));
            return;
        }
        if (C0358.f6664.f2004.f8596 == null) {
            C0358.f6664.f2004.f8596 = new aq();
        }
        nm nmVar = nm.valuesCustom()[s];
        no noVar = no.valuesCustom()[b];
        nn nnVar = nn.valuesCustom()[b2];
        if (C0358.f6664.f2004.f8596.f687 != nmVar) {
            C0358.f6664.f2004.f8596.f687 = nmVar;
            if (nmVar == nm.EVEN_SHARE) {
                C0358.f6674.f42.f1792.m1432("Party share EXP: Even Share", 16776960);
            } else {
                C0358.f6674.f42.f1792.m1432("Party share EXP: Each Take", 16776960);
            }
        }
        if (C0358.f6664.f2004.f8596.f686 != nnVar) {
            C0358.f6664.f2004.f8596.f686 = nnVar;
            if (noVar == no.PICKER) {
                C0358.f6674.f42.f1792.m1432("Party pickup Items: Killer", 16776960);
            } else {
                C0358.f6674.f42.f1792.m1432("Party pickup Items: Anyone", 16776960);
            }
        }
        if (C0358.f6664.f2004.f8596.f685 != noVar) {
            C0358.f6664.f2004.f8596.f685 = noVar;
            if (noVar == no.PICKER) {
                C0358.f6674.f42.f1792.m1432("Party share Items: Picker", 16776960);
            } else {
                C0358.f6674.f42.f1792.m1432("Party share Items: Random", 16776960);
            }
        }
        if (C0358.f6674.f42.f1746.f1994.getParent() != null) {
            C0358.f6674.f42.f1746.m444();
        }
    }
}
