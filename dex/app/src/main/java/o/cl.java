package o;

import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Map;
import o.ua;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class cl extends ll {

    /* renamed from: 鷭, reason: contains not printable characters */
    ListView f934;

    /* renamed from: o.cl$鷭, reason: contains not printable characters */
    class C0028 extends AbstractC0733 {

        /* renamed from: Ą, reason: contains not printable characters */
        TextView f935;

        /* renamed from: ȃ, reason: contains not printable characters */
        ImageView f937;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        ua.C0084 f938;

        /* renamed from: 櫯, reason: contains not printable characters */
        ck f939;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f940;

        C0028(int i, ck ckVar) {
            super(2130903113);
            this.f940 = i;
            this.f939 = ckVar;
            this.f938 = C0358.f6685.f1030.f983.mo1102(i);
            if (this.f938 == null) {
                this.f938 = new ua.C0084();
                this.f938.f5004 = "Quest " + this.f940;
            }
        }

        @Override // o.AbstractC0733
        /* renamed from: 鷭, reason: contains not printable characters */
        final void mo485() {
            this.f937 = (ImageView) this.f7711.findViewById(2131296297);
            this.f935 = (TextView) this.f7711.findViewById(2131296265);
            if (this.f938 == null || this.f938.f5003 == null || this.f938.f5003.length() <= 0) {
                this.f937.setImageBitmap(null);
            } else {
                C0358.f6674.f42.m730(this.f937, C0358.f6685.f1030.m511(this.f938.f5003.toLowerCase()), C0358.f6674.f42.f1821, null);
            }
            this.f935.setText(this.f938 != null ? je.m710(this.f938.f5004, true) : "Quest " + this.f940);
        }
    }

    cl() {
        super(2130903112);
        this.f934 = (ListView) this.f1994.findViewById(2131296332);
        this.f934.setOnItemClickListener(new cm(this));
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        m484();
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        this.f934.setAdapter((ListAdapter) null);
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m484() {
        if (!(this.f1994.getParent() != null)) {
            return;
        }
        C0028[] c0028Arr = new C0028[C0358.f6679.f6832.size()];
        int i = 0;
        for (Map.Entry<Integer, ck> entry : C0358.f6679.f6832.entrySet()) {
            int i2 = i;
            i++;
            c0028Arr[i2] = new C0028(entry.getKey().intValue(), entry.getValue());
        }
        this.f934.setAdapter((ListAdapter) new C1019(c0028Arr));
    }
}
