package o;

import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.뫙, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1065 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f8840;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1065(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f8840 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        lm lmVar = C0358.f6664.f2005.get(this.L.toInteger(2));
        if (lmVar != null) {
            if ((AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null) != null) {
                if (lmVar.f1997 == nu.MOB) {
                    if (!((AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null)).f8371) {
                        this.L.pushNumber(1.0d);
                        return 1;
                    }
                }
                this.L.pushNumber(0.0d);
                return 1;
            }
        }
        this.L.pushNumber(0.0d);
        return 1;
    }
}
