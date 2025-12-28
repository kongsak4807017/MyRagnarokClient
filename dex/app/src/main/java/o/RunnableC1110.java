package o;

import o.ph;

/* renamed from: o.쨷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC1110 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ mj f8902;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ md f8903;

    /* renamed from: 鷭, reason: contains not printable characters */
    private final /* synthetic */ ph.C0072 f8904;

    RunnableC1110(ph.C0072 c0072, md mdVar, md mdVar2) {
        this.f8904 = c0072;
        this.f8903 = mdVar;
        this.f8902 = mdVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (ph.Cif cif : this.f8904.f4546) {
            mj mjVar = null;
            mj mjVar2 = null;
            switch ((cif.f4540 >> 8) & 3) {
                case 0:
                    mjVar = this.f8903;
                    break;
                case 1:
                    mjVar = this.f8902;
                    break;
            }
            switch ((cif.f4540 >> 8) & 3) {
                case 0:
                    mjVar2 = this.f8903;
                    break;
                case 1:
                    mjVar2 = this.f8902;
                    break;
            }
            if (mjVar != null) {
                if (cif.f4541 != null) {
                    mjVar.mo846(cif.f4541);
                }
                C0933 c0933 = new C0933(mjVar, mjVar2, cif.f4542);
                mj mjVar3 = mjVar;
                synchronized (mjVar.f2127) {
                    mjVar3.f2127.add(c0933);
                }
            }
        }
    }
}
