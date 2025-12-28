package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bq implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f850;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ bp f851;

    bq(bp bpVar, boolean[] zArr) {
        this.f851 = bpVar;
        this.f850 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f850[0] = true;
    }
}
