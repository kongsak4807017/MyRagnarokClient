package org.apache.http.impl.auth;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public interface NTLMEngine {
    String generateType1Msg(String str, String str2);

    String generateType3Msg(String str, String str2, String str3, String str4, String str5);
}
