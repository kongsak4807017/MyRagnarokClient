package o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.鳿, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0955 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f8265;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0955(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f8265 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        C0358.f6671.mo454(new C0174(this.L.toInteger(2), (short) this.L.toInteger(3), (short) this.L.toInteger(4)));
        this.L.pushNil();
        return 1;
    }
}
