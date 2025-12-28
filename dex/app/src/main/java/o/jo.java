package o;

import android.content.DialogInterface;
import o.wp;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class jo implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ je f1854;

    jo(je jeVar) {
        this.f1854 = jeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0358.f6671.mo454(new wp(new wp.EnumC0123[]{wp.EnumC0123.FOOD, wp.EnumC0123.PERFORMANCE, wp.EnumC0123.RETURNEGG}[i]));
    }
}
