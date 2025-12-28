package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum mz {
    NORMAL,
    PROTECTED;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static mz[] valuesCustom() {
        mz[] mzVarArrValuesCustom = values();
        int length = mzVarArrValuesCustom.length;
        mz[] mzVarArr = new mz[length];
        System.arraycopy(mzVarArrValuesCustom, 0, mzVarArr, 0, length);
        return mzVarArr;
    }
}
