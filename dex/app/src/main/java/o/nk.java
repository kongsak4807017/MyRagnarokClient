package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nk {
    NORMAL,
    SKILL,
    REFINE_FAILED,
    MATERIAL_CHANGED,
    MOVED_TO_STORAGE,
    MOVED_TO_CART,
    SOLD,
    DROPPED;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nk[] valuesCustom() {
        nk[] nkVarArrValuesCustom = values();
        int length = nkVarArrValuesCustom.length;
        nk[] nkVarArr = new nk[length];
        System.arraycopy(nkVarArrValuesCustom, 0, nkVarArr, 0, length);
        return nkVarArr;
    }
}
