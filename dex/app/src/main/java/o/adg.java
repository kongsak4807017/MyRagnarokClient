package o;

import android.app.Activity;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class adg implements DialogInterface.OnClickListener {

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ ade f479;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ JSONArray f480;

    adg(ade adeVar, JSONArray jSONArray) {
        this.f479 = adeVar;
        this.f480 = jSONArray;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        aeb.m389(this.f479.f476, "[]");
        WeakReference weakReference = new WeakReference(this.f479.f476);
        if (!adz.m382().booleanValue() || !adz.m383((WeakReference<Activity>) weakReference).booleanValue()) {
            this.f479.m336(this.f480, (Boolean) false);
        } else {
            ade.m334(this.f479, this.f480);
        }
    }
}
