package o;

import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lx {

    /* renamed from: 鷭, reason: contains not printable characters */
    HashMap<Integer, C0061> f2043 = new HashMap<>();

    /* renamed from: o.lx$鷭, reason: contains not printable characters */
    class C0061 {

        /* renamed from: ˮ͈, reason: contains not printable characters */
        EnumC0615 f2045;

        /* renamed from: 櫯, reason: contains not printable characters */
        String f2046;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f2047;

        private C0061() {
        }

        /* synthetic */ C0061(lx lxVar, C0061 c0061) {
            this();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m807(cr crVar) throws Resources.NotFoundException, nx, IOException {
        byte[] bArrM140;
        LuaState luaStateNewLuaState = LuaStateFactory.newLuaState();
        if (!C0358.f6667.f4850) {
            bArrM140 = (byte[]) crVar.m519("data\\lua files\\datainfo\\weapontable.lub", false);
        } else {
            bArrM140 = C0358.f6674.m140(2130968593);
        }
        try {
            ny.m906(luaStateNewLuaState, bArrM140);
            luaStateNewLuaState.getGlobal("WeaponNameTable");
            luaStateNewLuaState.pushNil();
            while (luaStateNewLuaState.next(-2) != 0) {
                int integer = luaStateNewLuaState.toInteger(-2);
                C0061 c0061 = new C0061(this, null);
                c0061.f2047 = ny.m904(luaStateNewLuaState, ow.KOREAN);
                this.f2043.put(Integer.valueOf(integer), c0061);
                luaStateNewLuaState.pop(1);
            }
            luaStateNewLuaState.pop(1);
            luaStateNewLuaState.getGlobal("WeaponHitWaveNameTable");
            luaStateNewLuaState.pushNil();
            while (luaStateNewLuaState.next(-2) != 0) {
                int integer2 = luaStateNewLuaState.toInteger(-2);
                C0061 c00612 = this.f2043.get(Integer.valueOf(integer2));
                if (c00612 == null) {
                    String str = "No sprite for weapon type " + integer2;
                    Log.e("AndRO", str);
                    throw new nv(str);
                }
                c00612.f2046 = ny.m904(luaStateNewLuaState, ow.KOREAN);
                if (integer2 >= 0 && integer2 < EnumC0615.valuesCustom().length) {
                    c00612.f2045 = EnumC0615.valuesCustom()[integer2];
                }
                luaStateNewLuaState.pop(1);
            }
            luaStateNewLuaState.pop(1);
            luaStateNewLuaState.getGlobal("Expansion_Weapon_IDs");
            if (!luaStateNewLuaState.isNil(-1)) {
                luaStateNewLuaState.pushNil();
                while (luaStateNewLuaState.next(-2) != 0) {
                    int integer3 = luaStateNewLuaState.toInteger(-2);
                    int integer4 = luaStateNewLuaState.toInteger(-1);
                    if (integer4 < 0 || integer4 >= EnumC0615.valuesCustom().length) {
                        String str2 = "Invalid weapontype " + integer4 + " for weapon view " + integer3;
                        Log.e("AndRO", str2);
                        throw new nv(str2);
                    }
                    C0061 c00613 = this.f2043.get(Integer.valueOf(integer3));
                    if (c00613 == null) {
                        String str3 = "No entry for weapon view " + integer3;
                        Log.e("AndRO", str3);
                        throw new nv(str3);
                    }
                    c00613.f2045 = EnumC0615.valuesCustom()[integer4];
                    luaStateNewLuaState.pop(1);
                }
            }
            luaStateNewLuaState.close();
        } catch (nw e) {
            throw new nx("npcidentity.lua", e.getMessage());
        }
    }

    public lx(cr crVar) throws Resources.NotFoundException, nx, IOException {
        m807(crVar);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m808(EnumC0615 enumC0615) {
        C0061 c0061;
        if (enumC0615 == null || (c0061 = this.f2043.get(Integer.valueOf(enumC0615.ordinal()))) == null) {
            return null;
        }
        return c0061.f2046;
    }
}
