package o;

import android.app.AlertDialog;
import java.nio.ByteBuffer;

/* renamed from: o.醯, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0883 extends ub {
    C0883() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        String str;
        this.f5008 = (short) 108;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (b == 0) {
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(10);
            str = strM649 == null ? "MSG10" : strM649;
        } else if (b == 1) {
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(209);
            str = strM6492 == null ? "MSG209" : strM6492;
        } else {
            str = "Disconnected from char-server (unknown reason)";
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setMessage(str);
        builder.setCancelable(true);
        builder.show();
        b bVar = C0358.f6671;
        if (bVar.f757 != null) {
            bVar.f757.f774 = true;
        }
    }
}
