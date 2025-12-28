package org.apache.http.impl.cookie;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.SM;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicPathHandler implements CommonCookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) {
        Args.notNull(setCookie, SM.COOKIE);
        setCookie.setPath(!TextUtils.isBlank(str) ? str : "/");
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) {
    }

    static boolean pathMatch(String str, String str2) {
        if (str2 == null) {
            str2 = "/";
        }
        if (str2.length() > 1 && str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        if (str.startsWith(str2)) {
            if (str2.equals("/") || str.length() == str2.length() || str.charAt(str2.length()) == '/') {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        Args.notNull(cookie, SM.COOKIE);
        Args.notNull(cookieOrigin, "Cookie origin");
        return pathMatch(cookieOrigin.getPath(), cookie.getPath());
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.PATH_ATTR;
    }
}
