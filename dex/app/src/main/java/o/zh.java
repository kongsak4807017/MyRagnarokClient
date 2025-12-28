package o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class zh extends yy {

    /* renamed from: Ć, reason: contains not printable characters */
    private Log f6057;

    /* renamed from: ć, reason: contains not printable characters */
    private short f6058;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private int f6059;

    /* renamed from: 岱, reason: contains not printable characters */
    private byte f6060;

    public zh(yy yyVar, byte[] bArr) {
        super(yyVar);
        this.f6057 = LogFactory.getLog(zh.class.getName());
        this.f6058 = (short) (((short) (((short) ((bArr[1] & 255) + 0)) << 8)) + (bArr[0] & 255));
        this.f6059 = yu.m1180(bArr, 2);
        if (m1189()) {
            this.f6060 = (byte) (this.f6060 | (bArr[6] & 255));
        }
    }

    /* renamed from: Ȋ, reason: contains not printable characters */
    public final boolean m1203() {
        return (this.f6005 & 128) != 0;
    }

    @Override // o.yy
    /* renamed from: 岱 */
    public final void mo1191() {
        super.mo1191();
        StringBuilder sb = new StringBuilder();
        sb.append("posav: " + this.f6059);
        sb.append("\nhighposav: " + ((int) this.f6058));
        sb.append("\nhasencversion: " + m1189() + (m1189() ? Byte.valueOf(this.f6060) : ""));
        sb.append("\nhasarchcmt: " + ((this.f6005 & 2) != 0));
        sb.append("\nisEncrypted: " + ((this.f6005 & 128) != 0));
        sb.append("\nisMultivolume: " + ((this.f6005 & 1) != 0));
        sb.append("\nisFirstvolume: " + ((this.f6005 & 256) != 0));
        sb.append("\nisSolid: " + ((this.f6005 & 8) != 0));
        sb.append("\nisLocked: " + ((this.f6005 & 4) != 0));
        sb.append("\nisProtected: " + ((this.f6005 & 64) != 0));
        sb.append("\nisAV: " + ((this.f6005 & 32) != 0));
        this.f6057.info(sb.toString());
    }

    /* renamed from: ċ, reason: contains not printable characters */
    public final boolean m1202() {
        return (this.f6005 & 16) != 0;
    }
}
