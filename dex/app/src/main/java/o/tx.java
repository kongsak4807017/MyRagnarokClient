package o;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class tx {

    /* renamed from: ȃ, reason: contains not printable characters */
    public HashMap<Integer, vf> f4987;

    @Deprecated
    public tx(vf[] vfVarArr, boolean z) {
        this.f4987 = new HashMap<>();
        if (z) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32768);
            for (vf vfVar : vfVarArr) {
                if (ub.class.isAssignableFrom(vfVar.getClass())) {
                    byteBufferAllocate.position(0);
                    ((ub) vfVar).m1104(byteBufferAllocate);
                }
            }
        }
        for (vf vfVar2 : vfVarArr) {
            this.f4987.put(Integer.valueOf(pa.m968(vfVar2.mo1099())), vfVar2);
        }
    }

    public tx(vf[] vfVarArr) {
        this(vfVarArr, false);
    }

    /* renamed from: 鷭 */
    public void mo433(pk pkVar, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: 鷭 */
    public void mo432(pk pkVar) {
        throw new UnsupportedOperationException();
    }
}
