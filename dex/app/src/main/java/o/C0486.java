package o;

import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import o.ge;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.ở, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0486 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0487[] f6947;

    C0486() {
    }

    /* renamed from: o.ở$鷭, reason: contains not printable characters */
    class C0487 {

        /* renamed from: ȃ, reason: contains not printable characters */
        int f6949;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        byte f6950;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6951;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6952;

        C0487(ByteBuffer byteBuffer) {
            this.f6952 = byteBuffer.getInt();
            this.f6951 = byteBuffer.getInt();
            this.f6950 = byteBuffer.get();
            this.f6949 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 198;
        this.f6947 = new C0487[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f6947[i3] = new C0487(byteBuffer);
        }
        if (z) {
            return;
        }
        ge geVar = C0358.f6674.f42.f1742;
        c_activity c_activityVar = (c_activity) geVar.f1994.getContext();
        gb[] gbVarArr = new gb[this.f6947.length];
        geVar.f1340 = ge.EnumC0041.NPCSHOP_BUYFROMNPC;
        for (int i4 = 0; i4 < this.f6947.length; i4++) {
            C0487 c0487 = this.f6947[i4];
            gbVarArr[i4] = new gb(c_activityVar, new C1008(c0487.f6949, -1, true, EnumC0680.valuesCustom()[c0487.f6950]), 0, c0487.f6952, c0487.f6951, geVar.f1340);
        }
        TextView textView = geVar.f1324;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(187);
        textView.setText(strM649 == null ? "MSG187" : strM649);
        TextView textView2 = geVar.f1325;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(FTPReply.ENTERING_EPSV_MODE);
        textView2.setText(strM6492 == null ? "MSG229" : strM6492);
        geVar.m602(c_activityVar, gbVarArr);
        C0358.f6674.f42.f1742.h_();
    }
}
