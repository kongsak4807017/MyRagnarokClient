package o;

import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class ux extends RuntimeException {
    public ux(Exception exc) {
        super(exc);
    }

    protected ux(String str, IOException iOException) {
        super(str, iOException);
    }

    public ux(String str) {
        super(str);
    }

    public ux() {
    }
}
