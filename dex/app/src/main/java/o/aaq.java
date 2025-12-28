package o;

import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import java.util.List;
import java.util.Vector;
import org.apache.commons.net.ftp.FTPReply;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aaq extends aap {

    /* renamed from: Ć, reason: contains not printable characters */
    private static /* synthetic */ int[] f208;

    /* renamed from: ć, reason: contains not printable characters */
    private static /* synthetic */ int[] f209;

    /* renamed from: Ą, reason: contains not printable characters */
    private int f210;

    /* renamed from: ą, reason: contains not printable characters */
    private int f211;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private int f213;

    /* renamed from: 櫯, reason: contains not printable characters */
    private int[] f214 = new int[8];

    /* renamed from: ȃ, reason: contains not printable characters */
    private int f212 = 25000000;

    /* renamed from: 鷭, reason: contains not printable characters */
    public byte[] f215 = null;

    /* renamed from: 櫯, reason: contains not printable characters */
    private static /* synthetic */ int[] m256() {
        int[] iArr = f209;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[aaz.valuesCustom().length];
        try {
            iArr2[aaz.VMSF_AUDIO.ordinal()] = 6;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[aaz.VMSF_DELTA.ordinal()] = 7;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[aaz.VMSF_E8.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[aaz.VMSF_E8E9.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[aaz.VMSF_ITANIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[aaz.VMSF_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[aaz.VMSF_RGB.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[aaz.VMSF_UPCASE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f209 = iArr2;
        return iArr2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] m266() {
        int[] iArr = f208;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[aas.valuesCustom().length];
        try {
            iArr2[aas.VM_ADC.ordinal()] = 38;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[aas.VM_ADD.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[aas.VM_ADDB.ordinal()] = 45;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[aas.VM_ADDD.ordinal()] = 46;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[aas.VM_AND.ordinal()] = 11;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[aas.VM_CALL.ordinal()] = 22;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[aas.VM_CMP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[aas.VM_CMPB.ordinal()] = 43;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[aas.VM_CMPD.ordinal()] = 44;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[aas.VM_DEC.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[aas.VM_DECB.ordinal()] = 51;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[aas.VM_DECD.ordinal()] = 52;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[aas.VM_DIV.ordinal()] = 37;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[aas.VM_INC.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[aas.VM_INCB.ordinal()] = 49;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[aas.VM_INCD.ordinal()] = 50;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[aas.VM_JA.ordinal()] = 18;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[aas.VM_JAE.ordinal()] = 19;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[aas.VM_JB.ordinal()] = 16;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[aas.VM_JBE.ordinal()] = 17;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[aas.VM_JMP.ordinal()] = 9;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[aas.VM_JNS.ordinal()] = 15;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[aas.VM_JNZ.ordinal()] = 6;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[aas.VM_JS.ordinal()] = 14;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[aas.VM_JZ.ordinal()] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[aas.VM_MOV.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[aas.VM_MOVB.ordinal()] = 41;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[aas.VM_MOVD.ordinal()] = 42;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[aas.VM_MOVSX.ordinal()] = 34;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[aas.VM_MOVZX.ordinal()] = 33;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[aas.VM_MUL.ordinal()] = 36;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[aas.VM_NEG.ordinal()] = 28;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[aas.VM_NEGB.ordinal()] = 53;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[aas.VM_NEGD.ordinal()] = 54;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[aas.VM_NOT.ordinal()] = 24;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[aas.VM_OR.ordinal()] = 12;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[aas.VM_POP.ordinal()] = 21;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[aas.VM_POPA.ordinal()] = 30;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[aas.VM_POPF.ordinal()] = 32;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[aas.VM_PRINT.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[aas.VM_PUSH.ordinal()] = 20;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[aas.VM_PUSHA.ordinal()] = 29;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[aas.VM_PUSHF.ordinal()] = 31;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[aas.VM_RET.ordinal()] = 23;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[aas.VM_SAR.ordinal()] = 27;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[aas.VM_SBB.ordinal()] = 39;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[aas.VM_SHL.ordinal()] = 25;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[aas.VM_SHR.ordinal()] = 26;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[aas.VM_STANDARD.ordinal()] = 55;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[aas.VM_SUB.ordinal()] = 4;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[aas.VM_SUBB.ordinal()] = 47;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[aas.VM_SUBD.ordinal()] = 48;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[aas.VM_TEST.ordinal()] = 13;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[aas.VM_XCHG.ordinal()] = 35;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[aas.VM_XOR.ordinal()] = 10;
        } catch (NoSuchFieldError unused55) {
        }
        f208 = iArr2;
        return iArr2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private int m259(boolean z, byte[] bArr, int i) {
        if (z) {
            if (this.f215 == bArr) {
                return bArr[i];
            }
            return bArr[i] & 255;
        }
        if (this.f215 == bArr) {
            return yu.m1180(bArr, i);
        }
        return (((((((bArr[i] & 255) | 0) << 8) | (bArr[i + 1] & 255)) << 8) | (bArr[i + 2] & 255)) << 8) | (bArr[i + 3] & 255);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m264(boolean z, byte[] bArr, int i, int i2) {
        if (z) {
            if (this.f215 == bArr) {
                bArr[i] = (byte) i2;
                return;
            } else {
                bArr[i] = (byte) (((byte) (i2 & 255)) | 0);
                return;
            }
        }
        if (this.f215 == bArr) {
            yu.m1182(bArr, i, i2);
            return;
        }
        bArr[i] = (byte) ((i2 >>> 24) & 255);
        bArr[i + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i + 3] = (byte) (i2 & 255);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m261(Vector<Byte> vector, int i, int i2) {
        vector.set(i + 0, Byte.valueOf((byte) (i2 & 255)));
        vector.set(i + 1, Byte.valueOf((byte) ((i2 >>> 8) & 255)));
        vector.set(i + 2, Byte.valueOf((byte) ((i2 >>> 16) & 255)));
        vector.set(i + 3, Byte.valueOf((byte) ((i2 >>> 24) & 255)));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private int m258(aaw aawVar) {
        if (aawVar.f292 == aau.VM_OPREGMEM) {
            return yu.m1180(this.f215, (aawVar.f289 + aawVar.f290) & 262143);
        }
        return yu.m1180(this.f215, aawVar.f289);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m268(aax aaxVar) {
        List<aav> list;
        for (int i = 0; i < aaxVar.f294.length; i++) {
            this.f214[i] = aaxVar.f294[i];
        }
        long jMin = Math.min(aaxVar.f297.size(), 8192) & (-1);
        if (jMin != 0) {
            for (int i2 = 0; i2 < jMin; i2++) {
                this.f215[245760 + i2] = aaxVar.f297.get(i2).byteValue();
            }
        }
        long jMin2 = Math.min(aaxVar.f293.size(), PlaybackStateCompat.ACTION_PLAY_FROM_URI - jMin) & (-1);
        if (jMin2 != 0) {
            for (int i3 = 0; i3 < jMin2; i3++) {
                this.f215[((int) jMin) + 245760 + i3] = aaxVar.f293.get(i3).byteValue();
            }
        }
        this.f214[7] = 262144;
        this.f213 = 0;
        if (aaxVar.f299.size() != 0) {
            list = aaxVar.f299;
        } else {
            list = aaxVar.f300;
        }
        m265(list, aaxVar.f298);
        int iM259 = m259(false, this.f215, 245792) & 262143;
        int iM2592 = m259(false, this.f215, 245788) & 262143;
        if (iM259 + iM2592 >= 262144) {
            iM259 = 0;
            iM2592 = 0;
        }
        aaxVar.f295 = iM259;
        aaxVar.f296 = iM2592;
        aaxVar.f297.clear();
        int iMin = Math.min(m259(false, this.f215, 245808), 8128);
        if (iMin != 0) {
            aaxVar.f297.setSize(iMin + 64);
            for (int i4 = 0; i4 < iMin + 64; i4++) {
                aaxVar.f297.set(i4, Byte.valueOf(this.f215[245760 + i4]));
            }
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private boolean m254(int i) {
        if (i >= this.f210) {
            return true;
        }
        int i2 = this.f212 - 1;
        this.f212 = i2;
        if (i2 <= 0) {
            return false;
        }
        this.f211 = i;
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private boolean m265(List<aav> list, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        this.f212 = 25000000;
        this.f210 = i;
        this.f211 = 0;
        while (true) {
            aav aavVar = list.get(this.f211);
            int iM258 = m258(aavVar.f286);
            int iM2582 = m258(aavVar.f285);
            switch (m266()[aavVar.f288.ordinal()]) {
                case 1:
                    m264(aavVar.f287, this.f215, iM258, m259(aavVar.f287, this.f215, iM2582));
                    break;
                case 2:
                    int iM259 = m259(aavVar.f287, this.f215, iM258);
                    int iM2592 = iM259 - m259(aavVar.f287, this.f215, iM2582);
                    if (iM2592 == 0) {
                        this.f213 = aat.VM_FZ.f278;
                        break;
                    } else {
                        this.f213 = iM2592 > iM259 ? 1 : aat.VM_FS.f278 & iM2592;
                        break;
                    }
                case 3:
                    int iM2593 = m259(aavVar.f287, this.f215, iM258);
                    int iM2594 = (int) ((iM2593 + m259(aavVar.f287, this.f215, iM2582)) & (-1));
                    if (aavVar.f287) {
                        iM2594 &= 255;
                        if (iM2594 < iM2593) {
                            i7 = 1;
                        } else if (iM2594 == 0) {
                            i7 = aat.VM_FZ.f278;
                        } else {
                            i7 = (iM2594 & 128) != 0 ? aat.VM_FS.f278 : 0;
                        }
                        this.f213 = i7;
                    } else {
                        if (iM2594 < iM2593) {
                            i6 = 1;
                        } else {
                            i6 = iM2594 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & iM2594;
                        }
                        this.f213 = i6;
                    }
                    m264(aavVar.f287, this.f215, iM258, iM2594);
                    break;
                case 4:
                    int iM2595 = m259(aavVar.f287, this.f215, iM258);
                    int iM2596 = (int) (iM2595 & ((-1) - m259(aavVar.f287, this.f215, iM2582)) & (-1));
                    if (iM2596 == 0) {
                        i5 = aat.VM_FZ.f278;
                    } else {
                        i5 = iM2596 > iM2595 ? 1 : aat.VM_FS.f278 & iM2596;
                    }
                    this.f213 = i5;
                    m264(aavVar.f287, this.f215, iM258, iM2596);
                    break;
                case 5:
                    if ((this.f213 & aat.VM_FZ.f278) == 0) {
                        break;
                    } else {
                        m254(m259(false, this.f215, iM258));
                    }
                case 6:
                    if ((this.f213 & aat.VM_FZ.f278) != 0) {
                        break;
                    } else {
                        m254(m259(false, this.f215, iM258));
                    }
                case 7:
                    int iM2597 = (int) (m259(aavVar.f287, this.f215, iM258) & 0);
                    if (aavVar.f287) {
                        iM2597 &= 255;
                    }
                    m264(aavVar.f287, this.f215, iM258, iM2597);
                    this.f213 = iM2597 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & iM2597;
                    break;
                case 8:
                    int iM2598 = (int) (m259(aavVar.f287, this.f215, iM258) & (-2));
                    m264(aavVar.f287, this.f215, iM258, iM2598);
                    this.f213 = iM2598 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & iM2598;
                    break;
                case 9:
                    m254(m259(false, this.f215, iM258));
                    continue;
                case 10:
                    int iM2599 = m259(aavVar.f287, this.f215, iM258) ^ m259(aavVar.f287, this.f215, iM2582);
                    this.f213 = iM2599 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & iM2599;
                    m264(aavVar.f287, this.f215, iM258, iM2599);
                    break;
                case 11:
                    int iM25910 = m259(aavVar.f287, this.f215, iM258) & m259(aavVar.f287, this.f215, iM2582);
                    this.f213 = iM25910 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & iM25910;
                    m264(aavVar.f287, this.f215, iM258, iM25910);
                    break;
                case 12:
                    int iM25911 = m259(aavVar.f287, this.f215, iM258) | m259(aavVar.f287, this.f215, iM2582);
                    this.f213 = iM25911 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & iM25911;
                    m264(aavVar.f287, this.f215, iM258, iM25911);
                    break;
                case 13:
                    int iM25912 = m259(aavVar.f287, this.f215, iM258) & m259(aavVar.f287, this.f215, iM2582);
                    this.f213 = iM25912 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & iM25912;
                    break;
                case 14:
                    if ((this.f213 & aat.VM_FS.f278) == 0) {
                        break;
                    } else {
                        m254(m259(false, this.f215, iM258));
                    }
                case 15:
                    if ((this.f213 & aat.VM_FS.f278) != 0) {
                        break;
                    } else {
                        m254(m259(false, this.f215, iM258));
                    }
                case 16:
                    if ((this.f213 & aat.VM_FC.f278) == 0) {
                        break;
                    } else {
                        m254(m259(false, this.f215, iM258));
                    }
                case 17:
                    if ((this.f213 & (aat.VM_FC.f278 | aat.VM_FZ.f278)) == 0) {
                        break;
                    } else {
                        m254(m259(false, this.f215, iM258));
                    }
                case 18:
                    if ((this.f213 & (aat.VM_FC.f278 | aat.VM_FZ.f278)) != 0) {
                        break;
                    } else {
                        m254(m259(false, this.f215, iM258));
                    }
                case 19:
                    if ((this.f213 & aat.VM_FC.f278) != 0) {
                        break;
                    } else {
                        m254(m259(false, this.f215, iM258));
                    }
                case 20:
                    this.f214[7] = r0[7] - 4;
                    m264(false, this.f215, this.f214[7] & 262143, m259(false, this.f215, iM258));
                    break;
                case 21:
                    m264(false, this.f215, iM258, m259(false, this.f215, this.f214[7] & 262143));
                    int[] iArr = this.f214;
                    iArr[7] = iArr[7] + 4;
                    break;
                case 22:
                    this.f214[7] = r0[7] - 4;
                    m264(false, this.f215, this.f214[7] & 262143, this.f211 + 1);
                    m254(m259(false, this.f215, iM258));
                    continue;
                case 23:
                    if (this.f214[7] >= 262144) {
                        return true;
                    }
                    m254(m259(false, this.f215, this.f214[7] & 262143));
                    int[] iArr2 = this.f214;
                    iArr2[7] = iArr2[7] + 4;
                    continue;
                case 24:
                    m264(aavVar.f287, this.f215, iM258, m259(aavVar.f287, this.f215, iM258) ^ (-1));
                    break;
                case 25:
                    int iM25913 = m259(aavVar.f287, this.f215, iM258);
                    int iM25914 = m259(aavVar.f287, this.f215, iM2582);
                    int i8 = iM25913 << iM25914;
                    int i9 = i8 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & i8;
                    if (((iM25913 << (iM25914 - 1)) & ExploreByTouchHelper.INVALID_ID) != 0) {
                        i4 = aat.VM_FC.f278;
                    } else {
                        i4 = 0;
                    }
                    this.f213 = i9 | i4;
                    m264(aavVar.f287, this.f215, iM258, i8);
                    break;
                case 26:
                    int iM25915 = m259(aavVar.f287, this.f215, iM258);
                    int iM25916 = m259(aavVar.f287, this.f215, iM2582);
                    int i10 = iM25915 >>> iM25916;
                    this.f213 = (i10 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & i10) | ((iM25915 >>> (iM25916 - 1)) & aat.VM_FC.f278);
                    m264(aavVar.f287, this.f215, iM258, i10);
                    break;
                case 27:
                    int iM25917 = m259(aavVar.f287, this.f215, iM258);
                    int iM25918 = m259(aavVar.f287, this.f215, iM2582);
                    int i11 = iM25917 >> iM25918;
                    this.f213 = (i11 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & i11) | ((iM25917 >> (iM25918 - 1)) & aat.VM_FC.f278);
                    m264(aavVar.f287, this.f215, iM258, i11);
                    break;
                case 28:
                    int i12 = -m259(aavVar.f287, this.f215, iM258);
                    this.f213 = i12 == 0 ? aat.VM_FZ.f278 : aat.VM_FC.f278 | (aat.VM_FS.f278 & i12);
                    m264(aavVar.f287, this.f215, iM258, i12);
                    break;
                case 29:
                    int i13 = 0;
                    int i14 = this.f214[7] - 4;
                    while (i13 < 8) {
                        m264(false, this.f215, 262143 & i14, this.f214[i13]);
                        i13++;
                        i14 -= 4;
                    }
                    this.f214[7] = r0[7] - 32;
                    break;
                case 30:
                    int i15 = 0;
                    int i16 = this.f214[7];
                    while (i15 < 8) {
                        this.f214[7 - i15] = m259(false, this.f215, 262143 & i16);
                        i15++;
                        i16 += 4;
                    }
                    break;
                case 31:
                    this.f214[7] = r0[7] - 4;
                    m264(false, this.f215, this.f214[7] & 262143, this.f213);
                    break;
                case 32:
                    this.f213 = m259(false, this.f215, this.f214[7] & 262143);
                    int[] iArr3 = this.f214;
                    iArr3[7] = iArr3[7] + 4;
                    break;
                case 33:
                    m264(false, this.f215, iM258, m259(true, this.f215, iM2582));
                    break;
                case 34:
                    m264(false, this.f215, iM258, (int) ((byte) m259(true, this.f215, iM2582)));
                    break;
                case 35:
                    int iM25919 = m259(aavVar.f287, this.f215, iM258);
                    m264(aavVar.f287, this.f215, iM258, m259(aavVar.f287, this.f215, iM2582));
                    m264(aavVar.f287, this.f215, iM2582, iM25919);
                    break;
                case 36:
                    m264(aavVar.f287, this.f215, iM258, (int) (m259(aavVar.f287, this.f215, iM258) & (m259(aavVar.f287, this.f215, iM2582) * (-1)) & (-1) & (-1)));
                    break;
                case 37:
                    int iM25920 = m259(aavVar.f287, this.f215, iM2582);
                    if (iM25920 != 0) {
                        m264(aavVar.f287, this.f215, iM258, m259(aavVar.f287, this.f215, iM258) / iM25920);
                        break;
                    }
                    break;
                case 38:
                    int iM25921 = m259(aavVar.f287, this.f215, iM258);
                    int i17 = this.f213 & aat.VM_FC.f278;
                    int iM25922 = (int) (iM25921 & (m259(aavVar.f287, this.f215, iM2582) - 1) & (i17 - 1) & (-1));
                    if (aavVar.f287) {
                        iM25922 &= 255;
                    }
                    if (iM25922 < iM25921 || (iM25922 == iM25921 && i17 != 0)) {
                        i3 = 1;
                    } else {
                        i3 = iM25922 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & iM25922;
                    }
                    this.f213 = i3;
                    m264(aavVar.f287, this.f215, iM258, iM25922);
                    break;
                case 39:
                    int iM25923 = m259(aavVar.f287, this.f215, iM258);
                    int i18 = this.f213 & aat.VM_FC.f278;
                    int iM25924 = (int) (iM25923 & ((-1) - m259(aavVar.f287, this.f215, iM2582)) & ((-1) - i18) & (-1));
                    if (aavVar.f287) {
                        iM25924 &= 255;
                    }
                    if (iM25924 > iM25923 || (iM25924 == iM25923 && i18 != 0)) {
                        i2 = 1;
                    } else {
                        i2 = iM25924 == 0 ? aat.VM_FZ.f278 : aat.VM_FS.f278 & iM25924;
                    }
                    this.f213 = i2;
                    m264(aavVar.f287, this.f215, iM258, iM25924);
                    break;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    m264(true, this.f215, iM258, m259(true, this.f215, iM2582));
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    m264(false, this.f215, iM258, m259(false, this.f215, iM2582));
                    break;
                case 43:
                    int iM25925 = m259(true, this.f215, iM258);
                    int iM25926 = iM25925 - m259(true, this.f215, iM2582);
                    if (iM25926 == 0) {
                        this.f213 = aat.VM_FZ.f278;
                        break;
                    } else {
                        this.f213 = iM25926 > iM25925 ? 1 : aat.VM_FS.f278 & iM25926;
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    int iM25927 = m259(false, this.f215, iM258);
                    int iM25928 = iM25927 - m259(false, this.f215, iM2582);
                    if (iM25928 == 0) {
                        this.f213 = aat.VM_FZ.f278;
                        break;
                    } else {
                        this.f213 = iM25928 > iM25927 ? 1 : aat.VM_FS.f278 & iM25928;
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    m264(true, this.f215, iM258, (int) (m259(true, this.f215, iM258) & (m259(true, this.f215, iM2582) - 1) & (-1)));
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    m264(false, this.f215, iM258, (int) (m259(false, this.f215, iM258) & (m259(false, this.f215, iM2582) - 1) & (-1)));
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    m264(true, this.f215, iM258, (int) (m259(true, this.f215, iM258) & ((-1) - m259(true, this.f215, iM2582)) & (-1)));
                    break;
                case 48:
                    m264(false, this.f215, iM258, (int) (m259(false, this.f215, iM258) & ((-1) - m259(false, this.f215, iM2582)) & (-1)));
                    break;
                case 49:
                    m264(true, this.f215, iM258, (int) (m259(true, this.f215, iM258) & 0));
                    break;
                case 50:
                    m264(false, this.f215, iM258, (int) (m259(false, this.f215, iM258) & 0));
                    break;
                case 51:
                    m264(true, this.f215, iM258, (int) (m259(true, this.f215, iM258) & (-2)));
                    break;
                case 52:
                    m264(false, this.f215, iM258, (int) (m259(false, this.f215, iM258) & (-2)));
                    break;
                case 53:
                    m264(true, this.f215, iM258, -m259(true, this.f215, iM258));
                    break;
                case 54:
                    m264(false, this.f215, iM258, -m259(false, this.f215, iM258));
                    break;
                case 55:
                    m263(aaz.m276(aavVar.f286.f291));
                    break;
            }
            this.f211++;
            this.f212--;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m269(byte[] bArr, int i, aax aaxVar) {
        aaz aazVar;
        int i2;
        m248();
        int iMin = Math.min(32768, i);
        for (int i3 = 0; i3 < iMin; i3++) {
            byte[] bArr2 = this.f205;
            bArr2[i3] = (byte) (bArr2[i3] | bArr[i3]);
        }
        byte b = 0;
        for (int i4 = 1; i4 < i; i4++) {
            b = (byte) (bArr[i4] ^ b);
        }
        m252(8);
        aaxVar.f298 = 0;
        if (b == bArr[0]) {
            aay[] aayVarArr = {new aay(53, -1386780537, aaz.VMSF_E8), new aay(57, 1020781950, aaz.VMSF_E8E9), new aay(FTPReply.SERVICE_NOT_READY, 929663295, aaz.VMSF_ITANIUM), new aay(29, 235276157, aaz.VMSF_DELTA), new aay(149, 472669640, aaz.VMSF_RGB), new aay(216, -1132075263, aaz.VMSF_AUDIO), new aay(40, 1186579808, aaz.VMSF_UPCASE)};
            int iM1175 = yp.m1175(-1, bArr, 0, bArr.length) ^ (-1);
            int i5 = 0;
            while (true) {
                if (i5 >= aayVarArr.length) {
                    aazVar = aaz.VMSF_NONE;
                    break;
                }
                if (aayVarArr[i5].f302 == iM1175 && aayVarArr[i5].f303 == bArr.length) {
                    aazVar = aayVarArr[i5].f301;
                    break;
                }
                i5++;
            }
            if (aazVar != aaz.VMSF_NONE) {
                aav aavVar = new aav();
                aavVar.f288 = aas.VM_STANDARD;
                aavVar.f286.f291 = aazVar.f313;
                aavVar.f286.f292 = aau.VM_OPNONE;
                aavVar.f285.f292 = aau.VM_OPNONE;
                i = 0;
                aaxVar.f300.add(aavVar);
                aaxVar.f298++;
            }
            int iM249 = m249();
            m252(1);
            if ((32768 & iM249) != 0) {
                long jM257 = m257(this) & 0;
                for (int i6 = 0; this.f206 < i && i6 < jM257; i6++) {
                    aaxVar.f293.add(Byte.valueOf((byte) (m249() >> 8)));
                    m252(8);
                }
            }
            while (this.f206 < i) {
                aav aavVar2 = new aav();
                int iM2492 = m249();
                if ((32768 & iM2492) == 0) {
                    aavVar2.f288 = aas.m272(iM2492 >> 12);
                    m252(4);
                } else {
                    aavVar2.f288 = aas.m272((iM2492 >> 10) - 24);
                    m252(6);
                }
                if ((aar.f216[aavVar2.f288.f273] & 4) != 0) {
                    aavVar2.f287 = (m249() >> 15) == 1;
                    m252(1);
                } else {
                    aavVar2.f287 = false;
                }
                aavVar2.f286.f292 = aau.VM_OPNONE;
                aavVar2.f285.f292 = aau.VM_OPNONE;
                int i7 = aar.f216[aavVar2.f288.f273] & 3;
                if (i7 > 0) {
                    m262(aavVar2.f286, aavVar2.f287);
                    if (i7 == 2) {
                        m262(aavVar2.f285, aavVar2.f287);
                    } else if (aavVar2.f286.f292 == aau.VM_OPINT && (aar.f216[aavVar2.f288.f273] & 24) != 0) {
                        int i8 = aavVar2.f286.f291;
                        if (i8 >= 256) {
                            i2 = i8 + InputDeviceCompat.SOURCE_ANY;
                        } else {
                            if (i8 >= 136) {
                                i8 -= 264;
                            } else if (i8 >= 16) {
                                i8 -= 8;
                            } else if (i8 >= 8) {
                                i8 -= 16;
                            }
                            i2 = i8 + aaxVar.f298;
                        }
                        aavVar2.f286.f291 = i2;
                    }
                }
                aaxVar.f298++;
                aaxVar.f300.add(aavVar2);
            }
        }
        aav aavVar3 = new aav();
        aavVar3.f288 = aas.VM_RET;
        aavVar3.f286.f292 = aau.VM_OPNONE;
        aavVar3.f285.f292 = aau.VM_OPNONE;
        aaxVar.f300.add(aavVar3);
        aaxVar.f298++;
        if (i != 0) {
            List<aav> list = aaxVar.f300;
            for (aav aavVar4 : list) {
                switch (m266()[aavVar4.f288.ordinal()]) {
                    case 1:
                        aavVar4.f288 = aavVar4.f287 ? aas.VM_MOVB : aas.VM_MOVD;
                        break;
                    case 2:
                        aavVar4.f288 = aavVar4.f287 ? aas.VM_CMPB : aas.VM_CMPD;
                        break;
                    default:
                        if ((aar.f216[aavVar4.f288.f273] & 64) != 0) {
                            boolean z = false;
                            int iIndexOf = list.indexOf(aavVar4) + 1;
                            while (true) {
                                if (iIndexOf < list.size()) {
                                    byte b2 = aar.f216[list.get(iIndexOf).f288.f273];
                                    if ((b2 & 56) != 0) {
                                        z = true;
                                    } else if ((b2 & 64) == 0) {
                                        iIndexOf++;
                                    }
                                }
                            }
                            if (z) {
                                break;
                            } else {
                                switch (m266()[aavVar4.f288.ordinal()]) {
                                    case 3:
                                        aavVar4.f288 = aavVar4.f287 ? aas.VM_ADDB : aas.VM_ADDD;
                                        break;
                                    case 4:
                                        aavVar4.f288 = aavVar4.f287 ? aas.VM_SUBB : aas.VM_SUBD;
                                        break;
                                    case 7:
                                        aavVar4.f288 = aavVar4.f287 ? aas.VM_INCB : aas.VM_INCD;
                                        break;
                                    case 8:
                                        aavVar4.f288 = aavVar4.f287 ? aas.VM_DECB : aas.VM_DECD;
                                        break;
                                    case 28:
                                        aavVar4.f288 = aavVar4.f287 ? aas.VM_NEGB : aas.VM_NEGD;
                                        break;
                                }
                            }
                        } else {
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m262(aaw aawVar, boolean z) {
        int iM249 = m249();
        if ((32768 & iM249) != 0) {
            aawVar.f292 = aau.VM_OPREG;
            aawVar.f291 = (iM249 >> 12) & 7;
            aawVar.f289 = aawVar.f291;
            m252(4);
            return;
        }
        if ((49152 & iM249) == 0) {
            aawVar.f292 = aau.VM_OPINT;
            if (z) {
                aawVar.f291 = (iM249 >> 6) & 255;
                m252(10);
                return;
            } else {
                m252(2);
                aawVar.f291 = m257(this);
                return;
            }
        }
        aawVar.f292 = aau.VM_OPREGMEM;
        if ((iM249 & 8192) == 0) {
            aawVar.f291 = (iM249 >> 10) & 7;
            aawVar.f289 = aawVar.f291;
            aawVar.f290 = 0;
            m252(6);
            return;
        }
        if ((iM249 & 4096) == 0) {
            aawVar.f291 = (iM249 >> 9) & 7;
            aawVar.f289 = aawVar.f291;
            m252(7);
        } else {
            aawVar.f291 = 0;
            m252(4);
        }
        aawVar.f290 = m257(this);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static int m257(aap aapVar) {
        int iM249 = aapVar.m249();
        switch (49152 & iM249) {
            case 0:
                aapVar.m252(6);
                return (iM249 >> 10) & 15;
            case 16384:
                if ((iM249 & 15360) == 0) {
                    int i = ((iM249 >> 2) & 255) | InputDeviceCompat.SOURCE_ANY;
                    aapVar.m252(14);
                    return i;
                }
                int i2 = (iM249 >> 6) & 255;
                aapVar.m252(10);
                return i2;
            case 32768:
                aapVar.m252(2);
                int iM2492 = aapVar.m249();
                aapVar.m252(16);
                return iM2492;
            default:
                aapVar.m252(2);
                int iM2493 = aapVar.m249() << 16;
                aapVar.m252(16);
                int iM2494 = iM2493 | aapVar.m249();
                aapVar.m252(16);
                return iM2494;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x022d  */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m263(o.aaz r31) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aaq.m263(o.aaz):void");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m260(int i, int i2, int i3) {
        int i4 = i3 / 8;
        int i5 = i3 & 7;
        int i6 = (1048575 << i5) ^ (-1);
        int i7 = i2 << i5;
        for (int i8 = 0; i8 < 4; i8++) {
            byte[] bArr = this.f215;
            int i9 = i + i4 + i8;
            bArr[i9] = (byte) (bArr[i9] & i6);
            byte[] bArr2 = this.f215;
            int i10 = i + i4 + i8;
            bArr2[i10] = (byte) (bArr2[i10] | i7);
            i6 = (i6 >>> 8) | ViewCompat.MEASURED_STATE_MASK;
            i7 >>>= 8;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private int m255(int i, int i2, int i3) {
        int i4 = i2 / 8;
        int i5 = i4 + 1;
        int i6 = this.f215[i4 + i] & 255;
        int i7 = i5 + 1;
        return ((((i6 | ((this.f215[i5 + i] & 255) << 8)) | ((this.f215[i7 + i] & 255) << 16)) | ((this.f215[i + (i7 + 1)] & 255) << 24)) >>> (i2 & 7)) & ((-1) >>> (32 - i3));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m267(int i, byte[] bArr, int i2, int i3) {
        if (i < 262144) {
            for (int i4 = 0; i4 < Math.min(bArr.length - i2, i3) && 262144 - i >= i4; i4++) {
                this.f215[i + i4] = bArr[i2 + i4];
            }
        }
    }
}
