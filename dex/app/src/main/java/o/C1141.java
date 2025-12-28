package o;

import android.widget.Toast;
import java.nio.ByteBuffer;

/* renamed from: o.톷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1141 extends ub {

    /* renamed from: o.톷$鷭, reason: contains not printable characters */
    enum EnumC1142 {
        FAIL,
        SUCCESS,
        FAIL_CONFIGURATION,
        FAIL_DATABASE,
        FAIL_DATE,
        FAIL_BIRTH;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC1142[] valuesCustom() {
            EnumC1142[] enumC1142ArrValuesCustom = values();
            int length = enumC1142ArrValuesCustom.length;
            EnumC1142[] enumC1142Arr = new EnumC1142[length];
            System.arraycopy(enumC1142ArrValuesCustom, 0, enumC1142Arr, 0, length);
            return enumC1142Arr;
        }
    }

    C1141() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2090;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        if (z) {
            return;
        }
        EnumC1142 enumC1142 = EnumC1142.valuesCustom()[i4];
        if (enumC1142 != EnumC1142.SUCCESS) {
            Toast.makeText(C0358.f6674, "Failed to delete character, error " + enumC1142, 1).show();
        } else {
            C0358.f6674.f42.f1817.m1473(i3);
        }
    }
}
