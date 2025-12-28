package o;

import java.util.ArrayList;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class gs {

    /* renamed from: 櫯, reason: contains not printable characters */
    private static /* synthetic */ int[] f1379;

    /* renamed from: 鷭, reason: contains not printable characters */
    ArrayList<Cif> f1380 = new ArrayList<>();

    /* renamed from: o.gs$櫯, reason: contains not printable characters */
    enum EnumC0043 {
        NONE,
        BMP,
        SPRITE,
        SIGNBOARD;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0043[] valuesCustom() {
            EnumC0043[] enumC0043ArrValuesCustom = values();
            int length = enumC0043ArrValuesCustom.length;
            EnumC0043[] enumC0043Arr = new EnumC0043[length];
            System.arraycopy(enumC0043ArrValuesCustom, 0, enumC0043Arr, 0, length);
            return enumC0043Arr;
        }
    }

    /* renamed from: o.gs$鷭, reason: contains not printable characters */
    enum EnumC0044 {
        MAPNAME,
        CELLX,
        CELLY,
        HEIGHT,
        ICONID,
        FILEPATH,
        CONTENTS,
        CHARCOLOR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static EnumC0044[] valuesCustom() {
            EnumC0044[] enumC0044ArrValuesCustom = values();
            int length = enumC0044ArrValuesCustom.length;
            EnumC0044[] enumC0044Arr = new EnumC0044[length];
            System.arraycopy(enumC0044ArrValuesCustom, 0, enumC0044Arr, 0, length);
            return enumC0044Arr;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static /* synthetic */ int[] m607() {
        int[] iArr = f1379;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[EnumC0044.valuesCustom().length];
        try {
            iArr2[EnumC0044.CELLX.ordinal()] = 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr2[EnumC0044.CELLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[EnumC0044.CHARCOLOR.ordinal()] = 8;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC0044.CONTENTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC0044.FILEPATH.ordinal()] = 6;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC0044.HEIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC0044.ICONID.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EnumC0044.MAPNAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        f1379 = iArr2;
        return iArr2;
    }

    /* renamed from: o.gs$if, reason: invalid class name */
    class Cif {

        /* renamed from: Ą, reason: contains not printable characters */
        EnumC0043 f1381;

        /* renamed from: ą, reason: contains not printable characters */
        String f1382;

        /* renamed from: Ć, reason: contains not printable characters */
        String f1383;

        /* renamed from: ć, reason: contains not printable characters */
        int f1384;

        /* renamed from: ȃ, reason: contains not printable characters */
        int f1385;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        int f1386;

        /* renamed from: 櫯, reason: contains not printable characters */
        int f1388;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f1389;

        Cif() {
        }
    }

    gs() {
    }

    gs(byte[] bArr) {
        if (bArr.length <= 0) {
            return;
        }
        LuaState luaStateNewLuaState = LuaStateFactory.newLuaState();
        try {
            ny.m906(luaStateNewLuaState, bArr);
            luaStateNewLuaState.getGlobal("SignBoardList");
            if (!luaStateNewLuaState.isTable(-1)) {
                throw new IllegalArgumentException("SignBoardList is not a table");
            }
            luaStateNewLuaState.pushNil();
            while (luaStateNewLuaState.next(-2) != 0) {
                Cif cif = new Cif();
                if (!luaStateNewLuaState.isTable(-1)) {
                    throw new IllegalArgumentException("SignBoardList entry is not a table");
                }
                luaStateNewLuaState.pushNil();
                int i = 0;
                while (luaStateNewLuaState.next(-2) != 0) {
                    if (i >= EnumC0044.valuesCustom().length) {
                        throw new IllegalArgumentException("SignBoardList entry contains unexpected fields count: >= " + EnumC0044.valuesCustom().length);
                    }
                    int i2 = i;
                    i++;
                    switch (m607()[EnumC0044.valuesCustom()[i2].ordinal()]) {
                        case 1:
                            cif.f1389 = ny.m904(luaStateNewLuaState, ow.LATIN);
                            break;
                        case 2:
                            cif.f1388 = luaStateNewLuaState.toInteger(-1);
                            break;
                        case 3:
                            cif.f1386 = luaStateNewLuaState.toInteger(-1);
                            break;
                        case 4:
                            cif.f1385 = luaStateNewLuaState.toInteger(-1);
                            break;
                        case 5:
                            int integer = luaStateNewLuaState.toInteger(-1);
                            if (integer >= 0 && integer < EnumC0043.valuesCustom().length) {
                                cif.f1381 = EnumC0043.valuesCustom()[integer];
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            cif.f1382 = ny.m904(luaStateNewLuaState, ow.KOREAN);
                            break;
                        case 7:
                            cif.f1383 = ny.m904(luaStateNewLuaState, ow.LOCAL);
                            break;
                        case 8:
                            String strM904 = ny.m904(luaStateNewLuaState, ow.LATIN);
                            cif.f1384 = (int) Long.parseLong(strM904.startsWith("#0x") ? strM904.substring(3) : strM904, 16);
                            break;
                    }
                    luaStateNewLuaState.pop(1);
                }
                this.f1380.add(cif);
                luaStateNewLuaState.pop(1);
            }
            luaStateNewLuaState.pop(1);
        } catch (nw e) {
            nz.m907("c_signboardlist_db:" + e.toString());
        } catch (IllegalArgumentException e2) {
            nz.m907("c_signboardlist_db:" + e2.toString());
        } finally {
            luaStateNewLuaState.close();
        }
    }
}
