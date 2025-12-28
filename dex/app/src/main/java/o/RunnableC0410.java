package o;

import java.util.ArrayList;
import o.C0804;
import o.C0804.C0805;
import o.C0804.C0807;

/* renamed from: o.Ք, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0410 implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ og[] f6793;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C0804 f6794;

    RunnableC0410(C0804 c0804, og[] ogVarArr) {
        this.f6794 = c0804;
        this.f6793 = ogVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Loading characters"));
        if (this.f6794.f7870 == null) {
            je jeVar2 = C0358.f6674.f42;
            if (jeVar2.f1735 != null) {
                C0358.f6674.mo139(new jt(jeVar2));
            }
            C0358.f6674.mo139(new jr(jeVar2, "Loading new character sprite"));
            this.f6794.f7870 = this.f6794.new C0805(EnumC0134.NOVICE, EnumC0765.valuesCustom()[C0358.f6688.f6690]);
        }
        ArrayList arrayList = new ArrayList();
        for (og ogVar : this.f6793) {
            String strM978 = pa.m978(ogVar.f3280, ow.LOCAL);
            je jeVar3 = C0358.f6674.f42;
            String str = "Loading " + strM978;
            if (jeVar3.f1735 != null) {
                C0358.f6674.mo139(new jt(jeVar3));
            }
            C0358.f6674.mo139(new jr(jeVar3, str));
            C0804.C0807 c0807 = this.f6794.new C0807();
            c0807.f7917 = ogVar;
            c0807.f7918 = strM978;
            c0807.f7919 = C0358.f6685.m539(ogVar, ogVar.f3272);
            arrayList.add(c0807);
        }
        C0358.f6674.mo139(new RunnableC0914(this, arrayList));
    }
}
