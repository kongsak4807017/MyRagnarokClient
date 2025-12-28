package o;

import android.app.AlertDialog;
import java.nio.ByteBuffer;

/* renamed from: o.鬙, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0934 extends ub {
    C0934() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 519;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(819);
        new AlertDialog.Builder(C0358.f6674).setTitle((CharSequence) null).setMessage(String.format(strM649 == null ? "MSG819" : strM649, strM978)).setPositiveButton("Yes", new DialogInterfaceOnClickListenerC0269(this, i3, i4)).setNegativeButton("No", new DialogInterfaceOnClickListenerC0270(this, i3, i4)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0585(this, i3, i4)).show();
    }
}
