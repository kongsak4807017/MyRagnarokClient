package o;

import android.graphics.Bitmap;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.HashMap;
import java.util.Iterator;
import o.C0972;

/* renamed from: o.ﲱ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1159 extends AbstractC0769 {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    HashMap<String, Bitmap> f9043;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f9044;

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f9045;

    C1159() {
        super(2130903068, nf.MEMBERS);
        this.f9043 = new HashMap<>();
        this.f9045 = (ListView) this.f7796.findViewById(2131296332);
    }

    @Override // o.AbstractC0769
    /* renamed from: 鷭 */
    final void mo1382() {
        this.f9044 = 0;
        Iterator<C0972.C0974> it = C0358.f6664.f2004.f8635.f8300.iterator();
        while (it.hasNext()) {
            this.f9044 += it.next().f8317;
        }
        this.f9045.setAdapter((ListAdapter) new C0479());
    }
}
