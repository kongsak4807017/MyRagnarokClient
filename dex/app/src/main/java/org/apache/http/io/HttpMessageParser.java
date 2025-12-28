package org.apache.http.io;

import org.apache.http.HttpMessage;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface HttpMessageParser<T extends HttpMessage> {
    T parse();
}
