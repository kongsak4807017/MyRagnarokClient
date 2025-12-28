package o;

import org.keplerproject.luajava.LuaState;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class nw extends Exception {
    nw(LuaState luaState) {
        super("Failed to parse LUA file: " + luaState.toString(-1));
        ny.m905(luaState);
    }
}
