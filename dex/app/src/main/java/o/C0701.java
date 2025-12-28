package o;

import java.io.IOException;
import java.nio.ByteBuffer;
import o.AbstractC0988;

/* renamed from: o.惙, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0701 extends ub {
    C0701() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws IOException {
        AbstractC0988 abstractC0988;
        this.f5008 = (short) 149;
        int i3 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        lm lmVar = C0358.f6664.f2005.get(i3);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        if (abstractC0988 == null) {
            return;
        }
        abstractC0988.f8361 = AbstractC0988.Cif.RESOLVED;
        abstractC0988.f8368 = strM978;
        mj mjVar = C0358.f6669.f2048.f1545.get(Integer.valueOf(i3));
        if (mjVar != null && C0358.f6669.f2061 == mjVar) {
            if (mjVar.f2129 != null) {
                mjVar.f2129.m175(mjVar);
            } else {
                mjVar.f2129 = new a(mjVar);
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1433(int i, String str, String str2, String str3, String str4, int i2) throws IOException {
        AbstractC0988 abstractC0988;
        lm lmVar = C0358.f6664.f2005.get(i);
        if (lmVar == null) {
            abstractC0988 = null;
        } else {
            abstractC0988 = (AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null);
        }
        AbstractC0988 abstractC09882 = abstractC0988;
        if (abstractC0988 == null) {
            return;
        }
        abstractC09882.f8361 = AbstractC0988.Cif.RESOLVED;
        abstractC09882.f8368 = str;
        abstractC09882.f8362 = str2;
        abstractC09882.f8369 = str3;
        abstractC09882.f8359 = str4;
        abstractC09882.f8365 = i2;
        if (abstractC09882.f1998 == C0358.f6664.f2004.f1998) {
            C0358.f6674.f42.f1740.f1633.setText(abstractC09882.f8369);
        }
        mj mjVar = C0358.f6669.f2048.f1545.get(Integer.valueOf(i));
        if (mjVar != null && C0358.f6669.f2061 == mjVar) {
            if (mjVar.f2129 != null) {
                mjVar.f2129.m175(mjVar);
            } else {
                mjVar.f2129 = new a(mjVar);
            }
        }
    }
}
