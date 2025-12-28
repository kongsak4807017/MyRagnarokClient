package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cz extends po {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f1053;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cv f1054;

    cz(cv cvVar, int i) {
        this.f1054 = cvVar;
        this.f1053 = i;
    }

    @Override // o.po
    /* renamed from: 鷭 */
    public final void mo548(long j, long j2) {
        je jeVar = C0358.f6674.f42;
        String str = "Downloading background music [" + (this.f1053 + 1) + "/172]";
        int i = (this.f1053 * 100) / 172;
        String str2 = String.valueOf(pa.m973(j)) + "/" + pa.m973(j2);
        int i2 = (int) ((100 * j) / j2);
        if (jeVar.f1734 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jp(jeVar, str, str2, i, i2));
    }
}
