package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nl {
    MOTION_STAND,
    MOTION_MOVE,
    MOTION_ATTACK,
    MOTION_DEAD,
    MOTION_ATTACK2;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nl[] valuesCustom() {
        nl[] nlVarArrValuesCustom = values();
        int length = nlVarArrValuesCustom.length;
        nl[] nlVarArr = new nl[length];
        System.arraycopy(nlVarArrValuesCustom, 0, nlVarArr, 0, length);
        return nlVarArr;
    }
}
