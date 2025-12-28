package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class vs extends pp {

    /* renamed from: Ą, reason: contains not printable characters */
    @vm(m1154 = 2)
    public int f5425;

    /* renamed from: ą, reason: contains not printable characters */
    @vm(m1154 = 3)
    public int f5426;

    /* renamed from: Ć, reason: contains not printable characters */
    @vm(m1154 = 4)
    public byte[] f5427;

    /* renamed from: ȃ, reason: contains not printable characters */
    @vm(m1154 = 1)
    public EnumC0120 f5428;

    /* renamed from: o.vs$鷭, reason: contains not printable characters */
    public enum EnumC0120 {
        SUCCESS_STARTING_TRANSFER,
        FAIL_FILE_NOT_EXISTS,
        FAIL_UNKNOWN_ERROR,
        SUCCESS_STARTING_UNPACKED_TRANSFER;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0120[] valuesCustom() {
            EnumC0120[] enumC0120ArrValuesCustom = values();
            int length = enumC0120ArrValuesCustom.length;
            EnumC0120[] enumC0120Arr = new EnumC0120[length];
            System.arraycopy(enumC0120ArrValuesCustom, 0, enumC0120Arr, 0, length);
            return enumC0120Arr;
        }
    }

    @Override // o.tw, o.vg, o.ve
    /* renamed from: ȃ */
    public final short mo1099() {
        return pg.BC_RESOURCEACK_ASCII.f4538;
    }

    private vs(EnumC0120 enumC0120, int i, int i2, String str) {
        this.f5428 = enumC0120;
        this.f5425 = i;
        this.f5426 = i2;
        this.f5427 = pa.m987(str, ow.KOREAN, true);
    }

    public vs() {
    }
}
