package o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.笫, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0830 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f7942;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0830(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f7942 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        this.L.toInteger(2);
        int integer = this.L.toInteger(3);
        C0358.f6671.mo454(new C0889(this.L.toInteger(4), integer, this.L.toInteger(5), this.L.toInteger(6)));
        this.L.pushNil();
        return 1;
    }
}
