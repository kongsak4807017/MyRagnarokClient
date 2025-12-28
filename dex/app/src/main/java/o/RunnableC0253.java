package o;

import com.roworkshop.andro.c_activity;

/* renamed from: o.ɧ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0253 implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ nq f6560;

    /* renamed from: ą, reason: contains not printable characters */
    private final /* synthetic */ int f6561;

    /* renamed from: Ć, reason: contains not printable characters */
    private final /* synthetic */ lm f6562;

    /* renamed from: ć, reason: contains not printable characters */
    private final /* synthetic */ md f6563;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ int f6564;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ long f6565;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private final /* synthetic */ AbstractC0988 f6566;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ md f6567;

    /* renamed from: 鷭, reason: contains not printable characters */
    private final /* synthetic */ int f6568;

    RunnableC0253(int i, md mdVar, long j, int i2, nq nqVar, int i3, lm lmVar, md mdVar2, AbstractC0988 abstractC0988) {
        this.f6568 = i;
        this.f6567 = mdVar;
        this.f6565 = j;
        this.f6564 = i2;
        this.f6560 = nqVar;
        this.f6561 = i3;
        this.f6562 = lmVar;
        this.f6563 = mdVar2;
        this.f6566 = abstractC0988;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ne neVar;
        int i = this.f6568;
        md mdVar = this.f6567;
        long j = this.f6565;
        if (this.f6564 > 0) {
            neVar = ne.FIXED_DIR;
        } else {
            neVar = (this.f6560 == nq.ATTACK_CRITICAL || this.f6560 == nq.MULTI_HIT_CRITICAL) ? ne.CRITICAL : ne.NORMAL;
        }
        C0358.f6669.f2048.f1543.add(new C1106(i, mdVar, j, neVar));
        md mdVar2 = this.f6567;
        mv mvVar = mv.TAKEDAMAGE;
        mdVar2.m1423(((C0564) mdVar2.f7638).m1372(mvVar, mdVar2.f2130), System.currentTimeMillis());
        mdVar2.f2126 = mvVar;
        mdVar2.m834();
        C0358.f6685.mo139(new RunnableC0582(this, this.f6567, this.f6563));
        if (this.f6561 > 0) {
            this.f6567.f7630 = this.f6561;
        }
        if (this.f6562.f1997 == nu.PC) {
            bh bhVar = (bh) this.f6562;
            String strM808 = C0358.f6685.f1030.f973.m808(C0358.f6685.f1030.m514(bhVar.f818, bhVar.f814).m1395());
            if (strM808 != null) {
                C0358.f6663.m1535(strM808, 1.0f);
            }
        }
        if (this.f6564 > 0) {
            C1106 c1106 = new C1106(this.f6564, this.f6567, this.f6565 + 250, ne.NORMAL);
            c_activity c_activityVar = C0358.f6674;
            RunnableC0254 runnableC0254 = new RunnableC0254(this, c1106, this.f6566);
            if (c_activityVar.f47 != null) {
                c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, runnableC0254), 250L);
            }
        }
    }
}
