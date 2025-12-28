package o;

import android.content.DialogInterface;
import net.hockeyapp.android.FeedbackActivity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class abk implements DialogInterface.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ FeedbackActivity f345;

    public abk(FeedbackActivity feedbackActivity) {
        this.f345 = feedbackActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f345.f69 = null;
        dialogInterface.cancel();
    }
}
