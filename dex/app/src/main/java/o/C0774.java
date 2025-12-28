package o;

import java.nio.ByteBuffer;

/* renamed from: o.浇, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0774 extends ub {
    C0774() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2599;
        short s = byteBuffer.getShort();
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        m1460(s, i3);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1460(short s, int i) {
        ne neVar;
        switch (s) {
            case 5:
                neVar = ne.HEAL;
                break;
            case 6:
            default:
                return;
            case 7:
                neVar = ne.SP_HEAL;
                break;
        }
        C0358.f6669.f2048.f1543.add(new C1106(i, C0358.f6669.f2048.f1551, System.currentTimeMillis(), neVar));
    }
}
