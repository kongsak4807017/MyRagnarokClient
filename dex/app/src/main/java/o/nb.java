package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nb {
    HOMUN_INFORM,
    FEED,
    DELETE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nb[] valuesCustom() {
        nb[] nbVarArrValuesCustom = values();
        int length = nbVarArrValuesCustom.length;
        nb[] nbVarArr = new nb[length];
        System.arraycopy(nbVarArrValuesCustom, 0, nbVarArr, 0, length);
        return nbVarArr;
    }
}
