package o;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class pf {

    /* renamed from: ċ, reason: contains not printable characters */
    static final int[] f4406 = {36, 97, 32, 36, 32, 97, 52, 65, 0, 24, 32, 52, 56, 56, 56, 56, 56, 36, 36, 52, 2, 152, 152, 152, 164, 0, 0, 0, 2, 128, 2, 1, 1, 0, 33};

    /* renamed from: Ą, reason: contains not printable characters */
    public int f4407;

    /* renamed from: ą, reason: contains not printable characters */
    public int f4408;

    /* renamed from: Ć, reason: contains not printable characters */
    public int f4409;

    /* renamed from: ć, reason: contains not printable characters */
    public int f4410;

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f4411;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public int f4412;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public int f4413;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public int f4414;

    /* renamed from: 岱, reason: contains not printable characters */
    public int f4415;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f4416;

    /* renamed from: 鷭, reason: contains not printable characters */
    public int f4417;

    /* renamed from: o.pf$Ą, reason: contains not printable characters */
    enum EnumC0067 {
        MOVE,
        LOADK,
        LOADBOOL,
        LOADNIL,
        GETUPVAL,
        GETGLOBAL,
        GETTABLE,
        SETGLOBAL,
        SETUPVAL,
        SETTABLE,
        NEWTABLE,
        SELF,
        ADD,
        SUB,
        MUL,
        DIV,
        POW,
        UNM,
        NOT,
        CONCAT,
        JMP,
        EQ,
        LT,
        LE,
        TEST,
        CALL,
        TAILCALL,
        RETURN,
        FORLOOP,
        TFORLOOP,
        TFORPREP,
        SETLIST,
        SETLISTO,
        CLOSE,
        CLOSURE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0067[] valuesCustom() {
            EnumC0067[] enumC0067ArrValuesCustom = values();
            int length = enumC0067ArrValuesCustom.length;
            EnumC0067[] enumC0067Arr = new EnumC0067[length];
            System.arraycopy(enumC0067ArrValuesCustom, 0, enumC0067Arr, 0, length);
            return enumC0067Arr;
        }
    }

    /* renamed from: o.pf$ˮ͈, reason: contains not printable characters */
    enum EnumC0069 {
        NIL,
        BOOL,
        LIGHTUSERDATA,
        NUMBER,
        STRING,
        TABLE,
        FUNCTION,
        USERDATA,
        THREAD,
        GLOBAL,
        TABLEVALUE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0069[] valuesCustom() {
            EnumC0069[] enumC0069ArrValuesCustom = values();
            int length = enumC0069ArrValuesCustom.length;
            EnumC0069[] enumC0069Arr = new EnumC0069[length];
            System.arraycopy(enumC0069ArrValuesCustom, 0, enumC0069Arr, 0, length);
            return enumC0069Arr;
        }
    }

    /* renamed from: o.pf$櫯, reason: contains not printable characters */
    enum EnumC0070 {
        GLOBAL;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0070[] valuesCustom() {
            EnumC0070[] enumC0070ArrValuesCustom = values();
            int length = enumC0070ArrValuesCustom.length;
            EnumC0070[] enumC0070Arr = new EnumC0070[length];
            System.arraycopy(enumC0070ArrValuesCustom, 0, enumC0070Arr, 0, length);
            return enumC0070Arr;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static boolean m1004(byte[] bArr) {
        if (bArr[0] != 27 || bArr[1] != 76 || bArr[2] != 117 || bArr[3] != 97) {
            return false;
        }
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static String m1003(ByteBuffer byteBuffer) {
        byte[] bArrM1002 = m1002(byteBuffer);
        if (bArrM1002 == null) {
            return "";
        }
        try {
            return Charset.forName("EUC-KR").newDecoder().decode(ByteBuffer.wrap(bArrM1002)).toString();
        } catch (CharacterCodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: 櫯, reason: contains not printable characters */
    public static byte[] m1002(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] == 0) {
                return Arrays.copyOf(bArr, i2);
            }
        }
        return bArr;
    }

    /* renamed from: o.pf$if, reason: invalid class name */
    public class Cif {

        /* renamed from: 䒧, reason: contains not printable characters */
        private static /* synthetic */ int[] f4418;

        /* renamed from: Ą, reason: contains not printable characters */
        byte f4419;

        /* renamed from: ą, reason: contains not printable characters */
        byte f4420;

        /* renamed from: Ć, reason: contains not printable characters */
        Integer[] f4421;

        /* renamed from: ć, reason: contains not printable characters */
        String[] f4422;

        /* renamed from: ċ, reason: contains not printable characters */
        C0065if[] f4423;

        /* renamed from: ȃ, reason: contains not printable characters */
        byte f4424;

        /* renamed from: Ȋ, reason: contains not printable characters */
        Cif[] f4425;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        byte f4426;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        C0066[] f4427;

        /* renamed from: 岱, reason: contains not printable characters */
        C0071[] f4428;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f4429;

        /* renamed from: 鷭, reason: contains not printable characters */
        byte[] f4431;

        /* renamed from: 櫯, reason: contains not printable characters */
        private static /* synthetic */ int[] m1008() {
            int[] iArr = f4418;
            if (iArr != null) {
                return iArr;
            }
            int[] iArr2 = new int[EnumC0067.valuesCustom().length];
            try {
                iArr2[EnumC0067.ADD.ordinal()] = 13;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr2[EnumC0067.CALL.ordinal()] = 26;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[EnumC0067.CLOSE.ordinal()] = 34;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC0067.CLOSURE.ordinal()] = 35;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC0067.CONCAT.ordinal()] = 20;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC0067.DIV.ordinal()] = 16;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC0067.EQ.ordinal()] = 22;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC0067.FORLOOP.ordinal()] = 29;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC0067.GETGLOBAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC0067.GETTABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC0067.GETUPVAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC0067.JMP.ordinal()] = 21;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC0067.LE.ordinal()] = 24;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EnumC0067.LOADBOOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EnumC0067.LOADK.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EnumC0067.LOADNIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EnumC0067.LT.ordinal()] = 23;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EnumC0067.MOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[EnumC0067.MUL.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[EnumC0067.NEWTABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[EnumC0067.NOT.ordinal()] = 19;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[EnumC0067.POW.ordinal()] = 17;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[EnumC0067.RETURN.ordinal()] = 28;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[EnumC0067.SELF.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[EnumC0067.SETGLOBAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[EnumC0067.SETLIST.ordinal()] = 32;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[EnumC0067.SETLISTO.ordinal()] = 33;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[EnumC0067.SETTABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[EnumC0067.SETUPVAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[EnumC0067.SUB.ordinal()] = 14;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[EnumC0067.TAILCALL.ordinal()] = 27;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[EnumC0067.TEST.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[EnumC0067.TFORLOOP.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[EnumC0067.TFORPREP.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[EnumC0067.UNM.ordinal()] = 18;
            } catch (NoSuchFieldError unused35) {
            }
            f4418 = iArr2;
            return iArr2;
        }

        public Cif(ByteBuffer byteBuffer, byte[] bArr) {
            this.f4431 = pf.m1002(byteBuffer);
            if (this.f4431 == null) {
                this.f4431 = bArr;
            }
            this.f4429 = byteBuffer.getInt();
            this.f4426 = byteBuffer.get();
            this.f4424 = byteBuffer.get();
            this.f4419 = byteBuffer.get();
            this.f4420 = byteBuffer.get();
            this.f4421 = m1010(byteBuffer);
            this.f4427 = m1009(byteBuffer);
            this.f4422 = m1007(byteBuffer);
            this.f4428 = m1006(byteBuffer);
            this.f4423 = m1005(byteBuffer);
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        private static Integer[] m1010(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            Integer[] numArr = new Integer[i];
            for (int i2 = 0; i2 < i; i2++) {
                numArr[i2] = new Integer(byteBuffer.getInt());
            }
            return numArr;
        }

        /* renamed from: o.pf$if$鷭, reason: contains not printable characters */
        class C0066 {

            /* renamed from: ˮ͈, reason: contains not printable characters */
            int f4444;

            /* renamed from: 櫯, reason: contains not printable characters */
            int f4445;

            /* renamed from: 鷭, reason: contains not printable characters */
            String f4446;

            C0066(String str, int i, int i2) {
                this.f4446 = str;
                this.f4445 = i;
                this.f4444 = i2;
            }
        }

        /* renamed from: 櫯, reason: contains not printable characters */
        private final C0066[] m1009(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            C0066[] c0066Arr = new C0066[i];
            for (int i2 = 0; i2 < i; i2++) {
                c0066Arr[i2] = new C0066(pf.m1003(byteBuffer), byteBuffer.getInt(), byteBuffer.getInt());
            }
            return c0066Arr;
        }

        /* renamed from: ˮ͈, reason: contains not printable characters */
        private final String[] m1007(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            if (i != 0 && i != (this.f4426 & 255)) {
                throw new RuntimeException("Lua says this is not good :( Bad nupvalues!\n");
            }
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                strArr[i2] = pf.m1003(byteBuffer);
            }
            return strArr;
        }

        /* renamed from: ȃ, reason: contains not printable characters */
        private final C0071[] m1006(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            C0071[] c0071Arr = new C0071[i];
            for (int i2 = 0; i2 < i; i2++) {
                C0071 c0071 = new C0071(pf.this, null);
                byte b = byteBuffer.get();
                c0071.f4508 = EnumC0069.valuesCustom()[b];
                switch (b) {
                    case 0:
                        c0071.f4504 = null;
                        break;
                    case 1:
                    case 2:
                    default:
                        c0071.f4504 = null;
                        break;
                    case 3:
                        c0071.f4504 = Double.valueOf(byteBuffer.getDouble());
                        break;
                    case 4:
                        c0071.f4504 = pf.m1002(byteBuffer);
                        break;
                }
                c0071Arr[i2] = c0071;
            }
            int i3 = byteBuffer.getInt();
            if (i3 > 0) {
                this.f4425 = new Cif[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f4425[i4] = pf.this.new Cif(byteBuffer, this.f4431);
                }
            }
            return c0071Arr;
        }

        /* renamed from: o.pf$if$if, reason: invalid class name and collision with other inner class name */
        class C0065if {

            /* renamed from: Ą, reason: contains not printable characters */
            int f4432;

            /* renamed from: ą, reason: contains not printable characters */
            int f4433;

            /* renamed from: Ć, reason: contains not printable characters */
            int f4434;

            /* renamed from: ć, reason: contains not printable characters */
            int f4435;

            /* renamed from: ȃ, reason: contains not printable characters */
            EnumC0067 f4436;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            Integer f4438;

            /* renamed from: ˮ͍, reason: contains not printable characters */
            int f4439;

            /* renamed from: 岱, reason: contains not printable characters */
            int f4440;

            /* renamed from: 櫯, reason: contains not printable characters */
            int f4441;

            /* renamed from: 鷭, reason: contains not printable characters */
            int f4442;

            C0065if(ByteBuffer byteBuffer, int i) {
                this.f4442 = byteBuffer.getInt();
                int i2 = this.f4442 & ((((-1) << pf.this.f4407) ^ (-1)) << 0);
                this.f4441 = i2;
                if (i < Cif.this.f4421.length) {
                    this.f4438 = Cif.this.f4421[i];
                }
                this.f4436 = EnumC0067.valuesCustom()[i2];
                this.f4432 = pf.f4406[i2] & 3;
                switch (this.f4432) {
                    case 0:
                        this.f4433 = this.f4442 >> pf.this.f4414;
                        pf pfVar = pf.this;
                        this.f4434 = (this.f4442 >> pfVar.f4409) & ((((-1) << pfVar.f4416) ^ (-1)) << 0);
                        pf pfVar2 = pf.this;
                        this.f4435 = (this.f4442 >> pfVar2.f4408) & ((((-1) << pfVar2.f4417) ^ (-1)) << 0);
                        break;
                    case 1:
                        this.f4433 = this.f4442 >> pf.this.f4414;
                        pf pfVar3 = pf.this;
                        this.f4439 = (this.f4442 >> pfVar3.f4410) & ((((-1) << pfVar3.f4413) ^ (-1)) << 0);
                        break;
                    case 2:
                        this.f4433 = this.f4442 >> pf.this.f4414;
                        pf pfVar4 = pf.this;
                        this.f4440 = ((this.f4442 >> pfVar4.f4410) & ((((-1) << pfVar4.f4413) ^ (-1)) << 0)) - pfVar4.f4412;
                        break;
                }
            }
        }

        /* renamed from: Ą, reason: contains not printable characters */
        private final C0065if[] m1005(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            C0065if[] c0065ifArr = new C0065if[i];
            for (int i2 = 0; i2 < i; i2++) {
                c0065ifArr[i2] = new C0065if(byteBuffer, i2);
            }
            return c0065ifArr;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        public final byte[] m1011() {
            C0071 c0071;
            C0071 c00712;
            om omVar = new om();
            C0068 c0068 = new C0068(pf.this, null);
            boolean z = false;
            for (int i = 0; i < this.f4423.length; i++) {
                C0065if c0065if = this.f4423[i];
                if (z) {
                    z = false;
                } else {
                    switch (m1008()[c0065if.f4436.ordinal()]) {
                        case 2:
                            int i2 = c0065if.f4433;
                            C0071 c00713 = this.f4428[c0065if.f4439];
                            if (i2 < 250) {
                                c0068.f4485[i2] = c00713;
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            C0071 c00714 = new C0071(pf.this, null);
                            c00714.f4508 = EnumC0069.BOOL;
                            c00714.f4504 = Integer.valueOf(c0065if.f4434);
                            int i3 = c0065if.f4433;
                            if (i3 < 250) {
                                c0068.f4485[i3] = c00714;
                            }
                            if (c0065if.f4435 != 0) {
                                z = true;
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            C0071 c00715 = new C0071(pf.this, null);
                            c00715.f4505 = EnumC0070.GLOBAL;
                            c00715.f4509 = (byte[]) this.f4428[c0065if.f4439].f4504;
                            int i4 = c0065if.f4433;
                            if (i4 < 250) {
                                c0068.f4485[i4] = c00715;
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            C0071 c00716 = new C0071(pf.this, null);
                            c00716.f4508 = EnumC0069.TABLEVALUE;
                            c00716.f4501 = c0068.m1015(c0065if.f4434);
                            if (c0065if.f4435 < 250) {
                                int i5 = c0065if.f4435;
                                c00716.f4502 = (byte[]) (i5 < 250 ? c0068.f4485[i5] : null).f4504;
                            } else {
                                c00716.f4502 = (byte[]) this.f4428[c0065if.f4435 - 250].f4504;
                            }
                            int i6 = c0065if.f4433;
                            if (i6 < 250) {
                                c0068.f4485[i6] = c00716;
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            om omVarM921 = omVar.m921((byte[]) this.f4428[c0065if.f4439].f4504).m921(" = ".getBytes());
                            int i7 = c0065if.f4433;
                            omVarM921.m921((i7 >= 250 || c0068.f4485[i7] == null) ? null : c0068.m1016(c0068.f4485[i7]));
                            int i8 = c0065if.f4433;
                            if ((i8 < 250 ? c0068.f4485[i8] : null).f4508 == EnumC0069.TABLE) {
                                omVar.m921(";".getBytes());
                            }
                            omVar.m921("\n".getBytes());
                            break;
                        case 10:
                            int i9 = c0065if.f4433;
                            C0071 c00717 = i9 < 250 ? c0068.f4485[i9] : null;
                            if (c0065if.f4434 < 250) {
                                int i10 = c0065if.f4434;
                                c0071 = i10 < 250 ? c0068.f4485[i10] : null;
                            } else {
                                c0071 = this.f4428[c0065if.f4434 - 250];
                            }
                            if (c0065if.f4435 < 250) {
                                int i11 = c0065if.f4435;
                                c00712 = i11 < 250 ? c0068.f4485[i11] : null;
                            } else {
                                c00712 = this.f4428[c0065if.f4435 - 250];
                            }
                            ((TreeMap) c00717.f4504).put(c0071, c00712);
                            int i12 = c0065if.f4433;
                            C0071 c00718 = c00717;
                            if (i12 < 250) {
                                c0068.f4485[i12] = c00718;
                            }
                            if (c00717.f4505 != null) {
                                omVar.m921(c0068.m1015(c0065if.f4433));
                                omVar.m921(c0068.m1016(c0071));
                                omVar.m921(" = ".getBytes());
                                omVar.m921(c0068.m1016(c00712));
                                omVar.m921("\n".getBytes());
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            C0071 c00719 = new C0071(pf.this, null);
                            c00719.f4508 = EnumC0069.TABLE;
                            c00719.f4504 = new TreeMap();
                            c00719.f4503 = c0065if.f4434;
                            c00719.f4506 = c0065if.f4435;
                            int i13 = c0065if.f4433;
                            if (i13 < 250) {
                                c0068.f4485[i13] = c00719;
                                break;
                            } else {
                                break;
                            }
                        case 28:
                            break;
                        case 32:
                            int i14 = c0065if.f4433;
                            C0071 c007110 = i14 < 250 ? c0068.f4485[i14] : null;
                            c007110.f4500 = true;
                            for (int i15 = 1; i15 <= (c0065if.f4439 % 32) + 1; i15++) {
                                C0071 c007111 = new C0071(pf.this, null);
                                c007111.f4508 = EnumC0069.NUMBER;
                                c007111.f4504 = new Double((-c0065if.f4439) + (c0065if.f4439 % 32) + i15);
                                int i16 = c0065if.f4433 + i15;
                                ((TreeMap) c007110.f4504).put(c007111, i16 < 250 ? c0068.f4485[i16] : null);
                            }
                            int i17 = c0065if.f4433;
                            C0071 c007112 = c007110;
                            if (i17 < 250) {
                                c0068.f4485[i17] = c007112;
                                break;
                            } else {
                                break;
                            }
                        default:
                            new StringBuilder("WARNING: Unparsed opcode ").append(c0065if.f4436).append("!\n");
                            break;
                    }
                }
            }
            return Arrays.copyOf(omVar.f3345.array(), omVar.f3345.position());
        }
    }

    /* renamed from: o.pf$鷭, reason: contains not printable characters */
    class C0071 implements Comparable<C0071> {

        /* renamed from: Ą, reason: contains not printable characters */
        boolean f4500;

        /* renamed from: ą, reason: contains not printable characters */
        byte[] f4501;

        /* renamed from: Ć, reason: contains not printable characters */
        byte[] f4502;

        /* renamed from: ć, reason: contains not printable characters */
        int f4503;

        /* renamed from: ȃ, reason: contains not printable characters */
        Object f4504;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        EnumC0070 f4505;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        int f4506;

        /* renamed from: 櫯, reason: contains not printable characters */
        EnumC0069 f4508;

        /* renamed from: 鷭, reason: contains not printable characters */
        byte[] f4509;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(C0071 c0071) {
            C0071 c00712 = c0071;
            if (this.f4508 != c00712.f4508) {
                return this.f4508.ordinal() - c00712.f4508.ordinal();
            }
            if (this.f4508 == EnumC0069.BOOL) {
                return ((Integer) this.f4504).intValue() - ((Integer) c00712.f4504).intValue();
            }
            if (this.f4508 == EnumC0069.NUMBER) {
                double dDoubleValue = ((Double) this.f4504).doubleValue() - ((Double) c00712.f4504).doubleValue();
                if (dDoubleValue < 0.0d) {
                    return -1;
                }
                if (dDoubleValue == 0.0d || dDoubleValue > 0.0d) {
                }
                return 1;
            }
            if (this.f4508 != EnumC0069.STRING) {
                return 1;
            }
            byte[] bArr = (byte[]) this.f4504;
            byte[] bArr2 = (byte[]) c00712.f4504;
            int length = bArr.length;
            int length2 = bArr2.length;
            int iMax = Math.max(length, length2);
            for (int i = 0; i < iMax; i++) {
                if (length != length2) {
                    if (i == length) {
                        return -1;
                    }
                    if (i == length2) {
                        return 1;
                    }
                }
                int i2 = (bArr[i] & 255) - (bArr2[i] & 255);
                if (i2 != 0) {
                    return i2;
                }
            }
            return 1;
        }

        private C0071() {
        }

        /* synthetic */ C0071(pf pfVar, C0071 c0071) {
            this();
        }
    }

    /* renamed from: o.pf$ȃ, reason: contains not printable characters */
    class C0068 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        private static /* synthetic */ int[] f4483;

        /* renamed from: 鷭, reason: contains not printable characters */
        C0071[] f4485;

        private C0068() {
            this.f4485 = new C0071[250];
        }

        /* synthetic */ C0068(pf pfVar, C0068 c0068) {
            this();
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        private static /* synthetic */ int[] m1014() {
            int[] iArr = f4483;
            if (iArr != null) {
                return iArr;
            }
            int[] iArr2 = new int[EnumC0069.valuesCustom().length];
            try {
                iArr2[EnumC0069.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr2[EnumC0069.FUNCTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[EnumC0069.GLOBAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC0069.LIGHTUSERDATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC0069.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC0069.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC0069.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC0069.TABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC0069.TABLEVALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC0069.THREAD.ordinal()] = 9;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC0069.USERDATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            f4483 = iArr2;
            return iArr2;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final byte[] m1015(int i) {
            if (i < 250) {
                if (this.f4485[i] != null && this.f4485[i].f4509 != null && this.f4485[i].f4509.length > 0) {
                    return this.f4485[i].f4509;
                }
                om omVar = new om();
                byte[] bytes = "a".getBytes();
                omVar.m924(bytes.length);
                omVar.f3345.put(bytes);
                byte[] bytes2 = Integer.valueOf(i).toString().getBytes();
                omVar.m924(bytes2.length);
                omVar.f3345.put(bytes2);
                return Arrays.copyOf(omVar.f3345.array(), omVar.f3345.position());
            }
            return null;
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final byte[] m1016(C0071 c0071) {
            return m1013(c0071, 0, true, true, false);
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        private byte[] m1013(C0071 c0071, int i, boolean z, boolean z2, boolean z3) {
            EnumC0069 enumC0069;
            if (c0071.f4508 != null && c0071.f4505 == EnumC0070.GLOBAL) {
                enumC0069 = EnumC0069.GLOBAL;
            } else {
                enumC0069 = c0071.f4508;
            }
            byte[] bArr = new byte[i];
            Arrays.fill(bArr, (byte) 9);
            om omVar = new om();
            if (!z3) {
                omVar.m924(bArr.length);
                omVar.f3345.put(bArr);
            }
            switch (m1014()[enumC0069.ordinal()]) {
                case 2:
                    if (((Integer) c0071.f4504).intValue() > 0) {
                        byte[] bytes = "true".getBytes();
                        omVar.m924(bytes.length);
                        omVar.f3345.put(bytes);
                        break;
                    } else {
                        byte[] bytes2 = "false".getBytes();
                        omVar.m924(bytes2.length);
                        omVar.f3345.put(bytes2);
                        break;
                    }
                case 3:
                case 7:
                case 8:
                case 9:
                default:
                    new StringBuilder("ERROR: value2string! Unknown type ").append(enumC0069).append("!\n");
                    break;
                case 4:
                    double dDoubleValue = ((Double) c0071.f4504).doubleValue();
                    if (z2) {
                        omVar.m924(1);
                        omVar.f3345.put((byte) 91);
                    }
                    if (dDoubleValue == Math.floor(dDoubleValue)) {
                        byte[] bytes3 = Long.valueOf((int) dDoubleValue).toString().getBytes();
                        omVar.m924(bytes3.length);
                        omVar.f3345.put(bytes3);
                    } else {
                        byte[] bytes4 = Double.valueOf(dDoubleValue).toString().getBytes();
                        omVar.m924(bytes4.length);
                        omVar.f3345.put(bytes4);
                    }
                    if (z2) {
                        omVar.m924(1);
                        omVar.f3345.put((byte) 93);
                        break;
                    }
                    break;
                case 5:
                    if (c0071.f4504 != null) {
                        om omVar2 = new om();
                        byte[] bArr2 = (byte[]) c0071.f4504;
                        omVar2.m924(bArr2.length);
                        omVar2.f3345.put(bArr2);
                        omVar2.m923("\\".getBytes(), "\\\\".getBytes()).m923("\"".getBytes(), "\\\"".getBytes());
                        if (z) {
                            byte[] bytes5 = "\"".getBytes();
                            omVar.m924(bytes5.length);
                            omVar.f3345.put(bytes5);
                            byte[] bArrCopyOf = Arrays.copyOf(omVar2.f3345.array(), omVar2.f3345.position());
                            omVar.m924(bArrCopyOf.length);
                            omVar.f3345.put(bArrCopyOf);
                            byte[] bytes6 = "\"".getBytes();
                            omVar.m924(bytes6.length);
                            omVar.f3345.put(bytes6);
                            break;
                        } else {
                            byte[] bArrCopyOf2 = Arrays.copyOf(omVar2.f3345.array(), omVar2.f3345.position());
                            omVar.m924(bArrCopyOf2.length);
                            omVar.f3345.put(bArrCopyOf2);
                            break;
                        }
                    }
                    break;
                case 6:
                    boolean z4 = false;
                    if (c0071.f4500) {
                        int i2 = 1;
                        z4 = true;
                        Iterator it = ((TreeMap) c0071.f4504).entrySet().iterator();
                        while (it.hasNext()) {
                            C0071 c00712 = (C0071) ((Map.Entry) it.next()).getKey();
                            if (c00712.f4508 != EnumC0069.NUMBER || i2 != ((Double) c00712.f4504).doubleValue()) {
                                z4 = false;
                            } else {
                                i2++;
                            }
                        }
                    }
                    byte[] bytes7 = "{\n".getBytes();
                    omVar.m924(bytes7.length);
                    omVar.f3345.put(bytes7);
                    for (Map.Entry entry : ((TreeMap) c0071.f4504).entrySet()) {
                        if (!z4) {
                            byte[] bArrM1013 = m1013((C0071) entry.getKey(), i + 1, false, true, false);
                            omVar.m924(bArrM1013.length);
                            omVar.f3345.put(bArrM1013);
                            byte[] bytes8 = " = ".getBytes();
                            omVar.m924(bytes8.length);
                            omVar.f3345.put(bytes8);
                        }
                        byte[] bArrM10132 = m1013((C0071) entry.getValue(), i + 1, ((C0071) entry.getValue()).f4508 == EnumC0069.STRING, false, !z4);
                        omVar.m924(bArrM10132.length);
                        omVar.f3345.put(bArrM10132);
                        byte[] bytes9 = ",\n".getBytes();
                        omVar.m924(bytes9.length);
                        omVar.f3345.put(bytes9);
                    }
                    omVar.m924(bArr.length);
                    omVar.f3345.put(bArr);
                    byte[] bytes10 = "}".getBytes();
                    omVar.m924(bytes10.length);
                    omVar.f3345.put(bytes10);
                    break;
                case 10:
                    byte[] bArr3 = c0071.f4509;
                    omVar.m924(bArr3.length);
                    omVar.f3345.put(bArr3);
                    break;
                case 11:
                    if (z2) {
                        omVar.m924(1);
                        omVar.f3345.put((byte) 91);
                        byte[] bArr4 = c0071.f4501;
                        omVar.m924(bArr4.length);
                        omVar.f3345.put(bArr4);
                        omVar.m924(1);
                        omVar.f3345.put((byte) 46);
                        byte[] bArr5 = c0071.f4502;
                        omVar.m924(bArr5.length);
                        omVar.f3345.put(bArr5);
                        omVar.m924(1);
                        omVar.f3345.put((byte) 93);
                        break;
                    } else {
                        byte[] bArr6 = c0071.f4501;
                        omVar.m924(bArr6.length);
                        omVar.f3345.put(bArr6);
                        omVar.m924(1);
                        omVar.f3345.put((byte) 46);
                        byte[] bArr7 = c0071.f4502;
                        omVar.m924(bArr7.length);
                        omVar.f3345.put(bArr7);
                        break;
                    }
            }
            return Arrays.copyOf(omVar.f3345.array(), omVar.f3345.position());
        }
    }
}
