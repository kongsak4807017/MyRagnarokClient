package o;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.roworkshop.andro.c_activity;
import java.util.Arrays;
import o.pj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class es {

    /* renamed from: Ą, reason: contains not printable characters */
    iw f1219;

    /* renamed from: ą, reason: contains not printable characters */
    View.OnClickListener f1220 = new et(this);

    /* renamed from: Ć, reason: contains not printable characters */
    AdapterView.OnItemClickListener f1221 = new eu(this);

    /* renamed from: ȃ, reason: contains not printable characters */
    c_activity f1222;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Button f1223;

    /* renamed from: 櫯, reason: contains not printable characters */
    ListView f1224;

    /* renamed from: 鷭, reason: contains not printable characters */
    pj.C0079[] f1225;

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m587() {
        int[] iArr = new int[this.f1225.length];
        Arrays.fill(iArr, -1);
        this.f1224.setAdapter((ListAdapter) new fb(this.f1225, iArr));
        this.f1219 = new iw("Ping thread");
        this.f1219.mo139(new ey(this));
        this.f1219.mo139(new ez(this));
    }

    es(c_activity c_activityVar, pj.C0079[] c0079Arr) {
        this.f1222 = c_activityVar;
        this.f1225 = c0079Arr;
        Arrays.sort(this.f1225, new fa(this));
        this.f1224 = (ListView) this.f1222.findViewById(2131296332);
        this.f1223 = (Button) this.f1222.findViewById(2131296279);
        this.f1224.setOnItemClickListener(this.f1221);
        this.f1223.setOnClickListener(this.f1220);
        je.m704(2131296320);
        m587();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m588(pj.C0079 c0079) {
        if (this.f1219 != null && this.f1219.f1700 != null) {
            this.f1219.f1700.interrupt();
        }
        C0358.f6674.setContentView(2130903051);
        je.m704(2131296320);
        this.f1222.f42.f1795 = null;
        C0358.f6685 = null;
        C0358.m1309(c0079);
    }
}
