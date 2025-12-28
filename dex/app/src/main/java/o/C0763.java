package o;

import java.nio.ByteBuffer;

/* renamed from: o.檥, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0763 extends ub {
    C0763() {
    }

    /* renamed from: o.檥$鷭, reason: contains not printable characters */
    class C0764 {

        /* renamed from: ȃ, reason: contains not printable characters */
        int f7768;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f7769;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f7770;

        /* renamed from: 鷭, reason: contains not printable characters */
        byte f7771;

        C0764(ByteBuffer byteBuffer) {
            this.f7771 = byteBuffer.get();
            this.f7770 = byteBuffer.getInt();
            this.f7769 = byteBuffer.getInt();
            this.f7768 = byteBuffer.getInt();
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2427;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        C0764[] c0764Arr = new C0764[i];
        for (int i6 = 0; i6 < i; i6++) {
            c0764Arr[i6] = new C0764(byteBuffer);
        }
        if (z || i < 2) {
            return;
        }
        C0698 c0698 = C0358.f6674.f42.f1792;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(2810);
        c0698.m1432(String.format(strM649 == null ? "MSG2810" : strM649, Float.valueOf(i3 / 1000.0f), Float.valueOf(c0764Arr[0].f7770 / 1000.0f), "Server", Float.valueOf(c0764Arr[1].f7770 / 1000.0f)), 16776960);
        C0698 c06982 = C0358.f6674.f42.f1792;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(2811);
        c06982.m1432(String.format(strM6492 == null ? "MSG2811" : strM6492, Float.valueOf(i5 / 1000.0f), Float.valueOf(c0764Arr[0].f7768 / 1000.0f), "Server", Float.valueOf(c0764Arr[1].f7768 / 1000.0f)), 16776960);
        C0698 c06983 = C0358.f6674.f42.f1792;
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(2812);
        c06983.m1432(String.format(strM6493 == null ? "MSG2812" : strM6493, Float.valueOf(i4 / 1000.0f), Float.valueOf(c0764Arr[0].f7769 / 1000.0f), "Server", Float.valueOf(c0764Arr[1].f7769 / 1000.0f)), 16776960);
    }
}
