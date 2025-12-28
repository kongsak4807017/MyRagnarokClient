package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class adv {
    /* renamed from: 鷭, reason: contains not printable characters */
    public static int m362(File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            fileInputStream = fileInputStream2;
            int iM363 = m363(fileInputStream2);
            fileInputStream.close();
            return iM363;
        } catch (Throwable th) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static int m360(Context context, Uri uri) throws IOException {
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            inputStream = inputStreamOpenInputStream;
            return m363(inputStreamOpenInputStream);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    private static int m363(InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return (options.outWidth == -1 || options.outHeight == -1 || ((float) options.outWidth) / ((float) options.outHeight) <= 1.0f) ? 0 : 1;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static Bitmap m364(File file, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = m361(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static int m361(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
        }
        return i5;
    }
}
