package o;

import net.hockeyapp.android.FeedbackActivity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class abm implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ abl f347;

    abm(abl ablVar) {
        this.f347 = ablVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FeedbackActivity feedbackActivity = this.f347.f346;
        if (feedbackActivity.f77 != null) {
            feedbackActivity.f77.setEnabled(true);
        }
        this.f347.f346.showDialog(0);
    }
}
