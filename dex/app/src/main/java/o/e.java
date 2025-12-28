package o;

import com.roworkshop.andro.c_activity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.b.C0024;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class e implements Runnable {

    /* renamed from: Ą, reason: contains not printable characters */
    private final /* synthetic */ of f1142;

    /* renamed from: ą, reason: contains not printable characters */
    private final /* synthetic */ Runnable f1143;

    /* renamed from: Ć, reason: contains not printable characters */
    private final /* synthetic */ Runnable f1144;

    /* renamed from: ć, reason: contains not printable characters */
    private final /* synthetic */ Runnable f1145;

    /* renamed from: ȃ, reason: contains not printable characters */
    private final /* synthetic */ ns f1146;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ int f1147;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ String f1148;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ b f1149;

    e(b bVar, String str, int i, ns nsVar, c_activity c_activityVar, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        this.f1149 = bVar;
        this.f1148 = str;
        this.f1147 = i;
        this.f1146 = nsVar;
        this.f1142 = c_activityVar;
        this.f1143 = runnable;
        this.f1144 = runnable2;
        this.f1145 = runnable3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f1149;
        String str = this.f1148;
        int i = this.f1147;
        ns nsVar = this.f1146;
        of ofVar = this.f1142;
        Runnable runnable = this.f1143;
        Runnable runnable2 = this.f1144;
        Runnable runnable3 = this.f1145;
        bVar.f759 = bVar.new C0024();
        bVar.f759.f783 = str;
        bVar.f759.f781 = i;
        bVar.f759.f777 = nsVar;
        bVar.f759.f775 = ofVar != null ? ofVar : C0358.f6674;
        bVar.f759.f770 = runnable;
        bVar.f759.f771 = runnable2;
        bVar.f759.f772 = runnable3;
        bVar.f759.f773 = System.currentTimeMillis();
        bVar.f759.f778 = new uc(bVar.f761);
        bVar.f759.f782 = (ByteBuffer) ByteBuffer.allocate(bVar.f764).order(ByteOrder.LITTLE_ENDIAN).position(0);
        if (!(bVar.f759.f777 == ns.RESOURCE)) {
            C0358.f6674.mo139(new g(bVar));
        }
    }
}
