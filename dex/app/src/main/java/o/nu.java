package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum nu {
    NUL(0),
    PC(1),
    MOB(2),
    PET(4),
    HOM(8),
    MER(16),
    ITEM(32),
    SKILL(64),
    NPC(128),
    CHAT(256),
    ELEM(512),
    ALL(4095);


    /* renamed from: 纫, reason: contains not printable characters */
    int f3220;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static nu[] valuesCustom() {
        nu[] nuVarArrValuesCustom = values();
        int length = nuVarArrValuesCustom.length;
        nu[] nuVarArr = new nu[length];
        System.arraycopy(nuVarArrValuesCustom, 0, nuVarArr, 0, length);
        return nuVarArr;
    }

    static {
        nu[] nuVarArrValuesCustom = valuesCustom();
        int i = -1;
        for (int i2 = 0; i2 < nuVarArrValuesCustom.length; i2++) {
            if (nuVarArrValuesCustom[i2].f3220 != 0) {
                i = nuVarArrValuesCustom[i2].f3220;
            } else {
                nuVarArrValuesCustom[i2].f3220 = i + 1;
                i++;
            }
        }
    }

    nu(int i) {
        this.f3220 = i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final boolean m899() {
        return this == PC || this == MOB || this == HOM || this == MER || this == ELEM;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static nu m898(oj ojVar) {
        nu[] nuVarArr = {PC, MOB, ITEM, SKILL, CHAT, MOB, NPC, PET, HOM, MER, ELEM};
        if (ojVar.f3335 == -1) {
            cv cvVar = C0358.f6685;
            return lo.m781(ojVar.f3304);
        }
        if (ojVar.f3335 >= 0 && ojVar.f3335 < ((byte) nuVarArr.length)) {
            return nuVarArr[ojVar.f3335];
        }
        return NPC;
    }
}
