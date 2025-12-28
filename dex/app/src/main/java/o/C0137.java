package o;

import java.nio.ByteBuffer;

/* renamed from: o.Ę, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0137 extends ub {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0138 f6500 = new C0138();

    /* renamed from: o.Ę$鷭, reason: contains not printable characters */
    class C0138 {

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6504;

        /* renamed from: 櫯, reason: contains not printable characters */
        byte[] f6503 = new byte[16];

        /* renamed from: ˮ͈, reason: contains not printable characters */
        byte[] f6502 = new byte[32];

        C0138() {
        }
    }

    C0137() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws Throwable {
        this.f5008 = (short) -28637;
        this.f6500.f6504 = byteBuffer.getInt();
        byteBuffer.get(this.f6500.f6503);
        byteBuffer.get(this.f6500.f6502);
        if (z) {
            return;
        }
        C0358.f6671.f753.f3364 = this.f6500.f6504;
        C0358.f6671.f753.f3363 = this.f6500.f6503;
        C0358.f6671.f753.f3360 = this.f6500.f6502;
        C0644 c0644 = C0358.f6671.f753;
        c0644.f3365 = true;
        if (c0644.f3365) {
            c0644.f3361 = ByteBuffer.allocate(16);
        } else {
            c0644.f3361 = null;
        }
        C0644 c06442 = C0358.f6671.f753;
        if (c06442.f3363 != null) {
            if (c06442.f3362 == null) {
                c06442.f3362 = new byte[c06442.f3363.length + 16];
            }
            for (int i3 = 0; i3 < c06442.f3363.length; i3++) {
                c06442.f3362[i3] = c06442.f3363[i3];
            }
            for (int length = c06442.f3363.length; length < c06442.f3362.length; length++) {
                c06442.f3362[length] = (byte) ((Math.random() - 0.5d) * 255.0d);
            }
        }
        C0358.f6687.m658("v1", 0, String.valueOf(c06442.f3364));
        C0358.f6687.m658("v2", 0, pa.m959(c06442.f3362));
        C0358.f6687.m658("v3", 0, pa.m959(c06442.f3360));
        try {
            C0358.f6671.mo454((vg) $coN.m1263("o.Ƞ").getDeclaredConstructor(String.class, String.class, Integer.TYPE).newInstance(null, null, Integer.valueOf((int) C0358.m1290())));
        } catch (Throwable th) {
            throw th.getCause();
        }
    }
}
