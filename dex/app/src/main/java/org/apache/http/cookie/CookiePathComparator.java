package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class CookiePathComparator implements Serializable, Comparator<Cookie> {
    public static final CookiePathComparator INSTANCE = new CookiePathComparator();
    private static final long serialVersionUID = 7523645369616405818L;

    private String normalizePath(Cookie cookie) {
        String path = cookie.getPath();
        if (path == null) {
            path = "/";
        }
        if (!path.endsWith("/")) {
            return path + '/';
        }
        return path;
    }

    @Override // java.util.Comparator
    public int compare(Cookie cookie, Cookie cookie2) {
        String strNormalizePath = normalizePath(cookie);
        String strNormalizePath2 = normalizePath(cookie2);
        if (strNormalizePath.equals(strNormalizePath2)) {
            return 0;
        }
        if (strNormalizePath.startsWith(strNormalizePath2)) {
            return -1;
        }
        if (strNormalizePath2.startsWith(strNormalizePath)) {
            return 1;
        }
        return 0;
    }
}
