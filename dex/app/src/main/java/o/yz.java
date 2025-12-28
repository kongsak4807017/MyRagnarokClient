package o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class yz extends yy {

    /* renamed from: Ć, reason: contains not printable characters */
    public long f6011;

    /* renamed from: ć, reason: contains not printable characters */
    long f6012;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private Log f6013;

    public yz() {
        this.f6013 = LogFactory.getLog(yz.class.getName());
    }

    public yz(yz yzVar) {
        super(yzVar);
        this.f6013 = LogFactory.getLog(yz.class.getName());
        this.f6012 = yzVar.f6011;
        this.f6011 = this.f6012;
        this.f6009 = yzVar.m1184();
    }

    public yz(yy yyVar, byte[] bArr) {
        super(yyVar);
        this.f6013 = LogFactory.getLog(yz.class.getName());
        this.f6012 = yu.m1181(bArr);
        this.f6011 = this.f6012;
    }

    @Override // o.yy
    /* renamed from: 岱 */
    public void mo1191() {
        super.mo1191();
        this.f6013.info("DataSize: " + this.f6011 + " packSize: " + this.f6012);
    }
}
