package org.apache.http.conn.ssl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.util.DomainType;
import org.apache.http.conn.util.InetAddressUtils;
import org.apache.http.conn.util.PublicSuffixMatcher;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class DefaultHostnameVerifier implements HostnameVerifier {
    private final Log log;
    private final PublicSuffixMatcher publicSuffixMatcher;

    enum HostNameType {
        IPv4(7),
        IPv6(7),
        DNS(2);

        final int subjectType;

        HostNameType(int i) {
            this.subjectType = i;
        }
    }

    public DefaultHostnameVerifier(PublicSuffixMatcher publicSuffixMatcher) {
        this.log = LogFactory.getLog(getClass());
        this.publicSuffixMatcher = publicSuffixMatcher;
    }

    public DefaultHostnameVerifier() {
        this(null);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) throws CertificateParsingException {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException e) {
            if (this.log.isDebugEnabled()) {
                this.log.debug(e.getMessage(), e);
                return false;
            }
            return false;
        }
    }

    public final void verify(String str, X509Certificate x509Certificate) throws SSLException, CertificateParsingException {
        HostNameType hostNameTypeDetermineHostFormat = determineHostFormat(str);
        List<SubjectName> subjectAltNames = getSubjectAltNames(x509Certificate);
        if (subjectAltNames != null && !subjectAltNames.isEmpty()) {
            switch (hostNameTypeDetermineHostFormat) {
                case IPv4:
                    matchIPAddress(str, subjectAltNames);
                    return;
                case IPv6:
                    matchIPv6Address(str, subjectAltNames);
                    return;
                default:
                    matchDNSName(str, subjectAltNames, this.publicSuffixMatcher);
                    return;
            }
        }
        String strExtractCN = extractCN(x509Certificate.getSubjectX500Principal().getName("RFC2253"));
        if (strExtractCN == null) {
            throw new SSLException("Certificate subject for <" + str + "> doesn't contain a common name and does not have alternative names");
        }
        matchCN(str, strExtractCN, this.publicSuffixMatcher);
    }

    static void matchIPAddress(String str, List<SubjectName> list) throws SSLPeerUnverifiedException {
        for (int i = 0; i < list.size(); i++) {
            SubjectName subjectName = list.get(i);
            if (subjectName.getType() == 7 && str.equals(subjectName.getValue())) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static void matchIPv6Address(String str, List<SubjectName> list) throws SSLPeerUnverifiedException {
        String strNormaliseAddress = normaliseAddress(str);
        for (int i = 0; i < list.size(); i++) {
            SubjectName subjectName = list.get(i);
            if (subjectName.getType() == 7 && strNormaliseAddress.equals(normaliseAddress(subjectName.getValue()))) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static void matchDNSName(String str, List<SubjectName> list, PublicSuffixMatcher publicSuffixMatcher) throws SSLPeerUnverifiedException {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < list.size(); i++) {
            SubjectName subjectName = list.get(i);
            if (subjectName.getType() == 2 && matchIdentityStrict(lowerCase, subjectName.getValue().toLowerCase(Locale.ROOT), publicSuffixMatcher)) {
                return;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match any of the subject alternative names: " + list);
    }

    static void matchCN(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) throws SSLPeerUnverifiedException {
        if (!matchIdentityStrict(str.toLowerCase(Locale.ROOT), str2.toLowerCase(Locale.ROOT), publicSuffixMatcher)) {
            throw new SSLPeerUnverifiedException("Certificate for <" + str + "> doesn't match common name of the certificate subject: " + str2);
        }
    }

    static boolean matchDomainRoot(String str, String str2) {
        if (str2 != null && str.endsWith(str2)) {
            return str.length() == str2.length() || str.charAt((str.length() - str2.length()) + (-1)) == '.';
        }
        return false;
    }

    private static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher, boolean z) {
        if (publicSuffixMatcher != null && str.contains(".") && !matchDomainRoot(str, publicSuffixMatcher.getDomainRoot(str2, DomainType.ICANN))) {
            return false;
        }
        int iIndexOf = str2.indexOf(42);
        if (iIndexOf != -1) {
            String strSubstring = str2.substring(0, iIndexOf);
            String strSubstring2 = str2.substring(iIndexOf + 1);
            if (!strSubstring.isEmpty() && !str.startsWith(strSubstring)) {
                return false;
            }
            if (!strSubstring2.isEmpty() && !str.endsWith(strSubstring2)) {
                return false;
            }
            if (z && str.substring(strSubstring.length(), str.length() - strSubstring2.length()).contains(".")) {
                return false;
            }
            return true;
        }
        return str.equalsIgnoreCase(str2);
    }

    static boolean matchIdentity(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        return matchIdentity(str, str2, publicSuffixMatcher, false);
    }

    static boolean matchIdentity(String str, String str2) {
        return matchIdentity(str, str2, null, false);
    }

    static boolean matchIdentityStrict(String str, String str2, PublicSuffixMatcher publicSuffixMatcher) {
        return matchIdentity(str, str2, publicSuffixMatcher, true);
    }

    static boolean matchIdentityStrict(String str, String str2) {
        return matchIdentity(str, str2, null, true);
    }

    static String extractCN(String str) throws SSLException {
        if (str == null) {
            return null;
        }
        try {
            List rdns = new LdapName(str).getRdns();
            for (int size = rdns.size() - 1; size >= 0; size--) {
                Attribute attribute = ((Rdn) rdns.get(size)).toAttributes().get("cn");
                if (attribute != null) {
                    try {
                        Object obj = attribute.get();
                        if (obj != null) {
                            return obj.toString();
                        }
                        continue;
                    } catch (NamingException unused) {
                        continue;
                    } catch (NoSuchElementException unused2) {
                    }
                }
            }
            return null;
        } catch (InvalidNameException unused3) {
            throw new SSLException(str + " is not a valid X500 distinguished name");
        }
    }

    static HostNameType determineHostFormat(String str) {
        if (InetAddressUtils.isIPv4Address(str)) {
            return HostNameType.IPv4;
        }
        String strSubstring = str;
        if (str.startsWith("[") && strSubstring.endsWith("]")) {
            strSubstring = str.substring(1, str.length() - 1);
        }
        if (InetAddressUtils.isIPv6Address(strSubstring)) {
            return HostNameType.IPv6;
        }
        return HostNameType.DNS;
    }

    static List<SubjectName> getSubjectAltNames(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                Integer num = list.size() >= 2 ? (Integer) list.get(0) : null;
                if (num != null && (num.intValue() == 2 || num.intValue() == 7)) {
                    Object obj = list.get(1);
                    if (obj instanceof String) {
                        arrayList.add(new SubjectName((String) obj, num.intValue()));
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    static String normaliseAddress(String str) {
        if (str == null) {
            return str;
        }
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
            return str;
        }
    }
}
