package o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.歀, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0770 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f7797;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0770(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f7797 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        C0358.f6671.mo454(new C0880(this.L.toInteger(2)));
        this.L.pushNil();
        return 1;
    }
}
