package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import net.hockeyapp.android.FeedbackActivity;
import o.aca;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class abl extends Handler {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ FeedbackActivity f346;

    public abl(FeedbackActivity feedbackActivity) {
        this.f346 = feedbackActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z = false;
        this.f346.f69 = new act();
        if (message == null || message.getData() == null) {
            this.f346.f69.f418 = this.f346.getString(aca.C0005.hockeyapp_feedback_send_generic_error);
        } else {
            Bundle data = message.getData();
            String string = data.getString("feedback_response");
            String string2 = data.getString("feedback_status");
            String string3 = data.getString("request_type");
            if (string3.equals("send") && (string == null || Integer.parseInt(string2) != 201)) {
                this.f346.f69.f418 = this.f346.getString(aca.C0005.hockeyapp_feedback_send_generic_error);
            } else if (string3.equals("fetch") && string2 != null && (Integer.parseInt(string2) == 404 || Integer.parseInt(string2) == 422)) {
                FeedbackActivity feedbackActivity = this.f346;
                feedbackActivity.runOnUiThread(new abq(feedbackActivity));
                z = true;
            } else if (string == null) {
                this.f346.f69.f418 = this.f346.getString(aca.C0005.hockeyapp_feedback_send_network_error);
            } else {
                FeedbackActivity.m157(this.f346, string, string3);
                z = true;
            }
        }
        if (!z) {
            this.f346.runOnUiThread(new abm(this));
        }
    }
}
