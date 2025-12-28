package o;

import android.app.AlertDialog;
import java.nio.ByteBuffer;
import org.apache.http.HttpHeaders;

/* renamed from: o.먟, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1063 extends ub {
    C1063() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 500;
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        byteBuffer.getInt();
        short s = byteBuffer.getShort();
        if (z) {
            return;
        }
        C0358.f6668.f6714 = strM978;
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        StringBuilder sbAppend = new StringBuilder("(").append(strM978).append(") Lv ").append((int) s).append(" ");
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(94);
        builder.setMessage(sbAppend.append(strM649 == null ? "MSG94" : strM649).toString());
        builder.setPositiveButton(HttpHeaders.ACCEPT, new DialogInterfaceOnClickListenerC1125(this));
        builder.setNegativeButton("Decline", new DialogInterfaceOnClickListenerC0513(this));
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC0846(this));
        builder.show();
    }
}
