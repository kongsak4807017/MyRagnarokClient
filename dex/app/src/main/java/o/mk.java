package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class mk implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ mj f2132;

    mk(mj mjVar) {
        this.f2132 = mjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C0358.f6674.mo139(new ml(this, new C0564(this.f2132.f2123.m778())));
        } catch (CloneNotSupportedException e) {
            throw new ut(e);
        }
    }
}
