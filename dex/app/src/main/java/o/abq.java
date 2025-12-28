package o;

import net.hockeyapp.android.FeedbackActivity;
import o.adw;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class abq implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ FeedbackActivity f352;

    public abq(FeedbackActivity feedbackActivity) {
        this.f352 = feedbackActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        adw.C0012.f540.m367(this.f352, null);
        this.f352.getSharedPreferences("net.hockeyapp.android.feedback", 0).edit().remove("idLastMessageSend").remove("idLastMessageProcessed").apply();
        this.f352.m159(false);
    }
}
