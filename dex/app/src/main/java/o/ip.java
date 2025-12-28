package o;

import android.support.v4.view.ViewPager;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ip extends ll {

    /* renamed from: 櫯, reason: contains not printable characters */
    ViewPager f1651;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f1652;

    ip() {
        super(2130903141);
        this.f1652 = (TextView) this.f1994.findViewById(2131296265);
        this.f1651 = (ViewPager) this.f1994.findViewById(2131296321);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        m774();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new im(ng.USABLE));
        linkedList.add(new im(ng.EQUIP));
        linkedList.add(new im(ng.ETC));
        this.f1651.setAdapter(new ao(linkedList));
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private im m676(ng ngVar) {
        ao aoVar = (ao) this.f1651.getAdapter();
        if (aoVar == null) {
            return null;
        }
        for (int i = 0; i < aoVar.getCount(); i++) {
            im imVar = (im) aoVar.f682.get(i);
            if (imVar.f1648 == ngVar) {
                return imVar;
            }
        }
        return null;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m677(ng ngVar) {
        while (true) {
            if (!(this.f1994.getParent() != null)) {
                return;
            }
            if (ngVar == null) {
                m677(ng.USABLE);
                m677(ng.EQUIP);
                ngVar = ng.ETC;
            } else {
                im imVarM676 = m676(ngVar);
                if (imVarM676 == null) {
                    return;
                }
                imVarM676.f1647.setAdapter((ListAdapter) new il(ngVar));
                return;
            }
        }
    }
}
