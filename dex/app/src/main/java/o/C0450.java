package o;

import android.graphics.Point;
import android.opengl.Matrix;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.FloatMath;
import android.util.Log;
import com.roworkshop.andro.c_activity;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import o.iu;
import o.pj;
import o.ue;
import o.ue.C0089;
import o.ue.C0090;
import o.uf;
import o.uf.C0091;
import o.uf.C0091.C0092;
import o.uf.C0093;
import o.uf.C0093.C0094;
import o.uf.C0095;
import o.uf.C0095.C0096;
import o.uf.C0097;
import o.uf.Cif;
import o.ui;
import o.ui.C0104;
import o.ui.C0105;
import o.ui.C0106;
import o.ui.C0107;
import o.ui.C0109;
import o.ui.C0110;
import o.ui.Cif;
import o.ui.aux;

/* renamed from: o.ತ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0450 {

    /* renamed from: đ, reason: contains not printable characters */
    private static /* synthetic */ int[] f6870;

    /* renamed from: 庸, reason: contains not printable characters */
    private static /* synthetic */ int[] f6871;

    /* renamed from: Ą, reason: contains not printable characters */
    ir f6872;

    /* renamed from: ą, reason: contains not printable characters */
    lv f6873;

    /* renamed from: Ć, reason: contains not printable characters */
    C0747[] f6874;

    /* renamed from: ć, reason: contains not printable characters */
    C0424[] f6875;

    /* renamed from: ċ, reason: contains not printable characters */
    public ue f6876;

    /* renamed from: ȃ, reason: contains not printable characters */
    boolean f6877;

    /* renamed from: Ȋ, reason: contains not printable characters */
    C0412[] f6878;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    iu f6880;

    /* renamed from: ܕ, reason: contains not printable characters */
    C0539 f6881;

    /* renamed from: 䒧, reason: contains not printable characters */
    int f6882;

    /* renamed from: 岱, reason: contains not printable characters */
    Cif f6883;

    /* renamed from: 纫, reason: contains not printable characters */
    short[] f6885;

    /* renamed from: 躆, reason: contains not printable characters */
    int f6886;

    /* renamed from: 鷭, reason: contains not printable characters */
    String f6887;

    /* renamed from: 櫯, reason: contains not printable characters */
    ni f6884 = ni.NOTHING;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    nj f6879 = nj.VILLAGE;

    /* renamed from: 櫯, reason: contains not printable characters */
    static /* synthetic */ int[] m1333() {
        int[] iArr = f6870;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[nj.valuesCustom().length];
        try {
            iArr2[nj.AGIT.ordinal()] = 9;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[nj.AGIT_SIEGEV15.ordinal()] = 19;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[nj.ARENA.ordinal()] = 5;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nj.BATTLEFIELD.ordinal()] = 20;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nj.DENYSKILL.ordinal()] = 14;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[nj.DUNGEON.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[nj.DUNGEON2.ordinal()] = 10;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[nj.DUNGEON3.ordinal()] = 11;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[nj.EVENT_GUILDWAR.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[nj.FIELD.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[nj.JAIL.ordinal()] = 16;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[nj.MONSTERTRACK.ordinal()] = 17;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[nj.NOPENALTY_FREEPKZONE.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[nj.PENALTY_FREEPKZONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[nj.PKSERVER.ordinal()] = 12;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[nj.PORINGBATTLE.ordinal()] = 18;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[nj.PVPSERVER.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[nj.PVP_TOURNAMENT.ordinal()] = 21;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[nj.TURBOTRACK.ordinal()] = 15;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[nj.UNUSED.ordinal()] = 22;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[nj.VILLAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[nj.VILLAGE_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        f6870 = iArr2;
        return iArr2;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static /* synthetic */ int[] m1338() {
        int[] iArr = f6871;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[ni.valuesCustom().length];
        try {
            iArr2[ni.AGITZONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[ni.DENYSKILLZONE.ordinal()] = 7;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[ni.EVENTPVPZONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ni.FREEPVPZONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ni.NOTHING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ni.PKSERVERZONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ni.PVPSERVERZONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        f6871 = iArr2;
        return iArr2;
    }

    /* renamed from: o.ತ$if, reason: invalid class name */
    class Cif {

        /* renamed from: Ą, reason: contains not printable characters */
        FloatBuffer f6888;

        /* renamed from: ą, reason: contains not printable characters */
        C0753 f6889;

        /* renamed from: ȃ, reason: contains not printable characters */
        FloatBuffer f6892;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6894;

        /* renamed from: 鷭, reason: contains not printable characters */
        Point f6895;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        boolean f6893 = false;

        /* renamed from: Ć, reason: contains not printable characters */
        final String f6890 = "selection_cell";

        /* renamed from: 鷭, reason: contains not printable characters */
        final boolean m1340(C0450 c0450, Point point) {
            ue.C0090 c0090M1115;
            synchronized (this) {
                float f = (-((point.x / 2.0f) - (r7.f1655 / 2))) * c0450.f6872.f1662;
                float f2 = ((point.y / 2.0f) - (r7.f1656 / 2)) * c0450.f6872.f1662;
                float f3 = (-(((point.x + 1) / 2.0f) - (r7.f1655 / 2))) * c0450.f6872.f1662;
                float f4 = (((point.y + 1) / 2.0f) - (r7.f1656 / 2)) * c0450.f6872.f1662;
                ue ueVar = c0450.f6876;
                int i = point.x;
                int i2 = point.y;
                if (ueVar.f5057 <= 0 || ueVar.f5055 <= 0) {
                    throw new RuntimeException("GAT file not loaded (bad width/height)");
                }
                if (i < 0 || i >= ueVar.f5057 || i2 < 0 || i2 >= ueVar.f5055) {
                    c0090M1115 = null;
                } else {
                    int i3 = i + (ueVar.f5057 * i2);
                    c0090M1115 = ueVar.m1112(i3) == null ? null : ueVar.f5056[i3].m1115();
                }
                if (c0090M1115 == null) {
                    return false;
                }
                if (!c0090M1115.m1114()) {
                    return false;
                }
                float[] fArr = {f, (-c0090M1115.f5073) + 0.2f, f2, this.f6894, f, (-c0090M1115.f5071) + 0.2f, f4, this.f6894, f3, (-c0090M1115.f5072) + 0.2f, f2, this.f6894, f3, (-c0090M1115.f5070) + 0.2f, f4, this.f6894};
                this.f6892 = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f6892.put(fArr);
                this.f6892.position(0);
                this.f6895 = new Point(point);
                this.f6893 = true;
                return true;
            }
        }

        Cif(iu iuVar) {
            int[] iArr = new int[144];
            iArr[0] = 1;
            iArr[1] = 1;
            iArr[2] = 1;
            iArr[3] = 1;
            iArr[8] = 1;
            iArr[9] = 1;
            iArr[10] = 1;
            iArr[11] = 1;
            iArr[12] = 1;
            iArr[13] = 1;
            iArr[14] = 1;
            iArr[15] = 1;
            iArr[20] = 1;
            iArr[21] = 1;
            iArr[22] = 1;
            iArr[23] = 1;
            iArr[24] = 1;
            iArr[25] = 1;
            iArr[34] = 1;
            iArr[35] = 1;
            iArr[36] = 1;
            iArr[37] = 1;
            iArr[46] = 1;
            iArr[47] = 1;
            iArr[96] = 1;
            iArr[97] = 1;
            iArr[106] = 1;
            iArr[107] = 1;
            iArr[108] = 1;
            iArr[109] = 1;
            iArr[118] = 1;
            iArr[119] = 1;
            iArr[120] = 1;
            iArr[121] = 1;
            iArr[122] = 1;
            iArr[123] = 1;
            iArr[128] = 1;
            iArr[129] = 1;
            iArr[130] = 1;
            iArr[131] = 1;
            iArr[132] = 1;
            iArr[133] = 1;
            iArr[134] = 1;
            iArr[135] = 1;
            iArr[140] = 1;
            iArr[141] = 1;
            iArr[142] = 1;
            iArr[143] = 1;
            int[] iArr2 = new int[256];
            iArr2[0] = 0;
            iArr2[1] = -2147418368;
            iu.Cif cifM692 = iuVar.m692(iArr, iArr2, (int) Math.sqrt(iArr.length), (int) Math.sqrt(iArr.length), "selection_cell", null, iuVar.f1667);
            float[] fArrM695 = cifM692.m695();
            this.f6894 = cifM692.f1686;
            this.f6888 = ByteBuffer.allocateDirect(fArrM695.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f6888.put(fArrM695);
            this.f6888.position(0);
            C0753 c0753 = new C0753();
            Matrix.setIdentityM(c0753.f7745, 0);
            this.f6889 = c0753;
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private float m1332(float f, float f2) {
        float f3;
        int i = ((int) f) + (this.f6876.f5057 * ((int) f2));
        if (i < 0 || i >= this.f6876.f5056.length) {
            return 0.0f;
        }
        ue.C0090 c0090M1115 = this.f6876.f5056[i].m1115();
        float fFloor = f - FloatMath.floor(f);
        float fFloor2 = f2 - FloatMath.floor(f2);
        if (fFloor + fFloor2 < 1.0f) {
            f3 = c0090M1115.f5073;
        } else {
            f3 = c0090M1115.f5071 - (c0090M1115.f5070 - c0090M1115.f5072);
        }
        return -((fFloor * (c0090M1115.f5072 - f3)) + f3 + (fFloor2 * (c0090M1115.f5071 - f3)));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final float m1339(float f, float f2) {
        if (this.f6876 == null || this.f6872 == null) {
            return 30.0f;
        }
        return m1332(((r2.f1655 / 2) - (f / this.f6872.f1662)) * 2.0f, ((r2.f1656 / 2) + (f2 / this.f6872.f1662)) * 2.0f);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1337(ui uiVar, boolean z) {
        iu iuVar;
        C0747 c0747;
        byte[] bArr;
        c_activity c_activityVar = C0358.f6674;
        c_activityVar.mo139(new RunnableC1147(c_activityVar, 9));
        this.f6874 = null;
        this.f6875 = null;
        ui.C0105[] c0105Arr = new ui.C0105[uiVar.f5190.length];
        int i = 0;
        ui.aux[] auxVarArr = new ui.aux[uiVar.f5190.length];
        int i2 = 0;
        for (int i3 = 0; i3 < uiVar.f5190.length; i3++) {
            if (uiVar.f5190[i3].f5211 == ui.EnumC0108.MODEL) {
                int i4 = i;
                i++;
                c0105Arr[i4] = (ui.C0105) uiVar.f5190[i3];
            } else if (uiVar.f5190[i3].f5211 == ui.EnumC0108.SOUND) {
                int i5 = i2;
                i2++;
                auxVarArr[i5] = (ui.aux) uiVar.f5190[i3];
            }
        }
        if (i2 > 0) {
            this.f6878 = new C0412[i2];
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                if (auxVarArr[i7].f5203[0] != 0) {
                    int i8 = i6;
                    i6++;
                    this.f6878[i8] = new C0412(auxVarArr[i7]);
                }
            }
            this.f6878 = (C0412[]) Arrays.copyOf(this.f6878, i6);
        }
        if (i > 0) {
            C0424[] c0424Arr = new C0424[i];
            int i9 = 0;
            c_activity c_activityVar2 = C0358.f6674;
            c_activityVar2.mo139(new RunnableC1147(c_activityVar2, 12));
            int i10 = 0;
            String[] strArr = new String[i];
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < i; i11++) {
                String strM978 = pa.m978(c0105Arr[i11].f5218, ow.KOREAN);
                int i12 = i10;
                i10++;
                strArr[i12] = strM978;
                hashSet.add(strM978);
            }
            int i13 = 0;
            double d = 0.0d;
            int size = hashSet.size();
            C0747[] c0747Arr = new C0747[size];
            double d2 = 9.0d / size;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    iuVar = this.f6880;
                    c0747 = new C0747();
                    c0747.f7740 = str;
                    bArr = (byte[]) C0358.f6685.f1033.m519("data\\model\\" + c0747.f7740, false);
                } catch (ut e) {
                    throw e;
                } catch (Exception e2) {
                    nz.m907("Failed to init object prototype:" + str);
                    e2.printStackTrace();
                }
                if (bArr == null) {
                    String str2 = "Failed to load GRF resource for map object prototype " + c0747.f7740;
                    Log.e("AndRO", str2);
                    throw new nv(str2);
                }
                uh uhVar = new uh();
                uhVar.m1118(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
                if (!z) {
                    c0747.f7734 = new C0753[uhVar.f5140.length];
                    c0747.f7735 = new C1030[uhVar.f5140.length];
                    C0753 c0753 = new C0753();
                    Matrix.setIdentityM(c0753.f7745, 0);
                    c0747.m1446(uhVar, 0, c0753, 0);
                }
                c0747.m1447(uhVar, iuVar);
                if (!z) {
                    c0747.m1445(uhVar);
                }
                c0747Arr[i13] = c0747;
                i13++;
                double dFloor = Math.floor(((int) (d2 * i13)) + 12);
                if (dFloor != d) {
                    c_activity c_activityVar3 = C0358.f6674;
                    c_activityVar3.mo139(new RunnableC1147(c_activityVar3, (int) dFloor));
                    d = dFloor;
                }
            }
            if (i13 < c0747Arr.length) {
                c0747Arr = (C0747[]) Arrays.copyOf(c0747Arr, i13);
            }
            if (!z) {
                for (int i14 = 0; i14 < strArr.length; i14++) {
                    String str3 = strArr[i14];
                    int i15 = 0;
                    while (i15 < c0747Arr.length && !c0747Arr[i15].f7740.equals(str3)) {
                        i15++;
                    }
                    if (i15 != c0747Arr.length) {
                        c0424Arr[i9] = C0424.m1324(c0747Arr[i15], c0105Arr[i14]);
                        i9++;
                    }
                }
            }
            c_activity c_activityVar4 = C0358.f6674;
            c_activityVar4.mo139(new RunnableC1147(c_activityVar4, 21));
            this.f6874 = c0747Arr;
            if (!z) {
                this.f6875 = (C0424[]) Arrays.copyOfRange(c0424Arr, 0, i9);
                int i16 = 0;
                for (int i17 = 0; i17 < this.f6874.length; i17++) {
                    for (int i18 = 0; i18 < c0424Arr.length; i18++) {
                        if (c0424Arr[i18] != null && c0424Arr[i18].f6828 == this.f6874[i17]) {
                            this.f6875[i16] = c0424Arr[i18];
                            i16++;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f6874 = new C0747[0];
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private ui m1334(String str, boolean z) throws ParseException {
        ui.AbstractC0103[] abstractC0103Arr;
        int i;
        ui.AbstractC0103 c0106;
        ui.AbstractC0103 abstractC0103;
        c_activity c_activityVar = C0358.f6674;
        c_activityVar.mo139(new RunnableC1147(c_activityVar, 0));
        byte[] bArr = (byte[]) C0358.f6685.f1033.m519(str, false);
        if (bArr == null) {
            Log.e("AndRO", "Failed to load RSW from GRF");
            throw new nv("Failed to load RSW from GRF");
        }
        ui uiVar = new ui();
        c_activity c_activityVar2 = C0358.f6674;
        c_activityVar2.mo139(new RunnableC1147(c_activityVar2, 1));
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            uiVar.f5195 = uiVar.new C0109();
            ui.C0109 c0109 = uiVar.f5195;
            byteBufferOrder.get(c0109.f5252);
            if (pa.m978(c0109.f5252, ow.LATIN).compareTo("GRSW") != 0) {
                throw new ParseException("Invalid RSW magic: " + pa.m978(c0109.f5252, ow.LATIN), byteBufferOrder.position());
            }
            byteBufferOrder.get(c0109.f5251);
            ui.this.f5191 = c0109.f5251[0] + (c0109.f5251[1] / 10.0d);
            byteBufferOrder.get(c0109.f5250);
            byteBufferOrder.get(c0109.f5249);
            if (!pa.m978(c0109.f5249, ow.KOREAN).toLowerCase().endsWith(".gnd")) {
                throw new ParseException("Invalid RSM GND file reference: " + pa.m978(c0109.f5249, ow.KOREAN), byteBufferOrder.position());
            }
            byteBufferOrder.get(c0109.f5246);
            if (!pa.m978(c0109.f5246, ow.KOREAN).toLowerCase().endsWith(".gat")) {
                throw new ParseException("Invalid RSM GAT file reference: " + pa.m978(c0109.f5246, ow.KOREAN), byteBufferOrder.position());
            }
            if (ui.this.f5191 >= 1.4d) {
                byteBufferOrder.get(c0109.f5247);
            }
            uiVar.f5194 = uiVar.new C0107();
            ui.C0107 c0107 = uiVar.f5194;
            if (ui.this.f5191 >= 1.3d) {
                c0107.f5239 = byteBufferOrder.getFloat();
            }
            if (ui.this.f5191 >= 1.8d) {
                c0107.f5238 = byteBufferOrder.getInt();
            }
            if (ui.this.f5191 >= 1.8d) {
                c0107.f5237 = byteBufferOrder.getFloat();
            } else {
                c0107.f5237 = 1.0f;
            }
            if (ui.this.f5191 >= 1.8d) {
                c0107.f5236 = byteBufferOrder.getFloat();
            } else {
                c0107.f5236 = 2.0f;
            }
            if (ui.this.f5191 >= 1.8d) {
                c0107.f5233 = byteBufferOrder.getFloat();
            } else {
                c0107.f5233 = 50.0f;
            }
            if (ui.this.f5191 >= 1.9d) {
                c0107.f5234 = byteBufferOrder.getInt();
            } else {
                c0107.f5234 = 3;
            }
            uiVar.f5193 = uiVar.new C0104();
            ui.C0104 c0104 = uiVar.f5193;
            if (ui.this.f5191 >= 1.5d) {
                c0104.f5217 = byteBufferOrder.getInt();
            } else {
                c0104.f5217 = 45;
            }
            if (ui.this.f5191 >= 1.5d) {
                c0104.f5216 = byteBufferOrder.getInt();
            } else {
                c0104.f5216 = 45;
            }
            if (ui.this.f5191 >= 1.5d) {
                oy.m949(byteBufferOrder, c0104.f5215);
            } else {
                c0104.f5215 = new float[]{1.0f, 1.0f, 1.0f};
            }
            if (ui.this.f5191 >= 1.5d) {
                oy.m949(byteBufferOrder, c0104.f5214);
            } else {
                c0104.f5214 = new float[]{0.3f, 0.3f, 0.3f};
            }
            if (ui.this.f5191 >= 1.7d) {
                c0104.f5212 = byteBufferOrder.getFloat();
            } else {
                c0104.f5212 = 1.0f;
            }
            uiVar.f5192 = uiVar.new Cif();
            ui.Cif cif = uiVar.f5192;
            if (ui.this.f5191 >= 1.6d) {
                cif.f5209 = byteBufferOrder.getInt();
                cif.f5208 = byteBufferOrder.getInt();
                cif.f5207 = byteBufferOrder.getInt();
                cif.f5206 = byteBufferOrder.getInt();
            } else {
                cif.f5206 = -500;
                cif.f5207 = -500;
                cif.f5208 = -500;
                cif.f5209 = -500;
            }
            int i2 = byteBufferOrder.getInt();
            if (i2 < 0) {
                throw new ParseException("Invalid RSW objects cnt: " + i2, byteBufferOrder.position());
            }
            uiVar.f5190 = new ui.AbstractC0103[i2];
            int i3 = 0;
            while (i3 < i2) {
                try {
                    abstractC0103Arr = uiVar.f5190;
                    i = byteBufferOrder.getInt();
                } catch (ParseException e) {
                    pc.m997(e.getMessage());
                    i2--;
                    i3--;
                }
                if (i < 0 || i >= ui.EnumC0108.valuesCustom().length) {
                    throw new ParseException("Invalid object type " + i, byteBufferOrder.position());
                }
                ui.EnumC0108 enumC0108 = ui.EnumC0108.valuesCustom()[i];
                switch (ui.m1121()[enumC0108.ordinal()]) {
                    case 2:
                        c0106 = uiVar.new C0105();
                        c0106.f5211 = enumC0108;
                        c0106.mo1122(byteBufferOrder);
                        abstractC0103 = c0106;
                        break;
                    case 3:
                        c0106 = uiVar.new C0106();
                        c0106.f5211 = enumC0108;
                        c0106.mo1122(byteBufferOrder);
                        abstractC0103 = c0106;
                        break;
                    case 4:
                        c0106 = uiVar.new aux();
                        c0106.f5211 = enumC0108;
                        c0106.mo1122(byteBufferOrder);
                        abstractC0103 = c0106;
                        break;
                    case 5:
                        c0106 = uiVar.new C0110();
                        c0106.f5211 = enumC0108;
                        c0106.mo1122(byteBufferOrder);
                        abstractC0103 = c0106;
                        break;
                    default:
                        pc.m997("Unexpected RSW object type " + i);
                        abstractC0103 = null;
                        break;
                }
                abstractC0103Arr[i3] = abstractC0103;
                i3++;
            }
            uiVar.f5190 = (ui.AbstractC0103[]) Arrays.copyOf(uiVar.f5190, i2);
            m1337(uiVar, z);
            c_activity c_activityVar3 = C0358.f6674;
            c_activityVar3.mo139(new RunnableC1147(c_activityVar3, 25));
            return uiVar;
        } catch (ParseException e2) {
            throw new nv(e2, "Failed to load RSW file: " + str);
        }
    }

    /* renamed from: o.ತ$鷭, reason: contains not printable characters */
    class C0451 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f6897;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f6898;

        /* renamed from: 鷭, reason: contains not printable characters */
        short[] f6899;

        private C0451() {
        }

        /* synthetic */ C0451(C0450 c0450, C0451 c0451) {
            this();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private C0451 m1335(String str, ui uiVar, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        short s;
        uf.C0095.C0096 c0096;
        C0451 c0451 = new C0451(this, null);
        os osVar = (os) C0358.f6685.f1033.m519(str, true);
        uf ufVar = new uf();
        try {
            boolean z6 = oc.f3241;
            ufVar.f5081 = ufVar.new Cif();
            uf.Cif cif = ufVar.f5081;
            byte[] bArr = cif.f5087;
            osVar.m938(bArr, bArr.length);
            if (pa.m978(cif.f5087, ow.LATIN).compareTo("GRGN") != 0) {
                pa.m978(cif.f5087, ow.LATIN);
                z2 = false;
            } else {
                byte[] bArr2 = cif.f5086;
                osVar.m938(bArr2, bArr2.length);
                cif.f5085 = osVar.m934();
                cif.f5084 = osVar.m934();
                if (cif.f5085 < 0 || cif.f5085 > 10000 || cif.f5084 < 0 || cif.f5084 > 10000) {
                    z2 = false;
                } else {
                    cif.f5082 = Float.intBitsToFloat(osVar.m934());
                    z2 = true;
                }
            }
            if (z2) {
                ufVar.f5080 = ufVar.new C0093();
                uf.C0093 c0093 = ufVar.f5080;
                c0093.f5106 = osVar.m934();
                c0093.f5105 = osVar.m934();
                if (c0093.f5106 < 0) {
                    z3 = false;
                } else {
                    c0093.f5104 = new uf.C0093.C0094[c0093.f5106];
                    for (int i = 0; i < c0093.f5104.length; i++) {
                        c0093.f5104[i] = c0093.new C0094();
                        uf.C0093.C0094 c0094 = c0093.f5104[i];
                        c0094.f5108 = new byte[c0093.f5105];
                        byte[] bArr3 = c0094.f5108;
                        osVar.m938(bArr3, bArr3.length);
                    }
                    z3 = true;
                }
                if (z3) {
                    ufVar.f5079 = ufVar.new C0095();
                    uf.C0095 c0095 = ufVar.f5079;
                    c0095.f5114 = osVar.m934();
                    if (z6) {
                        c0095.f5113 = osVar.m934();
                        c0095.f5112 = osVar.m934();
                        c0095.f5111 = osVar.m934();
                        if (c0095.f5114 < 0) {
                            z4 = false;
                        } else {
                            c0095.f5109 = new uf.C0095.C0096[c0095.f5114];
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[500]);
                            c0095.new C0096(byteBufferWrap);
                            byte[] bArr4 = new byte[byteBufferWrap.position() * c0095.f5114];
                            osVar.m938(bArr4, bArr4.length);
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr4).order(ByteOrder.LITTLE_ENDIAN);
                            for (int i2 = 0; i2 < c0095.f5114; i2++) {
                                c0095.f5109[i2] = c0095.new C0096(byteBufferOrder);
                            }
                            z4 = true;
                        }
                    } else {
                        osVar.m935((c0095.f5114 * 256) + 12);
                        z4 = true;
                    }
                    if (z4) {
                        ufVar.f5078 = ufVar.new C0091();
                        uf.C0091 c0091 = ufVar.f5078;
                        c0091.f5090 = osVar.m934();
                        if (c0091.f5090 < 0 || c0091.f5090 > 10000000) {
                            z5 = false;
                        } else {
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[100]);
                            c0091.new C0092(byteBufferWrap2);
                            byte[] bArr5 = new byte[byteBufferWrap2.position() * c0091.f5090];
                            osVar.m938(bArr5, bArr5.length);
                            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                            c0091.f5089 = new uf.C0091.C0092[c0091.f5090];
                            for (int i3 = 0; i3 < c0091.f5090; i3++) {
                                c0091.f5089[i3] = c0091.new C0092(byteBufferOrder2);
                            }
                            z5 = true;
                        }
                        if (z5) {
                            ufVar.f5074 = new uf.C0097[ufVar.f5081.f5085 * ufVar.f5081.f5084];
                            ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[100]);
                            ufVar.new C0097(byteBufferWrap3);
                            byte[] bArr6 = new byte[byteBufferWrap3.position() * ufVar.f5074.length];
                            osVar.m938(bArr6, bArr6.length);
                            ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr6).order(ByteOrder.LITTLE_ENDIAN);
                            for (int i4 = 0; i4 < ufVar.f5074.length; i4++) {
                                ufVar.f5074[i4] = ufVar.new C0097(byteBufferOrder3);
                            }
                            if (z6 && ufVar.f5079.f5109 != null) {
                                ufVar.f5076 = ufVar.f5081.f5085 * 6;
                                ufVar.f5077 = ufVar.f5081.f5084 * 6;
                                ufVar.f5075 = new short[ufVar.f5076 * ufVar.f5077];
                                ov ovVar = new ov();
                                ov ovVar2 = new ov();
                                int[] iArr = new int[ufVar.f5081.f5085 * ufVar.f5081.f5084];
                                for (int i5 = 0; i5 < ufVar.f5081.f5084; i5++) {
                                    for (int i6 = 0; i6 < ufVar.f5081.f5085; i6++) {
                                        int i7 = i6 + (i5 * ufVar.f5081.f5085);
                                        if (ufVar.f5074[i7].f5118 >= 0) {
                                            int[] iArr2 = new int[9];
                                            int i8 = 0;
                                            if (i6 == 0 || i5 == 0 || i6 == ufVar.f5081.f5085 - 1 || i5 == ufVar.f5081.f5084 - 1) {
                                                iArr[i7] = ufVar.m1116(i6, i5);
                                            } else {
                                                ovVar.f3383 = 0;
                                                ovVar.f3382 = 0;
                                                ovVar.f3381 = 0;
                                                ovVar.f3380 = 0;
                                                for (int i9 = 0; i9 < 3; i9++) {
                                                    for (int i10 = 0; i10 < 3; i10++) {
                                                        iArr2[i8] = ufVar.m1116((i6 - 1) + i10, (i5 - 1) + i9);
                                                        if (iArr2[i8] != 0) {
                                                            ovVar2.m943(iArr2[i8]);
                                                            ovVar.f3383 += ovVar2.f3383;
                                                            ovVar.f3382 += ovVar2.f3382;
                                                            ovVar.f3381 += ovVar2.f3381;
                                                            ovVar.f3380 += ovVar2.f3380;
                                                            i8++;
                                                        }
                                                    }
                                                }
                                                if (i8 > 0) {
                                                    ovVar.f3383 /= i8;
                                                    ovVar.f3382 /= i8;
                                                    ovVar.f3381 /= i8;
                                                    ovVar.f3380 /= i8;
                                                } else {
                                                    ovVar.f3380 = 255;
                                                    ovVar.f3381 = 255;
                                                    ovVar.f3382 = 255;
                                                    ovVar.f3383 = 255;
                                                }
                                                iArr[i7] = oz.m953(ovVar.f3383, ovVar.f3382, ovVar.f3381, 255);
                                            }
                                        }
                                    }
                                }
                                ov ovVar3 = new ov();
                                ov ovVar4 = new ov();
                                ov ovVar5 = new ov();
                                ov ovVar6 = new ov();
                                ovVar5.f3383 = (int) (uiVar.f5193.f5215[0] * 256.0f);
                                ovVar5.f3382 = (int) (uiVar.f5193.f5215[1] * 256.0f);
                                ovVar5.f3381 = (int) (uiVar.f5193.f5215[2] * 256.0f);
                                int i11 = (int) (uiVar.f5193.f5212 * 255.0f);
                                ovVar5.f3383 = (ovVar5.f3383 * i11) / 255;
                                ovVar5.f3382 = (ovVar5.f3382 * i11) / 255;
                                ovVar5.f3381 = (ovVar5.f3381 * i11) / 255;
                                ovVar5.f3380 = (ovVar5.f3380 * i11) / 255;
                                ovVar6.f3383 = (int) (uiVar.f5193.f5214[0] * 256.0f * 1.5f);
                                ovVar6.f3382 = (int) (uiVar.f5193.f5214[1] * 256.0f * 1.5f);
                                ovVar6.f3381 = (int) (uiVar.f5193.f5214[2] * 256.0f * 1.5f);
                                ov ovVarM944 = new ov().m942(ovVar6).m944(ovVar5);
                                ov ovVar7 = new ov();
                                uf.C0095.C0096 c00962 = ufVar.f5079.new C0096((byte) -1);
                                for (int i12 = 0; i12 < ufVar.f5074.length; i12++) {
                                    int i13 = ufVar.f5074[i12].f5118;
                                    boolean z7 = false;
                                    if (i13 != -1 && (s = ufVar.f5078.f5089[i13].f5100) >= 0) {
                                        c0096 = ufVar.f5079.f5109[s];
                                    } else {
                                        c0096 = c00962;
                                        z7 = true;
                                    }
                                    int i14 = (i12 % ufVar.f5081.f5085) * 6;
                                    int i15 = (i12 / ufVar.f5081.f5085) * 6;
                                    for (int i16 = 1; i16 < 7; i16++) {
                                        for (int i17 = 1; i17 < 7; i17++) {
                                            int i18 = i17 + (i16 * 8);
                                            int i19 = i14 + (i17 - 1) + ((i15 + (i16 - 1)) * ufVar.f5076);
                                            if (z7) {
                                                ufVar.f5075[i19] = -1;
                                            }
                                            int iM967 = pa.m967(c0096.f5117[i18]);
                                            ovVar4.f3383 = pa.m967(c0096.f5116[(i18 * 3) + 0]);
                                            ovVar4.f3382 = pa.m967(c0096.f5116[(i18 * 3) + 1]);
                                            ovVar4.f3381 = pa.m967(c0096.f5116[(i18 * 3) + 2]);
                                            ovVar3.m943(iArr[i12]);
                                            ov ovVarM9442 = ovVar7.m942(ovVar3).m944(ovVar4);
                                            ovVarM9442.f3383 = (ovVarM9442.f3383 * iM967) / 255;
                                            ovVarM9442.f3382 = (ovVarM9442.f3382 * iM967) / 255;
                                            ovVarM9442.f3381 = (ovVarM9442.f3381 * iM967) / 255;
                                            ovVarM9442.f3380 = (ovVarM9442.f3380 * iM967) / 255;
                                            ovVarM9442.f3383 = (ovVarM9442.f3383 * ovVarM944.f3383) / 255;
                                            ovVarM9442.f3382 = (ovVarM9442.f3382 * ovVarM944.f3382) / 255;
                                            ovVarM9442.f3381 = (ovVarM9442.f3381 * ovVarM944.f3381) / 255;
                                            ovVarM9442.f3380 = (ovVarM9442.f3380 * ovVarM944.f3380) / 255;
                                            short[] sArr = ufVar.f5075;
                                            int iM953 = oz.m953(ovVar7.f3383, ovVar7.f3382, ovVar7.f3381, 255);
                                            sArr[i19] = (short) ((((iM953 & 255) >> 3) << 11) | ((((iM953 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8) >> 3) << 6) | ((((iM953 & 16711680) >> 16) >> 3) << 1) | (((iM953 & ViewCompat.MEASURED_STATE_MASK) >>> 24) >> 7));
                                        }
                                    }
                                }
                                int iM963 = pa.m963(ufVar.f5076);
                                int iM9632 = pa.m963(ufVar.f5077);
                                double d = ufVar.f5076 / iM963;
                                double d2 = ufVar.f5077 / iM9632;
                                short[] sArr2 = new short[iM963 * iM9632];
                                if (iM963 != ufVar.f5076 || iM9632 != ufVar.f5077) {
                                    for (int i20 = 0; i20 < iM963; i20++) {
                                        for (int i21 = 0; i21 < iM9632; i21++) {
                                            int i22 = ((int) (i20 * d)) + (((int) (i21 * d2)) * ufVar.f5076);
                                            if (i22 >= ufVar.f5076 * ufVar.f5077) {
                                                pc.m997("Unexpected old_idx=" + i22 + " >" + (ufVar.f5076 * ufVar.f5077));
                                            } else {
                                                sArr2[i20 + (i21 * iM963)] = ufVar.f5075[i22];
                                            }
                                        }
                                    }
                                    ufVar.f5075 = sArr2;
                                    ufVar.f5076 = iM963;
                                    ufVar.f5077 = iM9632;
                                }
                                ufVar.f5079 = null;
                            }
                        }
                    }
                }
            }
            osVar.f3371.close();
            osVar.f3371 = null;
            this.f6872 = new ir();
            ir irVar = this.f6872;
            c_activity c_activityVar = C0358.f6674;
            c_activityVar.mo139(new RunnableC1147(c_activityVar, 45));
            irVar.m682(ufVar, irVar.f1659);
            if (!z) {
                c_activity c_activityVar2 = C0358.f6674;
                c_activityVar2.mo139(new RunnableC1147(c_activityVar2, 51));
                irVar.m681(ufVar);
                c_activity c_activityVar3 = C0358.f6674;
                c_activityVar3.mo139(new RunnableC1147(c_activityVar3, 65));
            }
            if (uiVar.f5194 != null) {
                this.f6873 = new lv(this.f6872, ufVar, uiVar.f5194, this.f6872.f1659, 65, 10, z);
                if (this.f6873.f2033 == null) {
                    this.f6873 = null;
                }
            }
            c0451.f6899 = ufVar.f5075;
            c0451.f6898 = ufVar.f5076;
            c0451.f6897 = ufVar.f5077;
            return c0451;
        } catch (IOException e) {
            String string = e.toString();
            Log.e("AndRO", string);
            throw new nv(string);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1336(String str) {
        boolean z;
        byte[] bArr = (byte[]) C0358.f6685.f1033.m519(str, false);
        ue ueVar = new ue();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.get(ueVar.f5060);
        if (pa.m978(ueVar.f5060, ow.LATIN).compareTo("GRAT") != 0) {
            pa.m978(ueVar.f5060, ow.LATIN);
            z = false;
        } else {
            ueVar.f5059 = byteBufferOrder.get();
            ueVar.f5058 = byteBufferOrder.get();
            ueVar.f5057 = byteBufferOrder.getInt();
            ueVar.f5055 = byteBufferOrder.getInt();
            if (ueVar.f5057 <= 0 || ueVar.f5057 > 10000 || ueVar.f5055 <= 0 || ueVar.f5055 > 10000) {
                z = false;
            } else {
                ueVar.f5056 = new ue.C0089[ueVar.f5057 * ueVar.f5055];
                ue.C0090 c0090 = ueVar.new C0090();
                for (int i = 0; i < ueVar.f5056.length; i++) {
                    c0090.f5073 = byteBufferOrder.getFloat();
                    c0090.f5072 = byteBufferOrder.getFloat();
                    c0090.f5071 = byteBufferOrder.getFloat();
                    c0090.f5070 = byteBufferOrder.getFloat();
                    c0090.f5061 = byteBufferOrder.get();
                    byteBufferOrder.get(c0090.f5068);
                    ue.C0089[] c0089Arr = ueVar.f5056;
                    ue.C0089 c0089 = ue.this.new C0089();
                    c0089.f5067 = (short) (c0090.f5073 * 100.0f);
                    c0089.f5066 = (short) (c0090.f5072 * 100.0f);
                    c0089.f5065 = (short) (c0090.f5071 * 100.0f);
                    c0089.f5064 = (short) (c0090.f5070 * 100.0f);
                    c0089.f5061 = c0090.f5061;
                    c0089Arr[i] = c0089;
                }
                z = true;
            }
        }
        if (!z) {
            String str2 = "Failed to init GAT: " + str;
            Log.e("AndRO", str2);
            throw new nv(str2);
        }
        this.f6876 = ueVar;
    }

    C0450(String str, boolean z) throws IOException, ParseException {
        str = str.toLowerCase().endsWith(".gat") ? str.substring(0, str.length() - 4) : str;
        str = str.contains("@") ? str.substring(str.lastIndexOf("@") - 1) : str;
        int i = oc.f3239 ? 1 : 2;
        if ((str.equals("lighthalzen") || (C0358.f6667.f4771 == pj.aux.MOTR && str.equals("prontera"))) && 8192 / i > iu.f1665) {
            i *= 2;
        }
        this.f6880 = new iu(i, 0, 0, false);
        this.f6883 = new Cif(this.f6880);
        String str2 = String.valueOf(str) + ".rsw";
        String str3 = "data\\" + (C0358.f6685.f1030.f969.f1071.get(str2) != null ? C0358.f6685.f1030.f969.f1071.get(str2) : str2);
        c_activity c_activityVar = C0358.f6674;
        c_activityVar.mo139(new RunnableC1147(c_activityVar, 0));
        ui uiVarM1334 = m1334(str3, z);
        String strM978 = pa.m978(uiVarM1334.f5195.f5246, ow.KOREAN);
        String str4 = "data\\" + (C0358.f6685.f1030.f969.f1071.get(strM978) != null ? C0358.f6685.f1030.f969.f1071.get(strM978) : strM978);
        String strM9782 = pa.m978(uiVarM1334.f5195.f5249, ow.KOREAN);
        C0451 c0451M1335 = m1335("data\\" + (C0358.f6685.f1030.f969.f1071.get(strM9782) != null ? C0358.f6685.f1030.f969.f1071.get(strM9782) : strM9782), uiVarM1334, z);
        this.f6885 = c0451M1335.f6899;
        this.f6882 = c0451M1335.f6898;
        this.f6886 = c0451M1335.f6897;
        this.f6887 = str;
        this.f6877 = C0358.f6685.f1030.f980.f6780.contains(String.valueOf(str) + ".rsw");
        if (!this.f6877) {
            try {
                this.f6881 = new C0539(str, this.f6880, new Point(this.f6872.f1655 * 2, this.f6872.f1656 * 2));
            } catch (Throwable unused) {
                this.f6881 = null;
            }
        }
        if (z) {
            return;
        }
        m1336(str4);
        for (C0747 c0747 : this.f6874) {
            c0747.m1444(this.f6880);
        }
        this.f6872.m680();
        c_activity c_activityVar2 = C0358.f6674;
        c_activityVar2.mo139(new RunnableC1147(c_activityVar2, 90));
        if (this.f6873 != null) {
            this.f6873.m806(this.f6872.f1659);
            this.f6873.f2034 = new float[this.f6873.f2035.length * 3];
            for (int i2 = 0; i2 < this.f6873.f2035.length; i2++) {
                iu.Cif cif = this.f6872.f1659.f1675.get(this.f6873.f2035[i2]);
                this.f6873.f2034[(i2 * 3) + 0] = cif.f1689;
                this.f6873.f2034[(i2 * 3) + 1] = cif.f1688;
                this.f6873.f2034[(i2 * 3) + 2] = cif.f1686;
            }
        }
        c_activity c_activityVar3 = C0358.f6674;
        c_activityVar3.mo139(new RunnableC1147(c_activityVar3, 100));
    }
}
