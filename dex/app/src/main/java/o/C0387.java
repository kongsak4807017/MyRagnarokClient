package o;

import java.nio.ByteBuffer;
import java.text.NumberFormat;

/* renamed from: o.Ϭ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0387 extends ub {
    C0387() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 236;
        byte b = byteBuffer.get();
        if (z) {
            return;
        }
        iz izVar = C0358.f6674.f42.f1749;
        if (b > 0) {
            izVar.f1709.setEnabled(false);
        } else {
            izVar.f1714.setEnabled(false);
            izVar.f1711.setEnabled(false);
            izVar.f1711.setText(String.valueOf(NumberFormat.getInstance().format(izVar.f1717)) + " Z");
        }
        izVar.f1710.setEnabled(izVar.f1714.isEnabled() || !(izVar.f1714.isEnabled() || izVar.f1709.isEnabled()));
        if (izVar.f1714.isEnabled() || izVar.f1709.isEnabled()) {
            izVar.f1710.setText("Ok");
        } else {
            izVar.f1710.setText("Trade");
        }
    }
}
