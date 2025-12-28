package o;

import o.ada;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class adc implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ adb f467;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ada.Cif f468;

    adc(adb adbVar, ada.Cif cif) {
        this.f467 = adbVar;
        this.f468 = cif;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f467.f466.f455.add(this.f468);
        this.f467.f466.m320();
    }
}
