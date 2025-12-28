package o;

/* renamed from: o.ǽ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0222 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ bm f6513;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0572 f6514;

    RunnableC0222(C0572 c0572, bm bmVar) {
        this.f6514 = c0572;
        this.f6513 = bmVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, InterruptedException {
        bo boVar = C0358.f6675;
        og ogVar = C0358.f6688.f6692 == null ? null : C0358.f6688.f6692;
        String str = C0358.f6688.f6693.f6708;
        bm bmVar = this.f6513;
        short s = (short) (((bmVar.f846[0] & 255) << 2) | ((bmVar.f846[1] & 255) >> 6));
        bm bmVar2 = this.f6513;
        boVar.m471(ogVar, str, s, (short) ((((bmVar2.f846[1] & 255) & 63) << 4) | ((bmVar2.f846[2] & 255) >> 4)));
        if (C0358.f6667.f4826) {
            C0358.f6671.mo454(new C0154(null, "\u0000andro"));
        }
    }
}
