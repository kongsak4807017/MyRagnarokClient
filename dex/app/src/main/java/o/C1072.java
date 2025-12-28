package o;

import android.app.AlertDialog;
import java.nio.ByteBuffer;

/* renamed from: o.볯, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1072 extends ub {
    C1072() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        String str;
        this.f5008 = (short) 110;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        switch (b) {
            case 0:
                cv cvVar = C0358.f6685;
                String strM649 = C0358.f6687.m649(11);
                str = strM649 == null ? "MSG11" : strM649;
                break;
            case 1:
                cv cvVar2 = C0358.f6685;
                String strM6492 = C0358.f6687.m649(299);
                str = strM6492 == null ? "MSG299" : strM6492;
                break;
            case 2:
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(1273);
                str = strM6493 == null ? "MSG1273" : strM6493;
                break;
            case 3:
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(1356);
                str = strM6494 == null ? "MSG1356" : strM6494;
                break;
            default:
                cv cvVar5 = C0358.f6685;
                String strM6495 = C0358.f6687.m649(12);
                str = strM6495 == null ? "MSG12" : strM6495;
                break;
        }
        C0358.f6674.mo139(new jt(C0358.f6674.f42));
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setMessage(String.valueOf(str) + " (error#" + ((int) b) + ")");
        builder.show();
    }
}
