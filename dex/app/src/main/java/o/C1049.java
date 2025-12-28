package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.eh;

/* renamed from: o.랡, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1049 extends ub {
    C1049() {
    }

    /* renamed from: o.랡$鷭, reason: contains not printable characters */
    class C1050 {

        /* renamed from: Ą, reason: contains not printable characters */
        byte f8820;

        /* renamed from: ą, reason: contains not printable characters */
        C0132 f8821;

        /* renamed from: Ć, reason: contains not printable characters */
        int f8822;

        /* renamed from: ć, reason: contains not printable characters */
        byte f8823;

        /* renamed from: ȃ, reason: contains not printable characters */
        byte f8825;

        /* renamed from: Ȋ, reason: contains not printable characters */
        C0637 f8826;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        byte f8827;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        short f8828;

        /* renamed from: 岱, reason: contains not printable characters */
        short f8829;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8830;

        /* renamed from: 鷭, reason: contains not printable characters */
        short f8831;

        C1050(ByteBuffer byteBuffer) {
            this.f8831 = byteBuffer.getShort();
            this.f8830 = C0358.f6667.f4830 ? byteBuffer.getInt() : pa.m968(byteBuffer.getShort());
            this.f8827 = byteBuffer.get();
            this.f8825 = byteBuffer.get();
            this.f8820 = byteBuffer.get();
            this.f8821 = new C0132(byteBuffer);
            this.f8822 = byteBuffer.getInt();
            this.f8823 = byteBuffer.get();
            this.f8828 = byteBuffer.getShort();
            this.f8829 = byteBuffer.getShort();
            this.f8826 = new C0637(byteBuffer);
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        C0803 c0803;
        this.f5008 = (short) 2539;
        mu muVar = mu.valuesCustom()[byteBuffer.get()];
        long j = byteBuffer.getLong();
        int i3 = byteBuffer.getShort();
        long j2 = byteBuffer.getLong();
        int i4 = byteBuffer.get();
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        if (z) {
            return;
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).position(0);
        ow owVar = ow.LOCAL;
        byte[] bArr2 = new byte[i3];
        byteBuffer2.get(bArr2);
        String strM978 = pa.m978(bArr2, owVar);
        C1050[] c1050Arr = new C1050[i4];
        C1008[] c1008Arr = new C1008[i4];
        for (int i5 = 0; i5 < c1008Arr.length; i5++) {
            c1050Arr[i5] = new C1050(byteBuffer2);
            C1050 c1050 = c1050Arr[i5];
            c1008Arr[i5] = new C1008(c1050.f8830, c1050.f8831, c1050.f8820, EnumC0680.valuesCustom()[c1050.f8823], c1050.f8825 != 0, c1050.f8827 != 0, false, c1050.f8822, 0, c1050.f8828, c1050.f8821, 0, c1050.f8829, c1050.f8826);
        }
        dx dxVar = C0358.f6674.f42.f1798;
        eh.C0034[] c0034Arr = (eh.C0034[]) ((eh.Cif) ((eh.C0033) ((ao) C0358.f6674.f42.f1816.f1174.getAdapter()).f682.get(muVar.ordinal())).f1178.getAdapter()).f8521;
        int length = c0034Arr.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                c0803 = null;
                break;
            }
            eh.C0034 c0034 = c0034Arr[i6];
            if (c0034.f1186.f7867 == j) {
                c0803 = c0034.f1186;
                break;
            }
            i6++;
        }
        if (c0803 != null) {
            dxVar.f1136 = c0803;
            dxVar.f1137 = strM978;
            dxVar.f1134 = j2;
            dxVar.f1132 = c1008Arr;
            dxVar.f1139.setText(c0803.f7861);
            dxVar.f1138.setText(c0803.f7864);
            dxVar.f1135.setText(strM978);
            dxVar.m571(c1008Arr);
            dxVar.m570(j2);
            dxVar.h_();
        }
    }
}
