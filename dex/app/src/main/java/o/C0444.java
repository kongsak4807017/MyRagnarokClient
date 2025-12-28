package o;

import android.widget.Toast;
import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import org.apache.http.HttpStatus;

/* renamed from: o.૱ଂ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0444 extends ub {
    C0444() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 112;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        if (b != 0) {
            nz.m907("unexpected chardelete reply " + ((int) b));
        }
        c_activity c_activityVar = C0358.f6674;
        cv cvVar = C0358.f6685;
        String strM649 = C0358.f6687.m649(HttpStatus.SC_MOVED_TEMPORARILY);
        Toast.makeText(c_activityVar, strM649 == null ? "MSG302" : strM649, 1).show();
    }
}
