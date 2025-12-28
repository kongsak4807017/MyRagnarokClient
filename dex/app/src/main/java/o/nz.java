package o;

import android.util.Log;
import com.roworkshop.andro.c_activity;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class nz {

    /* renamed from: ȃ, reason: contains not printable characters */
    static long f3223;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    static long f3224;

    /* renamed from: 櫯, reason: contains not printable characters */
    static int f3225;

    /* renamed from: 鷭, reason: contains not printable characters */
    static c_activity f3226;

    /* renamed from: 鷭, reason: contains not printable characters */
    public static void m907(String str) {
        Log.e("AndRO", String.valueOf("") + str);
        if (C0358.f6676 != null && C0358.f6676.f1081 != null && f3223 < System.currentTimeMillis()) {
            C0358.f6676.f1081.mo454(new C0811(str));
            if (System.currentTimeMillis() - f3224 < 5000) {
                f3225++;
            } else {
                f3225 = 0;
            }
            if (f3225 >= 10) {
                f3223 = System.currentTimeMillis() + 30000;
            }
            f3224 = System.currentTimeMillis();
        }
    }
}
