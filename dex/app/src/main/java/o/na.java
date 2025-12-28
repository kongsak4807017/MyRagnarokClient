package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum na {
    LIF(6001),
    AMISTR(6002),
    FILIR(6003),
    VANILMIRTH(6004),
    LIF2(6005),
    AMISTR2(6006),
    FILIR2(6007),
    VANILMIRTH2(6008),
    LIF_H(6009),
    AMISTR_H(6010),
    FILIR_H(6011),
    VANILMIRTH_H(6012),
    LIF_H2(6013),
    AMISTR_H2(6014),
    FILIR_H2(6015),
    VANILMIRTH_H2(6016);


    /* renamed from: 庸, reason: contains not printable characters */
    int f2345;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static na[] valuesCustom() {
        na[] naVarArrValuesCustom = values();
        int length = naVarArrValuesCustom.length;
        na[] naVarArr = new na[length];
        System.arraycopy(naVarArrValuesCustom, 0, naVarArr, 0, length);
        return naVarArr;
    }

    na(int i) {
        this.f2345 = i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static na m874(int i) {
        for (na naVar : valuesCustom()) {
            if (i == naVar.f2345) {
                return naVar;
            }
        }
        return null;
    }
}
