package o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class zm extends yz {

    /* renamed from: Ȋ, reason: contains not printable characters */
    private byte f6079;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public short f6080;

    /* renamed from: 岱, reason: contains not printable characters */
    private Log f6081;

    public zm(zm zmVar) {
        super(zmVar);
        this.f6081 = LogFactory.getLog(getClass());
        this.f6080 = zn.m1207(zmVar.f6080).f6089;
        this.f6079 = zmVar.f6079;
    }

    public zm(yz yzVar, byte[] bArr) {
        super(yzVar);
        this.f6081 = LogFactory.getLog(getClass());
        this.f6080 = (short) (((short) (((short) ((bArr[1] & 255) + 0)) << 8)) + (bArr[0] & 255));
        this.f6079 = (byte) (this.f6079 | (bArr[2] & 255));
    }

    @Override // o.yz, o.yy
    /* renamed from: 岱 */
    public void mo1191() {
        super.mo1191();
        this.f6081.info("subtype: " + zn.m1207(this.f6080));
        this.f6081.info("level: " + ((int) this.f6079));
    }
}
