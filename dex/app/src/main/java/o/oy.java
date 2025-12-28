package o;

import java.nio.ByteBuffer;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class oy {
    /* renamed from: 鷭, reason: contains not printable characters */
    public static int[] m951(ByteBuffer byteBuffer, int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = byteBuffer.getInt();
        }
        return iArr;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m950(ByteBuffer byteBuffer, short[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = byteBuffer.getShort();
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m949(ByteBuffer byteBuffer, float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = byteBuffer.getFloat();
        }
    }

    /* renamed from: 櫯, reason: contains not printable characters */
    public static float[] m948(ByteBuffer byteBuffer, int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = byteBuffer.getFloat();
        }
        return fArr;
    }
}
