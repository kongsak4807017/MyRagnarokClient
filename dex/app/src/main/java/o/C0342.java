package o;

import android.app.AlertDialog;
import java.nio.ByteBuffer;

/* renamed from: o.ˮ̰, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0342 extends ub {
    C0342() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 710;
        int i3 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        if (z) {
            return;
        }
        m1286(i3, strM978);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1286(int i, String str) {
        StringBuilder sbAppend = new StringBuilder("(").append(str).append(") ");
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(95);
        new AlertDialog.Builder(C0358.f6674).setTitle((CharSequence) null).setMessage(sbAppend.append(strM649 == null ? "MSG95" : strM649).toString()).setPositiveButton("Yes", new DialogInterfaceOnClickListenerC0597(i)).setNegativeButton("No", new DialogInterfaceOnClickListenerC0343(i)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0344(i)).show();
    }
}
