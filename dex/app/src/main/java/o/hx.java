package o;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class hx extends SQLiteOpenHelper {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ hw f1569;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    hx(hw hwVar, c_activity c_activityVar, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(c_activityVar, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f1569 = hwVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }
}
