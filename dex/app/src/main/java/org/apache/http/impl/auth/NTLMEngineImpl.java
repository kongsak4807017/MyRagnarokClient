package org.apache.http.impl.auth;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.Consts;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
final class NTLMEngineImpl implements NTLMEngine {
    static final int FLAG_DOMAIN_PRESENT = 4096;
    static final int FLAG_REQUEST_128BIT_KEY_EXCH = 536870912;
    static final int FLAG_REQUEST_56BIT_ENCRYPTION = Integer.MIN_VALUE;
    static final int FLAG_REQUEST_ALWAYS_SIGN = 32768;
    static final int FLAG_REQUEST_EXPLICIT_KEY_EXCH = 1073741824;
    static final int FLAG_REQUEST_LAN_MANAGER_KEY = 128;
    static final int FLAG_REQUEST_NTLM2_SESSION = 524288;
    static final int FLAG_REQUEST_NTLMv1 = 512;
    static final int FLAG_REQUEST_OEM_ENCODING = 2;
    static final int FLAG_REQUEST_SEAL = 32;
    static final int FLAG_REQUEST_SIGN = 16;
    static final int FLAG_REQUEST_TARGET = 4;
    static final int FLAG_REQUEST_UNICODE_ENCODING = 1;
    static final int FLAG_REQUEST_VERSION = 33554432;
    static final int FLAG_TARGETINFO_PRESENT = 8388608;
    static final int FLAG_WORKSTATION_PRESENT = 8192;
    private static final byte[] MAGIC_TLS_SERVER_ENDPOINT;
    static final int MSV_AV_CHANNEL_BINDINGS = 10;
    static final int MSV_AV_DNS_COMPUTER_NAME = 3;
    static final int MSV_AV_DNS_DOMAIN_NAME = 4;
    static final int MSV_AV_DNS_TREE_NAME = 5;
    static final int MSV_AV_EOL = 0;
    static final int MSV_AV_FLAGS = 6;
    static final int MSV_AV_FLAGS_ACCOUNT_AUTH_CONSTAINED = 1;
    static final int MSV_AV_FLAGS_MIC = 2;
    static final int MSV_AV_FLAGS_UNTRUSTED_TARGET_SPN = 4;
    static final int MSV_AV_NB_COMPUTER_NAME = 1;
    static final int MSV_AV_NB_DOMAIN_NAME = 2;
    static final int MSV_AV_SINGLE_HOST = 8;
    static final int MSV_AV_TARGET_NAME = 9;
    static final int MSV_AV_TIMESTAMP = 7;
    private static final SecureRandom RND_GEN;
    private static final byte[] SEAL_MAGIC_CLIENT;
    private static final byte[] SEAL_MAGIC_SERVER;
    private static final byte[] SIGNATURE;
    private static final byte[] SIGN_MAGIC_CLIENT;
    private static final byte[] SIGN_MAGIC_SERVER;
    private static final String TYPE_1_MESSAGE;
    private static final Charset UNICODE_LITTLE_UNMARKED = Charset.forName("UnicodeLittleUnmarked");
    private static final Charset DEFAULT_CHARSET = Consts.ASCII;

    enum Mode {
        CLIENT,
        SERVER
    }

    static {
        SecureRandom secureRandom = null;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
        }
        RND_GEN = secureRandom;
        SIGNATURE = getNullTerminatedAsciiString("NTLMSSP");
        SIGN_MAGIC_SERVER = getNullTerminatedAsciiString("session key to server-to-client signing key magic constant");
        SIGN_MAGIC_CLIENT = getNullTerminatedAsciiString("session key to client-to-server signing key magic constant");
        SEAL_MAGIC_SERVER = getNullTerminatedAsciiString("session key to server-to-client sealing key magic constant");
        SEAL_MAGIC_CLIENT = getNullTerminatedAsciiString("session key to client-to-server sealing key magic constant");
        MAGIC_TLS_SERVER_ENDPOINT = "tls-server-end-point:".getBytes(Consts.ASCII);
        TYPE_1_MESSAGE = new Type1Message().getResponse();
    }

    private static byte[] getNullTerminatedAsciiString(String str) {
        byte[] bytes = str.getBytes(Consts.ASCII);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
        return bArr;
    }

    NTLMEngineImpl() {
    }

    static String getType1Message(String str, String str2) {
        return TYPE_1_MESSAGE;
    }

    static String getType3Message(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
        return new Type3Message(str4, str3, str, str2, bArr, i, str5, bArr2).getResponse();
    }

    static String getType3Message(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) {
        return new Type3Message(str4, str3, str, str2, bArr, i, str5, bArr2, certificate, bArr3, bArr4).getResponse();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readULong(byte[] bArr, int i) {
        if (bArr.length < i + 4) {
            return 0;
        }
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int readUShort(byte[] bArr, int i) {
        if (bArr.length < i + 2) {
            return 0;
        }
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] readSecurityBuffer(byte[] bArr, int i) {
        int uShort = readUShort(bArr, i);
        int uLong = readULong(bArr, i + 4);
        if (bArr.length < uLong + uShort) {
            return new byte[uShort];
        }
        byte[] bArr2 = new byte[uShort];
        System.arraycopy(bArr, uLong, bArr2, 0, uShort);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] makeRandomChallenge(Random random) {
        byte[] bArr = new byte[8];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] makeSecondaryKey(Random random) {
        byte[] bArr = new byte[16];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    public static class CipherGen {
        protected final byte[] challenge;
        protected byte[] clientChallenge;
        protected byte[] clientChallenge2;
        protected final long currentTime;
        protected final String domain;
        protected byte[] lanManagerSessionKey;
        protected byte[] lm2SessionResponse;
        protected byte[] lmHash;
        protected byte[] lmResponse;
        protected byte[] lmUserSessionKey;
        protected byte[] lmv2Hash;
        protected byte[] lmv2Response;
        protected byte[] ntlm2SessionResponse;
        protected byte[] ntlm2SessionResponseUserSessionKey;
        protected byte[] ntlmHash;
        protected byte[] ntlmResponse;
        protected byte[] ntlmUserSessionKey;
        protected byte[] ntlmv2Blob;
        protected byte[] ntlmv2Hash;
        protected byte[] ntlmv2Response;
        protected byte[] ntlmv2UserSessionKey;
        protected final String password;
        protected final Random random;
        protected byte[] secondaryKey;
        protected final String target;
        protected final byte[] targetInformation;
        protected byte[] timestamp;
        protected final String user;

        @Deprecated
        public CipherGen(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this(NTLMEngineImpl.RND_GEN, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2, bArr3, bArr4, bArr5, bArr6);
        }

        public CipherGen(Random random, long j, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.lmHash = null;
            this.lmResponse = null;
            this.ntlmHash = null;
            this.ntlmResponse = null;
            this.ntlmv2Hash = null;
            this.lmv2Hash = null;
            this.lmv2Response = null;
            this.ntlmv2Blob = null;
            this.ntlmv2Response = null;
            this.ntlm2SessionResponse = null;
            this.lm2SessionResponse = null;
            this.lmUserSessionKey = null;
            this.ntlmUserSessionKey = null;
            this.ntlmv2UserSessionKey = null;
            this.ntlm2SessionResponseUserSessionKey = null;
            this.lanManagerSessionKey = null;
            this.random = random;
            this.currentTime = j;
            this.domain = str;
            this.target = str4;
            this.user = str2;
            this.password = str3;
            this.challenge = bArr;
            this.targetInformation = bArr2;
            this.clientChallenge = bArr3;
            this.clientChallenge2 = bArr4;
            this.secondaryKey = bArr5;
            this.timestamp = bArr6;
        }

        @Deprecated
        public CipherGen(String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(NTLMEngineImpl.RND_GEN, System.currentTimeMillis(), str, str2, str3, bArr, str4, bArr2);
        }

        public CipherGen(Random random, long j, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(random, j, str, str2, str3, bArr, str4, bArr2, null, null, null, null);
        }

        public byte[] getClientChallenge() {
            if (this.clientChallenge == null) {
                this.clientChallenge = NTLMEngineImpl.makeRandomChallenge(this.random);
            }
            return this.clientChallenge;
        }

        public byte[] getClientChallenge2() {
            if (this.clientChallenge2 == null) {
                this.clientChallenge2 = NTLMEngineImpl.makeRandomChallenge(this.random);
            }
            return this.clientChallenge2;
        }

        public byte[] getSecondaryKey() {
            if (this.secondaryKey == null) {
                this.secondaryKey = NTLMEngineImpl.makeSecondaryKey(this.random);
            }
            return this.secondaryKey;
        }

        public byte[] getLMHash() {
            if (this.lmHash == null) {
                this.lmHash = NTLMEngineImpl.lmHash(this.password);
            }
            return this.lmHash;
        }

        public byte[] getLMResponse() {
            if (this.lmResponse == null) {
                this.lmResponse = NTLMEngineImpl.lmResponse(getLMHash(), this.challenge);
            }
            return this.lmResponse;
        }

        public byte[] getNTLMHash() {
            if (this.ntlmHash == null) {
                this.ntlmHash = NTLMEngineImpl.ntlmHash(this.password);
            }
            return this.ntlmHash;
        }

        public byte[] getNTLMResponse() {
            if (this.ntlmResponse == null) {
                this.ntlmResponse = NTLMEngineImpl.lmResponse(getNTLMHash(), this.challenge);
            }
            return this.ntlmResponse;
        }

        public byte[] getLMv2Hash() {
            if (this.lmv2Hash == null) {
                this.lmv2Hash = NTLMEngineImpl.lmv2Hash(this.domain, this.user, getNTLMHash());
            }
            return this.lmv2Hash;
        }

        public byte[] getNTLMv2Hash() {
            if (this.ntlmv2Hash == null) {
                this.ntlmv2Hash = NTLMEngineImpl.ntlmv2Hash(this.domain, this.user, getNTLMHash());
            }
            return this.ntlmv2Hash;
        }

        public byte[] getTimestamp() {
            if (this.timestamp == null) {
                long j = (this.currentTime + 11644473600000L) * 10000;
                this.timestamp = new byte[8];
                for (int i = 0; i < 8; i++) {
                    this.timestamp[i] = (byte) j;
                    j >>>= 8;
                }
            }
            return this.timestamp;
        }

        public byte[] getNTLMv2Blob() {
            if (this.ntlmv2Blob == null) {
                this.ntlmv2Blob = NTLMEngineImpl.createBlob(getClientChallenge2(), this.targetInformation, getTimestamp());
            }
            return this.ntlmv2Blob;
        }

        public byte[] getNTLMv2Response() {
            if (this.ntlmv2Response == null) {
                this.ntlmv2Response = NTLMEngineImpl.lmv2Response(getNTLMv2Hash(), this.challenge, getNTLMv2Blob());
            }
            return this.ntlmv2Response;
        }

        public byte[] getLMv2Response() {
            if (this.lmv2Response == null) {
                this.lmv2Response = NTLMEngineImpl.lmv2Response(getLMv2Hash(), this.challenge, getClientChallenge());
            }
            return this.lmv2Response;
        }

        public byte[] getNTLM2SessionResponse() {
            if (this.ntlm2SessionResponse == null) {
                this.ntlm2SessionResponse = NTLMEngineImpl.ntlm2SessionResponse(getNTLMHash(), this.challenge, getClientChallenge());
            }
            return this.ntlm2SessionResponse;
        }

        public byte[] getLM2SessionResponse() {
            if (this.lm2SessionResponse == null) {
                byte[] clientChallenge = getClientChallenge();
                this.lm2SessionResponse = new byte[24];
                System.arraycopy(clientChallenge, 0, this.lm2SessionResponse, 0, clientChallenge.length);
                Arrays.fill(this.lm2SessionResponse, clientChallenge.length, this.lm2SessionResponse.length, (byte) 0);
            }
            return this.lm2SessionResponse;
        }

        public byte[] getLMUserSessionKey() {
            if (this.lmUserSessionKey == null) {
                this.lmUserSessionKey = new byte[16];
                System.arraycopy(getLMHash(), 0, this.lmUserSessionKey, 0, 8);
                Arrays.fill(this.lmUserSessionKey, 8, 16, (byte) 0);
            }
            return this.lmUserSessionKey;
        }

        public byte[] getNTLMUserSessionKey() {
            if (this.ntlmUserSessionKey == null) {
                MD4 md4 = new MD4();
                md4.update(getNTLMHash());
                this.ntlmUserSessionKey = md4.getOutput();
            }
            return this.ntlmUserSessionKey;
        }

        public byte[] getNTLMv2UserSessionKey() {
            if (this.ntlmv2UserSessionKey == null) {
                byte[] nTLMv2Hash = getNTLMv2Hash();
                byte[] bArr = new byte[16];
                System.arraycopy(getNTLMv2Response(), 0, bArr, 0, 16);
                this.ntlmv2UserSessionKey = NTLMEngineImpl.hmacMD5(bArr, nTLMv2Hash);
            }
            return this.ntlmv2UserSessionKey;
        }

        public byte[] getNTLM2SessionResponseUserSessionKey() {
            if (this.ntlm2SessionResponseUserSessionKey == null) {
                byte[] lM2SessionResponse = getLM2SessionResponse();
                byte[] bArr = new byte[this.challenge.length + lM2SessionResponse.length];
                System.arraycopy(this.challenge, 0, bArr, 0, this.challenge.length);
                System.arraycopy(lM2SessionResponse, 0, bArr, this.challenge.length, lM2SessionResponse.length);
                this.ntlm2SessionResponseUserSessionKey = NTLMEngineImpl.hmacMD5(bArr, getNTLMUserSessionKey());
            }
            return this.ntlm2SessionResponseUserSessionKey;
        }

        public byte[] getLanManagerSessionKey() throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
            if (this.lanManagerSessionKey == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(getLMHash(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, bArr.length, (byte) -67);
                    Key keyCreateDESKey = NTLMEngineImpl.createDESKey(bArr, 0);
                    Key keyCreateDESKey2 = NTLMEngineImpl.createDESKey(bArr, 7);
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(getLMResponse(), 0, bArr2, 0, bArr2.length);
                    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, keyCreateDESKey);
                    byte[] bArrDoFinal = cipher.doFinal(bArr2);
                    Cipher cipher2 = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher2.init(1, keyCreateDESKey2);
                    byte[] bArrDoFinal2 = cipher2.doFinal(bArr2);
                    this.lanManagerSessionKey = new byte[16];
                    System.arraycopy(bArrDoFinal, 0, this.lanManagerSessionKey, 0, bArrDoFinal.length);
                    System.arraycopy(bArrDoFinal2, 0, this.lanManagerSessionKey, bArrDoFinal.length, bArrDoFinal2.length);
                } catch (Exception e) {
                    throw new NTLMEngineException(e.getMessage(), e);
                }
            }
            return this.lanManagerSessionKey;
        }
    }

    static byte[] hmacMD5(byte[] bArr, byte[] bArr2) {
        HMACMD5 hmacmd5 = new HMACMD5(bArr2);
        hmacmd5.update(bArr);
        return hmacmd5.getOutput();
    }

    static byte[] RC4(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr2, "RC4"));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    static byte[] ntlm2SessionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NTLMEngineException {
        try {
            MessageDigest md5 = getMD5();
            md5.update(bArr2);
            md5.update(bArr3);
            byte[] bArr4 = new byte[8];
            System.arraycopy(md5.digest(), 0, bArr4, 0, 8);
            return lmResponse(bArr, bArr4);
        } catch (Exception e) {
            if (e instanceof NTLMEngineException) {
                throw ((NTLMEngineException) e);
            }
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] lmHash(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
        try {
            byte[] bytes = str.toUpperCase(Locale.ROOT).getBytes(Consts.ASCII);
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key keyCreateDESKey = createDESKey(bArr, 0);
            Key keyCreateDESKey2 = createDESKey(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes(Consts.ASCII);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, keyCreateDESKey);
            byte[] bArrDoFinal = cipher.doFinal(bytes2);
            cipher.init(1, keyCreateDESKey2);
            byte[] bArrDoFinal2 = cipher.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArrDoFinal, 0, bArr2, 0, 8);
            System.arraycopy(bArrDoFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] ntlmHash(String str) throws NTLMEngineException {
        if (UNICODE_LITTLE_UNMARKED == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        byte[] bytes = str.getBytes(UNICODE_LITTLE_UNMARKED);
        MD4 md4 = new MD4();
        md4.update(bytes);
        return md4.getOutput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] lmv2Hash(String str, String str2, byte[] bArr) throws NTLMEngineException {
        if (UNICODE_LITTLE_UNMARKED == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        HMACMD5 hmacmd5 = new HMACMD5(bArr);
        hmacmd5.update(str2.toUpperCase(Locale.ROOT).getBytes(UNICODE_LITTLE_UNMARKED));
        if (str != null) {
            hmacmd5.update(str.toUpperCase(Locale.ROOT).getBytes(UNICODE_LITTLE_UNMARKED));
        }
        return hmacmd5.getOutput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] ntlmv2Hash(String str, String str2, byte[] bArr) throws NTLMEngineException {
        if (UNICODE_LITTLE_UNMARKED == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        HMACMD5 hmacmd5 = new HMACMD5(bArr);
        hmacmd5.update(str2.toUpperCase(Locale.ROOT).getBytes(UNICODE_LITTLE_UNMARKED));
        if (str != null) {
            hmacmd5.update(str.getBytes(UNICODE_LITTLE_UNMARKED));
        }
        return hmacmd5.getOutput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] lmResponse(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key keyCreateDESKey = createDESKey(bArr3, 0);
            Key keyCreateDESKey2 = createDESKey(bArr3, 7);
            Key keyCreateDESKey3 = createDESKey(bArr3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, keyCreateDESKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            cipher.init(1, keyCreateDESKey2);
            byte[] bArrDoFinal2 = cipher.doFinal(bArr2);
            cipher.init(1, keyCreateDESKey3);
            byte[] bArrDoFinal3 = cipher.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(bArrDoFinal, 0, bArr4, 0, 8);
            System.arraycopy(bArrDoFinal2, 0, bArr4, 8, 8);
            System.arraycopy(bArrDoFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] lmv2Response(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        HMACMD5 hmacmd5 = new HMACMD5(bArr);
        hmacmd5.update(bArr2);
        hmacmd5.update(bArr3);
        byte[] output = hmacmd5.getOutput();
        byte[] bArr4 = new byte[output.length + bArr3.length];
        System.arraycopy(output, 0, bArr4, 0, output.length);
        System.arraycopy(bArr3, 0, bArr4, output.length, bArr3.length);
        return bArr4;
    }

    static class Handle {
        private final byte[] exportedSessionKey;
        private final boolean isConnection;
        final Mode mode;
        private final Cipher rc4;
        private byte[] sealingKey;
        int sequenceNumber = 0;
        private byte[] signingKey;

        Handle(byte[] bArr, Mode mode, boolean z) throws NTLMEngineException {
            this.exportedSessionKey = bArr;
            this.isConnection = z;
            this.mode = mode;
            try {
                MessageDigest md5 = NTLMEngineImpl.getMD5();
                MessageDigest md52 = NTLMEngineImpl.getMD5();
                md5.update(bArr);
                md52.update(bArr);
                if (mode == Mode.CLIENT) {
                    md5.update(NTLMEngineImpl.SIGN_MAGIC_CLIENT);
                    md52.update(NTLMEngineImpl.SEAL_MAGIC_CLIENT);
                } else {
                    md5.update(NTLMEngineImpl.SIGN_MAGIC_SERVER);
                    md52.update(NTLMEngineImpl.SEAL_MAGIC_SERVER);
                }
                this.signingKey = md5.digest();
                this.sealingKey = md52.digest();
                this.rc4 = initCipher();
            } catch (Exception e) {
                throw new NTLMEngineException(e.getMessage(), e);
            }
        }

        public byte[] getSigningKey() {
            return this.signingKey;
        }

        public byte[] getSealingKey() {
            return this.sealingKey;
        }

        private Cipher initCipher() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
            try {
                Cipher cipher = Cipher.getInstance("RC4");
                if (this.mode == Mode.CLIENT) {
                    cipher.init(1, new SecretKeySpec(this.sealingKey, "RC4"));
                } else {
                    cipher.init(2, new SecretKeySpec(this.sealingKey, "RC4"));
                }
                return cipher;
            } catch (Exception e) {
                throw new NTLMEngineException(e.getMessage(), e);
            }
        }

        private void advanceMessageSequence() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
            if (!this.isConnection) {
                MessageDigest md5 = NTLMEngineImpl.getMD5();
                md5.update(this.sealingKey);
                byte[] bArr = new byte[4];
                NTLMEngineImpl.writeULong(bArr, this.sequenceNumber, 0);
                md5.update(bArr);
                this.sealingKey = md5.digest();
                initCipher();
            }
            this.sequenceNumber++;
        }

        private byte[] encrypt(byte[] bArr) {
            return this.rc4.update(bArr);
        }

        private byte[] decrypt(byte[] bArr) {
            return this.rc4.update(bArr);
        }

        private byte[] computeSignature(byte[] bArr) {
            byte[] bArr2 = new byte[16];
            bArr2[0] = 1;
            bArr2[1] = 0;
            bArr2[2] = 0;
            bArr2[3] = 0;
            HMACMD5 hmacmd5 = new HMACMD5(this.signingKey);
            hmacmd5.update(NTLMEngineImpl.encodeLong(this.sequenceNumber));
            hmacmd5.update(bArr);
            byte[] output = hmacmd5.getOutput();
            byte[] bArr3 = new byte[8];
            System.arraycopy(output, 0, bArr3, 0, 8);
            System.arraycopy(encrypt(bArr3), 0, bArr2, 4, 8);
            NTLMEngineImpl.encodeLong(bArr2, 12, this.sequenceNumber);
            return bArr2;
        }

        private boolean validateSignature(byte[] bArr, byte[] bArr2) {
            return Arrays.equals(bArr, computeSignature(bArr2));
        }

        public byte[] signAndEncryptMessage(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NTLMEngineException {
            byte[] bArrEncrypt = encrypt(bArr);
            byte[] bArrComputeSignature = computeSignature(bArr);
            byte[] bArr2 = new byte[bArrComputeSignature.length + bArrEncrypt.length];
            System.arraycopy(bArrComputeSignature, 0, bArr2, 0, bArrComputeSignature.length);
            System.arraycopy(bArrEncrypt, 0, bArr2, bArrComputeSignature.length, bArrEncrypt.length);
            advanceMessageSequence();
            return bArr2;
        }

        public byte[] decryptAndVerifySignedMessage(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, NTLMEngineException, InvalidKeyException {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            byte[] bArr3 = new byte[bArr.length - 16];
            System.arraycopy(bArr, 16, bArr3, 0, bArr3.length);
            byte[] bArrDecrypt = decrypt(bArr3);
            if (!validateSignature(bArr2, bArrDecrypt)) {
                throw new NTLMEngineException("Wrong signature");
            }
            advanceMessageSequence();
            return bArrDecrypt;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encodeLong(int i) {
        byte[] bArr = new byte[4];
        encodeLong(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void encodeLong(byte[] bArr, int i, int i2) {
        bArr[i + 0] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] createBlob(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = {1, 1, 0, 0};
        byte[] bArr5 = {0, 0, 0, 0};
        byte[] bArr6 = {0, 0, 0, 0};
        byte[] bArr7 = {0, 0, 0, 0};
        byte[] bArr8 = new byte[bArr4.length + bArr5.length + bArr3.length + 8 + bArr6.length + bArr2.length + bArr7.length];
        System.arraycopy(bArr4, 0, bArr8, 0, bArr4.length);
        int length = bArr4.length + 0;
        System.arraycopy(bArr5, 0, bArr8, length, bArr5.length);
        int length2 = length + bArr5.length;
        System.arraycopy(bArr3, 0, bArr8, length2, bArr3.length);
        int length3 = length2 + bArr3.length;
        System.arraycopy(bArr, 0, bArr8, length3, 8);
        int i = length3 + 8;
        System.arraycopy(bArr6, 0, bArr8, i, bArr6.length);
        int length4 = i + bArr6.length;
        System.arraycopy(bArr2, 0, bArr8, length4, bArr2.length);
        System.arraycopy(bArr7, 0, bArr8, length4 + bArr2.length, bArr7.length);
        return bArr8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Key createDESKey(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte[] bArr3 = {bArr2[0], (byte) ((bArr2[0] << 7) | ((bArr2[1] & 255) >>> 1)), (byte) ((bArr2[1] << 6) | ((bArr2[2] & 255) >>> 2)), (byte) ((bArr2[2] << 5) | ((bArr2[3] & 255) >>> 3)), (byte) ((bArr2[3] << 4) | ((bArr2[4] & 255) >>> 4)), (byte) ((bArr2[4] << 3) | ((bArr2[5] & 255) >>> 5)), (byte) ((bArr2[5] << 2) | ((bArr2[6] & 255) >>> 6)), (byte) (bArr2[6] << 1)};
        oddParity(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    private static void oddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (((((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2)) ^ (b >>> 1)) & 1) == 0) {
                bArr[i] = (byte) (bArr[i] | 1);
            } else {
                bArr[i] = (byte) (bArr[i] & (-2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Charset getCharset(int i) throws NTLMEngineException {
        if ((i & 1) == 0) {
            return DEFAULT_CHARSET;
        }
        if (UNICODE_LITTLE_UNMARKED == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        return UNICODE_LITTLE_UNMARKED;
    }

    private static String stripDotSuffix(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(46);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertHost(String str) {
        return stripDotSuffix(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertDomain(String str) {
        return stripDotSuffix(str);
    }

    static class NTLMMessage {
        protected int currentOutputPosition;
        protected byte[] messageContents;

        NTLMMessage() {
            this.messageContents = null;
            this.currentOutputPosition = 0;
        }

        NTLMMessage(String str, int i) {
            this(Base64.decodeBase64(str.getBytes(NTLMEngineImpl.DEFAULT_CHARSET)), i);
        }

        NTLMMessage(byte[] bArr, int i) throws NTLMEngineException {
            this.messageContents = null;
            this.currentOutputPosition = 0;
            this.messageContents = bArr;
            if (this.messageContents.length < NTLMEngineImpl.SIGNATURE.length) {
                throw new NTLMEngineException("NTLM message decoding error - packet too short");
            }
            for (int i2 = 0; i2 < NTLMEngineImpl.SIGNATURE.length; i2++) {
                if (this.messageContents[i2] != NTLMEngineImpl.SIGNATURE[i2]) {
                    throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                }
            }
            int uLong = readULong(NTLMEngineImpl.SIGNATURE.length);
            if (uLong != i) {
                throw new NTLMEngineException("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(uLong));
            }
            this.currentOutputPosition = this.messageContents.length;
        }

        protected int getPreambleLength() {
            return NTLMEngineImpl.SIGNATURE.length + 4;
        }

        protected int getMessageLength() {
            return this.currentOutputPosition;
        }

        protected byte readByte(int i) throws NTLMEngineException {
            if (this.messageContents.length < i + 1) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            return this.messageContents[i];
        }

        protected void readBytes(byte[] bArr, int i) throws NTLMEngineException {
            if (this.messageContents.length < bArr.length + i) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            System.arraycopy(this.messageContents, i, bArr, 0, bArr.length);
        }

        protected int readUShort(int i) {
            return NTLMEngineImpl.readUShort(this.messageContents, i);
        }

        protected int readULong(int i) {
            return NTLMEngineImpl.readULong(this.messageContents, i);
        }

        protected byte[] readSecurityBuffer(int i) {
            return NTLMEngineImpl.readSecurityBuffer(this.messageContents, i);
        }

        protected void prepareResponse(int i, int i2) {
            this.messageContents = new byte[i];
            this.currentOutputPosition = 0;
            addBytes(NTLMEngineImpl.SIGNATURE);
            addULong(i2);
        }

        protected void addByte(byte b) {
            this.messageContents[this.currentOutputPosition] = b;
            this.currentOutputPosition++;
        }

        protected void addBytes(byte[] bArr) {
            if (bArr == null) {
                return;
            }
            for (byte b : bArr) {
                this.messageContents[this.currentOutputPosition] = b;
                this.currentOutputPosition++;
            }
        }

        protected void addUShort(int i) {
            addByte((byte) (i & 255));
            addByte((byte) ((i >> 8) & 255));
        }

        protected void addULong(int i) {
            addByte((byte) (i & 255));
            addByte((byte) ((i >> 8) & 255));
            addByte((byte) ((i >> 16) & 255));
            addByte((byte) ((i >> 24) & 255));
        }

        public String getResponse() {
            return new String(Base64.encodeBase64(getBytes()), Consts.ASCII);
        }

        public byte[] getBytes() {
            if (this.messageContents == null) {
                buildMessage();
            }
            if (this.messageContents.length > this.currentOutputPosition) {
                byte[] bArr = new byte[this.currentOutputPosition];
                System.arraycopy(this.messageContents, 0, bArr, 0, this.currentOutputPosition);
                this.messageContents = bArr;
            }
            return this.messageContents;
        }

        protected void buildMessage() {
            throw new RuntimeException("Message builder not implemented for " + getClass().getName());
        }
    }

    static class Type1Message extends NTLMMessage {
        private final byte[] domainBytes;
        private final int flags;
        private final byte[] hostBytes;

        Type1Message(String str, String str2) {
            this(str, str2, null);
        }

        Type1Message(String str, String str2, Integer num) {
            this.flags = num == null ? getDefaultFlags() : num.intValue();
            String strConvertHost = NTLMEngineImpl.convertHost(str2);
            String strConvertDomain = NTLMEngineImpl.convertDomain(str);
            this.hostBytes = strConvertHost != null ? strConvertHost.getBytes(NTLMEngineImpl.UNICODE_LITTLE_UNMARKED) : null;
            this.domainBytes = strConvertDomain != null ? strConvertDomain.toUpperCase(Locale.ROOT).getBytes(NTLMEngineImpl.UNICODE_LITTLE_UNMARKED) : null;
        }

        Type1Message() {
            this.hostBytes = null;
            this.domainBytes = null;
            this.flags = getDefaultFlags();
        }

        private int getDefaultFlags() {
            return -1576500735;
        }

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.NTLMMessage
        protected void buildMessage() {
            int length = 0;
            if (this.domainBytes != null) {
                length = this.domainBytes.length;
            }
            int length2 = 0;
            if (this.hostBytes != null) {
                length2 = this.hostBytes.length;
            }
            prepareResponse(length2 + 40 + length, 1);
            addULong(this.flags);
            addUShort(length);
            addUShort(length);
            addULong(length2 + 32 + 8);
            addUShort(length2);
            addUShort(length2);
            addULong(40);
            addUShort(261);
            addULong(2600);
            addUShort(3840);
            if (this.hostBytes != null) {
                addBytes(this.hostBytes);
            }
            if (this.domainBytes != null) {
                addBytes(this.domainBytes);
            }
        }
    }

    static class Type2Message extends NTLMMessage {
        protected final byte[] challenge;
        protected final int flags;
        protected String target;
        protected byte[] targetInfo;

        Type2Message(String str) {
            this(Base64.decodeBase64(str.getBytes(NTLMEngineImpl.DEFAULT_CHARSET)));
        }

        Type2Message(byte[] bArr) {
            super(bArr, 2);
            this.challenge = new byte[8];
            readBytes(this.challenge, 24);
            this.flags = readULong(20);
            this.target = null;
            if (getMessageLength() >= 20) {
                byte[] securityBuffer = readSecurityBuffer(12);
                if (securityBuffer.length != 0) {
                    this.target = new String(securityBuffer, NTLMEngineImpl.getCharset(this.flags));
                }
            }
            this.targetInfo = null;
            if (getMessageLength() >= 48) {
                byte[] securityBuffer2 = readSecurityBuffer(40);
                if (securityBuffer2.length != 0) {
                    this.targetInfo = securityBuffer2;
                }
            }
        }

        byte[] getChallenge() {
            return this.challenge;
        }

        String getTarget() {
            return this.target;
        }

        byte[] getTargetInfo() {
            return this.targetInfo;
        }

        int getFlags() {
            return this.flags;
        }
    }

    static class Type3Message extends NTLMMessage {
        protected final boolean computeMic;
        protected final byte[] domainBytes;
        protected final byte[] exportedSessionKey;
        protected final byte[] hostBytes;
        protected byte[] lmResp;
        protected byte[] ntResp;
        protected final byte[] sessionKey;
        protected final byte[] type1Message;
        protected final int type2Flags;
        protected final byte[] type2Message;
        protected final byte[] userBytes;

        Type3Message(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
            this(str, str2, str3, str4, bArr, i, str5, bArr2, null, null, null);
        }

        Type3Message(Random random, long j, String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) {
            this(random, j, str, str2, str3, str4, bArr, i, str5, bArr2, null, null, null);
        }

        Type3Message(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) {
            this(NTLMEngineImpl.RND_GEN, System.currentTimeMillis(), str, str2, str3, str4, bArr, i, str5, bArr2, certificate, bArr3, bArr4);
        }

        Type3Message(Random random, long j, String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, NTLMEngineException, InvalidKeyException, CertificateEncodingException {
            byte[] lMUserSessionKey;
            if (random == null) {
                throw new NTLMEngineException("Random generator not available");
            }
            this.type2Flags = i;
            this.type1Message = bArr3;
            this.type2Message = bArr4;
            String strConvertHost = NTLMEngineImpl.convertHost(str2);
            String strConvertDomain = NTLMEngineImpl.convertDomain(str);
            byte[] bArrAddGssMicAvsToTargetInfo = bArr2;
            if (certificate != null) {
                bArrAddGssMicAvsToTargetInfo = addGssMicAvsToTargetInfo(bArr2, certificate);
                this.computeMic = true;
            } else {
                this.computeMic = false;
            }
            CipherGen cipherGen = new CipherGen(random, j, strConvertDomain, str3, str4, bArr, str5, bArrAddGssMicAvsToTargetInfo);
            try {
                if ((i & 8388608) != 0 && bArr2 != null && str5 != null) {
                    this.ntResp = cipherGen.getNTLMv2Response();
                    this.lmResp = cipherGen.getLMv2Response();
                    if ((i & 128) != 0) {
                        lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                    } else {
                        lMUserSessionKey = cipherGen.getNTLMv2UserSessionKey();
                    }
                } else if ((i & 524288) != 0) {
                    this.ntResp = cipherGen.getNTLM2SessionResponse();
                    this.lmResp = cipherGen.getLM2SessionResponse();
                    if ((i & 128) != 0) {
                        lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                    } else {
                        lMUserSessionKey = cipherGen.getNTLM2SessionResponseUserSessionKey();
                    }
                } else {
                    this.ntResp = cipherGen.getNTLMResponse();
                    this.lmResp = cipherGen.getLMResponse();
                    if ((i & 128) != 0) {
                        lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                    } else {
                        lMUserSessionKey = cipherGen.getNTLMUserSessionKey();
                    }
                }
            } catch (NTLMEngineException unused) {
                this.ntResp = new byte[0];
                this.lmResp = cipherGen.getLMResponse();
                if ((i & 128) != 0) {
                    lMUserSessionKey = cipherGen.getLanManagerSessionKey();
                } else {
                    lMUserSessionKey = cipherGen.getLMUserSessionKey();
                }
            }
            if ((i & 16) != 0) {
                if ((i & NTLMEngineImpl.FLAG_REQUEST_EXPLICIT_KEY_EXCH) != 0) {
                    this.exportedSessionKey = cipherGen.getSecondaryKey();
                    this.sessionKey = NTLMEngineImpl.RC4(this.exportedSessionKey, lMUserSessionKey);
                } else {
                    this.sessionKey = lMUserSessionKey;
                    this.exportedSessionKey = this.sessionKey;
                }
            } else {
                if (this.computeMic) {
                    throw new NTLMEngineException("Cannot sign/seal: no exported session key");
                }
                this.sessionKey = null;
                this.exportedSessionKey = null;
            }
            Charset charset = NTLMEngineImpl.getCharset(i);
            this.hostBytes = strConvertHost != null ? strConvertHost.getBytes(charset) : null;
            this.domainBytes = strConvertDomain != null ? strConvertDomain.toUpperCase(Locale.ROOT).getBytes(charset) : null;
            this.userBytes = str3.getBytes(charset);
        }

        public byte[] getEncryptedRandomSessionKey() {
            return this.sessionKey;
        }

        public byte[] getExportedSessionKey() {
            return this.exportedSessionKey;
        }

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.NTLMMessage
        protected void buildMessage() {
            int length;
            int length2 = this.ntResp.length;
            int length3 = this.lmResp.length;
            int length4 = this.domainBytes != null ? this.domainBytes.length : 0;
            int length5 = this.hostBytes != null ? this.hostBytes.length : 0;
            int length6 = this.userBytes.length;
            if (this.sessionKey != null) {
                length = this.sessionKey.length;
            } else {
                length = 0;
            }
            int i = (this.computeMic ? 16 : 0) + 72;
            int i2 = i + length3;
            int i3 = i2 + length2;
            int i4 = i3 + length4;
            int i5 = i4 + length6;
            int i6 = i5 + length5;
            prepareResponse(i6 + length, 3);
            addUShort(length3);
            addUShort(length3);
            addULong(i);
            addUShort(length2);
            addUShort(length2);
            addULong(i2);
            addUShort(length4);
            addUShort(length4);
            addULong(i3);
            addUShort(length6);
            addUShort(length6);
            addULong(i4);
            addUShort(length5);
            addUShort(length5);
            addULong(i5);
            addUShort(length);
            addUShort(length);
            addULong(i6);
            addULong(this.type2Flags);
            addUShort(261);
            addULong(2600);
            addUShort(3840);
            int i7 = -1;
            if (this.computeMic) {
                i7 = this.currentOutputPosition;
                this.currentOutputPosition += 16;
            }
            addBytes(this.lmResp);
            addBytes(this.ntResp);
            addBytes(this.domainBytes);
            addBytes(this.userBytes);
            addBytes(this.hostBytes);
            if (this.sessionKey != null) {
                addBytes(this.sessionKey);
            }
            if (this.computeMic) {
                HMACMD5 hmacmd5 = new HMACMD5(this.exportedSessionKey);
                hmacmd5.update(this.type1Message);
                hmacmd5.update(this.type2Message);
                hmacmd5.update(this.messageContents);
                byte[] output = hmacmd5.getOutput();
                System.arraycopy(output, 0, this.messageContents, i7, output.length);
            }
        }

        private byte[] addGssMicAvsToTargetInfo(byte[] bArr, Certificate certificate) throws NTLMEngineException, CertificateEncodingException {
            byte[] bArr2 = new byte[bArr.length + 8 + 20];
            int length = bArr.length - 4;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            NTLMEngineImpl.writeUShort(bArr2, 6, length);
            NTLMEngineImpl.writeUShort(bArr2, 4, length + 2);
            NTLMEngineImpl.writeULong(bArr2, 2, length + 4);
            NTLMEngineImpl.writeUShort(bArr2, 10, length + 8);
            NTLMEngineImpl.writeUShort(bArr2, 16, length + 10);
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded());
                byte[] bArr3 = new byte[NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT.length + 20 + bArrDigest.length];
                NTLMEngineImpl.writeULong(bArr3, 53, 16);
                System.arraycopy(NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT, 0, bArr3, 20, NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT.length);
                System.arraycopy(bArrDigest, 0, bArr3, NTLMEngineImpl.MAGIC_TLS_SERVER_ENDPOINT.length + 20, bArrDigest.length);
                System.arraycopy(NTLMEngineImpl.getMD5().digest(bArr3), 0, bArr2, length + 12, 16);
                return bArr2;
            } catch (NoSuchAlgorithmException e) {
                throw new NTLMEngineException(e.getMessage(), e);
            } catch (CertificateEncodingException e2) {
                throw new NTLMEngineException(e2.getMessage(), e2);
            }
        }
    }

    static void writeUShort(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
    }

    static void writeULong(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    static int F(int i, int i2, int i3) {
        return (i & i2) | ((i ^ (-1)) & i3);
    }

    static int G(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    static int H(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    static int rotintlft(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    static MessageDigest getMD5() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 message digest doesn't seem to exist - fatal error: " + e.getMessage(), e);
        }
    }

    static class MD4 {
        protected int A = 1732584193;
        protected int B = -271733879;
        protected int C = -1732584194;
        protected int D = 271733878;
        protected long count = 0;
        protected final byte[] dataBuffer = new byte[64];

        MD4() {
        }

        void update(byte[] bArr) {
            int i = (int) (this.count & 63);
            int i2 = 0;
            while ((bArr.length - i2) + i >= this.dataBuffer.length) {
                int length = this.dataBuffer.length - i;
                System.arraycopy(bArr, i2, this.dataBuffer, i, length);
                this.count += length;
                i = 0;
                i2 += length;
                processBuffer();
            }
            if (i2 < bArr.length) {
                int length2 = bArr.length - i2;
                System.arraycopy(bArr, i2, this.dataBuffer, i, length2);
                this.count += length2;
            }
        }

        byte[] getOutput() {
            int i = (int) (this.count & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[i2 + 8];
            bArr[0] = -128;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((this.count * 8) >>> (i3 * 8));
            }
            update(bArr);
            byte[] bArr2 = new byte[16];
            NTLMEngineImpl.writeULong(bArr2, this.A, 0);
            NTLMEngineImpl.writeULong(bArr2, this.B, 4);
            NTLMEngineImpl.writeULong(bArr2, this.C, 8);
            NTLMEngineImpl.writeULong(bArr2, this.D, 12);
            return bArr2;
        }

        protected void processBuffer() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                iArr[i] = (this.dataBuffer[i * 4] & 255) + ((this.dataBuffer[(i * 4) + 1] & 255) << 8) + ((this.dataBuffer[(i * 4) + 2] & 255) << 16) + ((this.dataBuffer[(i * 4) + 3] & 255) << 24);
            }
            int i2 = this.A;
            int i3 = this.B;
            int i4 = this.C;
            int i5 = this.D;
            round1(iArr);
            round2(iArr);
            round3(iArr);
            this.A += i2;
            this.B += i3;
            this.C += i4;
            this.D += i5;
        }

        protected void round1(int[] iArr) {
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.F(this.B, this.C, this.D) + iArr[0], 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.F(this.A, this.B, this.C) + iArr[1], 7);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.F(this.D, this.A, this.B) + iArr[2], 11);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.F(this.C, this.D, this.A) + iArr[3], 19);
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.F(this.B, this.C, this.D) + iArr[4], 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.F(this.A, this.B, this.C) + iArr[5], 7);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.F(this.D, this.A, this.B) + iArr[6], 11);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.F(this.C, this.D, this.A) + iArr[7], 19);
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.F(this.B, this.C, this.D) + iArr[8], 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.F(this.A, this.B, this.C) + iArr[9], 7);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.F(this.D, this.A, this.B) + iArr[10], 11);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.F(this.C, this.D, this.A) + iArr[11], 19);
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.F(this.B, this.C, this.D) + iArr[12], 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.F(this.A, this.B, this.C) + iArr[13], 7);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.F(this.D, this.A, this.B) + iArr[14], 11);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.F(this.C, this.D, this.A) + iArr[15], 19);
        }

        protected void round2(int[] iArr) {
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.G(this.B, this.C, this.D) + iArr[0] + 1518500249, 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.G(this.A, this.B, this.C) + iArr[4] + 1518500249, 5);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.G(this.D, this.A, this.B) + iArr[8] + 1518500249, 9);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.G(this.C, this.D, this.A) + iArr[12] + 1518500249, 13);
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.G(this.B, this.C, this.D) + iArr[1] + 1518500249, 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.G(this.A, this.B, this.C) + iArr[5] + 1518500249, 5);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.G(this.D, this.A, this.B) + iArr[9] + 1518500249, 9);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.G(this.C, this.D, this.A) + iArr[13] + 1518500249, 13);
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.G(this.B, this.C, this.D) + iArr[2] + 1518500249, 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.G(this.A, this.B, this.C) + iArr[6] + 1518500249, 5);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.G(this.D, this.A, this.B) + iArr[10] + 1518500249, 9);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.G(this.C, this.D, this.A) + iArr[14] + 1518500249, 13);
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.G(this.B, this.C, this.D) + iArr[3] + 1518500249, 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.G(this.A, this.B, this.C) + iArr[7] + 1518500249, 5);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.G(this.D, this.A, this.B) + iArr[11] + 1518500249, 9);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.G(this.C, this.D, this.A) + iArr[15] + 1518500249, 13);
        }

        protected void round3(int[] iArr) {
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.H(this.B, this.C, this.D) + iArr[0] + 1859775393, 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.H(this.A, this.B, this.C) + iArr[8] + 1859775393, 9);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.H(this.D, this.A, this.B) + iArr[4] + 1859775393, 11);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.H(this.C, this.D, this.A) + iArr[12] + 1859775393, 15);
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.H(this.B, this.C, this.D) + iArr[2] + 1859775393, 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.H(this.A, this.B, this.C) + iArr[10] + 1859775393, 9);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.H(this.D, this.A, this.B) + iArr[6] + 1859775393, 11);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.H(this.C, this.D, this.A) + iArr[14] + 1859775393, 15);
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.H(this.B, this.C, this.D) + iArr[1] + 1859775393, 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.H(this.A, this.B, this.C) + iArr[9] + 1859775393, 9);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.H(this.D, this.A, this.B) + iArr[5] + 1859775393, 11);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.H(this.C, this.D, this.A) + iArr[13] + 1859775393, 15);
            this.A = NTLMEngineImpl.rotintlft(this.A + NTLMEngineImpl.H(this.B, this.C, this.D) + iArr[3] + 1859775393, 3);
            this.D = NTLMEngineImpl.rotintlft(this.D + NTLMEngineImpl.H(this.A, this.B, this.C) + iArr[11] + 1859775393, 9);
            this.C = NTLMEngineImpl.rotintlft(this.C + NTLMEngineImpl.H(this.D, this.A, this.B) + iArr[7] + 1859775393, 11);
            this.B = NTLMEngineImpl.rotintlft(this.B + NTLMEngineImpl.H(this.C, this.D, this.A) + iArr[15] + 1859775393, 15);
        }
    }

    static class HMACMD5 {
        protected final MessageDigest md5 = NTLMEngineImpl.getMD5();
        protected final byte[] ipad = new byte[64];
        protected final byte[] opad = new byte[64];

        HMACMD5(byte[] bArr) {
            int length = bArr.length;
            if (length > 64) {
                this.md5.update(bArr);
                bArr = this.md5.digest();
                length = bArr.length;
            }
            int i = 0;
            while (i < length) {
                this.ipad[i] = (byte) (bArr[i] ^ 54);
                this.opad[i] = (byte) (bArr[i] ^ 92);
                i++;
            }
            while (i < 64) {
                this.ipad[i] = 54;
                this.opad[i] = 92;
                i++;
            }
            this.md5.reset();
            this.md5.update(this.ipad);
        }

        byte[] getOutput() {
            byte[] bArrDigest = this.md5.digest();
            this.md5.update(this.opad);
            return this.md5.digest(bArrDigest);
        }

        void update(byte[] bArr) {
            this.md5.update(bArr);
        }

        void update(byte[] bArr, int i, int i2) {
            this.md5.update(bArr, i, i2);
        }
    }

    @Override // org.apache.http.impl.auth.NTLMEngine
    public final String generateType1Msg(String str, String str2) {
        return getType1Message(str2, str);
    }

    @Override // org.apache.http.impl.auth.NTLMEngine
    public final String generateType3Msg(String str, String str2, String str3, String str4, String str5) {
        Type2Message type2Message = new Type2Message(str5);
        return getType3Message(str, str2, str4, str3, type2Message.getChallenge(), type2Message.getFlags(), type2Message.getTarget(), type2Message.getTargetInfo());
    }
}
