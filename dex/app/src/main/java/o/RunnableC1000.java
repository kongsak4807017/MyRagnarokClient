package o;

import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o.C0640;

/* renamed from: o.긫, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class RunnableC1000 implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ C0640.Cif f8471 = null;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ Handler f8472;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ C0640.InterfaceC0643 f8473;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ List f8474;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0640 f8475;

    public RunnableC1000(C0640 c0640, ArrayList arrayList, C0640.InterfaceC0643 interfaceC0643, Handler handler, C0640.Cif cif) {
        this.f8475 = c0640;
        this.f8474 = arrayList;
        this.f8473 = interfaceC0643;
        this.f8472 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() throws C0485 {
        C0640 c0640;
        ArrayList arrayList = new ArrayList();
        for (C1067 c1067 : this.f8474) {
            try {
                c0640 = this.f8475;
                c0640.m1405("consume");
            } catch (C0485 e) {
                arrayList.add(e.f6946);
            }
            if (!c1067.f8850.equals("inapp")) {
                throw new C0485(-1010, "Items of type '" + c1067.f8850 + "' can't be consumed.");
            }
            try {
                String str = c1067.f8844;
                String str2 = c1067.f8845;
                if (str == null || str.equals("")) {
                    Log.e(c0640.f7527, "In-app billing error: " + ("Can't consume " + str2 + ". No token."));
                    throw new C0485(-1007, "PurchaseInfo is missing token for sku: " + str2 + " " + c1067);
                }
                InterfaceC0957 interfaceC0957 = c0640.f7519;
                c0640.f7518.getPackageName();
                int iM1548 = interfaceC0957.m1548();
                if (iM1548 != 0) {
                    C0640.m1403(iM1548);
                    throw new C0485(iM1548, "Error consuming sku " + str2);
                }
                arrayList.add(new C0378(0, "Successful consume of sku " + c1067.f8845));
            } catch (RemoteException e2) {
                throw new C0485(-1001, "Remote exception while consuming. PurchaseInfo: " + c1067, e2);
            }
        }
        C0640 c06402 = this.f8475;
        c06402.f7517 = "";
        c06402.f7521 = false;
        if (this.f8473 != null) {
            this.f8472.post(new RunnableC0791(this, this.f8473, this.f8474, arrayList));
        }
        if (this.f8471 != null) {
            this.f8472.post(new RunnableC0621(this, this.f8471, this.f8474, arrayList));
        }
    }
}
