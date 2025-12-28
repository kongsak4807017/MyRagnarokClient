package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class vq extends pp {

    /* renamed from: Ą, reason: contains not printable characters */
    @vm(m1154 = 2)
    public int f5411;

    /* renamed from: ą, reason: contains not printable characters */
    @vm(m1154 = 3)
    public int f5412;

    /* renamed from: Ć, reason: contains not printable characters */
    @vm(m1154 = 4)
    public char[] f5413;

    /* renamed from: ȃ, reason: contains not printable characters */
    @vm(m1154 = 1)
    public EnumC0119 f5414;

    /* renamed from: o.vq$鷭, reason: contains not printable characters */
    public enum EnumC0119 {
        SUCCESS_STARTING_TRANSFER,
        FAIL_FILE_NOT_EXISTS,
        FAIL_UNKNOWN_ERROR,
        SUCCESS_STARTING_UNPACKED_TRANSFER;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0119[] valuesCustom() {
            EnumC0119[] enumC0119ArrValuesCustom = values();
            int length = enumC0119ArrValuesCustom.length;
            EnumC0119[] enumC0119Arr = new EnumC0119[length];
            System.arraycopy(enumC0119ArrValuesCustom, 0, enumC0119Arr, 0, length);
            return enumC0119Arr;
        }
    }

    @Override // o.tw, o.vg, o.ve
    /* renamed from: ȃ */
    public final short mo1099() {
        return pg.BC_RESOURCEACK.f4538;
    }

    private vq(EnumC0119 enumC0119, int i, int i2, String str) {
        this.f5414 = enumC0119;
        this.f5411 = i;
        this.f5412 = i2;
        this.f5413 = str.toCharArray();
    }

    public vq() {
    }
}
