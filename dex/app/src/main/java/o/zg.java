package o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class zg extends zm {

    /* renamed from: ċ, reason: contains not printable characters */
    private int f6054;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private int f6055;

    /* renamed from: 岱, reason: contains not printable characters */
    private Log f6056;

    public zg(zm zmVar, byte[] bArr) {
        super(zmVar);
        this.f6056 = LogFactory.getLog(getClass());
        this.f6055 = yu.m1180(bArr, 0);
        this.f6054 = yu.m1180(bArr, 4);
    }

    @Override // o.zm, o.yz, o.yy
    /* renamed from: 岱 */
    public final void mo1191() {
        super.mo1191();
        this.f6056.info("filetype: " + this.f6055);
        this.f6056.info("creator :" + this.f6054);
    }
}
