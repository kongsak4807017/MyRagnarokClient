package o;

import android.app.AlertDialog;
import java.nio.ByteBuffer;

/* renamed from: o.鬥, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0936 extends ub {
    C0936() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 369;
        int i3 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        StringBuilder sbAppend = new StringBuilder("(").append(strM978).append(")");
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(394);
        builder.setMessage(sbAppend.append(strM649 == null ? "MSG394" : strM649).toString());
        builder.setPositiveButton("Yes", new DialogInterfaceOnClickListenerC0279(this, i3));
        builder.setNegativeButton("No", new DialogInterfaceOnClickListenerC0280(this, i3));
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC0586(this, i3));
    }
}
