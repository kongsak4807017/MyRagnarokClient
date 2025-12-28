package o;

import net.hockeyapp.android.UpdateActivity;
import o.aca;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ace extends acp {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ UpdateActivity f378;

    public ace(UpdateActivity updateActivity) {
        this.f378 = updateActivity;
    }

    @Override // o.acp
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo308(Boolean bool) {
        if (bool.booleanValue()) {
            this.f378.m168();
        } else {
            this.f378.findViewById(aca.Cif.button_update).setEnabled(true);
        }
    }

    @Override // o.acp
    /* renamed from: 鷭 */
    public final void mo307(adi adiVar) {
        this.f378.findViewById(aca.Cif.button_update).setEnabled(true);
    }
}
