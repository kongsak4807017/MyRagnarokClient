package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class vw extends tw {

    /* renamed from: 鷭, reason: contains not printable characters */
    @vm(m1154 = 1)
    public EnumC0121 f5436;

    @Override // o.tw, o.vg, o.ve
    /* renamed from: ȃ */
    public final short mo1099() {
        return pg.BC_VERIFYPURCHASEACK.f4538;
    }

    /* renamed from: o.vw$鷭, reason: contains not printable characters */
    public enum EnumC0121 {
        SUCCESS("The operation has completed successfully"),
        FAIL_ALREADYACTIVATED("Cash points have already been loaded for this purchase"),
        FAIL_RAGNAROK_SERVER_OFFLINE("Ragnarok server is offline. The purchase will be verified automatically when the server comes online."),
        FAIL_OTHER("Unknown error occured"),
        FAIL_MALFORMED_DATA("Sent data is malformed"),
        FAIL_NO_SUCH_PRODUCT("Product has been removed");


        /* renamed from: Ć, reason: contains not printable characters */
        public String f5444;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0121[] valuesCustom() {
            EnumC0121[] enumC0121ArrValuesCustom = values();
            int length = enumC0121ArrValuesCustom.length;
            EnumC0121[] enumC0121Arr = new EnumC0121[length];
            System.arraycopy(enumC0121ArrValuesCustom, 0, enumC0121Arr, 0, length);
            return enumC0121Arr;
        }

        EnumC0121(String str) {
            this.f5444 = str;
        }
    }

    public vw(EnumC0121 enumC0121) {
        new StringBuilder("Creating ").append(getClass()).append(" result=").append((Object) null);
        pc.m995();
        this.f5436 = null;
    }
}
