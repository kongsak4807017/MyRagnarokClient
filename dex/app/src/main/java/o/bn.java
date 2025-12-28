package o;

import java.nio.ByteBuffer;
import org.apache.commons.net.telnet.TelnetCommand;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class bn {

    /* renamed from: 鷭, reason: contains not printable characters */
    public byte[] f847 = new byte[6];

    public bn(ByteBuffer byteBuffer) {
        byteBuffer.get(this.f847);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final short m466() {
        return (short) ((((this.f847[1] & 255) & 63) << 4) | ((this.f847[2] & 255) >> 4));
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final short m465() {
        return (short) ((((this.f847[2] & 255) & 15) << 6) | (((this.f847[3] & 255) & TelnetCommand.WONT) >> 2));
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public final short m464() {
        return (short) ((((short) ((this.f847[3] & 255) & 3)) << 8) + ((short) (this.f847[4] & 255)));
    }
}
