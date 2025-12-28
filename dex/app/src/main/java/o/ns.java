package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public enum ns {
    NULL,
    LOGIN,
    CHAR,
    MAP,
    LOCKER,
    RESOURCE,
    MASTER;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ns[] valuesCustom() {
        ns[] nsVarArrValuesCustom = values();
        int length = nsVarArrValuesCustom.length;
        ns[] nsVarArr = new ns[length];
        System.arraycopy(nsVarArrValuesCustom, 0, nsVarArr, 0, length);
        return nsVarArr;
    }
}
