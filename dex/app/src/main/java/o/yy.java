package o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class yy {

    /* renamed from: Ą, reason: contains not printable characters */
    protected short f6005;

    /* renamed from: ą, reason: contains not printable characters */
    protected short f6006;

    /* renamed from: ȃ, reason: contains not printable characters */
    protected byte f6007;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    protected short f6008;

    /* renamed from: 櫯, reason: contains not printable characters */
    protected long f6009;

    /* renamed from: 鷭, reason: contains not printable characters */
    Log f6010;

    public yy() {
        this.f6010 = LogFactory.getLog(yy.class.getName());
        this.f6008 = (short) 0;
        this.f6007 = (byte) 0;
        this.f6005 = (short) 0;
        this.f6006 = (short) 0;
    }

    public yy(yy yyVar) {
        this.f6010 = LogFactory.getLog(yy.class.getName());
        this.f6008 = (short) 0;
        this.f6007 = (byte) 0;
        this.f6005 = (short) 0;
        this.f6006 = (short) 0;
        this.f6005 = yyVar.f6005;
        this.f6008 = yyVar.f6008;
        this.f6007 = zp.m1209(yyVar.f6007).f6106;
        this.f6006 = yyVar.f6006;
        this.f6009 = yyVar.f6009;
    }

    public yy(byte[] bArr) {
        this.f6010 = LogFactory.getLog(yy.class.getName());
        this.f6008 = (short) 0;
        this.f6007 = (byte) 0;
        this.f6005 = (short) 0;
        this.f6006 = (short) 0;
        this.f6008 = (short) (((short) (((short) ((bArr[1] & 255) + 0)) << 8)) + (bArr[0] & 255));
        this.f6007 = (byte) (this.f6007 | (bArr[2] & 255));
        this.f6005 = (short) (((short) (((short) ((bArr[4] & 255) + 0)) << 8)) + (bArr[3] & 255));
        this.f6006 = (short) (((short) (((short) ((bArr[6] & 255) + 0)) << 8)) + (bArr[5] & 255));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final boolean m1194() {
        return (this.f6005 & 2) != 0;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final boolean m1192() {
        return (this.f6005 & 8) != 0;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final boolean m1189() {
        return (this.f6005 & 512) != 0;
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public final boolean m1188() {
        if (zp.SubHeader.f6106 == this.f6007) {
            return true;
        }
        if ((zp.NewSubHeader.f6106 == this.f6007) && (this.f6005 & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: Ą, reason: contains not printable characters */
    public final long m1184() {
        return this.f6009;
    }

    /* renamed from: ą, reason: contains not printable characters */
    public final short m1185() {
        return this.f6005;
    }

    /* renamed from: Ć, reason: contains not printable characters */
    public final short m1186() {
        return this.f6008;
    }

    /* renamed from: ć, reason: contains not printable characters */
    public final short m1187() {
        return this.f6006;
    }

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public final zp m1190() {
        return zp.m1209(this.f6007);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final void m1193(long j) {
        this.f6009 = j;
    }

    /* renamed from: 岱, reason: contains not printable characters */
    public void mo1191() {
        StringBuilder sb = new StringBuilder();
        sb.append("HeaderType: " + zp.m1209(this.f6007));
        sb.append("\nHeadCRC: " + Integer.toHexString(this.f6008));
        sb.append("\nFlags: " + Integer.toHexString(this.f6005));
        sb.append("\nHeaderSize: " + ((int) this.f6006));
        sb.append("\nPosition in file: " + this.f6009);
        this.f6010.info(sb.toString());
    }
}
