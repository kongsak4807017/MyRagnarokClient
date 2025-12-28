package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.nio.ByteBuffer;

/* renamed from: o.ꂈ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0968 extends ub {
    C0968() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 595;
        byteBuffer.get();
        if (z) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1029);
        builder.setMessage(strM649 == null ? "MSG1029" : strM649);
        builder.setPositiveButton("OK", new DialogInterfaceOnClickListenerC0717(this));
        builder.setNegativeButton("Cancel", (DialogInterface.OnClickListener) null);
        builder.show();
    }
}
