package o;

import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import o.gx;
import o.gx.C0045;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class gu {

    /* renamed from: 櫯, reason: contains not printable characters */
    private gx f1410;

    /* renamed from: 鷭, reason: contains not printable characters */
    HashMap<Integer, gx> f1411;

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m612(LuaState luaState, gx gxVar, EnumC0134 enumC0134) {
        int length;
        int iLgetN = luaState.LgetN(-1);
        if (gxVar.f1425 == null) {
            length = 0;
            gxVar.f1425 = new gx.C0045[iLgetN];
        } else {
            length = gxVar.f1425.length;
            gxVar.f1425 = (gx.C0045[]) Arrays.copyOf(gxVar.f1425, gxVar.f1425.length + iLgetN);
        }
        luaState.pushNil();
        while (luaState.next(-2) != 0) {
            int[] iArrM901 = ny.m901(luaState);
            if (iArrM901.length < 2) {
                iArrM901 = new int[]{1, 1};
            }
            gxVar.f1425[length] = gxVar.new C0045();
            gx.C0045 c0045 = gxVar.f1425[length];
            c0045.f1434 = iArrM901[0];
            if (iArrM901.length > 1) {
                c0045.f1433 = iArrM901[1];
            } else {
                c0045.f1433 = 1;
            }
            c0045.f1432 = enumC0134;
            length++;
            luaState.pop(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v243, types: [java.lang.Object[]] */
    gu(cr crVar) throws nx {
        gw[] gwVarArr;
        EnumC0134 enumC0134ValueOf;
        this.f1411 = new HashMap<>();
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading skill_db..."));
        boolean z = false;
        if (C0358.f6667.f4798) {
            gwVarArr = new gw[]{new gw(this, "jobinheritlist.lub", true), new gw(this, "skillid.lub", true), new gw(this, "data\\skillnametable.txt"), new gw(this, "data\\skilltreeview.txt"), new gw(this, "data\\skilldesctable.txt"), new gw(this, "data\\leveluseskillspamount.txt")};
        } else {
            gwVarArr = new gw[]{new gw(this, "data\\lua files\\skillinfoz\\jobinheritlist.lub"), new gw(this, "data\\lua files\\skillinfoz\\skillid.lub"), new gw(this, "data\\lua files\\skillinfoz\\skillinfolist.lub"), new gw(this, "data\\lua files\\skillinfoz\\skilldescript.lub")};
        }
        for (gw gwVar : gwVarArr) {
            if (gwVar.f1418) {
                gwVar.f1419 = C0358.f6674.m141(gwVar.f1421);
            } else {
                gwVar.f1419 = (byte[]) crVar.m519(gwVar.f1421, false);
            }
            gwVar.f1420 = pa.m975(gwVar.f1419);
            if (!z && C0358.f6687.m652(gwVar.f1421, gwVar.f1419.length, 0, gwVar.f1420) == -1) {
                z = true;
            }
        }
        if (z) {
            LuaState luaStateNewLuaState = LuaStateFactory.newLuaState();
            SparseArray<gx> sparseArray = new SparseArray<>();
            luaStateNewLuaState.openBase();
            gw[] gwVarArr2 = gwVarArr;
            int length = gwVarArr.length;
            for (int i = 0; i < length; i++) {
                gw gwVar2 = gwVarArr2[i];
                if (gwVar2.f1421.toLowerCase().endsWith(".lua") || gwVar2.f1421.toLowerCase().endsWith(".lub")) {
                    try {
                        ny.m906(luaStateNewLuaState, gwVar2.f1419);
                    } catch (nw e) {
                        throw new nx(gwVar2.f1421, e.getMessage());
                    }
                }
            }
            if (C0358.f6667.f4798) {
                HashMap map = new HashMap();
                luaStateNewLuaState.getGlobal("SKID");
                ny.m905(luaStateNewLuaState);
                luaStateNewLuaState.pushNil();
                while (luaStateNewLuaState.next(-2) != 0) {
                    int integer = luaStateNewLuaState.toInteger(-1);
                    String string = luaStateNewLuaState.toString(-2);
                    gx gxVar = new gx();
                    gxVar.f1430 = integer;
                    gxVar.f1429 = string;
                    gxVar.f1422 = new int[50];
                    gxVar.f1425 = new gx.C0045[0];
                    gxVar.f1424 = true;
                    sparseArray.put(integer, gxVar);
                    map.put(string, gxVar);
                    luaStateNewLuaState.pop(1);
                }
                luaStateNewLuaState.pop(1);
                String[] strArrM988 = pa.m988(pa.m978(gwVarArr[2].f1419, ow.LOCAL), true, "#");
                int i2 = 0;
                while (i2 < strArrM988.length - 1) {
                    String strTrim = strArrM988[i2].trim();
                    String strTrim2 = strArrM988[i2 + 1].trim();
                    gx gxVar2 = (gx) map.get(strTrim);
                    if (gxVar2 == null) {
                        i2--;
                    } else {
                        gxVar2.f1427 = strTrim2;
                    }
                    i2 += 2;
                }
                for (gx gxVar3 : map.values()) {
                    if (gxVar3.f1427 == null) {
                        gxVar3.f1427 = gxVar3.f1429.substring(gxVar3.f1429.indexOf("_") + 1);
                    }
                }
                String[] strArrM9882 = pa.m988(pa.m978(gwVarArr[4].f1419, ow.LOCAL), true, "#");
                int i3 = 0;
                while (i3 < strArrM9882.length - 1) {
                    String strTrim3 = strArrM9882[i3].trim();
                    String strTrim4 = strArrM9882[i3 + 1].trim();
                    gx gxVar4 = (gx) map.get(strTrim3);
                    if (gxVar4 == null) {
                        i3--;
                    } else {
                        gxVar4.f1428 = strTrim4;
                    }
                    i3 += 2;
                }
                String[] strArrM9883 = pa.m988(pa.m978(gwVarArr[5].f1419, ow.LOCAL), true, "@");
                for (int i4 = 0; i4 < strArrM9883.length; i4++) {
                    strArrM9883[i4] = strArrM9883[i4].trim();
                    String[] strArrSplit = strArrM9883[i4].split("#");
                    for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                        strArrSplit[i5] = strArrSplit[i5].trim();
                    }
                    String str = strArrSplit[0];
                    gx gxVar5 = (gx) map.get(str);
                    if (gxVar5 != null) {
                        for (int i6 = 1; i6 < strArrSplit.length; i6++) {
                            try {
                                gxVar5.f1422[i6 - 1] = Integer.valueOf(strArrSplit[i6].trim()).intValue();
                            } catch (NumberFormatException unused) {
                                nz.m907("Error in leveluseskillspamount.txt for skill " + str + " lv" + i6);
                            }
                        }
                    }
                }
                String[] strArrM9884 = pa.m988(pa.m978(gwVarArr[3].f1419, ow.LOCAL), true, "\\}");
                for (int i7 = 0; i7 < strArrM9884.length; i7++) {
                    strArrM9884[i7] = strArrM9884[i7].trim();
                    String[] strArrSplit2 = strArrM9884[i7].split("\\{");
                    String strReplace = strArrSplit2[0].trim().replace(" ", "_");
                    try {
                        try {
                            enumC0134ValueOf = EnumC0134.m1250(Integer.parseInt(strReplace));
                        } catch (NumberFormatException unused2) {
                            enumC0134ValueOf = EnumC0134.valueOf(strReplace);
                        }
                        String[] strArrSplit3 = strArrSplit2[1].split("@");
                        HashMap map2 = new HashMap();
                        for (String str2 : strArrSplit3) {
                            gv gvVar = new gv(this, str2);
                            map2.put(Integer.valueOf(gvVar.f1415), gvVar);
                        }
                        for (gv gvVar2 : map2.values()) {
                            gx gxVar6 = (gx) map.get(gvVar2.f1416);
                            if (gxVar6 != null) {
                                gxVar6.f1426 = gvVar2.f1413;
                                Iterator<Integer> it = gvVar2.f1414.iterator();
                                while (it.hasNext()) {
                                    int iIntValue = it.next().intValue();
                                    gv gvVar3 = (gv) map2.get(Integer.valueOf(iIntValue));
                                    if (gvVar3 == null) {
                                        nz.m907("no prerec entry for prerec_pos=" + iIntValue + " for skill " + gvVar2.f1416 + " for job " + enumC0134ValueOf);
                                    } else {
                                        gx gxVar7 = (gx) map.get(gvVar3.f1416);
                                        if (gxVar7 != null) {
                                            gx.C0045 c0045 = gxVar6.new C0045();
                                            c0045.f1432 = enumC0134ValueOf;
                                            c0045.f1434 = gxVar7.f1430;
                                            c0045.f1433 = 1;
                                            int i8 = 0;
                                            while (i8 < gxVar6.f1425.length && (gxVar6.f1425[i8].f1432 != c0045.f1432 || gxVar6.f1425[i8].f1434 != c0045.f1434 || gxVar6.f1425[i8].f1433 != c0045.f1433)) {
                                                i8++;
                                            }
                                            if (i8 >= gxVar6.f1425.length) {
                                                gx.C0045[] c0045Arr = gxVar6.f1425;
                                                c0045Arr = c0045Arr == null ? (Object[]) Array.newInstance(c0045.getClass(), 0) : c0045Arr;
                                                Object[] objArrCopyOf = Arrays.copyOf(c0045Arr, c0045Arr.length + 1);
                                                objArrCopyOf[c0045Arr.length] = c0045;
                                                gxVar6.f1425 = (gx.C0045[]) objArrCopyOf;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IllegalArgumentException unused3) {
                    }
                }
            } else {
                luaStateNewLuaState.getGlobal("SKILL_INFO_LIST");
                if (luaStateNewLuaState.isNil(-1)) {
                    throw new nv("SKILL_INFO_LIST is nil. skillinfolist.lub size=" + gwVarArr[2].f1419.length + " servername=" + C0358.f6667.f4851);
                }
                if (!luaStateNewLuaState.isTable(-1)) {
                    throw new nv("Invalid SKILL_INFO_LIST format: SKILL_INFO_LIST is not a table. skillinfolist.lub size=" + gwVarArr[2].f1419.length + " servername=" + C0358.f6667.f4851);
                }
                luaStateNewLuaState.pushNil();
                while (luaStateNewLuaState.next(-2) != 0) {
                    int integer2 = luaStateNewLuaState.toInteger(-2);
                    gx gxVar8 = new gx();
                    gxVar8.f1430 = integer2;
                    if (!luaStateNewLuaState.isTable(-1)) {
                        Log.e("AndRO", "Invalid SKILL_INFO_LIST format: SKILL_INFO_LIST entries are not tables \n");
                        throw new nv("Invalid SKILL_INFO_LIST format: SKILL_INFO_LIST entries are not tables \n");
                    }
                    luaStateNewLuaState.pushInteger(1);
                    luaStateNewLuaState.getTable(-2);
                    if (luaStateNewLuaState.isString(-1)) {
                        gxVar8.f1429 = luaStateNewLuaState.toString(-1);
                    }
                    luaStateNewLuaState.pop(1);
                    gxVar8.f1427 = ny.m903(luaStateNewLuaState, "SkillName", ow.LOCAL);
                    gxVar8.f1426 = ny.m902(luaStateNewLuaState, "MaxLv");
                    luaStateNewLuaState.pushString("SpAmount");
                    luaStateNewLuaState.getTable(-2);
                    if (!luaStateNewLuaState.isNil(-1)) {
                        gxVar8.f1422 = ny.m901(luaStateNewLuaState);
                    }
                    luaStateNewLuaState.pop(1);
                    luaStateNewLuaState.pushString("bSeperateLv");
                    luaStateNewLuaState.getTable(-2);
                    gxVar8.f1424 = luaStateNewLuaState.toBoolean(-1);
                    luaStateNewLuaState.pop(1);
                    luaStateNewLuaState.pushString("AttackRange");
                    luaStateNewLuaState.getTable(-2);
                    if (!luaStateNewLuaState.isNil(-1)) {
                        gxVar8.f1423 = ny.m901(luaStateNewLuaState);
                    }
                    luaStateNewLuaState.pop(1);
                    luaStateNewLuaState.pushString("_NeedSkillList");
                    luaStateNewLuaState.getTable(-2);
                    if (!luaStateNewLuaState.isNil(-1)) {
                        if (luaStateNewLuaState.isTable(-1)) {
                            m612(luaStateNewLuaState, gxVar8, null);
                        } else {
                            nz.m907("invalid _NeedSkillList entry for skill=" + integer2);
                        }
                    }
                    luaStateNewLuaState.pop(1);
                    luaStateNewLuaState.pushString("NeedSkillList");
                    luaStateNewLuaState.getTable(-2);
                    if (!luaStateNewLuaState.isNil(-1)) {
                        if (!luaStateNewLuaState.isTable(-1)) {
                            Log.e("AndRO", "not table");
                            throw new nv("not table");
                        }
                        luaStateNewLuaState.pushNil();
                        while (luaStateNewLuaState.next(-2) != 0) {
                            if (!luaStateNewLuaState.isTable(-1) || !luaStateNewLuaState.isNumber(-2)) {
                                nz.m907("Invalid NeedSkillList entry for skill " + integer2);
                            } else {
                                int integer3 = luaStateNewLuaState.toInteger(-2);
                                EnumC0134 enumC0134M1250 = EnumC0134.m1250(integer3);
                                if (enumC0134M1250 != null) {
                                    m612(luaStateNewLuaState, gxVar8, enumC0134M1250);
                                } else {
                                    nz.m907("Failed to read skill prerecs: converting class " + integer3 + " to JOB failed.");
                                }
                            }
                            luaStateNewLuaState.pop(1);
                        }
                    }
                    luaStateNewLuaState.pop(1);
                    luaStateNewLuaState.pop(1);
                    sparseArray.put(integer2, gxVar8);
                }
                luaStateNewLuaState.pop(1);
                luaStateNewLuaState.getGlobal("SKILL_DESCRIPT");
                if (!luaStateNewLuaState.isTable(-1)) {
                    Log.e("AndRO", "Invalid SKILL_DESCRIPT format: SKILL_DESCRIPT is not a table");
                    throw new nv("Invalid SKILL_DESCRIPT format: SKILL_DESCRIPT is not a table");
                }
                luaStateNewLuaState.pushNil();
                while (luaStateNewLuaState.next(-2) != 0) {
                    int integer4 = luaStateNewLuaState.toInteger(-2);
                    gx gxVar9 = sparseArray.get(integer4);
                    if (gxVar9 == null) {
                        nz.m907("skillinfolist entry not exists for skill from skilldescript, id: " + integer4);
                        luaStateNewLuaState.pop(1);
                    } else {
                        if (!luaStateNewLuaState.isTable(-1)) {
                            Log.e("AndRO", "Invalid SKILL_DESCRIPT format: SKILL_DESCRIPT content entry is not a table");
                            throw new nv("Invalid SKILL_DESCRIPT format: SKILL_DESCRIPT content entry is not a table");
                        }
                        luaStateNewLuaState.pushNil();
                        while (luaStateNewLuaState.next(-2) != 0) {
                            if (!luaStateNewLuaState.isString(-1)) {
                                Log.e("AndRO", "Invalid SKILL_DESCRIPT format: SKILL_DESCRIPT content entry content is not string");
                                throw new nv("Invalid SKILL_DESCRIPT format: SKILL_DESCRIPT content entry content is not string");
                            }
                            gxVar9.f1428 = String.valueOf(gxVar9.f1428) + ny.m904(luaStateNewLuaState, ow.LOCAL) + "\n";
                            luaStateNewLuaState.pop(1);
                        }
                        luaStateNewLuaState.pop(1);
                    }
                }
            }
            luaStateNewLuaState.close();
            C0358.f6687.m657(sparseArray);
            gw[] gwVarArr3 = gwVarArr;
            int length2 = gwVarArr.length;
            for (int i9 = 0; i9 < length2; i9++) {
                gw gwVar3 = gwVarArr3[i9];
                C0358.f6687.m653(true, -1, gwVar3.f1421, gwVar3.f1419.length, 0, gwVar3.f1420);
            }
        }
        this.f1411 = C0358.f6687.m650();
        this.f1410 = new gx();
        this.f1410.f1430 = 314;
        this.f1410.f1429 = "BD_RAGNAROK";
        this.f1410.f1427 = "Unknown Skill";
        this.f1410.f1426 = 1;
        this.f1410.f1422 = new int[1];
        this.f1410.f1423 = new int[1];
        this.f1410.f1424 = false;
        this.f1410.f1425 = new gx.C0045[0];
        this.f1410.f1428 = "No description";
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final gx m613(int i) {
        gx gxVarM646 = this.f1411.get(Integer.valueOf(i));
        if (gxVarM646 == null) {
            return this.f1410;
        }
        if (gxVarM646.f1429 == null) {
            gxVarM646 = C0358.f6687.m646(i);
            if (gxVarM646 == null) {
                return this.f1410;
            }
            this.f1411.put(Integer.valueOf(i), gxVarM646);
        }
        return gxVarM646;
    }
}
