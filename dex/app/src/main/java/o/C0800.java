package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* renamed from: o.瓺, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0800 extends ub {
    C0800() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2754;
        byteBuffer.get();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).position(0);
        ArrayList<C0803> arrayList = new ArrayList<>();
        while (byteBuffer2.position() < i) {
            C0803 c0803 = new C0803();
            c0803.f7868 = mu.valuesCustom()[byteBuffer2.get()];
            c0803.f7867 = byteBuffer2.getLong();
            c0803.f7866 = byteBuffer2.get() != 0;
            c0803.f7865 = byteBuffer2.get();
            ow owVar = ow.LOCAL;
            byte[] bArr2 = new byte[24];
            byteBuffer2.get(bArr2);
            c0803.f7861 = pa.m978(bArr2, owVar);
            c0803.f7863 = byteBuffer2.getInt();
            int i3 = byteBuffer2.getShort();
            ow owVar2 = ow.LOCAL;
            byte[] bArr3 = new byte[i3];
            byteBuffer2.get(bArr3);
            c0803.f7864 = pa.m978(bArr3, owVar2);
            arrayList.add(c0803);
        }
        C0358.f6674.f42.f1816.m578(arrayList);
    }
}
