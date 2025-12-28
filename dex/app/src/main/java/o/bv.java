package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class bv implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ boolean[] f860;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0450[] f861;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ bo f862;

    bv(bo boVar, C0450[] c0450Arr, boolean[] zArr) {
        this.f862 = boVar;
        this.f861 = c0450Arr;
        this.f860 = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f861[0] = new C0450(C0358.f6669.f2063.f6887, true);
        cv cvVar = C0358.f6685;
        cv.m526();
        cv cvVar2 = C0358.f6685;
        cv.m523();
        cp.m493();
        this.f860[0] = true;
    }
}
