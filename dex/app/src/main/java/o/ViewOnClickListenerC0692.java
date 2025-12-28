package o;

import android.view.View;
import o.C0804;

/* renamed from: o.役, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ViewOnClickListenerC0692 implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804.C0806 f7645;

    ViewOnClickListenerC0692(C0804.C0806 c0806) {
        this.f7645 = c0806;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0804.C0806 c0806 = this.f7645;
        cv cvVar = C0358.f6685;
        EnumC0134 enumC0134 = (C0358.f6667.f4782 && this.f7645.f7906.isChecked()) ? EnumC0134.SUMMONER : EnumC0134.NOVICE;
        c0806.f7898 = cq.m502(enumC0134, this.f7645.f7898 - 1);
        this.f7645.m1478();
    }
}
