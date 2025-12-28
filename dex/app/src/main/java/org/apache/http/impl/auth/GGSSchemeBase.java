package org.apache.http.impl.auth;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.KerberosCredentials;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.message.BufferedHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.ietf.jgss.GSSContext;
import org.ietf.jgss.GSSCredential;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSManager;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public abstract class GGSSchemeBase extends AuthSchemeBase {
    private final Base64 base64codec;
    private final Log log;
    private State state;
    private final boolean stripPort;
    private byte[] token;
    private final boolean useCanonicalHostname;

    enum State {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        TOKEN_GENERATED,
        FAILED
    }

    GGSSchemeBase(boolean z, boolean z2) {
        this.log = LogFactory.getLog(getClass());
        this.base64codec = new Base64(0);
        this.stripPort = z;
        this.useCanonicalHostname = z2;
        this.state = State.UNINITIATED;
    }

    GGSSchemeBase(boolean z) {
        this(z, true);
    }

    GGSSchemeBase() {
        this(true, true);
    }

    protected GSSManager getManager() {
        return GSSManager.getInstance();
    }

    protected byte[] generateGSSToken(byte[] bArr, Oid oid, String str) {
        return generateGSSToken(bArr, oid, str, null);
    }

    protected byte[] generateGSSToken(byte[] bArr, Oid oid, String str, Credentials credentials) {
        GSSCredential gSSCredential;
        GSSManager manager = getManager();
        GSSName gSSNameCreateName = manager.createName("HTTP@" + str, GSSName.NT_HOSTBASED_SERVICE);
        if (credentials instanceof KerberosCredentials) {
            gSSCredential = ((KerberosCredentials) credentials).getGSSCredential();
        } else {
            gSSCredential = null;
        }
        GSSContext gSSContextCreateGSSContext = createGSSContext(manager, oid, gSSNameCreateName, gSSCredential);
        if (bArr != null) {
            return gSSContextCreateGSSContext.initSecContext(bArr, 0, bArr.length);
        }
        return gSSContextCreateGSSContext.initSecContext(new byte[0], 0, 0);
    }

    GSSContext createGSSContext(GSSManager gSSManager, Oid oid, GSSName gSSName, GSSCredential gSSCredential) {
        GSSContext gSSContextCreateContext = gSSManager.createContext(gSSName.canonicalize(oid), oid, gSSCredential, 0);
        gSSContextCreateContext.requestMutualAuth(true);
        return gSSContextCreateContext;
    }

    @Deprecated
    protected byte[] generateToken(byte[] bArr, String str) {
        return null;
    }

    protected byte[] generateToken(byte[] bArr, String str, Credentials credentials) {
        return generateToken(bArr, str);
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isComplete() {
        return this.state == State.TOKEN_GENERATED || this.state == State.FAILED;
    }

    @Override // org.apache.http.auth.AuthScheme
    @Deprecated
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, null);
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) throws AuthenticationException {
        HttpHost targetHost;
        Args.notNull(httpRequest, "HTTP request");
        switch (this.state) {
            case UNINITIATED:
                throw new AuthenticationException(getSchemeName() + " authentication has not been initiated");
            case FAILED:
                throw new AuthenticationException(getSchemeName() + " authentication has failed");
            case CHALLENGE_RECEIVED:
                try {
                    HttpRoute httpRoute = (HttpRoute) httpContext.getAttribute("http.route");
                    if (httpRoute == null) {
                        throw new AuthenticationException("Connection route is not available");
                    }
                    if (!isProxy() || (targetHost = httpRoute.getProxyHost()) == null) {
                        targetHost = httpRoute.getTargetHost();
                    }
                    String hostName = targetHost.getHostName();
                    if (this.useCanonicalHostname) {
                        try {
                            hostName = resolveCanonicalHostname(hostName);
                        } catch (UnknownHostException unused) {
                        }
                    }
                    if (!this.stripPort) {
                        hostName = hostName + ":" + targetHost.getPort();
                    }
                    if (this.log.isDebugEnabled()) {
                        this.log.debug("init " + hostName);
                    }
                    this.token = generateToken(this.token, hostName, credentials);
                    this.state = State.TOKEN_GENERATED;
                    break;
                } catch (GSSException e) {
                    this.state = State.FAILED;
                    if (e.getMajor() == 9 || e.getMajor() == 8) {
                        throw new InvalidCredentialsException(e.getMessage(), e);
                    }
                    if (e.getMajor() == 13) {
                        throw new InvalidCredentialsException(e.getMessage(), e);
                    }
                    if (e.getMajor() == 10 || e.getMajor() == 19 || e.getMajor() == 20) {
                        throw new AuthenticationException(e.getMessage(), e);
                    }
                    throw new AuthenticationException(e.getMessage());
                }
                break;
            case TOKEN_GENERATED:
                break;
            default:
                throw new IllegalStateException("Illegal state: " + this.state);
        }
        String str = new String(this.base64codec.encode(this.token));
        if (this.log.isDebugEnabled()) {
            this.log.debug("Sending response '" + str + "' back to the auth server");
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        if (isProxy()) {
            charArrayBuffer.append("Proxy-Authorization");
        } else {
            charArrayBuffer.append("Authorization");
        }
        charArrayBuffer.append(": Negotiate ");
        charArrayBuffer.append(str);
        return new BufferedHeader(charArrayBuffer);
    }

    @Override // org.apache.http.impl.auth.AuthSchemeBase
    protected void parseChallenge(CharArrayBuffer charArrayBuffer, int i, int i2) {
        String strSubstringTrimmed = charArrayBuffer.substringTrimmed(i, i2);
        if (this.log.isDebugEnabled()) {
            this.log.debug("Received challenge '" + strSubstringTrimmed + "' from the auth server");
        }
        if (this.state == State.UNINITIATED) {
            this.token = Base64.decodeBase64(strSubstringTrimmed.getBytes());
            this.state = State.CHALLENGE_RECEIVED;
        } else {
            this.log.debug("Authentication already attempted");
            this.state = State.FAILED;
        }
    }

    private String resolveCanonicalHostname(String str) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName(str);
        String canonicalHostName = byName.getCanonicalHostName();
        if (byName.getHostAddress().contentEquals(canonicalHostName)) {
            return str;
        }
        return canonicalHostName;
    }
}
