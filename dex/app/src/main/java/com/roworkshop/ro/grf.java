package com.roworkshop.ro;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class grf {
    public static native int append(byte[] bArr, byte[] bArr2);

    public static native int delete(byte[] bArr);

    public static native void free();

    public static native int open(String str);

    static {
        System.loadLibrary("grf");
    }
}
