package o;

import android.app.AlertDialog;
import android.os.Handler;
import java.util.ArrayList;
import o.C0640;
import o.vw;

/* renamed from: o.Į, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0146 extends vw implements vf {

    /* renamed from: ȃ, reason: contains not printable characters */
    private static /* synthetic */ int[] f6508;

    /* renamed from: ą, reason: contains not printable characters */
    private static /* synthetic */ int[] m1257() {
        int[] iArr = f6508;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[vw.EnumC0121.valuesCustom().length];
        try {
            iArr2[vw.EnumC0121.FAIL_ALREADYACTIVATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[vw.EnumC0121.FAIL_MALFORMED_DATA.ordinal()] = 5;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[vw.EnumC0121.FAIL_NO_SUCH_PRODUCT.ordinal()] = 6;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vw.EnumC0121.FAIL_OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[vw.EnumC0121.FAIL_RAGNAROK_SERVER_OFFLINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[vw.EnumC0121.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        f6508 = iArr2;
        return iArr2;
    }

    public C0146() {
        super(null);
    }

    @Override // o.vf
    /* renamed from: 鷭 */
    public final void mo1041() {
        switch (m1257()[this.f5436.ordinal()]) {
            case 1:
            case 2:
            case 5:
                dl dlVar = C0358.f6676;
                if (!dlVar.f1079) {
                    throw new RuntimeException("Purchase verification is not in progress, unexpected consume request");
                }
                C0640 c0640 = dlVar.f1080;
                C1067 c1067 = dlVar.f1078;
                C0640.InterfaceC0643 interfaceC0643 = dlVar.f1075;
                c0640.m1405("consume");
                ArrayList arrayList = new ArrayList();
                arrayList.add(c1067);
                Handler handler = new Handler();
                c0640.m1404("consume");
                new Thread(new RunnableC1000(c0640, arrayList, interfaceC0643, handler, null)).start();
                return;
            case 3:
            case 4:
            default:
                nz.m907("Purchase verification error: " + this.f5436.f5444);
                dl dlVar2 = C0358.f6676;
                String str = this.f5436.f5444;
                C0358.f6674.mo139(new jt(C0358.f6674.f42));
                if (str == null) {
                    new AlertDialog.Builder(C0358.f6674).setMessage("Purchase verification failed.").show();
                } else {
                    new AlertDialog.Builder(C0358.f6674).setMessage(str).show();
                }
                dlVar2.f1078 = null;
                dlVar2.f1079 = false;
                return;
        }
    }
}
