package o;

import o.ph;

/* renamed from: o.ㅩ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0504 implements Runnable {

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ ph.C0072 f6986;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ md f6987;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ md f6988;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1105 f6989;

    RunnableC0504(C1105 c1105, md mdVar, md mdVar2, ph.C0072 c0072) {
        this.f6989 = c1105;
        this.f6988 = mdVar;
        this.f6987 = mdVar2;
        this.f6986 = c0072;
    }

    @Override // java.lang.Runnable
    public final void run() {
        md mdVar = this.f6988;
        C0933 c0933 = new C0933(this.f6988, this.f6987, this.f6986.f4547);
        synchronized (mdVar.f2127) {
            mdVar.f2127.add(c0933);
        }
    }
}
