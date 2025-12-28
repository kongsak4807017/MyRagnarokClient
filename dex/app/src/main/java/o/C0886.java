package o;

import java.nio.ByteBuffer;
import o.C1035;
import o.C1035.C1038;
import o.C1035.Cif;
import o.kv;

/* renamed from: o.鈶, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0886 extends ub {
    C0886() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m1521(byte[] bArr, byte b, short s, short s2, short s3, int i, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, int i2, int i3, short s12, short s13, int i4, int i5, short s14, short s15) {
        AbstractC0988 abstractC0988;
        AbstractC0988 abstractC09882;
        if (C0358.f6664.f2004.f8618 == null) {
            C0358.f6664.f2004.f8618 = C0358.f6664.f2004.new Cif();
        }
        if (C0358.f6664.f2004.f8618.f8661 == null) {
            C0358.f6664.f2004.f8618.f8661 = C0358.f6664.f2004.new C1038();
        }
        C1035.Cif cif = C0358.f6664.f2004.f8618;
        C1035.C1038 c1038 = C0358.f6664.f2004.f8618.f8661;
        lm lmVar = C0358.f6664.f2005.get(c1038.f8689);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        if (abstractC0988 == null) {
            return;
        }
        cif.f8670 = i;
        cif.f8667 = s4;
        cif.f8658 = s5;
        cif.f8656 = s6;
        cif.f8644 = s7;
        cif.f8645 = s8;
        cif.f8646 = s9;
        cif.f8647 = s10;
        cif.f8659 = (short) (200 - (s11 / 10));
        cif.f8657 = i4;
        cif.f8648 = i5;
        cif.f8668 = s14;
        cif.f8664 = s15;
        cif.f8652 = b;
        c1038.f8690 = pa.m978(bArr, ow.LOCAL);
        c1038.f8684 = nu.HOM;
        c1038.f8683 = s3;
        c1038.f8693 = i2;
        c1038.f8691 = i3;
        c1038.f8688 = s12;
        c1038.f8686 = s13;
        c1038.f8681 = s2;
        c1038.f8687 = s;
        lm lmVar2 = C0358.f6664.f2005.get(c1038.f8689);
        if (lmVar2 == null) {
            abstractC09882 = null;
        } else {
            abstractC09882 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar2.getClass()) ? lmVar2 : null);
        }
        abstractC09882.f8370 = cif.f8664;
        C0358.f6674.f42.f1741.m1409();
        boolean z = false;
        int i6 = 0;
        while (true) {
            if (i6 >= C0358.f6674.f42.f1794.size()) {
                break;
            }
            if (C0358.f6674.f42.f1794.get(i6).f1934 != kv.EnumC0058.HOMUN) {
                i6++;
            } else {
                z = true;
                break;
            }
        }
        if (!z && !C0358.f6664.f2004.f8618.f8661.f8685) {
            AbstractC0988 abstractC09883 = abstractC09882;
            C0358.f6674.f42.m735(kv.EnumC0058.HOMUN, ((C0983) (C0983.class.isAssignableFrom(abstractC09883.getClass()) ? abstractC09883 : null)).f2001, -1, 0, (byte) 0);
        }
        if (C0358.f6664.f2004.f8618.f8661.f8693 <= 0) {
            C0358.f6674.f42.m738(kv.EnumC0058.HOMUN, -1);
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2551;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        byte b = byteBuffer.get();
        short s = byteBuffer.getShort();
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        int i3 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        short s6 = byteBuffer.getShort();
        short s7 = byteBuffer.getShort();
        short s8 = byteBuffer.getShort();
        short s9 = byteBuffer.getShort();
        short s10 = byteBuffer.getShort();
        short s11 = byteBuffer.getShort();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        short s12 = byteBuffer.getShort();
        short s13 = byteBuffer.getShort();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        short s14 = byteBuffer.getShort();
        short s15 = byteBuffer.getShort();
        if (z) {
            return;
        }
        m1521(bArr, b, s, s2, s3, i3, s4, s5, s6, s7, s8, s9, s10, s11, i4, i5, s12, s13, i6, i7, s14, s15);
    }
}
