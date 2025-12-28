package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nq {
    ATTACK,
    ITEMPICKUP,
    SIT,
    STAND,
    ATTACK_NOMOTION,
    SPLASH,
    SKILL,
    ATTACK_REPEAT,
    ATTACK_MULTIPLE,
    ATTACK_MULTIPLE_NOMOTION,
    ATTACK_CRITICAL,
    ATTACK_LUCKY,
    TOUCHSKILL,
    MULTI_HIT_CRITICAL;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nq[] valuesCustom() {
        nq[] nqVarArrValuesCustom = values();
        int length = nqVarArrValuesCustom.length;
        nq[] nqVarArr = new nq[length];
        System.arraycopy(nqVarArrValuesCustom, 0, nqVarArr, 0, length);
        return nqVarArr;
    }
}
