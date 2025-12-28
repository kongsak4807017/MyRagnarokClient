package o;

import o.ph;

/* renamed from: o.ᥲ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0481 implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ nq f6932;

    /* renamed from: ą, reason: contains not printable characters */
    private final /* synthetic */ int f6933;

    /* renamed from: Ć, reason: contains not printable characters */
    private final /* synthetic */ int f6934;

    /* renamed from: ć, reason: contains not printable characters */
    private final /* synthetic */ ph.C0072 f6935;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ md f6936;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private final /* synthetic */ md f6937;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ short f6938;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private final /* synthetic */ boolean f6939;

    /* renamed from: 岱, reason: contains not printable characters */
    private final /* synthetic */ AbstractC0988 f6940;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ int f6941;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1105 f6942;

    RunnableC0481(C1105 c1105, int i, short s, md mdVar, nq nqVar, int i2, int i3, ph.C0072 c0072, boolean z, AbstractC0988 abstractC0988, md mdVar2) {
        this.f6942 = c1105;
        this.f6941 = i;
        this.f6938 = s;
        this.f6936 = mdVar;
        this.f6932 = nqVar;
        this.f6933 = i2;
        this.f6934 = i3;
        this.f6935 = c0072;
        this.f6939 = z;
        this.f6940 = abstractC0988;
        this.f6937 = mdVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0358.f6669.f2048.f1543.add(new C1106(this.f6941 / this.f6938, this.f6936, System.currentTimeMillis(), this.f6932 == nq.ATTACK_CRITICAL ? ne.CRITICAL : ne.FIXED_DIR));
        md mdVar = this.f6936;
        mv mvVar = mv.TAKEDAMAGE;
        mdVar.m1423(((C0564) mdVar.f7638).m1372(mvVar, mdVar.f2130), System.currentTimeMillis());
        mdVar.f2126 = mvVar;
        mdVar.m834();
        if (this.f6934 > 0) {
            this.f6936.f7630 = this.f6934;
        }
        if (this.f6935 != null && (this.f6935.f4544 != null || (this.f6939 && this.f6935.f4543 != null))) {
            C0358.f6685.mo139(new RunnableC0856(this, this.f6939, this.f6935, this.f6936, this.f6937));
        }
        if (this.f6940 != null && this.f6940.f1997 == nu.PC) {
            bh bhVar = (bh) this.f6940;
            String strM808 = C0358.f6685.f1030.f973.m808(C0358.f6685.f1030.m514(bhVar.f818, bhVar.f814).m1395());
            if (strM808 != null) {
                C0358.f6663.m1535(strM808, 1.0f);
            }
        }
    }
}
