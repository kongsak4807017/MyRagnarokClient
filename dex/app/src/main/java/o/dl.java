package o;

import android.app.AlertDialog;
import java.util.LinkedList;
import o.C0640;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class dl {

    /* renamed from: ˮ͍, reason: contains not printable characters */
    private static final byte[] f1072 = {112, 69, -82, -92, 3, 14, -2, 9, -1, 14, -5, 13, 7, -60, 59, 18, 4};

    /* renamed from: 岱, reason: contains not printable characters */
    private static int f1073 = 169;

    /* renamed from: ȃ, reason: contains not printable characters */
    C1067 f1078;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    boolean f1079;

    /* renamed from: 櫯, reason: contains not printable characters */
    public C0640 f1080;

    /* renamed from: Ą, reason: contains not printable characters */
    LinkedList<C1067> f1074 = new LinkedList<>();

    /* renamed from: ć, reason: contains not printable characters */
    private C0640.InterfaceC0641 f1077 = new dm(this);

    /* renamed from: ą, reason: contains not printable characters */
    C0640.InterfaceC0643 f1075 = new dn(this);

    /* renamed from: Ć, reason: contains not printable characters */
    C0640.InterfaceC0642 f1076 = new Cdo(this);

    /* renamed from: 鷭, reason: contains not printable characters */
    du f1081 = new du("c_resource_network_thread");

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m552(int i, int i2, int i3) {
        int i4 = 4 - (i2 * 3);
        int i5 = 0;
        int i6 = 14 - (i3 * 2);
        byte[] bArr = f1072;
        int i7 = 114 - (i * 4);
        byte[] bArr2 = new byte[i6];
        int i8 = i6 - 1;
        if (bArr == null) {
            i7 = (i7 + i8) - 6;
            i4++;
        }
        while (true) {
            bArr2[i5] = (byte) i7;
            if (i5 == i8) {
                return new String(bArr2, 0);
            }
            i5++;
            i7 = (i7 + bArr[i4]) - 6;
            i4++;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private int m551() throws InterruptedException {
        iw iwVar = new iw("Ping thread");
        boolean[] zArr = new boolean[1];
        if (C0358.f6667.f4855.size() == 0) {
            return 0;
        }
        int[] iArr = new int[C0358.f6667.f4855.size()];
        iwVar.mo139(new dp(this, iArr, zArr));
        while (!zArr[0]) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
        }
        iwVar.f1700.interrupt();
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] != -2 && i > iArr[i3]) {
                i = iArr[i3];
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return C0358.f6667.f4855.size() - 1;
        }
        return i2;
    }

    dl() throws InterruptedException {
        String strM552;
        int iIntValue;
        int iM551 = m551();
        if (C0358.f6667.f4855.size() > 0) {
            strM552 = C0358.f6667.f4855.get(iM551);
            iIntValue = C0358.f6667.f4860.get(iM551).intValue();
        } else {
            int i = f1072[8] + 1;
            strM552 = m552(i, i, i);
            iIntValue = 4121;
        }
        du duVar = this.f1081;
        String str = strM552;
        duVar.mo139(new e(duVar, str, iIntValue, ns.RESOURCE, C0358.f6674, new dq(this), new dr(this), new ds(this)));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m553(C1067 c1067) {
        if (this.f1079) {
            throw new RuntimeException("Purchase processing in already progress. Can't process multiple purchases at once.");
        }
        if (!this.f1081.mo457()) {
            new AlertDialog.Builder(C0358.f6674).setMessage("Failed to verify purchase: not connected to Billing Server. The purchase will be verified later.").show();
            return;
        }
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Verifying purchase..."));
        this.f1079 = true;
        this.f1078 = c1067;
        this.f1081.mo454(new wj(c1067.f8847, c1067.f8848));
    }
}
