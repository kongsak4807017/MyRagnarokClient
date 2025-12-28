package android.support.v4.os;

import android.os.Trace;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
class TraceJellybeanMR2 {
    TraceJellybeanMR2() {
    }

    public static void beginSection(String str) {
        Trace.beginSection(str);
    }

    public static void endSection() {
        Trace.endSection();
    }
}
