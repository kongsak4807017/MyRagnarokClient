package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class pq {

    /* renamed from: Ą, reason: contains not printable characters */
    protected byte f4880;

    /* renamed from: ą, reason: contains not printable characters */
    protected byte f4881;

    /* renamed from: Ć, reason: contains not printable characters */
    protected byte f4882;

    /* renamed from: ć, reason: contains not printable characters */
    public int f4883;

    /* renamed from: Ĩ, reason: contains not printable characters */
    int f4898;

    /* renamed from: Ī, reason: contains not printable characters */
    protected int[] f4899;

    /* renamed from: ī, reason: contains not printable characters */
    byte[] f4900;

    /* renamed from: ȃ, reason: contains not printable characters */
    protected byte f4904;

    /* renamed from: Ƞ, reason: contains not printable characters */
    public short f4906;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    protected int f4907;

    /* renamed from: ঽ্, reason: contains not printable characters */
    public short f4911;

    /* renamed from: 㱽, reason: contains not printable characters */
    public short f4913;

    /* renamed from: 㵼, reason: contains not printable characters */
    public short f4914;

    /* renamed from: 廅, reason: contains not printable characters */
    public short f4920;

    /* renamed from: 廑, reason: contains not printable characters */
    protected int[] f4921;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f4923;

    /* renamed from: 鷭, reason: contains not printable characters */
    protected int f4927;

    /* renamed from: į, reason: contains not printable characters */
    private final int f4903 = 2049;

    /* renamed from: 瞣, reason: contains not printable characters */
    private final int f4924 = 33;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public int f4908 = -1;

    /* renamed from: 岱, reason: contains not printable characters */
    final int f4917 = 43690;

    /* renamed from: Ȋ, reason: contains not printable characters */
    final int f4905 = 48059;

    /* renamed from: ċ, reason: contains not printable characters */
    public short f4884 = -1;

    /* renamed from: 纫, reason: contains not printable characters */
    public short f4925 = 125;

    /* renamed from: 䒧, reason: contains not printable characters */
    public short f4915 = 150;

    /* renamed from: 躆, reason: contains not printable characters */
    public short f4926 = 1079;

    /* renamed from: ܕ, reason: contains not printable characters */
    public short f4909 = 2108;

    /* renamed from: 庸, reason: contains not printable characters */
    public short f4918 = 1080;

    /* renamed from: đ, reason: contains not printable characters */
    public short f4885 = 631;

    /* renamed from: Ē, reason: contains not printable characters */
    public short f4886 = 688;

    /* renamed from: ē, reason: contains not printable characters */
    public short f4887 = 477;

    /* renamed from: 띥, reason: contains not printable characters */
    public short f4928 = 506;

    /* renamed from: 㥳, reason: contains not printable characters */
    public short f4912 = 636;

    /* renamed from: Ė, reason: contains not printable characters */
    public short f4888 = 2085;

    /* renamed from: ė, reason: contains not printable characters */
    public short f4889 = 2134;

    /* renamed from: Ę, reason: contains not printable characters */
    public short f4890 = 2135;

    /* renamed from: ę, reason: contains not printable characters */
    public short f4891 = 151;

    /* renamed from: 廂, reason: contains not printable characters */
    public short f4919 = 152;

    /* renamed from: 囃, reason: contains not printable characters */
    public short f4916 = 135;

    /* renamed from: ġ, reason: contains not printable characters */
    final int f4892 = 20480;

    /* renamed from: ܨ, reason: contains not printable characters */
    final int f4910 = 20481;

    /* renamed from: ģ, reason: contains not printable characters */
    final int f4893 = 20482;

    /* renamed from: Ĥ, reason: contains not printable characters */
    final int f4894 = 20483;

    /* renamed from: ĥ, reason: contains not printable characters */
    final int f4895 = 99;

    /* renamed from: Ħ, reason: contains not printable characters */
    final int f4896 = 24;

    /* renamed from: ħ, reason: contains not printable characters */
    final int f4897 = 100;

    /* renamed from: Ĭ, reason: contains not printable characters */
    public Cif f4901 = new Cif();

    /* renamed from: 廕, reason: contains not printable characters */
    public Cif f4922 = new Cif();

    /* renamed from: Į, reason: contains not printable characters */
    public Cif f4902 = new Cif();

    /* renamed from: o.pq$鷭, reason: contains not printable characters */
    public enum EnumC0082 {
        BANNED,
        OLD_VERSION,
        DUAL_LOGIN,
        CORUPTED_UID,
        WRONG_LICENSE_ID,
        WRONG_GRF_HASH;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0082[] valuesCustom() {
            EnumC0082[] enumC0082ArrValuesCustom = values();
            int length = enumC0082ArrValuesCustom.length;
            EnumC0082[] enumC0082Arr = new EnumC0082[length];
            System.arraycopy(enumC0082ArrValuesCustom, 0, enumC0082Arr, 0, length);
            return enumC0082Arr;
        }
    }

    /* renamed from: Ą, reason: contains not printable characters */
    abstract byte mo1059(byte b, byte b2);

    /* renamed from: ą, reason: contains not printable characters */
    abstract byte mo1060(byte b, byte b2);

    /* renamed from: ȃ, reason: contains not printable characters */
    abstract byte mo1061(byte b, byte b2);

    /* renamed from: ˮ͈, reason: contains not printable characters */
    abstract byte mo1062(byte b, byte b2);

    /* renamed from: ˮ͈, reason: contains not printable characters */
    abstract void mo1063(Cif cif);

    /* renamed from: 櫯, reason: contains not printable characters */
    abstract byte mo1064(byte b, byte b2);

    /* renamed from: 櫯, reason: contains not printable characters */
    abstract int mo1065();

    /* renamed from: 櫯, reason: contains not printable characters */
    abstract void mo1067(Cif cif);

    /* renamed from: 鷭, reason: contains not printable characters */
    abstract byte mo1068(byte b, byte b2);

    /* renamed from: 鷭, reason: contains not printable characters */
    abstract void mo1074(Cif cif);

    /* renamed from: o.pq$if, reason: invalid class name */
    class Cif {

        /* renamed from: ȃ, reason: contains not printable characters */
        int f4930;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f4931;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f4932;

        /* renamed from: 鷭, reason: contains not printable characters */
        byte[] f4933 = new byte[33];

        Cif() {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    void m1070(int i) {
        this.f4898 = i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    int m1069() {
        int i = (int) ((this.f4898 * 214013) + 2531011);
        this.f4898 = i;
        return (i >> 16) & 32767;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    protected void m1072(int i, int i2, int i3, byte b, byte b2, byte b3, byte b4, int i4, int i5, int[] iArr, int[] iArr2, byte[] bArr) {
        if (this.f4884 == -1) {
            throw new ux();
        }
        this.f4927 = i;
        this.f4923 = i2;
        this.f4907 = i3;
        this.f4904 = b;
        this.f4880 = b2;
        this.f4881 = b3;
        this.f4882 = b4;
        this.f4883 = i4;
        this.f4908 = i5;
        this.f4921 = iArr;
        this.f4899 = iArr2;
        this.f4900 = bArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public void m1071(int i, int i2, int i3) {
        byte b = this.f4881;
        byte bMo1064 = this.f4882;
        Cif cif = this.f4922;
        Cif cif2 = this.f4901;
        Cif cif3 = this.f4902;
        int i4 = this.f4904 & 255;
        cif3.f4932 = i4;
        cif2.f4932 = i4;
        cif.f4932 = i4;
        Cif cif4 = this.f4922;
        Cif cif5 = this.f4901;
        Cif cif6 = this.f4902;
        int i5 = this.f4880 & 255;
        cif6.f4931 = i5;
        cif5.f4931 = i5;
        cif4.f4931 = i5;
        Cif cif7 = this.f4922;
        Cif cif8 = this.f4901;
        this.f4902.f4930 = 0;
        cif8.f4930 = 0;
        cif7.f4930 = 0;
        m1070(this.f4907 ^ i);
        for (int i6 = 0; i6 < 32; i6++) {
            byte bMo1068 = mo1068((byte) (this.f4900[m1069() % 2048] ^ b), bMo1064);
            bMo1064 = mo1064(bMo1068, (byte) (this.f4900[m1069() % 2048] ^ bMo1064));
            b = (byte) ((this.f4900[m1069() % 2048] ^ bMo1064) + bMo1068);
            this.f4922.f4933[i6] = b;
        }
        byte b2 = this.f4881;
        byte bMo1061 = this.f4882;
        m1070(this.f4907 | i2);
        for (int i7 = 0; i7 < 32; i7++) {
            byte bMo1062 = mo1062((byte) (this.f4900[m1069() % 2048] ^ b2), bMo1061);
            bMo1061 = mo1061(bMo1062, (byte) (this.f4900[m1069() % 2048] ^ bMo1061));
            b2 = (byte) ((this.f4900[m1069() % 2048] ^ bMo1061) + bMo1062);
            this.f4901.f4933[i7] = b2;
        }
        byte bMo1065 = this.f4881;
        byte bMo1060 = this.f4882;
        m1070(this.f4907 | i3);
        for (int i8 = 0; i8 < 32; i8++) {
            byte bMo1059 = mo1059((byte) (this.f4900[m1069() % 2048] ^ bMo1065), bMo1060);
            bMo1060 = mo1060(bMo1059, (byte) (this.f4900[m1069() % 2048] ^ bMo1060));
            bMo1065 = (byte) ((mo1065() * (this.f4900[m1069() % 2048] ^ bMo1060)) + bMo1059);
            this.f4902.f4933[i8] = bMo1065;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public void m1075(byte[] bArr, int i, byte[] bArr2, int i2, int i3, Cif cif) {
        for (int i4 = 0; i4 < i3; i4++) {
            cif.f4932 += cif.f4933[cif.f4930 % 32];
            cif.f4932 &= 255;
            mo1074(cif);
            cif.f4931 &= 255;
            byte[] bArr3 = cif.f4933;
            int i5 = cif.f4931 % 32;
            bArr3[i5] = (byte) (bArr3[i5] ^ cif.f4932);
            byte[] bArr4 = cif.f4933;
            int i6 = cif.f4931 % 32;
            bArr4[i6] = (byte) (bArr4[i6] & 255);
            mo1067(cif);
            cif.f4932 &= 255;
            byte[] bArr5 = cif.f4933;
            int i7 = cif.f4930 % 32;
            bArr5[i7] = (byte) (bArr5[i7] ^ cif.f4932);
            byte[] bArr6 = cif.f4933;
            int i8 = cif.f4930 % 32;
            bArr6[i8] = (byte) (bArr6[i8] & 255);
            bArr2[i2 + i4] = (byte) ((bArr[i + i4] ^ cif.f4932) & 255);
            mo1063(cif);
            cif.f4932 &= 255;
            cif.f4931 -= i3 % 255;
            cif.f4931 &= 255;
            cif.f4930++;
            cif.f4930 &= 255;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    protected Cif m1066(int i) {
        if (i == 8192) {
            return this.f4902;
        }
        for (int i2 = 0; i2 < this.f4921.length; i2++) {
            if (i == this.f4921[i2]) {
                return this.f4922;
            }
        }
        for (int i3 = 0; i3 < this.f4899.length; i3++) {
            if (i == this.f4899[i3]) {
                return this.f4901;
            }
        }
        return null;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public void m1073(ByteBuffer byteBuffer, ve veVar, int i) {
        Cif cifM1066 = m1066(i);
        if (cifM1066 == null) {
            return;
        }
        int iPosition = byteBuffer.position();
        byteBuffer.position(iPosition + 2);
        int iMo1040 = veVar.mo1040();
        if (iMo1040 == -1) {
            iMo1040 = byteBuffer.getShort() - 4;
            byteBuffer.position(iPosition + 4);
        } else if (i == this.f4890 || i == this.f4889) {
            byteBuffer.position(iPosition + 4);
            iMo1040 -= 2;
        }
        m1075(byteBuffer.array(), byteBuffer.position(), byteBuffer.array(), byteBuffer.position(), iMo1040, cifM1066);
        byteBuffer.position(iPosition);
    }
}
