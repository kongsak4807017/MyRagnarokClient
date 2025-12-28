package o;

import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class yl implements Closeable {

    /* renamed from: ċ, reason: contains not printable characters */
    private static Logger f5967 = Logger.getLogger(yl.class.getName());

    /* renamed from: 䒧, reason: contains not printable characters */
    private static /* synthetic */ int[] f5968;

    /* renamed from: 躆, reason: contains not printable characters */
    private static /* synthetic */ int[] f5969;

    /* renamed from: Ą, reason: contains not printable characters */
    public zi f5970;

    /* renamed from: ą, reason: contains not printable characters */
    public zh f5971;

    /* renamed from: Ć, reason: contains not printable characters */
    public zr f5972;

    /* renamed from: ć, reason: contains not printable characters */
    public long f5973;

    /* renamed from: ȃ, reason: contains not printable characters */
    public final List<yy> f5974;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public yn f5975;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final zq f5976;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public long f5977;

    /* renamed from: 岱, reason: contains not printable characters */
    public yo f5978;

    /* renamed from: 櫯, reason: contains not printable characters */
    public final ym f5979;

    /* renamed from: 纫, reason: contains not printable characters */
    private int f5980;

    /* renamed from: 鷭, reason: contains not printable characters */
    public yt f5981;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private static /* synthetic */ int[] m1166() {
        int[] iArr = f5969;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[zp.valuesCustom().length];
        try {
            iArr2[zp.AvHeader.ordinal()] = 5;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[zp.CommHeader.ordinal()] = 4;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[zp.EndArcHeader.ordinal()] = 10;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[zp.FileHeader.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[zp.MainHeader.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zp.MarkHeader.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[zp.NewSubHeader.ordinal()] = 9;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[zp.ProtectHeader.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[zp.SignHeader.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[zp.SubHeader.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        f5969 = iArr2;
        return iArr2;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static /* synthetic */ int[] m1167() {
        int[] iArr = f5968;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[zn.valuesCustom().length];
        try {
            iArr2[zn.BEEA_HEAD.ordinal()] = 4;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[zn.EA_HEAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[zn.MAC_HEAD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[zn.NTACL_HEAD.ordinal()] = 5;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[zn.STREAM_HEAD.ordinal()] = 6;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zn.UO_HEAD.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f5968 = iArr2;
        return iArr2;
    }

    private yl(ys ysVar, up upVar) throws yq {
        this.f5974 = new ArrayList();
        this.f5970 = null;
        this.f5971 = null;
        this.f5973 = 0L;
        this.f5977 = 0L;
        this.f5978 = ysVar;
        this.f5979 = upVar;
        m1170(this.f5978.mo1173(this, null));
        this.f5976 = new zq(this);
    }

    public yl(File file, up upVar) {
        this(new ys(file), upVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a A[SYNTHETIC] */
    /* renamed from: 鷭, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1168(o.yv r13, long r14) throws o.yq {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.yl.m1168(o.yv, long):void");
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final zd m1169() {
        int size = this.f5974.size();
        while (this.f5980 < size) {
            List<yy> list = this.f5974;
            int i = this.f5980;
            this.f5980 = i + 1;
            yy yyVar = list.get(i);
            if (yyVar.m1190() == zp.FileHeader) {
                return (zd) yyVar;
            }
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        aao aaoVar;
        if (this.f5981 != null) {
            this.f5981.close();
            this.f5981 = null;
        }
        if (this.f5972 != null) {
            zr zrVar = this.f5972;
            if (zrVar.f6140 == null || (aaoVar = zrVar.f6140.f121) == null) {
                return;
            }
            aaoVar.m245();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1170(yr yrVar) throws yq {
        this.f5975 = yrVar;
        m1168(yrVar.mo1172(), yrVar.mo1171());
    }
}
