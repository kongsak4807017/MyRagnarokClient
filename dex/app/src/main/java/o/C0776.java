package o;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: o.湟, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0776 {

    /* renamed from: 鷭, reason: contains not printable characters */
    cr f7810;

    C0776(cr crVar) {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading bgm_db..."));
        this.f7810 = crVar;
        byte[] bArr = (byte[]) crVar.m519("data\\mp3nametable.txt", false);
        String strM975 = pa.m975(bArr);
        if (C0358.f6687.m652("data\\mp3nametable.txt", bArr.length, 0, strM975) == -1) {
            HashMap<String, String> map = new HashMap<>();
            String[] strArrM988 = pa.m988(pa.m978(bArr, ow.KOREAN).replace("\\\\", "/").replace("\\", "/"), true, "#");
            for (int i = 0; i < strArrM988.length / 2; i++) {
                String str = strArrM988[(i * 2) + 0];
                String str2 = strArrM988[(i * 2) + 1];
                if (str.endsWith(".rsw")) {
                    map.put(str.substring(0, str.length() - 4).trim(), str2.trim());
                }
            }
            C0358.f6687.m660(map);
            C0358.f6687.m653(true, -1, "data\\mp3nametable.txt", bArr.length, 0, strM975);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static String m1461(String str) {
        String str2;
        Cursor cursorQuery = C0358.f6687.f1566.query("mp3", new String[]{"bgm"}, " map = ?", new String[]{str}, null, null, null);
        if (cursorQuery.moveToFirst()) {
            String string = cursorQuery.getString(0);
            cursorQuery.close();
            str2 = string;
        } else {
            cursorQuery.close();
            str2 = null;
        }
        if (str2 == null) {
            str2 = "BGM/01.mp3";
        }
        return str2.replace("bgm", "BGM");
    }
}
