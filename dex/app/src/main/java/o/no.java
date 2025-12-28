package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum no {
    PICKER,
    RANDOM;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static no[] valuesCustom() {
        no[] noVarArrValuesCustom = values();
        int length = noVarArrValuesCustom.length;
        no[] noVarArr = new no[length];
        System.arraycopy(noVarArrValuesCustom, 0, noVarArr, 0, length);
        return noVarArr;
    }
}
