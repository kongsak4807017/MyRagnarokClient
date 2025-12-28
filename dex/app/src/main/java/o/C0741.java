package o;

import android.R;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import java.util.MissingResourceException;
import o.pj;

/* renamed from: o.朤, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0741 extends ub {
    C0741() {
    }

    @Override // o.ub
    /* renamed from: 鷭 */
    public final void mo1042(ByteBuffer byteBuffer, int i, boolean z, int i2) throws MissingResourceException {
        this.f5008 = (short) 2093;
        int iPosition = byteBuffer.position();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get(new byte[20]);
        int iPosition2 = byteBuffer.position();
        og[] ogVarArr = new og[i];
        for (int i3 = 0; i3 < ogVarArr.length; i3++) {
            ogVarArr[i3] = new og(byteBuffer);
        }
        if (z) {
            return;
        }
        m1440(ogVarArr, i2 - (iPosition2 - iPosition));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1440(og[] ogVarArr, int i) throws MissingResourceException {
        C0358.f6671.f758 = true;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(500);
        new og(byteBufferAllocate);
        if (byteBufferAllocate.position() * ogVarArr.length != i) {
            StringBuilder sb = new StringBuilder("Character size mismatch. Total client size: ");
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(500);
            new og(byteBufferAllocate2);
            StringBuilder sbAppend = sb.append(byteBufferAllocate2.position()).append("*").append(ogVarArr.length).append("=");
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(500);
            new og(byteBufferAllocate3);
            nz.m907(sbAppend.append(byteBufferAllocate3.position() * ogVarArr.length).append("; Server: ").append(i).toString());
            int length = ogVarArr.length / 2;
            ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(500);
            new og(byteBufferAllocate4);
            int iPosition = byteBufferAllocate4.position() / 2;
            ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(500);
            new og(byteBufferAllocate5);
            int iPosition2 = byteBufferAllocate5.position();
            int i2 = -1;
            for (int length2 = ogVarArr.length - length; length2 <= ogVarArr.length + length; length2++) {
                if (length2 > 0) {
                    int i3 = -1;
                    int i4 = 1;
                    while (true) {
                        if (i4 >= iPosition) {
                            break;
                        }
                        int i5 = iPosition2 + i4;
                        if (i5 * length2 == i) {
                            i3 = i5;
                            break;
                        }
                        int i6 = iPosition2 - i4;
                        if (i6 * length2 != i) {
                            i4++;
                        } else {
                            i3 = i6;
                            break;
                        }
                    }
                    if (i3 != -1) {
                        if (i2 == -1) {
                            i2 = i3;
                        }
                        nz.m907("Possible server character size: " + i3);
                    }
                }
            }
            if (i2 == -1) {
                StringBuilder sb2 = new StringBuilder("Character size mismatch. Client: ");
                ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(500);
                new og(byteBufferAllocate6);
                String string = sb2.append(byteBufferAllocate6.position()).append(", Server: unknown, ServerIP=").append(C0358.f6667.f4809).toString();
                Log.e("AndRO", string);
                throw new nv(string);
            }
            StringBuilder sb3 = new StringBuilder("Character size mismatch. Client: ");
            ByteBuffer byteBufferAllocate7 = ByteBuffer.allocate(500);
            new og(byteBufferAllocate7);
            String string2 = sb3.append(byteBufferAllocate7.position()).append(", Server: possibly ").append(i2).append("; ServerIP=").append(C0358.f6667.f4809).toString();
            Log.e("AndRO", string2);
            throw new nv(string2);
        }
        C0804 c0804 = C0358.f6674.f42.f1817;
        View viewFindViewById = ((ViewGroup) C0358.f6674.findViewById(R.id.content)).findViewById(2131296320);
        if (!(viewFindViewById != null && viewFindViewById == c0804.f7876)) {
            C0358.f6674.f42.f1817.h_();
            my myVar = oc.f3250;
            if ((myVar == my.MOTR || myVar == my.all) && (C0358.f6667.f4771 == pj.aux.MOTR || C0358.f6667.f4771 == pj.aux.MOTR_home)) {
                String iSO3Country = C0358.f6674.getResources().getConfiguration().locale.getISO3Country();
                if (!iSO3Country.equals("RUS") && !iSO3Country.equals("UKR") && !iSO3Country.equals("BLR")) {
                    C0358.f6671.mo454(new C0533());
                }
            }
        }
        C0358.f6685.mo139(new RunnableC0410(C0358.f6674.f42.f1817, ogVarArr));
    }
}
