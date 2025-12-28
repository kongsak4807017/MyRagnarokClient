package o;

import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

/* renamed from: o.郳, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0876 extends ll {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private AdapterView.OnItemClickListener f8044;

    /* renamed from: 櫯, reason: contains not printable characters */
    public oe f8045;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f8046;

    C0876() {
        super(2130903091);
        this.f8044 = new C0426(this);
        this.f8046 = (ListView) this.f1994.findViewById(2131296332);
        this.f8046.setOnItemClickListener(this.f8044);
    }

    @Override // o.ll
    /* renamed from: ą */
    final void mo772() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.addRule(13);
        this.f1994.setLayoutParams(layoutParams);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.addRule(13);
            this.f1994.setLayoutParams(layoutParams);
        }
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
