package org.apache.http.cookie;

import java.util.Date;
import org.apache.http.annotation.Obsolete;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface SetCookie extends Cookie {
    @Obsolete
    void setComment(String str);

    void setDomain(String str);

    void setExpiryDate(Date date);

    void setPath(String str);

    void setSecure(boolean z);

    void setValue(String str);

    @Obsolete
    void setVersion(int i);
}
