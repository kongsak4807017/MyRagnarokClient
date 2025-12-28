package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum mr {
    OK(2592),
    FAIL(2593),
    EXCEEED(2594);


    /* renamed from: ȃ, reason: contains not printable characters */
    int f2157;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static mr[] valuesCustom() {
        mr[] mrVarArrValuesCustom = values();
        int length = mrVarArrValuesCustom.length;
        mr[] mrVarArr = new mr[length];
        System.arraycopy(mrVarArrValuesCustom, 0, mrVarArr, 0, length);
        return mrVarArr;
    }

    mr(int i) {
        this.f2157 = i;
    }
}
