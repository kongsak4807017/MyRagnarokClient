package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum mx {
    ATTACK_ONCE(0),
    ATTACK_CONTINUOUS(7),
    SIT(2),
    STAND(3);


    /* renamed from: Ą, reason: contains not printable characters */
    int f2210;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static mx[] valuesCustom() {
        mx[] mxVarArrValuesCustom = values();
        int length = mxVarArrValuesCustom.length;
        mx[] mxVarArr = new mx[length];
        System.arraycopy(mxVarArrValuesCustom, 0, mxVarArr, 0, length);
        return mxVarArr;
    }

    mx(int i) {
        this.f2210 = i;
    }
}
