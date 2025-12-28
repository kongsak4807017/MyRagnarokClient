package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ct extends tz {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ int f995;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ int f996;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f997;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ je f998;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cr f999;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ct(cr crVar, boolean z, je jeVar, String str, int i, int i2) {
        super(true);
        this.f999 = crVar;
        this.f998 = jeVar;
        this.f997 = str;
        this.f996 = i;
        this.f995 = i2;
    }

    @Override // o.tz
    /* renamed from: 鷭 */
    public final void mo520(long j, long j2, int i) {
        je jeVar = this.f998;
        String str = "Caching GRF files [" + this.f997 + "," + (this.f996 + 1) + "/" + this.f995 + "]";
        int i2 = (i / 2) + 50;
        if (jeVar.f1734 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jp(jeVar, str, null, i2, -1));
    }
}
