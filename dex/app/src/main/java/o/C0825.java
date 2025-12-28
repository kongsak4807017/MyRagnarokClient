package o;

import java.nio.ByteBuffer;
import org.apache.http.protocol.HTTP;

/* renamed from: o.禲, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0825 extends ub {
    C0825() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 182;
        byteBuffer.getInt();
        if (z) {
            return;
        }
        n nVar = C0358.f6674.f42.f1797;
        nVar.f2326.setText(HTTP.CONN_CLOSE);
        nVar.f2326.setVisibility(0);
        nVar.f2326.setOnClickListener(nVar.f2323);
    }
}
