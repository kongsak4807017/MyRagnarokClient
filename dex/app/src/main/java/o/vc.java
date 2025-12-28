package o;

import android.support.v4.media.TransportMediator;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.nntp.NNTP;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpStatus;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class vc {

    /* renamed from: 櫯, reason: contains not printable characters */
    public static vd f5367;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static boolean f5368 = false;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static int[] f5366 = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: ȃ, reason: contains not printable characters */
    private static int[] f5365 = {58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7};

    /* renamed from: Ą, reason: contains not printable characters */
    private static int[] f5362 = {40, 8, 48, 16, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25};

    /* renamed from: ą, reason: contains not printable characters */
    private static int[] f5363 = {16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25};

    /* renamed from: Ć, reason: contains not printable characters */
    private static int[][] f5364 = {new int[]{TelnetCommand.EOR, 3, 65, TelnetCommand.DO, 216, 116, 30, 71, 38, TelnetCommand.EOR, 251, 34, 179, 216, 132, 30, 57, 172, 167, 96, 98, 193, 205, 186, 92, FTPReply.FILE_STATUS_OK, 144, 89, 5, 59, 122, 133, 64, TelnetCommand.DO, 30, 200, NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS, 138, 139, 33, 218, 67, 100, 159, 45, 20, 177, 114, TelnetCommand.AO, 91, 200, 182, 156, 55, 118, TelnetCommand.EOF, 57, 160, 163, 5, 82, 110, 15, 217}, new int[]{167, 221, 13, FTPReply.SERVICE_NOT_READY, 158, 11, FTPReply.ENTERING_PASSIVE_MODE, 149, 96, 54, 54, 79, TelnetCommand.GA, 96, 90, 163, 17, 36, 210, 135, 200, 82, 117, TelnetCommand.EOF, 187, 193, 76, 186, 36, TelnetCommand.DONT, IMAP.DEFAULT_PORT, 25, 218, 19, HttpStatus.SC_PROCESSING, 175, 73, 208, 144, 6, 140, 106, 251, 145, 55, 141, 13, FTPReply.SERVICE_NOT_READY, 191, 73, 17, TelnetCommand.IP, 35, FTPReply.ENTERING_EPSV_MODE, HttpStatus.SC_PARTIAL_CONTENT, 59, 85, 188, 162, 87, 232, 34, 116, HttpStatus.SC_PARTIAL_CONTENT}, new int[]{44, FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE, 193, 191, 74, 36, 31, 194, 121, 71, 162, 124, 182, 217, 104, 21, 128, 86, 93, 1, 51, TelnetCommand.DO, TelnetCommand.IP, 174, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, 48, 7, 155, FTPReply.ENTERING_EPSV_MODE, 131, 155, 104, 73, 180, 46, 131, 31, 194, 181, 124, 162, 25, 216, FTPReply.ENTERING_EPSV_MODE, 124, 47, 131, 218, TelnetCommand.EC, 107, 144, TelnetCommand.DONT, 196, 1, 90, 151, 97, 166, 61, 64, 11, 88, 230, 61}, new int[]{77, 209, 178, 15, 40, 189, 228, FTPReply.SERVICE_NOT_READY, TelnetCommand.AYT, 74, 15, 147, 139, 23, 209, 164, 58, TelnetCommand.EOF, 201, 53, 147, 86, TransportMediator.KEYCODE_MEDIA_PLAY, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 85, 32, 160, TelnetCommand.DONT, 108, 137, 23, 98, 23, 98, 75, 177, 180, NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, 209, 135, 201, 20, 60, 74, TransportMediator.KEYCODE_MEDIA_PLAY, 168, FTPReply.CLOSING_DATA_CONNECTION, FTPReply.DATA_CONNECTION_ALREADY_OPEN, 160, 159, TelnetCommand.AYT, 92, 106, 9, 141, 240, 15, FTPReply.ENTERING_PASSIVE_MODE, 83, 37, 149, 54, 40, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION}};

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m1149(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[8];
        for (int i2 = 0; i2 != 64; i2++) {
            int i3 = iArr2[i2] - 1;
            if ((iArr[((i3 >> 3) & 7) + i] & f5366[i3 & 7]) != 0) {
                int i4 = (i2 >> 3) & 7;
                iArr3[i4] = iArr3[i4] | f5366[i2 & 7];
            }
        }
        for (int i5 = 0; i5 < 8; i5++) {
            iArr[i + i5] = iArr3[i5];
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m1148(int[] iArr, int i) {
        int[] iArr2 = new int[8];
        iArr2[0] = ((iArr[i + 7] << 5) | (iArr[i + 4] >> 3)) & 63;
        iArr2[1] = ((iArr[i + 4] << 1) | (iArr[i + 5] >> 7)) & 63;
        iArr2[2] = ((iArr[i + 4] << 5) | (iArr[i + 5] >> 3)) & 63;
        iArr2[3] = ((iArr[i + 5] << 1) | (iArr[i + 6] >> 7)) & 63;
        iArr2[4] = ((iArr[i + 5] << 5) | (iArr[i + 6] >> 3)) & 63;
        iArr2[5] = ((iArr[i + 6] << 1) | (iArr[i + 7] >> 7)) & 63;
        iArr2[6] = ((iArr[i + 6] << 5) | (iArr[i + 7] >> 3)) & 63;
        iArr2[7] = ((iArr[i + 7] << 1) | (iArr[i + 4] >> 7)) & 63;
        for (int i2 = 0; i2 != 4; i2++) {
            iArr2[i2] = (f5364[i2][iArr2[i2 * 2]] & 240) | (f5364[i2][iArr2[(i2 * 2) + 1]] & 15);
        }
        for (int i3 = 4; i3 < 8; i3++) {
            iArr2[i3] = 0;
        }
        for (int i4 = 0; i4 != 32; i4++) {
            int i5 = f5363[i4] - 1;
            if ((iArr2[i5 >> 3] & f5366[i5 & 7]) != 0) {
                int i6 = (i4 >> 3) + 4;
                iArr2[i6] = iArr2[i6] | f5366[i4 & 7];
            }
        }
        int i7 = i + 0;
        iArr[i7] = iArr[i7] ^ iArr2[4];
        int i8 = i + 1;
        iArr[i8] = iArr[i8] ^ iArr2[5];
        int i9 = i + 2;
        iArr[i9] = iArr[i9] ^ iArr2[6];
        int i10 = i + 3;
        iArr[i10] = iArr[i10] ^ iArr2[7];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static byte[] m1150(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i];
        }
        for (int i2 = 0; i2 < iArr.length; i2 += 8) {
            int i3 = i2;
            for (int i4 = i3; i4 < i3 + 8; i4++) {
                iArr[i4] = ((iArr[i4] & 15) << 4) | ((iArr[i4] & 240) >>> 4);
            }
            m1149(iArr, i2, f5365);
            m1148(iArr, i2);
            m1149(iArr, i2, f5362);
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            bArr[i5] = (byte) iArr[i5];
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bf A[SYNTHETIC] */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.ug[] m1153(o.on r17, long r18, java.io.File r20, o.cs r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vc.m1153(o.on, long, java.io.File, o.cs):o.ug[]");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static byte[] m1151(byte[] bArr, int i, boolean z) {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        try {
            byte[] bArr2 = new byte[i];
            int iInflate = inflater.inflate(bArr2);
            if (z && iInflate != i) {
                pc.m994();
                return null;
            }
            return Arrays.copyOf(bArr2, iInflate);
        } catch (DataFormatException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final void m1147(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        int i6 = 0;
        if (i3 < 3) {
            i4 = 3;
        } else if (i3 < 5) {
            i4 = i3 + 1;
        } else {
            i4 = i3 < 7 ? i3 + 9 : i3 + 15;
        }
        int[] iArr = new int[bArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr[i7] = bArr[i7] & 255;
        }
        int i8 = 0;
        while (i8 * 8 < i) {
            if (i8 < 20 || (i2 == 0 && i8 % i4 == 0)) {
                m1149(iArr, i5, f5365);
                m1148(iArr, i5);
                m1149(iArr, i5, f5362);
            } else {
                if (i6 == 7 && i2 == 0) {
                    int[] iArr2 = new int[8];
                    for (int i9 = 0; i9 < 8; i9++) {
                        iArr2[i9] = iArr[i9 + i5];
                    }
                    i6 = 0;
                    iArr[i5 + 0] = iArr2[3];
                    iArr[i5 + 1] = iArr2[4];
                    iArr[i5 + 2] = iArr2[6];
                    iArr[i5 + 3] = iArr2[0];
                    iArr[i5 + 4] = iArr2[1];
                    iArr[i5 + 5] = iArr2[2];
                    iArr[i5 + 6] = iArr2[5];
                    int i10 = iArr2[7];
                    if (i10 == 0) {
                        i10 = 43;
                    } else if (i10 == 43) {
                        i10 = 0;
                    } else if (i10 == 1) {
                        i10 = 104;
                    } else if (i10 == 104) {
                        i10 = 1;
                    } else if (i10 == 72) {
                        i10 = NNTP.DEFAULT_PORT;
                    } else if (i10 == 119) {
                        i10 = 72;
                    } else if (i10 == 96) {
                        i10 = 255;
                    } else if (i10 == 255) {
                        i10 = 96;
                    } else if (i10 == 108) {
                        i10 = 128;
                    } else if (i10 == 128) {
                        i10 = 108;
                    } else if (i10 == 185) {
                        i10 = 192;
                    } else if (i10 == 192) {
                        i10 = 185;
                    } else if (i10 == 235) {
                        i10 = TelnetCommand.DONT;
                    } else if (i10 == 254) {
                        i10 = 235;
                    }
                    iArr[i5 + 7] = i10;
                }
                i6++;
            }
            i8++;
            i5 += 8;
        }
        for (int i11 = 0; i11 < iArr.length; i11++) {
            bArr[i11] = (byte) iArr[i11];
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static os m1146(ug ugVar) {
        return ugVar.m1117();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static ug[] m1152(File file, cs csVar) {
        on onVar = new on(new FileInputStream(file));
        try {
            ug[] ugVarArrM1153 = m1153(onVar, file.length(), file, csVar);
            onVar.close();
            return ugVarArrM1153;
        } catch (Exception e) {
            try {
                onVar.close();
                if (f5367 != null) {
                    f5367.mo549(file);
                }
                throw new ux(e);
            } catch (IOException e2) {
                throw new ux(e2);
            }
        }
    }
}
