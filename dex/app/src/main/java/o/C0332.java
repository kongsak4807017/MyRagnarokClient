package o;

import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.util.Arrays;
import o.ge;

/* renamed from: o.ˮ̣, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0332 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0333[] f6637;

    C0332() {
    }

    /* renamed from: o.ˮ̣$鷭, reason: contains not printable characters */
    class C0333 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f6639;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6640;

        /* renamed from: 鷭, reason: contains not printable characters */
        short f6641;

        C0333(ByteBuffer byteBuffer) {
            this.f6641 = byteBuffer.getShort();
            this.f6640 = byteBuffer.getInt();
            this.f6639 = byteBuffer.getInt();
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 199;
        this.f6637 = new C0333[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f6637[i3] = new C0333(byteBuffer);
        }
        if (z) {
            return;
        }
        ge geVar = C0358.f6674.f42.f1742;
        c_activity c_activityVar = (c_activity) geVar.f1994.getContext();
        gb[] gbVarArr = new gb[this.f6637.length];
        int i4 = 0;
        geVar.f1340 = ge.EnumC0041.NPCSHOP_SELLTONPC;
        for (int i5 = 0; i5 < this.f6637.length; i5++) {
            C0333 c0333 = this.f6637[i5];
            int i6 = c0333.f6641 - 2;
            C1008 c1008 = C0358.f6664.f2004.f8622.get(Integer.valueOf(i6));
            if (c1008 != null && c1008.f8490 == 0 && c1008.f8500 > 0) {
                int i7 = i4;
                i4++;
                gbVarArr[i7] = new gb(c_activityVar, c1008, i6, c0333.f6640, c0333.f6639, geVar.f1340);
            }
        }
        TextView textView = geVar.f1324;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(186);
        textView.setText(strM649 == null ? "MSG186" : strM649);
        TextView textView2 = geVar.f1325;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(169);
        textView2.setText(strM6492 == null ? "MSG169" : strM6492);
        geVar.m602(c_activityVar, (gb[]) Arrays.copyOf(gbVarArr, i4));
        C0358.f6674.f42.f1742.h_();
    }
}
