package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class lp extends un {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static lp f2015 = null;

    private lp() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    static synchronized lp m786() {
        if (f2015 == null) {
            f2015 = new lp();
        }
        return f2015;
    }

    @Override // o.un
    /* renamed from: 鷭, reason: contains not printable characters */
    public final void mo789(String str) {
        if (C0358.f6674 == null || C0358.f6674.f42 == null) {
            return;
        }
        C0358.f6674.f42.m731(str);
    }

    @Override // o.un
    /* renamed from: 櫯, reason: contains not printable characters */
    public final boolean mo788() {
        if (C0358.f6676 == null || C0358.f6676.f1081 == null) {
            return false;
        }
        return C0358.f6676.f1081.mo457();
    }

    @Override // o.un
    /* renamed from: 鷭, reason: contains not printable characters */
    public final byte[] mo790(String str, long j, boolean z) {
        return C0358.f6676.f1081.m566(str, j, z, (po) null);
    }

    @Override // o.un
    /* renamed from: 櫯, reason: contains not printable characters */
    public final int mo787(String str) {
        try {
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(str, null, 0);
            if (!sQLiteDatabaseOpenDatabase.isOpen()) {
                throw new uu("failed to open db");
            }
            Cursor cursorQuery = sQLiteDatabaseOpenDatabase.query("SysVars", new String[]{"Value"}, "`Key` = ?", new String[]{"patch_id"}, null, null, null);
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                throw new uu("failed to find patch_id in db");
            }
            int i = cursorQuery.getInt(0);
            cursorQuery.close();
            sQLiteDatabaseOpenDatabase.close();
            return i;
        } catch (SQLiteException unused) {
            return 0;
        } catch (uu unused2) {
            return 0;
        }
    }
}
