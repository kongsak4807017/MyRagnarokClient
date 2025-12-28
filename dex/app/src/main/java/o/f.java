package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class f implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ pk[] f1237;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ b f1238;

    f(b bVar, pk[] pkVarArr) {
        this.f1238 = bVar;
        this.f1237 = pkVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1237 != null) {
            for (pk pkVar : this.f1237) {
                this.f1238.mo454(pkVar);
            }
        }
    }
}
