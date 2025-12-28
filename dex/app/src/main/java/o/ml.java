package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ml implements Runnable {

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ C0564 f2133;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ mk f2134;

    ml(mk mkVar, C0564 c0564) {
        this.f2134 = mkVar;
        this.f2133 = c0564;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mj mjVar = this.f2134.f2132;
        mjVar.f7638 = this.f2133;
        mjVar.m1423(mjVar.f7634, mjVar.f7629);
        this.f2134.f2132.f2128 = false;
        if ((this.f2134.f2132.f2123.f1997 == nu.MOB || this.f2134.f2132.f2123.f1997 == nu.NPC) && this.f2134.f2132.f2123.f2001 != EnumC0431.FLAG_CLASS.f6846) {
            C0358.f6669.f2048.f1538.put(Integer.valueOf(this.f2134.f2132.f2123.f2001), this.f2133);
        } else if (this.f2134.f2132.f2123.f1997 == nu.ITEM) {
            C0358.f6669.f2048.f1539.put(Integer.valueOf(this.f2134.f2132.f2123.f2001), this.f2133);
        }
    }
}
