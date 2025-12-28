package o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class zi extends yy {

    /* renamed from: Ć, reason: contains not printable characters */
    public boolean f6061;

    /* renamed from: ć, reason: contains not printable characters */
    private Log f6062;

    public zi(yy yyVar) {
        super(yyVar);
        this.f6062 = LogFactory.getLog(zi.class.getName());
        this.f6061 = false;
    }

    /* renamed from: Ȋ, reason: contains not printable characters */
    public final boolean m1204() {
        short s = this.f6008;
        short s2 = this.f6005;
        short s3 = this.f6006;
        byte[] bArr = {(byte) (s & 255), (byte) (s >>> 8), this.f6007, (byte) (s2 & 255), (byte) (s2 >>> 8), (byte) (s3 & 255), (byte) (s3 >>> 8)};
        if (bArr[0] != 82) {
            return false;
        }
        if (bArr[1] != 69 || bArr[2] != 126 || bArr[3] != 94) {
            if (bArr[1] != 97 || bArr[2] != 114 || bArr[3] != 33 || bArr[4] != 26 || bArr[5] != 7 || bArr[6] != 0) {
                return false;
            }
            this.f6061 = false;
            return true;
        }
        this.f6061 = true;
        return true;
    }

    @Override // o.yy
    /* renamed from: 岱 */
    public final void mo1191() {
        super.mo1191();
        Log log = this.f6062;
        StringBuilder sb = new StringBuilder("valid: ");
        boolean z = m1186() == 24914 && m1190() == zp.MarkHeader && m1185() == 6689 && m1187() == 7;
        log.info(sb.append(z).toString());
    }
}
