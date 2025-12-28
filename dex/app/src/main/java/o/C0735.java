package o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.斮, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0735 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f7712;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0735(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f7712 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        this.L.toInteger(2);
        int integer = this.L.toInteger(3);
        int integer2 = this.L.toInteger(4);
        int integer3 = this.L.toInteger(5);
        this.f7712.f8877.f8665 = integer3;
        if (this.f7712.f8877.f8661.f8684 == nu.HOM) {
            C0358.f6671.mo454(new C0425(integer2, integer, integer3));
        } else {
            C0358.f6671.mo454(new C0163((short) integer2, (short) integer, integer3));
        }
        this.L.pushNil();
        return 1;
    }
}
