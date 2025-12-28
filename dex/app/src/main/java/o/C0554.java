package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.䁜, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0554 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0555[] f7274;

    C0554() {
    }

    /* renamed from: o.䁜$鷭, reason: contains not printable characters */
    class C0555 {

        /* renamed from: ȃ, reason: contains not printable characters */
        C0132 f7276;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        byte f7277;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f7278;

        /* renamed from: 鷭, reason: contains not printable characters */
        short f7279;

        C0555(ByteBuffer byteBuffer) {
            this.f7279 = byteBuffer.getShort();
            this.f7278 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            this.f7277 = byteBuffer.get();
            this.f7276 = new C0132(byteBuffer);
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 545;
        this.f7274 = new C0555[i];
        for (int i3 = 0; i3 < this.f7274.length; i3++) {
            this.f7274[i3] = new C0555(byteBuffer);
        }
        if (z) {
            return;
        }
        if (i == 0) {
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(FTPReply.CANNOT_OPEN_DATA_CONNECTION);
            c0698.m1432(strM649 == null ? "MSG425" : strM649, 16711680);
            return;
        }
        C1008[] c1008Arr = new C1008[this.f7274.length];
        for (int i4 = 0; i4 < this.f7274.length; i4++) {
            c1008Arr[i4] = C0358.f6664.f2004.f8622.get(Integer.valueOf(this.f7274[i4].f7279 - 2));
        }
        C0876 c0876 = C0358.f6674.f42.f1753;
        c0876.f8045 = new C0551(this, c1008Arr);
        c0876.f8046.setAdapter((ListAdapter) new C0471((int[]) null, c1008Arr));
        c0876.h_();
    }
}
