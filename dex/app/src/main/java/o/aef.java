package o;

import android.graphics.Bitmap;
import android.os.AsyncTask;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class aef extends AsyncTask<Void, Void, Bitmap> {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ aee f589;

    aef(aee aeeVar) {
        this.f589 = aeeVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
        return this.f589.m405();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            this.f589.m410(bitmap2, false);
        } else {
            this.f589.m412(false);
        }
    }
}
