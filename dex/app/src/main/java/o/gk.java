package o;

import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import o.gm;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class gk extends ll {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    View.OnClickListener f1354;

    /* renamed from: 櫯, reason: contains not printable characters */
    Button f1355;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f1356;

    gk() {
        super(2130903130);
        this.f1354 = new gl(this);
        this.f1356 = (ListView) this.f1994.findViewById(2131296332);
        this.f1356.setAdapter((ListAdapter) new gm());
        this.f1355 = (Button) this.f1994.findViewById(2131296279);
        this.f1355.setOnClickListener(this.f1354);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        gm gmVar = (gm) this.f1356.getAdapter();
        for (int i = 0; i < gmVar.f1358.size(); i++) {
            gm.C0042 c0042 = gmVar.f1358.get(i);
            C0358.f6687.m658("shortcuts", c0042.m605(), c0042.m606());
        }
    }
}
