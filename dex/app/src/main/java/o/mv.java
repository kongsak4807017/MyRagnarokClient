package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum mv {
    STAND(0, 0),
    WALK(1, 1),
    SIT(2, -1),
    PICK(3, -1),
    BATTLESTANCE(4, -1),
    SHOOT(5, -1),
    TAKEDAMAGE(6, 3),
    STATICDAMAGE(7, -1),
    DEAD(8, 4),
    COOLSTANCE(9, -1),
    ATK1(10, 2),
    ATK2(11, -1),
    CAST(12, 2),
    PERFORMANCE1(-1, 5),
    PERFORMANCE2(-1, 6),
    PERFORMANCE3(-1, 7),
    PERFORMANCE4(-1, 8);


    /* renamed from: đ, reason: contains not printable characters */
    int f2194;

    /* renamed from: Ē, reason: contains not printable characters */
    int f2195;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static mv[] valuesCustom() {
        mv[] mvVarArrValuesCustom = values();
        int length = mvVarArrValuesCustom.length;
        mv[] mvVarArr = new mv[length];
        System.arraycopy(mvVarArrValuesCustom, 0, mvVarArr, 0, length);
        return mvVarArr;
    }

    mv(int i, int i2) {
        this.f2194 = i;
        this.f2195 = i2;
    }
}
