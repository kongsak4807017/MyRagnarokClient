package o;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class zd extends yz {

    /* renamed from: ċ, reason: contains not printable characters */
    public final byte[] f6026;

    /* renamed from: đ, reason: contains not printable characters */
    private long f6027;

    /* renamed from: Ē, reason: contains not printable characters */
    private final zf f6028;

    /* renamed from: ē, reason: contains not printable characters */
    private final int f6029;

    /* renamed from: Ė, reason: contains not printable characters */
    private int f6030;

    /* renamed from: ė, reason: contains not printable characters */
    private byte[] f6031;

    /* renamed from: Ę, reason: contains not printable characters */
    private final byte[] f6032;

    /* renamed from: ę, reason: contains not printable characters */
    private Date f6033;

    /* renamed from: Ȋ, reason: contains not printable characters */
    public byte f6034;

    /* renamed from: ˮ͍, reason: contains not printable characters */
    public final int f6035;

    /* renamed from: ܕ, reason: contains not printable characters */
    public long f6036;

    /* renamed from: 㥳, reason: contains not printable characters */
    private int f6037;

    /* renamed from: 䒧, reason: contains not printable characters */
    public String f6038;

    /* renamed from: 囃, reason: contains not printable characters */
    private int f6039;

    /* renamed from: 岱, reason: contains not printable characters */
    public byte f6040;

    /* renamed from: 庸, reason: contains not printable characters */
    private final Log f6041;

    /* renamed from: 廂, reason: contains not printable characters */
    private int f6042;

    /* renamed from: 纫, reason: contains not printable characters */
    public String f6043;

    /* renamed from: 躆, reason: contains not printable characters */
    public long f6044;

    /* renamed from: 띥, reason: contains not printable characters */
    private short f6045;

    public zd(yz yzVar, byte[] bArr) {
        super(yzVar);
        this.f6041 = LogFactory.getLog(zd.class.getName());
        this.f6032 = new byte[8];
        this.f6039 = -1;
        this.f6027 = yu.m1181(bArr);
        this.f6028 = zf.m1201(bArr[4]);
        this.f6035 = yu.m1180(bArr, 5);
        this.f6029 = yu.m1180(bArr, 9);
        this.f6040 = (byte) (this.f6040 | (bArr[13] & 255));
        this.f6034 = (byte) (this.f6034 | (bArr[14] & 255));
        this.f6045 = (short) (((short) (((short) ((bArr[16] & 255) + 0)) << 8)) + (bArr[15] & 255));
        this.f6042 = yu.m1180(bArr, 17);
        int i = 0 + 4 + 1 + 4 + 4 + 1 + 1 + 2 + 4;
        if ((this.f6005 & 256) != 0) {
            this.f6037 = yu.m1180(bArr, 21);
            this.f6030 = yu.m1180(bArr, 25);
            i = i + 4 + 4;
        } else {
            this.f6037 = 0;
            this.f6030 = 0;
            if (this.f6027 == -1) {
                this.f6027 = -1L;
                this.f6030 = Integer.MAX_VALUE;
            }
        }
        this.f6044 |= this.f6037;
        this.f6044 <<= 32;
        this.f6044 |= this.f6012;
        this.f6036 |= this.f6030;
        this.f6036 <<= 32;
        this.f6036 += this.f6027;
        this.f6045 = this.f6045 > 4096 ? (short) 4096 : this.f6045;
        this.f6026 = new byte[this.f6045];
        for (int i2 = 0; i2 < this.f6045; i2++) {
            this.f6026[i2] = bArr[i];
            i++;
        }
        if (zp.FileHeader.f6106 == this.f6007) {
            if ((this.f6005 & 512) != 0) {
                int i3 = 0;
                this.f6043 = "";
                this.f6038 = "";
                while (i3 < this.f6026.length && this.f6026[i3] != 0) {
                    i3++;
                }
                byte[] bArr2 = new byte[i3];
                System.arraycopy(this.f6026, 0, bArr2, 0, bArr2.length);
                this.f6043 = new String(bArr2);
                if (i3 != this.f6045) {
                    this.f6038 = ze.m1199(this.f6026, i3 + 1);
                }
            } else {
                this.f6043 = new String(this.f6026);
                this.f6038 = "";
            }
        }
        if (zp.NewSubHeader.f6106 == this.f6007) {
            int i4 = (this.f6006 - 32) - this.f6045;
            i4 = (this.f6005 & 1024) != 0 ? i4 - 8 : i4;
            if (i4 > 0) {
                this.f6031 = new byte[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    this.f6031[i5] = bArr[i];
                    i++;
                }
            }
            if (Arrays.equals(zj.f6064.f6071, this.f6026)) {
                this.f6039 = this.f6031[8] + (this.f6031[9] << 8) + (this.f6031[10] << 16) + (this.f6031[11] << 24);
            }
        }
        if ((this.f6005 & 1024) != 0) {
            for (int i6 = 0; i6 < 8; i6++) {
                this.f6032[i6] = bArr[i];
                i++;
            }
        }
        int i7 = this.f6029;
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(1, (i7 >>> 25) + 1980);
        calendar.set(2, ((i7 >>> 21) & 15) - 1);
        calendar.set(5, (i7 >>> 16) & 31);
        calendar.set(11, (i7 >>> 11) & 31);
        calendar.set(12, (i7 >>> 5) & 63);
        calendar.set(13, (i7 & 31) * 2);
        calendar.set(14, 0);
        this.f6033 = calendar.getTime();
    }

    @Override // o.yz, o.yy
    /* renamed from: 岱 */
    public final void mo1191() {
        super.mo1191();
        StringBuilder sb = new StringBuilder();
        sb.append("unpSize: " + this.f6027);
        sb.append("\nHostOS: " + this.f6028.name());
        sb.append("\nMDate: " + this.f6033);
        sb.append("\nFileName: " + this.f6043);
        sb.append("\nunpMethod: " + Integer.toHexString(this.f6034));
        sb.append("\nunpVersion: " + Integer.toHexString(this.f6040));
        sb.append("\nfullpackedsize: " + this.f6044);
        sb.append("\nfullunpackedsize: " + this.f6036);
        sb.append("\nisEncrypted: " + ((this.f6005 & 4) != 0));
        sb.append("\nisfileHeader: " + (zp.FileHeader.f6106 == this.f6007));
        sb.append("\nisSolid: " + ((this.f6005 & 16) != 0));
        sb.append("\nisSplitafter: " + ((this.f6005 & 2) != 0));
        sb.append("\nisSplitBefore:" + ((this.f6005 & 1) != 0));
        sb.append("\nunpSize: " + this.f6027);
        sb.append("\ndataSize: " + this.f6011);
        sb.append("\nisUnicode: " + ((this.f6005 & 512) != 0));
        sb.append("\nhasVolumeNumber: " + m1192());
        sb.append("\nhasArchiveDataCRC: " + m1194());
        sb.append("\nhasSalt: " + ((this.f6005 & 1024) != 0));
        sb.append("\nhasEncryptVersions: " + m1189());
        sb.append("\nisSubBlock: " + m1188());
        this.f6041.info(sb.toString());
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: Ȋ, reason: contains not printable characters */
    public final boolean m1196() {
        return (this.f6005 & 2) != 0;
    }

    /* renamed from: ċ, reason: contains not printable characters */
    public final boolean m1195() {
        return (this.f6005 & 16) != 0;
    }

    /* renamed from: 纫, reason: contains not printable characters */
    public final boolean m1198() {
        return (this.f6005 & 512) != 0;
    }

    /* renamed from: 䒧, reason: contains not printable characters */
    public final boolean m1197() {
        return (this.f6005 & 224) == 224;
    }
}
