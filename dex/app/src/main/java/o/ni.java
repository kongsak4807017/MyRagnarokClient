package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum ni {
    NOTHING,
    FREEPVPZONE,
    EVENTPVPZONE,
    AGITZONE,
    PKSERVERZONE,
    PVPSERVERZONE,
    DENYSKILLZONE;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static ni[] valuesCustom() {
        ni[] niVarArrValuesCustom = values();
        int length = niVarArrValuesCustom.length;
        ni[] niVarArr = new ni[length];
        System.arraycopy(niVarArrValuesCustom, 0, niVarArr, 0, length);
        return niVarArr;
    }
}
