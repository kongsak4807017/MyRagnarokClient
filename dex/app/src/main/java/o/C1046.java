package o;

import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;

/* renamed from: o.뜝, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1046 extends ll {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    AdapterView.OnItemLongClickListener f8698;

    /* renamed from: 櫯, reason: contains not printable characters */
    AdapterView.OnItemClickListener f8699;

    /* renamed from: 鷭, reason: contains not printable characters */
    GridView f8700;

    C1046() {
        super(2130903056);
        this.f8699 = new C0466(this);
        this.f8698 = new C0668(this);
        this.f8700 = (GridView) this.f1994.findViewById(2131296294);
        this.f8700.setOnItemClickListener(this.f8699);
        this.f8700.setOnItemLongClickListener(this.f8698);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        layoutParams.addRule(2, 2131296408);
        this.f1994.setLayoutParams(layoutParams);
        this.f8700.setAdapter((ListAdapter) new C0826());
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        this.f8700.setAdapter((ListAdapter) null);
    }
}
