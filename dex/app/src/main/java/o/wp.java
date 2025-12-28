package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class wp extends tw {

    /* renamed from: 鷭, reason: contains not printable characters */
    @vm(m1154 = 1)
    public byte f5491;

    /* renamed from: o.wp$鷭, reason: contains not printable characters */
    public enum EnumC0123 {
        STATUS,
        FOOD,
        PERFORMANCE,
        RETURNEGG,
        UNEQUIPITEM;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0123[] valuesCustom() {
            EnumC0123[] enumC0123ArrValuesCustom = values();
            int length = enumC0123ArrValuesCustom.length;
            EnumC0123[] enumC0123Arr = new EnumC0123[length];
            System.arraycopy(enumC0123ArrValuesCustom, 0, enumC0123Arr, 0, length);
            return enumC0123Arr;
        }
    }

    @Override // o.tw, o.vg, o.ve
    /* renamed from: ȃ */
    public final short mo1099() {
        return (short) 417;
    }

    public wp(EnumC0123 enumC0123) {
        this.f5491 = (byte) enumC0123.ordinal();
    }
}
