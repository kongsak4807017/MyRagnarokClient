package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class up implements ym {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f5336;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ uo f5337;

    up(uo uoVar, String str) {
        this.f5337 = uoVar;
        this.f5336 = str;
    }

    @Override // o.ym
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo1135(long j, long j2) {
        if (j2 == 0) {
            j2 = 1;
        }
        this.f5337.f5322.mo789(String.valueOf(this.f5336) + "\n" + ((100 * j) / j2) + "% [" + pa.m973(j) + "/" + pa.m973(j2) + "] Extracting...");
    }

    @Override // o.ym
    /* renamed from: 鷭, reason: contains not printable characters */
    public final boolean mo1136(yr yrVar) {
        new StringBuilder("isNextVolumeReady ").append(yrVar);
        pc.m995();
        return false;
    }
}
