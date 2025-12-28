package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public enum zf {
    msdos((byte) 0),
    os2((byte) 1),
    win32((byte) 2),
    unix((byte) 3),
    macos((byte) 4),
    beos((byte) 5);


    /* renamed from: Ć, reason: contains not printable characters */
    private byte f6053;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static zf[] valuesCustom() {
        zf[] zfVarArrValuesCustom = values();
        int length = zfVarArrValuesCustom.length;
        zf[] zfVarArr = new zf[length];
        System.arraycopy(zfVarArrValuesCustom, 0, zfVarArr, 0, length);
        return zfVarArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static zf m1201(byte b) {
        if (msdos.f6053 == b) {
            return msdos;
        }
        if (os2.f6053 == b) {
            return os2;
        }
        if (win32.f6053 == b) {
            return win32;
        }
        if (unix.f6053 == b) {
            return unix;
        }
        if (macos.f6053 == b) {
            return macos;
        }
        if (beos.f6053 == b) {
            return beos;
        }
        return null;
    }

    zf(byte b) {
        this.f6053 = b;
    }
}
