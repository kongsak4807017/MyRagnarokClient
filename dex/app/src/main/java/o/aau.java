package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public enum aau {
    VM_OPREG(0),
    VM_OPINT(1),
    VM_OPREGMEM(2),
    VM_OPNONE(3);


    /* renamed from: Ą, reason: contains not printable characters */
    private int f284;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static aau[] valuesCustom() {
        aau[] aauVarArrValuesCustom = values();
        int length = aauVarArrValuesCustom.length;
        aau[] aauVarArr = new aau[length];
        System.arraycopy(aauVarArrValuesCustom, 0, aauVarArr, 0, length);
        return aauVarArr;
    }

    aau(int i) {
        this.f284 = i;
    }
}
