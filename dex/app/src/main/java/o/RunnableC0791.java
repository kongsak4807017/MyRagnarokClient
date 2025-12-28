package o;

import java.util.ArrayList;
import java.util.List;
import o.C0640;

/* renamed from: o.狷, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class RunnableC0791 implements Runnable {

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ List f7845;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ List f7846;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0640.InterfaceC0643 f7847;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ RunnableC1000 f7848;

    RunnableC0791(RunnableC1000 runnableC1000, C0640.InterfaceC0643 interfaceC0643, List list, ArrayList arrayList) {
        this.f7848 = runnableC1000;
        this.f7847 = interfaceC0643;
        this.f7846 = list;
        this.f7845 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7847.mo554((C1067) this.f7846.get(0), (C0378) this.f7845.get(0));
    }
}
