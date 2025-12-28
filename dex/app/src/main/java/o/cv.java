package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import com.roworkshop.andro.c_point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import o.C1126;
import o.hr;
import o.lx;
import o.pj;
import o.pl;
import o.va;
import o.vo;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class cv extends iw {

    /* renamed from: ć, reason: contains not printable characters */
    static HashMap<String, hr> f1006 = new HashMap<>();

    /* renamed from: ˮ͍, reason: contains not printable characters */
    static HashMap<String, Cif> f1007 = new HashMap<>();

    /* renamed from: Ą, reason: contains not printable characters */
    Bitmap f1008;

    /* renamed from: ą, reason: contains not printable characters */
    Bitmap f1009;

    /* renamed from: Ć, reason: contains not printable characters */
    Bitmap f1010;

    /* renamed from: ċ, reason: contains not printable characters */
    Bitmap f1011;

    /* renamed from: đ, reason: contains not printable characters */
    Bitmap[] f1012;

    /* renamed from: Ē, reason: contains not printable characters */
    Bitmap[] f1013;

    /* renamed from: ē, reason: contains not printable characters */
    Bitmap[] f1014;

    /* renamed from: Ė, reason: contains not printable characters */
    Bitmap f1015;

    /* renamed from: ė, reason: contains not printable characters */
    Bitmap f1016;

    /* renamed from: Ę, reason: contains not printable characters */
    Bitmap f1017;

    /* renamed from: ę, reason: contains not printable characters */
    Bitmap f1018;

    /* renamed from: ȃ, reason: contains not printable characters */
    Bitmap f1019;

    /* renamed from: Ȋ, reason: contains not printable characters */
    Bitmap[] f1020;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    Bitmap f1021;

    /* renamed from: ܕ, reason: contains not printable characters */
    Bitmap[] f1022;

    /* renamed from: ঽ্, reason: contains not printable characters */
    boolean[] f1023;

    /* renamed from: 㥳, reason: contains not printable characters */
    Bitmap f1024;

    /* renamed from: 䒧, reason: contains not printable characters */
    Bitmap f1025;

    /* renamed from: 囃, reason: contains not printable characters */
    final EnumC0615[] f1026;

    /* renamed from: 岱, reason: contains not printable characters */
    Bitmap[] f1027;

    /* renamed from: 庸, reason: contains not printable characters */
    Bitmap[] f1028;

    /* renamed from: 廂, reason: contains not printable characters */
    final String f1029;

    /* renamed from: 櫯, reason: contains not printable characters */
    public cq f1030;

    /* renamed from: 纫, reason: contains not printable characters */
    Bitmap f1031;

    /* renamed from: 躆, reason: contains not printable characters */
    Bitmap f1032;

    /* renamed from: 鷭, reason: contains not printable characters */
    cr f1033;

    /* renamed from: 띥, reason: contains not printable characters */
    Bitmap[] f1034;

    @Override // o.iw, o.of
    /* renamed from: 鷭 */
    public final /* bridge */ /* synthetic */ void mo139(Runnable runnable) {
        super.mo139(runnable);
    }

    /* renamed from: o.cv$if, reason: invalid class name */
    class Cif {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f1036;

        /* renamed from: 櫯, reason: contains not printable characters */
        int[] f1037;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f1038;

        Cif() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final int m546() {
            if (this.f1036 > 0) {
                return this.f1036;
            }
            this.f1036 = C0851.m1495(16, 16, (Point) null, (byte[]) null, this.f1037);
            this.f1037 = null;
            return this.f1036;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private Cif m532(String str, boolean z, boolean z2, boolean z3) {
        String strM513;
        byte[] bArr;
        Cif cif;
        if (!z && (cif = f1007.get(str)) != null) {
            return cif;
        }
        Cif cif2 = new Cif();
        cif2.f1038 = str;
        cif2.f1037 = new int[256];
        ot[] otVarArr = new ot[256];
        try {
            bArr = (byte[]) this.f1033.m519("data\\palette\\" + str + ".pal", false);
        } catch (uw e) {
            if (C0358.f6667.f4824 && !z3) {
                nz.m907("Palette not found, server=" + C0358.f6667.f4851 + " palette=" + str);
                if (str.startsWith(C0358.f6685.f1030.f982.f8936.f8964)) {
                    strM513 = C0358.f6685.f1030.m508(EnumC0134.NOVICE.f6499, 0, (byte) EnumC0765.MALE.ordinal());
                } else {
                    strM513 = C0358.f6685.f1030.m513(EnumC0134.NOVICE, 1, 1, (byte) EnumC0765.MALE.ordinal());
                }
                bArr = (byte[]) this.f1033.m519("data\\palette\\" + strM513 + ".pal", false);
            } else {
                throw e;
            }
        }
        try {
            uj.m1124(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN), otVarArr);
            if (z2) {
                for (int i = 0; i < cif2.f1037.length; i++) {
                    cif2.f1037[i] = oz.m953(otVarArr[i].f3375, otVarArr[i].f3374, otVarArr[i].f3373, otVarArr[i].f3372);
                }
            } else {
                for (int i2 = 0; i2 < cif2.f1037.length; i2++) {
                    cif2.f1037[i2] = oz.m952(otVarArr[i2].f3375, otVarArr[i2].f3374, otVarArr[i2].f3373, otVarArr[i2].f3372);
                }
            }
            if (!z) {
                synchronized (f1007) {
                    f1007.put(str, cif2);
                }
            }
            return cif2;
        } catch (Exception e2) {
            throw new nv(e2, "Failed to load palette: " + str);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final Cif m540(EnumC0134 enumC0134, boolean z, int i, int i2, EnumC0765 enumC0765, boolean z2, boolean z3) {
        String strM513;
        String strM5132;
        String strM5133;
        if (z) {
            strM513 = this.f1030.m508(i, i2, (byte) enumC0765.ordinal());
        } else {
            strM513 = this.f1030.m513(enumC0134, i, i2, (byte) enumC0765.ordinal());
        }
        try {
            return m532(strM513, z2, z3, true);
        } catch (uw unused) {
            if (z) {
                strM5132 = this.f1030.m508(i, 0, (byte) enumC0765.ordinal());
            } else {
                strM5132 = this.f1030.m513(enumC0134, i, 1, (byte) enumC0765.ordinal());
            }
            try {
                Cif cifM532 = m532(strM5132, z2, z3, true);
                if (cifM532 != null && !strM5132.equals(strM513) && !z2) {
                    synchronized (f1007) {
                        f1007.put(strM513, cifM532);
                    }
                }
                return cifM532;
            } catch (uw unused2) {
                if (z) {
                    strM5133 = this.f1030.m508(0, 0, (byte) enumC0765.ordinal());
                } else {
                    strM5133 = this.f1030.m513(EnumC0134.NOVICE, 1, 1, (byte) enumC0765.ordinal());
                }
                Cif cifM5322 = m532(strM5133, z2, z3, false);
                if (cifM5322 != null && !strM5132.equals(strM513) && !z2) {
                    synchronized (f1007) {
                        f1007.put(strM513, cifM5322);
                    }
                }
                return cifM5322;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final hr m541(int i) {
        if (i == EnumC0431.WARP_CLASS.f6846) {
            i = 723;
        } else if (i == EnumC0431.FLAG_CLASS.f6846) {
            i = 973;
        } else if (i == 1288) {
            i = 1907;
        }
        if (i == EnumC0431.HIDDEN_WARP_CLASS.f6846 || i == EnumC0431.INVISIBLE_CLASS.f6846 || i == EnumC0431.WARP_DEBUG_CLASS.f6846 || i == EnumC0431.INVISIBLE_CLICKABLE.f6846) {
            return null;
        }
        String strM507 = this.f1030.m507(i, (byte) 0);
        if (strM507.endsWith("gr2")) {
            strM507 = this.f1030.m507(1002, (byte) 0);
        }
        hr hrVar = (hr) cp.m492(strM507, hr.class, C0358.f6667.f4824, this.f1030.m507(1002, (byte) 0));
        if (hrVar == null) {
            throw new nv("Failed to init SPR: " + strM507);
        }
        return hrVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final hr m542(int i, byte b, boolean z) {
        if (i >= EnumC0134.BABY.f6499 && i < EnumC0134.SUPER_BABY.f6499) {
            i -= EnumC0134.BABY.f6499;
        } else if (i == EnumC0134.SUPER_BABY.f6499) {
            i = EnumC0134.SUPER_NOVICE.f6499;
        }
        String strM507 = this.f1030.m507(i, b);
        hr hrVar = (hr) cp.m492(strM507, hr.class, C0358.f6667.f4824, this.f1030.m507(EnumC0134.NOVICE.f6499, b));
        if (hrVar == null) {
            throw new nv("Failed to init SPR: " + strM507);
        }
        if (z) {
            hrVar.m494();
            hrVar.f1506 = true;
        }
        return hrVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final hr m544(EnumC0134 enumC0134, int i, byte b, boolean z) {
        String strM512 = this.f1030.m512(enumC0134, i, b);
        hr hrVar = (hr) cp.m492(strM512, hr.class, C0358.f6667.f4824, this.f1030.m512(EnumC0134.NOVICE, i, b));
        if (hrVar == null) {
            throw new nv("Failed to init SPR: " + strM512);
        }
        if (z) {
            hrVar.m494();
            hrVar.f1506 = true;
        }
        return hrVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final hr m543(int i, int i2, byte b, boolean z) {
        String strM506 = this.f1030.m506(i, i2, b);
        hr hrVar = (hr) cp.m492(strM506, hr.class, C0358.f6667.f4824, this.f1030.m506(1, i2, b));
        if (hrVar == null) {
            throw new nv("Failed to init SPR: " + strM506);
        }
        if (z) {
            hrVar.m494();
            hrVar.f1506 = true;
        }
        return hrVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final hr[] m545(bh bhVar) {
        boolean z;
        String str;
        hr[] hrVarArr;
        int iM459;
        switch (EnumC0615.m1393()[this.f1030.m514(bhVar.f818, bhVar.f814).ordinal()]) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            cq cqVar = this.f1030;
            EnumC0615 enumC0615M1395 = cqVar.m514(bhVar.f818, bhVar.f814).m1395();
            EnumC0615 enumC0615M1394 = cqVar.m514(bhVar.f818, bhVar.f814).m1394();
            EnumC0134 enumC0134M1250 = EnumC0134.m1250(bhVar.f2001);
            if (enumC0615M1395 == null || enumC0615M1394 == null || (iM459 = bhVar.m459(true)) == EnumC0134.GAMEMASTER.f6499) {
                str = null;
            } else {
                C1126 c1126 = cqVar.f982;
                String str2 = bhVar.f803 == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934;
                C1126.Cif.C1127if c1127if = cqVar.f982.f8937.f8941;
                String str3 = enumC0134M1250 == EnumC0134.SUMMONER ? c1127if.f8952 : c1127if.f8953;
                String strM784 = cqVar.f985.m784(iM459, bhVar.f803);
                if (strM784 == null) {
                    nz.m907("jclass == null for class=" + iM459);
                    str = null;
                } else {
                    lx.C0061 c0061 = cqVar.f973.f2043.get(Integer.valueOf(enumC0615M1395.ordinal()));
                    String str4 = c0061 == null ? null : c0061.f2047;
                    if (str4 == null) {
                        nz.m907("jspritename == null for view=" + enumC0615M1395);
                        str = null;
                    } else {
                        lx.C0061 c00612 = cqVar.f973.f2043.get(Integer.valueOf(enumC0615M1394.ordinal()));
                        String str5 = c00612 == null ? null : c00612.f2047;
                        if (str5 == null) {
                            nz.m907("jspritename == null for view=" + enumC0615M1394);
                            str = null;
                        } else {
                            String str6 = String.valueOf(str3) + "\\" + strM784 + "\\" + strM784 + "_" + str2;
                            str = ((iM459 == EnumC0134.KAGEROU.f6499 || iM459 == EnumC0134.OBORO.f6499) && enumC0615M1395 == EnumC0615.SHORTSWORD && enumC0615M1394 == EnumC0615.SHORTSWORD) ? String.valueOf(str6) + str4 : (enumC0615M1395 == EnumC0615.AXE || (enumC0615M1395 == EnumC0615.SWORD && enumC0615M1394 == EnumC0615.SHORTSWORD)) ? String.valueOf(str6) + str5 + str4 : String.valueOf(str6) + str4 + str5;
                        }
                    }
                }
            }
            if (str == null) {
                hrVarArr = null;
            } else {
                hrVarArr = new hr[3];
                hrVarArr[0] = (hr) cp.m491(str, hr.class);
                hrVarArr[2] = (hr) cp.m491(String.valueOf(str) + "_" + this.f1030.f982.f8937.f8941.f8948, hr.class);
            }
        } else {
            hrVarArr = null;
        }
        hr[] hrVarArr2 = hrVarArr;
        if (hrVarArr != null) {
            return hrVarArr2;
        }
        hr hrVar = null;
        hr hrVarM533 = null;
        try {
            EnumC0134 enumC0134M1620 = EnumC0134.m1250(bhVar.f2001).m1256().m1619().m1620(EnumC0765.valuesCustom()[bhVar.f803]);
            if (bhVar.f818 > 0) {
                C0432 c0432M1648 = this.f1030.f967.m1648(bhVar.f818);
                String strM509 = this.f1030.m509(c0432M1648 == null ? -1 : c0432M1648.f6850, bhVar);
                EnumC0615 enumC0615M514 = this.f1030.m514(bhVar.f818, 0);
                hrVar = (hr) cp.m492(strM509, hr.class, true, null);
                if (hrVar == null && enumC0615M514 != null && enumC0615M514 != EnumC0615.NONE) {
                    hrVar = (hr) cp.m491(this.f1030.m509(enumC0615M514.ordinal(), bhVar), hr.class);
                }
                if (hrVar != null && enumC0615M514 != null && enumC0615M514 != EnumC0615.NONE) {
                    hrVarM533 = m533(enumC0615M514, bhVar);
                }
            }
            int iOrdinal = bhVar.f814;
            C0432 c0432M16482 = this.f1030.f967.m1648(iOrdinal);
            int i = c0432M16482 == null ? -1 : c0432M16482.f6850;
            if (i >= 0) {
                iOrdinal = i;
            }
            if (iOrdinal < 0 || iOrdinal >= EnumC0772.valuesCustom().length) {
                nz.m907("Invalid shield type requested " + iOrdinal + ", defaulting to " + EnumC0772.GUARD.name());
                iOrdinal = EnumC0772.GUARD.ordinal();
            }
            EnumC0772 enumC0772 = EnumC0772.valuesCustom()[iOrdinal];
            hr hrVar2 = null;
            if (enumC0772 != EnumC0772.NONE) {
                if (enumC0134M1620 == EnumC0134.TAEKWON || enumC0134M1620 == EnumC0134.NINJA || enumC0134M1620 == EnumC0134.GUNSLINGER || bhVar.f2001 == EnumC0134.WEDDING.f6499 || bhVar.f2001 == EnumC0134.XMAS.f6499 || bhVar.f2001 == EnumC0134.SUMMER.f6499) {
                    hrVar2 = null;
                } else if (enumC0772 == EnumC0772.SHIELD) {
                    if (enumC0134M1620 != EnumC0134.SWORDMAN) {
                        hrVar2 = null;
                    }
                } else if (enumC0772 == EnumC0772.BUCKLER || enumC0772 == EnumC0772.SHIELD || enumC0772 == EnumC0772.MIRRORSHIELD) {
                    if (enumC0134M1620 == EnumC0134.MAGE || enumC0134M1620 == EnumC0134.ARCHER || enumC0134M1620 == EnumC0134.SOUL_LINKER || enumC0134M1620 == EnumC0134.TAEKWON) {
                        hrVar2 = null;
                    }
                } else {
                    cq cqVar2 = this.f1030;
                    int i2 = bhVar.f2001;
                    byte b = bhVar.f803;
                    int i3 = EnumC1048.m1617(EnumC0134.m1250(i2).m1256().f8819 & 4095).m1620(EnumC0765.valuesCustom()[b]).f6499;
                    String str7 = cqVar2.f982.f8937.f8946;
                    C1126 c11262 = cqVar2.f982;
                    String str8 = b == EnumC0765.MALE.ordinal() ? c11262.f8935 : c11262.f8934;
                    String strM7842 = cqVar2.f985.m784(i3, b);
                    String str9 = String.valueOf(str7) + "\\" + strM7842 + "\\" + strM7842 + "_" + str8 + "_" + cqVar2.f965.f1300[enumC0772.ordinal()];
                    new StringBuilder("Loading ").append(EnumC0134.m1250(bhVar.f2001)).append(" shield ").append(enumC0772.name()).append(" sprite ").append(str9);
                    hrVar2 = (hr) cp.m491(str9, hr.class);
                }
            }
            return new hr[]{hrVar, hrVar2, hrVarM533};
        } catch (NullPointerException unused) {
            throw new nv("Failed to init 1st class for " + bhVar.f2001);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private hr m533(EnumC0615 enumC0615, bh bhVar) {
        String str;
        if (bhVar.m459(false) == EnumC0134.GAMEMASTER.f6499) {
            return null;
        }
        for (int i = 0; i < this.f1026.length; i++) {
            if (this.f1026[i] == enumC0615) {
                cq cqVar = this.f1030;
                EnumC0134 enumC0134M1250 = EnumC0134.m1250(bhVar.f2001);
                int iM459 = bhVar.m459(true);
                if (iM459 == EnumC0134.GAMEMASTER.f6499) {
                    str = null;
                } else {
                    if (iM459 == EnumC0134.SOUL_LINKER.f6499) {
                        iM459 = EnumC0134.MAGE.f6499;
                    }
                    C1126 c1126 = cqVar.f982;
                    String str2 = bhVar.f803 == EnumC0765.MALE.ordinal() ? c1126.f8935 : c1126.f8934;
                    C1126.Cif.C1127if c1127if = cqVar.f982.f8937.f8941;
                    String str3 = enumC0134M1250 == EnumC0134.SUMMONER ? c1127if.f8952 : c1127if.f8953;
                    String strM784 = cqVar.f985.m784(iM459, bhVar.f803);
                    lx.C0061 c0061 = cqVar.f973.f2043.get(Integer.valueOf(enumC0615.ordinal()));
                    str = String.valueOf(str3) + "\\" + strM784 + "\\" + strM784 + "_" + str2 + (c0061 == null ? null : c0061.f2047) + "_" + cqVar.f982.f8937.f8941.f8948;
                }
                return (hr) cp.m491(str, hr.class);
            }
        }
        return null;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final Bitmap m539(og ogVar, byte b) {
        Cif cifM540 = null;
        hr hrVarM542 = m542((int) ogVar.f3287, b, true);
        if (ogVar.f3285 > 0) {
            cifM540 = m540(EnumC0134.m1250(ogVar.f3287), true, ogVar.f3287, ogVar.f3285, EnumC0765.valuesCustom()[b], false, true);
        }
        Cif cifM5402 = null;
        hr hrVarM544 = m544(EnumC0134.m1250(ogVar.f3287), (int) ogVar.f3258, b, true);
        if (ogVar.f3288 > 0) {
            cifM5402 = m540(EnumC0134.m1250(ogVar.f3287), false, ogVar.f3258, ogVar.f3288, EnumC0765.valuesCustom()[b], false, true);
        }
        hr hrVarM543 = null;
        if (ogVar.f3263 > 0) {
            hrVarM543 = m543((int) ogVar.f3263, (int) ogVar.f3258, b, true);
        }
        hr hrVarM5432 = null;
        if (ogVar.f3264 > 0) {
            hrVarM5432 = m543((int) ogVar.f3264, (int) ogVar.f3258, b, true);
        }
        hr hrVarM5433 = null;
        if (ogVar.f3261 > 0) {
            hrVarM5433 = m543((int) ogVar.f3261, (int) ogVar.f3258, b, true);
        }
        hs hsVar = new hs(hrVarM542, new hr[]{hrVarM542, hrVarM544, hrVarM543, hrVarM5432, hrVarM5433});
        int[][] iArr = new int[2][];
        iArr[0] = cifM540 != null ? cifM540.f1037 : null;
        iArr[1] = cifM5402 != null ? cifM5402.f1037 : null;
        int[] iArrM635 = hsVar.m635(iArr, ogVar.f3269 == 0 ? mv.STAND.f2194 * 8 : mv.SIT.f2194 * 8, 0, 128, 128, 64);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArrM635, 0, 128, 0, 0, 128, 128);
        return bitmapCreateBitmap;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static Bitmap m528(ArrayList<Bitmap> arrayList, int i) {
        int width = arrayList.get(0).getWidth();
        int height = arrayList.get(0).getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width * i, height * 3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            canvas.drawBitmap(arrayList.get(i2), (i2 % i) * width, (i2 / i) * height, (Paint) null);
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final Bitmap m537() {
        try {
            int i = 4;
            int iRandom = C0358.f6667.f4859 > 0 ? C0358.f6667.f4859 - 1 : (int) (Math.random() * 5.0d);
            ArrayList arrayList = new ArrayList();
            for (int i2 = 1; i2 <= 3; i2++) {
                for (int i3 = 1; i3 <= i; i3++) {
                    try {
                        byte[] bArr = (byte[]) this.f1033.m519("data\\texture\\" + this.f1030.f982.f8938.f8962 + "\\t" + (iRandom == 0 ? "" : Integer.valueOf(iRandom)) + "_" + this.f1030.f982.f8938.f8960 + i2 + "-" + i3 + ".bmp", false);
                        arrayList.add(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                    } catch (uw e) {
                        if (i2 == 1 && i3 == 4) {
                            i = 3;
                        } else {
                            throw e;
                        }
                    }
                }
            }
            return m528((ArrayList<Bitmap>) arrayList, i);
        } catch (uw unused) {
            try {
                byte[] bArr2 = (byte[]) this.f1033.m519("data\\texture\\" + this.f1030.f982.f8938.f8962 + "\\bgi_temp.bmp", false);
                return BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
            } catch (uw unused2) {
                return null;
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final Bitmap m538(String str, int i) {
        byte[] bArr = (byte[]) this.f1033.m519(str, false);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (bitmapDecodeByteArray == null) {
            throw new nv("Failed to decode BMP " + str + " size=" + bArr.length);
        }
        int[] iArr = new int[bitmapDecodeByteArray.getWidth() * bitmapDecodeByteArray.getHeight()];
        bitmapDecodeByteArray.getPixels(iArr, 0, bitmapDecodeByteArray.getWidth(), 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == -65281) {
                iArr[i2] = 0;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), Bitmap.Config.ARGB_8888);
        if (i <= 1) {
            return bitmapCreateBitmap;
        }
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmapDecodeByteArray.getWidth() * i, bitmapDecodeByteArray.getHeight() * i, false);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final Bitmap m536(int i) {
        try {
            return m538(this.f1030.m510(i, true, false), 1);
        } catch (uw e) {
            nz.m907(e.getMessage());
            return m538(this.f1030.m510(512, true, false), 1);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static Bitmap m530(hs hsVar, int i, c_point c_pointVar) {
        if (i >= hsVar.f1524.length) {
            i = 0;
        }
        if (hsVar.f1524[i] == null) {
            hsVar.mo633(i);
        }
        int[] iArrM635 = hsVar.m635(null, i, hsVar.f1524[i].f1527.length / 2, c_pointVar.x, c_pointVar.y, c_pointVar.x / 2);
        Rect rect = new Rect();
        rect.left = c_pointVar.x;
        rect.top = c_pointVar.y;
        for (int i2 = 0; i2 < c_pointVar.y; i2++) {
            for (int i3 = 0; i3 < c_pointVar.x; i3++) {
                if ((iArrM635[(c_pointVar.x * i2) + i3] & ViewCompat.MEASURED_STATE_MASK) != 0) {
                    rect.left = Math.min(rect.left, i3);
                    rect.right = Math.max(rect.right, i3);
                    rect.bottom = Math.max(rect.bottom, i2);
                    rect.top = Math.min(rect.top, i2);
                }
            }
        }
        if (rect.width() < 0 || rect.height() < 0) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArrM635, rect.left + (rect.top * c_pointVar.x), c_pointVar.x, 0, 0, rect.width(), rect.height());
        return bitmapCreateBitmap;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static Bitmap m527(int i, c_point c_pointVar) {
        return m530(C0358.f6669.f2048.f1542, i, c_pointVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static Bitmap m529(hr hrVar) {
        int[] iArr = new int[256];
        for (int i = 0; i < hrVar.f1502.length; i++) {
            int i2 = hrVar.f1502[i];
            iArr[i] = ((-16711936) & i2) | ((16711680 & i2) >> 16) | ((i2 & 255) << 16);
        }
        byte[] bArr = hrVar.f1500[0].f1520;
        int[] iArr2 = new int[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            iArr2[i3] = iArr[pa.m967(bArr[i3])];
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(hrVar.f1500[0].f1513, hrVar.f1500[0].f1514, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, hrVar.f1500[0].f1513, 0, 0, hrVar.f1500[0].f1513, hrVar.f1500[0].f1514);
        return bitmapCreateBitmap;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static boolean m524(int i) {
        return i < C0358.f6669.f2048.f1542.f1524.length;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static String m531(int i, int i2) {
        return String.valueOf(oc.f3240) + "/_tmpEmblem/" + C0358.f6686.f6700 + "_" + i + "_" + i2 + ".ebm";
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static Bitmap m525(int i, int i2) throws IOException {
        double width;
        File file = new File(m531(i, i2));
        byte[] bArr = new byte[(int) file.length()];
        int i3 = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i4 = fileInputStream.read(bArr, i3, bArr.length - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            }
            fileInputStream.close();
            byte[] bArrM1151 = vc.m1151(bArr, 3304, false);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM1151, 0, bArrM1151.length);
            if (bitmapDecodeByteArray == null) {
                bitmapDecodeByteArray = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
            }
            int[] iArr = new int[bitmapDecodeByteArray.getWidth() * bitmapDecodeByteArray.getHeight()];
            bitmapDecodeByteArray.getPixels(iArr, 0, bitmapDecodeByteArray.getWidth(), 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
            for (int i5 = 0; i5 < iArr.length; i5++) {
                int i6 = (iArr[i5] & 16711680) >> 16;
                int i7 = (iArr[i5] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                int i8 = iArr[i5] & 255;
                if (i6 >= 250 && i7 < 5 && i8 >= 250) {
                    iArr[i5] = 0;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapDecodeByteArray.getHeight();
            bitmapDecodeByteArray.getWidth();
            if (bitmapDecodeByteArray.getHeight() == 24 && bitmapDecodeByteArray.getWidth() == 24) {
                return bitmapCreateBitmap;
            }
            if (bitmapDecodeByteArray.getHeight() > bitmapDecodeByteArray.getWidth()) {
                width = 24.0d / bitmapDecodeByteArray.getHeight();
            } else {
                width = 24.0d / bitmapDecodeByteArray.getWidth();
            }
            return Bitmap.createScaledBitmap(bitmapCreateBitmap, (int) (bitmapDecodeByteArray.getWidth() * width), (int) (bitmapDecodeByteArray.getHeight() * width), false);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (IOException e) {
            Log.e("AndRO", e.toString());
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }

    /* renamed from: Ą, reason: contains not printable characters */
    private final boolean m522() throws InterruptedException {
        boolean[] zArr = new boolean[1];
        boolean[] zArr2 = new boolean[1];
        C0358.f6674.mo139(new cw(this, zArr, zArr2));
        while (!zArr[0]) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                nz.m907(e.toString());
            }
        }
        return zArr2[0];
    }

    /* renamed from: o.cv$鷭, reason: contains not printable characters */
    class C0029 extends po {

        /* renamed from: 櫯, reason: contains not printable characters */
        long f1043;

        /* renamed from: 鷭, reason: contains not printable characters */
        long f1044;

        /* renamed from: ȃ, reason: contains not printable characters */
        private long f1041 = 0;

        /* renamed from: Ą, reason: contains not printable characters */
        private long f1039 = 0;

        /* renamed from: ą, reason: contains not printable characters */
        private long f1040 = 0;

        C0029() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        private void m547(long j) {
            if (this.f1041 == 0 || j < this.f1039) {
                this.f1039 = j;
                this.f1041 = System.currentTimeMillis();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f1041;
            if (jCurrentTimeMillis >= 3000) {
                this.f1040 = (((j - this.f1039) * 1000) / jCurrentTimeMillis) / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                this.f1041 = System.currentTimeMillis();
                this.f1039 = j;
            }
        }

        @Override // o.po
        /* renamed from: 鷭, reason: contains not printable characters */
        public final void mo548(long j, long j2) {
            String str;
            m547(j);
            long j3 = this.f1044 + j;
            long j4 = this.f1043;
            if (this.f1040 >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                str = String.format("%.1f MBytes/s", Float.valueOf(this.f1040 / 1024.0f));
            } else {
                str = String.valueOf(this.f1040) + " Kbytes/s";
            }
            if (j2 < 1) {
                je jeVar = C0358.f6674.f42;
                String str2 = "Downloading full game client\n" + str + "\n[" + pa.m973(j3) + "] bytes";
                if (jeVar.f1735 != null) {
                    C0358.f6674.mo139(new jt(jeVar));
                }
                C0358.f6674.mo139(new jr(jeVar, str2));
                return;
            }
            je jeVar2 = C0358.f6674.f42;
            String str3 = "Downloading full game client\n" + str + "\n" + pa.m973(j3) + "/" + pa.m973(j4);
            int i = (int) ((100 * j3) / j4);
            if (jeVar2.f1734 != null) {
                C0358.f6674.mo139(new jt(jeVar2));
            }
            C0358.f6674.mo139(new jp(jeVar2, str3, null, i, -1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v152, types: [java.lang.Object[]] */
    /* renamed from: 鷭, reason: contains not printable characters */
    private final void m534(ArrayList<String> arrayList) throws IOException {
        C0141 c0141;
        String strValueOf;
        boolean[] zArr = new boolean[1];
        if (oc.f3247 == null || !oc.f3247.f801) {
            if (oc.f3250 == my.localclient && C0358.f6667.f4820 == null) {
                return;
            }
            File file = new File(oc.f3240, "andro_full_client_downloaded.txt");
            if (file.exists() || !m522()) {
                return;
            }
            if (C0358.f6667.f4820 != null) {
                c0141 = new C0141();
                c0141.f5406 = new vo.C0118[0];
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    try {
                        va.C0116 c0116M1140 = va.m1140(String.valueOf(C0358.f6667.f4820) + "/" + next);
                        vo.C0118[] c0118Arr = c0141.f5406;
                        vo.C0118 c0118 = new vo.C0118(c0141, next, c0116M1140.f5361, c0116M1140.f5360);
                        vo.C0118[] c0118Arr2 = c0118Arr;
                        if (c0118Arr == null) {
                            c0118Arr2 = (Object[]) Array.newInstance(c0118.getClass(), 0);
                        }
                        Object[] objArrCopyOf = Arrays.copyOf(c0118Arr2, c0118Arr2.length + 1);
                        objArrCopyOf[c0118Arr2.length] = c0118;
                        c0141.f5406 = (vo.C0118[]) objArrCopyOf;
                    } catch (uw unused) {
                    } catch (Exception e) {
                        throw new nv(e);
                    }
                }
            } else {
                C0358.f6676.f1081.mo454(new vz());
                synchronized (this.f1023) {
                    try {
                        this.f1023.wait();
                    } catch (InterruptedException e2) {
                        throw new nv(e2);
                    }
                }
                c0141 = C0358.f6676.f1081.f1105;
                C0358.f6676.f1081.f1105 = null;
            }
            int i = -1;
            String strM655 = C0358.f6687.m655("local_client_checksum", 0);
            String str = strM655 == null ? null : strM655;
            String str2 = str;
            if (str != null) {
                byte[] bArrM960 = pa.m960(str2);
                File file2 = new File(oc.f3240);
                LinkedList linkedList = new LinkedList();
                pb.m991(file2, (LinkedList<File>) linkedList);
                boolean z = false;
                Iterator it2 = linkedList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String absolutePath = ((File) it2.next()).getAbsolutePath();
                    String strSubstring = absolutePath.substring(file2.getAbsolutePath().length() + 1, absolutePath.length());
                    int i2 = 0;
                    while (i2 < c0141.f5406.length) {
                        String strTrim = String.valueOf(c0141.f5406[i2].f5409).trim();
                        if (strSubstring.equals(strTrim) || strSubstring.equals(String.valueOf(strTrim) + ".tmp")) {
                            break;
                        }
                        if (strSubstring.equals(C0358.f6667.f4856 != null ? C0358.f6667.f4856 : "DATA.INI") || strSubstring.equals("remote_filelist.txt") || strSubstring.startsWith("BGM")) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 == c0141.f5406.length) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    C0141 c01412 = new C0141();
                    c01412.mo1058(ByteBuffer.wrap(bArrM960));
                    if (c0141.f5406.length == c01412.f5406.length) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= c0141.f5406.length) {
                                break;
                            }
                            vo.C0118 c01182 = c0141.f5406[i3];
                            vo.C0118 c01183 = c01412.f5406[i3];
                            if (c01182.f5410 != c01183.f5410) {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z");
                                simpleDateFormat.format((Date) new java.sql.Date(c01182.f5410));
                                simpleDateFormat.format((Date) new java.sql.Date(c01183.f5410));
                                break;
                            } else {
                                if (c01182.f5408 != c01183.f5408 || !new String(c01182.f5409).equals(new String(c01183.f5409))) {
                                    break;
                                }
                                c01412.f5406[i3].equals(c0141.f5406[i3]);
                                i3++;
                            }
                        }
                        if (i3 >= c0141.f5406.length) {
                            i = 0;
                            while (i < c0141.f5406.length) {
                                if (new File(oc.f3240, new String(c0141.f5406[i].f5409).trim()).length() != c0141.f5406[i].f5408) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
            if (i == -1) {
                i = 0;
                je jeVar = C0358.f6674.f42;
                if (jeVar.f1735 != null) {
                    C0358.f6674.mo139(new jt(jeVar));
                }
                C0358.f6674.mo139(new jr(jeVar, "Deleting old directory content..."));
                pb.m990(new File(oc.f3240));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(SupportMenu.USER_MASK);
                c0141.mo1043(byteBufferAllocate, false);
                C0358.f6687.m658("local_client_checksum", 0, pa.m959(Arrays.copyOf(byteBufferAllocate.array(), byteBufferAllocate.position())));
            }
            C0029 c0029 = new C0029();
            long j = 0;
            for (int i4 = 0; i4 < c0141.f5406.length; i4++) {
                j += c0141.f5406[i4].f5408;
            }
            long j2 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                j2 += c0141.f5406[i5].f5408;
            }
            for (int i6 = i; i6 < c0141.f5406.length; i6++) {
                String strTrim2 = new String(c0141.f5406[i6].f5409).trim();
                c0029.f1044 = j2;
                c0029.f1043 = j;
                c0029.mo548(0L, 1L);
                j2 += c0141.f5406[i6].f5408;
                try {
                    if (C0358.f6667.f4820 != null) {
                        va.m1142(String.valueOf(C0358.f6667.f4820) + "/" + strTrim2, new File(oc.f3240, strTrim2), false, false, pl.Cif.RESUME, c0029);
                    } else {
                        cr.m517(oc.f3240, strTrim2, false, pl.Cif.RESUME, (po) c0029);
                    }
                } catch (uw unused2) {
                }
            }
            C0358.f6674.mo139(new jt(C0358.f6674.f42));
            for (int i7 = 1; i7 <= 172; i7++) {
                if (i7 < 10) {
                    strValueOf = "0" + i7;
                } else {
                    strValueOf = String.valueOf(i7);
                }
                try {
                    cr.m517(oc.f3240, "BGM/" + strValueOf + ".mp3", false, pl.Cif.RESUME, (po) new cz(this, i7));
                } catch (uw unused3) {
                }
            }
            try {
                file.createNewFile();
            } catch (IOException unused4) {
            }
            C0358.f6687.m658("local_client_checksum", 0, null);
            C0358.f6674.mo139(new da(this, zArr));
            synchronized (zArr) {
                try {
                    zArr.wait();
                } catch (InterruptedException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ void m535(cv cvVar) throws IOException {
        um urVar;
        vc.f5367 = new dc(cvVar);
        if (C0358.f6667.f4852 != null) {
            File file = new File(oc.f3240, "remote_filelist.txt");
            je jeVar = C0358.f6674.f42;
            if (jeVar.f1735 != null) {
                C0358.f6674.mo139(new jt(jeVar));
            }
            C0358.f6674.mo139(new jr(jeVar, "Checking updates in file list"));
            byte[] bArrM1142 = va.m1142(C0358.f6667.f4852, file, true, true, pl.Cif.RETURN_NULL_IF_SAME_LASTMODIFIED, new dh(cvVar));
            if (bArrM1142 == null && -1 == C0358.f6687.m652("dummy_remote_filelist", (int) file.length(), (int) file.lastModified(), (String) null)) {
                try {
                    bArrM1142 = pb.m992(file.getAbsolutePath());
                } catch (IOException e) {
                    throw new nv(e);
                }
            }
            if (bArrM1142 != null) {
                hw hwVar = C0358.f6687;
                String[] strArrM1144 = vb.m1144(bArrM1142, new hz(hwVar, true));
                hwVar.f1566.beginTransaction();
                hwVar.f1566.delete("remote_filelist", null, null);
                hwVar.m659("INSERT OR IGNORE INTO `remote_filelist` (`filename`) VALUES ", strArrM1144, 1, new ia(hwVar, true));
                hwVar.f1566.setTransactionSuccessful();
                hwVar.f1566.endTransaction();
                C0358.f6687.m653(true, -1, "dummy_remote_filelist", (int) file.length(), (int) file.lastModified(), null);
            }
        }
        ArrayList<String> arrayList = C0358.f6667.f4849;
        if (arrayList.size() <= 0) {
            if (oc.f3250 != my.localclient) {
                cr.m517(oc.f3240, C0358.f6667.f4856 != null ? C0358.f6667.f4856 : "DATA.INI", false, pl.Cif.SKIP, (po) null);
            }
            arrayList = new ArrayList<>(Arrays.asList(pl.m1053(new File(oc.f3240), C0358.f6667.f4856)));
        }
        cvVar.m534(arrayList);
        if (oc.f3247 == null || !oc.f3247.f800) {
            Iterator<pj.C0079.C0080> it = C0358.f6667.f4848.iterator();
            while (it.hasNext()) {
                pj.C0079.C0080 next = it.next();
                if (next.f4867 == pj.EnumC0077.official) {
                    urVar = new uq(oc.f3240, lp.m786());
                } else if (next.f4867 == pj.EnumC0077.neoncube) {
                    urVar = new uo(oc.f3240, lp.m786());
                } else {
                    if (next.f4867 != pj.EnumC0077.thor) {
                        Log.e("AndRO", "Failed to instantiate updater: unknown type");
                        throw new nv("Failed to instantiate updater: unknown type");
                    }
                    urVar = new ur(oc.f3240, lp.m786());
                }
                urVar.mo1131(next);
            }
        }
        cvVar.f1033 = new cr(C0358.f6674.f42, C0358.f6687, oc.f3240, arrayList, C0358.f6667.f4812);
        cvVar.f1030 = new cq(C0358.f6674, cvVar.f1033, C0358.f6667.f4814);
        je jeVar2 = C0358.f6674.f42;
        if (jeVar2.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar2));
        }
        C0358.f6674.mo139(new jr(jeVar2, "Initializing UI bitmaps"));
        cvVar.f1021 = cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\shop.bmp", 1);
        cvVar.f1010 = cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\buyingshop.bmp", 1);
        cvVar.f1019 = cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\chat_open.bmp", 1);
        cvVar.f1008 = cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\chat_close.bmp", 1);
        cvVar.f1009 = cvVar.m536(714);
        cvVar.f1027 = new Bitmap[]{cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_comm_off.bmp", 2), cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_comm_on.bmp", 2)};
        cvVar.f1020 = new Bitmap[]{cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_items_off.bmp", 2), cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_items_on.bmp", 2)};
        cvVar.f1011 = cvVar.m538(cvVar.f1030.m510(512, true, false), 1);
        cvVar.f1031 = cvVar.m538(cvVar.f1030.m511("BD_RAGNAROK"), 1);
        cvVar.f1022 = new Bitmap[]{cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_profile_off.bmp", 2), cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_profile_on.bmp", 2)};
        cvVar.f1028 = new Bitmap[]{cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_skill_off.bmp", 2), cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_skill_on.bmp", 2)};
        cvVar.f1012 = new Bitmap[]{cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_status_off.bmp", 2), cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_status_on.bmp", 2)};
        cvVar.f1013 = new Bitmap[]{cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_equip_off.bmp", 2), cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_equip_on.bmp", 2)};
        cvVar.f1014 = new Bitmap[]{cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_option_off.bmp", 2), cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_option_on.bmp", 2)};
        cvVar.f1034 = new Bitmap[]{cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_abil_off.bmp", 2), cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\btn_abil_on.bmp", 2)};
        try {
            cvVar.f1024 = cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\basic_interface\\nc_cashshop.bmp", 2);
        } catch (uw unused) {
            cvVar.f1024 = null;
        }
        cvVar.f1025 = cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\disable_card_slot.bmp", 1);
        cvVar.f1032 = cvVar.m538("data\\texture\\" + cvVar.f1030.f982.f8938.f8962 + "\\empty_card_slot.bmp", 1);
    }

    cv() {
        super("c_res_thread");
        this.f1029 = "remote_filelist.txt";
        this.f1026 = new EnumC0615[]{EnumC0615.SHORTSWORD, EnumC0615.SWORD, EnumC0615.TWOHANDSWORD, EnumC0615.SPEAR, EnumC0615.TWOHANDSPEAR, EnumC0615.AXE, EnumC0615.TWOHANDAXE, EnumC0615.CATARRH};
        this.f1023 = new boolean[0];
        super.mo139(new di(this));
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static void m526() {
        hr hrVar;
        synchronized (f1006) {
            for (Map.Entry<String, hr> entry : f1006.entrySet()) {
                String key = entry.getKey();
                hr value = entry.getValue();
                boolean z = false;
                if (value == null) {
                    throw new NullPointerException("filename=" + key);
                }
                if (value.f1500 != null) {
                    for (hr.C0048 c0048 : value.f1500) {
                        if (c0048.f1519 > 0 || c0048.f1517 > 0) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z && value.f1501 != null) {
                    for (hr.C0048 c00482 : value.f1501) {
                        if (c00482 != null && (c00482.f1519 > 0 || c00482.f1517 > 0)) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    if (value.getClass() == C0409.class) {
                        C0409 c0409 = (C0409) value;
                        hrVar = new C0409(c0409.f6792, c0409.f6791, value.m624(), true);
                    } else {
                        hrVar = new hr(key, value.f1504 == null, value.m624(), true);
                    }
                    value.m626(hrVar);
                }
            }
        }
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    static void m523() {
        synchronized (f1007) {
            for (Cif cif : f1007.values()) {
                if (cif.f1036 > 0) {
                    cif.f1037 = C0358.f6685.m532(cif.f1038, true, true, false).f1037;
                    cif.f1036 = 0;
                }
            }
        }
    }
}
