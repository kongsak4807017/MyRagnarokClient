package o;

import java.util.Map;
import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/* renamed from: o.䖫, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0602 extends JavaFunction {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ C1095 f7400;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0602(C1095 c1095, LuaState luaState) {
        super(luaState);
        this.f7400 = c1095;
    }

    @Override // org.keplerproject.luajava.JavaFunction
    public final int execute() {
        this.L.newTable();
        int i = 1;
        for (Map.Entry<Integer, mj> entry : C0358.f6669.f2048.f1545.entrySet()) {
            mj value = entry.getValue();
            if (value.f2123.f1997 == nu.MOB) {
                lm lmVar = C0358.f6664.f2005.get(entry.getKey().intValue());
                if (!((AbstractC0988) (AbstractC0988.class.isAssignableFrom(lmVar.getClass()) ? lmVar : null)).f8371) {
                    int i2 = i;
                    i++;
                    this.L.pushNumber(i2);
                    this.L.pushInteger(value.f2123.f1998);
                    this.L.setTable(-3);
                }
            }
        }
        return 1;
    }
}
