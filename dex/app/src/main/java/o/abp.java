package o;

import android.widget.ListAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import net.hockeyapp.android.FeedbackActivity;
import o.aca;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class abp implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ FeedbackActivity f350;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ acy f351;

    public abp(FeedbackActivity feedbackActivity, acy acyVar) {
        this.f350 = feedbackActivity;
        this.f351 = acyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f350.m159(true);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMM h:mm a");
        if (this.f351 != null && this.f351.f446 != null && this.f351.f446.f419 != null && this.f351.f446.f419.size() > 0) {
            this.f350.f61 = this.f351.f446.f419;
            Collections.reverse(this.f350.f61);
            try {
                this.f350.f52.setText(String.format(this.f350.getString(aca.C0005.hockeyapp_feedback_last_updated_text) + " %s", simpleDateFormat2.format(simpleDateFormat.parse(((acx) this.f350.f61.get(0)).f432))));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (this.f350.f60 == null) {
                this.f350.f60 = new aco(this.f350.f64, this.f350.f61);
            } else {
                aco acoVar = this.f350.f60;
                if (acoVar.f395 != null) {
                    acoVar.f395.clear();
                }
                Iterator it = this.f350.f61.iterator();
                while (it.hasNext()) {
                    acx acxVar = (acx) it.next();
                    aco acoVar2 = this.f350.f60;
                    if (acxVar != null && acoVar2.f395 != null) {
                        acoVar2.f395.add(acxVar);
                    }
                }
                this.f350.f60.notifyDataSetChanged();
            }
            this.f350.f76.setAdapter((ListAdapter) this.f350.f60);
        }
    }
}
