package com.roworkshop.andro;

import org.apache.http.message.TokenParser;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class Quantize32 {

    /* renamed from: 櫯, reason: contains not printable characters */
    static int[] f9;

    /* renamed from: 鷭, reason: contains not printable characters */
    static int[] f10 = new int[511];

    static {
        for (int i = 0; i < f10.length; i++) {
            f10[i] = (i - 255) * (i - 255);
        }
        f9 = new int[9];
        for (int i2 = 0; i2 < 9; i2++) {
            f9[i2] = 1 << (15 - i2);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static int[] m128(int[] iArr, int i, int i2) {
        C0001 c0001 = new C0001(iArr, i, i2);
        int[] iArr2 = c0001.f17;
        int i3 = c0001.f18;
        int length = iArr2.length / i3;
        int i4 = i3;
        while (true) {
            int i5 = i4;
            i4--;
            if (i5 <= 0) {
                break;
            }
            int i6 = length;
            while (true) {
                int i7 = i6;
                i6--;
                if (i7 <= 0) {
                    break;
                }
                int i8 = iArr2[(i6 * i3) + i4];
                int i9 = (i8 >> 24) & 255;
                int i10 = (i8 >> 16) & 255;
                int i11 = (i8 >> 8) & 255;
                int i12 = (i8 >> 0) & 255;
                if (c0001.f14 > 266817) {
                    c0001.f11.m132();
                    c0001.f12--;
                }
                C0001.C0002 c0002 = c0001.f11;
                for (int i13 = 1; i13 <= c0001.f12; i13++) {
                    int i14 = ((i10 > c0002.f22 ? 1 : 0) << 0) | ((i11 > c0002.f27 ? 1 : 0) << 1) | ((i12 > c0002.f30 ? 1 : 0) << 2) | ((i9 > c0002.f21 ? 1 : 0) << 3);
                    if (c0002.f26[i14] == null) {
                        new C0001.C0002(c0002, i14, i13);
                    }
                    c0002 = c0002.f26[i14];
                    c0002.f25 += f9[i13];
                }
                c0002.f23++;
                c0002.f33 += i9;
                c0002.f29 += i10;
                c0002.f34 += i11;
                c0002.f28 += i12;
            }
        }
        long jM131 = 1;
        while (c0001.f13 > c0001.f16) {
            c0001.f13 = 0;
            jM131 = c0001.f11.m131(jM131, Long.MAX_VALUE);
        }
        c0001.f15 = new int[c0001.f13];
        c0001.f13 = 0;
        c0001.f11.m130();
        int[] iArr3 = c0001.f17;
        int i15 = c0001.f18;
        int length2 = iArr3.length / i15;
        new C0001.Cif();
        int i16 = i15;
        while (true) {
            int i17 = i16;
            i16--;
            if (i17 <= 0) {
                return c0001.f15;
            }
            int i18 = length2;
            while (true) {
                int i19 = i18;
                i18--;
                if (i19 <= 0) {
                    break;
                }
                int i20 = iArr3[(i18 * i15) + i16];
                int i21 = (i20 >> 24) & 255;
                int i22 = (i20 >> 16) & 255;
                int i23 = (i20 >> 8) & 255;
                int i24 = (i20 >> 0) & 255;
                C0001.C0002 c00022 = c0001.f11;
                while (true) {
                    int i25 = ((i22 > c00022.f22 ? 1 : 0) << 0) | ((i23 > c00022.f27 ? 1 : 0) << 1) | ((i24 > c00022.f30 ? 1 : 0) << 2) | ((i21 > c00022.f21 ? 1 : 0) << 3);
                    if (c00022.f26[i25] != null) {
                        c00022 = c00022.f26[i25];
                    }
                }
                iArr3[(i18 * i15) + i16] = c00022.f31;
            }
        }
    }

    /* renamed from: com.roworkshop.andro.Quantize32$鷭, reason: contains not printable characters */
    static class C0001 {

        /* renamed from: Ą, reason: contains not printable characters */
        C0002 f11;

        /* renamed from: ą, reason: contains not printable characters */
        int f12;

        /* renamed from: Ć, reason: contains not printable characters */
        int f13;

        /* renamed from: ć, reason: contains not printable characters */
        int f14;

        /* renamed from: ȃ, reason: contains not printable characters */
        int[] f15;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f16;

        /* renamed from: 櫯, reason: contains not printable characters */
        int[] f17;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f18;

        C0001(int[] iArr, int i, int i2) {
            this.f18 = i;
            this.f17 = iArr;
            this.f16 = i2;
            int i3 = i2;
            this.f12 = 1;
            while (i3 != 0) {
                i3 /= 4;
                this.f12++;
            }
            if (this.f12 > 1) {
                this.f12--;
            }
            if (this.f12 > 8) {
                this.f12 = 8;
            } else if (this.f12 < 2) {
                this.f12 = 2;
            }
            this.f11 = new C0002(this);
        }

        /* renamed from: com.roworkshop.andro.Quantize32$鷭$if, reason: invalid class name */
        static class Cif {
            Cif() {
            }
        }

        /* renamed from: com.roworkshop.andro.Quantize32$鷭$鷭, reason: contains not printable characters */
        static class C0002 {

            /* renamed from: Ą, reason: contains not printable characters */
            int f19;

            /* renamed from: ą, reason: contains not printable characters */
            int f20;

            /* renamed from: Ć, reason: contains not printable characters */
            int f21;

            /* renamed from: ć, reason: contains not printable characters */
            int f22;

            /* renamed from: ċ, reason: contains not printable characters */
            int f23;

            /* renamed from: ȃ, reason: contains not printable characters */
            int f24;

            /* renamed from: Ȋ, reason: contains not printable characters */
            long f25;

            /* renamed from: ˮ͈, reason: contains not printable characters */
            C0002[] f26;

            /* renamed from: ˮ͍, reason: contains not printable characters */
            int f27;

            /* renamed from: ܕ, reason: contains not printable characters */
            int f28;

            /* renamed from: 䒧, reason: contains not printable characters */
            int f29;

            /* renamed from: 岱, reason: contains not printable characters */
            int f30;

            /* renamed from: 庸, reason: contains not printable characters */
            int f31;

            /* renamed from: 櫯, reason: contains not printable characters */
            C0002 f32;

            /* renamed from: 纫, reason: contains not printable characters */
            int f33;

            /* renamed from: 躆, reason: contains not printable characters */
            int f34;

            /* renamed from: 鷭, reason: contains not printable characters */
            C0001 f35;

            C0002(C0001 c0001) {
                this.f35 = c0001;
                this.f32 = this;
                this.f26 = new C0002[16];
                this.f19 = 0;
                this.f20 = 0;
                this.f25 = Long.MAX_VALUE;
                this.f22 = 128;
                this.f27 = 128;
                this.f30 = 128;
                this.f21 = 128;
            }

            C0002(C0002 c0002, int i, int i2) {
                this.f35 = c0002.f35;
                this.f32 = c0002;
                this.f26 = new C0002[16];
                this.f19 = i;
                this.f20 = i2;
                this.f35.f14++;
                if (i2 == this.f35.f12) {
                    this.f35.f13++;
                }
                c0002.f24++;
                c0002.f26[i] = this;
                int i3 = (1 << (8 - i2)) >> 1;
                this.f22 = c0002.f22 + ((i & 1) > 0 ? i3 : -i3);
                this.f27 = c0002.f27 + ((i & 2) > 0 ? i3 : -i3);
                this.f30 = c0002.f30 + ((i & 4) > 0 ? i3 : -i3);
                this.f21 = c0002.f21 + ((i & 8) > 0 ? i3 : -i3);
            }

            /* renamed from: ˮ͈, reason: contains not printable characters */
            private void m129() {
                C0002 c0002 = this.f32;
                c0002.f24--;
                this.f32.f23 += this.f23;
                this.f32.f33 += this.f33;
                this.f32.f29 += this.f29;
                this.f32.f34 += this.f34;
                this.f32.f28 += this.f28;
                this.f32.f26[this.f19] = null;
                C0001 c0001 = this.f35;
                c0001.f14--;
                this.f35 = null;
                this.f32 = null;
            }

            /* renamed from: 鷭, reason: contains not printable characters */
            final void m132() {
                if (this.f24 != 0) {
                    for (int i = 0; i < this.f26.length; i++) {
                        if (this.f26[i] != null) {
                            this.f26[i].m132();
                        }
                    }
                }
                if (this.f20 == this.f35.f12) {
                    m129();
                }
            }

            /* renamed from: 鷭, reason: contains not printable characters */
            final long m131(long j, long j2) {
                if (this.f24 != 0) {
                    for (int i = 0; i < this.f26.length; i++) {
                        if (this.f26[i] != null) {
                            j2 = this.f26[i].m131(j, j2);
                        }
                    }
                }
                if (this.f25 <= j) {
                    m129();
                    return j2;
                }
                if (this.f23 != 0) {
                    this.f35.f13++;
                }
                if (this.f25 < j2) {
                    return this.f25;
                }
                return j2;
            }

            /* renamed from: 櫯, reason: contains not printable characters */
            final void m130() {
                if (this.f24 != 0) {
                    for (int i = 0; i < this.f26.length; i++) {
                        if (this.f26[i] != null) {
                            this.f26[i].m130();
                        }
                    }
                }
                if (this.f23 != 0) {
                    this.f35.f15[this.f35.f13] = ((((this.f33 + (this.f23 >> 1)) / this.f23) & 255) << 24) | ((((this.f29 + (this.f23 >> 1)) / this.f23) & 255) << 16) | ((((this.f34 + (this.f23 >> 1)) / this.f23) & 255) << 8) | ((((this.f28 + (this.f23 >> 1)) / this.f23) & 255) << 0);
                    C0001 c0001 = this.f35;
                    int i2 = c0001.f13;
                    c0001.f13 = i2 + 1;
                    this.f31 = i2;
                }
            }

            public final String toString() {
                StringBuffer stringBuffer = new StringBuffer();
                if (this.f32 == this) {
                    stringBuffer.append("root");
                } else {
                    stringBuffer.append("node");
                }
                stringBuffer.append(TokenParser.SP);
                stringBuffer.append(this.f20);
                stringBuffer.append(" [");
                stringBuffer.append(this.f21);
                stringBuffer.append(',');
                stringBuffer.append(this.f22);
                stringBuffer.append(',');
                stringBuffer.append(this.f27);
                stringBuffer.append(',');
                stringBuffer.append(this.f30);
                stringBuffer.append(']');
                return new String(stringBuffer);
            }
        }
    }
}
