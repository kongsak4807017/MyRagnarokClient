package org.keplerproject.luajava;

import java.lang.reflect.Proxy;
import java.util.StringTokenizer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class LuaObject {
    protected LuaState L;
    protected Integer ref;

    protected LuaObject(LuaState luaState, String str) {
        synchronized (luaState) {
            this.L = luaState;
            luaState.getGlobal(str);
            registerValue(-1);
            luaState.pop(1);
        }
    }

    protected LuaObject(LuaObject luaObject, String str) {
        synchronized (luaObject.getLuaState()) {
            this.L = luaObject.getLuaState();
            if (!luaObject.isTable() && !luaObject.isUserdata()) {
                throw new LuaException("Object parent should be a table or userdata .");
            }
            luaObject.push();
            this.L.pushString(str);
            this.L.getTable(-2);
            this.L.remove(-2);
            registerValue(-1);
            this.L.pop(1);
        }
    }

    protected LuaObject(LuaObject luaObject, Number number) {
        synchronized (luaObject.getLuaState()) {
            this.L = luaObject.getLuaState();
            if (!luaObject.isTable() && !luaObject.isUserdata()) {
                throw new LuaException("Object parent should be a table or userdata .");
            }
            luaObject.push();
            this.L.pushNumber(number.doubleValue());
            this.L.getTable(-2);
            this.L.remove(-2);
            registerValue(-1);
            this.L.pop(1);
        }
    }

    protected LuaObject(LuaObject luaObject, LuaObject luaObject2) throws LuaException {
        if (luaObject.getLuaState() != luaObject2.getLuaState()) {
            throw new LuaException("LuaStates must be the same!");
        }
        synchronized (luaObject.getLuaState()) {
            if (!luaObject.isTable() && !luaObject.isUserdata()) {
                throw new LuaException("Object parent should be a table or userdata .");
            }
            this.L = luaObject.getLuaState();
            luaObject.push();
            luaObject2.push();
            this.L.getTable(-2);
            this.L.remove(-2);
            registerValue(-1);
            this.L.pop(1);
        }
    }

    protected LuaObject(LuaState luaState, int i) {
        synchronized (luaState) {
            this.L = luaState;
            registerValue(i);
        }
    }

    public LuaState getLuaState() {
        return this.L;
    }

    private void registerValue(int i) {
        synchronized (this.L) {
            this.L.pushValue(i);
            this.ref = new Integer(this.L.Lref(LuaState.LUA_REGISTRYINDEX.intValue()));
        }
    }

    protected void finalize() {
        try {
            synchronized (this.L) {
                if (this.L.getCPtrPeer() != 0) {
                    this.L.LunRef(LuaState.LUA_REGISTRYINDEX.intValue(), this.ref.intValue());
                }
            }
        } catch (Exception unused) {
            new StringBuilder("Unable to release object ").append(this.ref);
        }
    }

    public void push() {
        this.L.rawGetI(LuaState.LUA_REGISTRYINDEX.intValue(), this.ref.intValue());
    }

    public boolean isNil() {
        boolean zIsNil;
        synchronized (this.L) {
            push();
            zIsNil = this.L.isNil(-1);
            this.L.pop(1);
        }
        return zIsNil;
    }

    public boolean isBoolean() {
        boolean zIsBoolean;
        synchronized (this.L) {
            push();
            zIsBoolean = this.L.isBoolean(-1);
            this.L.pop(1);
        }
        return zIsBoolean;
    }

    public boolean isNumber() {
        boolean zIsNumber;
        synchronized (this.L) {
            push();
            zIsNumber = this.L.isNumber(-1);
            this.L.pop(1);
        }
        return zIsNumber;
    }

    public boolean isString() {
        boolean zIsString;
        synchronized (this.L) {
            push();
            zIsString = this.L.isString(-1);
            this.L.pop(1);
        }
        return zIsString;
    }

    public boolean isFunction() {
        boolean zIsFunction;
        synchronized (this.L) {
            push();
            zIsFunction = this.L.isFunction(-1);
            this.L.pop(1);
        }
        return zIsFunction;
    }

    public boolean isJavaObject() {
        boolean zIsObject;
        synchronized (this.L) {
            push();
            zIsObject = this.L.isObject(-1);
            this.L.pop(1);
        }
        return zIsObject;
    }

    public boolean isJavaFunction() {
        boolean zIsJavaFunction;
        synchronized (this.L) {
            push();
            zIsJavaFunction = this.L.isJavaFunction(-1);
            this.L.pop(1);
        }
        return zIsJavaFunction;
    }

    public boolean isTable() {
        boolean zIsTable;
        synchronized (this.L) {
            push();
            zIsTable = this.L.isTable(-1);
            this.L.pop(1);
        }
        return zIsTable;
    }

    public boolean isUserdata() {
        boolean zIsUserdata;
        synchronized (this.L) {
            push();
            zIsUserdata = this.L.isUserdata(-1);
            this.L.pop(1);
        }
        return zIsUserdata;
    }

    public int type() {
        int iType;
        synchronized (this.L) {
            push();
            iType = this.L.type(-1);
            this.L.pop(1);
        }
        return iType;
    }

    public boolean getBoolean() {
        boolean z;
        synchronized (this.L) {
            push();
            z = this.L.toBoolean(-1);
            this.L.pop(1);
        }
        return z;
    }

    public double getNumber() {
        double number;
        synchronized (this.L) {
            push();
            number = this.L.toNumber(-1);
            this.L.pop(1);
        }
        return number;
    }

    public String getString() {
        String string;
        synchronized (this.L) {
            push();
            string = this.L.toString(-1);
            this.L.pop(1);
        }
        return string;
    }

    public Object getObject() {
        Object objectFromUserdata;
        synchronized (this.L) {
            push();
            objectFromUserdata = this.L.getObjectFromUserdata(-1);
            this.L.pop(1);
        }
        return objectFromUserdata;
    }

    public LuaObject getField(String str) {
        return this.L.getLuaObject(this, str);
    }

    public Object[] call(Object[] objArr, int i) {
        int i2;
        Object[] objArr2;
        String string;
        String str;
        synchronized (this.L) {
            if (!isFunction() && !isTable() && !isUserdata()) {
                throw new LuaException("Invalid object. Not a function, table or userdata .");
            }
            int top = this.L.getTop();
            push();
            if (objArr != null) {
                for (Object obj : objArr) {
                    this.L.pushObjectValue(obj);
                }
            } else {
                i2 = 0;
            }
            int iPcall = this.L.pcall(i2, i, 0);
            if (iPcall != 0) {
                if (this.L.isString(-1)) {
                    string = this.L.toString(-1);
                    this.L.pop(1);
                } else {
                    string = "";
                }
                if (iPcall == LuaState.LUA_ERRRUN.intValue()) {
                    str = "Runtime error. " + string;
                } else if (iPcall == LuaState.LUA_ERRMEM.intValue()) {
                    str = "Memory allocation error. " + string;
                } else if (iPcall == LuaState.LUA_ERRERR.intValue()) {
                    str = "Error while running the error handler function. " + string;
                } else {
                    str = "Lua Error code " + iPcall + ". " + string;
                }
                throw new LuaException(str);
            }
            if (i == LuaState.LUA_MULTRET.intValue()) {
                i = this.L.getTop() - top;
            }
            if (this.L.getTop() - top < i) {
                throw new LuaException("Invalid Number of Results .");
            }
            objArr2 = new Object[i];
            for (int i3 = i; i3 > 0; i3--) {
                objArr2[i3 - 1] = this.L.toJavaObject(-1);
                this.L.pop(1);
            }
        }
        return objArr2;
    }

    public Object call(Object[] objArr) {
        return call(objArr, 1)[0];
    }

    public String toString() {
        synchronized (this.L) {
            try {
                if (isNil()) {
                    return "nil";
                }
                if (isBoolean()) {
                    return String.valueOf(getBoolean());
                }
                if (isNumber()) {
                    return String.valueOf(getNumber());
                }
                if (isString()) {
                    return getString();
                }
                if (isFunction()) {
                    return "Lua Function";
                }
                if (isJavaObject()) {
                    return getObject().toString();
                }
                if (isUserdata()) {
                    return "Userdata";
                }
                if (isTable()) {
                    return "Lua Table";
                }
                if (isJavaFunction()) {
                    return "Java Function";
                }
                return null;
            } catch (LuaException unused) {
                return null;
            }
        }
    }

    public Object createProxy(String str) {
        Object objNewProxyInstance;
        synchronized (this.L) {
            if (!isTable()) {
                throw new LuaException("Invalid Object. Must be Table.");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            Class[] clsArr = new Class[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                clsArr[i] = Class.forName(stringTokenizer.nextToken());
                i++;
            }
            objNewProxyInstance = Proxy.newProxyInstance(getClass().getClassLoader(), clsArr, new LuaInvocationHandler(this));
        }
        return objNewProxyInstance;
    }
}
