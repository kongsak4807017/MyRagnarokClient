package org.keplerproject.luajava;

import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class LuaStateFactory {
    private static final List states = new ArrayList();

    public static native void chdir(String str);

    private LuaStateFactory() {
    }

    public static synchronized LuaState newLuaState() {
        LuaState luaState;
        int nextStateIndex = getNextStateIndex();
        luaState = new LuaState(nextStateIndex);
        states.add(nextStateIndex, luaState);
        return luaState;
    }

    public static synchronized LuaState getExistingState(int i) {
        return (LuaState) states.get(i);
    }

    public static synchronized int insertLuaState(LuaState luaState) {
        for (int i = 0; i < states.size(); i++) {
            LuaState luaState2 = (LuaState) states.get(i);
            if (luaState2 != null && luaState2.getCPtrPeer() == luaState.getCPtrPeer()) {
                return i;
            }
        }
        int nextStateIndex = getNextStateIndex();
        states.set(nextStateIndex, luaState);
        return nextStateIndex;
    }

    public static synchronized void removeLuaState(int i) {
        states.add(i, null);
    }

    private static synchronized int getNextStateIndex() {
        int i;
        i = 0;
        while (i < states.size() && states.get(i) != null) {
            i++;
        }
        return i;
    }
}
