package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public enum zn {
    EA_HEAD(256),
    UO_HEAD(257),
    MAC_HEAD(258),
    BEEA_HEAD(259),
    NTACL_HEAD(260),
    STREAM_HEAD(261);


    /* renamed from: Ć, reason: contains not printable characters */
    short f6089;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static zn[] valuesCustom() {
        zn[] znVarArrValuesCustom = values();
        int length = znVarArrValuesCustom.length;
        zn[] znVarArr = new zn[length];
        System.arraycopy(znVarArrValuesCustom, 0, znVarArr, 0, length);
        return znVarArr;
    }

    zn(short s) {
        this.f6089 = s;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static zn m1207(short s) {
        if (EA_HEAD.f6089 == s) {
            return EA_HEAD;
        }
        if (UO_HEAD.f6089 == s) {
            return UO_HEAD;
        }
        if (MAC_HEAD.f6089 == s) {
            return MAC_HEAD;
        }
        if (BEEA_HEAD.f6089 == s) {
            return BEEA_HEAD;
        }
        if (NTACL_HEAD.f6089 == s) {
            return NTACL_HEAD;
        }
        if (STREAM_HEAD.f6089 == s) {
            return STREAM_HEAD;
        }
        return null;
    }
}
