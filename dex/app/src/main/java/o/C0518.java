package o;

import android.widget.Toast;
import java.nio.ByteBuffer;

/* renamed from: o.㐚, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0518 extends ub {

    /* renamed from: o.㐚$鷭, reason: contains not printable characters */
    enum EnumC0519 {
        FAIL,
        SUCCESS,
        FAIL_CONFIGURATION,
        FAIL_DATABASE,
        FAIL_GUILD,
        FAIL_PARTY;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0519[] valuesCustom() {
            EnumC0519[] enumC0519ArrValuesCustom = values();
            int length = enumC0519ArrValuesCustom.length;
            EnumC0519[] enumC0519Arr = new EnumC0519[length];
            System.arraycopy(enumC0519ArrValuesCustom, 0, enumC0519Arr, 0, length);
            return enumC0519Arr;
        }
    }

    C0518() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 2088;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        if (z) {
            return;
        }
        EnumC0519 enumC0519 = EnumC0519.valuesCustom()[i4];
        if (enumC0519 != EnumC0519.SUCCESS) {
            Toast.makeText(C0358.f6674, "Failed to set character for deletion: " + enumC0519, 1).show();
        } else {
            C0358.f6674.f42.f1817.m1474(i3, i5);
        }
    }
}
