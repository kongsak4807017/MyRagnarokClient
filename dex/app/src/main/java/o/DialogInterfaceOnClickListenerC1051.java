package o;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: o.럃, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class DialogInterfaceOnClickListenerC1051 implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ EditText f8832;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1146 f8833;

    DialogInterfaceOnClickListenerC1051(C1146 c1146, EditText editText) {
        this.f8833 = c1146;
        this.f8832 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0358.f6671.mo454(new C0418(this.f8832.getText().toString()));
    }
}
