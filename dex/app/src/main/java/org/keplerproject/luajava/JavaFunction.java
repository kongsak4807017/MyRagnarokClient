package org.keplerproject.luajava;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class JavaFunction {
    protected LuaState L;

    public abstract int execute();

    public JavaFunction(LuaState luaState) {
        this.L = luaState;
    }

    public LuaObject getParam(int i) {
        return this.L.getLuaObject(i);
    }

    public void register(String str) {
        synchronized (this.L) {
            this.L.pushJavaFunction(this);
            this.L.setGlobal(str);
        }
    }
}
