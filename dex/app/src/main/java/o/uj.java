package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class uj {

    /* renamed from: Ą, reason: contains not printable characters */
    public C0111[] f5262;

    /* renamed from: ą, reason: contains not printable characters */
    public Cif[] f5263;

    /* renamed from: Ć, reason: contains not printable characters */
    public ot[] f5264;

    /* renamed from: ȃ, reason: contains not printable characters */
    public short f5265;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public short f5266;

    /* renamed from: 櫯, reason: contains not printable characters */
    public short f5267;

    /* renamed from: 鷭, reason: contains not printable characters */
    public byte[] f5268;

    /* renamed from: o.uj$鷭, reason: contains not printable characters */
    public class C0111 {

        /* renamed from: ȃ, reason: contains not printable characters */
        public byte[] f5274;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public int f5275;

        /* renamed from: 櫯, reason: contains not printable characters */
        public short f5276;

        /* renamed from: 鷭, reason: contains not printable characters */
        public short f5277;

        public C0111(ByteBuffer byteBuffer) {
            this.f5277 = byteBuffer.getShort();
            this.f5276 = byteBuffer.getShort();
            if (this.f5277 <= 0 || this.f5276 < 0) {
                this.f5277 = (short) 1;
                this.f5276 = (short) 1;
                this.f5275 = 1;
                this.f5274 = new byte[1];
                return;
            }
            if (uj.this.f5267 >= 513) {
                this.f5275 = pa.m968(byteBuffer.getShort());
            } else {
                this.f5275 = this.f5277 * this.f5276;
            }
            if (this.f5275 <= 0) {
                throw new uu("Invalid SPR frame length: " + this.f5275);
            }
            this.f5274 = new byte[this.f5275];
            byteBuffer.get(this.f5274);
            if (uj.this.f5267 >= 513) {
                byte[] bArr = new byte[this.f5277 * this.f5276];
                int i = 0;
                int i2 = 0;
                while (i2 < this.f5275 && i < bArr.length) {
                    if (this.f5274[i2] != 0 || (i2 + 1 < this.f5275 && this.f5274[i2 + 1] == 0)) {
                        bArr[i] = this.f5274[i2];
                        i++;
                    } else if (i2 != this.f5275 - 1) {
                        int i3 = this.f5274[i2 + 1] & 255;
                        for (int i4 = 0; i4 < i3 && i < bArr.length; i4++) {
                            bArr[i] = 0;
                            i++;
                        }
                        i2++;
                    }
                    i2++;
                }
                this.f5274 = bArr;
                this.f5275 = (short) bArr.length;
            }
        }
    }

    /* renamed from: o.uj$if, reason: invalid class name */
    public class Cif {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public byte[] f5270;

        /* renamed from: 櫯, reason: contains not printable characters */
        public short f5271;

        /* renamed from: 鷭, reason: contains not printable characters */
        public short f5272;

        public Cif(C1006 c1006) {
            uj.this = c1006;
        }

        public Cif(ByteBuffer byteBuffer) {
            this.f5272 = byteBuffer.getShort();
            this.f5271 = byteBuffer.getShort();
            int i = this.f5272 * this.f5271 * 4;
            if (i <= 0) {
                throw new uu("Invalid SPR rgba frame length: " + i);
            }
            this.f5270 = new byte[i];
            byteBuffer.get(this.f5270);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m1125(ot[] otVarArr) {
        int[] iArr = {0, 0, 0, 128, 0, 0, 0, 128, 0, 128, 128, 0, 0, 0, 128, 128, 0, 128, 0, 128, 128, 192, 192, 192, 192, 220, 192, 166, 202, 240};
        int[] iArr2 = {255, 251, 240, 160, 160, 164, 128, 128, 128, 255, 0, 0, 0, 255, 0, 255, 255, 0, 0, 0, 255, 255, 0, 255, 0, 255, 255, 255, 255, 255};
        for (int i = 0; i < otVarArr.length; i++) {
            otVarArr[i] = new ot();
        }
        for (int i2 = 0; i2 < 10; i2++) {
            otVarArr[i2].f3375 = (byte) iArr[(i2 * 3) + 0];
            otVarArr[i2].f3374 = (byte) iArr[(i2 * 3) + 1];
            otVarArr[i2].f3373 = (byte) iArr[(i2 * 3) + 2];
            otVarArr[(otVarArr.length - 10) + i2].f3375 = (byte) iArr2[(i2 * 3) + 0];
            otVarArr[(otVarArr.length - 10) + i2].f3374 = (byte) iArr2[(i2 * 3) + 1];
            otVarArr[(otVarArr.length - 10) + i2].f3373 = (byte) iArr2[(i2 * 3) + 2];
        }
        int i3 = 10;
        for (int i4 = 0; i4 <= 255; i4 += 51) {
            for (int i5 = 0; i5 <= 255; i5 += 51) {
                for (int i6 = 0; i6 <= 255; i6 += 51) {
                    otVarArr[i3].f3372 = (byte) 0;
                    otVarArr[i3].f3375 = (byte) i4;
                    otVarArr[i3].f3374 = (byte) i5;
                    otVarArr[i3].f3373 = (byte) i6;
                    i3++;
                }
            }
        }
        otVarArr[0].f3372 = (byte) 0;
        otVarArr[0].f3375 = (byte) -1;
        otVarArr[0].f3374 = (byte) -1;
        otVarArr[0].f3373 = (byte) -1;
        otVarArr[255].f3372 = (byte) 0;
        otVarArr[255].f3375 = (byte) 0;
        otVarArr[255].f3374 = (byte) 0;
        otVarArr[255].f3373 = (byte) 0;
    }

    public uj() {
        this.f5268 = new byte[2];
        this.f5264 = new ot[256];
    }

    private uj(ByteBuffer byteBuffer) {
        this.f5268 = new byte[2];
        this.f5264 = new ot[256];
        byteBuffer.get(this.f5268);
        if (pa.m978(this.f5268, ow.LATIN).compareTo("SP") != 0) {
            throw new uu("Invalid SPR magic");
        }
        this.f5267 = byteBuffer.getShort();
        this.f5266 = byteBuffer.getShort();
        if (this.f5267 >= 512) {
            this.f5265 = byteBuffer.getShort();
        }
        if (this.f5266 <= 0 && this.f5265 <= 0) {
            throw new uu("SPR contains no frames / rgba frames");
        }
        if (this.f5266 < 0 || this.f5266 > 1000) {
            throw new uu("Invalid SPR frames count: " + ((int) this.f5266));
        }
        if (this.f5265 < 0 || this.f5265 > 1000) {
            throw new uu("Invalid SPR rgba frames count: " + ((int) this.f5265));
        }
        if (this.f5266 > 0) {
            this.f5262 = new C0111[this.f5266];
            for (int i = 0; i < this.f5266; i++) {
                this.f5262[i] = new C0111(byteBuffer);
            }
        }
        if (this.f5265 > 0) {
            this.f5263 = new Cif[this.f5265];
            for (int i2 = 0; i2 < this.f5265; i2++) {
                this.f5263[i2] = new Cif(byteBuffer);
            }
        }
        if (this.f5267 >= 257 && this.f5266 > 0) {
            if (byteBuffer.remaining() < 1024) {
                byteBuffer.position(byteBuffer.capacity() - 1024);
            }
            m1124(byteBuffer, this.f5264);
            return;
        }
        m1125(this.f5264);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m1124(ByteBuffer byteBuffer, ot[] otVarArr) {
        for (int i = 0; i < otVarArr.length; i++) {
            otVarArr[i] = new ot();
            otVarArr[i].f3375 = byteBuffer.get();
            otVarArr[i].f3374 = byteBuffer.get();
            otVarArr[i].f3373 = byteBuffer.get();
            otVarArr[i].f3372 = byteBuffer.get();
            if (i == 0) {
                otVarArr[i].f3372 = (byte) 0;
            } else {
                otVarArr[i].f3372 = (byte) -1;
            }
        }
    }

    public uj(byte[] bArr) {
        this(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }
}
