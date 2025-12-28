package o;

import android.widget.ListAdapter;
import java.nio.ByteBuffer;
import o.C0972.Cif;

/* renamed from: o.䓪, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0587 extends ub {
    C0587() {
    }

    /* renamed from: o.䓪$鷭, reason: contains not printable characters */
    class C0588 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        String f7378;

        /* renamed from: 櫯, reason: contains not printable characters */
        String f7379;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f7380;

        C0588(ByteBuffer byteBuffer) {
            String strM978;
            ow owVar = ow.LOCAL;
            byte[] bArr = new byte[24];
            byteBuffer.get(bArr);
            this.f7380 = pa.m978(bArr, owVar);
            if (C0358.f6667.f4838) {
                strM978 = null;
            } else {
                ow owVar2 = ow.LOCAL;
                byte[] bArr2 = new byte[24];
                byteBuffer.get(bArr2);
                strM978 = pa.m978(bArr2, owVar2);
            }
            this.f7379 = strM978;
            ow owVar3 = ow.LOCAL;
            byte[] bArr3 = new byte[40];
            byteBuffer.get(bArr3);
            this.f7378 = pa.m978(bArr3, owVar3);
        }
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) {
        this.f5008 = (short) 355;
        C0588[] c0588Arr = new C0588[i];
        for (int i3 = 0; i3 < c0588Arr.length; i3++) {
            c0588Arr[i3] = new C0588(byteBuffer);
        }
        if (z) {
            return;
        }
        if (C0358.f6664.f2004.f8635 == null) {
            C0358.f6664.f2004.f8635 = new C0972();
        }
        C0972 c0972 = C0358.f6664.f2004.f8635;
        c0972.f8299.clear();
        for (C0588 c0588 : c0588Arr) {
            c0972.f8299.add(c0972.new Cif(c0588.f7380, c0588.f7378));
        }
        if (C0358.f6674.f42.f1748.f1994.getParent() != null) {
            C0358.f6674.f42.f1748.f7699.f9005.setAdapter((ListAdapter) new C0970());
        }
    }
}
