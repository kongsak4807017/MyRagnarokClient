package o;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class uw extends ux {

    /* renamed from: 鷭, reason: contains not printable characters */
    public String f5347;

    public uw(Exception exc, String str, String str2) {
        super(String.valueOf(str2 == null ? "Resource not found" : str2) + ": " + str);
        this.f5347 = str;
        if (exc != null) {
            initCause(exc);
        }
    }
}
