package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ut extends RuntimeException {

    /* renamed from: 鷭, reason: contains not printable characters */
    public boolean f5346;

    public ut(Exception exc, String str, boolean z) {
        super(str);
        if (exc != null) {
            initCause(exc);
        }
        this.f5346 = z;
    }

    public ut(String str) {
        this(null, str, false);
    }

    public ut(String str, boolean z) {
        this(str);
        this.f5346 = z;
    }

    public ut(Exception exc) {
        super(exc);
    }

    public ut(Exception exc, boolean z) {
        super(exc);
        this.f5346 = true;
    }
}
