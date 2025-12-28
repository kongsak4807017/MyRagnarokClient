package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum mt {
    SENT(2588),
    DELIVERY_FAILED(2598),
    SENDMAIL_COUNT_EXCEEDED(2604),
    INAPPROPRIATE_ITEMS(2599),
    RECEPIENT_NOT_EXISTS(2600);


    /* renamed from: ą, reason: contains not printable characters */
    int f2171;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static mt[] valuesCustom() {
        mt[] mtVarArrValuesCustom = values();
        int length = mtVarArrValuesCustom.length;
        mt[] mtVarArr = new mt[length];
        System.arraycopy(mtVarArrValuesCustom, 0, mtVarArr, 0, length);
        return mtVarArr;
    }

    mt(int i) {
        this.f2171 = i;
    }
}
