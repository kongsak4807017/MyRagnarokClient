package o;

import android.widget.TextView;
import o.aca;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class acj extends acp {

    /* renamed from: ȃ, reason: contains not printable characters */
    final /* synthetic */ aci f386;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final /* synthetic */ String f387;

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ String f388;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ TextView f389;

    acj(aci aciVar, TextView textView, String str, String str2) {
        this.f386 = aciVar;
        this.f389 = textView;
        this.f388 = str;
        this.f387 = str2;
    }

    @Override // o.acp
    /* renamed from: 鷭 */
    public final void mo307(adi adiVar) {
        if (adiVar instanceof adl) {
            this.f389.setText(this.f386.getString(aca.C0005.hockeyapp_update_version_details_label, new Object[]{this.f388, this.f387, String.format("%.2f", Float.valueOf(((adl) adiVar).f490 / 1048576.0f)) + " MB"}));
        }
    }
}
