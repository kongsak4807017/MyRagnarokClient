package o;

import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.roworkshop.andro.c_activity;
import java.util.LinkedList;

/* renamed from: o.溚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0778 extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    TextView f7813;

    /* renamed from: ą, reason: contains not printable characters */
    ViewPager.OnPageChangeListener f7814;

    /* renamed from: ȃ, reason: contains not printable characters */
    TextView f7815;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    TextView f7816;

    /* renamed from: 櫯, reason: contains not printable characters */
    ViewPager f7817;

    /* renamed from: 鷭, reason: contains not printable characters */
    ng f7818;

    C0778() {
        super(2130903083);
        this.f7814 = new C1078(this);
        this.f7817 = (ViewPager) this.f1994.findViewById(2131296321);
        this.f7816 = (TextView) this.f1994.findViewById(2131296265);
        this.f7815 = (TextView) this.f1994.findViewById(2131296259);
        this.f7813 = (TextView) this.f1994.findViewById(2131296282);
        this.f7817.setOnPageChangeListener(this.f7814);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1467(int i) {
        this.f7816.setText(((C0821) ((ao) this.f7817.getAdapter()).f682.get(i)).f7937.name());
        if (i > 0) {
            this.f7813.setVisibility(0);
            this.f7813.setText(((C0821) ((ao) this.f7817.getAdapter()).f682.get(i - 1)).f7937.name());
        } else {
            this.f7813.setVisibility(4);
        }
        if (i < this.f7817.getAdapter().getCount() - 1) {
            this.f7815.setVisibility(0);
            this.f7815.setText(((C0821) ((ao) this.f7817.getAdapter()).f682.get(i + 1)).f7937.name());
        } else {
            this.f7815.setVisibility(4);
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    private int m1462(ng ngVar) {
        if (this.f7817.getAdapter() == null) {
            return -1;
        }
        for (int i = 0; i < this.f7817.getAdapter().getCount(); i++) {
            if (((C0821) ((ao) this.f7817.getAdapter()).f682.get(i)).f7937 == ngVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final C0821 m1466(ng ngVar) {
        for (int i = 0; i < this.f7817.getAdapter().getCount(); i++) {
            C0821 c0821 = (C0821) ((ao) this.f7817.getAdapter()).f682.get(i);
            if (c0821.f7937 == ngVar) {
                return c0821;
            }
        }
        return null;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m1465(ng ngVar) {
        if (!(this.f1994.getParent() != null)) {
            return;
        }
        C0821 c0821M1466 = null;
        if (ngVar != null) {
            c0821M1466 = m1466(ngVar);
        }
        if (c0821M1466 == null) {
            m1463();
        } else {
            c0821M1466.f7936.setAdapter((ListAdapter) new C0979(ngVar));
        }
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m1463() {
        if (!(this.f1994.getParent() != null)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C0821(ng.USABLE));
        linkedList.add(new C0821(ng.EQUIP));
        linkedList.add(new C0821(ng.ETC));
        C1035 c1035 = C0358.f6664.f2004;
        if (c1035.f8351.containsKey(nt.ON_PUSH_CART) || (c1035.f8357 & 1928) > 0) {
            linkedList.add(new C1092());
        }
        this.f7817.setAdapter(new ao(linkedList));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1468(EnumC0680 enumC0680) {
        if (!(this.f1994.getParent() != null)) {
            return;
        }
        m1465(ng.m881(enumC0680));
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final void m1464(ng ngVar) {
        if (this.f7818 == ngVar) {
            return;
        }
        this.f7818 = ngVar;
        int iM1462 = m1462(ngVar);
        if (iM1462 == -1) {
            return;
        }
        this.f7817.setCurrentItem(iM1462, false);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        m1463();
        m1467(0);
        int iM1462 = m1462(this.f7818);
        if (iM1462 != -1) {
            this.f7817.setCurrentItem(iM1462, false);
        }
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296409)).setImageBitmap(C0358.f6674.f42.f1788[1]);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        this.f7817.setAdapter(null);
        c_activity c_activityVar = C0358.f6674;
        ((ImageView) C0358.f6674.findViewById(2131296409)).setImageBitmap(C0358.f6674.f42.f1788[0]);
    }
}
