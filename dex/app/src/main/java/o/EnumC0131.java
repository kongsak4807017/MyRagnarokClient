package o;

/* renamed from: o.Ą, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum EnumC0131 {
    NEUTRAL,
    WATER,
    EARTH,
    FIRE,
    WIND,
    POISON,
    HOLY,
    DARK,
    GHOST,
    UNDEAD;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0131[] valuesCustom() {
        EnumC0131[] enumC0131ArrValuesCustom = values();
        int length = enumC0131ArrValuesCustom.length;
        EnumC0131[] enumC0131Arr = new EnumC0131[length];
        System.arraycopy(enumC0131ArrValuesCustom, 0, enumC0131Arr, 0, length);
        return enumC0131Arr;
    }
}
