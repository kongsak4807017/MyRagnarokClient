package org.apache.http.impl.auth;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.ietf.jgss.GSSException;
import org.ietf.jgss.Oid;

@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class NegotiateScheme extends GGSSchemeBase {
    private static final String KERBEROS_OID = "1.2.840.113554.1.2.2";
    private static final String SPNEGO_OID = "1.3.6.1.5.5.2";
    private final Log log;
    private final SpnegoTokenGenerator spengoGenerator;

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator, boolean z) {
        super(z);
        this.log = LogFactory.getLog(getClass());
        this.spengoGenerator = spnegoTokenGenerator;
    }

    public NegotiateScheme(SpnegoTokenGenerator spnegoTokenGenerator) {
        this(spnegoTokenGenerator, false);
    }

    public NegotiateScheme() {
        this(null, false);
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getSchemeName() {
        return "Negotiate";
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase, org.apache.http.auth.AuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        return authenticate(credentials, httpRequest, null);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase, org.apache.http.impl.auth.AuthSchemeBase, org.apache.http.auth.ContextAwareAuthScheme
    public Header authenticate(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext) {
        return super.authenticate(credentials, httpRequest, httpContext);
    }

    @Override // org.apache.http.impl.auth.GGSSchemeBase
    protected byte[] generateToken(byte[] bArr, String str) {
        return super.generateToken(bArr, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.ietf.jgss.GSSException */
    @Override // org.apache.http.impl.auth.GGSSchemeBase
    protected byte[] generateToken(byte[] bArr, String str, Credentials credentials) throws GSSException {
        boolean z = false;
        try {
            bArr = generateGSSToken(bArr, new Oid(SPNEGO_OID), str, credentials);
        } catch (GSSException e) {
            if (e.getMajor() == 2) {
                this.log.debug("GSSException BAD_MECH, retry with Kerberos MECH");
                z = true;
            } else {
                throw e;
            }
        }
        if (z) {
            this.log.debug("Using Kerberos MECH 1.2.840.113554.1.2.2");
            byte[] bArrGenerateGSSToken = generateGSSToken(bArr, new Oid(KERBEROS_OID), str, credentials);
            if (bArrGenerateGSSToken != null && this.spengoGenerator != null) {
                try {
                    return this.spengoGenerator.generateSpnegoDERObject(bArrGenerateGSSToken);
                } catch (IOException e2) {
                    this.log.error(e2.getMessage(), e2);
                    return bArrGenerateGSSToken;
                }
            }
            return bArrGenerateGSSToken;
        }
        return bArr;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getParameter(String str) {
        Args.notNull(str, "Parameter name");
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public String getRealm() {
        return null;
    }

    @Override // org.apache.http.auth.AuthScheme
    public boolean isConnectionBased() {
        return true;
    }
}
