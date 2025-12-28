package o;

import android.widget.Toast;
import java.nio.ByteBuffer;

/* renamed from: o.뺧, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1073 extends ub {

    /* renamed from: o.뺧$鷭, reason: contains not printable characters */
    enum EnumC1074 {
        FAIL,
        SUCCESS,
        FAIL_DATABASE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC1074[] valuesCustom() {
            EnumC1074[] enumC1074ArrValuesCustom = values();
            int length = enumC1074ArrValuesCustom.length;
            EnumC1074[] enumC1074Arr = new EnumC1074[length];
            System.arraycopy(enumC1074ArrValuesCustom, 0, enumC1074Arr, 0, length);
            return enumC1074Arr;
        }
    }

    C1073() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2092;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        if (z) {
            return;
        }
        EnumC1074 enumC1074 = EnumC1074.valuesCustom()[i4];
        if (enumC1074 != EnumC1074.SUCCESS) {
            Toast.makeText(C0358.f6674, "Failed to cancel character deletion : " + enumC1074, 1).show();
        } else {
            C0358.f6674.f42.f1817.m1474(i3, 0);
        }
    }
}
