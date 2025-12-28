package o;

/* renamed from: o.ɪ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0254 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ AbstractC0988 f6569;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C1106 f6570;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0253 f6571;

    RunnableC0254(RunnableC0253 runnableC0253, C1106 c1106, AbstractC0988 abstractC0988) {
        this.f6571 = runnableC0253;
        this.f6570 = c1106;
        this.f6569 = abstractC0988;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0358.f6669.f2048.f1543.add(this.f6570);
        if (this.f6569.f1997 == nu.PC) {
            bh bhVar = (bh) this.f6569;
            String strM808 = C0358.f6685.f1030.f973.m808(C0358.f6685.f1030.m514(bhVar.f818, bhVar.f814).m1394());
            if (strM808 != null) {
                C0358.f6663.m1535(strM808, 1.0f);
            }
        }
    }
}
