package o;

import o.ph;

/* renamed from: o.衮, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0856 implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ md f8029;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ md f8030;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ ph.C0072 f8031;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ boolean f8032;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC0481 f8033;

    RunnableC0856(RunnableC0481 runnableC0481, boolean z, ph.C0072 c0072, md mdVar, md mdVar2) {
        this.f8033 = runnableC0481;
        this.f8032 = z;
        this.f8031 = c0072;
        this.f8030 = mdVar;
        this.f8029 = mdVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8032 && this.f8031.f4543 != null) {
            md mdVar = this.f8030;
            C0933 c0933 = new C0933(this.f8030, this.f8029, this.f8031.f4543);
            synchronized (mdVar.f2127) {
                mdVar.f2127.add(c0933);
            }
        }
        if (this.f8031.f4544 != null) {
            md mdVar2 = this.f8030;
            C0933 c09332 = new C0933(this.f8030, this.f8029, this.f8031.f4544);
            synchronized (mdVar2.f2127) {
                mdVar2.f2127.add(c09332);
            }
        }
    }
}
