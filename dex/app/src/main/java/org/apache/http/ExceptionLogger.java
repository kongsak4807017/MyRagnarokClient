package org.apache.http;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface ExceptionLogger {
    public static final ExceptionLogger NO_OP = new ExceptionLogger() { // from class: org.apache.http.ExceptionLogger.1
        @Override // org.apache.http.ExceptionLogger
        public final void log(Exception exc) {
        }
    };
    public static final ExceptionLogger STD_ERR = new ExceptionLogger() { // from class: org.apache.http.ExceptionLogger.2
        @Override // org.apache.http.ExceptionLogger
        public final void log(Exception exc) {
            exc.printStackTrace();
        }
    };

    void log(Exception exc);
}
