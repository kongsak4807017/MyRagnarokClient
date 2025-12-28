package o;

/* renamed from: o.Ɠ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0181 extends fc {

    /* renamed from: o.Ɠ$鷭, reason: contains not printable characters */
    enum EnumC0182 {
        RESPAWN,
        CHARSELECT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0182[] valuesCustom() {
            EnumC0182[] enumC0182ArrValuesCustom = values();
            int length = enumC0182ArrValuesCustom.length;
            EnumC0182[] enumC0182Arr = new EnumC0182[length];
            System.arraycopy(enumC0182ArrValuesCustom, 0, enumC0182Arr, 0, length);
            return enumC0182Arr;
        }
    }

    C0181(EnumC0182 enumC0182) {
        this.f5008 = (short) 178;
        this.f4868.put((byte) enumC0182.ordinal());
    }
}
