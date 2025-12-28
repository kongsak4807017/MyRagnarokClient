package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class uh {

    /* renamed from: Ą, reason: contains not printable characters */
    public int f5134;

    /* renamed from: ą, reason: contains not printable characters */
    public byte f5135;

    /* renamed from: ć, reason: contains not printable characters */
    public int f5137;

    /* renamed from: ċ, reason: contains not printable characters */
    public int f5138;

    /* renamed from: ȃ, reason: contains not printable characters */
    public int f5139;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public C0100[] f5140;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public byte f5141;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public C0099[] f5142;

    /* renamed from: ܕ, reason: contains not printable characters */
    public double f5143;

    /* renamed from: 䒧, reason: contains not printable characters */
    public int f5144;

    /* renamed from: 櫯, reason: contains not printable characters */
    public byte f5146;

    /* renamed from: 纫, reason: contains not printable characters */
    public Cif[] f5147;

    /* renamed from: 躆, reason: contains not printable characters */
    public C0098[] f5148;

    /* renamed from: 鷭, reason: contains not printable characters */
    public byte[] f5149 = new byte[4];

    /* renamed from: Ć, reason: contains not printable characters */
    public byte[] f5136 = new byte[16];

    /* renamed from: 岱, reason: contains not printable characters */
    public byte[] f5145 = new byte[40];

    /* renamed from: o.uh$ˮ͈, reason: contains not printable characters */
    public class C0098 {

        /* renamed from: ȃ, reason: contains not printable characters */
        public int f5154;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float[] f5155;

        /* renamed from: 櫯, reason: contains not printable characters */
        public float[] f5156;

        /* renamed from: 鷭, reason: contains not printable characters */
        public float[] f5157;

        public C0098() {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final boolean m1118(ByteBuffer byteBuffer) {
        byteBuffer.get(this.f5149);
        if (pa.m978(this.f5149, ow.LATIN).compareTo("GRSM") != 0) {
            throw new RuntimeException("Invalid RSM magic:" + pa.m978(this.f5149, ow.LATIN));
        }
        this.f5146 = byteBuffer.get();
        this.f5141 = byteBuffer.get();
        this.f5143 = this.f5146 + (this.f5141 / 10.0d);
        this.f5139 = byteBuffer.getInt();
        this.f5134 = byteBuffer.getInt();
        this.f5135 = this.f5143 >= 1.4d ? byteBuffer.get() : (byte) -1;
        byteBuffer.get(this.f5136);
        this.f5137 = byteBuffer.getInt();
        if (this.f5137 <= 0 || this.f5137 > 50) {
            throw new RuntimeException("Invalid RSM textures number: " + this.f5137);
        }
        this.f5142 = new C0099[this.f5137];
        for (int i = 0; i < this.f5137; i++) {
            this.f5142[i] = new C0099();
            byteBuffer.get(this.f5142[i].f5159);
        }
        byteBuffer.get(this.f5145);
        int i2 = byteBuffer.getInt();
        if (i2 <= 0) {
            throw new RuntimeException("Invalid RSM meshes count: " + i2);
        }
        this.f5140 = new C0100[Math.min(i2, 50)];
        for (int i3 = 0; i3 < i2; i3++) {
            C0100 c0100 = new C0100();
            c0100.m1120(byteBuffer);
            if (i3 < 50) {
                this.f5140[i3] = c0100;
            }
        }
        if (this.f5143 >= 1.5d) {
            this.f5138 = byteBuffer.getInt();
            this.f5147 = new Cif[this.f5138];
            for (int i4 = 0; i4 < this.f5138; i4++) {
                this.f5147[i4] = new Cif();
                this.f5147[i4].m1119(byteBuffer);
            }
        }
        this.f5144 = byteBuffer.getInt();
        this.f5148 = new C0098[this.f5144];
        for (int i5 = 0; i5 < this.f5144; i5++) {
            this.f5148[i5] = new C0098();
            this.f5148[i5].f5157 = new float[]{byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat()};
            this.f5148[i5].f5156 = new float[]{byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat()};
            this.f5148[i5].f5155 = new float[]{byteBuffer.getFloat(), byteBuffer.getFloat(), byteBuffer.getFloat()};
            this.f5148[i5].f5154 = this.f5143 >= 1.3d ? byteBuffer.getInt() : 0;
        }
        return true;
    }

    /* renamed from: o.uh$櫯, reason: contains not printable characters */
    public class C0099 {

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f5159 = new byte[40];

        public C0099() {
        }
    }

    /* renamed from: o.uh$鷭, reason: contains not printable characters */
    public class C0100 {

        /* renamed from: Ą, reason: contains not printable characters */
        public float[] f5160;

        /* renamed from: ą, reason: contains not printable characters */
        public float[] f5161;

        /* renamed from: Ć, reason: contains not printable characters */
        public float f5162;

        /* renamed from: ć, reason: contains not printable characters */
        public float[] f5163;

        /* renamed from: ċ, reason: contains not printable characters */
        public C0102[] f5164;

        /* renamed from: Ȋ, reason: contains not printable characters */
        public C0101[] f5166;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public int[] f5167;

        /* renamed from: ˮ͍, reason: contains not printable characters */
        public float[] f5168;

        /* renamed from: 䒧, reason: contains not printable characters */
        public boolean f5169;

        /* renamed from: 岱, reason: contains not printable characters */
        public float[] f5170;

        /* renamed from: 纫, reason: contains not printable characters */
        public Cif[] f5172;

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f5174 = new byte[40];

        /* renamed from: 櫯, reason: contains not printable characters */
        public byte[] f5171 = new byte[40];

        /* renamed from: ȃ, reason: contains not printable characters */
        public float[] f5165 = new float[9];

        public C0100() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final boolean m1120(ByteBuffer byteBuffer) {
            byteBuffer.get(this.f5174);
            byteBuffer.get(this.f5171);
            int i = byteBuffer.getInt();
            if (i < 0 || i > 50) {
                throw new RuntimeException("Invalid RSM textures count: " + i);
            }
            this.f5167 = oy.m951(byteBuffer, i);
            this.f5165 = oy.m948(byteBuffer, this.f5165.length);
            this.f5160 = oy.m948(byteBuffer, 3);
            this.f5161 = oy.m948(byteBuffer, 3);
            this.f5162 = byteBuffer.getFloat();
            this.f5163 = oy.m948(byteBuffer, 3);
            this.f5168 = oy.m948(byteBuffer, 3);
            int i2 = byteBuffer.getInt();
            if (i2 < 0) {
                throw new RuntimeException("Invalid RSM vertices count: " + i2);
            }
            if (i2 * 3 < 0) {
                throw new RuntimeException("Invalid RSM vertices count: " + i2);
            }
            this.f5170 = oy.m948(byteBuffer, i2 * 3);
            int i3 = byteBuffer.getInt();
            if (i3 < 0) {
                throw new RuntimeException("Invalid RSM texcoord sets count: " + i3);
            }
            this.f5166 = new C0101[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                this.f5166[i4] = new C0101(byteBuffer);
            }
            int i5 = byteBuffer.getInt();
            if (i5 < 0) {
                throw new RuntimeException("Invalid RSM faces count: " + i5);
            }
            this.f5164 = new C0102[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                this.f5164[i6] = new C0102(byteBuffer);
            }
            int i7 = byteBuffer.getInt();
            if (i7 < 0) {
                throw new RuntimeException("Invalid RSM rotation frames count: " + i7);
            }
            this.f5172 = new Cif[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                this.f5172[i8] = new Cif(byteBuffer);
            }
            return true;
        }

        /* renamed from: o.uh$鷭$櫯, reason: contains not printable characters */
        public class C0101 {

            /* renamed from: ˮ͈, reason: contains not printable characters */
            public float f5179;

            /* renamed from: 櫯, reason: contains not printable characters */
            public float f5180;

            /* renamed from: 鷭, reason: contains not printable characters */
            public int f5181;

            C0101(ByteBuffer byteBuffer) {
                if (uh.this.f5143 >= 1.2d) {
                    this.f5181 = byteBuffer.getInt();
                } else {
                    this.f5181 = -1;
                }
                this.f5180 = byteBuffer.getFloat();
                this.f5179 = byteBuffer.getFloat();
            }
        }

        /* renamed from: o.uh$鷭$鷭, reason: contains not printable characters */
        public class C0102 {

            /* renamed from: Ą, reason: contains not printable characters */
            public int f5182;

            /* renamed from: ą, reason: contains not printable characters */
            public int f5183;

            /* renamed from: ȃ, reason: contains not printable characters */
            public short f5185;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            public short f5186;

            /* renamed from: 鷭, reason: contains not printable characters */
            public short[] f5188 = new short[3];

            /* renamed from: 櫯, reason: contains not printable characters */
            public short[] f5187 = new short[3];

            C0102(ByteBuffer byteBuffer) {
                oy.m950(byteBuffer, this.f5188);
                oy.m950(byteBuffer, this.f5187);
                this.f5186 = byteBuffer.getShort();
                this.f5185 = byteBuffer.getShort();
                this.f5182 = byteBuffer.getInt();
                if (uh.this.f5143 >= 1.2d) {
                    this.f5183 = byteBuffer.getInt();
                }
            }
        }

        /* renamed from: o.uh$鷭$if, reason: invalid class name */
        public class Cif {

            /* renamed from: 櫯, reason: contains not printable characters */
            float[] f5176 = new float[4];

            /* renamed from: 鷭, reason: contains not printable characters */
            int f5177;

            Cif(ByteBuffer byteBuffer) {
                this.f5177 = byteBuffer.getInt();
                if (this.f5177 < 0) {
                    pc.m997("time < 0");
                }
                oy.m949(byteBuffer, this.f5176);
            }
        }
    }

    /* renamed from: o.uh$if, reason: invalid class name */
    public class Cif {

        /* renamed from: 櫯, reason: contains not printable characters */
        float[] f5151;

        /* renamed from: 鷭, reason: contains not printable characters */
        public int f5152;

        public Cif() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final boolean m1119(ByteBuffer byteBuffer) {
            this.f5152 = byteBuffer.getInt();
            if (this.f5152 < 0) {
                throw new RuntimeException("Invalid RSM posframe ID: " + this.f5152);
            }
            this.f5151 = new float[3];
            for (int i = 0; i < 3; i++) {
                this.f5151[i] = byteBuffer.getFloat();
            }
            return true;
        }
    }
}
