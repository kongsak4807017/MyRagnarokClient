package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.SparseArray;
import com.roworkshop.andro.c_activity;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.gx;
import o.gx.C0045;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class hw {

    /* renamed from: 櫯, reason: contains not printable characters */
    SQLiteDatabase f1566;

    /* renamed from: 鷭, reason: contains not printable characters */
    SQLiteOpenHelper f1567;

    /* renamed from: o.hw$鷭, reason: contains not printable characters */
    static class C0052 {

        /* renamed from: 鷭, reason: contains not printable characters */
        static final String f1568;

        C0052() {
        }

        static {
            f1568 = oc.f3250 == my.localclient ? "client_dir_localclient" : "client_dir";
        }
    }

    /* renamed from: Ą, reason: contains not printable characters */
    private boolean m640() throws SQLException {
        try {
            this.f1566.execSQL("CREATE TABLE IF NOT EXISTS \"file_versions_v3\" (\"id\"  INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\"name\"  TEXT NOT NULL,\"size\"  INTEGER NOT NULL,\"last_modified\"  INTEGER NOT NULL,\"md5\"  TEXT NOT NULL)");
            this.f1566.execSQL("CREATE TABLE IF NOT EXISTS \"skill_db\" (\"id\"  INTEGER NOT NULL,\"name\"  TEXT NOT NULL,\"visible_name\"  TEXT NOT NULL,\"maxlv\"  INTEGER NOT NULL,\"sp_amount\"  TEXT NOT NULL,\"range\"  TEXT NOT NULL,\"separate_lv\"  INTEGER NOT NULL,\"prerecs\"  TEXT NOT NULL,\"description\"  TEXT NOT NULL,PRIMARY KEY (\"id\"))");
            this.f1566.execSQL("CREATE TABLE IF NOT EXISTS \"item_db_v2\" (\"id\"  INTEGER,\"unidentifiedDisplayName\"  TEXT,\"unidentifiedResourceName\"  TEXT,\"unidentifiedDescriptionName\"  TEXT,\"identifiedDisplayName\"  TEXT,\"identifiedResourceName\"  TEXT,\"identifiedDescriptionName\"  TEXT,\"slotCount\"  INTEGER,\"ClassNum\"  INTEGER,\"IT\"  INTEGER,PRIMARY KEY (\"id\"))");
            this.f1566.execSQL("CREATE TABLE IF NOT EXISTS \"mp3\" (\"map\"  TEXT,\"bgm\"  TEXT)");
            this.f1566.execSQL("CREATE TABLE IF NOT EXISTS \"msgstringtable\" (\"line\"  INTEGER NOT NULL,\"text\"  TEXT NOT NULL,PRIMARY KEY (\"line\"))");
            this.f1566.execSQL("CREATE TABLE IF NOT EXISTS \"settings\" (\"name\"  TEXT NOT NULL,\"idx\"  INTEGER NOT NULL,\"val\"  TEXT NOT NULL,PRIMARY KEY (\"name\" ASC, \"idx\"))");
            this.f1566.execSQL("CREATE TABLE IF NOT EXISTS \"questid2display\" (\"id\"  INTEGER,\"name\"  TEXT,\"image1\"  TEXT,\"image2\"  TEXT,\"desc\"  TEXT,PRIMARY KEY (\"id\"))");
            this.f1566.execSQL("CREATE TABLE IF NOT EXISTS \"remote_filelist\" (\"filename\"  TEXT NOT NULL COLLATE NOCASE ,PRIMARY KEY (\"filename\"));");
            return true;
        } catch (SQLException unused) {
            return false;
        }
    }

    public hw(c_activity c_activityVar) {
        this.f1567 = new hx(this, c_activityVar, "mydb", null, 1);
        this.f1566 = this.f1567.getWritableDatabase();
        if (!this.f1566.isOpen()) {
            Log.e("AndRO", "Couldn't obtain writable database");
            throw new nv("Couldn't obtain writable database");
        }
        if (!m640()) {
            Log.e("AndRO", "Failed to init SQLite GRF cache");
            throw new nv("Failed to init SQLite GRF cache");
        }
        m647();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final long m653(boolean z, int i, String str, int i2, int i3, String str2) {
        if (z) {
            this.f1566.beginTransaction();
        }
        this.f1566.delete("file_versions_v3", "`name` = ?", new String[]{str});
        ContentValues contentValues = new ContentValues();
        if (i != -1) {
            contentValues.put("id", Integer.valueOf(i));
        }
        contentValues.put("name", str);
        contentValues.put("size", Integer.valueOf(i2));
        contentValues.put("last_modified", Integer.valueOf(i3));
        if (str2 != null) {
            contentValues.put("md5", str2);
        } else {
            contentValues.put("md5", "");
        }
        long jInsert = this.f1566.insert("file_versions_v3", null, contentValues);
        if (jInsert == -1) {
            if (z) {
                this.f1566.endTransaction();
                return -1L;
            }
            return -1L;
        }
        if (z) {
            this.f1566.setTransactionSuccessful();
            this.f1566.endTransaction();
        }
        return jInsert;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m661(boolean z, String[] strArr) {
        StringBuilder sb = new StringBuilder(128);
        String[] strArr2 = null;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                sb.append(" AND name <> ?");
                strArr2[i] = strArr[i];
            }
        }
        if (z) {
            this.f1566.beginTransaction();
        }
        this.f1566.delete("file_versions_v3", "`name` LIKE '%.grf'" + sb.toString(), strArr2);
        if (z) {
            this.f1566.setTransactionSuccessful();
            this.f1566.endTransaction();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final SparseArray<String> m654() {
        SparseArray<String> sparseArray = new SparseArray<>();
        Cursor cursorQuery = this.f1566.query("file_versions_v3", new String[]{"name", "id"}, "`name` LIKE '%.grf'", null, null, null, null);
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return sparseArray;
        }
        do {
            sparseArray.put(cursorQuery.getInt(1), cursorQuery.getString(0));
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return sparseArray;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final int m652(String str, int i, int i2, String str2) {
        Cursor cursorQuery = this.f1566.query("file_versions_v3", new String[]{"id", "size", "last_modified", "md5"}, "`name` = ?", new String[]{str}, null, null, null);
        if (cursorQuery.getCount() > 0) {
            if (cursorQuery.getCount() != 1) {
                String str3 = "Unexpected result file count: " + cursorQuery.getCount() + " (filename: " + str + ")";
                Log.e("AndRO", str3);
                throw new nv(str3);
            }
            cursorQuery.moveToFirst();
            int i3 = cursorQuery.getInt(0);
            int i4 = cursorQuery.getInt(1);
            int i5 = cursorQuery.getInt(2);
            String string = cursorQuery.getString(3);
            if (i == i4 && i2 == i5 && (str2 == null || str2.equals(string))) {
                cursorQuery.close();
                return i3;
            }
        }
        cursorQuery.close();
        return -1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m641(int[] iArr) {
        if (iArr == null) {
            return "";
        }
        CharBuffer charBufferAllocate = CharBuffer.allocate(iArr.length * 10);
        for (int i = 0; i < iArr.length; i++) {
            if (i != 0) {
                charBufferAllocate.append((CharSequence) ":");
            }
            charBufferAllocate.append((CharSequence) String.valueOf(iArr[i]));
        }
        return String.valueOf(charBufferAllocate.array());
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static String m642(gx.C0045[] c0045Arr) {
        if (c0045Arr == null) {
            return "";
        }
        CharBuffer charBufferAllocate = CharBuffer.allocate(c0045Arr.length * 50);
        for (int i = 0; i < c0045Arr.length; i++) {
            if (i != 0) {
                charBufferAllocate.append((CharSequence) ":");
            }
            charBufferAllocate.append((CharSequence) (String.valueOf(c0045Arr[i].f1432 == null ? null : String.valueOf(c0045Arr[i].f1432)) + ":" + String.valueOf(c0045Arr[i].f1434) + ":" + String.valueOf(c0045Arr[i].f1433)));
        }
        return String.valueOf(charBufferAllocate.array());
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m657(SparseArray<gx> sparseArray) {
        this.f1566.beginTransaction();
        this.f1566.delete("skill_db", null, null);
        DatabaseUtils.InsertHelper insertHelper = new DatabaseUtils.InsertHelper(this.f1566, "skill_db");
        int columnIndex = insertHelper.getColumnIndex("id");
        int columnIndex2 = insertHelper.getColumnIndex("name");
        int columnIndex3 = insertHelper.getColumnIndex("visible_name");
        int columnIndex4 = insertHelper.getColumnIndex("maxlv");
        int columnIndex5 = insertHelper.getColumnIndex("sp_amount");
        int columnIndex6 = insertHelper.getColumnIndex("range");
        int columnIndex7 = insertHelper.getColumnIndex("separate_lv");
        int columnIndex8 = insertHelper.getColumnIndex("prerecs");
        int columnIndex9 = insertHelper.getColumnIndex("description");
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            gx gxVarValueAt = sparseArray.valueAt(i);
            if (gxVarValueAt != null) {
                insertHelper.prepareForInsert();
                insertHelper.bind(columnIndex, iKeyAt);
                insertHelper.bind(columnIndex2, gxVarValueAt.f1429);
                insertHelper.bind(columnIndex3, gxVarValueAt.f1427);
                insertHelper.bind(columnIndex4, gxVarValueAt.f1426);
                insertHelper.bind(columnIndex5, m641(gxVarValueAt.f1422));
                insertHelper.bind(columnIndex6, m641(gxVarValueAt.f1423));
                insertHelper.bind(columnIndex7, gxVarValueAt.f1424);
                insertHelper.bind(columnIndex8, m642(gxVarValueAt.f1425));
                insertHelper.bind(columnIndex9, gxVarValueAt.f1428);
                if (insertHelper.execute() == -1) {
                    String str = "Failed to insert entry into cache: " + gxVarValueAt.f1429;
                    Log.e("AndRO", str);
                    throw new nv(str);
                }
            }
        }
        insertHelper.close();
        this.f1566.setTransactionSuccessful();
        this.f1566.endTransaction();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final void m651(SparseArray<C0432> sparseArray) {
        this.f1566.beginTransaction();
        this.f1566.delete("item_db_v2", null, null);
        int size = sparseArray.size();
        String[] strArr = new String[size * 10];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            C0432 c0432ValueAt = sparseArray.valueAt(i2);
            if (c0432ValueAt != null && c0432ValueAt.f6855 != null) {
                strArr[i + 0] = String.valueOf(iKeyAt);
                strArr[i + 1] = c0432ValueAt.f6851;
                strArr[i + 2] = c0432ValueAt.f6847;
                strArr[i + 3] = c0432ValueAt.f6848;
                strArr[i + 4] = c0432ValueAt.f6855;
                strArr[i + 5] = c0432ValueAt.f6854;
                strArr[i + 6] = c0432ValueAt.f6852;
                strArr[i + 7] = String.valueOf(c0432ValueAt.f6849);
                strArr[i + 8] = String.valueOf(c0432ValueAt.f6850);
                strArr[i + 9] = String.valueOf(c0432ValueAt.f6853 == null ? EnumC0680.ETC.ordinal() : c0432ValueAt.f6853.ordinal());
                i += 10;
            }
        }
        m659("INSERT INTO `item_db_v2` (`id`,`unidentifiedDisplayName`,`unidentifiedResourceName`,`unidentifiedDescriptionName`,`identifiedDisplayName`,`identifiedResourceName`,`identifiedDescriptionName`,`slotCount`,`ClassNum`,`IT`) VALUES ", strArr, 10, new hy(this, true));
        this.f1566.setTransactionSuccessful();
        this.f1566.endTransaction();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m660(HashMap<String, String> map) {
        this.f1566.beginTransaction();
        this.f1566.delete("mp3", null, null);
        DatabaseUtils.InsertHelper insertHelper = new DatabaseUtils.InsertHelper(this.f1566, "mp3");
        int columnIndex = insertHelper.getColumnIndex("map");
        int columnIndex2 = insertHelper.getColumnIndex("bgm");
        Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
        for (Map.Entry<String, String> entry : setEntrySet) {
            insertHelper.prepareForInsert();
            insertHelper.bind(columnIndex, entry.getKey());
            insertHelper.bind(columnIndex2, entry.getValue());
            insertHelper.execute();
        }
        this.f1566.setTransactionSuccessful();
        this.f1566.endTransaction();
        setEntrySet.size();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final C0432 m656(int i) {
        C0432 c0432 = new C0432();
        Cursor cursorQuery = this.f1566.query("item_db_v2", new String[]{"unidentifiedDisplayName", "unidentifiedResourceName", "unidentifiedDescriptionName", "identifiedDisplayName", "identifiedResourceName", "identifiedDescriptionName", "slotCount", "ClassNum", "IT"}, "`id` = ?", new String[]{String.valueOf(i)}, null, null, null);
        if (cursorQuery.getCount() == 0) {
            return null;
        }
        cursorQuery.moveToFirst();
        c0432.f6851 = cursorQuery.getString(0);
        c0432.f6847 = cursorQuery.getString(1);
        c0432.f6848 = cursorQuery.getString(2);
        c0432.f6855 = cursorQuery.getString(3);
        c0432.f6854 = cursorQuery.getString(4);
        c0432.f6852 = cursorQuery.getString(5);
        c0432.f6849 = cursorQuery.getInt(6);
        c0432.f6850 = cursorQuery.getInt(7);
        c0432.f6853 = EnumC0680.valuesCustom()[cursorQuery.getInt(8)];
        cursorQuery.close();
        return c0432;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m662(String[] strArr) {
        this.f1566.beginTransaction();
        this.f1566.delete("msgstringtable", null, null);
        DatabaseUtils.InsertHelper insertHelper = new DatabaseUtils.InsertHelper(this.f1566, "msgstringtable");
        int columnIndex = insertHelper.getColumnIndex("line");
        int columnIndex2 = insertHelper.getColumnIndex("text");
        for (int i = 0; i < strArr.length; i++) {
            insertHelper.prepareForInsert();
            insertHelper.bind(columnIndex, i + 1);
            insertHelper.bind(columnIndex2, strArr[i].trim());
            insertHelper.execute();
        }
        this.f1566.setTransactionSuccessful();
        this.f1566.endTransaction();
        insertHelper.close();
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final String m649(int i) {
        Cursor cursorQuery = this.f1566.query("msgstringtable", new String[]{"text"}, " line = ?", new String[]{String.valueOf(i)}, null, null, null);
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return null;
        }
        String string = cursorQuery.getString(0);
        cursorQuery.close();
        return string;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    final HashMap<Integer, gx> m650() {
        HashMap<Integer, gx> map = new HashMap<>();
        Cursor cursorQuery = this.f1566.query("skill_db", new String[]{"id", "visible_name"}, null, null, null, null, null);
        if (cursorQuery.getCount() == 0) {
            cursorQuery.close();
            return map;
        }
        cursorQuery.moveToFirst();
        do {
            gx gxVar = new gx();
            int i = cursorQuery.getInt(0);
            gxVar.f1427 = cursorQuery.getString(1);
            map.put(Integer.valueOf(i), gxVar);
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return map;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int[] m643(String str) {
        if (str.equals("") || str == null) {
            return null;
        }
        String[] strArrSplit = str.trim().split(":");
        int[] iArr = new int[strArrSplit.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.valueOf(strArrSplit[i]).intValue();
        }
        return iArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static gx.C0045[] m644(gx gxVar, String str) {
        if (str.equals("") || str == null) {
            return null;
        }
        String[] strArrSplit = str.trim().split(":");
        gx.C0045[] c0045Arr = new gx.C0045[strArrSplit.length / 3];
        for (int i = 0; i < c0045Arr.length; i++) {
            c0045Arr[i] = gxVar.new C0045();
            c0045Arr[i].f1432 = (strArrSplit[(i * 3) + 0] == null || strArrSplit[(i * 3) + 0].equals("null")) ? null : EnumC0134.valueOf(strArrSplit[(i * 3) + 0]);
            c0045Arr[i].f1434 = Integer.valueOf(strArrSplit[(i * 3) + 1]).intValue();
            c0045Arr[i].f1433 = Integer.valueOf(strArrSplit[(i * 3) + 2]).intValue();
        }
        return c0045Arr;
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final gx m646(int i) {
        gx gxVar = new gx();
        Cursor cursorQuery = this.f1566.query("skill_db", new String[]{"name", "visible_name", "maxlv", "sp_amount", "range", "separate_lv", "prerecs", "description"}, "`id` = ?", new String[]{String.valueOf(i)}, null, null, null);
        if (cursorQuery.getCount() == 0) {
            return null;
        }
        cursorQuery.moveToFirst();
        gxVar.f1429 = cursorQuery.getString(0);
        gxVar.f1427 = cursorQuery.getString(1);
        gxVar.f1426 = cursorQuery.getInt(2);
        gxVar.f1422 = m643(cursorQuery.getString(3));
        gxVar.f1423 = m643(cursorQuery.getString(4));
        gxVar.f1424 = cursorQuery.getInt(5) != 0;
        gxVar.f1425 = m644(gxVar, cursorQuery.getString(6));
        gxVar.f1428 = cursorQuery.getString(7);
        cursorQuery.close();
        return gxVar;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public final String m655(String str, int i) {
        Cursor cursorQuery = this.f1566.query("settings", new String[]{"val"}, "`name` = ? AND `idx` = ?", new String[]{str, String.valueOf(i)}, null, null, null);
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return null;
        }
        String string = cursorQuery.getString(0);
        cursorQuery.close();
        return string;
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public final int m648(String str, int i) {
        String strM655 = m655(str, 0);
        String str2 = strM655 == null ? null : strM655;
        String str3 = str2;
        if (str2 == null) {
            return i;
        }
        if (str3.equals("true")) {
            return 1;
        }
        if (str3.equals("false")) {
            return 0;
        }
        return Integer.parseInt(str3);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m658(String str, int i, String str2) {
        if (str2 == null) {
            this.f1566.beginTransaction();
            this.f1566.delete("settings", "`name` = ? AND `idx` = ?", new String[]{str, String.valueOf(i)});
            this.f1566.setTransactionSuccessful();
            this.f1566.endTransaction();
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        contentValues.put("idx", Integer.valueOf(i));
        contentValues.put("val", str2);
        this.f1566.beginTransaction();
        this.f1566.replace("settings", null, contentValues);
        this.f1566.setTransactionSuccessful();
        this.f1566.endTransaction();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m659(String str, String[] strArr, int i, tz tzVar) {
        StringBuilder sb = null;
        String[] strArr2 = null;
        int i2 = 500 / i;
        int length = strArr.length / i;
        int iMin = -1;
        int i3 = 0;
        if (tzVar != null) {
            tzVar.m1101(0L, length);
        }
        if (strArr.length % i != 0) {
            throw new IllegalArgumentException("values.length(" + strArr.length + ") % nCols(" + i + ") != 0");
        }
        String str2 = "(?";
        for (int i4 = 0; i4 < i - 1; i4++) {
            str2 = String.valueOf(str2) + ",?";
        }
        String str3 = String.valueOf(str2) + ")";
        for (int i5 = 0; i5 < length; i5++) {
            if (i3 == 0) {
                iMin = Math.min(i2, length - i5);
                strArr2 = new String[iMin * i];
                sb = new StringBuilder();
            } else {
                sb.append(',');
            }
            sb.append(str3);
            for (int i6 = 0; i6 < i; i6++) {
                strArr2[(i * i3) + i6] = strArr[(i * i5) + i6];
            }
            i3++;
            if (i3 == iMin) {
                this.f1566.execSQL(String.valueOf(str) + sb.toString(), strArr2);
                i3 = 0;
                if (tzVar != null) {
                    tzVar.m1101(i5 + 1, length);
                }
            } else if (i5 == length - 1) {
                throw new nv("Final query not executed!!!!");
            }
        }
    }

    /* renamed from: ˮ͈, reason: contains not printable characters */
    final void m647() {
        boolean z = oc.f3239;
        String strM655 = m655("hires_textures", 0);
        String str = strM655 == null ? null : strM655;
        oc.f3239 = str == null ? z : Boolean.parseBoolean(str);
        boolean z2 = oc.f3241;
        String strM6552 = m655("use_colormap", 0);
        String str2 = strM6552 == null ? null : strM6552;
        oc.f3241 = str2 == null ? z2 : Boolean.parseBoolean(str2);
        boolean z3 = oc.f3231;
        String strM6553 = m655("interpolate", 0);
        String str3 = strM6553 == null ? null : strM6553;
        oc.f3231 = str3 == null ? z3 : Boolean.parseBoolean(str3);
        String str4 = C0052.f1568;
        String str5 = oc.f3245;
        String strM6554 = m655(str4, 0);
        oc.f3245 = strM6554 == null ? str5 : strM6554;
        oc.f3242 = m648("screen_orientation", oc.f3242);
        C0358.f6674.setRequestedOrientation(oc.f3242);
        oc.f3243 = m648("noshift_enemy", 0) > 0;
        oc.f3246 = m648("noshift_friend", 0) > 0;
        String str6 = oc.f3236;
        String strM6555 = m655("party_wis_prefix", 0);
        oc.f3236 = strM6555 == null ? str6 : strM6555;
        String str7 = oc.f3237;
        String strM6556 = m655("guild_wis_prefix", 0);
        oc.f3237 = strM6556 == null ? str7 : strM6556;
        C0358.f6674.f42.f1792.m1428();
        boolean z4 = oc.f3232;
        String strM6557 = m655("monsterhp", 0);
        String str8 = strM6557 == null ? null : strM6557;
        oc.f3232 = str8 == null ? z4 : Boolean.parseBoolean(str8);
        boolean z5 = oc.f3238;
        String strM6558 = m655("enable_land_effects", 0);
        String str9 = strM6558 == null ? null : strM6558;
        oc.f3238 = str9 == null ? z5 : Boolean.parseBoolean(str9);
        boolean z6 = oc.f3248;
        String strM6559 = m655("is_userai", 0);
        String str10 = strM6559 == null ? null : strM6559;
        oc.f3248 = str10 == null ? z6 : Boolean.parseBoolean(str10);
    }

    /* renamed from: ȃ, reason: contains not printable characters */
    public final void m645() {
        m658("hires_textures", 0, String.valueOf(oc.f3239));
        m658("use_colormap", 0, String.valueOf(oc.f3241));
        m658("interpolate", 0, String.valueOf(oc.f3231));
        m658(C0052.f1568, 0, oc.f3245);
        m658("screen_orientation", 0, String.valueOf(oc.f3242));
        m658("monsterhp", 0, String.valueOf(oc.f3232));
        m658("is_userai", 0, String.valueOf(oc.f3248));
    }
}
