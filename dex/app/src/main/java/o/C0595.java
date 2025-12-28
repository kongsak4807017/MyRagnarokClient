package o;

import android.widget.TextView;
import android.widget.Toast;
import java.nio.ByteBuffer;
import org.apache.commons.net.ftp.FTPReply;

/* renamed from: o.䔾, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0595 extends ub {
    C0595() {
    }

    /* renamed from: o.䔾$鷭, reason: contains not printable characters */
    class C0596 {

        /* renamed from: Ą, reason: contains not printable characters */
        int f7387;

        /* renamed from: ą, reason: contains not printable characters */
        byte f7388;

        /* renamed from: Ć, reason: contains not printable characters */
        byte f7389;

        /* renamed from: ć, reason: contains not printable characters */
        byte f7390;

        /* renamed from: ȃ, reason: contains not printable characters */
        byte f7391;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        short f7393;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        C0132 f7394;

        /* renamed from: 岱, reason: contains not printable characters */
        C0637 f7395;

        /* renamed from: 櫯, reason: contains not printable characters */
        short f7396;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f7397;

        C0596(ByteBuffer byteBuffer) {
            this.f7397 = byteBuffer.getInt();
            this.f7396 = byteBuffer.getShort();
            this.f7393 = byteBuffer.getShort();
            this.f7391 = byteBuffer.get();
            this.f7387 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            this.f7388 = byteBuffer.get();
            this.f7389 = byteBuffer.get();
            this.f7390 = byteBuffer.get();
            this.f7394 = new C0132(byteBuffer);
            if (C0358.f6667.f4785) {
                this.f7395 = new C0637(byteBuffer);
            }
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 310;
        byteBuffer.getInt();
        C0596[] c0596Arr = new C0596[i];
        for (int i3 = 0; i3 < c0596Arr.length; i3++) {
            c0596Arr[i3] = new C0596(byteBuffer);
        }
        if (z) {
            return;
        }
        C1008[] c1008Arr = new C1008[c0596Arr.length];
        int[] iArr = new int[c0596Arr.length];
        int[] iArr2 = new int[c0596Arr.length];
        for (int i4 = 0; i4 < c1008Arr.length; i4++) {
            C0596 c0596 = c0596Arr[i4];
            c1008Arr[i4] = new C1008(c0596.f7387, c0596.f7393, c0596.f7390, EnumC0680.valuesCustom()[c0596.f7391], c0596.f7389 != 0, c0596.f7388 != 0, false, 0, 0, 0, c0596.f7394, 0, 0, c0596.f7395);
            iArr[i4] = c0596Arr[i4].f7397;
            iArr2[i4] = c0596Arr[i4].f7396 - 2;
        }
        ls lsVar = C0358.f6674.f42.f1750;
        lsVar.f2022 = true;
        lsVar.f2021.setVisibility(4);
        lsVar.f2027.setVisibility(4);
        TextView textView = lsVar.f2028;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(FTPReply.ENTERING_PASSIVE_MODE);
        textView.setText(String.valueOf(strM649 == null ? "MSG227" : strM649) + " : " + ((Object) lsVar.f2027.getText()));
        lsVar.m796();
        lsVar.m797(c1008Arr.length);
        for (int i5 = 0; i5 < c1008Arr.length; i5++) {
            lsVar.m801(new lg(c1008Arr[i5], iArr2[i5]), c1008Arr[i5].f8500, iArr[i5]);
        }
        Toast.makeText(C0358.f6674, "You have successfully opened a vending shop! ^^", 1).show();
    }
}
