package o;

import android.R;
import android.os.Build;
import android.support.v4.media.TransportMediator;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import o.je;
import o.pj;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.apache.http.HttpStatus;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* renamed from: o.ˮ͍, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0358 {

    /* renamed from: ą, reason: contains not printable characters */
    public static ln f6664;

    /* renamed from: ċ, reason: contains not printable characters */
    public static pj.C0079 f6667;

    /* renamed from: đ, reason: contains not printable characters */
    static C0361 f6668;

    /* renamed from: ȃ, reason: contains not printable characters */
    public static b f6671;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public static String f6672;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public static c_activity f6674;

    /* renamed from: ܕ, reason: contains not printable characters */
    public static dl f6676;

    /* renamed from: 㱽, reason: contains not printable characters */
    private static /* synthetic */ int[] f6677;

    /* renamed from: 㵼, reason: contains not printable characters */
    private static /* synthetic */ int[] f6678;

    /* renamed from: 䒧, reason: contains not printable characters */
    public static C0428 f6679;

    /* renamed from: 岱, reason: contains not printable characters */
    public static String f6681;

    /* renamed from: 廂, reason: contains not printable characters */
    static String f6683;

    /* renamed from: 櫯, reason: contains not printable characters */
    public static cv f6685;

    /* renamed from: 纫, reason: contains not printable characters */
    public static Cif f6686;

    /* renamed from: 躆, reason: contains not printable characters */
    public static hw f6687;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static C0358 f6688;

    /* renamed from: Ē, reason: contains not printable characters */
    int f6689;

    /* renamed from: ē, reason: contains not printable characters */
    byte f6690;

    /* renamed from: ė, reason: contains not printable characters */
    C0359 f6691;

    /* renamed from: Ę, reason: contains not printable characters */
    og f6692;

    /* renamed from: ę, reason: contains not printable characters */
    public C0360 f6693;

    /* renamed from: ঽ্, reason: contains not printable characters */
    public byte[] f6694;

    /* renamed from: 㥳, reason: contains not printable characters */
    boolean f6695 = false;

    /* renamed from: 띥, reason: contains not printable characters */
    public int f6696;

    /* renamed from: Ƞ, reason: contains not printable characters */
    private static final byte[] f6673 = {0, -128, 60, 82, -15, -8, 2, 6, -5, 1, -10, 10, -4, -7, 0, 7, -9, 5, -3, 12, -8, -4, 6, 54, -69, 2, -2, -3, 2, -8, 12, 4, -2, -14, 67, -67, 7, 0, -4, 4, -11, 1, 7, -8, 4, 1, -9, 1, -14, 9, -15, 2, 64, -69, 16, -7, -8, 12, -18, 2, 3, 61, -66, -2, -5, -2, 18, -12, 4, -3, 7, 50, -54, -13, 1, -4, 7, -3, -6, 63, -54, -16, 12, 3, -20, 10, -14, 16, 55, -63, 1, -6, 6, -13, 0, 2, 64, -54, -13, 1, 0, -4, 4, -5, -4, 1, 4, -5, -4, 6, -5, -1, 0, -3, -7, 10, -8, -5, 10, -4, -9, 3, 6, -4, -7, 5, -2, -7, 9, -4, -9, -1, 10, -4, -4, 0, 4, -4, 0, -7, -4, 7, -3, -6, 63, -65, 8, -19, 16, 0, -10, -5, 8, -10, 67, -69, 2, 13, -14, -5, 67, 3, -55, 2, -18, 2, 64, -57, -13, 6, -19, 9, 6, -7, 6, -19, -1, 17, -14, 63, -54, -13, 1, -6, -10, 12, 1, -18, 69, -71, 10, 59, -71, 13, -14, -5, 16, -14, 67, -54, -13, 1, -14, 9, -15, 2, 64, -54, -16, 16, -26, 0, 8, 0, -4, 8, -6, 6, 56, -54, -13, 1, -2, -11, 63, -69, 2, 65, -68, 7, -8, 9, -10, 4, -16, 73, -54, -13, 1, 11, 57, -59, -7, -2, 1, 1, 5, -10, 6, 56, -54, -13, 1, 0, -9, 9, -9, 4, 2, -4, -8, 6, 2, -12, 4, 14, -4, 6, -14, 2, 1, -2, 63, -55, -1, -11, -6, 68, -60, -6, 7, -10, -6, 3, 3, -5, -3, -5, 9, -12, 5, 4, -4, -7, 5, -13, 0, -1, 8, 1, -18, 1, 2, 64, -63, 6, -18, 12, 7, -20, 11, 6, -14, -5, 2, 64, -54, -13, 1, -14, 9, -15, 2, 64, -55, 2, -18, 6, 61, -70, 2, 64, -54, -13, 1, -3, -7, 10, -12, -1, 10, -4, 0, -8, 8, -4, 0, -3, 0, -4, 4, -11, 1, 7, -8, 4, 1, -4, -1, 0, 3, 10, -25, 74, -71, 11, 6, -9, -10, 2, 64, -60, -6, 63, -71, 11, -14, 9, -15, 2, 64, -56, -15, 2, 0, -4, -3, 70, -70, 2, 64, -54, -13, 1, -14, 9, -15, 2, 64, -57, -13, 12, -1, 55, -70, 16, -7, -8, 12, -18, 2, 3, -5, 0, 1, 2, -6, 8, 54, -54, -13, 1, 13, -14, -5, 16, -14, 67, -69, 2, 11, -13, 1, 6, -20, 74, -54, -13, 1, 1, -3, 3, -12, 10, -12, 8, 1, -11, -2, 0, -4, 4, -5, -4, 1, 4, -10, 3, 4, -4, -2, -7, 5, -13, 7, 54, -69, 2, 65, -68, -3, 2, 0, -7, 14, -14, 16, 50, -54, -13, 1, -6, 3, 3, -5, -3, -5, 9, -12, 5, 4, -11, -2, 3, 10, -25, 74, -69, 2, 65, -58, -13, 12, -1, 0, -12, 1, 62, -54, -13, 1, -14, 9, -15, 2, 64, -69, 2, 65, -55, -10, 10, -19, 10, 2, 0, 53, -54, -13, 1, -2, -6, 8, -3, 1, -3, 1, -4, 13, -14, -5, 16, -14, 67, -67, 0, -4, 8, -6, 6, 57, -71, 13, -14, -5, 12, 5, -3, 54, -54, -13, 1, -6, 3, 3, -5, -3, -5, 9, -12, 5, 4, -4, -1, 0, -6, 3, 3, -5, -3, -5, 9, -12, 5, 4, -5, -4, 3, -3, -7, 10, -12, -1, 10, -4, -2, -3, 5, -4, -2, -6, 3, 3, -5, -3, -5, 9, -12, 5, 4, -4, -1, -7, 0, -5, 5, -4, -5, 1, 4, -4, 0, -10, 10, -5, -2, 1, -1, 7, -4, -5, 3, 2, -4, -3, -6, 9, -4, -8, 1, -14, 9, -15, 2, 64, -56, 0, -2, -10, 64, -70, 67, -54, -13, 1, 0, -4, 4, -11, 1, 7, -8, 4, 1, -10, 1, -1, -9, 10, -11, 6, 2, -10, -3, 10, -5, 0, 0, -4, 4, -11, 1, 7, -8, 4, 1, -10, 6, -14, 9, -15, 2, 64, -69, 16, -7, -8, 12, -18, 2, 3, -8, 12, -16, -2, 2, 3, 63, -67, 7, -2, -7, 9, -5, -3, 2, 2, -12, 6, 3, -4, -6, 3, 62, -53, -12, 16, -22, 12, -12, -6, 74, -54, -13, 1, -14, 9, -15, 2, 64, -66, 2, 7, -16, 15, -6, -8, -1, 2, 62, -70, 2, 64, -65, 8, -16, -15, 16, -7, -9, 0, 63, -69, 2, -4, 12, -16, 1, 2, 64, -54, -13, 1, 3, 10, -25, 71, 2, -59, -2, 5, -10, 10, -19, -1, 69, -70, 2, 64, -54, -13, 1, -14, 9, -15, 2, 64, -69, 16, -7, -8, 12, -18, 12, -18, 6, 64, -54, -13, 1, 10, 0, 8, 54, -54, -10, 10, -19, -1, 9, 5, -16, 2, 64, -65, 8, -16, -14, 9, -15, 2, 64, -52, -5, -18, 20, 51, -70, 2, 64, -54, -13, 1, 12, -14, 3, 10, -25, 74, -74, 17, -8, -4, -8, 16, 55, -70, 2, 64, -54, -13, 1, -8, 8, 5, -13, 7, 54, -69, 12, -8, 10, -24, 74, -70, 2, 64, -54, -13, 1, 0, -4, 4, -11, 1, 7, -8, 4, 1, -4, -3, -5, 6, 1, -6, -3, 6, -5, 1, -6, 6, -5, 0, 0, -6, 7, -4, 0, -6, 6, -4, -7, 5, 2, -8, -5, -3, -7, 10, -12, -1, 10, -7, -4, 8, -8, 2, 0, -4, 4, -5, -4, 1, 4, -10, 3, 4, -5, 1, -3, -14, 9, -15, 2, 64, -67, 3, 10, -25, 6, 16, -7, -8, 12, -18, 2, 3, 60, -67, 7, -4, 7, -3, -6, -6, 13, -14, -5, 16, -14, 67, -71, 10, -12, 18, -14, -5, 2, 64, -65, 8, -16, -3, -7, 10, -12, -1, 10, -5, 0, 2, -4, -3, 2, -3, -7, 10, -12, -1, 10, 
    -5, 0, 2, -4, -3, 1, 13, -14, -5, 16, -14, 67, -53, -20, 2, 3, -5, 16, -7, -8, 12, -18, 2, 3, 60, -54, -13, 1, 3, 3, -5, -2, 4, -4, 2, -8, 2, -14, 9, -15, 2, 64, -69, 16, -7, -8, 12, -6, -10, -4, 14, -3, 54, -65, 8, -16, 0, -4, 4, -6, 1, 2, -5, -4, 4, 1, -9, -2, 0, -5, 5, -4, -5, 1, 4, -4, 0, -10, 10, -12, 8, -14, 9, -15, 2, 64, -66, -5, 9, -10, 8, -11, 69, -70, 2, 64, -54, -13, 1, -14, 9, -15, 2, 64, -64, -3, 12, -8, 59, -70, 2, 64, -65, 8, -16, 0, -4, 4, -4, -6, 7, -4, -9, -1, 10, -10, 3, -14, 9, -15, 2, 64, -70, -3, 17, -1, -3, -15, -1, 69, -70, 2, 64, -65, 8, -16, -1, 7, -4, -5, 3, 2, -4, -3, -6, 9, -4, -3, 0, 3, 2, -10, -3, 10, -4, -4, 0, 4, -7, -5, -1, 7, -4, -5, 4, 1, -4, -8, -1, 9, -4, -3, 0, -6, 3, 3, -5, -4, 3, 2, -4, -6, -2, 8, -4, -3, 2, 10, 0, 8, 54, -52, -13, 11, -20, 0, -3, 2, 2, 64, -54, -13, 1, 14, -4, 6, -14, 2, 64, -55, -11, -6, 13, -16, 69, -54, -13, 1, -14, 9, -15, 2, 64, -53, -17, 8, 1, -2, -13, 1, 2, 64, -65, 8, -16, -3, -7, 10, -12, -1, 10, -11, 9, -5, -2, -6, -14, 9, -15, 2, 64, -56, 3, -18, 5, -14, 75, -70, 2, 64, -54, -13, 1, -2, -7, 9, -5, -3, 2, 2, -12, 6, 3, -4, -3, -1, -4, 7, -3, -6, 63, -64, -3, -6, 1, 67, -66, 0, 1, 2, -6, 8, -14, 9, -15, 2, 64, -52, -20, 7, 10, -19, 69, -70, 2, 64, -54, -13, 1, -2, 6, -10, 0, 7, -4, -8, -2, 10, -5, -4, 1, -4, 7, -3, -6, 63, -54, -10, 10, -19, -1, 64, 4, -70, 2, 64, -54, -13, 1, -14, 9, -15, 2, 64, -70, 17, -18, 16, -8, -12, 13, -14, -5, 16, -14, 67, -65, 8, -16, -5, -4, 9, -9, -4, 10, -5, -4, 0, 5, -9, 4, 0, -5, 5, -4, -5, 1, 4, -4, 0, -10, 10, -10, 6, 13, -14, -5, 16, -14, 67, -69, 2, 1, 3, 4, -4, 5, -18, 13, 53, -54, -13, 1, -4, 7, -3, -6, 63, -60, -6, 7, 4, -13, -13, 6, 2, 64, -54, -13, 1, -13, 0, -1, 8, 1, -18, 69, -70, 13, -14, -5, 16, -14, 64, -8, 9, -67, 3, 10, -25, 21, -16, 2, -9, 8, 63, -54, -13, 1, 5, -13, 7, 54, -69, 12, 2, -8, -10, -3, 11, 57, -69, 2, 5, -13, 7, -8, -4, 7, -3, -6, 63, -69, 16, -7, -8, 12, -18, 12, -18, 12, -14, 20, -12, 61, -54, -13, 1, -3, -7, 10, -12, -1, 10, -11, -2, 10, -5, 0, -2, 0, 1, -3, 1, -5, 3, -5, -4, 5, -4, 2, -5, -7, 9, -4, -9, 4, -3, -7, 10, -12, -1, 10, -4, -2, -4, 6, -4, 0, -10};

    /* renamed from: ġ, reason: contains not printable characters */
    private static int f6670 = 104;

    /* renamed from: Ą, reason: contains not printable characters */
    public static C0919 f6663 = new C0919();

    /* renamed from: Ć, reason: contains not printable characters */
    public static el f6665 = new el();

    /* renamed from: ć, reason: contains not printable characters */
    public static int f6666 = 0;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public static bo f6675 = new bo();

    /* renamed from: 庸, reason: contains not printable characters */
    public static boolean f6682 = false;

    /* renamed from: Ė, reason: contains not printable characters */
    public static ly f6669 = null;

    /* renamed from: 囃, reason: contains not printable characters */
    static Runnable f6680 = new RunnableC0674();

    /* renamed from: 廅, reason: contains not printable characters */
    static final C0362[] f6684 = {new C0362(0, null), new C0362(128, "shift_jis"), new C0362(129, "windows-949"), new C0362(134, "gb2312"), new C0362(136, "big5"), new C0362(161, "windows-1253"), new C0362(162, "windows-1254"), new C0362(163, "windows-1258"), new C0362(177, "windows-1255"), new C0362(178, "windows-1256"), new C0362(186, "windows-1257"), new C0362(HttpStatus.SC_NO_CONTENT, "windows-1251"), new C0362(NNTPReply.ARTICLE_RETRIEVED_BODY_FOLLOWS, "windows-874"), new C0362(TelnetCommand.ABORT, "windows-1250")};

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m1303(int i, int i2, int i3) {
        int i4 = i2 + 5;
        byte[] bArr = f6673;
        int i5 = 30 - i3;
        int i6 = 122 - i;
        int i7 = 0;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i4++;
            i6 = (i4 + (-i5)) - 1;
        }
        while (true) {
            int i8 = i7;
            i7++;
            bArr2[i8] = (byte) i6;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            int i9 = i6;
            int i10 = bArr[i4];
            i4++;
            i6 = (i9 + (-i10)) - 1;
        }
    }

    /* renamed from: 䒧, reason: contains not printable characters */
    private static /* synthetic */ int[] m1299() {
        int[] iArr = f6677;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[pj.aux.valuesCustom().length];
        try {
            iArr2[pj.aux.AevaRO.ordinal()] = 7;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[pj.aux.AlbertaServer.ordinal()] = 64;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[pj.aux.AmatsuRO.ordinal()] = 42;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[pj.aux.AtlasRO.ordinal()] = 8;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[pj.aux.AustinRO.ordinal()] = 50;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[pj.aux.BalikRagnaPH.ordinal()] = 107;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[pj.aux.BarnabyRO.ordinal()] = 37;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[pj.aux.BgRO.ordinal()] = 87;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[pj.aux.Blytanias.ordinal()] = 71;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[pj.aux.BrightRO.ordinal()] = 51;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[pj.aux.BurnRO.ordinal()] = 103;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[pj.aux.C2RO.ordinal()] = 85;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[pj.aux.ChaosReborn.ordinal()] = 56;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[pj.aux.ChenRO.ordinal()] = 11;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[pj.aux.Class2RO.ordinal()] = 23;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[pj.aux.Classic2RoInTh.ordinal()] = 47;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[pj.aux.ClassicRONet.ordinal()] = 15;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[pj.aux.CrazyPoring.ordinal()] = 68;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[pj.aux.CreativeKingsRO.ordinal()] = 32;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[pj.aux.CrownRO.ordinal()] = 21;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[pj.aux.DarkRO.ordinal()] = 105;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[pj.aux.Daro.ordinal()] = 48;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[pj.aux.EarlyRO.ordinal()] = 102;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[pj.aux.Eden3.ordinal()] = 22;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[pj.aux.EliteRO.ordinal()] = 106;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[pj.aux.EosRagnarokOnline.ordinal()] = 25;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[pj.aux.ForceRO.ordinal()] = 89;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[pj.aux.FreePlayRoCom.ordinal()] = 43;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[pj.aux.FreeRO.ordinal()] = 9;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[pj.aux.FreeRoWeb.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[pj.aux.GRANDRO.ordinal()] = 77;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[pj.aux.GachoRO.ordinal()] = 58;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[pj.aux.GarciaRO.ordinal()] = 70;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[pj.aux.Gugusjungs57572.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[pj.aux.IfritRagnarokCom.ordinal()] = 41;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[pj.aux.InfamyRO.ordinal()] = 16;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[pj.aux.KafraRO.ordinal()] = 55;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[pj.aux.KryptGamingClassic.ordinal()] = 90;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[pj.aux.LeonardRO.ordinal()] = 40;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[pj.aux.LevelRO.ordinal()] = 94;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[pj.aux.LeviathanRO.ordinal()] = 100;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[pj.aux.LibRO.ordinal()] = 60;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[pj.aux.LidiaRO.ordinal()] = 33;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[pj.aux.LucianoRO.ordinal()] = 69;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[pj.aux.MOTR.ordinal()] = 4;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[pj.aux.MOTR_home.ordinal()] = 5;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[pj.aux.MidgardRO.ordinal()] = 110;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[pj.aux.MobiRO.ordinal()] = 27;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[pj.aux.Modify_Full.ordinal()] = 75;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[pj.aux.MyRO.ordinal()] = 10;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[pj.aux.MyRebornRO.ordinal()] = 79;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[pj.aux.NewFenrirRoGameNet.ordinal()] = 92;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[pj.aux.Newyear.ordinal()] = 76;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[pj.aux.NorseRO.ordinal()] = 62;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[pj.aux.OMGRO.ordinal()] = 73;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[pj.aux.OSRO2019.ordinal()] = 91;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[pj.aux.OcrClassicCom.ordinal()] = 83;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[pj.aux.OfficialragnarokCom.ordinal()] = 95;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[pj.aux.OldchaosROCom.ordinal()] = 31;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[pj.aux.OldschoolragnarokCom.ordinal()] = 66;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[pj.aux.OsirisRO.ordinal()] = 97;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[pj.aux.PayonRO.ordinal()] = 96;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[pj.aux.PhRoNet.ordinal()] = 109;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[pj.aux.PhoenixRO.ordinal()] = 20;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr2[pj.aux.PhoenixRO2.ordinal()] = 82;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr2[pj.aux.PinoyRO.ordinal()] = 72;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr2[pj.aux.PlayLokiServerCom.ordinal()] = 29;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr2[pj.aux.PlayValhallaNet.ordinal()] = 104;
        } catch (NoSuchFieldError unused68) {
        }
        try {
            iArr2[pj.aux.PlayragnarokPh.ordinal()] = 17;
        } catch (NoSuchFieldError unused69) {
        }
        try {
            iArr2[pj.aux.PlayvalhallaPh.ordinal()] = 46;
        } catch (NoSuchFieldError unused70) {
        }
        try {
            iArr2[pj.aux.ROClashed.ordinal()] = 88;
        } catch (NoSuchFieldError unused71) {
        }
        try {
            iArr2[pj.aux.ROComfy.ordinal()] = 98;
        } catch (NoSuchFieldError unused72) {
        }
        try {
            iArr2[pj.aux.ROProviderValkyrie.ordinal()] = 13;
        } catch (NoSuchFieldError unused73) {
        }
        try {
            iArr2[pj.aux.Ragnaclan.ordinal()] = 38;
        } catch (NoSuchFieldError unused74) {
        }
        try {
            iArr2[pj.aux.Ragnajapan.ordinal()] = 101;
        } catch (NoSuchFieldError unused75) {
        }
        try {
            iArr2[pj.aux.RagnarevivalCom.ordinal()] = 35;
        } catch (NoSuchFieldError unused76) {
        }
        try {
            iArr2[pj.aux.Ragnarevo.ordinal()] = 67;
        } catch (NoSuchFieldError unused77) {
        }
        try {
            iArr2[pj.aux.RagnarokIsLife.ordinal()] = 93;
        } catch (NoSuchFieldError unused78) {
        }
        try {
            iArr2[pj.aux.RagnarokPuzzle.ordinal()] = 74;
        } catch (NoSuchFieldError unused79) {
        }
        try {
            iArr2[pj.aux.RagnarokReturnPh.ordinal()] = 57;
        } catch (NoSuchFieldError unused80) {
        }
        try {
            iArr2[pj.aux.RebirthRO_Ancyker.ordinal()] = 36;
        } catch (NoSuchFieldError unused81) {
        }
        try {
            iArr2[pj.aux.RelaxRO.ordinal()] = 86;
        } catch (NoSuchFieldError unused82) {
        }
        try {
            iArr2[pj.aux.RoFaction.ordinal()] = 53;
        } catch (NoSuchFieldError unused83) {
        }
        try {
            iArr2[pj.aux.RoFreedom.ordinal()] = 84;
        } catch (NoSuchFieldError unused84) {
        }
        try {
            iArr2[pj.aux.RoHeimdallCom.ordinal()] = 44;
        } catch (NoSuchFieldError unused85) {
        }
        try {
            iArr2[pj.aux.RoPronteraEp5.ordinal()] = 99;
        } catch (NoSuchFieldError unused86) {
        }
        try {
            iArr2[pj.aux.RoRetro.ordinal()] = 59;
        } catch (NoSuchFieldError unused87) {
        }
        try {
            iArr2[pj.aux.SakrayPh.ordinal()] = 78;
        } catch (NoSuchFieldError unused88) {
        }
        try {
            iArr2[pj.aux.SarahServer.ordinal()] = 18;
        } catch (NoSuchFieldError unused89) {
        }
        try {
            iArr2[pj.aux.SecretRO.ordinal()] = 61;
        } catch (NoSuchFieldError unused90) {
        }
        try {
            iArr2[pj.aux.ShinServer.ordinal()] = 24;
        } catch (NoSuchFieldError unused91) {
        }
        try {
            iArr2[pj.aux.SolaceRO.ordinal()] = 108;
        } catch (NoSuchFieldError unused92) {
        }
        try {
            iArr2[pj.aux.SuccessRoNet.ordinal()] = 19;
        } catch (NoSuchFieldError unused93) {
        }
        try {
            iArr2[pj.aux.ThaiRoInTh.ordinal()] = 39;
        } catch (NoSuchFieldError unused94) {
        }
        try {
            iArr2[pj.aux.Thai_id9169.ordinal()] = 45;
        } catch (NoSuchFieldError unused95) {
        }
        try {
            iArr2[pj.aux.TheClassicROCom.ordinal()] = 14;
        } catch (NoSuchFieldError unused96) {
        }
        try {
            iArr2[pj.aux.TitanRO.ordinal()] = 52;
        } catch (NoSuchFieldError unused97) {
        }
        try {
            iArr2[pj.aux.Trinity_Reborn_Full.ordinal()] = 63;
        } catch (NoSuchFieldError unused98) {
        }
        try {
            iArr2[pj.aux.TyrServer.ordinal()] = 26;
        } catch (NoSuchFieldError unused99) {
        }
        try {
            iArr2[pj.aux.WeDevGames.ordinal()] = 12;
        } catch (NoSuchFieldError unused100) {
        }
        try {
            iArr2[pj.aux.WeloveRo.ordinal()] = 54;
        } catch (NoSuchFieldError unused101) {
        }
        try {
            iArr2[pj.aux.XileRO.ordinal()] = 6;
        } catch (NoSuchFieldError unused102) {
        }
        try {
            iArr2[pj.aux.XileRO2019.ordinal()] = 80;
        } catch (NoSuchFieldError unused103) {
        }
        try {
            iArr2[pj.aux.XileROOS.ordinal()] = 28;
        } catch (NoSuchFieldError unused104) {
        }
        try {
            iArr2[pj.aux.eA.ordinal()] = 111;
        } catch (NoSuchFieldError unused105) {
        }
        try {
            iArr2[pj.aux.eSport2019.ordinal()] = 81;
        } catch (NoSuchFieldError unused106) {
        }
        try {
            iArr2[pj.aux.fRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused107) {
        }
        try {
            iArr2[pj.aux.hiclassro.ordinal()] = 65;
        } catch (NoSuchFieldError unused108) {
        }
        try {
            iArr2[pj.aux.iPlayRo201804.ordinal()] = 49;
        } catch (NoSuchFieldError unused109) {
        }
        try {
            iArr2[pj.aux.iRO_Renewal.ordinal()] = 1;
        } catch (NoSuchFieldError unused110) {
        }
        try {
            iArr2[pj.aux.kRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused111) {
        }
        f6677 = iArr2;
        return iArr2;
    }

    /* renamed from: 纫, reason: contains not printable characters */
    private static /* synthetic */ int[] m1302() {
        int[] iArr = f6678;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[pj.Cif.valuesCustom().length];
        try {
            iArr2[pj.Cif.America.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[pj.Cif.Australia.ordinal()] = 14;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[pj.Cif.Brazil.ordinal()] = 13;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[pj.Cif.Chile.ordinal()] = 18;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[pj.Cif.China.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[pj.Cif.France.ordinal()] = 19;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[pj.Cif.Germany.ordinal()] = 11;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[pj.Cif.India.ordinal()] = 12;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[pj.Cif.Indonesia.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[pj.Cif.Japan.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[pj.Cif.Korea.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[pj.Cif.Malaysia.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[pj.Cif.Philippine.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[pj.Cif.Russia.ordinal()] = 15;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[pj.Cif.Singapore.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[pj.Cif.Taiwan.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[pj.Cif.Thai.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[pj.Cif.UAE.ordinal()] = 20;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[pj.Cif.Unknown.ordinal()] = 17;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[pj.Cif.Vietnam.ordinal()] = 16;
        } catch (NoSuchFieldError unused20) {
        }
        f6678 = iArr2;
        return iArr2;
    }

    /* renamed from: o.ˮ͍$櫯, reason: contains not printable characters */
    class C0361 {

        /* renamed from: Ą, reason: contains not printable characters */
        String f6709;

        /* renamed from: ȃ, reason: contains not printable characters */
        String f6711;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        String f6712;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6713;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f6714;

        C0361() {
        }
    }

    /* renamed from: o.ˮ͍$if, reason: invalid class name */
    class Cif {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f6698;

        /* renamed from: 櫯, reason: contains not printable characters */
        String f6699;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f6700;

        Cif(String str, String str2, int i) {
            this.f6700 = str;
            this.f6699 = str2;
            this.f6698 = i;
        }
    }

    /* renamed from: o.ˮ͍$ȃ, reason: contains not printable characters */
    class C0359 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        Cif[] f6702;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6703;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f6704;

        C0359() {
        }
    }

    /* renamed from: o.ˮ͍$ˮ͈, reason: contains not printable characters */
    class C0360 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        public short f6706;

        /* renamed from: 櫯, reason: contains not printable characters */
        public String f6707;

        /* renamed from: 鷭, reason: contains not printable characters */
        public String f6708;

        public C0360() {
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1305() {
        f6685 = new cv();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1309(pj.C0079 c0079) {
        int i;
        f6667 = c0079;
        b bVar = f6671;
        tx amVar = f6667.f4776 == pj.EnumC0074.HERCULES ? new am(f6667.f4800, f6667.f4833) : new al(f6667.f4802, f6667.f4771);
        bVar.f765 = amVar;
        bVar.f768.f4994 = amVar;
        f6687.m658("server_name", 0, c0079.f4851);
        pj.EnumC0078 enumC0078 = f6667.f4772.length > 0 ? f6667.f4772[0] : null;
        if (enumC0078 == pj.EnumC0078.ru) {
            i = 1251;
        } else if (enumC0078 == pj.EnumC0078.th) {
            i = 874;
        } else {
            switch (m1302()[f6667.f4814.ordinal()]) {
                case 1:
                    i = 0;
                    break;
                case 2:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                default:
                    i = 0;
                    break;
                case 3:
                    i = 932;
                    break;
                case 4:
                    i = 936;
                    break;
                case 5:
                    i = 950;
                    break;
                case 6:
                    i = 874;
                    break;
                case 15:
                    i = 1251;
                    break;
                case 16:
                    i = 1258;
                    break;
                case 18:
                    i = 1145;
                    break;
            }
        }
        if (i != 0) {
            pa.m980("windows-" + i);
        }
        nz.f3226 = f6674;
        if (oc.f3250 != my.localclient) {
            oc.f3240 = String.valueOf(oc.f3245) + "/" + c0079.f4851.toLowerCase();
        }
        pa.m955(String.valueOf(oc.f3240) + "/");
        f6668 = f6688.new C0361();
        LuaState.loadlibrary(false);
        LuaStateFactory.chdir(oc.f3240);
        f6676 = new dl();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static String m1300() {
        return " server=" + (f6667 != null ? String.valueOf(f6667.f4851) + " (" + f6667.f4809 + ":" + f6667.f4769 + ")" : "none") + " character=" + ((f6669 == null || f6669.f2048 == null || f6669.f2048.f1551 == null) ? "none" : String.valueOf(f6669.f2048.f1551.f2110.f8368) + "(" + f6669.f2048.f1551.f2110.f1998 + ":" + f6688.f6696 + "), " + EnumC0134.m1250(f6669.f2048.f1551.f2110.f2001).toString()) + " map=" + ((f6669 == null || f6669.f2063 == null) ? "none" : f6669.f2063.f6887) + " position=" + ((f6669 == null || f6669.f2048 == null || f6669.f2048.f1551 == null) ? "none" : f6669.f2048.f1551.f2110.f2002 + "," + f6669.f2048.f1551.f2110.f1999);
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static void m1297() {
        je jeVar = f6674.f42;
        if (jeVar.f1735 != null) {
            f6674.mo139(new jt(jeVar));
        }
        f6674.mo139(new jr(jeVar, "Initializing UI"));
        je jeVar2 = f6674.f42;
        LayoutInflater layoutInflater = (LayoutInflater) f6674.getSystemService("layout_inflater");
        jeVar2.f1797 = new n();
        jeVar2.f1774 = new je.C0056(jeVar2, f6674);
        jeVar2.f1809 = new je.Cif(jeVar2, f6674);
        jeVar2.f1810 = new C0778();
        jeVar2.f1781 = new ch(f6674);
        jeVar2.f1800 = new hj(layoutInflater);
        jeVar2.f1740 = new ij(layoutInflater);
        jeVar2.f1741 = new C0653(layoutInflater);
        jeVar2.f1820 = new C0398(layoutInflater);
        jeVar2.f1785 = new C0744(layoutInflater);
        jeVar2.f1742 = new ge(layoutInflater);
        jeVar2.f1743 = new C0399(layoutInflater);
        jeVar2.f1744 = new j(layoutInflater);
        jeVar2.f1745 = new C1024(layoutInflater);
        jeVar2.f1783 = new y();
        jeVar2.f1802 = new gk();
        jeVar2.f1787 = new C0570();
        jeVar2.f1786 = new ip();
        jeVar2.f1775 = new C0649();
        jeVar2.f1746 = new az();
        jeVar2.f1782 = new au();
        jeVar2.f1747 = new C1046();
        jeVar2.f1748 = new C0727();
        jeVar2.f1739 = new gy();
        jeVar2.f1749 = new iz();
        jeVar2.f1750 = new ls();
        jeVar2.f1752 = new C0483();
        jeVar2.f1803 = new fe();
        jeVar2.f1753 = new C0876();
        jeVar2.f1754 = new C0569();
        jeVar2.f1755 = new C1025();
        jeVar2.f1804 = new C0502();
        jeVar2.f1756 = new C0490();
        jeVar2.f1817 = new C0804();
        jeVar2.f1757 = new cl();
        jeVar2.f1807 = new C0523();
        jeVar2.f1816 = new eh();
        jeVar2.f1798 = new dx();
        jeVar2.f1793 = new eb();
        jeVar2.f1808 = new C0841();
        m1295();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1307(String str) {
        if (f6671.f749 != null && f6671.f749.f777 == ns.LOGIN && str == null && f6667.f4776 == pj.EnumC0074.AEGIS) {
            return;
        }
        f6671.f750 = null;
        f6671.f751 = null;
        if (f6674.f42.f1817 != null) {
            C0804 c0804 = f6674.f42.f1817;
            View viewFindViewById = ((ViewGroup) f6674.findViewById(R.id.content)).findViewById(2131296320);
            if (viewFindViewById != null && viewFindViewById == c0804.f7876) {
                View viewFindViewById2 = ((ViewGroup) f6674.findViewById(R.id.content)).findViewById(2131296320);
                if (viewFindViewById2 != null && viewFindViewById2 == c0804.f7876) {
                    f6674.setContentView(2130903090);
                }
                m1295();
            }
        }
        f6688.f6693 = null;
        f6679 = null;
        f6674.mo139(new RunnableC0227(str));
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public static void m1295() {
        if (f6671.f757 != null) {
            f6671.f757.f772 = null;
        }
        b bVar = f6671;
        if (bVar.f757 != null) {
            bVar.f757.f774 = true;
        }
        f6674.mo139(new jt(f6674.f42));
        if (f6674.f42.f1773 != null) {
            f6674.f42.f1773.dismiss();
            f6674.f42.f1773 = null;
        }
        f6675.mo139(new RunnableC0838());
    }

    /* renamed from: Ą, reason: contains not printable characters */
    static long m1290() throws NumberFormatException {
        try {
            long j = Long.parseLong("android_id");
            if (j > 0) {
                return j;
            }
        } catch (NumberFormatException unused) {
        }
        try {
            long j2 = Long.parseLong(Build.SERIAL);
            if (j2 > 0) {
                return j2;
            }
        } catch (NumberFormatException unused2) {
        }
        long jM648 = f6687.m648("ii", 0);
        if (jM648 != 0) {
            return jM648;
        }
        long jNextInt = new Random(System.currentTimeMillis()).nextInt();
        f6687.m658("ii", 0, String.valueOf((int) jNextInt));
        return jNextInt;
    }

    /* renamed from: ą, reason: contains not printable characters */
    public static final void m1291() {
        if (1617235200000L < System.currentTimeMillis()) {
            if (oc.f3250 == my.all) {
                nz.m907("!!! Evaluation expired !!!");
                return;
            }
            c_activity c_activityVar = f6674;
            RunnableC0581 runnableC0581 = new RunnableC0581();
            if (c_activityVar.f47 != null) {
                c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, runnableC0581), 25000L);
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1310(pj.C0079 c0079, String str, String str2) {
        f6681 = str;
        f6672 = str2;
        String str3 = c0079.f4809;
        byte b = f6673[277];
        byte b2 = f6673[157];
        byte b3 = f6673[0];
        int i = -f6673[362];
        byte b4 = f6673[265];
        byte b5 = f6673[146];
        byte b6 = f6673[277];
        byte b7 = f6673[277];
        byte b8 = f6673[235];
        byte b9 = f6673[0];
        byte b10 = f6673[235];
        byte b11 = f6673[34];
        byte b12 = f6673[235];
        byte b13 = f6673[235];
        byte b14 = f6673[235];
        byte b15 = f6673[177];
        byte b16 = f6673[235];
        String[] strArr = {m1303(f6673[265], 1281, f6673[157]), m1303(f6673[235], 705, f6673[54]), m1303(f6673[235], 1268, f6673[54]), m1303(b, b | 955, f6673[835]), m1303(-f6673[362], 822, f6673[157]), m1303(-f6673[362], 1297, f6673[19]), m1303(-f6673[362], 389, f6673[9]), m1303(f6673[235], 1376, f6673[54]), m1303(f6673[235], 1051, f6673[177]), m1303(f6673[235], 1063, f6673[54]), m1303(b2, b2, f6673[11]), m1303(f6670 & 478, 434, -f6673[147]), m1303(b3, b3 | 805, f6673[19]), m1303(-f6673[362], 730, f6673[146]), m1303(f6673[265], 1408, f6673[19]), m1303(-f6673[362], 935, f6673[49]), m1303(-f6673[362], 1344, f6673[49]), m1303(-f6673[362], 1122, f6673[11]), m1303(23, 1425, f6673[0]), m1303(i, i | 610, f6673[265]), m1303(b4, b4 | 1312, f6673[239]), m1303(b5, b5 | 710, f6673[177]), m1303(f6670 & 478, 898, f6673[54]), m1303(b6, b6 | 554, f6673[54]), m1303(-f6673[362], 1094, f6673[157]), m1303(f6673[6], 1208, f6673[265]), m1303(f6673[6], 260, f6673[19]), m1303(f6673[277], 1165, f6673[54]), m1303(f6673[235], 1110, f6673[177]), m1303(b7, b7 | 1073, f6673[54]), m1303(f6673[265], f6673[387], f6673[31]), m1303(b8, b8 | 22, f6673[54]), m1303(-f6673[362], 371, f6673[239]), m1303(-f6673[147], 1468, f6673[31]), m1303(-f6673[147], 1454, f6673[744]), m1303(f6673[235], f6670 & 176, f6673[66]), m1303(f6673[235], 1364, f6673[177]), m1303(f6673[11], 355, f6673[157]), m1303(f6673[235], 343, f6673[177]), m1303(f6673[235], f6670 & 176, f6673[66]), m1303(f6673[235], 595, f6673[54]), m1303(b9, b9 | 1192, f6673[157]), m1303(f6673[235], 650, f6673[66]), m1303(f6673[235], 661, f6673[66]), m1303(f6673[235], 570, f6673[54]), m1303(f6673[387], 1314, f6673[177]), m1303(f6673[15], 152, f6673[177]), m1303(f6673[235], 444, f6673[54]), m1303(f6673[235], 557, f6673[54]), m1303(f6673[235], 650, f6673[66]), m1303(f6673[235], f6670 & 176, f6673[66]), m1303(-f6673[362], 1223, f6673[19]), m1303(f6673[265], 955, f6673[15]), m1303(f6673[7], f6670 | TransportMediator.KEYCODE_MEDIA_RECORD, f6673[744]), m1303(f6673[11], 838, f6673[11]), m1303(f6673[235], 650, f6673[66]), m1303(f6673[235], 911, f6673[66]), m1303(-f6673[362], 683, f6673[15]), m1303(b10, b10 | 802, f6673[177]), m1303(-f6673[727], f6670 | 647, f6673[19]), m1303(b11, b11 | 820, f6673[66]), m1303(f6673[66], 164, f6673[744]), m1303(f6673[235], 922, f6673[54]), m1303(-f6673[727], 178, f6673[11]), m1303(f6673[235], 343, f6673[177]), m1303(f6673[11], 768, f6673[11]), m1303(f6673[235], f6670 | 144, f6673[177]), m1303(-f6673[362], 787, f6673[239]), m1303(-f6673[362], 197, f6673[49]), m1303(f6673[235], f6670 & 176, f6673[66]), m1303(b12, b12 | 802, f6673[177]), m1303(f6673[235], 1240, f6673[66]), m1303(f6673[235], 583, f6673[177]), m1303(b13, b13 | 916, f6673[177]), m1303(f6673[235], 672, f6673[66]), m1303(f6670 & 478, 434, -f6673[147]), m1303(f6673[15], FTPReply.DENIED_FOR_POLICY_REASONS, f6673[17]), m1303(b14, b14 | 802, f6673[177]), m1303(f6673[235], f6670 | 1408, -f6673[147]), m1303(f6673[235], 476, f6673[177]), m1303(f6673[6], 1208, f6673[265]), m1303(f6673[235], 650, f6673[66]), m1303(23, 217, f6673[19]), m1303(f6673[235], 608, f6673[744]), m1303(f6673[11], f6670 | 384, f6673[239]), m1303(f6673[235], 672, f6673[66]), m1303(b15, b15 | 840, f6673[239]), m1303(f6673[235], 977, f6673[177]), m1303(-f6673[362], f6670 | HttpStatus.SC_PAYMENT_REQUIRED, f6673[11]), m1303(-f6673[362], 1032, f6673[11]), m1303(b16, b16 | 48, f6673[744]), m1303(f6673[235], 1178, f6673[744]), m1303(f6673[265], 135, f6673[19]), m1303(-f6673[362], 43, f6673[6]), m1303(f6673[15], FTPReply.DENIED_FOR_POLICY_REASONS, f6673[17]), m1303(f6673[235], f6670 + 4, f6673[54]), m1303(f6673[15], FTPReply.DENIED_FOR_POLICY_REASONS, f6673[17]), m1303(-f6673[362], 1076, f6673[239]), m1303(f6673[15], HttpStatus.SC_EXPECTATION_FAILED, f6673[19]), m1303(-f6673[147], 457, f6673[11]), m1303(23, 290, f6673[17]), m1303(f6673[235], 1522, f6673[54]), m1303(-f6673[362], 1251, f6673[19]), m1303(f6673[15], f6670 | 897, f6673[15]), m1303(f6673[235], f6673[0], f6673[54]), m1303(-f6673[362], 314, f6673[157]), m1303(f6673[235], 330, f6673[54]), m1303(f6673[235], 1493, f6673[177]), m1303(f6673[188], 1154, f6673[66]), m1303(f6673[235], 277, f6673[54]), m1303(f6673[15], f6670 | 1285, f6673[11])};
        if (oc.f3250 == my.all) {
            String[] strArr2 = {m1303(f6673[235], 525, f6673[1450]), m1303(f6673[235], 1505, -f6673[727]), "192.168.1.7"};
            int length = strArr.length;
            Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + strArr2.length);
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                objArrCopyOf[i2 + length] = strArr2[i2];
            }
            strArr = (String[]) objArrCopyOf;
        }
        int i3 = 0;
        while (i3 < strArr.length && !str3.equals(strArr[i3])) {
            i3++;
        }
        if (i3 == strArr.length && oc.f3250 != my.localclient) {
            if (oc.f3250 == my.all) {
                nz.m907("!!! Used IP is not trusted !!!");
            } else {
                c_activity c_activityVar = f6674;
                RunnableC0869 runnableC0869 = new RunnableC0869();
                if (c_activityVar.f47 != null) {
                    c_activityVar.f47.postDelayed(new RunnableC1014(c_activityVar, runnableC0869), 3000L);
                }
            }
        }
        f6683 = "Failed to connect to login-server";
        switch (m1299()[c0079.f4771.ordinal()]) {
            case 2:
                b bVar = f6671;
                bVar.mo139(new e(bVar, c0079.f4809, c0079.f4769, ns.LOGIN, null, new f(bVar, new pk[]{new C0618(str, str2, c0079.f4770, c0079.f4847)}), f6680, f6680));
                break;
            case 4:
            case 5:
                C0644 c0644 = f6671.f753;
                c0644.f3364 = f6687.m648("v1", 0);
                String strM655 = f6687.m655("v2", 0);
                c0644.f3362 = pa.m960(strM655 == null ? null : strM655);
                if (c0644.f3362 != null) {
                    c0644.f3363 = Arrays.copyOf(c0644.f3362, 16);
                }
                String strM6552 = f6687.m655("v3", 0);
                c0644.f3360 = pa.m960(strM6552 == null ? null : strM6552);
                b bVar2 = f6671;
                bVar2.mo139(new e(bVar2, c0079.f4809, c0079.f4769, ns.LOCKER, null, new f(bVar2, new pk[]{new C0540()}), f6680, f6680));
                break;
            case 12:
                pk[] pkVarArr = {new C0959(pa.m960("2b0a2404e5ac21137cd5798df0618967")), new C0832(str, str2, c0079.f4770, c0079.f4847)};
                b bVar3 = f6671;
                bVar3.mo139(new e(bVar3, c0079.f4809, c0079.f4769, ns.LOGIN, null, new f(bVar3, pkVarArr), f6680, f6680));
                break;
            case 60:
                pk[] pkVarArr2 = {new C0959(pa.m960("9d22d1bc39ee6c7c1a5cc80dd0f476a9")), new C0832(str, str2, c0079.f4770, c0079.f4847)};
                b bVar4 = f6671;
                bVar4.mo139(new e(bVar4, c0079.f4809, c0079.f4769, ns.LOGIN, null, new f(bVar4, pkVarArr2), f6680, f6680));
                break;
            default:
                if (f6667.f4808) {
                    b bVar5 = f6671;
                    bVar5.mo139(new e(bVar5, c0079.f4809, c0079.f4769, ns.LOGIN, null, new f(bVar5, new pk[]{new C0964(str, str2, c0079.f4770, c0079.f4847, false)}), f6680, f6680));
                    break;
                } else {
                    b bVar6 = f6671;
                    bVar6.mo139(new e(bVar6, c0079.f4809, c0079.f4769, ns.LOGIN, null, new f(bVar6, new pk[]{new C0832(str, str2, c0079.f4770, c0079.f4847)}), f6680, f6680));
                    break;
                }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1311(Cif cif) {
        f6686 = cif;
        f6683 = "Failed to connect to char-server";
        if (f6671.f757 != null) {
            f6671.f757.f772 = null;
        }
        b bVar = f6671;
        bVar.mo139(new e(bVar, f6667.f4789 ? f6667.f4809 : cif.f6699, cif.f6698, ns.CHAR, null, new f(bVar, new pk[]{new C0396(f6688.f6689, f6688.f6691.f6704, f6688.f6691.f6703, f6688.f6690)}), f6680, f6680));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Ć, reason: contains not printable characters */
    public static void m1292() throws Throwable {
        Object objNewInstance;
        my myVar = oc.f3250;
        boolean z = (myVar == my.MOTR || myVar == my.all) && (f6667.f4771 == pj.aux.MOTR || f6667.f4771 == pj.aux.MOTR_home);
        f6683 = "Failed to connect to map-server";
        if (f6671.f757 != null) {
            f6671.f757.f772 = null;
        }
        b bVar = f6671;
        String str = f6667.f4789 ? f6667.f4809 : f6688.f6693.f6707;
        int iM968 = pa.m968(f6688.f6693.f6706);
        ns nsVar = ns.MAP;
        Runnable runnable = f6680;
        Runnable runnable2 = f6680;
        if (z) {
            objNewInstance = new C0540();
        } else {
            try {
                objNewInstance = C1162$.m1519("o.釫").getDeclaredConstructor(Integer.TYPE, Integer.TYPE, Integer.TYPE, Byte.TYPE).newInstance(Integer.valueOf(f6688.f6689), Integer.valueOf(f6688.f6696), Integer.valueOf(f6688.f6691.f6704), Byte.valueOf(f6688.f6692.f3272));
            } catch (Throwable th) {
                throw th.getCause();
            }
        }
        bVar.mo139(new e(bVar, str, iM968, nsVar, null, new f(bVar, new pk[]{objNewInstance}), runnable, runnable2));
    }

    /* renamed from: ć, reason: contains not printable characters */
    static void m1293() {
        f6669 = new ly();
        f6664 = new ln();
    }

    /* renamed from: ˮ͍, reason: contains not printable characters */
    static boolean m1298() {
        return f6664.f2004 != null;
    }

    /* renamed from: 岱, reason: contains not printable characters */
    final synchronized void m1312() {
        for (int i = 0; i < f6664.f2005.size(); i++) {
            lm lmVarValueAt = f6664.f2005.valueAt(i);
            if (lmVarValueAt != null) {
                f6669.f2048.m638(lmVarValueAt.f1998);
            }
        }
        f6674.f42.f1797.mo439();
        if (f6674.f42.f1738.f1832 != null) {
            f6674.f42.f1738.f1832.dismiss();
        }
        if (f6674.f42.f1774.f1837 != null) {
            f6674.f42.f1774.f1837.dismiss();
        }
        if (f6664.f2004 != null) {
            f6664.f2004.m1560(false);
        }
        if (f6669.f2048.f1551 != null) {
            mg mgVar = f6669.f2048.f1551;
            mv mvVar = mv.STAND;
            mgVar.m1423(((C0564) mgVar.f7638).m1372(mvVar, mgVar.f2130), System.currentTimeMillis());
            mgVar.f2126 = mvVar;
            mgVar.m834();
        }
        f6669.f2048.f1545.clear();
        f6669.f2048.f1551 = null;
        f6664.f2005.clear();
        f6664.f2004 = null;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1308(lm lmVar) {
        int i = lmVar.f1998;
        ln lnVar = f6664;
        if (lnVar.f2004 != null && i == lnVar.f2004.f1998) {
            Log.e("AndRO", "Cannot process request to delete self");
            throw new nv("Cannot process request to delete self");
        }
        lnVar.f2005.remove(i);
        f6669.f2048.m638(i);
        f6664.f2005.put(lmVar.f1998, lmVar);
        hu huVar = f6669.f2048;
        mj mjVarM856 = mj.m856(lmVar);
        huVar.f1545.put(Integer.valueOf(lmVar.f1998), mjVarM856);
        if (f6669.f2061 == null) {
            f6669.m821(mjVarM856, false);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1306(int i) {
        ln lnVar = f6664;
        if (lnVar.f2004 != null && i == lnVar.f2004.f1998) {
            Log.e("AndRO", "Cannot process request to delete self");
            throw new nv("Cannot process request to delete self");
        }
        lnVar.f2005.remove(i);
        f6669.f2048.m638(i);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static boolean m1301(String str) throws NumberFormatException {
        int i;
        String[] strArrSplit = str.split(" ", 2);
        if (strArrSplit == null) {
            return false;
        }
        String str2 = strArrSplit[0];
        if (str2.startsWith("/")) {
            String strSubstring = str2.substring(1);
            if (strSubstring.equals("where")) {
                f6674.f42.f1792.m1432(String.valueOf(f6669.f2063.f6887) + " ," + f6664.f2004.f2002 + ", " + f6664.f2004.f1999, 16776960);
                return true;
            }
            if (strSubstring.equals("noshift") || strSubstring.equals("ns")) {
                oc.f3243 = !oc.f3243;
                f6687.m658("noshift_enemy", 0, String.valueOf(oc.f3243));
                C0698 c0698 = f6674.f42.f1792;
                int i2 = oc.f3243 ? 702 : 703;
                String strM649 = f6687.m649(i2);
                c0698.m1432(strM649 == null ? "MSG" + i2 : strM649, 16776960);
            } else {
                if (strSubstring.equals("monsterhp")) {
                    if (!oc.f3232) {
                        C0698 c06982 = f6674.f42.f1792;
                        String strM6492 = f6687.m649(2181);
                        c06982.m1432(strM6492 == null ? "MSG2181" : strM6492, 16776960);
                    } else {
                        C0698 c06983 = f6674.f42.f1792;
                        String strM6493 = f6687.m649(2182);
                        c06983.m1432(strM6493 == null ? "MSG2182" : strM6493, 16776960);
                    }
                    oc.f3232 = !oc.f3232;
                    f6687.m645();
                    return true;
                }
                if (strSubstring.equals("memo")) {
                    f6671.mo454(new C0172());
                    return true;
                }
                if (strSubstring.equals("fastskup")) {
                    oc.f3251 = !oc.f3251;
                    f6674.f42.f1792.m1432("Fast skill leveling is now " + oc.f3251, 16776960);
                    return true;
                }
                if (strSubstring.equals("taekwon")) {
                    if (f6667.f4792) {
                        f6671.mo454(new C0885(nr.TAEKWON));
                        return true;
                    }
                    f6671.mo454(new C0650());
                    return true;
                }
                if (strSubstring.equals("alchemist")) {
                    if (f6667.f4792) {
                        f6671.mo454(new C0885(nr.ALCHEMIST));
                        return true;
                    }
                    f6671.mo454(new C0619());
                    return true;
                }
                if (strSubstring.equals("blacksmith")) {
                    if (f6667.f4792) {
                        f6671.mo454(new C0885(nr.BLACKSMITH));
                        return true;
                    }
                    f6671.mo454(new C0148());
                    return true;
                }
                if (strSubstring.startsWith("e")) {
                    try {
                        i = Integer.parseInt(strSubstring.substring(1));
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                    if (i < 0 || i >= nd.valuesCustom().length) {
                        Toast.makeText(f6674, "No such emotion", 1).show();
                        return true;
                    }
                    f6671.mo454(new C0884(nd.valuesCustom()[i]));
                    return true;
                }
                if (strSubstring.equals("hoai")) {
                    oc.f3248 = !oc.f3248;
                    f6674.f42.f1792.m1432("User AI " + (oc.f3248 ? "ON" : "OFF"), 16776960);
                    return true;
                }
            }
            for (nd ndVar : nd.valuesCustom()) {
                if (strSubstring.equals(ndVar.name())) {
                    f6671.mo454(new C0884(ndVar));
                    return true;
                }
            }
            Toast.makeText(f6674, "Invalid command", 0).show();
            return true;
        }
        return false;
    }

    /* renamed from: Ȋ, reason: contains not printable characters */
    static void m1296() {
        f6669.m819();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1313(boolean z) {
        String strM655 = f6687.m655("server_name", 0);
        String str = strM655 == null ? null : strM655;
        pj pjVar = new pj(this.f6694);
        ArrayList<pj.C0079> arrayList = new ArrayList<>();
        Iterator<pj.C0079> it = pjVar.f4607.iterator();
        while (it.hasNext()) {
            pj.C0079 next = it.next();
            if (oc.f3250 != my.MOTR || next.f4851.equals("MOTR")) {
                if ((oc.f3250 != my.iRO_hockeyapp && oc.f3250 != my.iRO_googleplay) || next.f4771 == pj.aux.iRO_Renewal) {
                    if (oc.f3250 != my.XileRO || next.f4771 == pj.aux.XileRO || next.f4771 == pj.aux.XileROOS) {
                        if (oc.f3250 != my.AevaRO || next.f4771 == pj.aux.AevaRO) {
                            if (oc.f3250 != my.AtlasRO || next.f4771 == pj.aux.AtlasRO) {
                                if (oc.f3250 != my.FreeRO || next.f4771 == pj.aux.FreeRO) {
                                    if (oc.f3250 != my.MyRO || next.f4771 == pj.aux.MyRO) {
                                        if (oc.f3250 != my.ChenRO || next.f4771 == pj.aux.ChenRO) {
                                            if (oc.f3250 != my.WeDevGames || next.f4771 == pj.aux.WeDevGames) {
                                                if (oc.f3250 != my.TheClassicROCom || next.f4771 == pj.aux.TheClassicROCom) {
                                                    if (oc.f3250 != my.ClassicRONet || next.f4771 == pj.aux.ClassicRONet) {
                                                        if (oc.f3250 != my.InfamyRO || next.f4771 == pj.aux.InfamyRO || next.f4771 == pj.aux.CreativeKingsRO) {
                                                            if (oc.f3250 != my.PlayragnarokPh || next.f4771 == pj.aux.PlayragnarokPh) {
                                                                if (oc.f3250 != my.SarahServer || next.f4771 == pj.aux.SarahServer) {
                                                                    if (oc.f3250 != my.SuccessRoNet || next.f4771 == pj.aux.SuccessRoNet) {
                                                                        if (oc.f3250 != my.CrownRO || next.f4771 == pj.aux.CrownRO) {
                                                                            if (oc.f3250 != my.Eden3 || next.f4771 == pj.aux.Eden3) {
                                                                                if (oc.f3250 != my.Class2RO || next.f4771 == pj.aux.Class2RO) {
                                                                                    if (oc.f3250 != my.ShinServer || next.f4771 == pj.aux.ShinServer) {
                                                                                        if (oc.f3250 != my.EosRagnarokOnline || next.f4771 == pj.aux.EosRagnarokOnline) {
                                                                                            if (oc.f3250 != my.TyrServer || next.f4771 == pj.aux.TyrServer) {
                                                                                                if (oc.f3250 != my.MobiRO || next.f4771 == pj.aux.MobiRO) {
                                                                                                    if (oc.f3250 != my.PlayLokiServerCom || next.f4771 == pj.aux.PlayLokiServerCom) {
                                                                                                        if (oc.f3250 != my.FreeRoWeb || next.f4771 == pj.aux.FreeRoWeb) {
                                                                                                            if (oc.f3250 != my.OldchaosROCom || next.f4771 == pj.aux.OldchaosROCom) {
                                                                                                                if (oc.f3250 != my.ROProviderValkyrie || next.f4771 == pj.aux.ROProviderValkyrie) {
                                                                                                                    if (oc.f3250 != my.LidiaRO || next.f4771 == pj.aux.LidiaRO) {
                                                                                                                        if (oc.f3250 != my.Gugusjungs57572 || next.f4771 == pj.aux.Gugusjungs57572) {
                                                                                                                            if (oc.f3250 != my.RagnarevivalCom || next.f4771 == pj.aux.RagnarevivalCom) {
                                                                                                                                if (oc.f3250 != my.RebirthRO_Ancyker || next.f4771 == pj.aux.RebirthRO_Ancyker) {
                                                                                                                                    if (oc.f3250 != my.BarnabyRO || next.f4771 == pj.aux.BarnabyRO) {
                                                                                                                                        if (oc.f3250 != my.Ragnaclan || next.f4771 == pj.aux.Ragnaclan) {
                                                                                                                                            if (oc.f3250 != my.ThaiRoInTh || next.f4771 == pj.aux.ThaiRoInTh) {
                                                                                                                                                if (oc.f3250 != my.LeonardRO || next.f4771 == pj.aux.LeonardRO) {
                                                                                                                                                    if (oc.f3250 != my.IfritRagnarokCom || next.f4771 == pj.aux.IfritRagnarokCom) {
                                                                                                                                                        if (oc.f3250 != my.AmatsuRO || next.f4771 == pj.aux.AmatsuRO) {
                                                                                                                                                            if (oc.f3250 != my.FreePlayRoCom || next.f4771 == pj.aux.FreePlayRoCom) {
                                                                                                                                                                if (oc.f3250 != my.RoHeimdallCom || next.f4771 == pj.aux.RoHeimdallCom) {
                                                                                                                                                                    if (oc.f3250 != my.Thai_id9169 || next.f4771 == pj.aux.Thai_id9169) {
                                                                                                                                                                        if (oc.f3250 != my.PlayvalhallaPh || next.f4771 == pj.aux.PlayvalhallaPh) {
                                                                                                                                                                            if (oc.f3250 != my.Classic2RoInTh || next.f4771 == pj.aux.Classic2RoInTh) {
                                                                                                                                                                                if (oc.f3250 != my.Daro || next.f4771 == pj.aux.Daro) {
                                                                                                                                                                                    if (oc.f3250 != my.iPlayRo201804 || next.f4771 == pj.aux.iPlayRo201804) {
                                                                                                                                                                                        if (oc.f3250 != my.AustinRO || next.f4771 == pj.aux.AustinRO) {
                                                                                                                                                                                            if (oc.f3250 != my.BrightRO || next.f4771 == pj.aux.BrightRO) {
                                                                                                                                                                                                if (oc.f3250 != my.TitanRO || next.f4771 == pj.aux.TitanRO) {
                                                                                                                                                                                                    if (oc.f3250 != my.RoFaction || next.f4771 == pj.aux.RoFaction) {
                                                                                                                                                                                                        if (oc.f3250 != my.WeloveRo || next.f4771 == pj.aux.WeloveRo) {
                                                                                                                                                                                                            if (oc.f3250 != my.KafraRO || next.f4771 == pj.aux.KafraRO) {
                                                                                                                                                                                                                if (oc.f3250 != my.ChaosReborn || next.f4771 == pj.aux.ChaosReborn) {
                                                                                                                                                                                                                    if (oc.f3250 != my.RagnarokReturnPh || next.f4771 == pj.aux.RagnarokReturnPh) {
                                                                                                                                                                                                                        if (oc.f3250 != my.GachoRO || next.f4771 == pj.aux.GachoRO) {
                                                                                                                                                                                                                            if (oc.f3250 != my.RoRetro || next.f4771 == pj.aux.RoRetro) {
                                                                                                                                                                                                                                if (oc.f3250 != my.LibRO || next.f4771 == pj.aux.LibRO) {
                                                                                                                                                                                                                                    if (oc.f3250 != my.SecretRO || next.f4771 == pj.aux.SecretRO) {
                                                                                                                                                                                                                                        if (oc.f3250 != my.NorseRO || next.f4771 == pj.aux.NorseRO) {
                                                                                                                                                                                                                                            if (oc.f3250 != my.Trinity_Reborn_Full || next.f4771 == pj.aux.Trinity_Reborn_Full) {
                                                                                                                                                                                                                                                if (oc.f3250 != my.AlbertaServer || next.f4771 == pj.aux.AlbertaServer) {
                                                                                                                                                                                                                                                    if (oc.f3250 != my.hiclassro || next.f4771 == pj.aux.hiclassro) {
                                                                                                                                                                                                                                                        if (oc.f3250 != my.OldschoolragnarokCom || next.f4771 == pj.aux.OldschoolragnarokCom) {
                                                                                                                                                                                                                                                            if (oc.f3250 != my.Ragnarevo || next.f4771 == pj.aux.Ragnarevo) {
                                                                                                                                                                                                                                                                if (oc.f3250 != my.CrazyPoring || next.f4771 == pj.aux.CrazyPoring) {
                                                                                                                                                                                                                                                                    if (oc.f3250 != my.LucianoRO || next.f4771 == pj.aux.LucianoRO) {
                                                                                                                                                                                                                                                                        if (oc.f3250 != my.GarciaRO || next.f4771 == pj.aux.GarciaRO) {
                                                                                                                                                                                                                                                                            if (oc.f3250 != my.Blytanias || next.f4771 == pj.aux.Blytanias) {
                                                                                                                                                                                                                                                                                if (oc.f3250 != my.PinoyRO || next.f4771 == pj.aux.PinoyRO) {
                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.OMGRO || next.f4771 == pj.aux.OMGRO) {
                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.RagnarokPuzzle || next.f4771 == pj.aux.RagnarokPuzzle) {
                                                                                                                                                                                                                                                                                            if (oc.f3250 != my.Modify_Full || next.f4771 == pj.aux.Modify_Full) {
                                                                                                                                                                                                                                                                                                if (oc.f3250 != my.Newyear || next.f4771 == pj.aux.Newyear) {
                                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.GRANDRO || next.f4771 == pj.aux.GRANDRO) {
                                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.SakrayPh || next.f4771 == pj.aux.SakrayPh) {
                                                                                                                                                                                                                                                                                                            if (oc.f3250 != my.MyRebornRO || next.f4771 == pj.aux.MyRebornRO) {
                                                                                                                                                                                                                                                                                                                if (oc.f3250 != my.XileRO2019 || next.f4771 == pj.aux.XileRO2019) {
                                                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.eSport2019 || next.f4771 == pj.aux.eSport2019) {
                                                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.PhoenixRO2 || next.f4771 == pj.aux.PhoenixRO2) {
                                                                                                                                                                                                                                                                                                                            if (oc.f3250 != my.OcrClassicCom || next.f4771 == pj.aux.OcrClassicCom) {
                                                                                                                                                                                                                                                                                                                                if (oc.f3250 != my.RoFreedom || next.f4771 == pj.aux.RoFreedom) {
                                                                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.C2RO || next.f4771 == pj.aux.C2RO) {
                                                                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.RelaxRO || next.f4771 == pj.aux.RelaxRO) {
                                                                                                                                                                                                                                                                                                                                            if (oc.f3250 != my.BgRO || next.f4771 == pj.aux.BgRO) {
                                                                                                                                                                                                                                                                                                                                                if (oc.f3250 != my.ROClashed || next.f4771 == pj.aux.ROClashed) {
                                                                                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.ForceRO || next.f4771 == pj.aux.ForceRO) {
                                                                                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.KryptGamingClassic || next.f4771 == pj.aux.KryptGamingClassic) {
                                                                                                                                                                                                                                                                                                                                                            if (oc.f3250 != my.OSRO2019 || next.f4771 == pj.aux.OSRO2019) {
                                                                                                                                                                                                                                                                                                                                                                if (oc.f3250 != my.NewFenrirRoGameNet || next.f4771 == pj.aux.NewFenrirRoGameNet) {
                                                                                                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.RagnarokIsLife || next.f4771 == pj.aux.RagnarokIsLife) {
                                                                                                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.LevelRO || next.f4771 == pj.aux.LevelRO) {
                                                                                                                                                                                                                                                                                                                                                                            if (oc.f3250 != my.OfficialragnarokCom || next.f4771 == pj.aux.OfficialragnarokCom) {
                                                                                                                                                                                                                                                                                                                                                                                if (oc.f3250 != my.PayonRO || next.f4771 == pj.aux.PayonRO) {
                                                                                                                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.OsirisRO || next.f4771 == pj.aux.OsirisRO) {
                                                                                                                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.ROComfy || next.f4771 == pj.aux.ROComfy) {
                                                                                                                                                                                                                                                                                                                                                                                            if (oc.f3250 != my.RoPronteraEp5 || next.f4771 == pj.aux.RoPronteraEp5) {
                                                                                                                                                                                                                                                                                                                                                                                                if (oc.f3250 != my.LeviathanRO || next.f4771 == pj.aux.LeviathanRO) {
                                                                                                                                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.Ragnajapan || next.f4771 == pj.aux.Ragnajapan) {
                                                                                                                                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.EarlyRO || next.f4771 == pj.aux.EarlyRO) {
                                                                                                                                                                                                                                                                                                                                                                                                            if (oc.f3250 != my.BurnRO || next.f4771 == pj.aux.BurnRO) {
                                                                                                                                                                                                                                                                                                                                                                                                                if (oc.f3250 != my.PlayValhallaNet || next.f4771 == pj.aux.PlayValhallaNet) {
                                                                                                                                                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.DarkRO || next.f4771 == pj.aux.DarkRO) {
                                                                                                                                                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.EliteRO || next.f4771 == pj.aux.EliteRO) {
                                                                                                                                                                                                                                                                                                                                                                                                                            if (oc.f3250 != my.BalikRagnaPH || next.f4771 == pj.aux.BalikRagnaPH) {
                                                                                                                                                                                                                                                                                                                                                                                                                                if (oc.f3250 != my.SolaceRO || next.f4771 == pj.aux.SolaceRO) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (oc.f3250 != my.PhRoNet || next.f4771 == pj.aux.PhRoNet) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (oc.f3250 != my.MidgardRO || next.f4771 == pj.aux.MidgardRO) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (oc.f3247 == null || oc.f3247.f797 == null || next.f4771 == oc.f3247.f797) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                arrayList.add(next);
                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        pjVar.f4607 = arrayList;
        int iIndexOf = -1;
        if (pjVar.f4607.size() == 1) {
            iIndexOf = 0;
        } else {
            this.f6695 = true;
            Iterator<pj.C0079> it2 = pjVar.f4607.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                pj.C0079 next2 = it2.next();
                if (next2.f4851.equals(str)) {
                    iIndexOf = pjVar.f4607.indexOf(next2);
                    break;
                }
            }
        }
        if (z && iIndexOf != -1) {
            m1309(pjVar.f4607.get(iIndexOf));
            return;
        }
        pj.C0079[] c0079Arr = new pj.C0079[pjVar.f4607.size()];
        for (int i = 0; i < pjVar.f4607.size(); i++) {
            c0079Arr[i] = pjVar.f4607.get(i);
        }
        f6674.setContentView(2130903125);
        f6674.f42.f1795 = new es(f6674, c0079Arr);
    }

    /* renamed from: ċ, reason: contains not printable characters */
    static String m1294() {
        return pa.m978(f6674.m140(2130968590), ow.UTF8).split("\n")[(int) (Math.random() * r4.length)];
    }

    /* renamed from: o.ˮ͍$鷭, reason: contains not printable characters */
    static class C0362 {

        /* renamed from: 櫯, reason: contains not printable characters */
        final String f6715;

        /* renamed from: 鷭, reason: contains not printable characters */
        final int f6716;

        C0362(int i, String str) {
            this.f6716 = i;
            this.f6715 = str;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final String m1304(byte[] bArr) throws NumberFormatException {
        int iM970;
        byte[] bArr2 = {32, 58, 32};
        int length = 0;
        for (int i = 0; i < 2 && bArr[length] != 47 && (iM970 = pa.m970(bArr, length, bArr2)) != -1; i++) {
            length = iM970 + bArr2.length;
        }
        String str = null;
        if (bArr[length] == 47) {
            int i2 = length;
            byte[] bArr3 = new byte[length];
            for (int i3 = 0; i3 < bArr3.length; i3++) {
                bArr3[i3] = bArr[i3];
            }
            byte[] bArr4 = new byte[(bArr.length - i2) - 1];
            for (int i4 = i2 + 1; i4 < bArr.length; i4++) {
                bArr4[(i4 - i2) - 1] = bArr[i4];
            }
            return String.valueOf(pa.m978(bArr3, ow.LOCAL)) + pa.m978(bArr4, ow.UTF8);
        }
        if (bArr[length] == 124 && f6667 != null && f6667.f4822) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length + 1, length + 3);
            byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr, length + 3, bArr.length);
            int i5 = Integer.parseInt(new String(bArrCopyOfRange2), 16);
            String str2 = null;
            C0362[] c0362Arr = f6684;
            int length2 = c0362Arr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    break;
                }
                C0362 c0362 = c0362Arr[i6];
                if (c0362.f6716 != i5) {
                    i6++;
                } else {
                    str2 = c0362.f6715;
                    break;
                }
            }
            if (str2 != null) {
                try {
                    str = String.valueOf(pa.m978(bArrCopyOfRange, ow.LOCAL)) + String.valueOf(Charset.forName(str2).newDecoder().decode(ByteBuffer.wrap(bArrCopyOfRange3)));
                } catch (CharacterCodingException unused) {
                } catch (IllegalCharsetNameException unused2) {
                } catch (UnsupportedCharsetException unused3) {
                }
            }
            if (str == null) {
                return String.valueOf(pa.m978(bArrCopyOfRange, ow.LOCAL)) + pa.m978(bArrCopyOfRange3, ow.LATIN);
            }
            return str;
        }
        return pa.m978(bArr, ow.LOCAL);
    }
}
