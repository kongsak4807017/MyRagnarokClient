package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.roworkshop.ro.natives;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import o.oo;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class od {

    /* renamed from: 鷭, reason: contains not printable characters */
    private static byte[] f3252 = new byte[16384];

    od() {
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static C0406 m919(String str, byte[] bArr) {
        C0406 c0406 = new C0406();
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".tga")) {
            try {
                oo.C0064 c0064M927 = oo.m927(new ByteArrayInputStream(bArr));
                int[] iArr = new int[c0064M927.f3356 * c0064M927.f3353];
                if (c0064M927.f3357 == 32) {
                    for (int i = 0; i < c0064M927.f3353; i++) {
                        for (int i2 = 0; i2 < c0064M927.f3356; i2++) {
                            int i3 = i2 + (c0064M927.f3356 * i);
                            iArr[i2 + (c0064M927.f3356 * ((c0064M927.f3353 - 1) - i))] = oz.m952(c0064M927.f3354[(i3 * 4) + 0], c0064M927.f3354[(i3 * 4) + 1], c0064M927.f3354[(i3 * 4) + 2], c0064M927.f3354[(i3 * 4) + 3]);
                        }
                    }
                } else if (c0064M927.f3357 == 24) {
                    for (int i4 = 0; i4 < c0064M927.f3353; i4++) {
                        for (int i5 = 0; i5 < c0064M927.f3356; i5++) {
                            int i6 = i5 + (c0064M927.f3356 * i4);
                            iArr[i5 + (c0064M927.f3356 * ((c0064M927.f3353 - 1) - i4))] = oz.m952(c0064M927.f3354[(i6 * 3) + 0], c0064M927.f3354[(i6 * 3) + 1], c0064M927.f3354[(i6 * 3) + 2], 255);
                        }
                    }
                } else {
                    String str2 = "Unsupported TGA pixel depth: " + c0064M927.f3357 + " for image " + str;
                    Log.e("AndRO", str2);
                    throw new nv(str2);
                }
                c0406.f6789 = iArr;
                c0406.f6788 = null;
                c0406.f6787.set(c0064M927.f3356, c0064M927.f3353);
                c0406.f6786 = 32;
                return c0406;
            } catch (IOException unused) {
                String str3 = "Wrong file format: " + str;
                Log.e("AndRO", str3);
                throw new nv(str3);
            }
        }
        if (lowerCase.endsWith(".bmp") && oc.f3235) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = false;
            options.inTempStorage = f3252;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int[] iArr2 = new int[options.outWidth * options.outHeight];
            int[] iArr3 = new int[256];
            int iDecodebmp = natives.decodebmp(bArr, iArr2, iArr3);
            if (iDecodebmp >= 0) {
                c0406.f6789 = iArr2;
                if (iDecodebmp == 8) {
                    c0406.f6788 = iArr3;
                }
                c0406.f6787.set(options.outWidth, options.outHeight);
                c0406.f6786 = iDecodebmp;
                return c0406;
            }
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray == null) {
                throw new nv("Failed to decode bmp, error " + iDecodebmp + " filename=" + str + " size=" + bArr.length);
            }
            int[] iArr4 = new int[bitmapDecodeByteArray.getWidth() * bitmapDecodeByteArray.getHeight()];
            bitmapDecodeByteArray.getPixels(iArr4, 0, bitmapDecodeByteArray.getWidth(), 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
            c0406.f6789 = iArr4;
            c0406.f6788 = null;
            c0406.f6787.set(bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
            c0406.f6786 = 32;
            bitmapDecodeByteArray.recycle();
            return c0406;
        }
        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || (lowerCase.endsWith(".bmp") && !oc.f3235)) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inTempStorage = f3252;
            Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
            if (bitmapDecodeByteArray2 == null) {
                throw new nv("Failed to decode bmp, filename=" + str + " size=" + bArr.length);
            }
            int[] iArr5 = new int[bitmapDecodeByteArray2.getWidth() * bitmapDecodeByteArray2.getHeight()];
            bitmapDecodeByteArray2.getPixels(iArr5, 0, bitmapDecodeByteArray2.getWidth(), 0, 0, bitmapDecodeByteArray2.getWidth(), bitmapDecodeByteArray2.getHeight());
            c0406.f6789 = iArr5;
            c0406.f6788 = null;
            c0406.f6787.set(bitmapDecodeByteArray2.getWidth(), bitmapDecodeByteArray2.getHeight());
            c0406.f6786 = 32;
            bitmapDecodeByteArray2.recycle();
            return c0406;
        }
        String str4 = "Unknown texture format for file " + str;
        Log.e("AndRO", str4);
        throw new nv(str4);
    }
}
