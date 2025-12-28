package o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.賠, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0866 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f8040;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0866(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f8040 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        C0358.f6671.mo454(new C0173(this.L.toInteger(2), this.L.toInteger(3)));
        ln lnVar = C0358.f6664;
        lnVar.f2005.get(this.f8040.f8877.f8661.f8689).f2003 = nl.MOTION_ATTACK;
        this.L.pushNil();
        return 1;
    }
}
