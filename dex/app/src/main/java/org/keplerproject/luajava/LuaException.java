package org.keplerproject.luajava;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class LuaException extends Exception {
    private static final long serialVersionUID = 1;

    public LuaException(String str) {
        super(str);
    }

    public LuaException(Exception exc) {
        super(exc.getCause() != null ? exc.getCause() : exc);
    }
}
