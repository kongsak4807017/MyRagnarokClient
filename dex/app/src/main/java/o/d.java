package o;

import android.support.v4.internal.view.SupportMenu;
import com.roworkshop.ro.natives;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class d implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ vg f1055;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ b f1056;

    d(b bVar, vg vgVar) {
        this.f1056 = bVar;
        this.f1055 = vgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f1056;
        vg vgVar = this.f1055;
        if (vgVar.mo1099() == 0) {
            throw new RuntimeException("Trying to send " + vgVar.getClass() + " with zero header. Probably packet header not set in the constructor.");
        }
        if (bVar.f757 == null || !bVar.f757.f780.isConnected() || bVar.f757.f780.isClosed()) {
            return;
        }
        synchronized (bVar.f757) {
            my myVar = oc.f3250;
            if ((myVar == my.MOTR || myVar == my.all) && bVar.f753.f3365) {
                if (bVar.f762 == null) {
                    bVar.f762 = ByteBuffer.allocate(SupportMenu.USER_MASK).order(ByteOrder.LITTLE_ENDIAN);
                }
                bVar.f762.position(4);
                vgVar.mo1043(bVar.f762, true);
                bVar.m455(vgVar, bVar.f762, 4);
                bVar.m453(vgVar, bVar.f762, 4);
                if (vgVar.getClass() != wb.class) {
                    new StringBuilder("AES Sending ").append(vgVar.getClass()).append(" (0x").append(Integer.toHexString(pa.m968(vgVar.mo1099()))).append("/").append(bVar.f762.position() - 4).append(")");
                }
                bVar.f762.putInt(0, bVar.f762.position());
                bVar.f757.f782.position(bVar.f757.f782.position() + natives.procpacketsend(bVar.f762.array(), bVar.f762.position(), bVar.f753.f3363, bVar.f757.f782.array(), bVar.f757.f782.position()));
            } else {
                int iPosition = bVar.f757.f782.position();
                vgVar.mo1043(bVar.f757.f782, true);
                bVar.m455(vgVar, bVar.f757.f782, iPosition);
                if (bVar.f750 != null) {
                    int iPosition2 = bVar.f757.f782.position();
                    bVar.f757.f782.position(iPosition);
                    bVar.f750.m1073(bVar.f757.f782, vgVar, pa.m968(bVar.f757.f782.getShort(iPosition)));
                    bVar.f757.f782.position(iPosition2);
                }
                if (bVar.f751 != null) {
                    int iPosition3 = bVar.f757.f782.position();
                    bVar.f757.f782.position(iPosition);
                    bVar.f751.m1082(bVar.f757.f782, (ve) vgVar, pa.m968(bVar.f757.f782.getShort(iPosition)), true);
                    bVar.f757.f782.position(iPosition3);
                }
                bVar.m453(vgVar, bVar.f757.f782, iPosition);
                if (vgVar.getClass() != wb.class) {
                    new StringBuilder("Sending ").append(vgVar.getClass()).append(" (0x").append(Integer.toHexString(pa.m968(vgVar.mo1099()))).append("/").append(bVar.f757.f782.position() - iPosition).append(")");
                }
            }
            bVar.f757.f782.flip();
            try {
                bVar.f757.f780.getOutputStream().write(bVar.f757.f782.array(), bVar.f757.f782.position(), bVar.f757.f782.remaining());
                bVar.f757.f780.getOutputStream().flush();
            } catch (IOException unused) {
                if (bVar.f757 != null) {
                    bVar.f757.f774 = true;
                }
            }
            bVar.f757.f782.position(0);
            bVar.f757.f782.limit(bVar.f757.f782.capacity());
        }
    }
}
