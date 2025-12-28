package o;

import android.support.v4.view.ViewCompat;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class aew extends aev {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final DataInputStream f655;

    public aew(ByteArrayInputStream byteArrayInputStream) throws aem {
        this.f655 = new DataInputStream(byteArrayInputStream);
        if (this.f655.readUnsignedByte() != 0) {
            throw new aem();
        }
        this.f653 = this.f655.readInt();
        this.f654 = -1;
    }

    @Override // o.aev
    /* renamed from: 鷭 */
    public final void mo429() {
        if ((this.f654 & ViewCompat.MEASURED_STATE_MASK) == 0) {
            this.f653 = (this.f653 << 8) | this.f655.readUnsignedByte();
            this.f654 <<= 8;
        }
    }
}
