package o;

/* renamed from: o.㼹, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0551 implements oe {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C1008[] f7270;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0554 f7271;

    C0551(C0554 c0554, C1008[] c1008Arr) {
        this.f7271 = c0554;
        this.f7270 = c1008Arr;
    }

    @Override // o.oe
    /* renamed from: 鷭 */
    public final void mo577(lg lgVar) {
        short s = 0;
        int i = 0;
        while (true) {
            if (i >= this.f7270.length) {
                break;
            }
            if (!lgVar.f1964.m1592(C0358.f6685.f1030.f967).equals(this.f7270[i].m1592(C0358.f6685.f1030.f967))) {
                i++;
            } else {
                s = this.f7271.f7274[i].f7279;
                break;
            }
        }
        C0358.f6671.mo454(new C0440(s));
    }

    @Override // o.oe
    /* renamed from: 鷭 */
    public final void mo576() {
        C0358.f6671.mo454(new C0440(0));
    }
}
