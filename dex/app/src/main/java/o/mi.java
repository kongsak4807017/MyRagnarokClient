package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class mi implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ pe f2120;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ mh f2121;

    mi(mh mhVar, pe peVar) {
        this.f2121 = mhVar;
        this.f2120 = peVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0933 c0933 = new C0933(this.f2121, this.f2120);
        mh mhVar = this.f2121;
        synchronized (mhVar.f2127) {
            mhVar.f2127.add(c0933);
        }
        mh mhVar2 = this.f2121;
        ly lyVar = C0358.f6669;
        lq lqVarM810 = ly.m810(mhVar2.f2076);
        lq lqVar = c0933.f945;
        lqVar.f2017 = lqVarM810.f2017;
        lqVar.f2016 = lqVarM810.f2016;
        c0933.mo481();
    }
}
