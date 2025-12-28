package o;

import android.os.RemoteException;

/* renamed from: o.ậ, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0485 extends Exception {

    /* renamed from: 鷭, reason: contains not printable characters */
    C0378 f6946;

    private C0485(C0378 c0378) {
        this(c0378, (RemoteException) null);
    }

    public C0485(int i, String str) {
        this(new C0378(i, str));
    }

    private C0485(C0378 c0378, RemoteException remoteException) {
        super(c0378.f6732, remoteException);
        this.f6946 = c0378;
    }

    public C0485(int i, String str, RemoteException remoteException) {
        this(new C0378(-1001, str), remoteException);
    }
}
