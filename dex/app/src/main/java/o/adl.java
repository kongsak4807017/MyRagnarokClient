package o;

import android.app.Activity;
import java.io.IOException;
import java.net.URL;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adl extends adi {

    /* renamed from: Ć, reason: contains not printable characters */
    public long f490;

    @Override // o.adi, android.os.AsyncTask
    protected final /* synthetic */ Long doInBackground(Void[] voidArr) {
        return mo340();
    }

    @Override // o.adi, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
    }

    public adl(Activity activity, String str, acp acpVar) {
        super(activity, str, acpVar);
    }

    @Override // o.adi
    /* renamed from: 櫯 */
    protected final Long mo340() {
        try {
            return Long.valueOf(m338(new URL(m339()), 6).getContentLength());
        } catch (IOException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.adi
    /* renamed from: 鷭 */
    public final void onProgressUpdate(Integer... numArr) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.adi, android.os.AsyncTask
    /* renamed from: 鷭 */
    public final void onPostExecute(Long l) {
        this.f490 = l.longValue();
        if (this.f490 > 0) {
            this.f486.mo307(this);
        } else {
            this.f486.mo308((Boolean) false);
        }
    }
}
