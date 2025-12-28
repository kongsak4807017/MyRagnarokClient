package o;

import android.widget.BaseAdapter;
import o.hc;

/* renamed from: o.軎, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0870 extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    hc[] f8041 = new hc[C0358.f6664.f2004.f8635.f8305.size()];

    C0870() {
        for (int i = 0; i < C0358.f6664.f2004.f8635.f8305.size(); i++) {
            this.f8041[i] = new hc(C0358.f6664.f2004.f8635.f8305.get(i), hc.EnumC0046.GUILD);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f8041.length;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f8041[i];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f8041[i].f1461.f1409;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0870.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
