package o;

import java.util.HashMap;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class dw {

    /* renamed from: 鷭, reason: contains not printable characters */
    HashMap<Integer, C0032> f1124 = new HashMap<>();

    /* renamed from: o.dw$鷭, reason: contains not printable characters */
    class C0032 {

        /* renamed from: 櫯, reason: contains not printable characters */
        String f1126;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f1127;

        private C0032() {
        }

        /* synthetic */ C0032(dw dwVar, C0032 c0032) {
            this();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m569(cr crVar) throws nx {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading sprite robe db..."));
        LuaState luaStateNewLuaState = LuaStateFactory.newLuaState();
        byte[] bArr = (byte[]) crVar.m519("data\\lua files\\datainfo\\spriterobeid.lub", false);
        byte[] bArr2 = (byte[]) crVar.m519("data\\lua files\\datainfo\\spriterobename.lub", false);
        try {
            ny.m906(luaStateNewLuaState, bArr);
            try {
                ny.m906(luaStateNewLuaState, bArr2);
                luaStateNewLuaState.getGlobal("RobeNameTable");
                if (luaStateNewLuaState.isTable(-1)) {
                    luaStateNewLuaState.pushNil();
                    while (luaStateNewLuaState.next(-2) != 0) {
                        int integer = luaStateNewLuaState.toInteger(-2);
                        C0032 c0032 = new C0032(this, null);
                        c0032.f1127 = ny.m904(luaStateNewLuaState, ow.KOREAN);
                        this.f1124.put(Integer.valueOf(integer), c0032);
                        luaStateNewLuaState.pop(1);
                    }
                }
                luaStateNewLuaState.pop(1);
                luaStateNewLuaState.getGlobal("RobeNameTable_Eng");
                if (luaStateNewLuaState.isTable(-1)) {
                    luaStateNewLuaState.pushNil();
                    while (luaStateNewLuaState.next(-2) != 0) {
                        int integer2 = luaStateNewLuaState.toInteger(-2);
                        String strM904 = ny.m904(luaStateNewLuaState, ow.KOREAN);
                        C0032 c00322 = this.f1124.get(Integer.valueOf(integer2));
                        if (c00322 == null) {
                            nz.m907("RobeNameTable_Eng: failed to find RobeNameTable entry for robe. robe_id=" + integer2 + " spritename=" + strM904);
                        } else {
                            c00322.f1126 = strM904;
                        }
                        luaStateNewLuaState.pop(1);
                    }
                }
                luaStateNewLuaState.pop(1);
                luaStateNewLuaState.close();
            } catch (nw e) {
                throw new nx("spriterobename.lub", e.getMessage());
            }
        } catch (nw e2) {
            throw new nx("spriterobeid.lub", e2.getMessage());
        }
    }

    public dw(cr crVar) throws nx {
        m569(crVar);
    }
}
