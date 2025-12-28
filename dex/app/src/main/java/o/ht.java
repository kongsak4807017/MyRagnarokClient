package o;

import o.hs;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ht implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ hr f1535;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f1536;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ hs.C0049.C0050 f1537;

    ht(hs.C0049.C0050 c0050, String str, hr hrVar) {
        this.f1537 = c0050;
        this.f1536 = str;
        this.f1535 = hrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0358.f6663.f8211.containsKey(this.f1536)) {
            return;
        }
        try {
            C0358.f6663.m1536(this.f1536, (byte[]) C0358.f6685.f1033.m519("data\\wav\\" + this.f1536, false));
        } catch (uw e) {
            nz.m907("SFX for " + this.f1535.f1507 + " not found: " + e.f5347);
        }
    }
}
