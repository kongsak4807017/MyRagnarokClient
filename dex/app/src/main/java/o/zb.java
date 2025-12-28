package o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class zb extends zm {

    /* renamed from: ċ, reason: contains not printable characters */
    private byte f6019;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private int f6020;

    /* renamed from: 䒧, reason: contains not printable characters */
    private int f6021;

    /* renamed from: 岱, reason: contains not printable characters */
    private Log f6022;

    /* renamed from: 纫, reason: contains not printable characters */
    private byte f6023;

    public zb(zm zmVar, byte[] bArr) {
        super(zmVar);
        this.f6022 = LogFactory.getLog(getClass());
        this.f6020 = yu.m1180(bArr, 0);
        this.f6019 = (byte) (this.f6019 | (bArr[4] & 255));
        this.f6023 = (byte) (this.f6023 | (bArr[5] & 255));
        this.f6021 = yu.m1180(bArr, 6);
    }

    @Override // o.zm, o.yz, o.yy
    /* renamed from: 岱 */
    public final void mo1191() {
        super.mo1191();
        this.f6022.info("unpSize: " + this.f6020);
        this.f6022.info("unpVersion: " + ((int) this.f6019));
        this.f6022.info("method: " + ((int) this.f6023));
        this.f6022.info("EACRC:" + this.f6021);
    }
}
