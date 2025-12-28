package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum np {
    LEADER,
    MEMBER;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static np[] valuesCustom() {
        np[] npVarArrValuesCustom = values();
        int length = npVarArrValuesCustom.length;
        np[] npVarArr = new np[length];
        System.arraycopy(npVarArrValuesCustom, 0, npVarArr, 0, length);
        return npVarArr;
    }
}
