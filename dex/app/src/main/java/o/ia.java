package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ia extends tz {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ hw f1572;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ia(hw hwVar, boolean z) {
        super(true);
        this.f1572 = hwVar;
    }

    @Override // o.tz
    /* renamed from: 鷭 */
    public final void mo520(long j, long j2, int i) {
        je jeVar = C0358.f6674.f42;
        int i2 = ((int) ((80 * j) / j2)) + 20;
        if (jeVar.f1734 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jp(jeVar, "Updating file list", null, i2, -1));
    }
}
