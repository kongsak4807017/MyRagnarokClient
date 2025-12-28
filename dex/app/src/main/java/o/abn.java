package o;

import android.os.Handler;
import android.os.Message;
import net.hockeyapp.android.FeedbackActivity;
import o.adw;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class abn extends Handler {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ FeedbackActivity f348;

    public abn(FeedbackActivity feedbackActivity) {
        this.f348 = feedbackActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        acy acyVar;
        boolean z = false;
        this.f348.f69 = new act();
        if (message != null && message.getData() != null && (acyVar = (acy) message.getData().getSerializable("parse_feedback_response")) != null) {
            if (acyVar.f447.equalsIgnoreCase("success")) {
                z = true;
                if (acyVar.f445 != null) {
                    adw.C0012.f540.m367(this.f348.f64, acyVar.f445);
                    FeedbackActivity feedbackActivity = this.f348;
                    feedbackActivity.runOnUiThread(new abp(feedbackActivity, acyVar));
                    FeedbackActivity.m148(this.f348);
                }
            } else {
                z = false;
            }
        }
        if (!z) {
            this.f348.runOnUiThread(new abo(this));
        }
        FeedbackActivity feedbackActivity2 = this.f348;
        if (feedbackActivity2.f77 != null) {
            feedbackActivity2.f77.setEnabled(true);
        }
    }
}
