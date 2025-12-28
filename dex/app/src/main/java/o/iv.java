package o;

import java.util.Comparator;
import o.iu;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class iv implements Comparator<iu.Cif> {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ iu f1699;

    iv(iu iuVar) {
        this.f1699 = iuVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(iu.Cif cif, iu.Cif cif2) {
        iu.Cif cif3 = cif;
        iu.Cif cif4 = cif2;
        int i = cif3.f1689 + (cif3.f1688 * this.f1699.f1672);
        int i2 = cif4.f1689 + (cif4.f1688 * this.f1699.f1672);
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }
}
