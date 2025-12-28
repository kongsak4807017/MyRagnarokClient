package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class uf {

    /* renamed from: Ą, reason: contains not printable characters */
    public C0097[] f5074;

    /* renamed from: ą, reason: contains not printable characters */
    public short[] f5075;

    /* renamed from: Ć, reason: contains not printable characters */
    public int f5076;

    /* renamed from: ć, reason: contains not printable characters */
    public int f5077;

    /* renamed from: ȃ, reason: contains not printable characters */
    public C0091 f5078;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public C0095 f5079;

    /* renamed from: 櫯, reason: contains not printable characters */
    public C0093 f5080;

    /* renamed from: 鷭, reason: contains not printable characters */
    public Cif f5081;

    /* renamed from: o.uf$if, reason: invalid class name */
    public class Cif {

        /* renamed from: Ą, reason: contains not printable characters */
        public float f5082;

        /* renamed from: ȃ, reason: contains not printable characters */
        public int f5084;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public int f5085;

        /* renamed from: 鷭, reason: contains not printable characters */
        public byte[] f5087 = new byte[4];

        /* renamed from: 櫯, reason: contains not printable characters */
        public byte[] f5086 = new byte[2];

        public Cif() {
        }
    }

    /* renamed from: o.uf$ˮ͈, reason: contains not printable characters */
    public class C0093 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public C0094[] f5104;

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f5105;

        /* renamed from: 鷭, reason: contains not printable characters */
        public int f5106;

        public C0093() {
        }

        /* renamed from: o.uf$ˮ͈$鷭, reason: contains not printable characters */
        public class C0094 {

            /* renamed from: 鷭, reason: contains not printable characters */
            public byte[] f5108;

            public C0094() {
            }
        }
    }

    /* renamed from: o.uf$櫯, reason: contains not printable characters */
    public class C0095 {

        /* renamed from: Ą, reason: contains not printable characters */
        public C0096[] f5109;

        /* renamed from: ȃ, reason: contains not printable characters */
        public int f5111;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public int f5112;

        /* renamed from: 櫯, reason: contains not printable characters */
        public int f5113;

        /* renamed from: 鷭, reason: contains not printable characters */
        public int f5114;

        public C0095() {
        }

        /* renamed from: o.uf$櫯$鷭, reason: contains not printable characters */
        public class C0096 {

            /* renamed from: 櫯, reason: contains not printable characters */
            public byte[] f5116;

            /* renamed from: 鷭, reason: contains not printable characters */
            public byte[] f5117;

            public C0096(ByteBuffer byteBuffer) {
                this.f5117 = new byte[64];
                this.f5116 = new byte[192];
                byteBuffer.get(this.f5117);
                byteBuffer.get(this.f5116);
            }

            public C0096(byte b) {
                this.f5117 = new byte[64];
                this.f5116 = new byte[192];
                for (int i = 0; i < this.f5117.length; i++) {
                    this.f5117[i] = -1;
                }
                for (int i2 = 0; i2 < this.f5116.length; i2++) {
                    this.f5116[i2] = -1;
                }
            }
        }
    }

    /* renamed from: o.uf$ȃ, reason: contains not printable characters */
    public class C0091 {

        /* renamed from: 櫯, reason: contains not printable characters */
        public C0092[] f5089;

        /* renamed from: 鷭, reason: contains not printable characters */
        public int f5090;

        public C0091() {
        }

        /* renamed from: o.uf$ȃ$鷭, reason: contains not printable characters */
        public class C0092 {

            /* renamed from: Ą, reason: contains not printable characters */
            public float f5091;

            /* renamed from: ą, reason: contains not printable characters */
            public float f5092;

            /* renamed from: Ć, reason: contains not printable characters */
            public float f5093;

            /* renamed from: ć, reason: contains not printable characters */
            public float f5094;

            /* renamed from: ȃ, reason: contains not printable characters */
            public float f5096;

            /* renamed from: Ȋ, reason: contains not printable characters */
            public int f5097;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            public float f5098;

            /* renamed from: ˮ͍, reason: contains not printable characters */
            public short f5099;

            /* renamed from: 岱, reason: contains not printable characters */
            public short f5100;

            /* renamed from: 櫯, reason: contains not printable characters */
            public float f5101;

            /* renamed from: 鷭, reason: contains not printable characters */
            public float f5102;

            public C0092(ByteBuffer byteBuffer) {
                this.f5102 = byteBuffer.getFloat();
                this.f5101 = byteBuffer.getFloat();
                this.f5098 = byteBuffer.getFloat();
                this.f5096 = byteBuffer.getFloat();
                this.f5091 = byteBuffer.getFloat();
                this.f5092 = byteBuffer.getFloat();
                this.f5093 = byteBuffer.getFloat();
                this.f5094 = byteBuffer.getFloat();
                this.f5099 = byteBuffer.getShort();
                if (this.f5099 < 0) {
                    throw new RuntimeException("Incorrect GND tile texture index: " + ((int) this.f5099));
                }
                this.f5100 = byteBuffer.getShort();
                this.f5097 = byteBuffer.getInt();
            }
        }
    }

    /* renamed from: o.uf$鷭, reason: contains not printable characters */
    public class C0097 {

        /* renamed from: Ą, reason: contains not printable characters */
        public int f5118;

        /* renamed from: ą, reason: contains not printable characters */
        public int f5119;

        /* renamed from: Ć, reason: contains not printable characters */
        public int f5120;

        /* renamed from: ȃ, reason: contains not printable characters */
        public float f5122;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public float f5123;

        /* renamed from: 櫯, reason: contains not printable characters */
        public float f5124;

        /* renamed from: 鷭, reason: contains not printable characters */
        public float f5125;

        public C0097(ByteBuffer byteBuffer) {
            this.f5125 = byteBuffer.getFloat();
            this.f5124 = byteBuffer.getFloat();
            this.f5123 = byteBuffer.getFloat();
            this.f5122 = byteBuffer.getFloat();
            this.f5118 = byteBuffer.getInt();
            this.f5119 = byteBuffer.getInt();
            this.f5120 = byteBuffer.getInt();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m1116(int i, int i2) {
        int i3 = this.f5074[(this.f5081.f5085 * i2) + i].f5118;
        if (i3 < 0) {
            return 0;
        }
        return this.f5078.f5089[i3].f5097;
    }
}
