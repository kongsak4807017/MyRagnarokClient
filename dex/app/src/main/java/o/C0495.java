package o;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import o.eh;

/* renamed from: o.〤, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0495 extends ub {
    C0495() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2550;
        mu muVar = mu.valuesCustom()[byteBuffer.get()];
        long j = byteBuffer.getLong();
        if (z) {
            return;
        }
        C0803 c0803 = C0358.f6674.f42.f1798.f1136;
        if (c0803.f7867 == j && c0803.f7868 == muVar) {
            C0358.f6674.f42.f1798.mo439();
            eh ehVar = C0358.f6674.f42.f1816;
            eh.Cif cif = (eh.Cif) ((eh.C0033) ((ao) ehVar.f1174.getAdapter()).f682.get(muVar.ordinal())).f1178.getAdapter();
            ArrayList<C0803> arrayList = new ArrayList<>();
            for (int i3 = 0; i3 < ((eh.C0034[]) cif.f8521).length; i3++) {
                if (((eh.C0034[]) cif.f8521)[i3].f1186.f7867 != j) {
                    arrayList.add(((eh.C0034[]) cif.f8521)[i3].f1186);
                }
            }
            if (arrayList.size() != ((eh.C0034[]) cif.f8521).length) {
                ehVar.m578(arrayList);
            }
        }
    }
}
