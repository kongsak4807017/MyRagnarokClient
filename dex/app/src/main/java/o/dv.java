package o;

import java.util.HashMap;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dv {

    /* renamed from: 鷭, reason: contains not printable characters */
    HashMap<Integer, C0031> f1121 = new HashMap<>();

    /* renamed from: 櫯, reason: contains not printable characters */
    int f1120 = 0;

    /* renamed from: o.dv$鷭, reason: contains not printable characters */
    class C0031 {

        /* renamed from: 鷭, reason: contains not printable characters */
        String f1123;

        private C0031() {
        }

        /* synthetic */ C0031(dv dvVar, C0031 c0031) {
            this();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m568(cr crVar) throws nx {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading random option db..."));
        LuaState luaStateNewLuaState = LuaStateFactory.newLuaState();
        byte[] bArr = (byte[]) crVar.m519("data\\lua files\\datainfo\\enumvar.lub", false);
        byte[] bArr2 = (byte[]) crVar.m519("data\\lua files\\datainfo\\addrandomoptionnametable.lub", false);
        try {
            ny.m906(luaStateNewLuaState, bArr);
            try {
                ny.m906(luaStateNewLuaState, bArr2);
                luaStateNewLuaState.getGlobal("NameTable_VAR");
                if (luaStateNewLuaState.isTable(-1)) {
                    luaStateNewLuaState.pushNil();
                    while (luaStateNewLuaState.next(-2) != 0) {
                        int integer = luaStateNewLuaState.toInteger(-2);
                        C0031 c0031 = new C0031(this, null);
                        c0031.f1123 = ny.m904(luaStateNewLuaState, ow.LOCAL);
                        if (c0031.f1123.equals("END")) {
                            this.f1120 = integer;
                        }
                        this.f1121.put(Integer.valueOf(integer), c0031);
                        luaStateNewLuaState.pop(1);
                    }
                }
                luaStateNewLuaState.pop(1);
                luaStateNewLuaState.close();
            } catch (nw e) {
                throw new nx("addrandomoptionnametable.lub", e.getMessage());
            }
        } catch (nw e2) {
            throw new nx("enumvar.lub", e2.getMessage());
        }
    }

    public dv(cr crVar) throws nx {
        m568(crVar);
    }
}
