package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public enum aaz {
    VMSF_NONE(0),
    VMSF_E8(1),
    VMSF_E8E9(2),
    VMSF_ITANIUM(3),
    VMSF_RGB(4),
    VMSF_AUDIO(5),
    VMSF_DELTA(6),
    VMSF_UPCASE(7);


    /* renamed from: ˮ͍, reason: contains not printable characters */
    int f313;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static aaz[] valuesCustom() {
        aaz[] aazVarArrValuesCustom = values();
        int length = aazVarArrValuesCustom.length;
        aaz[] aazVarArr = new aaz[length];
        System.arraycopy(aazVarArrValuesCustom, 0, aazVarArr, 0, length);
        return aazVarArr;
    }

    aaz(int i) {
        this.f313 = i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static aaz m276(int i) {
        if (VMSF_NONE.f313 == i) {
            return VMSF_NONE;
        }
        if (VMSF_E8.f313 == i) {
            return VMSF_E8;
        }
        if (VMSF_E8E9.f313 == i) {
            return VMSF_E8E9;
        }
        if (VMSF_ITANIUM.f313 == i) {
            return VMSF_ITANIUM;
        }
        if (VMSF_RGB.f313 == i) {
            return VMSF_RGB;
        }
        if (VMSF_AUDIO.f313 == i) {
            return VMSF_AUDIO;
        }
        if (VMSF_DELTA.f313 == i) {
            return VMSF_DELTA;
        }
        return null;
    }
}
