package o;

/* renamed from: o.形, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0691 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f7643;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0483 f7644;

    RunnableC0691(C0483 c0483, String str) {
        this.f7644 = c0483;
        this.f7643 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            cv cvVar = C0358.f6685;
            String str = this.f7643;
            if (!str.toLowerCase().endsWith(".bmp")) {
                str = String.valueOf(str) + ".bmp";
            }
            C0358.f6674.mo139(new RunnableC0441(this, cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\illust\\" + str, 1)));
        } catch (uw unused) {
        }
    }
}
