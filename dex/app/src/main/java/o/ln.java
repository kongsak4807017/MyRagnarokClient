package o;

import android.util.SparseArray;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ln {

    /* renamed from: 櫯, reason: contains not printable characters */
    public C1035 f2004;

    /* renamed from: 鷭, reason: contains not printable characters */
    public SparseArray<lm> f2005 = new SparseArray<>();

    ln() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final bh m779(String str) {
        int size = this.f2005.size();
        for (int i = 0; i < size; i++) {
            lm lmVarValueAt = this.f2005.valueAt(i);
            bh bhVar = (bh) (bh.class.isAssignableFrom(lmVarValueAt.getClass()) ? lmVarValueAt : null);
            if (bhVar != null && bhVar.f8368 != null && bhVar.f8368.equals(str)) {
                return bhVar;
            }
        }
        return null;
    }
}
