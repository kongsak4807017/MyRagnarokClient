package o;

import android.util.Log;
import java.util.HashMap;
import o.pj;
import org.apache.commons.net.SocketClient;
import org.apache.http.message.TokenParser;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class lo {

    /* renamed from: 櫯, reason: contains not printable characters */
    HashMap<Integer, C0060> f2006 = new HashMap<>();

    /* renamed from: 鷭, reason: contains not printable characters */
    pj.Cif f2007;

    /* renamed from: o.lo$鷭, reason: contains not printable characters */
    class C0060 {

        /* renamed from: Ą, reason: contains not printable characters */
        String f2008;

        /* renamed from: ą, reason: contains not printable characters */
        String f2009;

        /* renamed from: ȃ, reason: contains not printable characters */
        String f2011;

        /* renamed from: ˮ͈, reason: contains not printable characters */
        String f2012;

        /* renamed from: 櫯, reason: contains not printable characters */
        String f2013;

        /* renamed from: 鷭, reason: contains not printable characters */
        int f2014;

        C0060(int i, String str, String str2, String str3, String str4, String str5) {
            this.f2014 = i;
            this.f2013 = str;
            this.f2012 = str2;
            this.f2011 = str3;
            this.f2008 = str4;
            this.f2009 = str5;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static nu m781(int i) {
        if (EnumC0134.m1252(i)) {
            return nu.PC;
        }
        if ((i >= 46 && i <= 125) || i == EnumC0431.HIDDEN_WARP_CLASS.f6846 || i == EnumC0431.INVISIBLE_CLASS.f6846 || ((i > 400 && i < EnumC0431.MAX_NPCID.f6846) || (i >= EnumC0431.MIN_NPCID2.f6846 && i < EnumC0431.MAX_NPCID2.f6846))) {
            return nu.NPC;
        }
        if ((i >= EnumC0430.CLASS_BASE.f6835 && i <= 6016) || (i >= 6048 && i <= 6052)) {
            return nu.HOM;
        }
        if (i >= 6017 && i <= 6046) {
            return nu.MER;
        }
        return nu.MOB;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m783(byte[] bArr, byte[] bArr2) throws NumberFormatException, nx {
        LuaState luaStateNewLuaState = LuaStateFactory.newLuaState();
        try {
            ny.m906(luaStateNewLuaState, bArr);
            try {
                ny.m906(luaStateNewLuaState, bArr2);
                luaStateNewLuaState.getGlobal("JobNameTable");
                luaStateNewLuaState.pushNil();
                while (luaStateNewLuaState.next(-2) != 0) {
                    int integer = luaStateNewLuaState.toInteger(-2);
                    String strM904 = ny.m904(luaStateNewLuaState, ow.KOREAN);
                    this.f2006.put(Integer.valueOf(integer), new C0060(integer, strM904.replace('_', TokenParser.SP), strM904, null, null, null));
                    luaStateNewLuaState.pop(1);
                }
                luaStateNewLuaState.pop(1);
                luaStateNewLuaState.close();
                for (String str : pa.m978(C0358.f6674.m140(2130968580), ow.UTF8).split(SocketClient.NETASCII_EOL)) {
                    String[] strArrSplit = str.split("\t");
                    if (strArrSplit.length >= 2) {
                        try {
                            C0060 c0060 = this.f2006.get(Integer.valueOf(Integer.parseInt(strArrSplit[0])));
                            if (c0060 != null) {
                                String str2 = c0060.f2012;
                                c0060.f2012 = strArrSplit[1];
                                if (!str2.equals(c0060.f2012)) {
                                }
                            }
                        } catch (NumberFormatException unused) {
                            nz.m907("invalid job_mer line: " + str);
                        }
                    }
                }
            } catch (nw e) {
                throw new nx("jobname.lub", e.getMessage());
            }
        } catch (nw e2) {
            throw new nx("npcidentity.lub", e2.getMessage());
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private void m782(String str) throws NumberFormatException {
        String[] strArrSplit;
        String[] strArrSplit2 = str.split("\n");
        if (strArrSplit2.length == 0) {
            Log.e("AndRO", "Empty JobDB file content.");
            throw new nv("Empty JobDB file content.");
        }
        for (String str2 : strArrSplit2) {
            String strTrim = str2.trim();
            if (strTrim.length() > 0) {
                if (strTrim.contains("//")) {
                    String[] strArrSplit3 = strTrim.split("//");
                    if (strArrSplit3.length > 0) {
                        strTrim = strArrSplit3[0];
                        if (strTrim.startsWith("\n") && !strTrim.startsWith(SocketClient.NETASCII_EOL) && (strArrSplit = strTrim.split("\t", 7)) != null && strArrSplit.length >= 3) {
                            for (int i = 0; i < strArrSplit.length; i++) {
                                strArrSplit[i] = strArrSplit[i].trim();
                                if (strArrSplit[i].length() <= 0) {
                                    strArrSplit[i] = null;
                                }
                            }
                            Integer numDecode = Integer.decode(strArrSplit[0]);
                            this.f2006.put(numDecode, new C0060(numDecode.intValue(), strArrSplit[1], strArrSplit[2], strArrSplit.length >= 4 ? strArrSplit[3] : null, strArrSplit.length >= 5 ? strArrSplit[4] : null, strArrSplit.length >= 7 ? strArrSplit[6] : null));
                        }
                    }
                } else if (strTrim.startsWith("\n")) {
                }
            }
        }
    }

    lo(pj.Cif cif, String str, byte[] bArr, byte[] bArr2, String str2, C1076 c1076) throws NumberFormatException, nx {
        String strM649;
        C0358.f6674.f42.m731("Reading unit_db...");
        this.f2007 = cif;
        m782(str);
        m783(bArr, bArr2);
        for (String str3 : str2.split("\n")) {
            String[] strArrSplit = str3.split("//");
            if (strArrSplit.length > 0) {
                String strTrim = strArrSplit[0].trim();
                if (strTrim.length() > 0) {
                    String[] strArrSplit2 = strTrim.split("\t");
                    if (strArrSplit2.length < 2) {
                        throw new nx("job_name_msgid.txt", "Failed to tokenize line " + strTrim);
                    }
                    int i = Integer.parseInt(strArrSplit2[0]);
                    int i2 = Integer.parseInt(strArrSplit2[1]);
                    C0060 c0060 = this.f2006.get(Integer.valueOf(i));
                    if (c0060 != null && (strM649 = C0358.f6687.m649(i2)) != null) {
                        c0060.f2013 = strM649;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    static int m780(int i) {
        EnumC0134 enumC0134M1251 = EnumC0134.m1251(i);
        if (enumC0134M1251 != EnumC0134.GAMEMASTER && enumC0134M1251 != null) {
            boolean z = enumC0134M1251.m1254() == enumC0134M1251;
            boolean z2 = enumC0134M1251.m1255(true) == enumC0134M1251;
            if (z2) {
                enumC0134M1251 = enumC0134M1251.m1255(false);
            }
            EnumC0765 enumC0765M1253 = enumC0134M1251.m1253();
            EnumC1048 enumC1048M1617 = EnumC1048.m1617(enumC0134M1251.m1256().f8819 & (-8193));
            if ((enumC1048M1617.f8819 & 16384) > 0) {
                if ((enumC1048M1617.f8819 & 4096) > 0) {
                    enumC1048M1617 = EnumC1048.m1617(enumC1048M1617.f8819 & (-4097));
                }
            }
            EnumC0134 enumC0134M1620 = enumC1048M1617.m1620(enumC0765M1253);
            if (z) {
                enumC0134M1620 = enumC0134M1620.m1254();
            }
            if (z2) {
                enumC0134M1620 = enumC0134M1620.m1255(true);
            }
            return enumC0134M1620.f6499;
        }
        return i;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final String m784(int i, byte b) {
        int iM780 = m780(i);
        C0060 c0060 = this.f2006.get(Integer.valueOf(iM780));
        if (c0060 == null) {
            String str = "Failed to convert job " + iM780 + " to spritename";
            if (C0358.f6667.f4824) {
                nz.m907(str);
                c0060 = this.f2006.get(Integer.valueOf(EnumC0134.NOVICE.f6499));
            } else {
                throw new ut(str, true);
            }
        }
        if (c0060.f2012 == null || c0060.f2012.length() == 0) {
            throw new ut("Job " + iM780 + " has null / zero length spritename", true);
        }
        if (b == EnumC0765.FEMALE.ordinal() && c0060.f2008 != null) {
            return c0060.f2008;
        }
        return c0060.f2012;
    }
}
