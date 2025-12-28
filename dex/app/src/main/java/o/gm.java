package o;

import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import java.util.LinkedList;
import java.util.List;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gm extends BaseAdapter {

    /* renamed from: 鷭, reason: contains not printable characters */
    List<C0042> f1358 = new LinkedList();

    /* renamed from: o.gm$鷭, reason: contains not printable characters */
    class C0042 {

        /* renamed from: Ą, reason: contains not printable characters */
        Button f1359;

        /* renamed from: ą, reason: contains not printable characters */
        Button f1360;

        /* renamed from: Ć, reason: contains not printable characters */
        String f1361;

        /* renamed from: ȃ, reason: contains not printable characters */
        Button f1363;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        Button f1365;

        /* renamed from: 櫯, reason: contains not printable characters */
        EditText f1368;

        /* renamed from: 鷭, reason: contains not printable characters */
        RelativeLayout f1369;

        /* renamed from: ć, reason: contains not printable characters */
        TextWatcher f1362 = new gn(this);

        /* renamed from: ˮ͍, reason: contains not printable characters */
        View.OnClickListener f1366 = new go(this);

        /* renamed from: 岱, reason: contains not printable characters */
        View.OnClickListener f1367 = new gp(this);

        C0042(String str) {
            this.f1361 = str;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final String m606() {
            String string;
            if (this.f1368 != null) {
                string = this.f1368.getText().toString();
            } else {
                string = this.f1361;
            }
            if (string == null || string.length() <= 0) {
                return null;
            }
            return string;
        }

        /* renamed from: 櫯, reason: contains not printable characters */
        final int m605() {
            for (int i = 0; i < gm.this.f1358.size(); i++) {
                if (gm.this.f1358.get(i) == this) {
                    return i;
                }
            }
            return -1;
        }
    }

    gm() {
        int i = 0;
        while (true) {
            String strM655 = C0358.f6687.m655("shortcuts", i);
            if (strM655 != null) {
                this.f1358.add(new C0042(strM655));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1358.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f1358.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0042 c0042 = this.f1358.get(i);
        c0042.f1369 = (RelativeLayout) C0358.f6674.getLayoutInflater().inflate(2130903131, (ViewGroup) null);
        c0042.f1368 = (EditText) c0042.f1369.findViewById(2131296299);
        c0042.f1365 = (Button) c0042.f1369.findViewById(2131296279);
        c0042.f1363 = (Button) c0042.f1369.findViewById(2131296300);
        c0042.f1359 = (Button) c0042.f1369.findViewById(2131296404);
        c0042.f1360 = (Button) c0042.f1369.findViewById(2131296264);
        if (!c0042.f1368.getText().toString().equals(c0042.f1361)) {
            c0042.f1368.setText(c0042.f1361);
        }
        c0042.f1368.addTextChangedListener(c0042.f1362);
        c0042.f1365.setOnClickListener(c0042.f1366);
        c0042.f1363.setOnClickListener(c0042.f1367);
        if (c0042.m605() == 0) {
            c0042.f1359.setEnabled(false);
        } else if (c0042.m605() == gm.this.f1358.size() - 1) {
            c0042.f1360.setEnabled(false);
        }
        return this.f1358.get(i).f1369;
    }
}
