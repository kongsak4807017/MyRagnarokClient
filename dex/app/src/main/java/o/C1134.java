package o;

import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;

/* renamed from: o.퀭, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1134 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    static final int[] f8968 = {4, 5, 6, 242, 265, 306, 439, NNTPReply.POSTING_NOT_ALLOWED, NNTPReply.POSTING_FAILED, FTPReply.NOT_LOGGED_IN, 531, 576, 577, 578, 579, 1818, 607, 608, 679};

    C1134() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 129;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        cv cvVar = C0358.f6685;
        int i3 = f8968[(b < 0 || b >= f8968.length) ? (byte) 0 : b];
        String strM649 = C0358.f6687.m649(i3);
        C0358.f6683 = String.valueOf(strM649 == null ? "MSG" + i3 : strM649) + "(" + ((int) b) + ")";
        b bVar = C0358.f6671;
        if (bVar.f757 != null) {
            bVar.f757.f774 = true;
        }
    }
}
