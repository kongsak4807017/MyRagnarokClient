package o;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import o.ck;
import o.cl;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cm implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ cl f941;

    cm(cl clVar) {
        this.f941 = clVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        cl.C0028 c0028 = (cl.C0028) this.f941.f934.getAdapter().getItem(i);
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setIcon(c0028.f937.getDrawable());
        builder.setTitle(c0028.f938.f5004);
        String str = String.valueOf(c0028.f938.f5001[0]) + c0028.f938.f5001[1] + "^000000";
        if (c0028.f939.f920 != null) {
            for (ck.C0027 c0027 : c0028.f939.f920) {
                if (c0027.f928 != null && c0027.f932 != 0) {
                    if (c0027.f928 == null) {
                        C0358.f6685.f1030.f985.f2006.get(Integer.valueOf(c0027.f932));
                    }
                    str = String.valueOf(str) + "\n" + c0027.f928 + ": " + ((int) c0027.f931) + "/" + ((int) c0027.f930);
                }
            }
        }
        builder.setMessage(je.m710(str, true));
        builder.show();
    }
}
