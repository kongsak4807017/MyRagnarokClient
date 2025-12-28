package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SM;
import org.apache.http.cookie.SetCookie;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException, NumberFormatException {
        Args.notNull(setCookie, SM.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for 'max-age' attribute");
        }
        try {
            int i = Integer.parseInt(str);
            if (i < 0) {
                throw new MalformedCookieException("Negative 'max-age' attribute: " + str);
            }
            setCookie.setExpiryDate(new Date(System.currentTimeMillis() + (i * 1000)));
        } catch (NumberFormatException unused) {
            throw new MalformedCookieException("Invalid 'max-age' attribute: " + str);
        }
    }

    @Override // org.apache.http.cookie.CommonCookieAttributeHandler
    public String getAttributeName() {
        return ClientCookie.MAX_AGE_ATTR;
    }
}
