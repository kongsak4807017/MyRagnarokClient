package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dh extends po {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cv f1068;

    dh(cv cvVar) {
        this.f1068 = cvVar;
    }

    @Override // o.po
    /* renamed from: 鷭 */
    public final void mo548(long j, long j2) {
        if (j2 < 1) {
            je jeVar = C0358.f6674.f42;
            String str = "Downloading new file list\n[" + pa.m973(j) + "] bytes";
            if (jeVar.f1735 != null) {
                C0358.f6674.mo139(new jt(jeVar));
            }
            C0358.f6674.mo139(new jr(jeVar, str));
            return;
        }
        je jeVar2 = C0358.f6674.f42;
        int i = (int) ((100 * j) / (j2 == 0 ? -1L : j2));
        if (jeVar2.f1734 != null) {
            C0358.f6674.mo139(new jt(jeVar2));
        }
        C0358.f6674.mo139(new jp(jeVar2, "Downloading new file list", null, i, -1));
    }
}
