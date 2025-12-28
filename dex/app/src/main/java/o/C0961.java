package o;

import java.nio.ByteBuffer;
import java.util.Map;
import o.ck;
import o.ck.C0027;

/* renamed from: o.鼴, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0961 extends ub {
    C0961() {
    }

    /* renamed from: o.鼴$鷭, reason: contains not printable characters */
    class C0962 {

        /* renamed from: ȃ, reason: contains not printable characters */
        short f8276;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        short f8277;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f8278;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f8279;

        C0962(ByteBuffer byteBuffer) {
            this.f8279 = byteBuffer.getInt();
            this.f8278 = byteBuffer.getInt();
            this.f8277 = byteBuffer.getShort();
            this.f8276 = byteBuffer.getShort();
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2302;
        C0962[] c0962Arr = new C0962[i];
        for (int i3 = 0; i3 < i; i3++) {
            c0962Arr[i3] = new C0962(byteBuffer);
        }
        if (z) {
            return;
        }
        boolean z2 = false;
        for (Map.Entry<Integer, ck> entry : C0358.f6679.f6832.entrySet()) {
            entry.getKey();
            for (ck.C0027 c0027 : entry.getValue().f920) {
                for (C0962 c0962 : c0962Arr) {
                    if (c0962.f8279 == c0027.f933) {
                        c0027.f932 = c0962.f8278;
                        c0027.f931 = c0962.f8276;
                        c0027.f930 = c0962.f8277;
                        z2 = true;
                    }
                }
            }
        }
        if (!z2 && c0962Arr.length > 0) {
            ck ckVar = C0358.f6679.f6832.get(Integer.valueOf(c0962Arr[0].f8279));
            if (ckVar == null) {
                return;
            }
            for (int i4 = 0; i4 < c0962Arr.length; i4++) {
                C0962 c09622 = c0962Arr[i4];
                if (ckVar.f920[i4] == null) {
                    ckVar.f920[i4] = ckVar.new C0027(0, c09622.f8278, c09622.f8276, c09622.f8277, null);
                } else {
                    ckVar.f920[i4].f932 = c09622.f8278;
                    ckVar.f920[i4].f931 = c09622.f8276;
                    ckVar.f920[i4].f930 = c09622.f8277;
                }
            }
        }
        C0358.f6674.f42.f1757.m484();
    }
}
