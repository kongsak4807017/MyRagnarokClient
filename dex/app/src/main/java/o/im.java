package o;

import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class im extends ap {

    /* renamed from: ȃ, reason: contains not printable characters */
    private AdapterView.OnItemLongClickListener f1645;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private AdapterView.OnItemClickListener f1646;

    /* renamed from: 櫯, reason: contains not printable characters */
    GridView f1647;

    /* renamed from: 鷭, reason: contains not printable characters */
    ng f1648;

    @Deprecated
    private im(int i, ng ngVar) {
        super(2130903087);
        this.f1646 = new in(this);
        this.f1645 = new io(this);
        this.f1648 = ngVar;
        this.f1647 = (GridView) this.f683.findViewById(2131296294);
        this.f1647.setAdapter((ListAdapter) new il(this.f1648));
        this.f1647.setOnItemClickListener(this.f1646);
        this.f1647.setOnItemLongClickListener(this.f1645);
    }

    im(ng ngVar) {
        this(2130903087, ngVar);
    }
}
