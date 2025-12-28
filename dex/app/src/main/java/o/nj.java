package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nj {
    VILLAGE,
    VILLAGE_IN,
    FIELD,
    DUNGEON,
    ARENA,
    PENALTY_FREEPKZONE,
    NOPENALTY_FREEPKZONE,
    EVENT_GUILDWAR,
    AGIT,
    DUNGEON2,
    DUNGEON3,
    PKSERVER,
    PVPSERVER,
    DENYSKILL,
    TURBOTRACK,
    JAIL,
    MONSTERTRACK,
    PORINGBATTLE,
    AGIT_SIEGEV15,
    BATTLEFIELD,
    PVP_TOURNAMENT,
    UNUSED;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nj[] valuesCustom() {
        nj[] njVarArrValuesCustom = values();
        int length = njVarArrValuesCustom.length;
        nj[] njVarArr = new nj[length];
        System.arraycopy(njVarArrValuesCustom, 0, njVarArr, 0, length);
        return njVarArr;
    }
}
