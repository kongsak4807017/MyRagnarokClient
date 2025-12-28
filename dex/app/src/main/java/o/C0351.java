package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import o.aq;

/* renamed from: o.ˮ̿, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0351 extends ub {

    /* renamed from: o.ˮ̿$鷭, reason: contains not printable characters */
    enum EnumC0352 {
        SUCCESS,
        FAIL;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0352[] valuesCustom() {
            EnumC0352[] enumC0352ArrValuesCustom = values();
            int length = enumC0352ArrValuesCustom.length;
            EnumC0352[] enumC0352Arr = new EnumC0352[length];
            System.arraycopy(enumC0352ArrValuesCustom, 0, enumC0352Arr, 0, length);
            return enumC0352Arr;
        }
    }

    C0351() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 261;
        int i3 = byteBuffer.getInt();
        ow owVar = ow.LOCAL;
        byte[] bArr = new byte[24];
        byteBuffer.get(bArr);
        String strM978 = pa.m978(bArr, owVar);
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (EnumC0352.valuesCustom()[b] == EnumC0352.FAIL) {
            C0358.f6674.f42.f1792.m1432(String.valueOf(strM978) + " failed to leave the party o_O", 16711680);
            return;
        }
        if (C0358.f6664 == null || C0358.f6664.f2004 == null || C0358.f6664.f2004.f8596 == null) {
            return;
        }
        if (i3 == C0358.f6664.f2004.f1998) {
            C0358.f6664.f2004.f8596 = null;
            C0358.f6674.f42.f1746.mo439();
            C0698 c0698 = C0358.f6674.f42.f1792;
            cv cvVar = C0358.f6685;
            String strM649 = C0358.f6687.m649(85);
            c0698.m1432(strM649 == null ? "MSG85" : strM649, SupportMenu.USER_MASK);
            if (C0358.f6669.f2063.f6881 != null) {
                C0358.f6669.f2063.f6881.f7255 = new HashMap<>();
                return;
            }
            return;
        }
        aq.C0023[] c0023Arr = new aq.C0023[C0358.f6664.f2004.f8596.f684.length];
        int i4 = 0;
        for (int i5 = 0; i5 < c0023Arr.length; i5++) {
            if (C0358.f6664.f2004.f8596.f684[i5].f696 != i3) {
                int i6 = i4;
                i4++;
                c0023Arr[i6] = C0358.f6664.f2004.f8596.f684[i5];
            }
        }
        if (i4 == c0023Arr.length) {
            return;
        }
        C0358.f6664.f2004.f8596.f684 = (aq.C0023[]) Arrays.copyOf(c0023Arr, i4);
        if (C0358.f6674.f42.f1746.f1994.getParent() != null) {
            C0358.f6674.f42.f1746.m444();
        }
        if (C0358.f6669.f2063.f6881 != null) {
            C0539 c0539 = C0358.f6669.f2063.f6881;
            c0539.f7255 = (HashMap) c0539.f7255.clone();
            c0539.f7255.remove(Integer.valueOf(i3));
        }
    }
}
