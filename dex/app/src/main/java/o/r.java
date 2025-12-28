package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import java.text.NumberFormat;
import java.util.LinkedList;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class r extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    LinkedList<s> f4968 = new LinkedList<>();

    r(LinkedList<s> linkedList, boolean z) {
        for (int i = 0; i < linkedList.size(); i++) {
            s sVar = linkedList.get(i);
            if (C0358.f6674.f42.f1750.f2023) {
                if (sVar != null) {
                    this.f4968.add(i, new s(sVar.f4980.f1964, sVar.f4980.f1967, sVar.f4969, z));
                } else {
                    this.f4968.add(i, new s(null, 0, 0, z));
                }
            } else if (sVar != null) {
                this.f4968.add(i, new s(sVar.f4980.f1964, sVar.f4980.f1967, sVar.f4969, sVar.f4970, z));
            } else {
                this.f4968.add(i, new s(null, 0, 0, 0, z));
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4968.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f4968.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.f4968.get(i).f4980.f1967;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        s sVar = this.f4968.get(i);
        sVar.f4979 = C0358.f6674.f42.f1750.f2023;
        sVar.f4983 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903101, (ViewGroup) null);
        sVar.f4976 = (Button) sVar.f4983.findViewById(2131296279);
        sVar.f4974 = (Button) sVar.f4983.findViewById(2131296300);
        sVar.f4976.setOnClickListener(sVar.f4973);
        sVar.f4980.m768((RelativeLayout) sVar.f4983.findViewById(2131296438));
        if (sVar.f4979) {
            sVar.f4974.setVisibility(4);
        } else {
            sVar.f4980.f1959.setVisibility(4);
            sVar.f4974.setOnClickListener(sVar.f4981);
        }
        if (sVar.f4980.f1964 == null) {
            if (!sVar.f4979) {
                sVar.f4974.setVisibility(4);
            }
            sVar.f4976.setVisibility(4);
        } else {
            if (!sVar.f4979) {
                sVar.f4974.setVisibility(0);
                sVar.f4970 = sVar.f4970;
                if (sVar.f4974 != null) {
                    sVar.f4974.setText(NumberFormat.getInstance().format(sVar.f4970));
                }
            }
            sVar.f4976.setVisibility(0);
            sVar.m1087(sVar.f4969);
        }
        sVar.f4980.f1962.setOnClickListener(sVar.f4975);
        sVar.f4983.setEnabled(!sVar.f4977);
        sVar.f4976.setEnabled(!sVar.f4977);
        if (!sVar.f4979) {
            sVar.f4974.setEnabled(!sVar.f4977);
        }
        return sVar.f4983;
    }
}
