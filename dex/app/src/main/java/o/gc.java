package o;

import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gc implements Runnable {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ String f1315;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ c_activity f1316;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ gb f1317;

    gc(gb gbVar, c_activity c_activityVar, String str) {
        this.f1317 = gbVar;
        this.f1316 = c_activityVar;
        this.f1315 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1316.mo139(new gd(this, C0358.f6685.m536(this.f1317.f1308.f8502), this.f1316, this.f1315));
    }
}
