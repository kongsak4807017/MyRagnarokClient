package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class vy extends tw {

    /* renamed from: 鷭, reason: contains not printable characters */
    @vm(m1154 = 1)
    public EnumC0122 f5448;

    /* renamed from: o.vy$鷭, reason: contains not printable characters */
    public enum EnumC0122 {
        SUCCESS,
        FAIL;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0122[] valuesCustom() {
            EnumC0122[] enumC0122ArrValuesCustom = values();
            int length = enumC0122ArrValuesCustom.length;
            EnumC0122[] enumC0122Arr = new EnumC0122[length];
            System.arraycopy(enumC0122ArrValuesCustom, 0, enumC0122Arr, 0, length);
            return enumC0122Arr;
        }
    }

    @Override // o.tw, o.vg, o.ve
    /* renamed from: ȃ */
    public final short mo1099() {
        return pg.BR_AUTHREPLY.f4538;
    }

    private vy(EnumC0122 enumC0122) {
        this.f5448 = enumC0122;
    }
}
