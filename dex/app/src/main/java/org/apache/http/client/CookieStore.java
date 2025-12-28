package org.apache.http.client;

import java.util.Date;
import java.util.List;
import org.apache.http.cookie.Cookie;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface CookieStore {
    void addCookie(Cookie cookie);

    void clear();

    boolean clearExpired(Date date);

    List<Cookie> getCookies();
}
