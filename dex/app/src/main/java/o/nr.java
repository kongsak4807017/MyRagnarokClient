package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nr {
    BLACKSMITH,
    ALCHEMIST,
    TAEKWON;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nr[] valuesCustom() {
        nr[] nrVarArrValuesCustom = values();
        int length = nrVarArrValuesCustom.length;
        nr[] nrVarArr = new nr[length];
        System.arraycopy(nrVarArrValuesCustom, 0, nrVarArr, 0, length);
        return nrVarArr;
    }
}
