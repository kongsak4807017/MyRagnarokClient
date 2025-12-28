package o;

import android.support.v4.internal.view.SupportMenu;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class ty {

    /* renamed from: Ą, reason: contains not printable characters */
    Class<?> f4988;

    /* renamed from: ą, reason: contains not printable characters */
    public int f4989;

    /* renamed from: Ć, reason: contains not printable characters */
    int f4990;

    /* renamed from: ȃ, reason: contains not printable characters */
    public boolean f4991 = false;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    public uc f4992;

    /* renamed from: 櫯, reason: contains not printable characters */
    public int f4993;

    /* renamed from: 鷭, reason: contains not printable characters */
    public tx f4994;

    public ty(int i) {
        i = i == 0 ? SupportMenu.USER_MASK : i;
        if (i < 65535) {
            throw new IllegalArgumentException("recvbuf_size=" + i + " < MAX_PACKET_LENGTH=65535");
        }
        this.f4992 = new uc(i);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final boolean m1100(ByteBuffer byteBuffer, pq pqVar, pr prVar) {
        int iM968;
        if (this.f4993 != 0) {
            if (byteBuffer.remaining() < 4) {
                return false;
            }
            int i = byteBuffer.getInt();
            if (i != this.f4993) {
                String str = "Unexpected account_id arrived: " + i + " instead of " + this.f4993;
                pc.m997(String.valueOf(str) + " Packet dump: " + pa.m974((Object) byteBuffer.array()));
                throw new RuntimeException(str);
            }
            this.f4993 = 0;
            return true;
        }
        if (byteBuffer.remaining() < 2) {
            return false;
        }
        int iPosition = byteBuffer.position();
        int iM9682 = pa.m968(byteBuffer.getShort(byteBuffer.position()));
        vf vfVar = this.f4994.f4987.get(Integer.valueOf(iM9682));
        if (vfVar == null) {
            pa.m977(Arrays.copyOfRange(byteBuffer.array(), byteBuffer.position(), byteBuffer.position() + byteBuffer.remaining()), ",");
            pc.m994();
            throw new uu("Unexpected packet 0x" + Integer.toHexString(iM9682) + " received (probable length = " + byteBuffer.remaining() + ")\n Prev. packet: " + this.f4988 + " (0x" + Integer.toHexString(this.f4989) + ", " + this.f4990 + " bytes)\n");
        }
        int i2 = vfVar.mo1040();
        if (i2 == -1) {
            if (byteBuffer.remaining() < 4) {
                return false;
            }
            iM968 = pa.m968(byteBuffer.getShort(byteBuffer.position() + 2));
        } else {
            iM968 = i2 + 2;
        }
        if (byteBuffer.remaining() < iM968) {
            return false;
        }
        this.f4988 = vfVar.getClass();
        this.f4989 = iM9682;
        this.f4990 = iM968;
        if (iM9682 != pg.BC_RESOURCECHUNK.f4538 && iM9682 != pg.BC_KEEPALIVE_ACK.f4538 && iM9682 != pg.CB_KEEPALIVE.f4538) {
            new StringBuilder("Parsing ").append(vfVar.getClass()).append(" (0x").append(Integer.toHexString(iM9682)).append("/").append(iM968).append(")");
            pc.m995();
        }
        if (pqVar != null) {
            pqVar.m1073(byteBuffer, vfVar, iM9682);
        }
        if (prVar != null) {
            prVar.m1082(byteBuffer, (ve) vfVar, iM9682, false);
        }
        byteBuffer.position(byteBuffer.position() + 2);
        vfVar.mo1105(byteBuffer);
        try {
            vfVar.mo1041();
        } catch (uz e) {
            e.getMessage();
            pc.m995();
        }
        byteBuffer.position(iPosition + iM968);
        return true;
    }
}
