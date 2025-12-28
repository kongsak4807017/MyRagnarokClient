package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o.ua;

/* renamed from: o.땜, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C1034 extends ua {
    public C1034(cr crVar, boolean z) throws SQLException {
        je jeVar = C0358.f6674.f42;
        if (jeVar.f1735 != null) {
            C0358.f6674.mo139(new jt(jeVar));
        }
        C0358.f6674.mo139(new jr(jeVar, "Reading questid2display..."));
        byte[] bArr = (byte[]) crVar.m519("data\\questid2display.txt", false);
        String strM975 = pa.m975(bArr);
        if (-1 != C0358.f6687.m652("data\\questid2display.txt", bArr.length, 0, strM975)) {
            return;
        }
        m1103(pa.m978(bArr, ow.LOCAL).replace("\r", ""), pa.f3401.name());
        hw hwVar = C0358.f6687;
        TreeMap<Integer, ua.C0084> treeMap = this.f4998;
        hwVar.f1566.beginTransaction();
        hwVar.f1566.delete("questid2display", null, null);
        SQLiteStatement sQLiteStatementCompileStatement = hwVar.f1566.compileStatement("INSERT INTO `questid2display` (`id`,`name`,`image1`,`image2`,`desc`) VALUES (?, ?, ?, ?, ?)");
        try {
            try {
                Iterator<Map.Entry<Integer, ua.C0084>> it = treeMap.entrySet().iterator();
                while (it.hasNext()) {
                    ua.C0084 value = it.next().getValue();
                    sQLiteStatementCompileStatement.clearBindings();
                    sQLiteStatementCompileStatement.bindLong(1, r0.getKey().intValue());
                    sQLiteStatementCompileStatement.bindString(2, value.f5004);
                    sQLiteStatementCompileStatement.bindString(3, value.f5003);
                    sQLiteStatementCompileStatement.bindString(4, value.f5002);
                    sQLiteStatementCompileStatement.bindString(5, String.valueOf(value.f5001[0]) + "#" + value.f5001[1]);
                    sQLiteStatementCompileStatement.executeInsert();
                }
                hwVar.f1566.setTransactionSuccessful();
                hwVar.f1566.endTransaction();
                this.f4998.clear();
                C0358.f6687.m653(true, -1, "data\\questid2display.txt", bArr.length, 0, strM975);
            } catch (SQLException e) {
                throw new nv(e);
            }
        } catch (Throwable th) {
            hwVar.f1566.endTransaction();
            throw th;
        }
    }

    @Override // o.ua
    /* renamed from: 鷭 */
    public final ua.C0084 mo1102(int i) {
        ua.C0084[] c0084Arr;
        int[] iArr = {i};
        hw hwVar = C0358.f6687;
        ua.C0084[] c0084Arr2 = new ua.C0084[iArr.length];
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 != 0) {
                sb.append(" OR ");
            }
            sb.append("`id`='" + iArr[i2] + "'");
        }
        Cursor cursorQuery = hwVar.f1566.query("questid2display", null, sb.toString(), null, null, null, null, null);
        if (cursorQuery.moveToFirst()) {
            do {
                int i3 = cursorQuery.getInt(0);
                int i4 = 0;
                while (i4 < iArr.length && iArr[i4] != i3) {
                    i4++;
                }
                if (i4 == iArr.length) {
                    throw new nv();
                }
                c0084Arr2[i4] = new ua.C0084();
                c0084Arr2[i4].f5004 = cursorQuery.getString(1);
                c0084Arr2[i4].f5003 = cursorQuery.getString(2);
                c0084Arr2[i4].f5002 = cursorQuery.getString(3);
                String string = cursorQuery.getString(4);
                if (string != null) {
                    c0084Arr2[i4].f5001 = string.split("#");
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            c0084Arr = c0084Arr2;
        } else {
            cursorQuery.close();
            c0084Arr = c0084Arr2;
        }
        return c0084Arr[0];
    }
}
