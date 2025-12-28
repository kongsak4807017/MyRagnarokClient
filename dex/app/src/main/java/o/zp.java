package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public enum zp {
    MainHeader((byte) 115),
    MarkHeader((byte) 114),
    FileHeader((byte) 116),
    CommHeader((byte) 117),
    AvHeader((byte) 118),
    SubHeader((byte) 119),
    ProtectHeader((byte) 120),
    SignHeader((byte) 121),
    NewSubHeader((byte) 122),
    EndArcHeader((byte) 123);


    /* renamed from: Ȋ, reason: contains not printable characters */
    byte f6106;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static zp[] valuesCustom() {
        zp[] zpVarArrValuesCustom = values();
        int length = zpVarArrValuesCustom.length;
        zp[] zpVarArr = new zp[length];
        System.arraycopy(zpVarArrValuesCustom, 0, zpVarArr, 0, length);
        return zpVarArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static zp m1209(byte b) {
        if (MarkHeader.f6106 == b) {
            return MarkHeader;
        }
        if (MainHeader.f6106 == b) {
            return MainHeader;
        }
        if (FileHeader.f6106 == b) {
            return FileHeader;
        }
        if (EndArcHeader.f6106 == b) {
            return EndArcHeader;
        }
        if (NewSubHeader.f6106 == b) {
            return NewSubHeader;
        }
        if (SubHeader.f6106 == b) {
            return SubHeader;
        }
        if (SignHeader.f6106 == b) {
            return SignHeader;
        }
        if (ProtectHeader.f6106 == b) {
            return ProtectHeader;
        }
        if (MarkHeader.f6106 == b) {
            return MarkHeader;
        }
        if (MainHeader.f6106 == b) {
            return MainHeader;
        }
        if (FileHeader.f6106 == b) {
            return FileHeader;
        }
        if (EndArcHeader.f6106 == b) {
            return EndArcHeader;
        }
        if (CommHeader.f6106 == b) {
            return CommHeader;
        }
        if (AvHeader.f6106 == b) {
            return AvHeader;
        }
        return null;
    }

    zp(byte b) {
        this.f6106 = b;
    }
}
