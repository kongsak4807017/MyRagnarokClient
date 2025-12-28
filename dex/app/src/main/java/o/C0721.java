package o;

import java.nio.ByteBuffer;
import o.C0685.C0686;

/* renamed from: o.扩, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0721 extends ub {
    C0721() {
    }

    /* renamed from: o.扩$鷭, reason: contains not printable characters */
    class C0722 {

        /* renamed from: 櫯, reason: contains not printable characters */
        String f7686;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f7687;

        C0722(ByteBuffer byteBuffer) {
            this.f7687 = byteBuffer.getInt();
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[24];
            byteBuffer.get(bArr);
            this.f7686 = pa.m978(bArr, owVar);
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 219;
        int i3 = byteBuffer.getInt();
        C0722[] c0722Arr = new C0722[i];
        for (int i4 = 0; i4 < i; i4++) {
            c0722Arr[i4] = new C0722(byteBuffer);
        }
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8616 == null) {
            C0358.f6664.f2004.f8616 = new C0685();
        }
        C0685 c0685 = C0358.f6664.f2004.f8616;
        c0685.f7623 = i3;
        c0685.f7620.clear();
        for (int i5 = 0; i5 < i; i5++) {
            c0685.f7620.add(c0685.new C0686(c0722Arr[i5].f7686, c0722Arr[i5].f7687 != 0));
        }
        C0358.f6674.f42.f1755.h_();
    }
}
