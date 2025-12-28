package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum ms {
    SUCCESS(2595),
    OVERWEIGHT(2631),
    ATTACHITEMFAILED(2630),
    OVERAMOUNT(2698),
    ATTACHITEMSFAILED(2700);


    /* renamed from: ą, reason: contains not printable characters */
    int f2164;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ms[] valuesCustom() {
        ms[] msVarArrValuesCustom = values();
        int length = msVarArrValuesCustom.length;
        ms[] msVarArr = new ms[length];
        System.arraycopy(msVarArrValuesCustom, 0, msVarArr, 0, length);
        return msVarArr;
    }

    ms(int i) {
        this.f2164 = i;
    }
}
