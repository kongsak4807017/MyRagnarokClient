package o;

import android.database.Cursor;
import android.database.SQLException;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.http.message.TokenParser;

/* renamed from: o.鼮, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class C0960 extends AbstractC0456 {

    /* renamed from: Ą, reason: contains not printable characters */
    hw f8269;

    /* renamed from: ą, reason: contains not printable characters */
    SparseArray<String> f8270;

    /* renamed from: Ć, reason: contains not printable characters */
    private final boolean f8271;

    /* renamed from: ȃ, reason: contains not printable characters */
    HashMap<String, ug> f8272;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    HashSet<String> f8273;

    /* renamed from: 櫯, reason: contains not printable characters */
    boolean f8274;

    C0960(hw hwVar, String[] strArr) throws SQLException {
        super(strArr);
        this.f8274 = false;
        this.f8273 = new HashSet<>();
        this.f8272 = new HashMap<>();
        this.f8271 = false;
        this.f8269 = hwVar;
        this.f8269.f1566.execSQL("CREATE TABLE IF NOT EXISTS \"grf_content_v2\" (\"id\"  INTEGER NOT NULL,\"grf_id\"  INTEGER NOT NULL,\"srclen\"  INTEGER NOT NULL,\"srclen_aligned\"  INTEGER NOT NULL,\"declen\"  INTEGER NOT NULL,\"srcpos\"  INTEGER NOT NULL,\"cycle\"  INTEGER NOT NULL,\"type\"  INTEGER NOT NULL,\"fn_str\"  TEXT NOT NULL COLLATE NOCASE,PRIMARY KEY (\"grf_id\", \"fn_str\"))");
        this.f8269.f1566.execSQL("CREATE INDEX IF NOT EXISTS \"\" ON \"grf_content_v2\" (\"fn_str\" ASC);");
        if (m1551(strArr)) {
            m1550(strArr);
            return;
        }
        this.f8269.f1566.beginTransaction();
        this.f8269.m661(false, (String[]) null);
        this.f8269.f1566.delete("grf_content_v2", null, null);
        this.f8269.f1566.setTransactionSuccessful();
        this.f8269.f1566.endTransaction();
    }

    @Override // o.AbstractC0456
    /* renamed from: 鷭 */
    final String[] mo1346() {
        int i = 0;
        String[] strArr = new String[this.f6904.length];
        for (int i2 = 0; i2 < this.f6904.length; i2++) {
            File file = new File(oc.f3240, this.f6904[i2]);
            if (-1 == this.f8269.m652(this.f6904[i2], file.exists() ? (int) file.length() : 0, file.exists() ? (int) file.lastModified() : 0, (String) null)) {
                int i3 = i;
                i++;
                strArr[i3] = this.f6904[i2];
            }
        }
        return (String[]) Arrays.copyOf(strArr, i);
    }

    @Override // o.AbstractC0456
    /* renamed from: 鷭 */
    final void mo1345(String str, ug[] ugVarArr, ct ctVar) {
        int i;
        if (this.f8274) {
            Log.e("AndRO", "Invalid operation: cache() on a read-only (prepared) db");
            throw new nv("Invalid operation: cache() on a read-only (prepared) db");
        }
        File file = new File(oc.f3240, str);
        Cursor cursorQuery = this.f8269.f1566.query("file_versions_v3", new String[]{"id"}, " `name` = ?", new String[]{str}, null, null, null);
        if (cursorQuery.getCount() <= 0) {
            cursorQuery.close();
            i = -1;
        } else {
            cursorQuery.moveToFirst();
            int i2 = cursorQuery.getInt(0);
            cursorQuery.close();
            i = i2;
        }
        this.f8269.f1566.beginTransaction();
        this.f8269.f1566.delete("grf_content_v2", "`grf_id` = " + i, null);
        long jM653 = this.f8269.m653(false, i, str, (int) file.length(), (int) file.lastModified(), null);
        if (ugVarArr != null) {
            String[] strArr = new String[ugVarArr.length * 9];
            int i3 = 0;
            for (int i4 = 0; i4 < ugVarArr.length; i4++) {
                ug ugVar = ugVarArr[i4];
                if (ugVar != null) {
                    int i5 = i3;
                    int i6 = i3 + 1;
                    strArr[i5] = String.valueOf(i4);
                    int i7 = i6 + 1;
                    strArr[i6] = String.valueOf(jM653);
                    int i8 = i7 + 1;
                    strArr[i7] = String.valueOf(ugVar.f5133);
                    int i9 = i8 + 1;
                    strArr[i8] = String.valueOf(ugVar.f5132);
                    int i10 = i9 + 1;
                    strArr[i9] = String.valueOf(ugVar.f5131);
                    int i11 = i10 + 1;
                    strArr[i10] = String.valueOf(ugVar.f5130);
                    int i12 = i11 + 1;
                    strArr[i11] = String.valueOf(ugVar.f5126);
                    int i13 = i12 + 1;
                    strArr[i12] = String.valueOf((int) ugVar.f5127);
                    i3 = i13 + 1;
                    strArr[i13] = ugVar.f5128;
                }
            }
            if (i3 != strArr.length) {
                strArr = (String[]) Arrays.copyOf(strArr, i3);
            }
            this.f8269.m659("INSERT OR IGNORE INTO `grf_content_v2` (`id`,`grf_id`,`srclen`,`srclen_aligned`,`declen`,`srcpos`,`cycle`,`type`,`fn_str`) VALUES ", strArr, 9, ctVar);
        }
        this.f8269.f1566.setTransactionSuccessful();
        this.f8269.f1566.endTransaction();
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private boolean m1551(String[] strArr) {
        SparseArray<String> sparseArrayM654 = this.f8269.m654();
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].equals(sparseArrayM654.valueAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // o.AbstractC0456
    /* renamed from: 鷭 */
    final ug mo1344(String str) {
        if (!this.f8274) {
            Log.e("AndRO", "Invalid operation: get() on a non-prepared db");
            throw new nv("Invalid operation: get() on a non-prepared db");
        }
        if (this.f8273.contains(str)) {
            return null;
        }
        String strReplace = str.replace('/', TokenParser.ESCAPE);
        Cursor cursorQuery = this.f8269.f1566.query("grf_content_v2", new String[]{"id", "grf_id", "srclen", "srclen_aligned", "declen", "srcpos", "cycle", "type"}, " `fn_str` = ?", new String[]{strReplace}, null, null, "grf_id", "1");
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return null;
        }
        ug ugVar = new ug();
        int i = cursorQuery.getInt(1);
        String str2 = this.f8270.get(i);
        if (str2 == null) {
            String str3 = "Coudln't convert grf_id " + i + " to grf_name";
            Log.e("AndRO", str3);
            throw new nv(str3);
        }
        ugVar.f5129 = new File(oc.f3240, str2);
        ugVar.f5133 = cursorQuery.getInt(2);
        ugVar.f5132 = cursorQuery.getInt(3);
        ugVar.f5131 = cursorQuery.getInt(4);
        ugVar.f5130 = cursorQuery.getInt(5);
        ugVar.f5126 = cursorQuery.getInt(6);
        ugVar.f5127 = (byte) cursorQuery.getInt(7);
        ugVar.f5128 = strReplace;
        cursorQuery.close();
        return ugVar;
    }

    @Override // o.AbstractC0456
    /* renamed from: 櫯 */
    final void mo1342() {
        if (this.f8274) {
            Log.e("AndRO", "Invalid operation: prepare() on a read_only db");
            throw new nv("Invalid operation: prepare() on a read_only db");
        }
        this.f8274 = true;
        this.f8270 = this.f8269.m654();
        for (int i = 0; i < this.f8270.size(); i++) {
            this.f8270.valueAt(i);
            this.f8270.keyAt(i);
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    private void m1550(String[] strArr) {
        if (strArr.length == 0) {
            Log.e("AndRO", "No used GRF files");
            throw new nv("No used GRF files");
        }
        SparseArray<String> sparseArrayM654 = this.f8269.m654();
        String[] strArr2 = new String[sparseArrayM654.size()];
        sparseArrayM654.size();
        int[] iArr = new int[sparseArrayM654.size()];
        int i = 0;
        for (int i2 = 0; i2 < sparseArrayM654.size(); i2++) {
            int iKeyAt = sparseArrayM654.keyAt(i2);
            String strValueAt = sparseArrayM654.valueAt(i2);
            int i3 = 0;
            while (i3 < strArr.length && !strValueAt.equals(strArr[i3])) {
                i3++;
            }
            if (i3 != strArr.length) {
                strArr2[i] = strArr[i2];
                int i4 = i;
                i++;
                iArr[i4] = iKeyAt;
            }
        }
        this.f8269.m661(true, (String[]) Arrays.copyOf(strArr2, i));
        if (i > 0) {
            StringBuilder sb = new StringBuilder(128);
            String[] strArr3 = new String[i];
            for (int i5 = 0; i5 < i; i5++) {
                if (i5 == 0) {
                    sb.append(" grf_id <> ?");
                } else {
                    sb.append(" AND grf_id <> ?");
                }
                strArr3[i5] = Integer.toString(iArr[i5]);
            }
            this.f8269.f1566.beginTransaction();
            this.f8269.f1566.delete("grf_content_v2", sb.toString(), strArr3);
            this.f8269.f1566.setTransactionSuccessful();
            this.f8269.f1566.endTransaction();
        }
    }

    @Override // o.AbstractC0456
    /* renamed from: 櫯 */
    final void mo1343(String str) {
        this.f8273.add(str);
    }
}
