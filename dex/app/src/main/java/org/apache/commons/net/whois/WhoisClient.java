package org.apache.commons.net.whois;

import java.io.InputStream;
import org.apache.commons.net.finger.FingerClient;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class WhoisClient extends FingerClient {
    public static final String DEFAULT_HOST = "whois.internic.net";
    public static final int DEFAULT_PORT = 43;

    public WhoisClient() {
        setDefaultPort(43);
    }

    public final String query(String str) {
        return query(false, str);
    }

    public final InputStream getInputStream(String str) {
        return getInputStream(false, str);
    }
}
