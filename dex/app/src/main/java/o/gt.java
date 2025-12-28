package o;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class gt implements Cloneable {

    /* renamed from: Ą, reason: contains not printable characters */
    int f1404;

    /* renamed from: ą, reason: contains not printable characters */
    boolean f1405;

    /* renamed from: ȃ, reason: contains not printable characters */
    int f1406;

    /* renamed from: ˮ͈, reason: contains not printable characters */
    int f1407;

    /* renamed from: 櫯, reason: contains not printable characters */
    int f1408;

    /* renamed from: 鷭, reason: contains not printable characters */
    int f1409;

    gt() {
    }

    gt(int i, int i2, int i3, int i4, int i5, boolean z) {
        m611(i, i2, i3, i4, i5, z);
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final void m611(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.f1409 = i;
        this.f1408 = i2;
        this.f1407 = i3;
        this.f1406 = i4;
        this.f1404 = i5;
        this.f1405 = z;
    }

    gt(yk ykVar) {
        this.f1409 = ykVar.f5966;
        this.f1408 = ykVar.f5965;
        this.f1407 = ykVar.f5963;
        this.f1406 = ykVar.f5959;
        this.f1404 = ykVar.f5960;
        this.f1405 = ykVar.f5962 != 0;
    }

    gt(bk bkVar) {
        this.f1409 = bkVar.f838;
        this.f1408 = bkVar.f837;
        this.f1407 = bkVar.f835;
        this.f1406 = bkVar.f831;
        this.f1404 = bkVar.f832;
        this.f1405 = bkVar.f834 != 0;
    }

    gt(bl blVar) {
        this.f1409 = blVar.f845;
        this.f1408 = blVar.f844;
        this.f1407 = blVar.f843;
        this.f1406 = blVar.f842;
        this.f1404 = blVar.f839;
        this.f1405 = blVar.f841 != 0;
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    final gt m610() {
        try {
            return (gt) clone();
        } catch (CloneNotSupportedException e) {
            Log.e("AndRO", e.toString());
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }
}
