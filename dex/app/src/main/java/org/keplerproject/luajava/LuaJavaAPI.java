package org.keplerproject.luajava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class LuaJavaAPI {
    private LuaJavaAPI() {
    }

    public static int objectIndex(int i, Object obj, String str) {
        Class<?> cls;
        Object objInvoke;
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            int top = existingState.getTop();
            Object[] objArr = new Object[top - 1];
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            Method[] methods = cls.getMethods();
            Method method = null;
            int i2 = 0;
            while (true) {
                if (i2 >= methods.length) {
                    break;
                }
                if (methods[i2].getName().equals(str)) {
                    Class<?>[] parameterTypes = methods[i2].getParameterTypes();
                    if (parameterTypes.length == top - 1) {
                        boolean z = true;
                        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                            try {
                                objArr[i3] = compareTypes(existingState, parameterTypes[i3], i3 + 2);
                            } catch (Exception unused) {
                                z = false;
                            }
                        }
                        if (z) {
                            method = methods[i2];
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            }
            if (method == null) {
                throw new LuaException("Invalid method call. No such method.");
            }
            try {
                if (Modifier.isPublic(method.getModifiers())) {
                    method.setAccessible(true);
                }
                if (obj instanceof Class) {
                    objInvoke = method.invoke(null, objArr);
                } else {
                    objInvoke = method.invoke(obj, objArr);
                }
                if (objInvoke == null) {
                    return 0;
                }
                existingState.pushObjectValue(objInvoke);
                return 1;
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
    }

    public static int classIndex(int i, Class cls, String str) {
        synchronized (LuaStateFactory.getExistingState(i)) {
            if (checkField(i, cls, str) != 0) {
                return 1;
            }
            return checkMethod(i, cls, str) != 0 ? 2 : 0;
        }
    }

    public static int javaNewInstance(int i, String str) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            try {
                existingState.pushJavaObject(getObjInstance(existingState, Class.forName(str)));
            } catch (ClassNotFoundException e) {
                throw new LuaException(e);
            }
        }
        return 1;
    }

    public static int javaNew(int i, Class cls) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            existingState.pushJavaObject(getObjInstance(existingState, cls));
        }
        return 1;
    }

    public static int javaLoadLib(int i, String str, String str2) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            try {
                try {
                    Object objInvoke = Class.forName(str).getMethod(str2, LuaState.class).invoke(null, existingState);
                    if (objInvoke == null || !(objInvoke instanceof Integer)) {
                        return 0;
                    }
                    return ((Integer) objInvoke).intValue();
                } catch (Exception e) {
                    throw new LuaException("Error on calling method. Library could not be loaded. " + e.getMessage());
                }
            } catch (ClassNotFoundException e2) {
                throw new LuaException(e2);
            }
        }
    }

    private static Object getObjInstance(LuaState luaState, Class cls) {
        Object objNewInstance;
        synchronized (luaState) {
            int top = luaState.getTop();
            Object[] objArr = new Object[top - 1];
            Constructor<?>[] constructors = cls.getConstructors();
            Constructor<?> constructor = null;
            int i = 0;
            while (true) {
                if (i >= constructors.length) {
                    break;
                }
                Class<?>[] parameterTypes = constructors[i].getParameterTypes();
                if (parameterTypes.length == top - 1) {
                    boolean z = true;
                    for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                        try {
                            objArr[i2] = compareTypes(luaState, parameterTypes[i2], i2 + 2);
                        } catch (Exception unused) {
                            z = false;
                        }
                    }
                    if (z) {
                        constructor = constructors[i];
                        break;
                    }
                }
                i++;
            }
            if (constructor == null) {
                throw new LuaException("Invalid method call. No such method.");
            }
            try {
                objNewInstance = constructor.newInstance(objArr);
                if (objNewInstance == null) {
                    throw new LuaException("Couldn't instantiate java Object");
                }
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return objNewInstance;
    }

    public static int checkField(int i, Object obj, String str) {
        Class<?> cls;
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            try {
                Field field = cls.getField(str);
                if (field == null) {
                    return 0;
                }
                try {
                    Object obj2 = field.get(obj);
                    if (obj == null) {
                        return 0;
                    }
                    existingState.pushObjectValue(obj2);
                    return 1;
                } catch (Exception unused) {
                    return 0;
                }
            } catch (Exception unused2) {
                return 0;
            }
        }
    }

    public static int checkMethod(int i, Object obj, String str) {
        Class<?> cls;
        synchronized (LuaStateFactory.getExistingState(i)) {
            if (obj instanceof Class) {
                cls = (Class) obj;
            } else {
                cls = obj.getClass();
            }
            for (Method method : cls.getMethods()) {
                if (method.getName().equals(str)) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public static int createProxyObject(int i, String str) {
        LuaState existingState = LuaStateFactory.getExistingState(i);
        synchronized (existingState) {
            try {
                if (!existingState.isTable(2)) {
                    throw new LuaException("Parameter is not a table. Can't create proxy.");
                }
                existingState.pushJavaObject(existingState.getLuaObject(2).createProxy(str));
            } catch (Exception e) {
                throw new LuaException(e);
            }
        }
        return 1;
    }

    private static Object compareTypes(LuaState luaState, Class cls, int i) throws LuaException {
        boolean z = true;
        Object luaObject = null;
        if (luaState.isBoolean(i)) {
            if (cls.isPrimitive()) {
                if (cls != Boolean.TYPE) {
                    z = false;
                }
            } else if (!cls.isAssignableFrom(Boolean.class)) {
                z = false;
            }
            luaObject = new Boolean(luaState.toBoolean(i));
        } else if (luaState.type(i) == LuaState.LUA_TSTRING.intValue()) {
            if (!cls.isAssignableFrom(String.class)) {
                z = false;
            } else {
                luaObject = luaState.toString(i);
            }
        } else if (luaState.isFunction(i)) {
            if (!cls.isAssignableFrom(LuaObject.class)) {
                z = false;
            } else {
                luaObject = luaState.getLuaObject(i);
            }
        } else if (luaState.isTable(i)) {
            if (!cls.isAssignableFrom(LuaObject.class)) {
                z = false;
            } else {
                luaObject = luaState.getLuaObject(i);
            }
        } else if (luaState.type(i) == LuaState.LUA_TNUMBER.intValue()) {
            luaObject = LuaState.convertLuaNumber(new Double(luaState.toNumber(i)), cls);
            if (luaObject == null) {
                z = false;
            }
        } else if (luaState.isUserdata(i)) {
            if (luaState.isObject(i)) {
                Object objectFromUserdata = luaState.getObjectFromUserdata(i);
                if (!cls.isAssignableFrom(objectFromUserdata.getClass())) {
                    z = false;
                } else {
                    luaObject = objectFromUserdata;
                }
            } else if (!cls.isAssignableFrom(LuaObject.class)) {
                z = false;
            } else {
                luaObject = luaState.getLuaObject(i);
            }
        } else if (luaState.isNil(i)) {
            luaObject = null;
        } else {
            throw new LuaException("Invalid Parameters.");
        }
        if (!z) {
            throw new LuaException("Invalid Parameter.");
        }
        return luaObject;
    }
}
