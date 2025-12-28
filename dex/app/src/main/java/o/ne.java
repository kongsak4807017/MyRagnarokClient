package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum ne {
    NORMAL,
    FIXED_DIR,
    HEAL,
    SP_HEAL,
    CRITICAL;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ne[] valuesCustom() {
        ne[] neVarArrValuesCustom = values();
        int length = neVarArrValuesCustom.length;
        ne[] neVarArr = new ne[length];
        System.arraycopy(neVarArrValuesCustom, 0, neVarArr, 0, length);
        return neVarArr;
    }
}
