package org.apache.http.impl.conn;

import java.net.InetAddress;
import org.apache.http.conn.DnsResolver;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class SystemDefaultDnsResolver implements DnsResolver {
    public static final SystemDefaultDnsResolver INSTANCE = new SystemDefaultDnsResolver();

    @Override // org.apache.http.conn.DnsResolver
    public InetAddress[] resolve(String str) {
        return InetAddress.getAllByName(str);
    }
}
