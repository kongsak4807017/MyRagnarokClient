package o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.섿, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1086 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f8865;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1086(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f8865 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        this.L.pushNumber(System.currentTimeMillis());
        return 1;
    }
}
