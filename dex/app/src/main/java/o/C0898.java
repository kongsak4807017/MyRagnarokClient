package o;

import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: o.閃, reason: contains not printable characters */
/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class C0898 {
    /* renamed from: 鷭, reason: contains not printable characters */
    public static PublicKey m1524(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C0899.m1528(str)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            throw new IllegalArgumentException(e2);
        } catch (C0824 e3) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            throw new IllegalArgumentException(e3);
        }
    }

    /* renamed from: 鷭, reason: contains not printable characters */
    public static boolean m1525(PublicKey publicKey, String str, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publicKey);
            signature.update(str.getBytes());
            if (!signature.verify(C0899.m1528(str2))) {
                Log.e("IABUtil/Security", "Signature verification failed.");
                return false;
            }
            return true;
        } catch (InvalidKeyException unused) {
            Log.e("IABUtil/Security", "Invalid key specification.");
            return false;
        } catch (NoSuchAlgorithmException unused2) {
            Log.e("IABUtil/Security", "NoSuchAlgorithmException.");
            return false;
        } catch (SignatureException unused3) {
            Log.e("IABUtil/Security", "Signature exception.");
            return false;
        } catch (C0824 unused4) {
            Log.e("IABUtil/Security", "Base64 decoding failed.");
            return false;
        }
    }
}
