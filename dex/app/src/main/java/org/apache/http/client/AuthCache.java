package org.apache.http.client;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScheme;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface AuthCache {
    void clear();

    AuthScheme get(HttpHost httpHost);

    void put(HttpHost httpHost, AuthScheme authScheme);

    void remove(HttpHost httpHost);
}
