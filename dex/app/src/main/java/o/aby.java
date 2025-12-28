package o;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import net.hockeyapp.android.PaintActivity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class aby extends AsyncTask<File, Void, Void> {

    /* renamed from: 櫯, reason: contains not printable characters */
    final /* synthetic */ PaintActivity f369;

    /* renamed from: 鷭, reason: contains not printable characters */
    final /* synthetic */ Bitmap f370;

    public aby(PaintActivity paintActivity, Bitmap bitmap) {
        this.f369 = paintActivity;
        this.f370 = bitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: 鷭, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Void doInBackground(File... fileArr) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileArr[0]);
            this.f370.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            if (adt.f529 <= 6) {
                Log.e("HockeyApp", "Could not save image.", e);
                return null;
            }
            return null;
        }
    }
}
