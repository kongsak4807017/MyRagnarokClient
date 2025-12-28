package o;

/* renamed from: o.懂, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0711 implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ float f7665;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f7666;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0919 f7667;

    RunnableC0711(C0919 c0919, String str, float f) {
        this.f7667 = c0919;
        this.f7666 = str;
        this.f7665 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f7667.m1536(this.f7666, (byte[]) C0358.f6685.f1033.m519("data\\wav\\" + this.f7666 + ".wav", false));
            this.f7667.m1532(this.f7666, this.f7665);
        } catch (uw unused) {
        }
    }
}
