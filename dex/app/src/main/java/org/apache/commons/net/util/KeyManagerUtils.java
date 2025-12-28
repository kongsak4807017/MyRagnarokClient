package org.apache.commons.net.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import javax.net.ssl.KeyManager;
import javax.net.ssl.X509ExtendedKeyManager;
import org.apache.commons.net.io.Util;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class KeyManagerUtils {
    private static final String DEFAULT_STORE_TYPE = KeyStore.getDefaultType();

    private KeyManagerUtils() {
    }

    public static KeyManager createClientKeyManager(KeyStore keyStore, String str, String str2) {
        return new X509KeyManager(new ClientKeyStore(keyStore, str != null ? str : findAlias(keyStore), str2));
    }

    public static KeyManager createClientKeyManager(String str, File file, String str2, String str3, String str4) {
        return createClientKeyManager(loadStore(str, file, str2), str3, str4);
    }

    public static KeyManager createClientKeyManager(File file, String str, String str2) {
        return createClientKeyManager(DEFAULT_STORE_TYPE, file, str, str2, str);
    }

    public static KeyManager createClientKeyManager(File file, String str) {
        return createClientKeyManager(DEFAULT_STORE_TYPE, file, str, null, str);
    }

    private static KeyStore loadStore(String str, File file, String str2) throws IOException, KeyStoreException {
        KeyStore keyStore = KeyStore.getInstance(str);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            keyStore.load(fileInputStream, str2.toCharArray());
            return keyStore;
        } finally {
            Util.closeQuietly(fileInputStream);
        }
    }

    private static String findAlias(KeyStore keyStore) throws KeyStoreException {
        Enumeration<String> enumerationAliases = keyStore.aliases();
        while (enumerationAliases.hasMoreElements()) {
            String strNextElement = enumerationAliases.nextElement();
            if (keyStore.isKeyEntry(strNextElement)) {
                return strNextElement;
            }
        }
        throw new KeyStoreException("Cannot find a private key entry");
    }

    static class ClientKeyStore {
        private final X509Certificate[] certChain;
        private final PrivateKey key;
        private final String keyAlias;

        ClientKeyStore(KeyStore keyStore, String str, String str2) throws KeyStoreException {
            this.keyAlias = str;
            this.key = (PrivateKey) keyStore.getKey(this.keyAlias, str2.toCharArray());
            Certificate[] certificateChain = keyStore.getCertificateChain(this.keyAlias);
            X509Certificate[] x509CertificateArr = new X509Certificate[certificateChain.length];
            for (int i = 0; i < certificateChain.length; i++) {
                x509CertificateArr[i] = (X509Certificate) certificateChain[i];
            }
            this.certChain = x509CertificateArr;
        }

        final X509Certificate[] getCertificateChain() {
            return this.certChain;
        }

        final PrivateKey getPrivateKey() {
            return this.key;
        }

        final String getAlias() {
            return this.keyAlias;
        }
    }

    static class X509KeyManager extends X509ExtendedKeyManager {
        private final ClientKeyStore keyStore;

        X509KeyManager(ClientKeyStore clientKeyStore) {
            this.keyStore = clientKeyStore;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
            return this.keyStore.getAlias();
        }

        @Override // javax.net.ssl.X509KeyManager
        public X509Certificate[] getCertificateChain(String str) {
            return this.keyStore.getCertificateChain();
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getClientAliases(String str, Principal[] principalArr) {
            return new String[]{this.keyStore.getAlias()};
        }

        @Override // javax.net.ssl.X509KeyManager
        public PrivateKey getPrivateKey(String str) {
            return this.keyStore.getPrivateKey();
        }

        @Override // javax.net.ssl.X509KeyManager
        public String[] getServerAliases(String str, Principal[] principalArr) {
            return null;
        }

        @Override // javax.net.ssl.X509KeyManager
        public String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
            return null;
        }
    }
}
