package org.apache.commons.net.imap;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import org.apache.commons.net.imap.IMAP;
import org.apache.commons.net.util.Base64;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public class AuthenticatingIMAPClient extends IMAPSClient {
    public AuthenticatingIMAPClient() {
        this("TLS", false);
    }

    public AuthenticatingIMAPClient(boolean z) {
        this("TLS", z);
    }

    public AuthenticatingIMAPClient(String str) {
        this(str, false);
    }

    public AuthenticatingIMAPClient(String str, boolean z) {
        this(str, z, null);
    }

    public AuthenticatingIMAPClient(String str, boolean z, SSLContext sSLContext) {
        super(str, z, sSLContext);
    }

    public AuthenticatingIMAPClient(boolean z, SSLContext sSLContext) {
        this("TLS", z, sSLContext);
    }

    public AuthenticatingIMAPClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public boolean authenticate(AUTH_METHOD auth_method, String str, String str2) {
        return auth(auth_method, str, str2);
    }

    public boolean auth(AUTH_METHOD auth_method, String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (!IMAPReply.isContinuation(sendCommand(IMAPCommand.AUTHENTICATE, auth_method.getAuthName()))) {
            return false;
        }
        switch (auth_method) {
            case PLAIN:
                int iSendData = sendData(Base64.encodeBase64StringUnChunked(("\u0000" + str + "\u0000" + str2).getBytes()));
                if (iSendData == 0) {
                    setState(IMAP.IMAPState.AUTH_STATE);
                }
                return iSendData == 0;
            case CRAM_MD5:
                byte[] bArrDecodeBase64 = Base64.decodeBase64(getReplyString().substring(2).trim());
                Mac mac = Mac.getInstance("HmacMD5");
                mac.init(new SecretKeySpec(str2.getBytes(), "HmacMD5"));
                byte[] bytes = _convertToHexString(mac.doFinal(bArrDecodeBase64)).getBytes();
                byte[] bytes2 = str.getBytes();
                byte[] bArr = new byte[bytes2.length + 1 + bytes.length];
                System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
                bArr[bytes2.length] = 32;
                System.arraycopy(bytes, 0, bArr, bytes2.length + 1, bytes.length);
                int iSendData2 = sendData(Base64.encodeBase64StringUnChunked(bArr));
                if (iSendData2 == 0) {
                    setState(IMAP.IMAPState.AUTH_STATE);
                }
                return iSendData2 == 0;
            case LOGIN:
                if (sendData(Base64.encodeBase64StringUnChunked(str.getBytes())) != 3) {
                    return false;
                }
                int iSendData3 = sendData(Base64.encodeBase64StringUnChunked(str2.getBytes()));
                if (iSendData3 == 0) {
                    setState(IMAP.IMAPState.AUTH_STATE);
                }
                return iSendData3 == 0;
            case XOAUTH:
                int iSendData4 = sendData(new String(str.getBytes()));
                if (iSendData4 == 0) {
                    setState(IMAP.IMAPState.AUTH_STATE);
                }
                return iSendData4 == 0;
            default:
                return false;
        }
    }

    private String _convertToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            if ((b & 255) <= 15) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b & 255));
        }
        return sb.toString();
    }

    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5"),
        LOGIN("LOGIN"),
        XOAUTH("XOAUTH");

        private final String authName;

        AUTH_METHOD(String str) {
            this.authName = str;
        }

        public final String getAuthName() {
            return this.authName;
        }
    }
}
