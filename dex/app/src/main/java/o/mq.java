package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum mq {
    OK(2589),
    FAILED(2590),
    NOSPACE(2591);


    /* renamed from: ȃ, reason: contains not printable characters */
    int f2152;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static mq[] valuesCustom() {
        mq[] mqVarArrValuesCustom = values();
        int length = mqVarArrValuesCustom.length;
        mq[] mqVarArr = new mq[length];
        System.arraycopy(mqVarArrValuesCustom, 0, mqVarArr, 0, length);
        return mqVarArr;
    }

    mq(int i) {
        this.f2152 = i;
    }
}
