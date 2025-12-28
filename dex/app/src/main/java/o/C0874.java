package o;

import java.nio.ByteBuffer;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.郗, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0874 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    static int[] f8042 = {66, 16, 69, -1, 56, 433, 434, NNTPReply.ARTICLE_NOT_WANTED};

    C0874() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 218;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (b >= 0 || b < f8042.length || f8042[b] != -1) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            int i3 = f8042[b];
            String strM649 = C0358.f6687.m649(i3);
            c0698.m1432(strM649 == null ? "MSG" + i3 : strM649, 16711680);
        }
        C0358.f6674.f42.f1755.mo439();
        C0358.f6664.f2004.f8616 = null;
    }
}
