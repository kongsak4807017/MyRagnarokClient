package o;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import o.pf.Cif;
import org.keplerproject.luajava.LuaState;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class ny {
    ny() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final void m905(LuaState luaState) {
        int top = luaState.getTop();
        for (int i = -1; i > (-top) - 1; i--) {
            luaState.typeName(luaState.type(i));
            int i2 = i;
            int iType = luaState.type(i2);
            if (iType == LuaState.LUA_TNUMBER.intValue()) {
                luaState.toInteger(i2);
            } else if (iType == LuaState.LUA_TBOOLEAN.intValue()) {
                luaState.toBoolean(i2);
            } else if (iType == LuaState.LUA_TSTRING.intValue()) {
                pa.m978(luaState.toStringByteArray(i2), ow.LATIN);
            } else {
                luaState.typeName(iType);
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final synchronized String m904(LuaState luaState, ow owVar) {
        String strM978;
        strM978 = null;
        if (luaState.isString(-1)) {
            strM978 = pa.m978(luaState.toStringByteArray(-1), owVar);
        } else if (luaState.isTable(-1)) {
            luaState.pushNil();
            while (luaState.next(-2) != 0) {
                luaState.toInteger(-2);
                if (!luaState.isString(-1)) {
                    throw new nv(String.valueOf(luaState.typeName(luaState.type(-1))) + " " + luaState.toString(-1) + " is not string");
                }
                byte[] stringByteArray = luaState.toStringByteArray(-1);
                if (strM978 == null) {
                    strM978 = pa.m978(stringByteArray, owVar);
                } else {
                    strM978 = String.valueOf(strM978) + "\n" + pa.m978(stringByteArray, owVar);
                }
                luaState.pop(1);
            }
        } else {
            strM978 = null;
        }
        return strM978;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final synchronized String m903(LuaState luaState, String str, ow owVar) {
        String strM904;
        luaState.pushString(str);
        luaState.getTable(-2);
        strM904 = m904(luaState, owVar);
        luaState.pop(1);
        return strM904;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final synchronized int m902(LuaState luaState, String str) {
        int integer;
        luaState.pushString(str);
        luaState.getTable(-2);
        if (luaState.isNumber(-1)) {
            integer = luaState.toInteger(-1);
        } else {
            integer = 0;
        }
        luaState.pop(1);
        return integer;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private static final synchronized void m900(LuaState luaState, byte[] bArr) {
        if (luaState.LdoByteArray(C0358.f6674.getFilesDir() + "/tmp.lub", bArr) != 0) {
            throw new nw(luaState);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static final synchronized void m906(LuaState luaState, byte[] bArr) {
        if (!C0358.f6667.f4829 && pf.m1004(Arrays.copyOf(bArr, 4))) {
            try {
                pf pfVar = new pf();
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byte[] bArr2 = new byte[4];
                byteBufferWrap.get(bArr2);
                if (pf.m1004(bArr2)) {
                    byte b = byteBufferWrap.get();
                    if (byteBufferWrap.get() == 1) {
                        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    } else {
                        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                    }
                    byteBufferWrap.get();
                    byteBufferWrap.get();
                    byteBufferWrap.get();
                    byte b2 = byteBufferWrap.get();
                    byte b3 = byteBufferWrap.get();
                    byte b4 = byteBufferWrap.get();
                    byte b5 = byteBufferWrap.get();
                    byteBufferWrap.get();
                    ow owVar = ow.LATIN;
                    byte[] bArr3 = new byte[8];
                    byteBufferWrap.get(bArr3);
                    pa.m978(bArr3, owVar);
                    pfVar.f4417 = b5 & 255;
                    pfVar.f4416 = b4 & 255;
                    pfVar.f4413 = pfVar.f4417 + pfVar.f4416;
                    pfVar.f4411 = b3 & 255;
                    pfVar.f4407 = b2 & 255;
                    pfVar.f4408 = pfVar.f4407;
                    pfVar.f4409 = pfVar.f4408 + pfVar.f4417;
                    pfVar.f4410 = pfVar.f4408;
                    pfVar.f4414 = pfVar.f4409 + pfVar.f4416;
                    pfVar.f4415 = (1 << pfVar.f4413) - 1;
                    pfVar.f4412 = pfVar.f4415 >> 1;
                    if (b != 80) {
                        throw new RuntimeException("Only supporting v5.0, sorry :(");
                    }
                    bArr = pfVar.new Cif(byteBufferWrap, null).m1011();
                } else {
                    new StringBuilder("Invalid Signature=").append(bArr2);
                    bArr = null;
                }
            } catch (RuntimeException e) {
                throw new ut("Failed to parse LUA file: " + e.getMessage());
            }
        }
        m900(luaState, bArr);
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static int[] m901(LuaState luaState) {
        if (!luaState.isTable(-1)) {
            Log.e("AndRO", "read_integer_array: incorrect variable in stack, should be array\n");
            throw new nv("read_integer_array: incorrect variable in stack, should be array\n");
        }
        int iLgetN = luaState.LgetN(-1);
        int[] iArr = new int[iLgetN];
        for (int i = 0; i < iLgetN; i++) {
            luaState.pushInteger(i + 1);
            luaState.getTable(-2);
            iArr[i] = luaState.toInteger(-1);
            luaState.pop(1);
        }
        return iArr;
    }
}
