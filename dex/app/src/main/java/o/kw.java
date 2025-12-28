package o;

import android.view.View;
import o.C0523;
import o.kv;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kw implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ kv f1943;

    kw(kv kvVar) {
        this.f1943 = kvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f1943.f1934 == kv.EnumC0058.SKILL) {
            kv.m759(this.f1943);
            return;
        }
        if (this.f1943.f1934 == kv.EnumC0058.ITEM) {
            kv.m757(this.f1943);
            return;
        }
        if (this.f1943.f1934 != kv.EnumC0058.EMOTION) {
            if (this.f1943.f1934 == kv.EnumC0058.HOMUN) {
                kv.m752(this.f1943);
                return;
            }
            if (this.f1943.f1934 == kv.EnumC0058.MERC) {
                kv.m744(this.f1943);
                return;
            } else if (this.f1943.f1934 == kv.EnumC0058.GAMEMENU) {
                C0358.f6674.f42.f1807.m1364(C0523.Cif.valuesCustom()[this.f1943.f1926]);
                return;
            } else {
                nz.m907("unexpceted hotkey type" + this.f1943.f1934);
                return;
            }
        }
        C0358.f6671.mo454(new C0884(nd.valuesCustom()[this.f1943.f1926]));
    }
}
