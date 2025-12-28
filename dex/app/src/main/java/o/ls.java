package o;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.commons.net.ftp.FTPReply;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ls extends ll {

    /* renamed from: Ą, reason: contains not printable characters */
    Button f2021;

    /* renamed from: ą, reason: contains not printable characters */
    boolean f2022;

    /* renamed from: Ć, reason: contains not printable characters */
    boolean f2023;

    /* renamed from: ć, reason: contains not printable characters */
    private View.OnClickListener f2024;

    /* renamed from: ȃ, reason: contains not printable characters */
    ListView f2025;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    EditText f2026;

    /* renamed from: 櫯, reason: contains not printable characters */
    EditText f2027;

    /* renamed from: 鷭, reason: contains not printable characters */
    TextView f2028;

    ls() {
        super(2130903102);
        this.f2024 = new lt(this);
        this.f2028 = (TextView) this.f1994.findViewById(2131296265);
        this.f2027 = (EditText) this.f1994.findViewById(2131296299);
        this.f2026 = (EditText) this.f1994.findViewById(2131296333);
        this.f2021 = (Button) this.f1994.findViewById(2131296279);
        this.f2025 = (ListView) this.f1994.findViewById(2131296332);
        this.f2021.setOnClickListener(this.f2024);
        EditText editText = this.f2027;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(283);
        editText.setHint(strM649 == null ? "MSG283" : strM649);
    }

    @Override // o.ll
    /* renamed from: ȃ */
    public final void mo445() {
        m774();
        this.f2027.setText("");
        this.f2026.setText("0");
        C0358.f6674.f42.f1810.h_();
        this.f2027.setVisibility(0);
        this.f2021.setVisibility(0);
    }

    @Override // o.ll
    /* renamed from: Ą */
    public final void mo443() {
        if (this.f2023) {
            if (!this.f2022) {
                m796();
                C0358.f6671.mo454(new C0169("", false, null));
                return;
            } else {
                C0358.f6671.mo454(new C0208());
                this.f2022 = false;
                return;
            }
        }
        if (!this.f2022) {
            m797(this.f2025.getCount());
            return;
        }
        C0358.f6671.mo454(new C0179());
        m797(this.f2025.getCount());
        this.f2022 = false;
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final void m796() {
        for (int i = 0; i < this.f2025.getCount(); i++) {
            s sVar = (s) this.f2025.getItemAtPosition(i);
            if (sVar.f4980.f1964 != null) {
                sVar.m1086();
            }
        }
        m797(this.f2025.getCount());
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m800(int i, boolean z) {
        super.h_();
        this.f2023 = z;
        if (z) {
            TextView textView = this.f2028;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(FTPReply.DATA_CONNECTION_OPEN);
            textView.setText(strM649 == null ? "MSG225" : strM649);
            this.f2026.setVisibility(4);
            C0358.f6674.f42.f1810.m1464(ng.CART);
        } else {
            TextView textView2 = this.f2028;
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(1721);
            textView2.setText(strM6492 == null ? "MSG1721" : strM6492);
            this.f2026.setVisibility(0);
            this.f2026.setEnabled(true);
            C0358.f6674.f42.f1810.m1464(ng.USABLE);
        }
        m797(i);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m797(int i) {
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < i; i2++) {
            linkedList.add(null);
        }
        this.f2025.setAdapter((ListAdapter) new r(linkedList, false));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m801(lg lgVar, int i, int i2) {
        if (this.f2023) {
            LinkedList<s> linkedList = ((r) this.f2025.getAdapter()).f4968;
            s sVar = null;
            Iterator<s> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s next = it.next();
                if (next.f4980.f1964 != null && next.f4980.f1967 == lgVar.f1967) {
                    sVar = next;
                    break;
                }
            }
            if (sVar == null) {
                Iterator<s> it2 = linkedList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    s next2 = it2.next();
                    if (next2.f4980.f1964 == null) {
                        sVar = next2;
                        break;
                    }
                }
                if (sVar == null) {
                    Toast.makeText(C0358.f6674, "Can't add anymore items: all slots are occupied.", 1).show();
                    return;
                }
            }
            if (sVar.f4980.f1964 == null) {
                sVar.f4980.f1964 = lgVar.f1964.m1589();
                sVar.f4980.f1967 = lgVar.f1967;
                sVar.f4980.f1964.f8500 = i;
            } else {
                sVar.f4980.f1964.f8500 += i;
            }
            if (i2 != -1) {
                sVar.m1087(i2);
            }
            this.f2025.setAdapter((ListAdapter) new r(linkedList, this.f2022));
            if (!this.f2022) {
                C1008 c1008 = C0358.f6664.f2004.f8592.get(Integer.valueOf(lgVar.f1967));
                if (c1008 == null) {
                    nz.m907("Couldn't find cart item " + lgVar.f1964.f8502 + " to withdraw");
                    return;
                }
                c1008.f8500 -= i;
                if (c1008.f8500 <= 0) {
                    C0358.f6664.f2004.f8592.remove(Integer.valueOf(lgVar.f1967));
                }
                C0358.f6674.f42.f1810.m1465(ng.CART);
                return;
            }
            return;
        }
        LinkedList<s> linkedList2 = ((r) this.f2025.getAdapter()).f4968;
        s sVar2 = null;
        Iterator<s> it3 = linkedList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            s next3 = it3.next();
            if (next3.f4980.f1964 != null && next3.f4980.f1967 == lgVar.f1967) {
                sVar2 = next3;
                break;
            }
        }
        if (sVar2 == null) {
            Iterator<s> it4 = linkedList2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                s next4 = it4.next();
                if (next4.f4980.f1964 == null) {
                    sVar2 = next4;
                    break;
                }
            }
            if (sVar2 == null) {
                Toast.makeText(C0358.f6674, "Can't add anymore items: all slots are occupied.", 1).show();
                return;
            }
        }
        if (sVar2.f4980.f1964 == null) {
            sVar2.f4980.f1964 = lgVar.f1964.m1589();
            sVar2.f4980.f1967 = lgVar.f1967;
            sVar2.f4980.f1964.f8500 = i;
        } else {
            sVar2.f4980.f1964.f8500 += i;
        }
        if (i2 != -1) {
            sVar2.m1087(i2);
        }
        if (i != -1) {
            s sVar3 = sVar2;
            sVar2.f4970 = i;
            if (sVar3.f4974 != null) {
                sVar3.f4974.setText(NumberFormat.getInstance().format(sVar3.f4970));
            }
        }
        this.f2025.setAdapter((ListAdapter) new r(linkedList2, this.f2022));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m798(int i, int i2) {
        s sVar = null;
        int i3 = 0;
        while (true) {
            if (i3 < this.f2025.getCount()) {
                s sVar2 = (s) this.f2025.getItemAtPosition(i3);
                if (sVar2.f4980.f1967 != i || sVar2.f4980.f1964 == null || sVar2.f4980.f1964.f8500 <= 0) {
                    i3++;
                } else {
                    sVar = sVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (sVar == null) {
            nz.m907("Received request to sell item " + i + " but this item doesn't exist in the vending list");
        } else {
            sVar.m1088(i2, true);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m799(int i, int i2, int i3) {
        EditText editText = this.f2026;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1736);
        editText.setText(String.format(strM649 == null ? "MSG1736" : strM649, pa.m973(i3)));
        r rVar = (r) C0358.f6674.f42.f1750.f2025.getAdapter();
        for (int i4 = 0; i4 < rVar.f4968.size(); i4++) {
            if (rVar.f4968.get(i4).f4980.f1964.f8502 == i) {
                rVar.f4968.get(i4).f4970 -= i2;
            }
        }
        LinkedList linkedList = new LinkedList();
        for (int i5 = 0; i5 < rVar.f4968.size(); i5++) {
            linkedList.add(rVar.f4968.get(i5));
        }
        this.f2025.setAdapter((ListAdapter) new r(linkedList, true));
    }
}
