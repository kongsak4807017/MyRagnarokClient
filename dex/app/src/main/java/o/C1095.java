package o;

import android.app.AlertDialog;
import o.C1035;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* renamed from: o.욝, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1095 {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private LuaState f8875;

    /* renamed from: 櫯, reason: contains not printable characters */
    private LuaState f8876;

    /* renamed from: 鷭, reason: contains not printable characters */
    C1035.Cif f8877;

    /* renamed from: ȃ, reason: contains not printable characters */
    private boolean f8874 = false;

    /* renamed from: Ą, reason: contains not printable characters */
    private boolean f8872 = true;

    /* renamed from: ą, reason: contains not printable characters */
    private boolean f8873 = true;

    C1095() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m1631(nu nuVar) {
        boolean z;
        LuaState luaState;
        C1035.Cif cif;
        LuaState luaState2;
        if (nuVar == nu.MER) {
            this.f8877 = C0358.f6664.f2004.f8632;
            z = this.f8873;
            luaState = this.f8875;
            cif = C0358.f6664.f2004.f8632;
        } else if (nuVar == nu.HOM) {
            this.f8877 = C0358.f6664.f2004.f8618;
            z = this.f8872;
            luaState = this.f8876;
            cif = C0358.f6664.f2004.f8618;
        } else {
            return;
        }
        if (z) {
            if (luaState == null) {
                if (nuVar == nu.HOM) {
                    this.f8876 = LuaStateFactory.newLuaState();
                    luaState2 = this.f8876;
                    this.f8872 = true;
                } else {
                    this.f8875 = LuaStateFactory.newLuaState();
                    luaState2 = this.f8875;
                    this.f8873 = true;
                }
                String str = oc.f3248 ? String.valueOf("/AI/") + "USER_AI/" : "/AI/";
                String str2 = nuVar == nu.HOM ? String.valueOf(oc.f3240) + str + "AI.lua" : String.valueOf(oc.f3240) + str + "AI_M.lua";
                luaState2.openLibs();
                luaState2.LdoFile(str2);
                if (luaState2.toString(-1) != null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(C0358.f6674);
                    builder.setTitle("AI.lua error!").setMessage(luaState2.toString(-1)).setCancelable(false).setNegativeButton("OK", new DialogInterfaceOnClickListenerC0531(this));
                    builder.create().show();
                }
            }
            if (nuVar == nu.HOM) {
                this.f8872 = false;
                luaState = this.f8876;
            } else if (nuVar == nu.MER) {
                this.f8873 = false;
                luaState = this.f8875;
            }
            LuaState luaState3 = luaState;
            C1148 c1148 = new C1148(this, luaState3);
            C1093 c1093 = new C1093(this, luaState3);
            C0467 c0467 = new C0467(this, luaState3);
            C0940 c0940 = new C0940(this, luaState3);
            C0602 c0602 = new C0602(this, luaState3);
            C1065 c1065 = new C1065(this, luaState3);
            C0770 c0770 = new C0770(this, luaState3);
            C0955 c0955 = new C0955(this, luaState3);
            C0866 c0866 = new C0866(this, luaState3);
            C0735 c0735 = new C0735(this, luaState3);
            C0830 c0830 = new C0830(this, luaState3);
            C1086 c1086 = new C1086(this, luaState3);
            try {
                c1148.register("GetMsg");
                c1093.register("GetResMsg");
                c0467.register("TraceAI");
                c0940.register("GetV");
                c0602.register("GetActors");
                c1065.register("IsMonster");
                c0830.register("SkillGround");
                c0735.register("SkillObject");
                c1086.register("GetTick");
                c0866.register("Attack");
                c0955.register("Move");
                c0770.register("MoveToOwner");
            } catch (LuaException e) {
                throw new nv(e);
            }
        }
        C1035.Cif cif2 = cif;
        LuaState luaState4 = luaState;
        if (cif2 == null || luaState4 == null || cif2.f8661.f8693 <= 0) {
            return;
        }
        luaState4.pushInteger(cif2.f8665);
        luaState4.setGlobal("MyEnemy");
        luaState4.setTop(0);
        luaState4.getGlobal("AI");
        luaState4.pushInteger(cif2.f8661.f8689);
        if (luaState4.pcall(1, 0, 0) != 0) {
            nz.m907("LUA runtime error " + (luaState4.isString(-1) ? luaState4.toString(-1) : ""));
            ny.m905(luaState4);
            luaState4.setTop(0);
        } else {
            luaState4.getGlobal("MyEnemy");
            if (!luaState4.isNumber(-1)) {
                throw new nv();
            }
            cif2.f8665 = luaState4.toInteger(-1);
            luaState4.pop(1);
        }
        luaState4.setTop(0);
    }
}
