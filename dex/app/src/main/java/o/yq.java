package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class yq extends Exception {

    /* renamed from: 鷭, reason: contains not printable characters */
    private EnumC0130 f5983;

    /* renamed from: o.yq$鷭, reason: contains not printable characters */
    public enum EnumC0130 {
        notImplementedYet,
        crcError,
        notRarArchive,
        badRarArchive,
        unkownError,
        headerNotInArchive,
        wrongHeaderType,
        ioError,
        rarEncryptedException;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0130[] valuesCustom() {
            EnumC0130[] enumC0130ArrValuesCustom = values();
            int length = enumC0130ArrValuesCustom.length;
            EnumC0130[] enumC0130Arr = new EnumC0130[length];
            System.arraycopy(enumC0130ArrValuesCustom, 0, enumC0130Arr, 0, length);
            return enumC0130Arr;
        }
    }

    public yq(Exception exc) {
        super(EnumC0130.unkownError.name(), exc);
        this.f5983 = EnumC0130.unkownError;
    }

    public yq(EnumC0130 enumC0130) {
        super(enumC0130.name());
        this.f5983 = enumC0130;
    }
}
