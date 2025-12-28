package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nm {
    EACH_TAKE,
    EVEN_SHARE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nm[] valuesCustom() {
        nm[] nmVarArrValuesCustom = values();
        int length = nmVarArrValuesCustom.length;
        nm[] nmVarArr = new nm[length];
        System.arraycopy(nmVarArrValuesCustom, 0, nmVarArr, 0, length);
        return nmVarArr;
    }
}
