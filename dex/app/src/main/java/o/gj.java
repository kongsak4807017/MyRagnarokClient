package o;

import android.view.View;
import android.widget.AdapterView;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gj implements AdapterView.OnItemLongClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ge f1353;

    gj(ge geVar) {
        this.f1353 = geVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        c_activity c_activityVar = (c_activity) view.getContext();
        c_activityVar.f42.f1745.m1601(((ga) adapterView.getAdapter()).f1303[i].f1308);
        c_activityVar.f42.f1745.h_();
        return true;
    }
}
