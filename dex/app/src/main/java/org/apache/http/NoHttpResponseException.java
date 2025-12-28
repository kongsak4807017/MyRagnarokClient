package org.apache.http;

import java.io.IOException;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class NoHttpResponseException extends IOException {
    private static final long serialVersionUID = -7658940387386078766L;

    public NoHttpResponseException(String str) {
        super(HttpException.clean(str));
    }
}
