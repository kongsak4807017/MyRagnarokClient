package o;

import android.view.View;
import android.widget.AdapterView;
import java.io.File;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class eo implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ en f1214;

    eo(en enVar) {
        this.f1214 = enVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        en enVar = this.f1214;
        enVar.m586(enVar.f1211[i].equals("..") ? enVar.f1212.getParentFile() : new File(enVar.f1212 + File.separator + enVar.f1211[i]), false);
    }
}
