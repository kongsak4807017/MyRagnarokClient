package o;

/* renamed from: o.ܨ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
enum EnumC0431 {
    WARP_CLASS(45),
    INVISIBLE_CLICKABLE(111),
    HIDDEN_WARP_CLASS(139),
    WARP_DEBUG_CLASS(722),
    FLAG_CLASS(722),
    INVISIBLE_CLASS(32767),
    MAX_NPCID(1000),
    MIN_NPCID2(10001),
    MAX_NPCID2(19999);


    /* renamed from: 岱, reason: contains not printable characters */
    int f6846;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0431[] valuesCustom() {
        EnumC0431[] enumC0431ArrValuesCustom = values();
        int length = enumC0431ArrValuesCustom.length;
        EnumC0431[] enumC0431Arr = new EnumC0431[length];
        System.arraycopy(enumC0431ArrValuesCustom, 0, enumC0431Arr, 0, length);
        return enumC0431Arr;
    }

    EnumC0431(int i) {
        this.f6846 = i;
    }
}
