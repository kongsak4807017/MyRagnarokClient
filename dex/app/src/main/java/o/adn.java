package o;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import net.hockeyapp.android.FeedbackActivity;
import o.adr;
import org.json.JSONException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adn extends AsyncTask<Void, Void, acy> {

    /* renamed from: Ą, reason: contains not printable characters */
    private String f498 = null;

    /* renamed from: ȃ, reason: contains not printable characters */
    private String f499;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private Handler f500;

    /* renamed from: 櫯, reason: contains not printable characters */
    private String f501;

    /* renamed from: 鷭, reason: contains not printable characters */
    private Context f502;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ acy doInBackground(Void[] voidArr) throws JSONException {
        ArrayList<acx> arrayList;
        if (this.f502 == null || this.f501 == null) {
            return null;
        }
        adr adrVar = adr.C0011.f528;
        acy acyVarM354 = adr.m354(this.f501);
        if (acyVarM354 != null && acyVarM354.f446 != null && (arrayList = acyVarM354.f446.f419) != null && !arrayList.isEmpty()) {
            int i = arrayList.get(arrayList.size() - 1).f433;
            SharedPreferences sharedPreferences = this.f502.getSharedPreferences("net.hockeyapp.android.feedback", 0);
            if (this.f499.equals("send")) {
                sharedPreferences.edit().putInt("idLastMessageSend", i).putInt("idLastMessageProcessed", i).apply();
            } else if (this.f499.equals("fetch")) {
                int i2 = sharedPreferences.getInt("idLastMessageSend", -1);
                int i3 = sharedPreferences.getInt("idLastMessageProcessed", -1);
                if (i != i2 && i != i3) {
                    sharedPreferences.edit().putInt("idLastMessageProcessed", i).apply();
                    abs absVar = abr.f357;
                    if (!(absVar != null ? absVar.m299() : false)) {
                        Context context = this.f502;
                        if (this.f498 != null) {
                            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                            int identifier = context.getResources().getIdentifier("ic_menu_refresh", "drawable", "android");
                            Class cls = abr.f357 != null ? FeedbackActivity.class : null;
                            if (cls == null) {
                                cls = FeedbackActivity.class;
                            }
                            Intent intent = new Intent();
                            intent.setFlags(805306368);
                            intent.setClass(context, cls);
                            intent.putExtra("url", this.f498);
                            Notification notificationM381 = adz.m381(context, PendingIntent.getActivity(context, 0, intent, 1073741824), "HockeyApp Feedback", "A new answer to your feedback is available.", identifier);
                            if (notificationM381 != null) {
                                notificationManager.notify(2, notificationM381);
                            }
                        }
                    }
                }
            }
        }
        return acyVarM354;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(acy acyVar) {
        acy acyVar2 = acyVar;
        if (acyVar2 == null || this.f500 == null) {
            return;
        }
        Message message = new Message();
        Bundle bundle = new Bundle();
        bundle.putSerializable("parse_feedback_response", acyVar2);
        message.setData(bundle);
        this.f500.sendMessage(message);
    }

    public adn(FeedbackActivity feedbackActivity, String str, Handler handler, String str2) {
        this.f502 = feedbackActivity;
        this.f501 = str;
        this.f500 = handler;
        this.f499 = str2;
    }
}
