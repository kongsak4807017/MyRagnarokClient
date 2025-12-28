package o;

import android.view.View;
import android.widget.Toast;
import com.roworkshop.andro.c_activity;
import java.util.LinkedList;
import org.apache.commons.net.ftp.FTPReply;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lt implements View.OnClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ ls f2029;

    lt(ls lsVar) {
        this.f2029 = lsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        ls lsVar = this.f2029;
        String string = lsVar.f2027.getText().toString();
        if (string == null || string.length() < 4) {
            c_activity c_activityVar = C0358.f6674;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(FTPReply.CLOSING_DATA_CONNECTION);
            Toast.makeText(c_activityVar, strM649 == null ? "MSG226" : strM649, 1).show();
            return;
        }
        if (lsVar.f2023) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < lsVar.f2025.getCount(); i++) {
                s sVar = (s) lsVar.f2025.getItemAtPosition(i);
                if (sVar.f4980.f1964 != null) {
                    if (sVar.f4969 <= 0) {
                        c_activity c_activityVar2 = C0358.f6674;
                        cv cvVar2 = C0358.f6685;
                        String strM6492 = C0358.f6687.m649(1726);
                        Toast.makeText(c_activityVar2, String.format(strM6492 == null ? "MSG1726" : strM6492, sVar.f4980.f1964.m1588()), 1).show();
                        return;
                    }
                    linkedList.add(sVar);
                }
            }
            if (linkedList.size() <= 0) {
                Toast.makeText(C0358.f6674, "Please specify at least one item for sell", 1).show();
                return;
            }
            C0447[] c0447Arr = new C0447[linkedList.size()];
            for (int i2 = 0; i2 < c0447Arr.length; i2++) {
                s sVar2 = (s) linkedList.get(i2);
                c0447Arr[i2] = new C0447(sVar2.f4980.f1967, sVar2.f4980.f1964.f8500, sVar2.f4969);
            }
            C0358.f6671.mo454(new C0169(string, true, c0447Arr));
            return;
        }
        try {
            int i3 = Integer.parseInt(lsVar.f2026.getText().toString());
            if (i3 == 0) {
                c_activity c_activityVar3 = C0358.f6674;
                cv cvVar3 = C0358.f6685;
                String strM6493 = C0358.f6687.m649(1731);
                Toast.makeText(c_activityVar3, strM6493 == null ? "MSG1731" : strM6493, 0).show();
                return;
            }
            if (i3 > C0358.f6664.f2004.f8636) {
                c_activity c_activityVar4 = C0358.f6674;
                cv cvVar4 = C0358.f6685;
                String strM6494 = C0358.f6687.m649(1732);
                Toast.makeText(c_activityVar4, strM6494 == null ? "MSG1732" : strM6494, 0).show();
                return;
            }
            LinkedList linkedList2 = new LinkedList();
            for (int i4 = 0; i4 < lsVar.f2025.getCount(); i4++) {
                s sVar3 = (s) lsVar.f2025.getItemAtPosition(i4);
                if (sVar3.f4980.f1964 != null) {
                    linkedList2.add(sVar3);
                }
            }
            C0888[] c0888Arr = new C0888[linkedList2.size()];
            if (c0888Arr.length <= 0) {
                c_activity c_activityVar5 = C0358.f6674;
                cv cvVar5 = C0358.f6685;
                String strM6495 = C0358.f6687.m649(1725);
                Toast.makeText(c_activityVar5, strM6495 == null ? "MSG1725" : strM6495, 0).show();
                return;
            }
            for (int i5 = 0; i5 < c0888Arr.length; i5++) {
                s sVar4 = (s) linkedList2.get(i5);
                if (sVar4.f4970 == 0) {
                    c_activity c_activityVar6 = C0358.f6674;
                    cv cvVar6 = C0358.f6685;
                    String strM6496 = C0358.f6687.m649(1728);
                    Toast.makeText(c_activityVar6, String.format(strM6496 == null ? "MSG1728" : strM6496, sVar4.f4980.f1964.m1588()), 0).show();
                    return;
                }
                if (sVar4.f4970 > 9998) {
                    c_activity c_activityVar7 = C0358.f6674;
                    cv cvVar7 = C0358.f6685;
                    String strM6497 = C0358.f6687.m649(1729);
                    Toast.makeText(c_activityVar7, String.format(strM6497 == null ? "MSG1729" : strM6497, sVar4.f4980.f1964.m1588()), 0).show();
                    return;
                }
                if (sVar4.f4969 == 0) {
                    c_activity c_activityVar8 = C0358.f6674;
                    cv cvVar8 = C0358.f6685;
                    String strM6498 = C0358.f6687.m649(1726);
                    Toast.makeText(c_activityVar8, String.format(strM6498 == null ? "MSG1726" : strM6498, sVar4.f4980.f1964.m1588()), 0).show();
                    return;
                }
                if (sVar4.f4969 > 99989999) {
                    c_activity c_activityVar9 = C0358.f6674;
                    cv cvVar9 = C0358.f6685;
                    String strM6499 = C0358.f6687.m649(1727);
                    Toast.makeText(c_activityVar9, String.format(strM6499 == null ? "MSG1727" : strM6499, sVar4.f4980.f1964.m1588()), 0).show();
                    return;
                }
                c0888Arr[i5] = new C0888((short) sVar4.f4980.f1964.f8502, (short) sVar4.f4970, sVar4.f4969);
            }
            C0358.f6671.mo454(new C0786(i3, (byte) 1, string, c0888Arr));
        } catch (NumberFormatException unused) {
            c_activity c_activityVar10 = C0358.f6674;
            cv cvVar10 = C0358.f6685;
            String strM64910 = C0358.f6687.m649(603);
            Toast.makeText(c_activityVar10, strM64910 == null ? "MSG603" : strM64910, 0).show();
        }
    }
}
