package org.keplerproject.luajava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class LuaInvocationHandler implements InvocationHandler {
    private LuaObject obj;

    public LuaInvocationHandler(LuaObject luaObject) {
        this.obj = luaObject;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object objConvertLuaNumber;
        synchronized (this.obj.L) {
            LuaObject field = this.obj.getField(method.getName());
            if (field.isNil()) {
                return null;
            }
            Class<?> returnType = method.getReturnType();
            if (returnType.equals(Void.class) || returnType.equals(Void.TYPE)) {
                field.call(objArr, 0);
                objConvertLuaNumber = null;
            } else {
                objConvertLuaNumber = field.call(objArr, 1)[0];
                if (objConvertLuaNumber != null && (objConvertLuaNumber instanceof Double)) {
                    objConvertLuaNumber = LuaState.convertLuaNumber((Double) objConvertLuaNumber, returnType);
                }
            }
            return objConvertLuaNumber;
        }
    }
}
