package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nh {
    NONE,
    PREPARING,
    READY,
    UNLOADING,
    UNLOADED;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nh[] valuesCustom() {
        nh[] nhVarArrValuesCustom = values();
        int length = nhVarArrValuesCustom.length;
        nh[] nhVarArr = new nh[length];
        System.arraycopy(nhVarArrValuesCustom, 0, nhVarArr, 0, length);
        return nhVarArr;
    }
}
