package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cs extends tz {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ int f990;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ int f991;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f992;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ je f993;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cr f994;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cs(cr crVar, boolean z, je jeVar, String str, int i, int i2) {
        super(true);
        this.f994 = crVar;
        this.f993 = jeVar;
        this.f992 = str;
        this.f991 = i;
        this.f990 = i2;
    }

    @Override // o.tz
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo520(long j, long j2, int i) {
        je jeVar = this.f993;
        String str = "Caching GRF files [" + this.f992 + "," + (this.f991 + 1) + "/" + this.f990 + "]";
        int i2 = i / 2;
        if (jeVar.f1734 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jp(jeVar, str, null, i2, -1));
    }
}
