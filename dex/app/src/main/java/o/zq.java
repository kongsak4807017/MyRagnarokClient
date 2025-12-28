package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o.yq;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class zq {

    /* renamed from: Ą, reason: contains not printable characters */
    public zd f6107;

    /* renamed from: ą, reason: contains not printable characters */
    public boolean f6108;

    /* renamed from: Ć, reason: contains not printable characters */
    public boolean f6109;

    /* renamed from: ć, reason: contains not printable characters */
    public boolean f6110;

    /* renamed from: ċ, reason: contains not printable characters */
    public long f6111;

    /* renamed from: đ, reason: contains not printable characters */
    public long f6112;

    /* renamed from: Ē, reason: contains not printable characters */
    public int f6113;

    /* renamed from: ē, reason: contains not printable characters */
    public int f6114;

    /* renamed from: ȃ, reason: contains not printable characters */
    public OutputStream f6115;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public long f6116;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public boolean f6117;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public long f6118;

    /* renamed from: ܕ, reason: contains not printable characters */
    public long f6119;

    /* renamed from: 㥳, reason: contains not printable characters */
    private InputStream f6120;

    /* renamed from: 䒧, reason: contains not printable characters */
    public long f6121;

    /* renamed from: 岱, reason: contains not printable characters */
    public long f6122;

    /* renamed from: 庸, reason: contains not printable characters */
    public long f6123;

    /* renamed from: 櫯, reason: contains not printable characters */
    public boolean f6124;

    /* renamed from: 纫, reason: contains not printable characters */
    public long f6125;

    /* renamed from: 躆, reason: contains not printable characters */
    public long f6126;

    /* renamed from: 鷭, reason: contains not printable characters */
    public long f6127;

    /* renamed from: 띥, reason: contains not printable characters */
    private final yl f6128;

    public zq(yl ylVar) {
        this.f6128 = ylVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1212(zd zdVar) {
        long j = zdVar.m1184() + zdVar.m1187();
        this.f6127 = zdVar.f6044;
        this.f6120 = new yw(this.f6128.f5981, j, this.f6127 + j);
        this.f6107 = zdVar;
        this.f6111 = 0L;
        this.f6116 = 0L;
        this.f6112 = -1L;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final int m1211(byte[] bArr, int i, int i2) throws yq, IOException {
        int i3 = 0;
        int i4 = 0;
        while (i2 > 0) {
            i3 = this.f6120.read(bArr, i, ((long) i2) > this.f6127 ? (int) this.f6127 : i2);
            if (i3 < 0) {
                throw new EOFException();
            }
            if (this.f6107.m1196()) {
                this.f6112 = yp.m1175((int) this.f6112, bArr, i, i3);
            }
            this.f6111 += i3;
            i4 += i3;
            i += i3;
            i2 -= i3;
            this.f6127 -= i3;
            yl ylVar = this.f6128;
            if (i3 > 0) {
                ylVar.f5977 += i3;
                if (ylVar.f5979 != null) {
                    ylVar.f5979.mo1135(ylVar.f5977, ylVar.f5973);
                }
            }
            if (this.f6127 != 0 || !this.f6107.m1196()) {
                break;
            }
            yr yrVarMo1173 = this.f6128.f5978.mo1173(this.f6128, this.f6128.f5975);
            if (yrVarMo1173 == null) {
                this.f6110 = true;
                return -1;
            }
            zd zdVar = this.f6107;
            if (zdVar.f6040 >= 20 && zdVar.f6035 != -1 && this.f6112 != (zdVar.f6035 ^ (-1))) {
                throw new yq(yq.EnumC0130.crcError);
            }
            ym ymVar = this.f6128.f5979;
            if (ymVar != null) {
                ymVar.mo1136(yrVarMo1173);
                return -1;
            }
            this.f6128.m1170(yrVarMo1173);
            zd zdVarM1169 = this.f6128.m1169();
            if (zdVarM1169 == null) {
                return -1;
            }
            m1212(zdVarM1169);
        }
        if (i3 != -1) {
            return i4;
        }
        return i3;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final void m1210(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f6124) {
            this.f6115.write(bArr, i, i2);
        }
        this.f6125 += i2;
        if (!this.f6117) {
            if (this.f6128.f5970.f6061) {
                short s = (short) this.f6123;
                int iMin = Math.min(bArr.length, i2);
                for (int i3 = 0; i3 < iMin; i3++) {
                    short s2 = (short) (((short) (((short) (bArr[i3] & 255)) + s)) & (-1));
                    s = (short) (((s2 << 1) | (s2 >>> 15)) & (-1));
                }
                this.f6123 = s;
                return;
            }
            this.f6123 = yp.m1175((int) this.f6123, bArr, i, i2);
        }
    }
}
