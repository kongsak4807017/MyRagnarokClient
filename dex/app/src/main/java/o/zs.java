package o;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.media.TransportMediator;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.MotionEventCompat;
import java.io.IOException;
import java.util.Arrays;
import org.apache.commons.net.telnet.TelnetCommand;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class zs extends aap {

    /* renamed from: Ī, reason: contains not printable characters */
    static int[] f6145;

    /* renamed from: ī, reason: contains not printable characters */
    static int[] f6146;

    /* renamed from: Ĭ, reason: contains not printable characters */
    static int[] f6147;

    /* renamed from: ĸ, reason: contains not printable characters */
    private static int[] f6150;

    /* renamed from: 䲕, reason: contains not printable characters */
    private static int[] f6153;

    /* renamed from: 差, reason: contains not printable characters */
    private static int[] f6155;

    /* renamed from: 廕, reason: contains not printable characters */
    static int[] f6156;

    /* renamed from: 簇, reason: contains not printable characters */
    private static int[] f6159;

    /* renamed from: 齴, reason: contains not printable characters */
    private static int[] f6162;

    /* renamed from: Ą, reason: contains not printable characters */
    protected boolean f6163;

    /* renamed from: ą, reason: contains not printable characters */
    protected boolean f6164;

    /* renamed from: Ć, reason: contains not printable characters */
    protected zq f6165;

    /* renamed from: ć, reason: contains not printable characters */
    protected boolean f6166;

    /* renamed from: ġ, reason: contains not printable characters */
    protected int f6175;

    /* renamed from: ģ, reason: contains not printable characters */
    protected int f6176;

    /* renamed from: Ĥ, reason: contains not printable characters */
    protected int f6177;

    /* renamed from: ĥ, reason: contains not printable characters */
    protected int f6178;

    /* renamed from: Ħ, reason: contains not printable characters */
    protected int f6179;

    /* renamed from: ħ, reason: contains not printable characters */
    protected int f6180;

    /* renamed from: Ĩ, reason: contains not printable characters */
    protected int f6181;

    /* renamed from: ȃ, reason: contains not printable characters */
    protected int f6182;

    /* renamed from: Ȋ, reason: contains not printable characters */
    protected byte[] f6183;

    /* renamed from: Ƞ, reason: contains not printable characters */
    protected int f6184;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    protected int f6185;

    /* renamed from: ܨ, reason: contains not printable characters */
    protected int f6187;

    /* renamed from: ঽ্, reason: contains not printable characters */
    protected int f6188;

    /* renamed from: 㱽, reason: contains not printable characters */
    protected int f6190;

    /* renamed from: 㵼, reason: contains not printable characters */
    protected int f6191;

    /* renamed from: 䒧, reason: contains not printable characters */
    protected int f6192;

    /* renamed from: 囃, reason: contains not printable characters */
    protected int f6193;

    /* renamed from: 岱, reason: contains not printable characters */
    protected long f6194;

    /* renamed from: 廂, reason: contains not printable characters */
    protected int f6196;

    /* renamed from: 廅, reason: contains not printable characters */
    protected int f6197;

    /* renamed from: 廑, reason: contains not printable characters */
    protected int f6198;

    /* renamed from: 纫, reason: contains not printable characters */
    protected int f6199;

    /* renamed from: 躆, reason: contains not printable characters */
    protected int f6200;

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int[] f6160 = {32768, 40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 61952, SupportMenu.USER_MASK};

    /* renamed from: 櫯, reason: contains not printable characters */
    private static int[] f6157 = {0, 0, 0, 2, 3, 5, 7, 11, 16, 20, 24, 32, 32};

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static int[] f6151 = {40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 62016, SupportMenu.USER_MASK};

    /* renamed from: Į, reason: contains not printable characters */
    private static int[] f6148 = {0, 0, 0, 0, 5, 7, 9, 13, 18, 22, 26, 34, 36};

    /* renamed from: į, reason: contains not printable characters */
    private static int[] f6149 = {32768, 49152, 57344, 61952, 61952, 61952, 61952, 61952, SupportMenu.USER_MASK};

    /* renamed from: 瞣, reason: contains not printable characters */
    private static int[] f6158 = {0, 0, 0, 0, 0, 8, 16, 24, 33, 33, 33, 33, 33};

    /* renamed from: 黬, reason: contains not printable characters */
    private static int[] f6161 = {8192, 49152, 57344, 61440, 61952, 61952, 63456, SupportMenu.USER_MASK};

    /* renamed from: 崲, reason: contains not printable characters */
    private static int[] f6154 = {0, 0, 0, 0, 0, 0, 4, 44, 60, 76, 80, 80, TransportMediator.KEYCODE_MEDIA_PAUSE};

    /* renamed from: 䲑, reason: contains not printable characters */
    private static int[] f6152 = {4096, 9216, 32768, 49152, 64000, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK};

    /* renamed from: ċ, reason: contains not printable characters */
    protected int[] f6167 = new int[4];

    /* renamed from: ܕ, reason: contains not printable characters */
    protected int[] f6186 = new int[256];

    /* renamed from: 庸, reason: contains not printable characters */
    protected int[] f6195 = new int[256];

    /* renamed from: đ, reason: contains not printable characters */
    protected int[] f6168 = new int[256];

    /* renamed from: Ē, reason: contains not printable characters */
    protected int[] f6169 = new int[256];

    /* renamed from: ē, reason: contains not printable characters */
    protected int[] f6170 = new int[256];

    /* renamed from: 띥, reason: contains not printable characters */
    protected int[] f6201 = new int[256];

    /* renamed from: 㥳, reason: contains not printable characters */
    protected int[] f6189 = new int[256];

    /* renamed from: Ė, reason: contains not printable characters */
    protected int[] f6171 = new int[256];

    /* renamed from: ė, reason: contains not printable characters */
    protected int[] f6172 = new int[256];

    /* renamed from: Ę, reason: contains not printable characters */
    protected int[] f6173 = new int[256];

    /* renamed from: ę, reason: contains not printable characters */
    protected int[] f6174 = new int[256];

    /* renamed from: 鷭 */
    protected abstract void mo1228(boolean z);

    static {
        int[] iArr = new int[13];
        iArr[6] = 2;
        iArr[7] = 7;
        iArr[8] = 53;
        iArr[9] = 117;
        iArr[10] = 233;
        f6159 = iArr;
        f6162 = new int[]{2048, 9216, 60928, 65152, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK};
        int[] iArr2 = new int[13];
        iArr2[7] = 2;
        iArr2[8] = 16;
        iArr2[9] = 218;
        iArr2[10] = 251;
        f6155 = iArr2;
        f6153 = new int[]{MotionEventCompat.ACTION_POINTER_INDEX_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK, SupportMenu.USER_MASK};
        int[] iArr3 = new int[13];
        iArr3[9] = 255;
        f6150 = iArr3;
        f6145 = new int[]{1, 3, 4, 4, 5, 6, 7, 8, 8, 4, 4, 5, 6, 6, 4, 0};
        f6146 = new int[]{0, 160, 208, 224, 240, TelnetCommand.EL, TelnetCommand.WONT, TelnetCommand.DONT, 255, 192, 128, 144, 152, 156, 176};
        f6147 = new int[]{2, 3, 3, 3, 4, 4, 5, 6, 6, 4, 4, 5, 6, 6, 4, 0};
        f6156 = new int[]{0, 64, 96, 160, 208, 224, 240, TelnetCommand.EL, TelnetCommand.WONT, 192, 128, 144, 152, 156, 176};
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    protected final void m1238(boolean z) throws yq, IOException {
        int i;
        if (this.f6163) {
            this.f6199 = this.f6192;
        } else {
            mo1228(z);
            if (!z) {
                this.f6184 = 0;
                this.f6175 = 0;
                this.f6190 = 0;
                this.f6191 = 0;
                this.f6197 = 0;
                this.f6188 = 0;
                this.f6193 = 13568;
                this.f6180 = 8193;
                this.f6179 = 128;
                this.f6178 = 128;
            }
            this.f6177 = 0;
            this.f6196 = 0;
            this.f6187 = 0;
            this.f6176 = 0;
            this.f6185 = 0;
            m1237();
            if (!z) {
                for (int i2 = 0; i2 < 256; i2++) {
                    int[] iArr = this.f6170;
                    int[] iArr2 = this.f6201;
                    this.f6189[i2] = i2;
                    iArr2[i2] = i2;
                    iArr[i2] = i2;
                    this.f6171[i2] = ((i2 ^ (-1)) + 1) & 255;
                    int[] iArr3 = this.f6186;
                    int i3 = i2 << 8;
                    this.f6168[i2] = i3;
                    iArr3[i2] = i3;
                    this.f6195[i2] = i2;
                    this.f6169[i2] = (((i2 ^ (-1)) + 1) & 255) << 8;
                }
                Arrays.fill(this.f6172, 0);
                Arrays.fill(this.f6173, 0);
                Arrays.fill(this.f6174, 0);
                m1235(this.f6168, this.f6173);
                this.f6199 = 0;
            } else {
                this.f6199 = this.f6192;
            }
            this.f6194--;
        }
        if (this.f6194 >= 0) {
            m1230();
            this.f6177 = 8;
        }
        while (this.f6194 >= 0) {
            this.f6199 &= 4194303;
            if (this.f206 > this.f6185 - 30 && !m1237()) {
                break;
            }
            if (((this.f6192 - this.f6199) & 4194303) < 270 && this.f6192 != this.f6199) {
                m1236();
                if (this.f6163) {
                    return;
                }
            }
            if (this.f6187 != 0) {
                m1231();
            } else {
                int i4 = this.f6177 - 1;
                this.f6177 = i4;
                if (i4 < 0) {
                    m1230();
                    this.f6177 = 7;
                }
                if ((this.f6196 & 128) != 0) {
                    this.f6196 <<= 1;
                    if (this.f6179 > this.f6178) {
                        m1233();
                    } else {
                        m1231();
                    }
                } else {
                    this.f6196 <<= 1;
                    int i5 = this.f6177 - 1;
                    this.f6177 = i5;
                    if (i5 < 0) {
                        m1230();
                        this.f6177 = 7;
                    }
                    if ((this.f6196 & 128) != 0) {
                        this.f6196 <<= 1;
                        if (this.f6179 > this.f6178) {
                            m1231();
                        } else {
                            m1233();
                        }
                    } else {
                        this.f6196 <<= 1;
                        this.f6175 = 0;
                        int iM249 = m249();
                        if (this.f6176 == 2) {
                            m253(1);
                            if (iM249 >= 32768) {
                                m1234(this.f6181, this.f6198);
                            } else {
                                iM249 <<= 1;
                                this.f6176 = 0;
                            }
                        }
                        int i6 = iM249 >>> 8;
                        if (this.f6197 < 37) {
                            i = 0;
                            while (true) {
                                int i7 = i;
                                if (((f6146[i] ^ i6) & ((255 >>> (i7 == 1 ? this.f6184 + 3 : f6145[i7])) ^ (-1))) == 0) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            int i8 = i;
                            m253(i8 == 1 ? this.f6184 + 3 : f6145[i8]);
                        } else {
                            i = 0;
                            while (true) {
                                int i9 = i;
                                if (((f6156[i] ^ i6) & ((255 >> (i9 == 3 ? this.f6184 + 3 : f6147[i9])) ^ (-1))) == 0) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            int i10 = i;
                            m253(i10 == 3 ? this.f6184 + 3 : f6147[i10]);
                        }
                        if (i < 9) {
                            this.f6176 = 0;
                            this.f6197 += i;
                            this.f6197 -= this.f6197 >> 4;
                            int iM1232 = m1232(m249(), 5, f6152, f6159) & 255;
                            int i11 = this.f6195[iM1232];
                            int i12 = iM1232 - 1;
                            if (i12 != -1) {
                                this.f6201[i11] = r0[i11] - 1;
                                int i13 = this.f6195[i12];
                                int[] iArr4 = this.f6201;
                                iArr4[i13] = iArr4[i13] + 1;
                                this.f6195[i12 + 1] = i13;
                                this.f6195[i12] = i11;
                            }
                            int i14 = i + 2;
                            int[] iArr5 = this.f6167;
                            int i15 = this.f6200;
                            this.f6200 = i15 + 1;
                            int i16 = i11 + 1;
                            iArr5[i15] = i16;
                            this.f6200 &= 3;
                            this.f6198 = i14;
                            this.f6181 = i16;
                            m1234(i16, i14);
                        } else if (i == 9) {
                            this.f6176++;
                            m1234(this.f6181, this.f6198);
                        } else if (i == 14) {
                            this.f6176 = 0;
                            int iM12322 = m1232(m249(), 3, f6151, f6148) + 5;
                            int iM2492 = (m249() >> 1) | 32768;
                            m253(15);
                            this.f6198 = iM12322;
                            this.f6181 = iM2492;
                            m1234(iM2492, iM12322);
                        } else {
                            this.f6176 = 0;
                            int i17 = i;
                            int i18 = this.f6167[(this.f6200 - (i - 9)) & 3];
                            int iM12323 = m1232(m249(), 2, f6160, f6157) + 2;
                            if (iM12323 == 257 && i17 == 10) {
                                this.f6184 ^= 1;
                            } else {
                                if (i18 > 256) {
                                    iM12323++;
                                }
                                if (i18 >= this.f6180) {
                                    iM12323++;
                                }
                                int[] iArr6 = this.f6167;
                                int i19 = this.f6200;
                                this.f6200 = i19 + 1;
                                iArr6[i19] = i18;
                                this.f6200 &= 3;
                                this.f6198 = iM12323;
                                this.f6181 = i18;
                                m1234(i18, iM12323);
                            }
                        }
                    }
                }
            }
        }
        m1236();
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    protected final boolean m1237() throws yq, IOException {
        int i = this.f6185 - this.f206;
        if (i < 0) {
            return false;
        }
        if (this.f206 > 16384) {
            if (i > 0) {
                System.arraycopy(this.f205, this.f206, this.f205, 0, i);
            }
            this.f206 = 0;
            this.f6185 = i;
        } else {
            i = this.f6185;
        }
        int iM1211 = this.f6165.m1211(this.f205, i, (32768 - i) & (-16));
        if (iM1211 > 0) {
            this.f6185 += iM1211;
        }
        this.f6182 = this.f6185 - 30;
        return iM1211 != -1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1233() {
        int iM1232;
        int iM12322;
        int i;
        int i2;
        this.f6175 = 0;
        this.f6179 += 16;
        if (this.f6179 > 255) {
            this.f6179 = 144;
            this.f6178 >>>= 1;
        }
        int i3 = this.f6191;
        int iM249 = m249();
        if (this.f6191 >= 122) {
            iM1232 = m1232(iM249, 3, f6151, f6148);
        } else if (this.f6191 >= 64) {
            iM1232 = m1232(iM249, 2, f6160, f6157);
        } else if (iM249 < 256) {
            iM1232 = iM249;
            m253(16);
        } else {
            iM1232 = 0;
            while (((iM249 << iM1232) & 32768) == 0) {
                iM1232++;
            }
            m253(iM1232 + 1);
        }
        this.f6191 += iM1232;
        this.f6191 -= this.f6191 >>> 5;
        int iM2492 = m249();
        if (this.f6188 > 10495) {
            iM12322 = m1232(iM2492, 5, f6152, f6159);
        } else if (this.f6188 > 1791) {
            iM12322 = m1232(iM2492, 5, f6161, f6154);
        } else {
            iM12322 = m1232(iM2492, 4, f6149, f6158);
        }
        this.f6188 += iM12322;
        this.f6188 -= this.f6188 >> 8;
        while (true) {
            int i4 = this.f6168[iM12322 & 255];
            int[] iArr = this.f6173;
            i = i4 + 1;
            int i5 = i4 & 255;
            i2 = iArr[i5];
            iArr[i5] = i2 + 1;
            if ((i & 255) != 0) {
                break;
            } else {
                m1235(this.f6168, this.f6173);
            }
        }
        int[] iArr2 = this.f6168;
        iArr2[iM12322] = iArr2[i2];
        this.f6168[i2] = i;
        int iM2493 = ((65280 & i) | (m249() >>> 8)) >>> 1;
        m253(7);
        int i6 = this.f6190;
        if (iM1232 != 1 && iM1232 != 4) {
            if (iM1232 == 0 && iM2493 <= this.f6180) {
                this.f6190++;
                this.f6190 -= this.f6190 >> 8;
            } else if (this.f6190 > 0) {
                this.f6190--;
            }
        }
        int i7 = iM1232 + 3;
        if (iM2493 >= this.f6180) {
            i7++;
        }
        if (iM2493 <= 256) {
            i7 += 8;
        }
        if (i6 > 176 || (this.f6193 >= 10752 && i3 < 64)) {
            this.f6180 = 32512;
        } else {
            this.f6180 = 8193;
        }
        int[] iArr3 = this.f6167;
        int i8 = this.f6200;
        this.f6200 = i8 + 1;
        iArr3[i8] = iM2493;
        this.f6200 &= 3;
        this.f6198 = i7;
        this.f6181 = iM2493;
        m1234(iM2493, i7);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private void m1231() {
        int iM1232;
        int iM249 = m249();
        if (this.f6193 > 30207) {
            iM1232 = m1232(iM249, 8, f6153, f6150);
        } else if (this.f6193 > 24063) {
            iM1232 = m1232(iM249, 6, f6162, f6155);
        } else if (this.f6193 > 13823) {
            iM1232 = m1232(iM249, 5, f6152, f6159);
        } else if (this.f6193 > 3583) {
            iM1232 = m1232(iM249, 5, f6161, f6154);
        } else {
            iM1232 = m1232(iM249, 4, f6149, f6158);
        }
        int i = iM1232 & 255;
        if (this.f6187 != 0) {
            if (i == 0 && iM249 > 4095) {
                i = 256;
            }
            i--;
            if (i == -1) {
                int iM2492 = m249();
                m253(1);
                if ((32768 & iM2492) != 0) {
                    this.f6187 = 0;
                    this.f6175 = 0;
                    return;
                }
                int i2 = (iM2492 & 16384) != 0 ? 4 : 3;
                m253(1);
                int iM12322 = (m1232(m249(), 5, f6152, f6159) << 5) | (m249() >>> 11);
                m253(5);
                m1234(iM12322, i2);
                return;
            }
        } else {
            int i3 = this.f6175;
            this.f6175 = i3 + 1;
            if (i3 >= 16 && this.f6177 == 0) {
                this.f6187 = 1;
            }
        }
        this.f6193 += i;
        this.f6193 -= this.f6193 >>> 8;
        this.f6178 += 16;
        if (this.f6178 > 255) {
            this.f6178 = 144;
            this.f6179 >>>= 1;
        }
        byte[] bArr = this.f6183;
        int i4 = this.f6199;
        this.f6199 = i4 + 1;
        bArr[i4] = (byte) (this.f6186[i] >>> 8);
        this.f6194--;
        while (true) {
            int i5 = this.f6186[i];
            int[] iArr = this.f6172;
            int i6 = i5 + 1;
            int i7 = i5 & 255;
            int i8 = iArr[i7];
            iArr[i7] = i8 + 1;
            if ((i6 & 255) > 161) {
                m1235(this.f6186, this.f6172);
            } else {
                int[] iArr2 = this.f6186;
                iArr2[i] = iArr2[i8];
                this.f6186[i8] = i6;
                return;
            }
        }
    }

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private void m1230() {
        int iM1232 = m1232(m249(), 5, f6152, f6159);
        while (true) {
            int i = this.f6169[iM1232];
            this.f6196 = i >>> 8;
            int[] iArr = this.f6174;
            int i2 = i + 1;
            int i3 = i & 255;
            int i4 = iArr[i3];
            iArr[i3] = i4 + 1;
            if ((i2 & 255) == 0) {
                m1235(this.f6169, this.f6174);
            } else {
                int[] iArr2 = this.f6169;
                iArr2[iM1232] = iArr2[i4];
                this.f6169[i4] = i2;
                return;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m1235(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            int i3 = 0;
            while (i3 < 32) {
                iArr[i] = (iArr[i] & InputDeviceCompat.SOURCE_ANY) | i2;
                i3++;
                i++;
            }
        }
        Arrays.fill(iArr2, 0);
        for (int i4 = 6; i4 >= 0; i4--) {
            iArr2[i4] = (7 - i4) * 32;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1234(int i, int i2) {
        this.f6194 -= i2;
        while (true) {
            int i3 = i2;
            i2--;
            if (i3 != 0) {
                this.f6183[this.f6199] = this.f6183[(this.f6199 - i) & 4194303];
                this.f6199 = (this.f6199 + 1) & 4194303;
            } else {
                return;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private int m1232(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i & 65520;
        int i4 = 0;
        while (iArr[i4] <= i3) {
            i2++;
            i4++;
        }
        m253(i2);
        return ((i3 - (i4 != 0 ? iArr[i4 - 1] : 0)) >>> (16 - i2)) + iArr2[i2];
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    protected final void m1236() throws IOException {
        if (this.f6199 != this.f6192) {
            this.f6166 = true;
        }
        if (this.f6199 < this.f6192) {
            this.f6165.m1210(this.f6183, this.f6192, (-this.f6192) & 4194303);
            this.f6165.m1210(this.f6183, 0, this.f6199);
            this.f6164 = true;
        } else {
            this.f6165.m1210(this.f6183, this.f6192, this.f6199 - this.f6192);
        }
        this.f6192 = this.f6199;
    }
}
