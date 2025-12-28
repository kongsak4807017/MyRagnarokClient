package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class aek extends AsyncTask<Object, Void, Bitmap> {

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ aej f600;

    aek(aej aejVar) {
        this.f600 = aejVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Bitmap doInBackground(Object[] objArr) {
        return m416(objArr);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            this.f600.setImageBitmap(bitmap2);
        }
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        this.f600.setAdjustViewBounds(true);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static Bitmap m416(Object... objArr) {
        Context context = (Context) objArr[0];
        try {
            return aej.m415(context.getContentResolver(), (Uri) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
        } catch (IOException e) {
            if (adt.f529 <= 6) {
                Log.e("HockeyApp", "Could not load image into ImageView.", e);
                return null;
            }
            return null;
        }
    }
}
