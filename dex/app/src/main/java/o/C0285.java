package o;

import android.app.AlertDialog;
import java.nio.ByteBuffer;

/* renamed from: o.ʠ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0285 extends ub {
    C0285() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 362;
        int i3 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        StringBuilder sbAppend = new StringBuilder("(").append(strM978).append(") ");
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(378);
        builder.setMessage(sbAppend.append(strM649 == null ? "MSG378" : strM649).toString());
        builder.setPositiveButton("Yes", new DialogInterfaceOnClickListenerC0750(this, i3));
        builder.setNegativeButton("No", new DialogInterfaceOnClickListenerC0937(this, i3));
        builder.setOnCancelListener(new DialogInterfaceOnCancelListenerC0286(this, i3));
        builder.show();
    }
}
