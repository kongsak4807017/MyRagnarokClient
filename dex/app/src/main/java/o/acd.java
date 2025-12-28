package o;

import android.widget.TextView;
import net.hockeyapp.android.UpdateActivity;
import o.aca;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class acd extends acp {

    /* renamed from: ȃ, reason: contains not printable characters */
    final /* synthetic */ UpdateActivity f374;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final /* synthetic */ String f375;

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ String f376;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ TextView f377;

    public acd(UpdateActivity updateActivity, TextView textView, String str, String str2) {
        this.f374 = updateActivity;
        this.f377 = textView;
        this.f376 = str;
        this.f375 = str2;
    }

    @Override // o.acp
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo307(adi adiVar) {
        if (adiVar instanceof adl) {
            this.f377.setText(this.f374.getString(aca.C0005.hockeyapp_update_version_details_label, new Object[]{this.f376, this.f375, String.format("%.2f", Float.valueOf(((adl) adiVar).f490 / 1048576.0f)) + " MB"}));
        }
    }
}
