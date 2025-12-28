package o;

import android.content.DialogInterface;
import net.hockeyapp.android.UpdateActivity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class acc implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ UpdateActivity f373;

    public acc(UpdateActivity updateActivity) {
        this.f373 = updateActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UpdateActivity.m167(this.f373);
        dialogInterface.cancel();
    }
}
