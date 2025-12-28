package o;

import android.widget.ListAdapter;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: o.ઽે, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0442 extends ub {
    C0442() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2072;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        C0743[] c0743Arr = new C0743[i];
        for (int i6 = 0; i6 < i; i6++) {
            c0743Arr[i6] = new C0743(byteBuffer);
        }
        if (z) {
            return;
        }
        C1008[] c1008Arr = new C1008[c0743Arr.length];
        int[] iArr = new int[c0743Arr.length];
        for (int i7 = 0; i7 < c1008Arr.length; i7++) {
            C0743 c0743 = c0743Arr[i7];
            C1008 c1008 = new C1008(c0743.f7715, c0743.f7717, true);
            c1008.f8493 = EnumC0680.valuesCustom()[c0743.f7716];
            c1008Arr[i7] = c1008;
            iArr[i7] = c0743Arr[i7].f7718;
        }
        C0399 c0399 = C0358.f6674.f42.f1743;
        TextView textView = c0399.f6768;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(1738);
        StringBuilder sbAppend = new StringBuilder(String.valueOf(strM649 == null ? "MSG1738" : strM649)).append(" - ");
        lm lmVar = C0358.f6664.f2005.get(i3);
        textView.setText(sbAppend.append(((bh) (bh.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null)).f8368).toString());
        TextView textView2 = c0399.f6774;
        cv cvVar2 = C0358.f6685;
        String strM6492 = C0358.f6687.m649(169);
        textView2.setText(strM6492 == null ? "MSG169" : strM6492);
        TextView textView3 = c0399.f6766;
        cv cvVar3 = C0358.f6685;
        String strM6493 = C0358.f6687.m649(1734);
        textView3.setText(strM6493 == null ? "MSG1734" : strM6493);
        TextView textView4 = c0399.f6761;
        cv cvVar4 = C0358.f6685;
        String strM6494 = C0358.f6687.m649(1857);
        textView4.setText(String.valueOf(strM6494 == null ? "MSG1857" : strM6494) + " " + pa.m973(i5) + " Z");
        c0399.m1319(C0358.f6664.f2004.f8636);
        c0399.d_();
        c0399.f6771 = i5;
        c0399.f6770 = i3;
        c0399.f6773 = i4;
        C0927 c0927 = new C0927(c1008Arr, (int[]) null, iArr);
        c0399.f6759.setAdapter((ListAdapter) c0927);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<Integer, C1008> entry : C0358.f6664.f2004.f8622.entrySet()) {
            C1008 value = entry.getValue();
            if (value != null) {
                int i8 = 0;
                while (true) {
                    if (i8 < c1008Arr.length) {
                        if (value.f8502 == c0927.f8218.get(i8).f7409.f8502) {
                            arrayList.add(value.m1589());
                            arrayList2.add(entry.getKey());
                            arrayList3.add(Integer.valueOf(c0927.f8218.get(i8).f7408));
                            break;
                        }
                        i8++;
                    }
                }
            }
        }
        c0399.f6760.setAdapter((ListAdapter) new C0927((ArrayList<C1008>) arrayList, (ArrayList<Integer>) arrayList2, (ArrayList<Integer>) arrayList3));
        c0399.f6758.setAdapter((ListAdapter) null);
        c0399.h_();
    }
}
