package o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.씈, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1093 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f8869;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1093(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f8869 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        this.L.toInteger(2);
        this.L.newTable();
        this.L.pushNumber(1.0d);
        this.L.pushNumber(this.f8869.f8877.f8655.ordinal());
        this.L.setTable(-3);
        return 1;
    }
}
