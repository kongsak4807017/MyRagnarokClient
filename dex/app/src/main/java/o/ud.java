package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ud {

    /* renamed from: Ą, reason: contains not printable characters */
    public int f5016;

    /* renamed from: ą, reason: contains not printable characters */
    public int f5017;

    /* renamed from: Ć, reason: contains not printable characters */
    public C0086[] f5018;

    /* renamed from: ć, reason: contains not printable characters */
    public Cif[] f5019;

    /* renamed from: ȃ, reason: contains not printable characters */
    public short f5020;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public byte f5021;

    /* renamed from: 櫯, reason: contains not printable characters */
    public byte f5022;

    /* renamed from: 鷭, reason: contains not printable characters */
    public byte[] f5023 = new byte[2];

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1108(ByteBuffer byteBuffer) {
        byteBuffer.get(this.f5023);
        if (!pa.m978(this.f5023, ow.LATIN).equals("AC")) {
            throw new ux("Invalid ACT file magic");
        }
        this.f5022 = byteBuffer.get();
        this.f5021 = byteBuffer.get();
        int i = byteBuffer.getShort();
        this.f5020 = byteBuffer.getShort();
        this.f5016 = byteBuffer.getInt();
        this.f5017 = byteBuffer.getInt();
        if (i <= 0) {
            throw new ux("Invalid ACT file actions count: " + i);
        }
        this.f5018 = new C0086[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f5018[i2] = new C0086();
            this.f5018[i2].m1110(byteBuffer);
        }
        if (this.f5021 + (this.f5022 / 10.0d) >= 2.1d) {
            int i3 = byteBuffer.getInt();
            if (i3 < 0) {
                throw new ux("Invalid ACT file sounds count: " + i3);
            }
            this.f5019 = new Cif[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                this.f5019[i4] = new Cif();
                byteBuffer.get(this.f5019[i4].f5025);
                Cif cif = this.f5019[i4];
                if (cif.f5025[0] == 97 && cif.f5025[1] == 116 && cif.f5025[2] == 107 && cif.f5025[3] == 0) {
                    for (C0086 c0086 : this.f5018) {
                        int length = c0086.f5028.length - 1;
                        while (length >= 0 && c0086.f5028[length].f5030 != i4) {
                            length--;
                        }
                        if (length > 0) {
                            c0086.f5029 = length;
                        }
                    }
                }
            }
        }
        if (this.f5021 + (this.f5022 / 10.0d) >= 2.2d) {
            for (int i5 = 0; i5 < i; i5++) {
                this.f5018[i5].f5027 = byteBuffer.getFloat();
            }
        }
    }

    /* renamed from: o.ud$鷭, reason: contains not printable characters */
    public class C0086 {

        /* renamed from: 櫯, reason: contains not printable characters */
        public C0087[] f5028;

        /* renamed from: 鷭, reason: contains not printable characters */
        public int f5029 = 0;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float f5027 = 0.0f;

        public C0086() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final void m1110(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new ux("Invalid ACT frames count: " + i);
            }
            this.f5028 = new C0087[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f5028[i2] = new C0087();
                this.f5028[i2].m1111(byteBuffer);
            }
        }

        /* renamed from: o.ud$鷭$鷭, reason: contains not printable characters */
        public class C0087 {

            /* renamed from: Ą, reason: contains not printable characters */
            public int f5030;

            /* renamed from: ą, reason: contains not printable characters */
            public C0088[] f5031;

            /* renamed from: ȃ, reason: contains not printable characters */
            public Cif[] f5033;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            public short[] f5034 = new short[12];

            /* renamed from: 櫯, reason: contains not printable characters */
            public int f5035;

            /* renamed from: 鷭, reason: contains not printable characters */
            public int f5036;

            public C0087() {
            }

            /* renamed from: o.ud$鷭$鷭$鷭, reason: contains not printable characters */
            public class C0088 {

                /* renamed from: ȃ, reason: contains not printable characters */
                public int f5051;

                /* renamed from: ˮ͈, reason: contains not printable characters */
                public int f5052;

                /* renamed from: 櫯, reason: contains not printable characters */
                public int f5053;

                /* renamed from: 鷭, reason: contains not printable characters */
                public int f5054;

                public C0088() {
                }
            }

            /* renamed from: 鷭, reason: contains not printable characters */
            final void m1111(ByteBuffer byteBuffer) {
                int i;
                this.f5036 = byteBuffer.getInt();
                this.f5035 = byteBuffer.getInt();
                for (int i2 = 0; i2 < this.f5034.length; i2++) {
                    this.f5034[i2] = byteBuffer.getShort();
                }
                int i3 = byteBuffer.getInt();
                if (i3 < 0) {
                    throw new ux("Invalid ACT layer count: " + i3);
                }
                this.f5033 = new Cif[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    this.f5033[i4] = new Cif();
                    Cif cif = this.f5033[i4];
                    cif.f5049 = byteBuffer.getInt();
                    cif.f5047 = byteBuffer.getInt();
                    cif.f5044 = byteBuffer.getInt();
                    cif.f5042 = byteBuffer.getInt();
                    ud udVar = ud.this;
                    if (udVar.f5021 + (udVar.f5022 / 10.0d) >= 2.0d) {
                        cif.f5037 = byteBuffer.getInt();
                        ud udVar2 = ud.this;
                        if (udVar2.f5021 + (udVar2.f5022 / 10.0d) <= 2.3d) {
                            float f = byteBuffer.getFloat();
                            cif.f5038 = f;
                            cif.f5039 = f;
                        } else {
                            cif.f5038 = byteBuffer.getFloat();
                            cif.f5039 = byteBuffer.getFloat();
                        }
                        cif.f5040 = byteBuffer.getInt();
                        cif.f5045 = byteBuffer.getInt();
                        ud udVar3 = ud.this;
                        if (udVar3.f5021 + (udVar3.f5022 / 10.0d) >= 2.5d) {
                            cif.f5043 = byteBuffer.getInt();
                            cif.f5041 = byteBuffer.getInt();
                            if ((cif.f5043 < 0 || cif.f5041 < 0) && cif.f5044 >= 0) {
                                StringBuilder sbAppend = new StringBuilder("Invalid ACT width / height: ").append(cif.f5043).append("/").append(cif.f5041).append(" version=");
                                ud udVar4 = ud.this;
                                throw new ux(sbAppend.append(udVar4.f5021 + (udVar4.f5022 / 10.0d)).toString());
                            }
                        } else {
                            continue;
                        }
                    }
                }
                ud udVar5 = ud.this;
                if (udVar5.f5021 + (udVar5.f5022 / 10.0d) >= 2.0d) {
                    this.f5030 = byteBuffer.getInt();
                }
                ud udVar6 = ud.this;
                if (udVar6.f5021 + (udVar6.f5022 / 10.0d) >= 2.3d && (i = byteBuffer.getInt()) > 0) {
                    this.f5031 = new C0088[i];
                    for (int i5 = 0; i5 < this.f5031.length; i5++) {
                        this.f5031[i5] = new C0088();
                        this.f5031[i5].f5054 = byteBuffer.getInt();
                        this.f5031[i5].f5053 = byteBuffer.getInt();
                        this.f5031[i5].f5052 = byteBuffer.getInt();
                        this.f5031[i5].f5051 = byteBuffer.getInt();
                    }
                }
            }

            /* renamed from: o.ud$鷭$鷭$if, reason: invalid class name */
            public class Cif {

                /* renamed from: Ą, reason: contains not printable characters */
                public int f5037;

                /* renamed from: ą, reason: contains not printable characters */
                public float f5038;

                /* renamed from: Ć, reason: contains not printable characters */
                public float f5039;

                /* renamed from: ć, reason: contains not printable characters */
                public int f5040;

                /* renamed from: ċ, reason: contains not printable characters */
                public int f5041;

                /* renamed from: ȃ, reason: contains not printable characters */
                public int f5042;

                /* renamed from: Ȋ, reason: contains not printable characters */
                public int f5043;

                /* renamed from: ˮ͈, reason: contains not printable characters */
                public int f5044;

                /* renamed from: ˮ͍, reason: contains not printable characters */
                public int f5045;

                /* renamed from: 岱, reason: contains not printable characters */
                public char[] f5046 = new char[12];

                /* renamed from: 櫯, reason: contains not printable characters */
                public int f5047;

                /* renamed from: 鷭, reason: contains not printable characters */
                public int f5049;

                public Cif() {
                }
            }
        }
    }

    /* renamed from: o.ud$if, reason: invalid class name */
    public class Cif {

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f5025 = new byte[40];

        public Cif() {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1109(byte[] bArr) {
        m1108(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
        m1107();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1107() {
        if (this.f5018 == null) {
            return;
        }
        for (C0086 c0086 : this.f5018) {
            if (c0086 != null) {
                for (C0086.C0087 c0087 : c0086.f5028) {
                    if (c0087 != null) {
                        c0087.f5034 = null;
                        if (c0087.f5033 != null) {
                            for (C0086.C0087.Cif cif : c0087.f5033) {
                                if (cif != null) {
                                    cif.f5046 = null;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
