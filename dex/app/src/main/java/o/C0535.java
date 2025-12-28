package o;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.ByteBuffer;

/* renamed from: o.㨘, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0535 extends ub {
    C0535() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2067;
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        C0743[] c0743Arr = new C0743[i];
        for (int i4 = 0; i4 < i; i4++) {
            c0743Arr[i4] = new C0743(byteBuffer);
        }
        if (z) {
            return;
        }
        C1008[] c1008Arr = new C1008[c0743Arr.length];
        int[] iArr = new int[c0743Arr.length];
        for (int i5 = 0; i5 < c0743Arr.length; i5++) {
            C0743 c0743 = c0743Arr[i5];
            C1008 c1008 = new C1008(c0743.f7715, c0743.f7717, true);
            c1008.f8493 = EnumC0680.valuesCustom()[c0743.f7716];
            c1008Arr[i5] = c1008;
            iArr[i5] = c0743Arr[i5].f7718;
        }
        ls lsVar = C0358.f6674.f42.f1750;
        lsVar.f2022 = true;
        lsVar.f2021.setVisibility(4);
        lsVar.f2027.setVisibility(4);
        TextView textView = lsVar.f2028;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1735);
        textView.setText(String.valueOf(strM649 == null ? "MSG1735" : strM649) + " : " + ((Object) lsVar.f2027.getText()));
        EditText editText = lsVar.f2026;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(1736);
        editText.setText(String.format(strM6492 == null ? "MSG1736" : strM6492, pa.m973(i3)));
        lsVar.f2026.setInputType(524288);
        lsVar.f2026.setEnabled(false);
        lsVar.m797(c1008Arr.length);
        for (int i6 = 0; i6 < c1008Arr.length; i6++) {
            lsVar.m801(new lg(c1008Arr[i6], i6), c1008Arr[i6].f8500, iArr[i6]);
        }
        Toast.makeText(C0358.f6674, "You have successfully opened a buying store! ^^", 1).show();
    }
}
