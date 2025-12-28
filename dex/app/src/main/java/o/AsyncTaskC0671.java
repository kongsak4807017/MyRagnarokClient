package o;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.roworkshop.andro.c_activity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: o.嫺, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class AsyncTaskC0671 extends AsyncTask<Void, Integer, cr> {

    /* renamed from: ˮ͈, reason: contains not printable characters */
    private final /* synthetic */ ProgressDialog f7583;

    /* renamed from: 櫯, reason: contains not printable characters */
    private final /* synthetic */ File f7584;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ c_activity f7585;

    public AsyncTaskC0671(c_activity c_activityVar, File file, ProgressDialog progressDialog) {
        this.f7585 = c_activityVar;
        this.f7584 = file;
        this.f7583 = progressDialog;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ cr doInBackground(Void... voidArr) {
        Thread.currentThread().setName("AsyncTask: initialize resource filesystem");
        return new cr(this.f7585.f42, C0358.f6687, this.f7584.getAbsolutePath(), new ArrayList(Arrays.asList(cr.m1053(this.f7584, (String) null))), false);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(cr crVar) {
        cr crVar2 = crVar;
        super.onPostExecute(crVar2);
        this.f7583.setProgress(100);
        this.f7583.dismiss();
        try {
            C0358.f6688.f6694 = (byte[]) crVar2.m519("data/clientinfo.xml", false);
            C0358.f6687.m645();
            C0358.f6688.m1313(false);
        } catch (uw e) {
            throw new ut(e);
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onProgressUpdate(Integer... numArr) {
        Integer[] numArr2 = numArr;
        super.onProgressUpdate(numArr2);
        this.f7583.setProgress(numArr2[0].intValue());
    }
}
