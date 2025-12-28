package o;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class id implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ib f1584;

    id(ib ibVar) {
        this.f1584 = ibVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fn fnVar = this.f1584.f1582.f42.f1751;
        C0358.f6674.setContentView(2130903129);
        fnVar.f1282 = true;
        fnVar.f1281 = (CheckBox) C0358.f6674.findViewById(2131296278);
        fnVar.f1280 = (CheckBox) C0358.f6674.findViewById(2131296359);
        fnVar.f1279 = (CheckBox) C0358.f6674.findViewById(2131296487);
        fnVar.f1275 = (TextView) C0358.f6674.findViewById(2131296351);
        fnVar.f1276 = (Button) C0358.f6674.findViewById(2131296264);
        fnVar.f1277 = (TextView) C0358.f6674.findViewById(2131296284);
        fnVar.f1278 = (Button) C0358.f6674.findViewById(2131296300);
        fnVar.f1281.setEnabled(iu.f1665 >= 4096);
        fnVar.f1281.setChecked(oc.f3239);
        fnVar.f1281.setOnCheckedChangeListener(new fo(fnVar));
        fnVar.f1279.setEnabled(true);
        fnVar.f1279.setChecked(oc.f3231);
        fnVar.f1279.setOnCheckedChangeListener(new fp(fnVar));
        fnVar.f1280.setEnabled(iu.f1665 >= 4096);
        fnVar.f1280.setChecked(oc.f3241);
        fnVar.f1280.setOnCheckedChangeListener(new fq(fnVar));
        fnVar.f1277.setText(oc.f3245);
        fnVar.f1278.setOnClickListener(new fr(fnVar));
    }
}
