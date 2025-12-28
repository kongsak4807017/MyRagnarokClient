package o;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ul {
    ul() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static void m1128(Object obj, ByteBuffer byteBuffer) throws IllegalAccessException, IllegalArgumentException {
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == byte[].class || cls == Byte[].class) {
            byteBuffer.put((byte[]) obj);
            return;
        }
        if (cls.isArray()) {
            for (int i = 0; i < Array.getLength(obj); i++) {
                m1128(Array.get(obj, i), byteBuffer);
            }
            return;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            byteBuffer.put(((Byte) obj).byteValue());
            return;
        }
        if (cls == Short.TYPE || cls == Short.class) {
            byteBuffer.putShort(((Short) obj).shortValue());
            return;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            byteBuffer.putInt(((Integer) obj).intValue());
            return;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            byteBuffer.putLong(((Long) obj).longValue());
            return;
        }
        if (cls == Character.TYPE || cls == Character.class) {
            byteBuffer.putChar(((Character) obj).charValue());
            return;
        }
        if (cls.isEnum()) {
            byteBuffer.putInt(((Enum) obj).ordinal());
            return;
        }
        if (cls.isPrimitive()) {
            throw new RuntimeException("Unsupported primitive type.");
        }
        ArrayList arrayList = new ArrayList();
        Class<?> superclass = obj.getClass();
        do {
            arrayList.add(0, superclass);
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                break;
            }
        } while (superclass != Object.class);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field[] declaredFields = ((Class) it.next()).getDeclaredFields();
            for (int i2 = 0; i2 < declaredFields.length; i2++) {
                if (!(declaredFields[i2].getAnnotation(vm.class) != null)) {
                    declaredFields[i2] = null;
                }
            }
            Arrays.sort(declaredFields, vn.f5405);
            for (Field field : declaredFields) {
                if (field != null) {
                    field.setAccessible(true);
                    try {
                        Object obj2 = field.get(obj);
                        if (field.getType().isEnum() && obj2 == null) {
                            m1128(0, byteBuffer);
                        } else {
                            m1128(obj2, byteBuffer);
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static final void m1130(ByteBuffer byteBuffer, Object obj, Field field, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException, InvocationTargetException {
        Constructor<?> declaredConstructor;
        Object objNewInstance;
        Object objNewInstance2;
        field.setAccessible(true);
        try {
            Class<?> type = field.getType();
            Class<?> componentType = type.getComponentType();
            Object obj2 = field.get(obj);
            if (type.isArray()) {
                if (i >= 0) {
                    field.set(obj, Array.newInstance(componentType, i));
                    obj2 = field.get(obj);
                }
                int length = Array.getLength(obj2);
                if (type == byte[].class || type == Byte[].class) {
                    byte[] bArr = new byte[length];
                    byteBuffer.get(bArr);
                    field.set(obj, bArr);
                    return;
                }
                if (type == short[].class || type == Short[].class) {
                    short[] sArr = new short[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        sArr[i2] = byteBuffer.getShort();
                    }
                    field.set(obj, sArr);
                    return;
                }
                if (type == int[].class || type == Integer[].class) {
                    int[] iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = byteBuffer.getInt();
                    }
                    field.set(obj, iArr);
                    return;
                }
                if (type == long[].class || type == Long[].class) {
                    long[] jArr = new long[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        jArr[i4] = byteBuffer.getLong();
                    }
                    field.set(obj, jArr);
                    return;
                }
                if (type == char[].class || type == Character[].class) {
                    char[] cArr = new char[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        cArr[i5] = byteBuffer.getChar();
                    }
                    field.set(obj, cArr);
                    return;
                }
                if (type.isEnum()) {
                    for (int i6 = 0; i6 < length; i6++) {
                        Array.set(obj2, i6, type.getEnumConstants()[byteBuffer.getInt()]);
                    }
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                declaredConstructor = componentType.getDeclaredConstructor(componentType.getDeclaringClass());
                            } catch (IllegalArgumentException e) {
                                throw new RuntimeException(e);
                            } catch (InvocationTargetException e2) {
                                throw new RuntimeException(e2);
                            }
                        } catch (InstantiationException e3) {
                            throw new RuntimeException(e3);
                        }
                    } catch (NoSuchMethodException e4) {
                        throw new RuntimeException(e4);
                    }
                } catch (NoSuchMethodException unused) {
                    declaredConstructor = componentType.getDeclaredConstructor(null);
                }
                declaredConstructor.setAccessible(true);
                Class<?> declaringClass = declaredConstructor.getDeclaringClass();
                Class<?> enclosingClass = declaringClass.getEnclosingClass();
                new StringBuilder().append(declaringClass).append(" enclosed by ").append(declaringClass.getEnclosingClass());
                pc.m995();
                if (declaringClass == obj.getClass()) {
                    objNewInstance = obj;
                } else if (enclosingClass != null && declaringClass != enclosingClass) {
                    objNewInstance = enclosingClass.newInstance();
                } else {
                    objNewInstance = null;
                }
                for (int i7 = 0; i7 < Array.getLength(obj2); i7++) {
                    if (objNewInstance != null) {
                        objNewInstance2 = declaredConstructor.newInstance(objNewInstance);
                    } else {
                        objNewInstance2 = declaredConstructor.newInstance(new Object[0]);
                    }
                    m1129(byteBuffer, objNewInstance2, -1);
                    Array.set(obj2, i7, objNewInstance2);
                }
                return;
            }
            if (i >= 0) {
                throw new UnsupportedOperationException("Trying to override array length of non-array field");
            }
            if (type == Byte.TYPE || type == Byte.class) {
                field.set(obj, Byte.valueOf(byteBuffer.get()));
                return;
            }
            if (type == Short.TYPE || type == Short.class) {
                field.set(obj, Short.valueOf(byteBuffer.getShort()));
                return;
            }
            if (type == Integer.TYPE || type == Integer.class) {
                field.set(obj, Integer.valueOf(byteBuffer.getInt()));
                return;
            }
            if (type == Long.TYPE || type == Long.class) {
                field.set(obj, Long.valueOf(byteBuffer.getLong()));
                return;
            }
            if (type == Character.TYPE || type == Character.class) {
                field.set(obj, Character.valueOf(byteBuffer.getChar()));
            } else if (type.isEnum()) {
                field.set(obj, type.getEnumConstants()[byteBuffer.getInt()]);
            } else {
                m1129(byteBuffer, obj2, -1);
            }
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static final void m1129(ByteBuffer byteBuffer, Object obj, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, ArrayIndexOutOfBoundsException, NegativeArraySizeException, InvocationTargetException {
        try {
            ArrayList arrayList = new ArrayList();
            Class<?> superclass = obj.getClass();
            do {
                arrayList.add(0, superclass);
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    break;
                }
            } while (superclass != Object.class);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field[] declaredFields = ((Class) it.next()).getDeclaredFields();
                for (int i2 = 0; i2 < declaredFields.length; i2++) {
                    if (!(declaredFields[i2].getAnnotation(vm.class) != null)) {
                        declaredFields[i2] = null;
                    }
                }
                Arrays.sort(declaredFields, vn.f5405);
                for (Field field : declaredFields) {
                    if (field != null) {
                        arrayList2.add(field);
                    }
                }
            }
            Field field2 = null;
            if (arrayList2.size() > 0) {
                field2 = (Field) arrayList2.get(arrayList2.size() - 1);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Field field3 = (Field) it2.next();
                m1130(byteBuffer, obj, field3, field3 == field2 ? i : -1);
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}
