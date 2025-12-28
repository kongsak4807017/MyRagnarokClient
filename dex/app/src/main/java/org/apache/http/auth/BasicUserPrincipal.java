package org.apache.http.auth;

import java.io.Serializable;
import java.security.Principal;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class BasicUserPrincipal implements Serializable, Principal {
    private static final long serialVersionUID = -2266305184969850467L;
    private final String username;

    public BasicUserPrincipal(String str) {
        Args.notNull(str, "User name");
        this.username = str;
    }

    @Override // java.security.Principal
    public final String getName() {
        return this.username;
    }

    @Override // java.security.Principal
    public final int hashCode() {
        return LangUtils.hashCode(17, this.username);
    }

    @Override // java.security.Principal
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BasicUserPrincipal) && LangUtils.equals(this.username, ((BasicUserPrincipal) obj).username)) {
            return true;
        }
        return false;
    }

    @Override // java.security.Principal
    public final String toString() {
        return "[principal: " + this.username + "]";
    }
}
