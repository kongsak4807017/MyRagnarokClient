package o;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class kh implements Runnable {

    /* renamed from: 鷭, reason: contains not printable characters */
    private final /* synthetic */ String f1896;

    kh(String str) {
        this.f1896 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Bitmap bitmapM537 = C0358.f6685.m537();
        if (bitmapM537 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f1896);
            bitmapM537.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
            fileOutputStream.close();
        } catch (IOException unused) {
        }
    }
}
