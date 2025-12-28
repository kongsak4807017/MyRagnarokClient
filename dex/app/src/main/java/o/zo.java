package o;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class zo extends zm {

    /* renamed from: ċ, reason: contains not printable characters */
    private int f6090;

    /* renamed from: Ȋ, reason: contains not printable characters */
    private int f6091;

    /* renamed from: 䒧, reason: contains not printable characters */
    private String f6092;

    /* renamed from: 岱, reason: contains not printable characters */
    private Log f6093;

    /* renamed from: 纫, reason: contains not printable characters */
    private String f6094;

    public zo(zm zmVar, byte[] bArr) {
        super(zmVar);
        this.f6093 = LogFactory.getLog(zo.class);
        this.f6091 = ((short) (((short) (((short) ((bArr[1] & 255) + 0)) << 8)) + (bArr[0] & 255))) & 65535;
        this.f6090 = ((short) (((short) (((short) ((bArr[3] & 255) + 0)) << 8)) + (bArr[2] & 255))) & 65535;
        if (this.f6091 + 4 < bArr.length) {
            byte[] bArr2 = new byte[this.f6091];
            System.arraycopy(bArr, 4, bArr2, 0, this.f6091);
            this.f6094 = new String(bArr2);
        }
        int i = this.f6091 + 4;
        if (this.f6090 + i < bArr.length) {
            byte[] bArr3 = new byte[this.f6090];
            System.arraycopy(bArr, i, bArr3, 0, this.f6090);
            this.f6092 = new String(bArr3);
        }
    }

    @Override // o.zm, o.yz, o.yy
    /* renamed from: 岱 */
    public final void mo1191() {
        super.mo1191();
        this.f6093.info("ownerNameSize: " + this.f6091);
        this.f6093.info("owner: " + this.f6094);
        this.f6093.info("groupNameSize: " + this.f6090);
        this.f6093.info("group: " + this.f6092);
    }
}
