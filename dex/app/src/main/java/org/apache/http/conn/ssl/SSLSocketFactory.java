package org.apache.http.conn.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.HttpInetSocketAddress;
import org.apache.http.conn.scheme.HostNameResolver;
import org.apache.http.conn.scheme.LayeredSchemeSocketFactory;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.TextUtils;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class SSLSocketFactory implements LayeredSchemeSocketFactory, LayeredSocketFactory, SchemeLayeredSocketFactory, LayeredConnectionSocketFactory {
    public static final String SSL = "SSL";
    public static final String SSLV2 = "SSLv2";
    public static final String TLS = "TLS";
    private volatile X509HostnameVerifier hostnameVerifier;
    private final HostNameResolver nameResolver;
    private final javax.net.ssl.SSLSocketFactory socketfactory;
    private final String[] supportedCipherSuites;
    private final String[] supportedProtocols;
    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new AllowAllHostnameVerifier();
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();

    public static SSLSocketFactory getSocketFactory() {
        return new SSLSocketFactory(SSLContexts.createDefault(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    private static String[] split(String str) {
        if (TextUtils.isBlank(str)) {
            return null;
        }
        return str.split(" *, *");
    }

    public static SSLSocketFactory getSystemSocketFactory() {
        return new SSLSocketFactory((javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault(), split(System.getProperty("https.protocols")), split(System.getProperty("https.cipherSuites")), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, HostNameResolver hostNameResolver) {
        this(SSLContexts.custom().useProtocol(str).setSecureRandom(secureRandom).loadKeyMaterial(keyStore, str2 != null ? str2.toCharArray() : null).loadTrustMaterial(keyStore2).build(), hostNameResolver);
    }

    public SSLSocketFactory(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, TrustStrategy trustStrategy, X509HostnameVerifier x509HostnameVerifier) {
        this(SSLContexts.custom().useProtocol(str).setSecureRandom(secureRandom).loadKeyMaterial(keyStore, str2 != null ? str2.toCharArray() : null).loadTrustMaterial(keyStore2, trustStrategy).build(), x509HostnameVerifier);
    }

    public SSLSocketFactory(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, X509HostnameVerifier x509HostnameVerifier) {
        this(SSLContexts.custom().useProtocol(str).setSecureRandom(secureRandom).loadKeyMaterial(keyStore, str2 != null ? str2.toCharArray() : null).loadTrustMaterial(keyStore2).build(), x509HostnameVerifier);
    }

    public SSLSocketFactory(KeyStore keyStore, String str, KeyStore keyStore2) {
        this(SSLContexts.custom().loadKeyMaterial(keyStore, str != null ? str.toCharArray() : null).loadTrustMaterial(keyStore2).build(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(KeyStore keyStore, String str) {
        this(SSLContexts.custom().loadKeyMaterial(keyStore, str != null ? str.toCharArray() : null).build(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(KeyStore keyStore) {
        this(SSLContexts.custom().loadTrustMaterial(keyStore).build(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(TrustStrategy trustStrategy, X509HostnameVerifier x509HostnameVerifier) {
        this(SSLContexts.custom().loadTrustMaterial(null, trustStrategy).build(), x509HostnameVerifier);
    }

    public SSLSocketFactory(TrustStrategy trustStrategy) {
        this(SSLContexts.custom().loadTrustMaterial(null, trustStrategy).build(), BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(SSLContext sSLContext) {
        this(sSLContext, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(SSLContext sSLContext, HostNameResolver hostNameResolver) {
        this.socketfactory = sSLContext.getSocketFactory();
        this.hostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        this.nameResolver = hostNameResolver;
        this.supportedProtocols = null;
        this.supportedCipherSuites = null;
    }

    public SSLSocketFactory(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    public SSLSocketFactory(SSLContext sSLContext, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this(((SSLContext) Args.notNull(sSLContext, "SSL context")).getSocketFactory(), strArr, strArr2, x509HostnameVerifier);
    }

    public SSLSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        this(sSLSocketFactory, (String[]) null, (String[]) null, x509HostnameVerifier);
    }

    public SSLSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, X509HostnameVerifier x509HostnameVerifier) {
        this.socketfactory = (javax.net.ssl.SSLSocketFactory) Args.notNull(sSLSocketFactory, "SSL socket factory");
        this.supportedProtocols = strArr;
        this.supportedCipherSuites = strArr2;
        this.hostnameVerifier = x509HostnameVerifier != null ? x509HostnameVerifier : BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        this.nameResolver = null;
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket createSocket(HttpParams httpParams) {
        return createSocket((HttpContext) null);
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket createSocket() {
        return createSocket((HttpContext) null);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory
    public Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpParams httpParams) throws SocketException {
        HttpHost httpHost;
        Args.notNull(inetSocketAddress, "Remote address");
        Args.notNull(httpParams, "HTTP parameters");
        if (inetSocketAddress instanceof HttpInetSocketAddress) {
            httpHost = ((HttpInetSocketAddress) inetSocketAddress).getHttpHost();
        } else {
            httpHost = new HttpHost(inetSocketAddress.getHostName(), inetSocketAddress.getPort(), "https");
        }
        int soTimeout = HttpConnectionParams.getSoTimeout(httpParams);
        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
        socket.setSoTimeout(soTimeout);
        return connectSocket(connectionTimeout, socket, httpHost, inetSocketAddress, inetSocketAddress2, (HttpContext) null);
    }

    @Override // org.apache.http.conn.scheme.SchemeSocketFactory, org.apache.http.conn.scheme.SocketFactory
    public boolean isSecure(Socket socket) {
        Args.notNull(socket, "Socket");
        Asserts.check(socket instanceof SSLSocket, "Socket not created by this factory");
        Asserts.check(!socket.isClosed(), "Socket is closed");
        return true;
    }

    @Override // org.apache.http.conn.scheme.SchemeLayeredSocketFactory
    public Socket createLayeredSocket(Socket socket, String str, int i, HttpParams httpParams) {
        return createLayeredSocket(socket, str, i, (HttpContext) null);
    }

    @Override // org.apache.http.conn.scheme.LayeredSchemeSocketFactory
    public Socket createLayeredSocket(Socket socket, String str, int i, boolean z) {
        return createLayeredSocket(socket, str, i, (HttpContext) null);
    }

    public void setHostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        Args.notNull(x509HostnameVerifier, "Hostname verifier");
        this.hostnameVerifier = x509HostnameVerifier;
    }

    public X509HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Override // org.apache.http.conn.scheme.SocketFactory
    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) throws UnknownHostException {
        InetAddress byName;
        if (this.nameResolver != null) {
            byName = this.nameResolver.resolve(str);
        } else {
            byName = InetAddress.getByName(str);
        }
        InetSocketAddress inetSocketAddress = null;
        if (inetAddress != null || i2 > 0) {
            inetSocketAddress = new InetSocketAddress(inetAddress, i2 > 0 ? i2 : 0);
        }
        return connectSocket(socket, new HttpInetSocketAddress(new HttpHost(str, i), byName, i), inetSocketAddress, httpParams);
    }

    @Override // org.apache.http.conn.scheme.LayeredSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return createLayeredSocket(socket, str, i, z);
    }

    protected void prepareSocket(SSLSocket sSLSocket) {
    }

    private void internalPrepareSocket(SSLSocket sSLSocket) {
        if (this.supportedProtocols != null) {
            sSLSocket.setEnabledProtocols(this.supportedProtocols);
        }
        if (this.supportedCipherSuites != null) {
            sSLSocket.setEnabledCipherSuites(this.supportedCipherSuites);
        }
        prepareSocket(sSLSocket);
    }

    @Override // org.apache.http.conn.socket.ConnectionSocketFactory
    public Socket createSocket(HttpContext httpContext) {
        return SocketFactory.getDefault().createSocket();
    }

    @Override // org.apache.http.conn.socket.ConnectionSocketFactory
    public Socket connectSocket(int i, Socket socket, HttpHost httpHost, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, HttpContext httpContext) throws IOException {
        Args.notNull(httpHost, "HTTP host");
        Args.notNull(inetSocketAddress, "Remote address");
        if (socket == null) {
            socket = createSocket(httpContext);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i);
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                sSLSocket.startHandshake();
                verifyHostname(sSLSocket, httpHost.getHostName());
                return socket;
            }
            return createLayeredSocket(socket, httpHost.getHostName(), inetSocketAddress.getPort(), httpContext);
        } catch (IOException e) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    @Override // org.apache.http.conn.socket.LayeredConnectionSocketFactory
    public Socket createLayeredSocket(Socket socket, String str, int i, HttpContext httpContext) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.socketfactory.createSocket(socket, str, i, true);
        internalPrepareSocket(sSLSocket);
        sSLSocket.startHandshake();
        verifyHostname(sSLSocket, str);
        return sSLSocket;
    }

    private void verifyHostname(SSLSocket sSLSocket, String str) throws IOException {
        try {
            this.hostnameVerifier.verify(str, sSLSocket);
        } catch (IOException e) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw e;
        }
    }
}
