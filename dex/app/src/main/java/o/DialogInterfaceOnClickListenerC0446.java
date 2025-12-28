package o;

import android.content.DialogInterface;
import o.C0523;
import o.kv;

/* renamed from: o.ஊ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC0446 implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0523.Cif f6863;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0523 f6864;

    DialogInterfaceOnClickListenerC0446(C0523 c0523, C0523.Cif cif) {
        this.f6864 = c0523;
        this.f6863 = cif;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                C0358.f6674.f42.m735(kv.EnumC0058.GAMEMENU, this.f6863.ordinal(), -1, 0, (byte) 0);
                break;
        }
    }
}
