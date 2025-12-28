package o;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: o.悞, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0700 extends ub {
    C0700() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 216;
        int i3 = byteBuffer.getInt();
        if (z) {
            return;
        }
        Iterator<mj> it = C0358.f6669.f2048.f1545.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            mj next = it.next();
            md mdVar = (md) (md.class.isAssignableFrom(next.getClass()) ? next : null);
            if (mdVar != null) {
                if (((mdVar.f2097 == null || mdVar.f2097.f553 == null) ? -1 : mdVar.f2097.f553.f565) == i3) {
                    if (mdVar.f2097 != null) {
                        ae aeVar = mdVar.f2097;
                        if (aeVar.f550 != null) {
                            if (aeVar.f553 != null) {
                                aeVar.f553 = null;
                            }
                            aeVar.m387();
                        }
                    }
                }
            }
        }
        if (C0358.f6664.f2004.f8616 != null && C0358.f6664.f2004.f8616.f7623 == i3) {
            C0358.f6664.f2004.f8616 = null;
            C0358.f6674.f42.f1755.mo439();
        }
    }
}
