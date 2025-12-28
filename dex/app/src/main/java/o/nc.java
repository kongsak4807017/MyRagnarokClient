package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nc {
    NONE_CMD,
    MOVE_CMD,
    STOP_CMD,
    ATTACK_OBJECT_CMD,
    ATTACK_AREA_CMD,
    PATROL_CMD,
    HOLD_CMD,
    SKILL_OBJECT_CMD,
    SKILL_AREA_CMD,
    FOLLOW_CMD;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nc[] valuesCustom() {
        nc[] ncVarArrValuesCustom = values();
        int length = ncVarArrValuesCustom.length;
        nc[] ncVarArr = new nc[length];
        System.arraycopy(ncVarArrValuesCustom, 0, ncVarArr, 0, length);
        return ncVarArr;
    }
}
