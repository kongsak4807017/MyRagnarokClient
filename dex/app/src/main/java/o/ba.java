package o;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ba implements AdapterView.OnItemClickListener {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ az f784;

    ba(az azVar) {
        this.f784 = azVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        az azVar = this.f784;
        bf bfVar = (bf) azVar.f746.getAdapter().getItem(i);
        if (bfVar.f792.f696 == C0358.f6664.f2004.f1998) {
            AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
            builder.setTitle((CharSequence) null).setMessage((CharSequence) null);
            String[] strArr = new String[1];
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(97);
            strArr[0] = strM649 == null ? "MSG97" : strM649;
            builder.setItems(strArr, new bb(azVar));
            builder.show();
            return;
        }
        if (C0358.f6664.f2004.m1612()) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(C0358.f6674);
            builder2.setTitle((CharSequence) null).setMessage((CharSequence) null);
            String[] strArr2 = new String[2];
            cv cvVar2 = C0358.f6685;
            String strM6492 = C0358.f6687.m649(1533);
            strArr2[0] = strM6492 == null ? "MSG1533" : strM6492;
            cv cvVar3 = C0358.f6685;
            String strM6493 = C0358.f6687.m649(98);
            strArr2[1] = strM6493 == null ? "MSG98" : strM6493;
            builder2.setItems(strArr2, new bc(azVar, bfVar));
            builder2.show();
        }
    }
}
