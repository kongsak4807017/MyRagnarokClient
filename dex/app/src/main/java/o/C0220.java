package o;

import android.support.v4.view.InputDeviceCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.Ǳ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0220 extends ub {
    C0220() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        String strM1328;
        this.f5008 = (short) 2045;
        String strM978 = "???";
        int i3 = 512;
        byte b = byteBuffer.get();
        int i4 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
        int i5 = byteBuffer.get();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).position(0);
        ow owVar = ow.LOCAL;
        byte[] bArr2 = new byte[i5];
        byteBuffer2.get(bArr2);
        String strM9782 = pa.m978(bArr2, owVar);
        int i6 = byteBuffer2.get();
        if (b == 0) {
            i3 = C0358.f6667.f4830 ? byteBuffer2.getInt() : pa.m968(byteBuffer2.getShort());
        } else {
            ow owVar2 = ow.LOCAL;
            byte[] bArr3 = new byte[i6];
            byteBuffer2.get(bArr3);
            strM978 = pa.m978(bArr3, owVar2);
        }
        je jeVar = C0358.f6674.f42;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1629);
        String str = strM649 == null ? "MSG1629" : strM649;
        Object[] objArr = new Object[3];
        objArr[0] = strM9782;
        if (b == 0) {
            C0432 c0432M1648 = C0358.f6685.f1030.f967.m1648(i3);
            strM1328 = c0432M1648 == null ? null : c0432M1648.m1328(true);
        } else {
            strM1328 = strM978;
        }
        objArr[1] = strM1328;
        C0432 c0432M16482 = C0358.f6685.f1030.f967.m1648(i4);
        objArr[2] = c0432M16482 == null ? null : c0432M16482.m1328(true);
        jeVar.m732(String.format(str, objArr), InputDeviceCompat.SOURCE_ANY);
    }
}
