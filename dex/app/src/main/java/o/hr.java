package o;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import java.io.IOException;
import o.ud;
import o.ud.C0086;
import o.ud.C0086.C0087;
import o.ud.C0086.C0087.Cif;
import o.uj;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class hr extends cp {

    /* renamed from: ą, reason: contains not printable characters */
    C0048[] f1500;

    /* renamed from: Ć, reason: contains not printable characters */
    C0048[] f1501;

    /* renamed from: ć, reason: contains not printable characters */
    int[] f1502;

    /* renamed from: ċ, reason: contains not printable characters */
    Cif f1503;

    /* renamed from: Ȋ, reason: contains not printable characters */
    ud f1504;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    int f1505;

    /* renamed from: 岱, reason: contains not printable characters */
    boolean f1506;

    /* renamed from: 纫, reason: contains not printable characters */
    String f1507;

    /* renamed from: o.hr$if, reason: invalid class name */
    enum Cif {
        EXT_SPR,
        EXT_TGA,
        EXT_BMP,
        EXT_JPG;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static Cif[] valuesCustom() {
            Cif[] cifArrValuesCustom = values();
            int length = cifArrValuesCustom.length;
            Cif[] cifArr = new Cif[length];
            System.arraycopy(cifArrValuesCustom, 0, cifArr, 0, length);
            return cifArr;
        }
    }

    /* renamed from: o.hr$鷭, reason: contains not printable characters */
    class C0048 {

        /* renamed from: Ą, reason: contains not printable characters */
        int f1513;

        /* renamed from: ą, reason: contains not printable characters */
        int f1514;

        /* renamed from: Ć, reason: contains not printable characters */
        Point f1515 = new Point();

        /* renamed from: ȃ, reason: contains not printable characters */
        int f1517;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int[] f1518;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f1519;

        /* renamed from: 鷭, reason: contains not printable characters */
        byte[] f1520;

        C0048() {
        }

        /* renamed from: 鷭, reason: contains not printable characters */
        final int m629() {
            if (this.f1519 > 0) {
                return this.f1519;
            }
            this.f1519 = C0851.m1495(this.f1513, this.f1514, this.f1515, this.f1520, (int[]) null);
            if (!hr.this.f1506) {
                this.f1520 = null;
            }
            if (hr.this.f960 > 0) {
                hr.this.f960 = hr.this.f1506 ? 2 : 3;
            }
            return this.f1519;
        }

        /* renamed from: 櫯, reason: contains not printable characters */
        final int m628() {
            if (this.f1517 > 0) {
                return this.f1517;
            }
            if (this.f1517 < 0) {
                if (hr.this.f1505 > 0) {
                    int i = hr.this.f1505;
                    this.f1517 = i;
                    return i;
                }
                hr hrVar = hr.this;
                int iM1495 = C0851.m1495(16, 16, (Point) null, (byte[]) null, hr.this.f1502);
                hrVar.f1505 = iM1495;
                this.f1517 = iM1495;
                if (!hr.this.f1506) {
                    hr.this.f1502 = null;
                }
            } else {
                this.f1517 = C0851.m1495(16, 16, (Point) null, (byte[]) null, this.f1518);
                if (!hr.this.f1506) {
                    this.f1518 = null;
                }
            }
            if (hr.this.f960 > 0) {
                hr.this.f960 = hr.this.f1506 ? 2 : 3;
            }
            return this.f1517;
        }
    }

    protected hr() {
        this.f1505 = 0;
    }

    /* renamed from: Ć, reason: contains not printable characters */
    final boolean m624() {
        if (this.f1500 != null && this.f1500.length > 0) {
            return this.f1506;
        }
        if (this.f1501 != null && this.f1501.length > 0) {
            return this.f1506;
        }
        return false;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m626(hr hrVar) {
        if (this.f1500 != null && hrVar.f1500 != null) {
            for (int i = 0; i < this.f1500.length; i++) {
                this.f1500[i].f1520 = hrVar.f1500[i].f1520;
                this.f1500[i].f1519 = 0;
                this.f1500[i].f1518 = hrVar.f1500[i].f1518;
                this.f1500[i].f1517 = -1;
            }
        }
        if (this.f1501 != null && hrVar.f1501 != null) {
            for (int i2 = 0; i2 < this.f1501.length; i2++) {
                this.f1501[i2].f1520 = hrVar.f1501[i2].f1520;
                this.f1501[i2].f1519 = 0;
                this.f1501[i2].f1518 = hrVar.f1501[i2].f1518;
                this.f1501[i2].f1517 = 0;
            }
        }
        if (hrVar.f1502 != null) {
            if (this.f1502 == null) {
                this.f1502 = new int[hrVar.f1502.length];
            }
            for (int i3 = 0; i3 < hrVar.f1502.length; i3++) {
                this.f1502[i3] = hrVar.f1502[i3];
            }
        }
        this.f1505 = 0;
    }

    public hr(String str) {
        this(str, false, false, false);
    }

    /* renamed from: ć, reason: contains not printable characters */
    public final void m625() {
        this.f1504 = new ud();
        int length = 0;
        if (this.f1500 != null) {
            length = this.f1500.length + 0;
        }
        if (this.f1501 != null) {
            length += this.f1501.length;
        }
        this.f1504.f5018 = new ud.C0086[length];
        int i = 0;
        while (i < this.f1504.f5018.length) {
            int length2 = 0;
            if (this.f1500 != null) {
                length2 = this.f1500.length + 0;
            }
            boolean z = this.f1500 != null && i < this.f1500.length;
            C0048 c0048 = z ? this.f1500[i] : this.f1501[i - length2];
            this.f1504.f5018[i] = this.f1504.new C0086();
            this.f1504.f5018[i].f5028 = new ud.C0086.C0087[1];
            this.f1504.f5018[i].f5028[0] = this.f1504.f5018[i].new C0087();
            this.f1504.f5018[i].f5028[0].f5030 = -1;
            this.f1504.f5018[i].f5028[0].f5033 = new ud.C0086.C0087.Cif[1];
            this.f1504.f5018[i].f5028[0].f5033[0] = this.f1504.f5018[i].f5028[0].new Cif();
            this.f1504.f5018[i].f5028[0].f5033[0].f5044 = z ? i : i - length2;
            this.f1504.f5018[i].f5028[0].f5033[0].f5045 = z ? 0 : 1;
            this.f1504.f5018[i].f5028[0].f5033[0].f5037 = -1;
            this.f1504.f5018[i].f5028[0].f5033[0].f5043 = c0048.f1513;
            this.f1504.f5018[i].f5028[0].f5033[0].f5041 = c0048.f1514;
            this.f1504.f5018[i].f5028[0].f5033[0].f5038 = 1.0f;
            this.f1504.f5018[i].f5028[0].f5033[0].f5039 = 1.0f;
            i++;
        }
    }

    @Override // o.cp
    /* renamed from: 鷭 */
    protected final String mo497(String str) {
        this.f1507 = str;
        int iLastIndexOf = this.f957.lastIndexOf(".");
        String strSubstring = str.substring(this.f957.lastIndexOf(".") + 1);
        if (strSubstring.equals("tga")) {
            this.f1503 = Cif.EXT_TGA;
        } else if (strSubstring.equals("bmp")) {
            this.f1503 = Cif.EXT_BMP;
        } else if (strSubstring.equals("jpg")) {
            this.f1503 = Cif.EXT_JPG;
        } else {
            this.f1503 = Cif.EXT_SPR;
            if (iLastIndexOf != -1) {
                this.f1507 = str.substring(0, iLastIndexOf);
            }
            return "data\\sprite\\" + this.f1507 + ".spr";
        }
        return "data\\texture\\" + this.f957;
    }

    @Override // o.cp
    protected void finalize() {
        if (this.f960 == 0) {
            return;
        }
        mo495();
    }

    @Override // o.cp
    /* renamed from: ą */
    final void mo495() {
        if (this.f1500 != null) {
            for (C0048 c0048 : this.f1500) {
                if (c0048.f1519 > 0) {
                    synchronized (f954) {
                        f954.add(Integer.valueOf(c0048.f1519));
                        c0048.f1519 = 0;
                    }
                }
            }
        }
        if (this.f1505 > 0) {
            synchronized (f954) {
                f954.add(Integer.valueOf(this.f1505));
                this.f1505 = 0;
            }
        }
        if (this.f1501 != null) {
            for (C0048 c00482 : this.f1501) {
                if (c00482.f1519 > 0) {
                    synchronized (f954) {
                        f954.add(Integer.valueOf(c00482.f1519));
                        c00482.f1519 = 0;
                    }
                }
                if (c00482.f1517 > 0) {
                    synchronized (f954) {
                        f954.add(Integer.valueOf(c00482.f1517));
                        c00482.f1517 = 0;
                    }
                }
            }
        }
    }

    @Override // o.cp
    /* renamed from: 鷭 */
    public final boolean mo498(byte[] bArr) {
        if (bArr == null) {
            this.f1505 = 0;
            if (this.f1500 != null) {
                for (C0048 c0048 : this.f1500) {
                    c0048.f1517 = -1;
                    c0048.f1519 = 0;
                }
            }
            if (this.f1501 != null) {
                for (C0048 c00482 : this.f1501) {
                    c00482.f1519 = 0;
                    c00482.f1517 = 0;
                }
            }
            this.f960 = 1;
            return true;
        }
        uj ujVar = null;
        C0406 c0406M919 = null;
        this.f1506 = true;
        if (this.f1503 == Cif.EXT_SPR) {
            try {
                ujVar = new uj(bArr);
                if (this.f1504 == null) {
                    byte[] bArr2 = (byte[]) C0358.f6685.f1033.m519("data\\sprite\\" + this.f1507 + ".act", false);
                    this.f1504 = new ud();
                    try {
                        this.f1504.m1109(bArr2);
                    } catch (ux e) {
                        throw new nv(e, "Failed to init ACT: " + this.f1507);
                    }
                }
            } catch (uu e2) {
                throw new nv(e2, "Failed to init SPR: " + this.f1507);
            }
        } else {
            c0406M919 = od.m919(this.f1507, bArr);
        }
        m623(ujVar, c0406M919);
        return true;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m623(uj ujVar, C0406 c0406) {
        int i;
        this.f1505 = 0;
        if (c0406 != null) {
            if (this.f1500 == null) {
                this.f1500 = new C0048[1];
                this.f1500[0] = new C0048();
            }
            byte[] bArr = new byte[c0406.f6789.length];
            if (c0406.f6788 == null) {
                int[] iArr = new int[256];
                int[] iArr2 = c0406.f6789;
                int i2 = c0406.f6787.x;
                int i3 = c0406.f6787.y;
                iu.m688(iArr2, i2, bArr, iArr);
                this.f1500[0].f1518 = iArr;
            } else {
                this.f1500[0].f1518 = c0406.f6788;
                for (int i4 = 0; i4 < c0406.f6789.length; i4++) {
                    bArr[i4] = (byte) c0406.f6789[i4];
                }
            }
            this.f1500[0].f1520 = bArr;
            for (int i5 = 0; i5 < this.f1500[0].f1518.length; i5++) {
                int[] iArr3 = this.f1500[0].f1518;
                if ((this.f1500[0].f1518[i5] & (-986896)) == -1048336) {
                    i = 0;
                } else {
                    int i6 = this.f1500[0].f1518[i5];
                    i = ((-16711936) & i6) | ((16711680 & i6) >> 16) | ((i6 & 255) << 16);
                }
                iArr3[i5] = i;
            }
            this.f1500[0].f1520 = bArr;
            this.f1500[0].f1517 = 0;
            this.f1500[0].f1519 = 0;
            this.f1500[0].f1513 = c0406.f6787.x;
            this.f1500[0].f1514 = c0406.f6787.y;
            return;
        }
        if (ujVar == null) {
            return;
        }
        this.f1502 = new int[256];
        for (int i7 = 0; i7 < 256; i7++) {
            this.f1502[i7] = oz.m953(ujVar.f5264[i7].f3375, ujVar.f5264[i7].f3374, ujVar.f5264[i7].f3373, ujVar.f5264[i7].f3372);
            if ((this.f1502[i7] & (-986896)) == -1048336) {
                this.f1502[i7] = 0;
            }
        }
        if ((this.f1500 == null ? 0 : this.f1500.length) < ujVar.f5266) {
            this.f1500 = new C0048[ujVar.f5266];
        }
        if ((this.f1501 == null ? 0 : this.f1501.length) < ujVar.f5265) {
            this.f1501 = new C0048[ujVar.f5265];
        }
        if (ujVar.f5266 > 0) {
            for (int i8 = 0; i8 < ujVar.f5262.length; i8++) {
                if (this.f1500[i8] == null) {
                    this.f1500[i8] = new C0048();
                }
                this.f1500[i8].f1520 = ujVar.f5262[i8].f5274;
                this.f1500[i8].f1513 = ujVar.f5262[i8].f5277;
                this.f1500[i8].f1514 = ujVar.f5262[i8].f5276;
                this.f1500[i8].f1518 = null;
                this.f1500[i8].f1517 = -1;
                this.f1500[i8].f1519 = 0;
            }
        }
        if (ujVar.f5265 > 0) {
            for (int i9 = 0; i9 < ujVar.f5263.length; i9++) {
                uj.Cif cif = ujVar.f5263[i9];
                int[] iArr4 = new int[cif.f5270.length / 4];
                for (int i10 = 0; i10 < iArr4.length; i10++) {
                    iArr4[i10] = oz.m952(cif.f5270[(i10 * 4) + 3], cif.f5270[(i10 * 4) + 2], cif.f5270[(i10 * 4) + 1], cif.f5270[i10 * 4] & 240);
                }
                int[] iArr5 = new int[256];
                byte[] bArr2 = new byte[iArr4.length];
                iu.m688(iArr4, cif.f5272, bArr2, iArr5);
                for (int i11 = 0; i11 < iArr5.length; i11++) {
                    int i12 = iArr5[i11];
                    iArr5[i11] = ((-16711936) & i12) | ((16711680 & i12) >> 16) | ((i12 & 255) << 16);
                }
                if (this.f1501[i9] == null) {
                    this.f1501[i9] = new C0048();
                }
                this.f1501[i9].f1520 = bArr2;
                this.f1501[i9].f1518 = iArr5;
                this.f1501[i9].f1517 = 0;
                this.f1501[i9].f1519 = 0;
                this.f1501[i9].f1513 = cif.f5272;
                this.f1501[i9].f1514 = cif.f5271;
            }
        }
    }

    protected hr(String str, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) throws IOException {
        uj c1006;
        hr hrVar;
        this.f1505 = 0;
        this.f1506 = z2;
        Bitmap bitmapM525 = null;
        str = z4 ? "[emblem-guild_id=" + i + "-emblem_id=" + i2 + "]" : str;
        if (str == null) {
            Log.e("AndRO", "filename = null, probably sprite filename not found");
            throw new nv("filename = null, probably sprite filename not found");
        }
        String lowerCase = str.toLowerCase();
        if (!z3 && (hrVar = cv.f1006.get(lowerCase)) != null && (!z2 || hrVar.m624())) {
            this.f1507 = lowerCase;
            this.f1504 = hrVar.f1504;
            this.f1500 = hrVar.f1500;
            this.f1501 = hrVar.f1501;
            this.f1502 = hrVar.f1502;
            return;
        }
        if (z4) {
            cv cvVar = C0358.f6685;
            bitmapM525 = cv.m525(i, i2);
            if (bitmapM525 == null) {
                C0358.f6671.mo454(new C0548(i));
                z3 = true;
            }
        }
        String str2 = "data\\sprite\\" + lowerCase + ".act";
        String str3 = "data\\sprite\\" + lowerCase + ".spr";
        this.f1507 = lowerCase;
        if (!z4) {
            try {
                c1006 = new uj((byte[]) C0358.f6685.f1033.m519(str3, false));
            } catch (uu e) {
                throw new nv(e, "Failed to init SPR: " + lowerCase);
            }
        } else {
            byte[] bArr = new byte[2304];
            if (bitmapM525 != null) {
                int[] iArr = new int[576];
                bitmapM525.getPixels(iArr, 0, 24, 0, 0, 24, 24);
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    bArr[(i3 * 4) + 1] = (byte) (iArr[i3] & 255);
                    bArr[(i3 * 4) + 2] = (byte) ((iArr[i3] & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
                    bArr[(i3 * 4) + 3] = (byte) ((iArr[i3] & 16711680) >> 16);
                    bArr[(i3 * 4) + 0] = (byte) ((iArr[i3] & ViewCompat.MEASURED_STATE_MASK) >> 24);
                }
            }
            c1006 = new C1006(bArr);
        }
        if (!z) {
            byte[] bArr2 = (byte[]) C0358.f6685.f1033.m519(str2, false);
            this.f1504 = new ud();
            try {
                this.f1504.m1109(bArr2);
            } catch (ux e2) {
                throw new nv(e2, "Failed to init ACT: " + lowerCase);
            }
        }
        m623(c1006, (C0406) null);
        if (!z3) {
            synchronized (cv.f1006) {
                cv.f1006.put(lowerCase, this);
            }
        }
    }

    public hr(String str, boolean z, boolean z2, boolean z3) {
        this(str, z, z2, z3, false, 0, 0);
    }
}
