package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nf {
    BASIC,
    MEMBERS,
    POSITIONS,
    SKILLS,
    EXPULSIONS;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nf[] valuesCustom() {
        nf[] nfVarArrValuesCustom = values();
        int length = nfVarArrValuesCustom.length;
        nf[] nfVarArr = new nf[length];
        System.arraycopy(nfVarArrValuesCustom, 0, nfVarArr, 0, length);
        return nfVarArr;
    }
}
