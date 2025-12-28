package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

/* renamed from: o.哷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0649 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    DialogInterface.OnClickListener f7535;

    /* renamed from: ȃ, reason: contains not printable characters */
    AdapterView.OnItemClickListener f7536;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f7537;

    /* renamed from: 櫯, reason: contains not printable characters */
    AlertDialog f7538;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f7539;

    C0649() {
        super(2130903061);
        this.f7536 = new C0913(this);
        this.f7535 = new DialogInterfaceOnClickListenerC0849(this);
        this.f7539 = (ListView) this.f1994.findViewById(2131296332);
        this.f7539.setOnItemClickListener(this.f7536);
        AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
        builder.setTitle((CharSequence) null);
        builder.setItems(new String[]{"Message", "Delete"}, this.f7535);
        this.f7538 = builder.create();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1408(boolean z) {
        if (!(this.f1994.getParent() != null)) {
            return;
        }
        if (z) {
            C0935 c0935 = (C0935) this.f7539.getAdapter();
            for (int i = 0; i < c0935.getCount(); i++) {
                C0998 c0998 = (C0998) c0935.getItem(i);
                if (c0998.f8468 != null) {
                    c0998.f8468.setChecked(c0998.f8470.f7706);
                }
            }
            return;
        }
        this.f7539.setAdapter((ListAdapter) new C0935());
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f1994.getLayoutParams();
        layoutParams.addRule(2, 2131296408);
        this.f1994.setLayoutParams(layoutParams);
        m1408(false);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        this.f7539.setAdapter((ListAdapter) null);
    }
}
