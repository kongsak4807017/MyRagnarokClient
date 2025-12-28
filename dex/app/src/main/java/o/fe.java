package o;

import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class fe extends ll {

    /* renamed from: 櫯, reason: contains not printable characters */
    private AdapterView.OnItemClickListener f1259;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f1260;

    fe() {
        super(2130903127);
        this.f1259 = new ff(this);
        this.f1260 = (ListView) this.f1994.findViewById(2131296332);
        this.f1260.setOnItemClickListener(this.f1259);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        this.f1260.setAdapter((ListAdapter) new fg());
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }
}
