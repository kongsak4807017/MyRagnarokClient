package o;

/* renamed from: o.ṇ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0484 implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0851 f6945;

    RunnableC0484(C0851 c0851) {
        this.f6945 = c0851;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        bo boVar = C0358.f6675;
        C0358.f6669.f2066.f7970 = nh.UNLOADED;
        C0358.f6671.m456(true);
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Loading resources"));
        C0450[] c0450Arr = new C0450[1];
        C0358.f6685.mo139(new bv(boVar, c0450Arr, zArr));
        boolean[] zArr = {false};
        bo.m469(zArr);
        C0851 c0851 = C0358.f6669.f2066;
        bw bwVar = new bw(boVar, c0450Arr, zArr);
        synchronized (c0851) {
            c0851.f7979.add(bwVar);
        }
        bo.m469(zArr);
        C0358.f6674.mo139(new jt(C0358.f6674.f42));
        C0358.f6671.m456(false);
    }
}
