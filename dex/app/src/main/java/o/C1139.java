package o;

import android.util.Log;
import android.util.SparseArray;
import com.roworkshop.andro.c_activity;
import java.util.HashMap;
import o.pj;
import org.apache.http.message.TokenParser;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* renamed from: o.텺, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C1139 {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private cr f8971;

    /* renamed from: 櫯, reason: contains not printable characters */
    String f8972;

    /* renamed from: ȃ, reason: contains not printable characters */
    private HashMap<Integer, C0432> f8970 = new HashMap<>();

    /* renamed from: 鷭, reason: contains not printable characters */
    SparseArray<C1140> f8973 = new SparseArray<>();

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1645(boolean z) throws NumberFormatException {
        boolean z2 = false;
        C0636[] c0636Arr = new C0636[6];
        for (int i = 0; i < c0636Arr.length; i++) {
            c0636Arr[i] = new C0636(this);
        }
        c0636Arr[0].f7509 = "data\\idnum2itemdisplaynametable.txt";
        c0636Arr[1].f7509 = "data\\num2itemdisplaynametable.txt";
        c0636Arr[2].f7509 = "data\\idnum2itemresnametable.txt";
        c0636Arr[3].f7509 = "data\\num2itemresnametable.txt";
        c0636Arr[4].f7509 = "data\\itemslotcounttable.txt";
        c0636Arr[5].f7509 = "data\\idnum2itemdesctable.txt";
        if (C0358.f6667.f4771 == pj.aux.OldchaosROCom || C0358.f6667.f4771 == pj.aux.IfritRagnarokCom || C0358.f6667.f4771 == pj.aux.iPlayRo201804 || C0358.f6667.f4771 == pj.aux.MyRebornRO || C0358.f6667.f4771 == pj.aux.OcrClassicCom) {
            c0636Arr[0].f7509 = "data\\eventidnum2itemdisplaynametable.txt";
            c0636Arr[1].f7509 = "data\\eventnum2itemdisplaynametable.txt";
            c0636Arr[2].f7509 = "data\\eventidnum2itemresnametable.txt";
            c0636Arr[3].f7509 = "data\\eventnum2itemresnametable.txt";
            c0636Arr[5].f7509 = "data\\eventidnum2itemdesctable.txt";
        }
        for (int i2 = 0; i2 < c0636Arr.length; i2++) {
            c0636Arr[i2].f7508 = (byte[]) this.f8971.m519(c0636Arr[i2].f7509, false);
            c0636Arr[i2].f7507 = pa.m975(c0636Arr[i2].f7508);
            if (!z2 && C0358.f6687.m652(c0636Arr[i2].f7509, c0636Arr[i2].f7508.length, 0, c0636Arr[i2].f7507) == -1) {
                z2 = true;
            }
        }
        String strM978 = pa.m978(C0358.f6674.m140(2130968592), ow.UTF8);
        String strM975 = pa.m975(pa.m987(strM978, ow.KOREAN, true));
        if (!z2 && C0358.f6687.m652("weaponid2view_v2", strM978.length(), 0, strM975) == -1) {
            z2 = true;
        }
        if (z2 || z) {
            SparseArray<C0432> sparseArray = new SparseArray<>();
            String strM9782 = pa.m978(c0636Arr[0].f7508, ow.LOCAL);
            String strM9783 = pa.m978(c0636Arr[1].f7508, ow.LOCAL);
            String strM9784 = pa.m978(c0636Arr[2].f7508, ow.KOREAN);
            String strM9785 = pa.m978(c0636Arr[3].f7508, ow.KOREAN);
            String strM9786 = pa.m978(c0636Arr[4].f7508, ow.LATIN);
            String strM9787 = pa.m978(c0636Arr[5].f7508, ow.LOCAL);
            String[] strArrM988 = pa.m988(strM9784, true, "#");
            for (int i3 = 0; i3 < strArrM988.length; i3 += 2) {
                try {
                    int iIntValue = Integer.valueOf(strArrM988[i3].trim()).intValue();
                    String strTrim = strArrM988[i3 + 1].trim();
                    C0432 c0432 = new C0432();
                    c0432.f6854 = strTrim;
                    sparseArray.put(iIntValue, c0432);
                } catch (Throwable unused) {
                }
            }
            String[] strArrM9882 = pa.m988(strM9785, true, "#");
            for (int i4 = 0; i4 < strArrM9882.length; i4 += 2) {
                try {
                    int iIntValue2 = Integer.valueOf(strArrM9882[i4].trim()).intValue();
                    String strTrim2 = strArrM9882[i4 + 1].trim();
                    C0432 c04322 = sparseArray.get(iIntValue2);
                    if (c04322 == null) {
                        c04322 = new C0432();
                        sparseArray.put(iIntValue2, c04322);
                    }
                    if (c04322.f6854 == null) {
                        c04322.f6854 = strTrim2;
                    } else if (!strTrim2.equals(c04322.f6854)) {
                        c04322.f6847 = strTrim2;
                    }
                } catch (Throwable unused2) {
                }
            }
            String[] strArrM9883 = pa.m988(strM9786, true, "#");
            for (int i5 = 0; i5 < strArrM9883.length; i5 += 2) {
                try {
                    int iIntValue3 = Integer.valueOf(strArrM9883[i5].trim()).intValue();
                    int iIntValue4 = Integer.valueOf(strArrM9883[i5 + 1].trim()).intValue();
                    C0432 c04323 = sparseArray.get(iIntValue3);
                    if (c04323 == null) {
                        c04323 = new C0432();
                        sparseArray.put(iIntValue3, c04323);
                    }
                    c04323.f6849 = iIntValue4;
                } catch (Throwable unused3) {
                }
            }
            String[] strArrM9884 = pa.m988(strM9782, true, "#");
            for (int i6 = 0; i6 < strArrM9884.length; i6 += 2) {
                try {
                    int iIntValue5 = Integer.valueOf(strArrM9884[i6].trim()).intValue();
                    String strTrim3 = strArrM9884[i6 + 1].trim();
                    C0432 c04324 = sparseArray.get(iIntValue5);
                    if (c04324 == null) {
                        c04324 = new C0432();
                        sparseArray.put(iIntValue5, c04324);
                    }
                    c04324.f6855 = strTrim3;
                } catch (Throwable unused4) {
                }
            }
            String[] strArrM9885 = pa.m988(strM9783, true, "#");
            for (int i7 = 0; i7 < strArrM9885.length; i7 += 2) {
                try {
                    int iIntValue6 = Integer.valueOf(strArrM9885[i7].trim()).intValue();
                    String strTrim4 = strArrM9885[i7 + 1].trim();
                    C0432 c04325 = sparseArray.get(iIntValue6);
                    if (c04325 == null) {
                        c04325 = new C0432();
                        sparseArray.put(iIntValue6, c04325);
                    }
                    if (c04325.f6855 == null) {
                        c04325.f6855 = strTrim4;
                    } else if (!strTrim4.equals(c04325.f6855)) {
                        c04325.f6851 = strTrim4;
                    }
                } catch (Throwable unused5) {
                }
            }
            m1643(strM978, sparseArray, true);
            String[] strArrM9886 = pa.m988(strM9787, true, "#");
            int i8 = 0;
            while (i8 < strArrM9886.length - 1) {
                try {
                    int iIntValue7 = Integer.valueOf(strArrM9886[i8].trim()).intValue();
                    String strTrim5 = strArrM9886[i8 + 1].trim();
                    C0432 c04326 = sparseArray.get(iIntValue7);
                    if (c04326 == null) {
                        c04326 = new C0432();
                        sparseArray.put(iIntValue7, c04326);
                    }
                    c04326.f6852 = strTrim5;
                    i8++;
                } catch (NumberFormatException unused6) {
                }
                i8++;
            }
            C0358.f6687.m651(sparseArray);
            for (C0636 c0636 : c0636Arr) {
                C0358.f6687.m653(true, -1, c0636.f7509, c0636.f7508.length, 0, c0636.f7507);
            }
            C0358.f6687.m653(true, -1, "weaponid2view_v2", strM978.length(), 0, strM975);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static void m1643(String str, SparseArray<C0432> sparseArray, boolean z) throws NumberFormatException {
        for (String str2 : str.split("\n")) {
            if (!str2.startsWith("//")) {
                String[] strArrSplit = str2.split("\t");
                if (strArrSplit.length >= 3) {
                    int i = Integer.parseInt(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    int i3 = Integer.parseInt(strArrSplit[2]);
                    C0432 c0432 = sparseArray.get(i);
                    if (c0432 == null) {
                        c0432 = new C0432();
                        sparseArray.put(i, c0432);
                    }
                    c0432.f6853 = EnumC0680.valuesCustom()[i2];
                    if (z) {
                        c0432.f6850 = i3;
                    }
                }
            }
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private void m1642(boolean z) throws NumberFormatException, nx {
        boolean z2 = z;
        SparseArray<C0432> sparseArray = new SparseArray<>();
        String strM978 = pa.m978(C0358.f6674.m140(2130968592), ow.UTF8);
        String strM975 = pa.m975(pa.m987(strM978, ow.KOREAN, true));
        if (!z && C0358.f6687.m652("weaponid2view_v2", strM978.length(), 0, strM975) == -1) {
            z2 = true;
        }
        String str = "System\\" + C0358.f6667.f4861;
        if (!C0358.f6667.f4861.contains(".")) {
            str = String.valueOf(str) + ".lub";
        }
        byte[] bArr = (byte[]) this.f8971.m519(str, false);
        String strM9752 = pa.m975(bArr);
        if (!z2 && C0358.f6687.m652("dummy_iteminfo_lua", bArr.length, 0, strM9752) == -1) {
            z2 = true;
        }
        if (z2) {
            m1643(strM978, sparseArray, false);
            LuaState luaStateNewLuaState = LuaStateFactory.newLuaState();
            try {
                ny.m906(luaStateNewLuaState, bArr);
                luaStateNewLuaState.getGlobal("tbl");
                luaStateNewLuaState.pushNil();
                while (luaStateNewLuaState.next(-2) != 0) {
                    int integer = luaStateNewLuaState.toInteger(-2);
                    if (!luaStateNewLuaState.isTable(-1)) {
                        Log.e("AndRO", "read_from_iteminfo_lua: invalid file format: second arg is not a table");
                        throw new nv("read_from_iteminfo_lua: invalid file format: second arg is not a table");
                    }
                    C0432 c0432 = sparseArray.get(integer);
                    if (c0432 == null) {
                        c0432 = new C0432();
                        sparseArray.put(integer, c0432);
                    }
                    c0432.f6851 = ny.m903(luaStateNewLuaState, "unidentifiedDisplayName", ow.LOCAL);
                    c0432.f6847 = ny.m903(luaStateNewLuaState, "unidentifiedResourceName", ow.KOREAN);
                    c0432.f6848 = ny.m903(luaStateNewLuaState, "unidentifiedDescriptionName", ow.LOCAL);
                    c0432.f6855 = ny.m903(luaStateNewLuaState, "identifiedDisplayName", ow.LOCAL);
                    c0432.f6854 = ny.m903(luaStateNewLuaState, "identifiedResourceName", ow.KOREAN);
                    c0432.f6852 = ny.m903(luaStateNewLuaState, "identifiedDescriptionName", ow.LOCAL);
                    c0432.f6849 = ny.m902(luaStateNewLuaState, "slotCount");
                    c0432.f6850 = ny.m902(luaStateNewLuaState, "ClassNum");
                    luaStateNewLuaState.pop(1);
                }
                luaStateNewLuaState.pop(1);
                luaStateNewLuaState.close();
                C0358.f6687.m651(sparseArray);
                C0358.f6687.m653(true, -1, "weaponid2view_v2", strM978.length(), 0, strM975);
                C0358.f6687.m653(true, -1, "dummy_iteminfo_lua", bArr.length, 0, strM9752);
            } catch (nw e) {
                throw new nx(str, e.getMessage());
            }
        }
    }

    C1139(c_activity c_activityVar, cr crVar) throws nx, NumberFormatException {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading item_db..."));
        this.f8971 = crVar;
        if (!C0358.f6667.f4841) {
            m1646((byte[]) crVar.m519("data\\lua files\\datainfo\\accessoryid.lub", false), (byte[]) crVar.m519("data\\lua files\\datainfo\\accname.lub", false));
        } else {
            m1644(crVar);
        }
        boolean z = false;
        int iM648 = C0358.f6687.m648("last_itemdb_type", 0);
        if (iM648 == 0) {
            z = true;
        } else if (iM648 == 1 && C0358.f6667.f4861 != null) {
            z = true;
        } else if (iM648 == 2 && C0358.f6667.f4861 == null) {
            z = true;
        }
        if (C0358.f6667.f4861 == null) {
            m1645(z);
        } else {
            m1642(z);
        }
        C0358.f6687.m658("last_itemdb_type", 0, String.valueOf(C0358.f6667.f4861 == null ? 1 : 2));
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final C0432 m1648(int i) {
        if (i <= 500) {
            return null;
        }
        C0432 c0432M656 = this.f8970.get(Integer.valueOf(i));
        if (c0432M656 == null && (c0432M656 = C0358.f6687.m656(i)) != null) {
            this.f8970.put(Integer.valueOf(i), c0432M656);
        }
        return c0432M656;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m1647(int i, boolean z) {
        C0432 c0432M1648 = m1648(i);
        if (c0432M1648 == null) {
            return null;
        }
        return (z || c0432M1648.f6847 == null) ? c0432M1648.f6854 : c0432M1648.f6847;
    }

    /* renamed from: o.텺$鷭, reason: contains not printable characters */
    class C1140 {

        /* renamed from: 櫯, reason: contains not printable characters */
        String f8975;

        /* renamed from: 鷭, reason: contains not printable characters */
        String f8976;

        C1140(String str, String str2) {
            this.f8976 = str;
            this.f8975 = str2;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1646(byte[] bArr, byte[] bArr2) throws nx {
        LuaState luaStateNewLuaState = LuaStateFactory.newLuaState();
        try {
            ny.m906(luaStateNewLuaState, bArr);
            try {
                ny.m906(luaStateNewLuaState, bArr2);
                luaStateNewLuaState.getGlobal("AccNameTable");
                luaStateNewLuaState.pushNil();
                while (luaStateNewLuaState.next(-2) != 0) {
                    int integer = luaStateNewLuaState.toInteger(-2);
                    String strM904 = ny.m904(luaStateNewLuaState, ow.KOREAN);
                    String strReplace = strM904.replace('_', TokenParser.SP);
                    if (strM904.isEmpty()) {
                        nz.m907("accname lub: invalid sprite name for headgear idx=" + integer);
                    } else {
                        this.f8973.put(integer, new C1140(strReplace, strM904));
                    }
                    luaStateNewLuaState.pop(1);
                }
                luaStateNewLuaState.pop(1);
                luaStateNewLuaState.close();
            } catch (nw e) {
                throw new nx("accname.lub", e.getMessage());
            }
        } catch (nw e2) {
            throw new nx("accessoryid.lub", e2.getMessage());
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m1644(cr crVar) throws NumberFormatException, nx {
        String[] strArrSplit = pa.m978((byte[]) crVar.m519("data\\visionary_tab.txt", false), ow.KOREAN).split("\n");
        for (int i = 0; i < strArrSplit.length; i++) {
            strArrSplit[i] = strArrSplit[i].trim();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            String str = strArrSplit[i3];
            if (str.startsWith("!")) {
                try {
                    i2 = Integer.parseInt(str.substring(1));
                } catch (NumberFormatException unused) {
                    throw new nx("data\\visionary_tab.txt", "Failed to parse offset in line " + i3);
                }
            } else if (str.startsWith("*")) {
                this.f8972 = str.substring(1);
            } else {
                this.f8973.put(i2, new C1140(str, str));
                i2++;
            }
        }
        this.f8973.size();
    }
}
