package net.hockeyapp.android.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import o.aca;
import o.acv;
import o.acx;
import o.ada;
import o.aee;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class FeedbackMessageView extends LinearLayout {

    /* renamed from: Ą, reason: contains not printable characters */
    private TextView f94;

    /* renamed from: ą, reason: contains not printable characters */
    private AttachmentListView f95;

    /* renamed from: Ć, reason: contains not printable characters */
    private acx f96;

    /* renamed from: ć, reason: contains not printable characters */
    private final Context f97;

    /* renamed from: ȃ, reason: contains not printable characters */
    private TextView f98;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private TextView f99;

    /* renamed from: 鷭, reason: contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat f93 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

    /* renamed from: 櫯, reason: contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat f92 = new SimpleDateFormat("d MMM h:mm a");

    public FeedbackMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f97 = context;
        LayoutInflater.from(context).inflate(aca.C0006.hockeyapp_view_feedback_message, this);
        this.f99 = (TextView) findViewById(aca.Cif.label_author);
        this.f98 = (TextView) findViewById(aca.Cif.label_date);
        this.f94 = (TextView) findViewById(aca.Cif.label_text);
        this.f95 = (AttachmentListView) findViewById(aca.Cif.list_attachments);
    }

    public void setFeedbackMessage(acx acxVar) {
        this.f96 = acxVar;
        try {
            this.f98.setText(f92.format(f93.parse(this.f96.f432)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.f99.setText(this.f96.f435);
        this.f94.setText(this.f96.f442);
        this.f95.removeAllViews();
        for (acv acvVar : this.f96.f440) {
            aee aeeVar = new aee(this.f97, this.f95, acvVar, false);
            ada adaVar = ada.C0009.f465;
            adaVar.f455.add(new ada.Cif(acvVar, aeeVar, null));
            adaVar.m320();
            this.f95.addView(aeeVar);
        }
    }

    public void setIndex(int i) {
        if (i % 2 == 0) {
            setBackgroundColor(getResources().getColor(aca.C0007.hockeyapp_background_light));
            this.f99.setTextColor(getResources().getColor(aca.C0007.hockeyapp_text_white));
            this.f98.setTextColor(getResources().getColor(aca.C0007.hockeyapp_text_white));
        } else {
            setBackgroundColor(getResources().getColor(aca.C0007.hockeyapp_background_white));
            this.f99.setTextColor(getResources().getColor(aca.C0007.hockeyapp_text_light));
            this.f98.setTextColor(getResources().getColor(aca.C0007.hockeyapp_text_light));
        }
        this.f94.setTextColor(getResources().getColor(aca.C0007.hockeyapp_text_black));
    }
}
