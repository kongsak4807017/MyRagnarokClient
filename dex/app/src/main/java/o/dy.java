package o;

import android.view.View;
import android.widget.Toast;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dy implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ dx f1140;

    dy(dx dxVar) {
        this.f1140 = dxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f1140.f1134 > 0 || (this.f1140.f1132 != null && this.f1140.f1132.length > 0)) {
            c_activity c_activityVar = C0358.f6674;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(2613);
            Toast.makeText(c_activityVar, strM649 == null ? "MSG2613" : strM649, 0).show();
            return;
        }
        C0358.f6671.mo454(new C0188(this.f1140.f1136.f7868, this.f1140.f1136.f7867));
    }
}
